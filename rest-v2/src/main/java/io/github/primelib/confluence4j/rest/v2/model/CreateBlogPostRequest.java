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
 * CreateBlogPostRequest
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
    "spaceId",
    "status",
    "title",
    "body"
})
@JsonTypeName("createBlogPost_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateBlogPostRequest {

    /**
     * ID of the space
     */
    @JsonProperty("spaceId")
    protected String spaceId;

    /**
     * The status of the blog post, specifies if the blog post will be created as a new blog post or a draft
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * Title of the blog post, required if creating non-draft.
     */
    @JsonProperty("title")
    protected String title;

    @JsonProperty("body")
    protected CreateBlogPostRequestBody body;

    /**
     * Constructs a validated instance of {@link CreateBlogPostRequest}.
     *
     * @param spec the specification to process
     */
    public CreateBlogPostRequest(Consumer<CreateBlogPostRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateBlogPostRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateBlogPostRequest(Consumer)} instead.
     * @param spaceId ID of the space
     * @param status The status of the blog post, specifies if the blog post will be created as a new blog post or a draft
     * @param title Title of the blog post, required if creating non-draft.
     * @param body body
     */
    @ApiStatus.Internal
    public CreateBlogPostRequest(String spaceId, StatusEnum status, String title, CreateBlogPostRequestBody body) {
        this.spaceId = spaceId;
        this.status = status;
        this.title = title;
        this.body = body;
    }

    /**
     * The status of the blog post, specifies if the blog post will be created as a new blog post or a draft
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
