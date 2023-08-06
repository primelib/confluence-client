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
 * GenericLinksValue
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Builder
@JsonTypeName("GenericLinks_value")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GenericLinksValue {

    /**
     * Constructs a validated instance of {@link GenericLinksValue}.
     *
     * @param spec the specification to process
     */
    public GenericLinksValue(Consumer<GenericLinksValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GenericLinksValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GenericLinksValue(Consumer)} instead.
     */
    @ApiStatus.Internal
    public GenericLinksValue() {
    }

}
