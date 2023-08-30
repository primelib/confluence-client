package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.ContentProperty;
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
 * DeleteCustomContentPropertyByIdSpec
 * <p>
 * Specification for the DeleteCustomContentPropertyById operation.
 * <p>
 * Delete content property for custom content by id
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteCustomContentPropertyByIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the custom content the property belongs to.
     */
    @NotNull 
    private Long customContentId;

    /**
     * The ID of the property to be deleted.
     */
    @NotNull 
    private Long propertyId;

    /**
     * Constructs a validated instance of {@link DeleteCustomContentPropertyByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteCustomContentPropertyByIdOperationSpec(Consumer<DeleteCustomContentPropertyByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteCustomContentPropertyByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param customContentId      The ID of the custom content the property belongs to.
     * @param propertyId           The ID of the property to be deleted.
     */
    @ApiStatus.Internal
    public DeleteCustomContentPropertyByIdOperationSpec(Long customContentId, Long propertyId) {
        this.customContentId = customContentId;
        this.propertyId = propertyId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(customContentId, "customContentId is a required parameter!");
        Objects.requireNonNull(propertyId, "propertyId is a required parameter!");
    }
}
