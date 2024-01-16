package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.PrimaryBodyRepresentation;
import io.github.primelib.confluence4j.rest.v2.model.PrimaryBodyRepresentationSingle;
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
 * GetInlineCommentByIdSpec
 * <p>
 * Specification for the GetInlineCommentById operation.
 * <p>
 * Get inline comment by id
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetInlineCommentByIdOperationSpec {
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
     * The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     */
    @Nullable 
    private PrimaryBodyRepresentationSingle bodyFormat;

    /**
     * Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details.
     */
    @Nullable 
    private Integer version;

    /**
     * Constructs a validated instance of {@link GetInlineCommentByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetInlineCommentByIdOperationSpec(Consumer<GetInlineCommentByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetInlineCommentByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param commentId            The ID of the comment to be retrieved.
     * @param bodyFormat           The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     * @param version              Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details.
     */
    @ApiStatus.Internal
    public GetInlineCommentByIdOperationSpec(Long commentId, PrimaryBodyRepresentationSingle bodyFormat, Integer version) {
        this.commentId = commentId;
        this.bodyFormat = bodyFormat;
        this.version = version;

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
    }
}
