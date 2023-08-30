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
 * SpaceDescriptionCreatePlain
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
    "value",
    "representation"
})
@JsonTypeName("SpaceDescriptionCreate_plain")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpaceDescriptionCreatePlain {

    /**
     * The space description.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Set to 'plain'.
     */
    @JsonProperty("representation")
    protected String representation;

    /**
     * Constructs a validated instance of {@link SpaceDescriptionCreatePlain}.
     *
     * @param spec the specification to process
     */
    public SpaceDescriptionCreatePlain(Consumer<SpaceDescriptionCreatePlain> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpaceDescriptionCreatePlain}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpaceDescriptionCreatePlain(Consumer)} instead.
     * @param value The space description.
     * @param representation Set to 'plain'.
     */
    @ApiStatus.Internal
    public SpaceDescriptionCreatePlain(String value, String representation) {
        this.value = value;
        this.representation = representation;
    }

}
