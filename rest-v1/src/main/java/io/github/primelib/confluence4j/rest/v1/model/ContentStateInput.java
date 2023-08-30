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
 * ContentStateInput
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
    "id",
    "spaceKey"
})
@JsonTypeName("ContentStateInput")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentStateInput {

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

    @JsonProperty("id")
    protected Integer id;

    @JsonProperty("spaceKey")
    protected String spaceKey;

    /**
     * Constructs a validated instance of {@link ContentStateInput}.
     *
     * @param spec the specification to process
     */
    public ContentStateInput(Consumer<ContentStateInput> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentStateInput}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentStateInput(Consumer)} instead.
     * @param name name
     * @param color Color of state. Must be in 6 digit hex form (#FFFFFF). The default colors offered in the UI are:  #ff7452 (red),  #2684ff (blue),  #ffc400 (yellow),  #57d9a3 (green), and  #8777d9 (purple)
     * @param id id
     * @param spaceKey spaceKey
     */
    @ApiStatus.Internal
    public ContentStateInput(String name, String color, Integer id, String spaceKey) {
        this.name = name;
        this.color = color;
        this.id = id;
        this.spaceKey = spaceKey;
    }

}
