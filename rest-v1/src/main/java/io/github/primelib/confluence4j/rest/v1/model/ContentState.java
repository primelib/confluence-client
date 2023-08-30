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
 * ContentState
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
    "name",
    "color"
})
@JsonTypeName("ContentState")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentState {

    /**
     * identifier of content state. If 0, 1, or 2, this is a default space state
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * name of content state.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * hex string representing color of state
     */
    @JsonProperty("color")
    protected String color;

    /**
     * Constructs a validated instance of {@link ContentState}.
     *
     * @param spec the specification to process
     */
    public ContentState(Consumer<ContentState> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentState}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentState(Consumer)} instead.
     * @param id identifier of content state. If 0, 1, or 2, this is a default space state
     * @param name name of content state.
     * @param color hex string representing color of state
     */
    @ApiStatus.Internal
    public ContentState(Long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

}
