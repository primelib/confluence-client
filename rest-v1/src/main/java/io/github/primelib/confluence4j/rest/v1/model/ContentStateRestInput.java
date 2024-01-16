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
 * ContentStateRestInput
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
    "name",
    "color",
    "id"
})
@JsonTypeName("ContentStateRestInput")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentStateRestInput {

    /**
     * Name of content state. Maximum 20 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Color of state. Must be in 6 digit hex form (#FFFFFF). The default colors offered in the UI are:
     * #ff7452 (red),
     * #2684ff (blue),
     * #ffc400 (yellow),
     * #57d9a3 (green), and
     * #8777d9 (purple)
     */
    @JsonProperty("color")
    protected String color;

    /**
     * id of state. This can be 0,1, or 2 if you wish to specify a default space state.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * Constructs a validated instance of {@link ContentStateRestInput}.
     *
     * @param spec the specification to process
     */
    public ContentStateRestInput(Consumer<ContentStateRestInput> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentStateRestInput}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentStateRestInput(Consumer)} instead.
     * @param name Name of content state. Maximum 20 characters.
     * @param color Color of state. Must be in 6 digit hex form (#FFFFFF). The default colors offered in the UI are:  #ff7452 (red),  #2684ff (blue),  #ffc400 (yellow),  #57d9a3 (green), and  #8777d9 (purple)
     * @param id id of state. This can be 0,1, or 2 if you wish to specify a default space state.
     */
    @ApiStatus.Internal
    public ContentStateRestInput(String name, String color, Long id) {
        this.name = name;
        this.color = color;
        this.id = id;
    }

}
