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
 * PermittedOperationsResponseOperationsInner
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
    "operation",
    "targetType"
})
@JsonTypeName("PermittedOperationsResponse_operations_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PermittedOperationsResponseOperationsInner {

    /**
     * The type of operation.
     */
    @JsonProperty("operation")
    protected String operation;

    /**
     * The type of entity the operation type targets.
     */
    @JsonProperty("targetType")
    protected String targetType;

    /**
     * Constructs a validated instance of {@link PermittedOperationsResponseOperationsInner}.
     *
     * @param spec the specification to process
     */
    public PermittedOperationsResponseOperationsInner(Consumer<PermittedOperationsResponseOperationsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PermittedOperationsResponseOperationsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PermittedOperationsResponseOperationsInner(Consumer)} instead.
     * @param operation The type of operation.
     * @param targetType The type of entity the operation type targets.
     */
    @ApiStatus.Internal
    public PermittedOperationsResponseOperationsInner(String operation, String targetType) {
        this.operation = operation;
        this.targetType = targetType;
    }

}
