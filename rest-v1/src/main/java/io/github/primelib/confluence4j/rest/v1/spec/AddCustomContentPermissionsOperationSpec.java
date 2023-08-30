package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.Space;
import io.github.primelib.confluence4j.rest.v1.model.SpacePermissionCustomContent;
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
 * AddCustomContentPermissionsSpec
 * <p>
 * Specification for the AddCustomContentPermissions operation.
 * <p>
 * Add new custom content permission to space
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddCustomContentPermissionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the space to be queried for its content.
     */
    @NotNull 
    private String spaceKey;

    /**
     * The permissions to be created.
     */
    @NotNull 
    private SpacePermissionCustomContent body;

    /**
     * Constructs a validated instance of {@link AddCustomContentPermissionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddCustomContentPermissionsOperationSpec(Consumer<AddCustomContentPermissionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AddCustomContentPermissionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceKey             The key of the space to be queried for its content.
     * @param body                 The permissions to be created.
     */
    @ApiStatus.Internal
    public AddCustomContentPermissionsOperationSpec(String spaceKey, SpacePermissionCustomContent body) {
        this.spaceKey = spaceKey;
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
        Objects.requireNonNull(spaceKey, "spaceKey is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}
