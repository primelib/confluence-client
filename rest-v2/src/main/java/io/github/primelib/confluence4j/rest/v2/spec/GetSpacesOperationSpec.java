package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.Space;
import io.github.primelib.confluence4j.rest.v2.model.SpaceDescriptionBodyRepresentation;
import io.github.primelib.confluence4j.rest.v2.model.SpaceSortOrder;
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
 * GetSpacesSpec
 * <p>
 * Specification for the GetSpaces operation.
 * <p>
 * Get spaces
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetSpacesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Filter the results to spaces based on their IDs. Multiple IDs can be specified as a comma-separated list.
     */
    @Nullable 
    private List<Long> ids;

    /**
     * Filter the results to spaces based on their keys. Multiple keys can be specified as a comma-separated list.
     */
    @Nullable 
    private List<String> keys;

    /**
     * Filter the results to spaces based on their type.
     */
    @Nullable 
    private String type;

    /**
     * Filter the results to spaces based on their status.
     */
    @Nullable 
    private String status;

    /**
     * Filter the results to spaces based on their labels. Multiple labels can be specified as a comma-separated list.
     */
    @Nullable 
    private List<String> labels;

    /**
     * Used to sort the result by a particular field.
     */
    @Nullable 
    private SpaceSortOrder sort;

    /**
     * The content format type to be returned in the {@code description} field of the response. If available, the representation will be available under a response field of the same name under the {@code description} field.
     */
    @Nullable 
    private SpaceDescriptionBodyRepresentation descriptionFormat;

    /**
     * If the icon for the space should be fetched or not.
     */
    @Nullable 
    private Boolean includeIcon;

    /**
     * Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     */
    @Nullable 
    private String cursor;

    /**
     * Maximum number of spaces per result to return. If more results exist, use the {@code Link} response header to retrieve a relative URL that will return the next set of results.
     */
    @Nullable 
    private Integer limit;

    /**
     * Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @Nullable 
    private Boolean serializeIdsAsStrings;

    /**
     * Constructs a validated instance of {@link GetSpacesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetSpacesOperationSpec(Consumer<GetSpacesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetSpacesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param ids                  Filter the results to spaces based on their IDs. Multiple IDs can be specified as a comma-separated list.
     * @param keys                 Filter the results to spaces based on their keys. Multiple keys can be specified as a comma-separated list.
     * @param type                 Filter the results to spaces based on their type.
     * @param status               Filter the results to spaces based on their status.
     * @param labels               Filter the results to spaces based on their labels. Multiple labels can be specified as a comma-separated list.
     * @param sort                 Used to sort the result by a particular field.
     * @param descriptionFormat    The content format type to be returned in the {@code description} field of the response. If available, the representation will be available under a response field of the same name under the {@code description} field.
     * @param includeIcon          If the icon for the space should be fetched or not.
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     * @param limit                Maximum number of spaces per result to return. If more results exist, use the {@code Link} response header to retrieve a relative URL that will return the next set of results.
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @ApiStatus.Internal
    public GetSpacesOperationSpec(List<Long> ids, List<String> keys, String type, String status, List<String> labels, SpaceSortOrder sort, SpaceDescriptionBodyRepresentation descriptionFormat, Boolean includeIcon, String cursor, Integer limit, Boolean serializeIdsAsStrings) {
        this.ids = ids;
        this.keys = keys;
        this.type = type;
        this.status = status;
        this.labels = labels;
        this.sort = sort;
        this.descriptionFormat = descriptionFormat;
        this.includeIcon = includeIcon;
        this.cursor = cursor;
        this.limit = limit;
        this.serializeIdsAsStrings = serializeIdsAsStrings;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}
