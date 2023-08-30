package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.Attachment;
import io.github.primelib.confluence4j.rest.v2.model.ContentProperty;
import io.github.primelib.confluence4j.rest.v2.model.ContentPropertyCreateRequest;
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
 * CreateAttachmentPropertySpec
 * <p>
 * Specification for the CreateAttachmentProperty operation.
 * <p>
 * Create content property for attachment
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAttachmentPropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the attachment to create a property for.
     */
    @NotNull 
    private String attachmentId;

    /**
     * The content property to be created
     */
    @NotNull 
    private ContentPropertyCreateRequest contentPropertyCreateRequest;

    /**
     * Constructs a validated instance of {@link CreateAttachmentPropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateAttachmentPropertyOperationSpec(Consumer<CreateAttachmentPropertyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateAttachmentPropertyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param attachmentId         The ID of the attachment to create a property for.
     * @param contentPropertyCreateRequest The content property to be created
     */
    @ApiStatus.Internal
    public CreateAttachmentPropertyOperationSpec(String attachmentId, ContentPropertyCreateRequest contentPropertyCreateRequest) {
        this.attachmentId = attachmentId;
        this.contentPropertyCreateRequest = contentPropertyCreateRequest;

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
        Objects.requireNonNull(contentPropertyCreateRequest, "contentPropertyCreateRequest is a required parameter!");
    }
}
