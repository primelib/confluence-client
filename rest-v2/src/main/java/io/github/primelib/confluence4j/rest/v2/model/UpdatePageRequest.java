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
 * UpdatePageRequest
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
    "parentId",
    "body",
    "version"
})
@JsonTypeName("updatePage_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdatePageRequest {

    /**
     * Id of the page.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The status of the page.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * Title of the page.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * ID of the containing space.
     * This currently **does not support moving the page to a different space**.
     */
    @JsonProperty("spaceId")
    protected Object spaceId;

    /**
     * ID of the parent page.
     * This allows the page to be moved under a different parent within the same space.
     */
    @JsonProperty("parentId")
    protected Object parentId;

    @JsonProperty("body")
    protected CreatePageRequestBody body;

    @JsonProperty("version")
    protected UpdateBlogPostRequestVersion version;

    /**
     * Constructs a validated instance of {@link UpdatePageRequest}.
     *
     * @param spec the specification to process
     */
    public UpdatePageRequest(Consumer<UpdatePageRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdatePageRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdatePageRequest(Consumer)} instead.
     * @param id Id of the page.
     * @param status The status of the page.
     * @param title Title of the page.
     * @param spaceId ID of the containing space.  This currently **does not support moving the page to a different space**.
     * @param parentId ID of the parent page.  This allows the page to be moved under a different parent within the same space.
     * @param body body
     * @param version version
     */
    @ApiStatus.Internal
    public UpdatePageRequest(String id, StatusEnum status, String title, Object spaceId, Object parentId, CreatePageRequestBody body, UpdateBlogPostRequestVersion version) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.spaceId = spaceId;
        this.parentId = parentId;
        this.body = body;
        this.version = version;
    }

    /**
     * The status of the page.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        CURRENT("current"),
        DRAFT("draft"),
        ARCHIVED("archived"),
        DELETED("deleted");

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
