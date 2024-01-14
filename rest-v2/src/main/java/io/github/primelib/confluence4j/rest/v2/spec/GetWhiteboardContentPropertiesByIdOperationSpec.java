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
 * GetWhiteboardContentPropertiesByIdSpec
 * <p>
 * Specification for the GetWhiteboardContentPropertiesById operation.
 * <p>
 * Get content property for whiteboard by id
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWhiteboardContentPropertiesByIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the whiteboard for which content properties should be returned.
     */
    @NotNull 
    private Long whiteboardId;

    /**
     * The ID of the content property being requested.
     */
    @NotNull 
    private Long propertyId;

    /**
     * Constructs a validated instance of {@link GetWhiteboardContentPropertiesByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetWhiteboardContentPropertiesByIdOperationSpec(Consumer<GetWhiteboardContentPropertiesByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetWhiteboardContentPropertiesByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param whiteboardId         The ID of the whiteboard for which content properties should be returned.
     * @param propertyId           The ID of the content property being requested.
     */
    @ApiStatus.Internal
    public GetWhiteboardContentPropertiesByIdOperationSpec(Long whiteboardId, Long propertyId) {
        this.whiteboardId = whiteboardId;
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
        Objects.requireNonNull(whiteboardId, "whiteboardId is a required parameter!");
        Objects.requireNonNull(propertyId, "propertyId is a required parameter!");
    }
}
