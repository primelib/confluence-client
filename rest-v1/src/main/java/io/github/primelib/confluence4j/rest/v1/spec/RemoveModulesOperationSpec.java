package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
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
 * RemoveModulesSpec
 * <p>
 * Specification for the RemoveModules operation.
 * <p>
 * Remove modules
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveModulesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, {@code moduleKey=dynamic-attachment-entity-property&amp;moduleKey=dynamic-select-field}. Nonexistent keys are ignored.
     */
    @NotNull 
    private List<String> moduleKey;

    /**
     * Constructs a validated instance of {@link RemoveModulesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveModulesOperationSpec(Consumer<RemoveModulesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link RemoveModulesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param moduleKey            The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, {@code moduleKey=dynamic-attachment-entity-property&amp;moduleKey=dynamic-select-field}. Nonexistent keys are ignored.
     */
    @ApiStatus.Internal
    public RemoveModulesOperationSpec(List<String> moduleKey) {
        this.moduleKey = moduleKey;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(moduleKey, "moduleKey is a required parameter!");
    }
}
