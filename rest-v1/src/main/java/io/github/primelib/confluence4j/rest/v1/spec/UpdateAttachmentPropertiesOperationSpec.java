package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.AttachmentPropertiesUpdateBody;
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
 * UpdateAttachmentPropertiesSpec
 * <p>
 * Specification for the UpdateAttachmentProperties operation.
 * <p>
 * Update attachment properties
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateAttachmentPropertiesOperationSpec {
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
     * The details of the attachment to be updated.
     */
    @NotNull 
    private AttachmentPropertiesUpdateBody body;

    /**
     * Constructs a validated instance of {@link UpdateAttachmentPropertiesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateAttachmentPropertiesOperationSpec(Consumer<UpdateAttachmentPropertiesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateAttachmentPropertiesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content that the attachment is attached to.
     * @param attachmentId         The ID of the attachment to update.
     * @param body                 The details of the attachment to be updated.
     */
    @ApiStatus.Internal
    public UpdateAttachmentPropertiesOperationSpec(String id, String attachmentId, AttachmentPropertiesUpdateBody body) {
        this.id = id;
        this.attachmentId = attachmentId;
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
        Objects.requireNonNull(attachmentId, "attachmentId is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}
