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
 * CreateWhiteboardRequest
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
    "title",
    "parentId"
})
@JsonTypeName("createWhiteboard_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWhiteboardRequest {

    /**
     * ID of the space
     */
    @JsonProperty("spaceId")
    protected String spaceId;

    /**
     * Title of the whiteboard
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The parent content ID of the whiteboard
     */
    @JsonProperty("parentId")
    protected String parentId;

    /**
     * Constructs a validated instance of {@link CreateWhiteboardRequest}.
     *
     * @param spec the specification to process
     */
    public CreateWhiteboardRequest(Consumer<CreateWhiteboardRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateWhiteboardRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateWhiteboardRequest(Consumer)} instead.
     * @param spaceId ID of the space
     * @param title Title of the whiteboard
     * @param parentId The parent content ID of the whiteboard
     */
    @ApiStatus.Internal
    public CreateWhiteboardRequest(String spaceId, String title, String parentId) {
        this.spaceId = spaceId;
        this.title = title;
        this.parentId = parentId;
    }

}
