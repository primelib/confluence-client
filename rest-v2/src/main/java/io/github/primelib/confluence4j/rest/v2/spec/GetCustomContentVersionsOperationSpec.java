package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.CustomContentBodyRepresentation;
import io.github.primelib.confluence4j.rest.v2.model.VersionSortOrder;
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
 * GetCustomContentVersionsSpec
 * <p>
 * Specification for the GetCustomContentVersions operation.
 * <p>
 * Get custom content versions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetCustomContentVersionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the custom content to be queried for its versions. If you don't know the custom content ID, use Get custom-content by type and filter the results.
     */
    @NotNull 
    private Long customContentId;

    /**
     * The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     * Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned.
     */
    @Nullable 
    private CustomContentBodyRepresentation bodyFormat;

    /**
     * Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     */
    @Nullable 
    private String cursor;

    /**
     * Maximum number of versions per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.
     */
    @Nullable 
    private Integer limit;

    /**
     * Used to sort the result by a particular field.
     */
    @Nullable 
    private VersionSortOrder sort;

    /**
     * Constructs a validated instance of {@link GetCustomContentVersionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetCustomContentVersionsOperationSpec(Consumer<GetCustomContentVersionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetCustomContentVersionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param customContentId      The ID of the custom content to be queried for its versions. If you don't know the custom content ID, use Get custom-content by type and filter the results.
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned.
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     * @param limit                Maximum number of versions per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.
     * @param sort                 Used to sort the result by a particular field.
     */
    @ApiStatus.Internal
    public GetCustomContentVersionsOperationSpec(Long customContentId, CustomContentBodyRepresentation bodyFormat, String cursor, Integer limit, VersionSortOrder sort) {
        this.customContentId = customContentId;
        this.bodyFormat = bodyFormat;
        this.cursor = cursor;
        this.limit = limit;
        this.sort = sort;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(customContentId, "customContentId is a required parameter!");
    }
}
