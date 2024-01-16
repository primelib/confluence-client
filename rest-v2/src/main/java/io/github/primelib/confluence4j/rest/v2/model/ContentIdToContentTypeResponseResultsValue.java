package io.github.primelib.confluence4j.rest.v2.model;

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
 * ContentIdToContentTypeResponseResultsValue
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Builder
@JsonTypeName("ContentIdToContentTypeResponse_results_value")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentIdToContentTypeResponseResultsValue {

    /**
     * Constructs a validated instance of {@link ContentIdToContentTypeResponseResultsValue}.
     *
     * @param spec the specification to process
     */
    public ContentIdToContentTypeResponseResultsValue(Consumer<ContentIdToContentTypeResponseResultsValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentIdToContentTypeResponseResultsValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentIdToContentTypeResponseResultsValue(Consumer)} instead.
     */
    @ApiStatus.Internal
    public ContentIdToContentTypeResponseResultsValue() {
    }

}
