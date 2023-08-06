package io.github.primelib.confluence4j.rest.v1.model;

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
 * ContentStateResponse
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
    "contentState",
    "lastUpdated"
})
@JsonTypeName("ContentStateResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentStateResponse {

    @JsonProperty("contentState")
    protected ContentState contentState;

    /**
     * Timestamp of last publish event where content state changed
     */
    @JsonProperty("lastUpdated")
    protected String lastUpdated;

    /**
     * Constructs a validated instance of {@link ContentStateResponse}.
     *
     * @param spec the specification to process
     */
    public ContentStateResponse(Consumer<ContentStateResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentStateResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentStateResponse(Consumer)} instead.
     * @param contentState contentState
     * @param lastUpdated Timestamp of last publish event where content state changed
     */
    @ApiStatus.Internal
    public ContentStateResponse(ContentState contentState, String lastUpdated) {
        this.contentState = contentState;
        this.lastUpdated = lastUpdated;
    }

}
