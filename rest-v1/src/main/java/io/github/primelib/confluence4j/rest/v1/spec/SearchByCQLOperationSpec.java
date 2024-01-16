package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.Space;
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
 * SearchByCQLSpec
 * <p>
 * Specification for the SearchByCQL operation.
 * <p>
 * Search content
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchByCQLOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The CQL query to be used for the search. See [Advanced Searching using CQL](https://developer.atlassian.com/cloud/confluence/advanced-searching-using-cql/) for instructions on how to build a CQL query.
     */
    @NotNull 
    private String cql;

    /**
     * The space, content, and content status to execute the search against.
     * - {@code spaceKey} Key of the space to search against. Optional. - {@code contentId} ID of the content to search against. Optional. Must be in the space specified by {@code spaceKey}. - {@code contentStatuses} Content statuses to search against. Optional.
     * Specify these values in an object. For example, {@code cqlcontext={%22spaceKey%22:%22TEST%22, %22contentId%22:%22123%22}}
     */
    @Nullable 
    private String cqlcontext;

    /**
     * Pointer to a set of search results, returned as part of the {@code next} or {@code prev} URL from the previous search call.
     */
    @Nullable 
    private String cursor;

    /**
     */
    @Nullable 
    private Boolean next;

    /**
     */
    @Nullable 
    private Boolean prev;

    /**
     * The maximum number of content objects to return per page. Note, this may be restricted by fixed system limits.
     */
    @Nullable 
    private Integer limit;

    /**
     * The start point of the collection to return
     */
    @Nullable 
    private Integer start;

    /**
     * Whether to include content from archived spaces in the results.
     */
    @Nullable 
    private Boolean includeArchivedSpaces;

    /**
     * Whether to exclude current spaces and only show archived spaces.
     */
    @Nullable 
    private Boolean excludeCurrentSpaces;

    /**
     * The excerpt strategy to apply to the result
     */
    @Nullable 
    private String excerpt;

    /**
     * Filters users by permission type. Use {@code none} to default to licensed users, {@code externalCollaborator} for external/guest users, and {@code all} to include all permission types.
     */
    @Nullable 
    private String sitePermissionTypeFilter;

    /**
     */
    @Nullable 
    private Long _u;

    /**
     */
    @Nullable 
    private List<String> expand;

    /**
     * Constructs a validated instance of {@link SearchByCQLOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchByCQLOperationSpec(Consumer<SearchByCQLOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SearchByCQLOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param cql                  The CQL query to be used for the search. See [Advanced Searching using CQL](https://developer.atlassian.com/cloud/confluence/advanced-searching-using-cql/) for instructions on how to build a CQL query.
     * @param cqlcontext           The space, content, and content status to execute the search against.  - {@code spaceKey} Key of the space to search against. Optional. - {@code contentId} ID of the content to search against. Optional. Must be in the space specified by {@code spaceKey}. - {@code contentStatuses} Content statuses to search against. Optional.  Specify these values in an object. For example, {@code cqlcontext={%22spaceKey%22:%22TEST%22, %22contentId%22:%22123%22}}
     * @param cursor               Pointer to a set of search results, returned as part of the {@code next} or {@code prev} URL from the previous search call.
     * @param next                 
     * @param prev                 
     * @param limit                The maximum number of content objects to return per page. Note, this may be restricted by fixed system limits.
     * @param start                The start point of the collection to return
     * @param includeArchivedSpaces Whether to include content from archived spaces in the results.
     * @param excludeCurrentSpaces Whether to exclude current spaces and only show archived spaces.
     * @param excerpt              The excerpt strategy to apply to the result
     * @param sitePermissionTypeFilter Filters users by permission type. Use {@code none} to default to licensed users, {@code externalCollaborator} for external/guest users, and {@code all} to include all permission types.
     * @param _u                   
     * @param expand               
     */
    @ApiStatus.Internal
    public SearchByCQLOperationSpec(String cql, String cqlcontext, String cursor, Boolean next, Boolean prev, Integer limit, Integer start, Boolean includeArchivedSpaces, Boolean excludeCurrentSpaces, String excerpt, String sitePermissionTypeFilter, Long _u, List<String> expand) {
        this.cql = cql;
        this.cqlcontext = cqlcontext;
        this.cursor = cursor;
        this.next = next;
        this.prev = prev;
        this.limit = limit;
        this.start = start;
        this.includeArchivedSpaces = includeArchivedSpaces;
        this.excludeCurrentSpaces = excludeCurrentSpaces;
        this.excerpt = excerpt;
        this.sitePermissionTypeFilter = sitePermissionTypeFilter;
        this._u = _u;
        this.expand = expand;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(cql, "cql is a required parameter!");
    }
}
