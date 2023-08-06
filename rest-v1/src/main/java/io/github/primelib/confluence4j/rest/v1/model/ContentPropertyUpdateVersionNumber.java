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
 * ContentPropertyUpdateVersionNumber
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Builder
@JsonTypeName("ContentPropertyUpdate_version_number")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentPropertyUpdateVersionNumber {

    /**
     * Constructs a validated instance of {@link ContentPropertyUpdateVersionNumber}.
     *
     * @param spec the specification to process
     */
    public ContentPropertyUpdateVersionNumber(Consumer<ContentPropertyUpdateVersionNumber> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentPropertyUpdateVersionNumber}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentPropertyUpdateVersionNumber(Consumer)} instead.
     */
    @ApiStatus.Internal
    public ContentPropertyUpdateVersionNumber() {
    }

}
