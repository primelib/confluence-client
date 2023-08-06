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
 * CreateAttachmentSpec
 * <p>
 * Specification for the CreateAttachment operation.
 * <p>
 * Create attachment
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAttachmentOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content to add the attachment to.
     */
    @NotNull 
    private String id;

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
     * The status of the content that the attachment is being added to.
     */
    @Nullable 
    private String status;

    /**
     * The comment for the attachment that is being added. If you specify a comment, then every file must have a comment and the comments must be in the same order as the files. Alternatively, don't specify any comments.
     */
    @Nullable 
    private File comment;

    /**
     * Constructs a validated instance of {@link CreateAttachmentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateAttachmentOperationSpec(Consumer<CreateAttachmentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateAttachmentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content to add the attachment to.
     * @param _file                The relative location and name of the attachment to be added to the content.
     * @param minorEdit            If {@code minorEdits} is set to 'true', no notification email or activity stream will be generated when the attachment is added to the content.
     * @param status               The status of the content that the attachment is being added to.
     * @param comment              The comment for the attachment that is being added. If you specify a comment, then every file must have a comment and the comments must be in the same order as the files. Alternatively, don't specify any comments.
     */
    @ApiStatus.Internal
    public CreateAttachmentOperationSpec(String id, File _file, File minorEdit, String status, File comment) {
        this.id = id;
        this._file = _file;
        this.minorEdit = minorEdit;
        this.status = status;
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
        Objects.requireNonNull(_file, "_file is a required parameter!");
        Objects.requireNonNull(minorEdit, "minorEdit is a required parameter!");
    }
}
