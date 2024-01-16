package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.BulkContentStateSetInput;
import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.ContentState;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * BulkSetContentStatesSpec
 * <p>
 * Specification for the BulkSetContentStates operation.
 * <p>
 * Bulk set content state of many contents
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkSetContentStatesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Set status to one of [current,draft].
     */
    @NotNull 
    private String status;

    /**
     * The content state and ids to set it to.
     */
    @NotNull 
    private BulkContentStateSetInput bulkContentStateSetInput;

    /**
     * Constructs a validated instance of {@link BulkSetContentStatesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkSetContentStatesOperationSpec(Consumer<BulkSetContentStatesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link BulkSetContentStatesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param status               Set status to one of [current,draft].
     * @param bulkContentStateSetInput The content state and ids to set it to.
     */
    @ApiStatus.Internal
    public BulkSetContentStatesOperationSpec(String status, BulkContentStateSetInput bulkContentStateSetInput) {
        this.status = status;
        this.bulkContentStateSetInput = bulkContentStateSetInput;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(status, "status is a required parameter!");
        Objects.requireNonNull(bulkContentStateSetInput, "bulkContentStateSetInput is a required parameter!");
    }
}
