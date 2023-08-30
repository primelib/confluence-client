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
 * BodyType
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
    "representation",
    "value"
})
@JsonTypeName("BodyType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BodyType {

    /**
     * Type of content representation used for the value field.
     */
    @JsonProperty("representation")
    protected String representation;

    /**
     * Body of the content, in the format found in the representation field.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link BodyType}.
     *
     * @param spec the specification to process
     */
    public BodyType(Consumer<BodyType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BodyType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BodyType(Consumer)} instead.
     * @param representation Type of content representation used for the value field.
     * @param value Body of the content, in the format found in the representation field.
     */
    @ApiStatus.Internal
    public BodyType(String representation, String value) {
        this.representation = representation;
        this.value = value;
    }

}
