#!/bin/bash

# setup
PROJECT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

# test
case $1 in
  "update")
    echo "> updating openapi spec"

    # source: https://developer.atlassian.com/cloud/confluence/rest/v1/intro/#about
    RESTV1_SPEC="$PROJECT_DIR/rest-v1/openapi.json"
    curl -o "$RESTV1_SPEC" https://dac-static.atlassian.com/cloud/confluence/swagger.v3.json
    jq '.info.title="Confluence REST V1"' "$RESTV1_SPEC" | sponge "$RESTV1_SPEC" # overwrite name
    jq '.servers[0].url |= "https://your-domain.atlassian.net"' "$RESTV1_SPEC" | sponge "$RESTV1_SPEC" # overwrite url
    jq '.components.schemas.GenericLinks.additionalProperties={"type": "string"}' "$RESTV1_SPEC" | sponge "$RESTV1_SPEC"
    jq 'walk(if type == "object" and .additionalProperties and (.properties | length > 0) then del(.additionalProperties) else . end)' "$RESTV1_SPEC" | sponge "$RESTV1_SPEC" # remove additionalProperties from all schemas

    # source: https://developer.atlassian.com/cloud/confluence/rest/v2/intro/#about
    RESTV2_SPEC="$PROJECT_DIR/rest-v2/openapi.json"
    curl -o "$RESTV2_SPEC" https://dac-static.atlassian.com/cloud/confluence/openapi-v2.v3.json
    jq '.info.title="Confluence REST V2"' "$RESTV2_SPEC" | sponge "$RESTV2_SPEC" # overwrite name
    jq '.servers[0].url |= "https://your-domain.atlassian.net"' "$RESTV2_SPEC" | sponge "$RESTV2_SPEC" # overwrite url
    jq 'del(.servers[0].variables)' "$RESTV2_SPEC" | sponge "$RESTV2_SPEC" # remove variables
    properties=("id" "spaceId" "pageId" "blogPostId" "customContentId" "parentId" "homepageId" "localId" "parentCommentId")
    for property in "${properties[@]}"; do
        jq "walk(if type == \"object\" and .properties and .properties.$property and .properties.$property.oneOf then .properties.$property.format = \"int64\" | .properties.$property.type = \"integer\" | del(.properties.$property.oneOf) else . end)" "$RESTV2_SPEC" | sponge "$RESTV2_SPEC"
    done
    ;;

  "generate")
    echo "> running code generation"
    docker run -it --rm -v $(pwd):/project ghcr.io/primelib/primecodegen:0.0.1 \
        primecodegen generate \
        -e auto \
        -i "/project/rest-v1/openapi.json" \
        -o "/project/rest-v1" \
        -c "/project/rest-v1/openapi-generator.json"

    docker run -it --rm -v $(pwd):/project ghcr.io/primelib/primecodegen:0.0.1 \
        primecodegen generate \
        -e auto \
        -i "/project/rest-v2/openapi.json" \
        -o "/project/rest-v2" \
        -c "/project/rest-v2/openapi-generator.json"
    ;;
esac
