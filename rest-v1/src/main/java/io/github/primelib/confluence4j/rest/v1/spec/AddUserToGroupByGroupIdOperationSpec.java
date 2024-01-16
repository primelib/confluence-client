package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.AccountId;
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
 * AddUserToGroupByGroupIdSpec
 * <p>
 * Specification for the AddUserToGroupByGroupId operation.
 * <p>
 * Add member to group by groupId
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddUserToGroupByGroupIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * GroupId of the group whose membership is updated
     */
    @NotNull 
    private String groupId;

    /**
     * AccountId of the user who needs to be added as member.
     */
    @NotNull 
    private AccountId body;

    /**
     * Constructs a validated instance of {@link AddUserToGroupByGroupIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddUserToGroupByGroupIdOperationSpec(Consumer<AddUserToGroupByGroupIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AddUserToGroupByGroupIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param groupId              GroupId of the group whose membership is updated
     * @param body                 AccountId of the user who needs to be added as member.
     */
    @ApiStatus.Internal
    public AddUserToGroupByGroupIdOperationSpec(String groupId, AccountId body) {
        this.groupId = groupId;
        this.body = body;

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
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}
