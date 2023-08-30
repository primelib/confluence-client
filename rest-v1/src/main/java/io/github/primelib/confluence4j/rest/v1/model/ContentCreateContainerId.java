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
 * ContentCreateContainerId
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Builder
@JsonTypeName("ContentCreate_container_id")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentCreateContainerId {

    /**
     * Constructs a validated instance of {@link ContentCreateContainerId}.
     *
     * @param spec the specification to process
     */
    public ContentCreateContainerId(Consumer<ContentCreateContainerId> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentCreateContainerId}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentCreateContainerId(Consumer)} instead.
     */
    @ApiStatus.Internal
    public ContentCreateContainerId() {
    }

}
