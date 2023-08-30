package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.ContentUpdate;
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
 * UpdateContentSpec
 * <p>
 * Specification for the UpdateContent operation.
 * <p>
 * Update content
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateContentOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content to be updated.
     */
    @NotNull 
    private String id;

    /**
     * The updated content.
     */
    @NotNull 
    private ContentUpdate content;

    /**
     * The updated status of the content. Use this parameter to change the status of a piece of content without passing the entire request body.
     */
    @Nullable 
    private String status;

    /**
     * The action that should be taken when conflicts are discovered. Only used when publishing a draft page.
     */
    @Nullable 
    private String conflictPolicy;

    /**
     * Constructs a validated instance of {@link UpdateContentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateContentOperationSpec(Consumer<UpdateContentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateContentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content to be updated.
     * @param content              The updated content.
     * @param status               The updated status of the content. Use this parameter to change the status of a piece of content without passing the entire request body.
     * @param conflictPolicy       The action that should be taken when conflicts are discovered. Only used when publishing a draft page.
     */
    @ApiStatus.Internal
    public UpdateContentOperationSpec(String id, ContentUpdate content, String status, String conflictPolicy) {
        this.id = id;
        this.content = content;
        this.status = status;
        this.conflictPolicy = conflictPolicy;

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
        Objects.requireNonNull(content, "content is a required parameter!");
    }
}
