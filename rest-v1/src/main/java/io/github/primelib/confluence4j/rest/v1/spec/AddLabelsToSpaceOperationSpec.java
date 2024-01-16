package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.LabelCreate;
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
 * AddLabelsToSpaceSpec
 * <p>
 * Specification for the AddLabelsToSpace operation.
 * <p>
 * Add labels to a space
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddLabelsToSpaceOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the space to add labels to.
     */
    @NotNull 
    private String spaceKey;

    /**
     * The labels to add to the content.
     */
    @NotNull 
    private List<LabelCreate> labelCreate;

    /**
     * Constructs a validated instance of {@link AddLabelsToSpaceOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddLabelsToSpaceOperationSpec(Consumer<AddLabelsToSpaceOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AddLabelsToSpaceOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceKey             The key of the space to add labels to.
     * @param labelCreate          The labels to add to the content.
     */
    @ApiStatus.Internal
    public AddLabelsToSpaceOperationSpec(String spaceKey, List<LabelCreate> labelCreate) {
        this.spaceKey = spaceKey;
        this.labelCreate = labelCreate;

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
        Objects.requireNonNull(labelCreate, "labelCreate is a required parameter!");
    }
}
