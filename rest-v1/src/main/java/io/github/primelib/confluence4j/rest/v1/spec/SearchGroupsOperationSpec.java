package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Group;
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
 * SearchGroupsSpec
 * <p>
 * Specification for the SearchGroups operation.
 * <p>
 * Search groups by partial query
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchGroupsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * the search term used to query results.
     */
    @NotNull 
    private String query;

    /**
     * The starting index of the returned groups.
     */
    @Nullable 
    private Integer start;

    /**
     * The maximum number of groups to return per page. Note, this is restricted to a maximum limit of 200 groups.
     */
    @Nullable 
    private Integer limit;

    /**
     * Whether to include total size parameter in the results. Note, fetching total size property is an expensive operation; use it if your use case needs this value.
     */
    @Nullable 
    private Boolean shouldReturnTotalSize;

    /**
     * Constructs a validated instance of {@link SearchGroupsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchGroupsOperationSpec(Consumer<SearchGroupsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SearchGroupsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param query                the search term used to query results.
     * @param start                The starting index of the returned groups.
     * @param limit                The maximum number of groups to return per page. Note, this is restricted to a maximum limit of 200 groups.
     * @param shouldReturnTotalSize Whether to include total size parameter in the results. Note, fetching total size property is an expensive operation; use it if your use case needs this value.
     */
    @ApiStatus.Internal
    public SearchGroupsOperationSpec(String query, Integer start, Integer limit, Boolean shouldReturnTotalSize) {
        this.query = query;
        this.start = start;
        this.limit = limit;
        this.shouldReturnTotalSize = shouldReturnTotalSize;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(query, "query is a required parameter!");
    }
}
