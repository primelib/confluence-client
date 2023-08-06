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
 * CustomContentBulk
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
    "spaceId",
    "pageId",
    "blogPostId",
    "customContentId",
    "authorId",
    "createdAt",
    "version",
    "body",
    "_links"
})
@JsonTypeName("CustomContentBulk")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomContentBulk {

    /**
     * ID of the custom content.
     * Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The type of custom content.
     */
    @JsonProperty("type")
    protected String type;

    @JsonProperty("status")
    protected ContentStatus status;

    /**
     * Title of the custom content.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * ID of the space the custom content is in.
     * Note: This is always returned, regardless of if the custom content has a container that is a space.
     * Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @JsonProperty("spaceId")
    protected Long spaceId;

    /**
     * ID of the containing page.
     * Note: This is only returned if the custom content has a container that is a page.
     * Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @JsonProperty("pageId")
    protected Long pageId;

    /**
     * ID of the containing blog post.
     * Note: This is only returned if the custom content has a container that is a blog post.
     * Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @JsonProperty("blogPostId")
    protected Long blogPostId;

    /**
     * ID of the containing custom content.
     * Note: This is only returned if the custom content has a container that is custom content.
     * Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @JsonProperty("customContentId")
    protected Long customContentId;

    /**
     * The account ID of the user who created this custom content originally.
     */
    @JsonProperty("authorId")
    protected String authorId;

    /**
     * Date and time when the custom content was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     */
    @JsonProperty("createdAt")
    protected OffsetDateTime createdAt;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("body")
    protected CustomContentBodyBulk body;

    @JsonProperty("_links")
    protected CustomContentLinks _links;

    /**
     * Constructs a validated instance of {@link CustomContentBulk}.
     *
     * @param spec the specification to process
     */
    public CustomContentBulk(Consumer<CustomContentBulk> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomContentBulk}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomContentBulk(Consumer)} instead.
     * @param id ID of the custom content.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param type The type of custom content.
     * @param status status
     * @param title Title of the custom content.
     * @param spaceId ID of the space the custom content is in.  Note: This is always returned, regardless of if the custom content has a container that is a space.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param pageId ID of the containing page.  Note: This is only returned if the custom content has a container that is a page.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param blogPostId ID of the containing blog post.  Note: This is only returned if the custom content has a container that is a blog post.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param customContentId ID of the containing custom content.  Note: This is only returned if the custom content has a container that is custom content.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param authorId The account ID of the user who created this custom content originally.
     * @param createdAt Date and time when the custom content was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     * @param version version
     * @param body body
     * @param _links _links
     */
    @ApiStatus.Internal
    public CustomContentBulk(Long id, String type, ContentStatus status, String title, Long spaceId, Long pageId, Long blogPostId, Long customContentId, String authorId, OffsetDateTime createdAt, Version version, CustomContentBodyBulk body, CustomContentLinks _links) {
        this.id = id;
        this.type = type;
        this.status = status;
        this.title = title;
        this.spaceId = spaceId;
        this.pageId = pageId;
        this.blogPostId = blogPostId;
        this.customContentId = customContentId;
        this.authorId = authorId;
        this.createdAt = createdAt;
        this.version = version;
        this.body = body;
        this._links = _links;
    }

}
