package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.Attachment;
import io.github.primelib.confluence4j.rest.v2.model.ContentProperty;
import io.github.primelib.confluence4j.rest.v2.model.ContentPropertyUpdateRequest;
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
 * UpdateAttachmentPropertyByIdSpec
 * <p>
 * Specification for the UpdateAttachmentPropertyById operation.
 * <p>
 * Update content property for attachment by id
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateAttachmentPropertyByIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the attachment the property belongs to.
     */
    @NotNull 
    private String attachmentId;

    /**
     * The ID of the property to be updated.
     */
    @NotNull 
    private Long propertyId;

    /**
     * The content property to be updated.
     */
    @NotNull 
    private ContentPropertyUpdateRequest contentPropertyUpdateRequest;

    /**
     * Constructs a validated instance of {@link UpdateAttachmentPropertyByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateAttachmentPropertyByIdOperationSpec(Consumer<UpdateAttachmentPropertyByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateAttachmentPropertyByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param attachmentId         The ID of the attachment the property belongs to.
     * @param propertyId           The ID of the property to be updated.
     * @param contentPropertyUpdateRequest The content property to be updated.
     */
    @ApiStatus.Internal
    public UpdateAttachmentPropertyByIdOperationSpec(String attachmentId, Long propertyId, ContentPropertyUpdateRequest contentPropertyUpdateRequest) {
        this.attachmentId = attachmentId;
        this.propertyId = propertyId;
        this.contentPropertyUpdateRequest = contentPropertyUpdateRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(attachmentId, "attachmentId is a required parameter!");
        Objects.requireNonNull(propertyId, "propertyId is a required parameter!");
        Objects.requireNonNull(contentPropertyUpdateRequest, "contentPropertyUpdateRequest is a required parameter!");
    }
}
