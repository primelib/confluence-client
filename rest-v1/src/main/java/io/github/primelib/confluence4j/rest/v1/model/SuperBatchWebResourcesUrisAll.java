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
 * SuperBatchWebResourcesUrisAll
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Builder
@JsonTypeName("SuperBatchWebResources_uris_all")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SuperBatchWebResourcesUrisAll {

    /**
     * Constructs a validated instance of {@link SuperBatchWebResourcesUrisAll}.
     *
     * @param spec the specification to process
     */
    public SuperBatchWebResourcesUrisAll(Consumer<SuperBatchWebResourcesUrisAll> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SuperBatchWebResourcesUrisAll}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SuperBatchWebResourcesUrisAll(Consumer)} instead.
     */
    @ApiStatus.Internal
    public SuperBatchWebResourcesUrisAll() {
    }

}
