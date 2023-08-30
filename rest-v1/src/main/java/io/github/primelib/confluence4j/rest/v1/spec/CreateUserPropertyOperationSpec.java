package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.User;
import io.github.primelib.confluence4j.rest.v1.model.UserProperty;
import io.github.primelib.confluence4j.rest.v1.model.UserPropertyCreate;
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
 * CreateUserPropertySpec
 * <p>
 * Specification for the CreateUserProperty operation.
 * <p>
 * Create user property by key
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUserPropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192
     */
    @NotNull 
    private String userId;

    /**
     * The key of the user property.
     */
    @NotNull 
    private String key;

    /**
     * The user property to be created.
     */
    @NotNull 
    private UserPropertyCreate body;

    /**
     * Constructs a validated instance of {@link CreateUserPropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateUserPropertyOperationSpec(Consumer<CreateUserPropertyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateUserPropertyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param userId               The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192
     * @param key                  The key of the user property.
     * @param body                 The user property to be created.
     */
    @ApiStatus.Internal
    public CreateUserPropertyOperationSpec(String userId, String key, UserPropertyCreate body) {
        this.userId = userId;
        this.key = key;
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
        Objects.requireNonNull(userId, "userId is a required parameter!");
        Objects.requireNonNull(key, "key is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}
