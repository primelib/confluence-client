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
 * GlobalSpaceIdentifier
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
    "spaceIdentifier"
})
@JsonTypeName("GlobalSpaceIdentifier")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GlobalSpaceIdentifier {

    @JsonProperty("spaceIdentifier")
    protected String spaceIdentifier;

    /**
     * Constructs a validated instance of {@link GlobalSpaceIdentifier}.
     *
     * @param spec the specification to process
     */
    public GlobalSpaceIdentifier(Consumer<GlobalSpaceIdentifier> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GlobalSpaceIdentifier}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GlobalSpaceIdentifier(Consumer)} instead.
     * @param spaceIdentifier spaceIdentifier
     */
    @ApiStatus.Internal
    public GlobalSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier;
    }

}
