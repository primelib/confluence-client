package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

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
 * GetCustomContentContentPropertiesByIdSpec
 * <p>
 * Specification for the GetCustomContentContentPropertiesById operation.
 * <p>
 * Get content property for custom content by id
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetCustomContentContentPropertiesByIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the custom content for which content properties should be returned.
     */
    @NotNull 
    private Long customContentId;

    /**
     * The ID of the content property being requested.
     */
    @NotNull 
    private Long propertyId;

    /**
     * Constructs a validated instance of {@link GetCustomContentContentPropertiesByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetCustomContentContentPropertiesByIdOperationSpec(Consumer<GetCustomContentContentPropertiesByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetCustomContentContentPropertiesByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param customContentId      The ID of the custom content for which content properties should be returned.
     * @param propertyId           The ID of the content property being requested.
     */
    @ApiStatus.Internal
    public GetCustomContentContentPropertiesByIdOperationSpec(Long customContentId, Long propertyId) {
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
