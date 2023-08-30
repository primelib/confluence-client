package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.CustomContentBodyRepresentation;
import io.github.primelib.confluence4j.rest.v2.model.Space;
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
 * GetCustomContentByTypeInSpaceSpec
 * <p>
 * Specification for the GetCustomContentByTypeInSpace operation.
 * <p>
 * Get custom content by type in space
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetCustomContentByTypeInSpaceOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the space for which custom content should be returned.
     */
    @NotNull 
    private Long id;

    /**
     * The type of custom content being requested. See: https://developer.atlassian.com/cloud/confluence/custom-content/ for additional details on custom content.
     */
    @NotNull 
    private String type;

    /**
     * Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     */
    @Nullable 
    private String cursor;

    /**
     * Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.
     */
    @Nullable 
    private Integer limit;

    /**
     * The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     * Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned.
     */
    @Nullable 
    private CustomContentBodyRepresentation bodyFormat;

    /**
     * Constructs a validated instance of {@link GetCustomContentByTypeInSpaceOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetCustomContentByTypeInSpaceOperationSpec(Consumer<GetCustomContentByTypeInSpaceOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetCustomContentByTypeInSpaceOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the space for which custom content should be returned.
     * @param type                 The type of custom content being requested. See: https://developer.atlassian.com/cloud/confluence/custom-content/ for additional details on custom content.
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     * @param limit                Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned.
     */
    @ApiStatus.Internal
    public GetCustomContentByTypeInSpaceOperationSpec(Long id, String type, String cursor, Integer limit, CustomContentBodyRepresentation bodyFormat) {
        this.id = id;
        this.type = type;
        this.cursor = cursor;
        this.limit = limit;
        this.bodyFormat = bodyFormat;

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
        Objects.requireNonNull(type, "type is a required parameter!");
    }
}
