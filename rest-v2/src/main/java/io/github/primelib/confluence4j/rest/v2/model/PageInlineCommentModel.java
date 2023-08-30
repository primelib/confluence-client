package io.github.primelib.confluence4j.rest.v2.model;

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
 * PageInlineCommentModel
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
    "status",
    "title",
    "pageId",
    "version",
    "body",
    "resolutionStatus",
    "properties",
    "_links"
})
@JsonTypeName("PageInlineCommentModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PageInlineCommentModel {

    /**
     * ID of the comment.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("status")
    protected ContentStatus status;

    /**
     * Title of the comment.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * ID of the page the comment is in.
     */
    @JsonProperty("pageId")
    protected String pageId;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("body")
    protected BodyBulk body;

    @JsonProperty("resolutionStatus")
    protected InlineCommentResolutionStatus resolutionStatus;

    @JsonProperty("properties")
    protected InlineCommentProperties properties;

    @JsonProperty("_links")
    protected CommentLinks _links;

    /**
     * Constructs a validated instance of {@link PageInlineCommentModel}.
     *
     * @param spec the specification to process
     */
    public PageInlineCommentModel(Consumer<PageInlineCommentModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PageInlineCommentModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PageInlineCommentModel(Consumer)} instead.
     * @param id ID of the comment.
     * @param status status
     * @param title Title of the comment.
     * @param pageId ID of the page the comment is in.
     * @param version version
     * @param body body
     * @param resolutionStatus resolutionStatus
     * @param properties properties
     * @param _links _links
     */
    @ApiStatus.Internal
    public PageInlineCommentModel(String id, ContentStatus status, String title, String pageId, Version version, BodyBulk body, InlineCommentResolutionStatus resolutionStatus, InlineCommentProperties properties, CommentLinks _links) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.pageId = pageId;
        this.version = version;
        this.body = body;
        this.resolutionStatus = resolutionStatus;
        this.properties = properties;
        this._links = _links;
    }

}
