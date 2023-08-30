package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Group;
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
 * GetGroupMembersByGroupIdSpec
 * <p>
 * Specification for the GetGroupMembersByGroupId operation.
 * <p>
 * Get group members
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetGroupMembersByGroupIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The id of the group to be queried for its members.
     */
    @NotNull 
    private String groupId;

    /**
     * The starting index of the returned users.
     */
    @Nullable 
    private Integer start;

    /**
     * The maximum number of users to return per page. Note, this may be restricted by fixed system limits.
     */
    @Nullable 
    private Integer limit;

    /**
     * Whether to include total size parameter in the results. Note, fetching total size property is an expensive operation; use it if your use case needs this value.
     */
    @Nullable 
    private Boolean shouldReturnTotalSize;

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
     * Constructs a validated instance of {@link GetGroupMembersByGroupIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetGroupMembersByGroupIdOperationSpec(Consumer<GetGroupMembersByGroupIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetGroupMembersByGroupIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param groupId              The id of the group to be queried for its members.
     * @param start                The starting index of the returned users.
     * @param limit                The maximum number of users to return per page. Note, this may be restricted by fixed system limits.
     * @param shouldReturnTotalSize Whether to include total size parameter in the results. Note, fetching total size property is an expensive operation; use it if your use case needs this value.
     * @param expand               A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.   - {@code personalSpace} returns the user's personal space, if it exists.   - {@code isExternalCollaborator} returns whether the user is an external collaborator user.
     */
    @ApiStatus.Internal
    public GetGroupMembersByGroupIdOperationSpec(String groupId, Integer start, Integer limit, Boolean shouldReturnTotalSize, List<String> expand) {
        this.groupId = groupId;
        this.start = start;
        this.limit = limit;
        this.shouldReturnTotalSize = shouldReturnTotalSize;
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
        Objects.requireNonNull(groupId, "groupId is a required parameter!");
    }
}
