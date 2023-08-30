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
 * BlogPostBulk
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
    "spaceId",
    "authorId",
    "createdAt",
    "version",
    "body",
    "_links"
})
@JsonTypeName("BlogPostBulk")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BlogPostBulk {

    /**
     * ID of the blog post.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("status")
    protected ContentStatus status;

    /**
     * Title of the blog post.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * ID of the space the blog post is in.
     */
    @JsonProperty("spaceId")
    protected String spaceId;

    /**
     * The account ID of the user who created this blog post originally.
     */
    @JsonProperty("authorId")
    protected String authorId;

    /**
     * Date and time when the blog post was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     */
    @JsonProperty("createdAt")
    protected OffsetDateTime createdAt;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("body")
    protected BodyBulk body;

    @JsonProperty("_links")
    protected AbstractPageLinks _links;

    /**
     * Constructs a validated instance of {@link BlogPostBulk}.
     *
     * @param spec the specification to process
     */
    public BlogPostBulk(Consumer<BlogPostBulk> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BlogPostBulk}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BlogPostBulk(Consumer)} instead.
     * @param id ID of the blog post.
     * @param status status
     * @param title Title of the blog post.
     * @param spaceId ID of the space the blog post is in.
     * @param authorId The account ID of the user who created this blog post originally.
     * @param createdAt Date and time when the blog post was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     * @param version version
     * @param body body
     * @param _links _links
     */
    @ApiStatus.Internal
    public BlogPostBulk(String id, ContentStatus status, String title, String spaceId, String authorId, OffsetDateTime createdAt, Version version, BodyBulk body, AbstractPageLinks _links) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.spaceId = spaceId;
        this.authorId = authorId;
        this.createdAt = createdAt;
        this.version = version;
        this.body = body;
        this._links = _links;
    }

}
