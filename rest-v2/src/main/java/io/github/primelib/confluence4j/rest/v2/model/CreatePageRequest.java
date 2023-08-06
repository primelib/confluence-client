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
 * CreatePageRequest
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
    "parentId",
    "body"
})
@JsonTypeName("createPage_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreatePageRequest {

    /**
     * ID of the space
     */
    @JsonProperty("spaceId")
    protected String spaceId;

    /**
     * The status of the page, published or draft.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * Title of the page, required if page status is not draft.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The parent content ID of the page.
     */
    @JsonProperty("parentId")
    protected String parentId;

    @JsonProperty("body")
    protected CreatePageRequestBody body;

    /**
     * Constructs a validated instance of {@link CreatePageRequest}.
     *
     * @param spec the specification to process
     */
    public CreatePageRequest(Consumer<CreatePageRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreatePageRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreatePageRequest(Consumer)} instead.
     * @param spaceId ID of the space
     * @param status The status of the page, published or draft.
     * @param title Title of the page, required if page status is not draft.
     * @param parentId The parent content ID of the page.
     * @param body body
     */
    @ApiStatus.Internal
    public CreatePageRequest(String spaceId, StatusEnum status, String title, String parentId, CreatePageRequestBody body) {
        this.spaceId = spaceId;
        this.status = status;
        this.title = title;
        this.parentId = parentId;
        this.body = body;
    }

    /**
     * The status of the page, published or draft.
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
