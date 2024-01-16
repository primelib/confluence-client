package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.Space;
import io.github.primelib.confluence4j.rest.v2.model.SpaceDescriptionBodyRepresentation;
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
 * GetSpaceByIdSpec
 * <p>
 * Specification for the GetSpaceById operation.
 * <p>
 * Get space by id
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetSpaceByIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the space to be returned.
     */
    @NotNull 
    private Long id;

    /**
     * The content format type to be returned in the {@code description} field of the response. If available, the representation will be available under a response field of the same name under the {@code description} field.
     */
    @Nullable 
    private SpaceDescriptionBodyRepresentation descriptionFormat;

    /**
     * If the icon for the space should be fetched or not.
     */
    @Nullable 
    private Boolean includeIcon;

    /**
     * Constructs a validated instance of {@link GetSpaceByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetSpaceByIdOperationSpec(Consumer<GetSpaceByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetSpaceByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the space to be returned.
     * @param descriptionFormat    The content format type to be returned in the {@code description} field of the response. If available, the representation will be available under a response field of the same name under the {@code description} field.
     * @param includeIcon          If the icon for the space should be fetched or not.
     */
    @ApiStatus.Internal
    public GetSpaceByIdOperationSpec(Long id, SpaceDescriptionBodyRepresentation descriptionFormat, Boolean includeIcon) {
        this.id = id;
        this.descriptionFormat = descriptionFormat;
        this.includeIcon = includeIcon;

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
    }
}
