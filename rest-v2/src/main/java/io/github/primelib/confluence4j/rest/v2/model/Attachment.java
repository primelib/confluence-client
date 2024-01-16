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
 * Attachment
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
    "createdAt",
    "pageId",
    "blogPostId",
    "customContentId",
    "mediaType",
    "mediaTypeDescription",
    "comment",
    "fileId",
    "fileSize",
    "webuiLink",
    "downloadLink",
    "version",
    "_links"
})
@JsonTypeName("Attachment")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Attachment {

    /**
     * ID of the attachment.
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
     * Date and time when the attachment was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     */
    @JsonProperty("createdAt")
    protected OffsetDateTime createdAt;

    /**
     * ID of the containing page.
     * Note: This is only returned if the attachment has a container that is a page.
     */
    @JsonProperty("pageId")
    protected String pageId;

    /**
     * ID of the containing blog post.
     * Note: This is only returned if the attachment has a container that is a blog post.
     */
    @JsonProperty("blogPostId")
    protected String blogPostId;

    /**
     * ID of the containing custom content.
     * Note: This is only returned if the attachment has a container that is custom content.
     */
    @JsonProperty("customContentId")
    protected String customContentId;

    /**
     * Media Type for the attachment.
     */
    @JsonProperty("mediaType")
    protected String mediaType;

    /**
     * Media Type description for the attachment.
     */
    @JsonProperty("mediaTypeDescription")
    protected String mediaTypeDescription;

    /**
     * Comment for the attachment.
     */
    @JsonProperty("comment")
    protected String comment;

    /**
     * File ID of the attachment. This is the ID referenced in {@code atlas_doc_format} bodies and is distinct from the attachment ID.
     */
    @JsonProperty("fileId")
    protected String fileId;

    /**
     * File size of the attachment.
     */
    @JsonProperty("fileSize")
    protected Long fileSize;

    /**
     * WebUI link of the attachment.
     */
    @JsonProperty("webuiLink")
    protected String webuiLink;

    /**
     * Download link of the attachment.
     */
    @JsonProperty("downloadLink")
    protected String downloadLink;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("_links")
    protected AttachmentLinks _links;

    /**
     * Constructs a validated instance of {@link Attachment}.
     *
     * @param spec the specification to process
     */
    public Attachment(Consumer<Attachment> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Attachment}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Attachment(Consumer)} instead.
     * @param id ID of the attachment.
     * @param status status
     * @param title Title of the comment.
     * @param createdAt Date and time when the attachment was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     * @param pageId ID of the containing page.  Note: This is only returned if the attachment has a container that is a page.
     * @param blogPostId ID of the containing blog post.  Note: This is only returned if the attachment has a container that is a blog post.
     * @param customContentId ID of the containing custom content.  Note: This is only returned if the attachment has a container that is custom content.
     * @param mediaType Media Type for the attachment.
     * @param mediaTypeDescription Media Type description for the attachment.
     * @param comment Comment for the attachment.
     * @param fileId File ID of the attachment. This is the ID referenced in {@code atlas_doc_format} bodies and is distinct from the attachment ID.
     * @param fileSize File size of the attachment.
     * @param webuiLink WebUI link of the attachment.
     * @param downloadLink Download link of the attachment.
     * @param version version
     * @param _links _links
     */
    @ApiStatus.Internal
    public Attachment(String id, ContentStatus status, String title, OffsetDateTime createdAt, String pageId, String blogPostId, String customContentId, String mediaType, String mediaTypeDescription, String comment, String fileId, Long fileSize, String webuiLink, String downloadLink, Version version, AttachmentLinks _links) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.createdAt = createdAt;
        this.pageId = pageId;
        this.blogPostId = blogPostId;
        this.customContentId = customContentId;
        this.mediaType = mediaType;
        this.mediaTypeDescription = mediaTypeDescription;
        this.comment = comment;
        this.fileId = fileId;
        this.fileSize = fileSize;
        this.webuiLink = webuiLink;
        this.downloadLink = downloadLink;
        this.version = version;
        this._links = _links;
    }

}
