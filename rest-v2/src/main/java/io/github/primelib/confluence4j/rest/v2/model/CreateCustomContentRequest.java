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
 * CreateCustomContentRequest
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
    "type",
    "status",
    "spaceId",
    "pageId",
    "blogPostId",
    "customContentId",
    "title",
    "body"
})
@JsonTypeName("createCustomContent_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateCustomContentRequest {

    /**
     * Type of custom content.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The status of the custom content
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * ID of the containing space
     */
    @JsonProperty("spaceId")
    protected String spaceId;

    /**
     * ID of the containing page
     */
    @JsonProperty("pageId")
    protected String pageId;

    /**
     * ID of the containing Blog Post
     */
    @JsonProperty("blogPostId")
    protected String blogPostId;

    /**
     * ID of the containing custom content
     */
    @JsonProperty("customContentId")
    protected String customContentId;

    /**
     * Title of the custom content
     */
    @JsonProperty("title")
    protected String title;

    @JsonProperty("body")
    protected CreateCustomContentRequestBody body;

    /**
     * Constructs a validated instance of {@link CreateCustomContentRequest}.
     *
     * @param spec the specification to process
     */
    public CreateCustomContentRequest(Consumer<CreateCustomContentRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateCustomContentRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateCustomContentRequest(Consumer)} instead.
     * @param type Type of custom content.
     * @param status The status of the custom content
     * @param spaceId ID of the containing space
     * @param pageId ID of the containing page
     * @param blogPostId ID of the containing Blog Post
     * @param customContentId ID of the containing custom content
     * @param title Title of the custom content
     * @param body body
     */
    @ApiStatus.Internal
    public CreateCustomContentRequest(String type, StatusEnum status, String spaceId, String pageId, String blogPostId, String customContentId, String title, CreateCustomContentRequestBody body) {
        this.type = type;
        this.status = status;
        this.spaceId = spaceId;
        this.pageId = pageId;
        this.blogPostId = blogPostId;
        this.customContentId = customContentId;
        this.title = title;
        this.body = body;
    }

    /**
     * The status of the custom content
     */
    @AllArgsConstructor
    public enum StatusEnum {
        CURRENT("current");

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
