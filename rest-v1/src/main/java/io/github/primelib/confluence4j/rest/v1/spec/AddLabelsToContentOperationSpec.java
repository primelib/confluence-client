package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.AddLabelsToContentRequest;
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
 * AddLabelsToContentSpec
 * <p>
 * Specification for the AddLabelsToContent operation.
 * <p>
 * Add labels to content
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddLabelsToContentOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content that will have labels added to it.
     */
    @NotNull 
    private String id;

    /**
     * The labels to add to the content.
     */
    @NotNull 
    private AddLabelsToContentRequest body;

    /**
     * Constructs a validated instance of {@link AddLabelsToContentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddLabelsToContentOperationSpec(Consumer<AddLabelsToContentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AddLabelsToContentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content that will have labels added to it.
     * @param body                 The labels to add to the content.
     */
    @ApiStatus.Internal
    public AddLabelsToContentOperationSpec(String id, AddLabelsToContentRequest body) {
        this.id = id;
        this.body = body;

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
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}
