package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Space;
import io.github.primelib.confluence4j.rest.v1.model.User;
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
 * SearchUserSpec
 * <p>
 * Specification for the SearchUser operation.
 * <p>
 * Search users
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchUserOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The CQL query to be used for the search. See [Advanced Searching using CQL](https://developer.atlassian.com/cloud/confluence/advanced-searching-using-cql/) for instructions on how to build a CQL query.
     * Example queries:
     * 
     * 
     * 
     * 
     *  cql=type=user will return all users
     * 
     * 
     * 
     * 
     *  cql=user="1234" will return user with accountId "1234"
     * 
     * 
     * 
     * 
     *  You can also use IN, NOT IN, != operators
     * 
     * 
     * 
     * 
     *  cql=user IN ("12", "34") will return users with accountids "12" and "34"
     * 
     * 
     * 
     * 
     *  cql=user.fullname~jo will return users with nickname/full name starting with "jo"
     * 
     * 
     * 
     * 
     *  cql=user.accountid="123" will return user with accountId "123"
     */
    @NotNull 
    private String cql;

    /**
     * The starting index of the returned users.
     */
    @Nullable 
    private Integer start;

    /**
     * The maximum number of user objects to return per page. Note, this may be restricted by fixed system limits.
     */
    @Nullable 
    private Integer limit;

    /**
     * A multi-value parameter indicating which properties of the user to expand.
     * - {@code operations} returns the operations for the user, which are used when setting permissions. - {@code personalSpace} returns the personal space of the user.
     */
    @Nullable 
    private List<String> expand;

    /**
     * Filters users by permission type. Use {@code none} to default to licensed users, {@code externalCollaborator} for external/guest users, and {@code all} to include all permission types.
     */
    @Nullable 
    private String sitePermissionTypeFilter;

    /**
     * Constructs a validated instance of {@link SearchUserOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchUserOperationSpec(Consumer<SearchUserOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SearchUserOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param cql                  The CQL query to be used for the search. See [Advanced Searching using CQL](https://developer.atlassian.com/cloud/confluence/advanced-searching-using-cql/) for instructions on how to build a CQL query.  Example queries:           cql=type=user will return all users           cql=user="1234" will return user with accountId "1234"           You can also use IN, NOT IN, != operators           cql=user IN ("12", "34") will return users with accountids "12" and "34"           cql=user.fullname~jo will return users with nickname/full name starting with "jo"           cql=user.accountid="123" will return user with accountId "123"
     * @param start                The starting index of the returned users.
     * @param limit                The maximum number of user objects to return per page. Note, this may be restricted by fixed system limits.
     * @param expand               A multi-value parameter indicating which properties of the user to expand.  - {@code operations} returns the operations for the user, which are used when setting permissions. - {@code personalSpace} returns the personal space of the user.
     * @param sitePermissionTypeFilter Filters users by permission type. Use {@code none} to default to licensed users, {@code externalCollaborator} for external/guest users, and {@code all} to include all permission types.
     */
    @ApiStatus.Internal
    public SearchUserOperationSpec(String cql, Integer start, Integer limit, List<String> expand, String sitePermissionTypeFilter) {
        this.cql = cql;
        this.start = start;
        this.limit = limit;
        this.expand = expand;
        this.sitePermissionTypeFilter = sitePermissionTypeFilter;

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
