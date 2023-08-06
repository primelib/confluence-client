package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
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
 * GetCurrentUserSpec
 * <p>
 * Specification for the GetCurrentUser operation.
 * <p>
 * Get current user
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetCurrentUserOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

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
     * Constructs a validated instance of {@link GetCurrentUserOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetCurrentUserOperationSpec(Consumer<GetCurrentUserOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetCurrentUserOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param expand               A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.   - {@code personalSpace} returns the user's personal space, if it exists.   - {@code isExternalCollaborator} returns whether the user is an external collaborator user.
     */
    @ApiStatus.Internal
    public GetCurrentUserOperationSpec(List<String> expand) {
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
    }
}
