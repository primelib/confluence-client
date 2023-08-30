package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.UpdateCustomContentRequest;
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
 * UpdateCustomContentSpec
 * <p>
 * Specification for the UpdateCustomContent operation.
 * <p>
 * Update custom content
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateCustomContentOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the custom content to be updated. If you don't know the custom content ID, use Get Custom Content by Type and filter the results.
     */
    @NotNull 
    private Long id;

    /**
     */
    @NotNull 
    private UpdateCustomContentRequest updateCustomContentRequest;

    /**
     * Constructs a validated instance of {@link UpdateCustomContentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateCustomContentOperationSpec(Consumer<UpdateCustomContentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateCustomContentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the custom content to be updated. If you don't know the custom content ID, use Get Custom Content by Type and filter the results.
     * @param updateCustomContentRequest 
     */
    @ApiStatus.Internal
    public UpdateCustomContentOperationSpec(Long id, UpdateCustomContentRequest updateCustomContentRequest) {
        this.id = id;
        this.updateCustomContentRequest = updateCustomContentRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(updateCustomContentRequest, "updateCustomContentRequest is a required parameter!");
    }
}
