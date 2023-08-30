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
 * SpaceDescription
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
    "plain",
    "view"
})
@JsonTypeName("SpaceDescription")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpaceDescription {

    @JsonProperty("plain")
    protected BodyType plain;

    @JsonProperty("view")
    protected BodyType view;

    /**
     * Constructs a validated instance of {@link SpaceDescription}.
     *
     * @param spec the specification to process
     */
    public SpaceDescription(Consumer<SpaceDescription> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpaceDescription}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpaceDescription(Consumer)} instead.
     * @param plain plain
     * @param view view
     */
    @ApiStatus.Internal
    public SpaceDescription(BodyType plain, BodyType view) {
        this.plain = plain;
        this.view = view;
    }

}
