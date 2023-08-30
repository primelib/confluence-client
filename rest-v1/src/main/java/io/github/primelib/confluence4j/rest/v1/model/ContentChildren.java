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
 * ContentChildren
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
    "attachment",
    "comment",
    "page",
    "_expandable",
    "_links"
})
@JsonTypeName("ContentChildren")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentChildren {

    @JsonProperty("attachment")
    protected ContentArray attachment;

    @JsonProperty("comment")
    protected ContentArray comment;

    @JsonProperty("page")
    protected ContentArray page;

    @JsonProperty("_expandable")
    protected ContentChildrenExpandable _expandable;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link ContentChildren}.
     *
     * @param spec the specification to process
     */
    public ContentChildren(Consumer<ContentChildren> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentChildren}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentChildren(Consumer)} instead.
     * @param attachment attachment
     * @param comment comment
     * @param page page
     * @param _expandable _expandable
     * @param _links _links
     */
    @ApiStatus.Internal
    public ContentChildren(ContentArray attachment, ContentArray comment, ContentArray page, ContentChildrenExpandable _expandable, Map<String, String> _links) {
        this.attachment = attachment;
        this.comment = comment;
        this.page = page;
        this._expandable = _expandable;
        this._links = _links;
    }

}
