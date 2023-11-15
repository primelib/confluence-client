package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Space;
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
 * DeleteLabelFromSpaceSpec
 * <p>
 * Specification for the DeleteLabelFromSpace operation.
 * <p>
 * Remove label from a space
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteLabelFromSpaceOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the space to remove a labels from.
     */
    @NotNull 
    private String spaceKey;

    /**
     * The name of the label to remove
     */
    @NotNull 
    private String name;

    /**
     * The prefix of the label to remove. If not provided defaults to global.
     */
    @Nullable 
    private String prefix;

    /**
     * Constructs a validated instance of {@link DeleteLabelFromSpaceOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteLabelFromSpaceOperationSpec(Consumer<DeleteLabelFromSpaceOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteLabelFromSpaceOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceKey             The key of the space to remove a labels from.
     * @param name                 The name of the label to remove
     * @param prefix               The prefix of the label to remove. If not provided defaults to global.
     */
    @ApiStatus.Internal
    public DeleteLabelFromSpaceOperationSpec(String spaceKey, String name, String prefix) {
        this.spaceKey = spaceKey;
        this.name = name;
        this.prefix = prefix;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(spaceKey, "spaceKey is a required parameter!");
        Objects.requireNonNull(name, "name is a required parameter!");
    }
}
