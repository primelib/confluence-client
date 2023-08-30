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
 * ConvertContentIdsToContentTypesRequestContentIdsInner
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Builder
@JsonTypeName("convertContentIdsToContentTypes_request_contentIds_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConvertContentIdsToContentTypesRequestContentIdsInner {

    /**
     * Constructs a validated instance of {@link ConvertContentIdsToContentTypesRequestContentIdsInner}.
     *
     * @param spec the specification to process
     */
    public ConvertContentIdsToContentTypesRequestContentIdsInner(Consumer<ConvertContentIdsToContentTypesRequestContentIdsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ConvertContentIdsToContentTypesRequestContentIdsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ConvertContentIdsToContentTypesRequestContentIdsInner(Consumer)} instead.
     */
    @ApiStatus.Internal
    public ConvertContentIdsToContentTypesRequestContentIdsInner() {
    }

}
