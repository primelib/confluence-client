package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Group;
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
 * GetGroupMembershipsForUserSpec
 * <p>
 * Specification for the GetGroupMembershipsForUser operation.
 * <p>
 * Get group memberships for user
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetGroupMembershipsForUserOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.
     */
    @NotNull 
    private String accountId;

    /**
     * The starting index of the returned groups.
     */
    @Nullable 
    private Integer start;

    /**
     * The maximum number of groups to return per page. Note, this may be restricted by fixed system limits.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetGroupMembershipsForUserOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetGroupMembershipsForUserOperationSpec(Consumer<GetGroupMembershipsForUserOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetGroupMembershipsForUserOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.
     * @param start                The starting index of the returned groups.
     * @param limit                The maximum number of groups to return per page. Note, this may be restricted by fixed system limits.
     */
    @ApiStatus.Internal
    public GetGroupMembershipsForUserOperationSpec(String accountId, Integer start, Integer limit) {
        this.accountId = accountId;
        this.start = start;
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
