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
 * GetBulkUserLookupSpec
 * <p>
 * Specification for the GetBulkUserLookup operation.
 * <p>
 * Get multiple users using ids
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBulkUserLookupOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * A list of accountId's of users to be returned.
     */
    @NotNull 
    private String accountId;

    /**
     * A multi-value parameter indicating which properties of the user to expand.
     * 
     * - {@code operations} returns the operations that the user is allowed to do.
     *  - {@code personalSpace} returns the user's personal space, if it exists.
     *  - {@code isExternalCollaborator} returns whether the user is an external collaborator user.
     */
    @Nullable 
    private List<String> expand;

    /**
     * The maximum number of results returned. Currently API returns 200 results max. If more that 200 ids are passed first 200 will be returned.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetBulkUserLookupOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetBulkUserLookupOperationSpec(Consumer<GetBulkUserLookupOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetBulkUserLookupOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param accountId            A list of accountId's of users to be returned.
     * @param expand               A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.   - {@code personalSpace} returns the user's personal space, if it exists.   - {@code isExternalCollaborator} returns whether the user is an external collaborator user.
     * @param limit                The maximum number of results returned. Currently API returns 200 results max. If more that 200 ids are passed first 200 will be returned.
     */
    @ApiStatus.Internal
    public GetBulkUserLookupOperationSpec(String accountId, List<String> expand, Integer limit) {
        this.accountId = accountId;
        this.expand = expand;
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
        Objects.requireNonNull(accountId, "accountId is a required parameter!");
    }
}
