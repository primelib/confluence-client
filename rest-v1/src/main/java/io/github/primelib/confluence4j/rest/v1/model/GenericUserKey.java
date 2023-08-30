package io.github.primelib.confluence4j.rest.v1.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GenericUserKey
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Builder
@JsonTypeName("GenericUserKey")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GenericUserKey {

    /**
     * Constructs a validated instance of {@link GenericUserKey}.
     *
     * @param spec the specification to process
     */
    public GenericUserKey(Consumer<GenericUserKey> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GenericUserKey}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GenericUserKey(Consumer)} instead.
     */
    @ApiStatus.Internal
    public GenericUserKey() {
    }

}
