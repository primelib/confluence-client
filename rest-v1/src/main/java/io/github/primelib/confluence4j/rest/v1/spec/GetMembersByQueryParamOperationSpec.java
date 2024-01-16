package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

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
 * GetMembersByQueryParamSpec
 * <p>
 * Specification for the GetMembersByQueryParam operation.
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
public class GetMembersByQueryParamOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The name of the group to be queried for its members.
     */
    @NotNull 
    private String name;

    /**
     * The starting index of the returned users.
     */
    @Nullable 
    private Integer start;

    /**
     * The maximum number of users to return per page. Note, this is restricted by fixed system limit of 200 which is to say if the limit parameter exceeds 200, this API will return a maximum of 200 users per page.
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
     * Constructs a validated instance of {@link GetMembersByQueryParamOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetMembersByQueryParamOperationSpec(Consumer<GetMembersByQueryParamOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetMembersByQueryParamOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param name                 The name of the group to be queried for its members.
     * @param start                The starting index of the returned users.
     * @param limit                The maximum number of users to return per page. Note, this is restricted by fixed system limit of 200 which is to say if the limit parameter exceeds 200, this API will return a maximum of 200 users per page.
     * @param shouldReturnTotalSize Whether to include total size parameter in the results. Note, fetching total size property is an expensive operation; use it if your use case needs this value.
     * @param expand               A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.   - {@code personalSpace} returns the user's personal space, if it exists.   - {@code isExternalCollaborator} returns whether the user is an external collaborator user.
     */
    @ApiStatus.Internal
    public GetMembersByQueryParamOperationSpec(String name, Integer start, Integer limit, Boolean shouldReturnTotalSize, List<String> expand) {
        this.name = name;
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
        Objects.requireNonNull(name, "name is a required parameter!");
    }
}
