package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.PageSortOrder;
import io.github.primelib.confluence4j.rest.v2.model.PrimaryBodyRepresentation;
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
 * GetLabelPagesSpec
 * <p>
 * Specification for the GetLabelPages operation.
 * <p>
 * Get pages for label
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetLabelPagesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the label for which pages should be returned.
     */
    @NotNull 
    private Long id;

    /**
     * Filter the results based on space ids. Multiple space ids can be specified as a comma-separated list.
     */
    @Nullable 
    private List<Long> spaceId;

    /**
     * The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     */
    @Nullable 
    private PrimaryBodyRepresentation bodyFormat;

    /**
     * Used to sort the result by a particular field.
     */
    @Nullable 
    private PageSortOrder sort;

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
     * Constructs a validated instance of {@link GetLabelPagesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetLabelPagesOperationSpec(Consumer<GetLabelPagesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetLabelPagesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the label for which pages should be returned.
     * @param spaceId              Filter the results based on space ids. Multiple space ids can be specified as a comma-separated list.
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     * @param sort                 Used to sort the result by a particular field.
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     * @param limit                Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.
     */
    @ApiStatus.Internal
    public GetLabelPagesOperationSpec(Long id, List<Long> spaceId, PrimaryBodyRepresentation bodyFormat, PageSortOrder sort, String cursor, Integer limit) {
        this.id = id;
        this.spaceId = spaceId;
        this.bodyFormat = bodyFormat;
        this.sort = sort;
        this.cursor = cursor;
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
