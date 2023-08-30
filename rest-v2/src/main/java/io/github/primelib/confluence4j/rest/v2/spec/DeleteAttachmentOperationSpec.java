package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.Attachment;
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
 * DeleteAttachmentSpec
 * <p>
 * Specification for the DeleteAttachment operation.
 * <p>
 * Delete attachment
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteAttachmentOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the attachment to be deleted.
     */
    @NotNull 
    private Long id;

    /**
     * Constructs a validated instance of {@link DeleteAttachmentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteAttachmentOperationSpec(Consumer<DeleteAttachmentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteAttachmentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the attachment to be deleted.
     */
    @ApiStatus.Internal
    public DeleteAttachmentOperationSpec(Long id) {
        this.id = id;

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
    }
}
