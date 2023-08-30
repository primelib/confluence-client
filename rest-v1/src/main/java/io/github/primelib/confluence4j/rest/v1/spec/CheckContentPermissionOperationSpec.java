package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.ContentPermissionRequest;
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
 * CheckContentPermissionSpec
 * <p>
 * Specification for the CheckContentPermission operation.
 * <p>
 * Check content permissions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CheckContentPermissionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content to check permissions against.
     */
    @NotNull 
    private String id;

    /**
     * The content permission request.
     */
    @NotNull 
    private ContentPermissionRequest body;

    /**
     * Constructs a validated instance of {@link CheckContentPermissionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CheckContentPermissionOperationSpec(Consumer<CheckContentPermissionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CheckContentPermissionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content to check permissions against.
     * @param body                 The content permission request.
     */
    @ApiStatus.Internal
    public CheckContentPermissionOperationSpec(String id, ContentPermissionRequest body) {
        this.id = id;
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}
