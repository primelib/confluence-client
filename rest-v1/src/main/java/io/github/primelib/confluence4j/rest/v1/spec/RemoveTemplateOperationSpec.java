package io.github.primelib.confluence4j.rest.v1.spec;

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
 * RemoveTemplateSpec
 * <p>
 * Specification for the RemoveTemplate operation.
 * <p>
 * Remove template
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveTemplateOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the template to be deleted.
     */
    @NotNull 
    private String contentTemplateId;

    /**
     * Constructs a validated instance of {@link RemoveTemplateOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveTemplateOperationSpec(Consumer<RemoveTemplateOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link RemoveTemplateOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param contentTemplateId    The ID of the template to be deleted.
     */
    @ApiStatus.Internal
    public RemoveTemplateOperationSpec(String contentTemplateId) {
        this.contentTemplateId = contentTemplateId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(contentTemplateId, "contentTemplateId is a required parameter!");
    }
}
