package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.ContentRestriction;
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
 * RemoveGroupFromContentRestrictionByIdSpec
 * <p>
 * Specification for the RemoveGroupFromContentRestrictionById operation.
 * <p>
 * Remove group from content restriction
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveGroupFromContentRestrictionByIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content that the restriction applies to.
     */
    @NotNull 
    private String id;

    /**
     * The operation that the restriction applies to.
     */
    @NotNull 
    private String operationKey;

    /**
     * The name of the group to remove from the content restriction.
     */
    @NotNull 
    private String groupName;

    /**
     * Constructs a validated instance of {@link RemoveGroupFromContentRestrictionByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveGroupFromContentRestrictionByIdOperationSpec(Consumer<RemoveGroupFromContentRestrictionByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link RemoveGroupFromContentRestrictionByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content that the restriction applies to.
     * @param operationKey         The operation that the restriction applies to.
     * @param groupName            The name of the group to remove from the content restriction.
     */
    @ApiStatus.Internal
    public RemoveGroupFromContentRestrictionByIdOperationSpec(String id, String operationKey, String groupName) {
        this.id = id;
        this.operationKey = operationKey;
        this.groupName = groupName;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(operationKey, "operationKey is a required parameter!");
        Objects.requireNonNull(groupName, "groupName is a required parameter!");
    }
}
