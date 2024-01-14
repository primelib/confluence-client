package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.Space;
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
 * GetDataPolicySpacesSpec
 * <p>
 * Specification for the GetDataPolicySpaces operation.
 * <p>
 * Get spaces with data policies (EAP)
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetDataPolicySpacesOperationSpec {
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
     * Used to sort the result by a particular field.
     */
    @Nullable 
    private SpaceSortOrder sort;

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
     * Constructs a validated instance of {@link GetDataPolicySpacesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetDataPolicySpacesOperationSpec(Consumer<GetDataPolicySpacesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetDataPolicySpacesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param ids                  Filter the results to spaces based on their IDs. Multiple IDs can be specified as a comma-separated list.
     * @param keys                 Filter the results to spaces based on their keys. Multiple keys can be specified as a comma-separated list.
     * @param sort                 Used to sort the result by a particular field.
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     * @param limit                Maximum number of spaces per result to return. If more results exist, use the {@code Link} response header to retrieve a relative URL that will return the next set of results.
     */
    @ApiStatus.Internal
    public GetDataPolicySpacesOperationSpec(List<Long> ids, List<String> keys, SpaceSortOrder sort, String cursor, Integer limit) {
        this.ids = ids;
        this.keys = keys;
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
    }
}
