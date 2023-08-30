package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.io.File;
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
 * UpdateAttachmentDataSpec
 * <p>
 * Specification for the UpdateAttachmentData operation.
 * <p>
 * Update attachment data
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateAttachmentDataOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content that the attachment is attached to.
     */
    @NotNull 
    private String id;

    /**
     * The ID of the attachment to update.
     */
    @NotNull 
    private String attachmentId;

    /**
     * The relative location and name of the attachment to be added to the content.
     */
    @NotNull 
    private File _file;

    /**
     * If {@code minorEdits} is set to 'true', no notification email or activity stream will be generated when the attachment is added to the content.
     */
    @NotNull 
    private File minorEdit;

    /**
     * The comment for the attachment that is being added. If you specify a comment, then every file must have a comment and the comments must be in the same order as the files. Alternatively, don't specify any comments.
     */
    @Nullable 
    private File comment;

    /**
     * Constructs a validated instance of {@link UpdateAttachmentDataOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateAttachmentDataOperationSpec(Consumer<UpdateAttachmentDataOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateAttachmentDataOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content that the attachment is attached to.
     * @param attachmentId         The ID of the attachment to update.
     * @param _file                The relative location and name of the attachment to be added to the content.
     * @param minorEdit            If {@code minorEdits} is set to 'true', no notification email or activity stream will be generated when the attachment is added to the content.
     * @param comment              The comment for the attachment that is being added. If you specify a comment, then every file must have a comment and the comments must be in the same order as the files. Alternatively, don't specify any comments.
     */
    @ApiStatus.Internal
    public UpdateAttachmentDataOperationSpec(String id, String attachmentId, File _file, File minorEdit, File comment) {
        this.id = id;
        this.attachmentId = attachmentId;
        this._file = _file;
        this.minorEdit = minorEdit;
        this.comment = comment;

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
        Objects.requireNonNull(attachmentId, "attachmentId is a required parameter!");
        Objects.requireNonNull(_file, "_file is a required parameter!");
        Objects.requireNonNull(minorEdit, "minorEdit is a required parameter!");
    }
}
