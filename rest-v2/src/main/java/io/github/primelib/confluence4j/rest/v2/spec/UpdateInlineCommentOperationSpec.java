package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.InlineCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.UpdateInlineCommentModel;
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
 * UpdateInlineCommentSpec
 * <p>
 * Specification for the UpdateInlineComment operation.
 * <p>
 * Update inline comment
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateInlineCommentOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the comment to be retrieved.
     */
    @NotNull 
    private Long commentId;

    /**
     * The inline comment to be updated
     */
    @NotNull 
    private UpdateInlineCommentModel updateInlineCommentModel;

    /**
     * Constructs a validated instance of {@link UpdateInlineCommentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateInlineCommentOperationSpec(Consumer<UpdateInlineCommentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateInlineCommentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param commentId            The ID of the comment to be retrieved.
     * @param updateInlineCommentModel The inline comment to be updated
     */
    @ApiStatus.Internal
    public UpdateInlineCommentOperationSpec(Long commentId, UpdateInlineCommentModel updateInlineCommentModel) {
        this.commentId = commentId;
        this.updateInlineCommentModel = updateInlineCommentModel;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(commentId, "commentId is a required parameter!");
        Objects.requireNonNull(updateInlineCommentModel, "updateInlineCommentModel is a required parameter!");
    }
}
