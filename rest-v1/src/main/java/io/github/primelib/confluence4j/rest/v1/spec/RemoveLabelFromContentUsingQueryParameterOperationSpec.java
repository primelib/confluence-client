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
 * RemoveLabelFromContentUsingQueryParameterSpec
 * <p>
 * Specification for the RemoveLabelFromContentUsingQueryParameter operation.
 * <p>
 * Remove label from content using query parameter
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveLabelFromContentUsingQueryParameterOperationSpec {
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
    private String name;

    /**
     * Constructs a validated instance of {@link RemoveLabelFromContentUsingQueryParameterOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveLabelFromContentUsingQueryParameterOperationSpec(Consumer<RemoveLabelFromContentUsingQueryParameterOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link RemoveLabelFromContentUsingQueryParameterOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content that the label will be removed from.
     * @param name                 The name of the label to be removed.
     */
    @ApiStatus.Internal
    public RemoveLabelFromContentUsingQueryParameterOperationSpec(String id, String name) {
        this.id = id;
        this.name = name;

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
        Objects.requireNonNull(name, "name is a required parameter!");
    }
}
