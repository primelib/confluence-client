package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.Attachment;
import io.github.primelib.confluence4j.rest.v2.model.AttachmentSortOrder;
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
 * GetCustomContentAttachmentsSpec
 * <p>
 * Specification for the GetCustomContentAttachments operation.
 * <p>
 * Get attachments for custom content
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetCustomContentAttachmentsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the custom content for which attachments should be returned.
     */
    @NotNull 
    private Long id;

    /**
     * Used to sort the result by a particular field.
     */
    @Nullable 
    private AttachmentSortOrder sort;

    /**
     * Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     */
    @Nullable 
    private String cursor;

    /**
     * Filter the results to attachments based on their status. By default, {@code current} and {@code archived} are used.
     */
    @Nullable 
    private List<String> status;

    /**
     * Filters on the mediaType of attachments. Only one may be specified.
     */
    @Nullable 
    private String mediaType;

    /**
     * Filters on the file-name of attachments. Only one may be specified.
     */
    @Nullable 
    private String filename;

    /**
     * Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetCustomContentAttachmentsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetCustomContentAttachmentsOperationSpec(Consumer<GetCustomContentAttachmentsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetCustomContentAttachmentsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the custom content for which attachments should be returned.
     * @param sort                 Used to sort the result by a particular field.
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     * @param status               Filter the results to attachments based on their status. By default, {@code current} and {@code archived} are used.
     * @param mediaType            Filters on the mediaType of attachments. Only one may be specified.
     * @param filename             Filters on the file-name of attachments. Only one may be specified.
     * @param limit                Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.
     */
    @ApiStatus.Internal
    public GetCustomContentAttachmentsOperationSpec(Long id, AttachmentSortOrder sort, String cursor, List<String> status, String mediaType, String filename, Integer limit) {
        this.id = id;
        this.sort = sort;
        this.cursor = cursor;
        this.status = status;
        this.mediaType = mediaType;
        this.filename = filename;
        this.limit = limit;

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
