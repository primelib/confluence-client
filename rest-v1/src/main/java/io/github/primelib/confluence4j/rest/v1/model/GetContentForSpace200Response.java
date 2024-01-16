package io.github.primelib.confluence4j.rest.v1.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetContentForSpace200Response
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "page",
    "blogpost",
    "_links"
})
@JsonTypeName("getContentForSpace_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetContentForSpace200Response {

    @JsonProperty("page")
    protected ContentArray page;

    @JsonProperty("blogpost")
    protected ContentArray blogpost;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link GetContentForSpace200Response}.
     *
     * @param spec the specification to process
     */
    public GetContentForSpace200Response(Consumer<GetContentForSpace200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetContentForSpace200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetContentForSpace200Response(Consumer)} instead.
     * @param page page
     * @param blogpost blogpost
     * @param _links _links
     */
    @ApiStatus.Internal
    public GetContentForSpace200Response(ContentArray page, ContentArray blogpost, Map<String, String> _links) {
        this.page = page;
        this.blogpost = blogpost;
        this._links = _links;
    }

}
