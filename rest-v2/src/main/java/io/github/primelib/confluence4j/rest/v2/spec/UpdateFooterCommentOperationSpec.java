package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.FooterCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.UpdateFooterCommentModel;
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
 * UpdateFooterCommentSpec
 * <p>
 * Specification for the UpdateFooterComment operation.
 * <p>
 * Update footer comment
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateFooterCommentOperationSpec {
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
     * The footer comment to be created
     */
    @NotNull 
    private UpdateFooterCommentModel updateFooterCommentModel;

    /**
     * Constructs a validated instance of {@link UpdateFooterCommentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateFooterCommentOperationSpec(Consumer<UpdateFooterCommentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateFooterCommentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param commentId            The ID of the comment to be retrieved.
     * @param updateFooterCommentModel The footer comment to be created
     */
    @ApiStatus.Internal
    public UpdateFooterCommentOperationSpec(Long commentId, UpdateFooterCommentModel updateFooterCommentModel) {
        this.commentId = commentId;
        this.updateFooterCommentModel = updateFooterCommentModel;

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
        Objects.requireNonNull(updateFooterCommentModel, "updateFooterCommentModel is a required parameter!");
    }
}
