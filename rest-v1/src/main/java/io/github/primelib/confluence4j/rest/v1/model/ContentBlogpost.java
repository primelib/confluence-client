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

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentBlogpost
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
    "id",
    "type",
    "status",
    "title",
    "space",
    "history",
    "version",
    "ancestors",
    "operations",
    "children",
    "childTypes",
    "descendants",
    "container",
    "body",
    "restrictions",
    "metadata",
    "macroRenderedOutput",
    "extensions",
    "_expandable",
    "_links"
})
@JsonTypeName("ContentBlogpost")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentBlogpost {

    @JsonProperty("id")
    protected String id;

    /**
     * Can be "page", "blogpost", "attachment" or "content"
     */
    @JsonProperty("type")
    protected String type;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("space")
    protected Space space;

    @JsonProperty("history")
    protected ContentHistory history;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("ancestors")
    protected List<Content> ancestors;

    @JsonProperty("operations")
    protected List<OperationCheckResult> operations;

    @JsonProperty("children")
    protected ContentChildren children;

    @JsonProperty("childTypes")
    protected ContentChildType childTypes;

    @JsonProperty("descendants")
    protected ContentChildren descendants;

    /**
     * Container for content. This can be either a space (containing a page or blogpost) or a page/blog post (containing an attachment or comment)
     */
    @JsonProperty("container")
    protected Map<String, Object> container;

    @JsonProperty("body")
    protected ContentBody body;

    @JsonProperty("restrictions")
    protected ContentRestrictions restrictions;

    @JsonProperty("metadata")
    protected ContentMetadata metadata;

    @JsonProperty("macroRenderedOutput")
    protected Map<String, Object> macroRenderedOutput;

    @JsonProperty("extensions")
    protected Object extensions;

    @JsonProperty("_expandable")
    protected ContentExpandable _expandable;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link ContentBlogpost}.
     *
     * @param spec the specification to process
     */
    public ContentBlogpost(Consumer<ContentBlogpost> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentBlogpost}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentBlogpost(Consumer)} instead.
     * @param id id
     * @param type Can be "page", "blogpost", "attachment" or "content"
     * @param status status
     * @param title title
     * @param space space
     * @param history history
     * @param version version
     * @param ancestors ancestors
     * @param operations operations
     * @param children children
     * @param childTypes childTypes
     * @param descendants descendants
     * @param container Container for content. This can be either a space (containing a page or blogpost) or a page/blog post (containing an attachment or comment)
     * @param body body
     * @param restrictions restrictions
     * @param metadata metadata
     * @param macroRenderedOutput macroRenderedOutput
     * @param extensions extensions
     * @param _expandable _expandable
     * @param _links _links
     */
    @ApiStatus.Internal
    public ContentBlogpost(String id, String type, String status, String title, Space space, ContentHistory history, Version version, List<Content> ancestors, List<OperationCheckResult> operations, ContentChildren children, ContentChildType childTypes, ContentChildren descendants, Map<String, Object> container, ContentBody body, ContentRestrictions restrictions, ContentMetadata metadata, Map<String, Object> macroRenderedOutput, Object extensions, ContentExpandable _expandable, Map<String, String> _links) {
        this.id = id;
        this.type = type;
        this.status = status;
        this.title = title;
        this.space = space;
        this.history = history;
        this.version = version;
        this.ancestors = ancestors;
        this.operations = operations;
        this.children = children;
        this.childTypes = childTypes;
        this.descendants = descendants;
        this.container = container;
        this.body = body;
        this.restrictions = restrictions;
        this.metadata = metadata;
        this.macroRenderedOutput = macroRenderedOutput;
        this.extensions = extensions;
        this._expandable = _expandable;
        this._links = _links;
    }

}
