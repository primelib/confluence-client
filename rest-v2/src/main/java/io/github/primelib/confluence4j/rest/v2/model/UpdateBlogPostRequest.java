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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * UpdateBlogPostRequest
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
    "body",
    "version"
})
@JsonTypeName("updateBlogPost_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateBlogPostRequest {

    /**
     * Id of the blog post.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The updated status of the blog post. Note, if you change the status of a blog post from 'current' to 'draft' and it has an existing draft, the existing draft will be deleted in favor of the updated draft.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * Title of the blog post.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * ID of the containing space.
     * This currently **does not support moving the blog post to a different space**.
     */
    @JsonProperty("spaceId")
    protected String spaceId;

    @JsonProperty("body")
    protected CreateBlogPostRequestBody body;

    @JsonProperty("version")
    protected UpdateBlogPostRequestVersion version;

    /**
     * Constructs a validated instance of {@link UpdateBlogPostRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateBlogPostRequest(Consumer<UpdateBlogPostRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateBlogPostRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateBlogPostRequest(Consumer)} instead.
     * @param id Id of the blog post.
     * @param status The updated status of the blog post. Note, if you change the status of a blog post from 'current' to 'draft' and it has an existing draft, the existing draft will be deleted in favor of the updated draft.
     * @param title Title of the blog post.
     * @param spaceId ID of the containing space.  This currently **does not support moving the blog post to a different space**.
     * @param body body
     * @param version version
     */
    @ApiStatus.Internal
    public UpdateBlogPostRequest(String id, StatusEnum status, String title, String spaceId, CreateBlogPostRequestBody body, UpdateBlogPostRequestVersion version) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.spaceId = spaceId;
        this.body = body;
        this.version = version;
    }

    /**
     * The updated status of the blog post. Note, if you change the status of a blog post from 'current' to 'draft' and it has an existing draft, the existing draft will be deleted in favor of the updated draft.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        CURRENT("current"),
        DRAFT("draft");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
