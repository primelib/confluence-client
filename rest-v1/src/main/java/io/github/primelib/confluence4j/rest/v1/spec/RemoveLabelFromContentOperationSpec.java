package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
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
 * RemoveLabelFromContentSpec
 * <p>
 * Specification for the RemoveLabelFromContent operation.
 * <p>
 * Remove label from content
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveLabelFromContentOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content that the label will be removed from.
     */
    @NotNull 
    private String id;

    /**
     * The name of the label to be removed.
     */
    @NotNull 
    private String label;

    /**
     * Constructs a validated instance of {@link RemoveLabelFromContentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveLabelFromContentOperationSpec(Consumer<RemoveLabelFromContentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link RemoveLabelFromContentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content that the label will be removed from.
     * @param label                The name of the label to be removed.
     */
    @ApiStatus.Internal
    public RemoveLabelFromContentOperationSpec(String id, String label) {
        this.id = id;
        this.label = label;

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
        Objects.requireNonNull(label, "label is a required parameter!");
    }
}
