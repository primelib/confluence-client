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
 * MovePageSpec
 * <p>
 * Specification for the MovePage operation.
 * <p>
 * Move a page to a new location relative to a target page
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MovePageOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the page to be moved
     */
    @NotNull 
    private String pageId;

    /**
     * The position to move the page to relative to the target page: * {@code before} - move the page under the same parent as the target, before the target in the list of children * {@code after} - move the page under the same parent as the target, after the target in the list of children * {@code append} - move the page to be a child of the target
     */
    @NotNull 
    private String position;

    /**
     * The ID of the target page for this operation
     */
    @NotNull 
    private String targetId;

    /**
     * Constructs a validated instance of {@link MovePageOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MovePageOperationSpec(Consumer<MovePageOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link MovePageOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param pageId               The ID of the page to be moved
     * @param position             The position to move the page to relative to the target page: * {@code before} - move the page under the same parent as the target, before the target in the list of children * {@code after} - move the page under the same parent as the target, after the target in the list of children * {@code append} - move the page to be a child of the target
     * @param targetId             The ID of the target page for this operation
     */
    @ApiStatus.Internal
    public MovePageOperationSpec(String pageId, String position, String targetId) {
        this.pageId = pageId;
        this.position = position;
        this.targetId = targetId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(pageId, "pageId is a required parameter!");
        Objects.requireNonNull(position, "position is a required parameter!");
        Objects.requireNonNull(targetId, "targetId is a required parameter!");
    }
}
