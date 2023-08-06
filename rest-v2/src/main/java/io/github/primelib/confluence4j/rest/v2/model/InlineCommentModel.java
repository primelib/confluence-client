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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InlineCommentModel
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
    "blogPostId",
    "pageId",
    "parentCommentId",
    "version",
    "body",
    "resolutionLastModifierId",
    "resolutionLastModifiedAt",
    "resolutionStatus",
    "properties",
    "_links"
})
@JsonTypeName("InlineCommentModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InlineCommentModel {

    /**
     * ID of the comment.
     * Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @JsonProperty("id")
    protected Long id;

    @JsonProperty("status")
    protected ContentStatus status;

    /**
     * Title of the comment.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * ID of the blog post containing the comment if the comment is on a blog post.
     * Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @JsonProperty("blogPostId")
    protected Long blogPostId;

    /**
     * ID of the page containing the comment if the comment is on a page.
     * Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @JsonProperty("pageId")
    protected Long pageId;

    /**
     * ID of the parent comment if the comment is a reply.
     * Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @JsonProperty("parentCommentId")
    protected Long parentCommentId;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("body")
    protected BodySingle body;

    /**
     * Atlassian Account ID of last person who modified the resolve state of the comment. Null until comment is resolved or reopened.
     */
    @JsonProperty("resolutionLastModifierId")
    protected String resolutionLastModifierId;

    /**
     * Timestamp of the last modification to the comment's resolution status. Null until comment is resolved or reopened.
     */
    @JsonProperty("resolutionLastModifiedAt")
    protected OffsetDateTime resolutionLastModifiedAt;

    @JsonProperty("resolutionStatus")
    protected InlineCommentResolutionStatus resolutionStatus;

    @JsonProperty("properties")
    protected InlineCommentProperties properties;

    @JsonProperty("_links")
    protected CommentLinks _links;

    /**
     * Constructs a validated instance of {@link InlineCommentModel}.
     *
     * @param spec the specification to process
     */
    public InlineCommentModel(Consumer<InlineCommentModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link InlineCommentModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #InlineCommentModel(Consumer)} instead.
     * @param id ID of the comment.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param status status
     * @param title Title of the comment.
     * @param blogPostId ID of the blog post containing the comment if the comment is on a blog post.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param pageId ID of the page containing the comment if the comment is on a page.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param parentCommentId ID of the parent comment if the comment is a reply.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param version version
     * @param body body
     * @param resolutionLastModifierId Atlassian Account ID of last person who modified the resolve state of the comment. Null until comment is resolved or reopened.
     * @param resolutionLastModifiedAt Timestamp of the last modification to the comment's resolution status. Null until comment is resolved or reopened.
     * @param resolutionStatus resolutionStatus
     * @param properties properties
     * @param _links _links
     */
    @ApiStatus.Internal
    public InlineCommentModel(Long id, ContentStatus status, String title, Long blogPostId, Long pageId, Long parentCommentId, Version version, BodySingle body, String resolutionLastModifierId, OffsetDateTime resolutionLastModifiedAt, InlineCommentResolutionStatus resolutionStatus, InlineCommentProperties properties, CommentLinks _links) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.blogPostId = blogPostId;
        this.pageId = pageId;
        this.parentCommentId = parentCommentId;
        this.version = version;
        this.body = body;
        this.resolutionLastModifierId = resolutionLastModifierId;
        this.resolutionLastModifiedAt = resolutionLastModifiedAt;
        this.resolutionStatus = resolutionStatus;
        this.properties = properties;
        this._links = _links;
    }

}
