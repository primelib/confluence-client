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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentChildType
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
    "_expandable"
})
@JsonTypeName("ContentChildType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentChildType {

    @JsonProperty("attachment")
    protected ContentChildTypeAttachment attachment;

    @JsonProperty("comment")
    protected ContentChildTypeAttachment comment;

    @JsonProperty("page")
    protected ContentChildTypeAttachment page;

    @JsonProperty("_expandable")
    protected ContentChildTypeExpandable _expandable;

    /**
     * Constructs a validated instance of {@link ContentChildType}.
     *
     * @param spec the specification to process
     */
    public ContentChildType(Consumer<ContentChildType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentChildType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentChildType(Consumer)} instead.
     * @param attachment attachment
     * @param comment comment
     * @param page page
     * @param _expandable _expandable
     */
    @ApiStatus.Internal
    public ContentChildType(ContentChildTypeAttachment attachment, ContentChildTypeAttachment comment, ContentChildTypeAttachment page, ContentChildTypeExpandable _expandable) {
        this.attachment = attachment;
        this.comment = comment;
        this.page = page;
        this._expandable = _expandable;
    }

}
