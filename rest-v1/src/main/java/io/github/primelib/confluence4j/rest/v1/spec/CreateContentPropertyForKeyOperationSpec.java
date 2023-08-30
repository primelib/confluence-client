package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.ContentProperty;
import io.github.primelib.confluence4j.rest.v1.model.ContentPropertyCreate;
import io.github.primelib.confluence4j.rest.v1.model.ContentPropertyCreateNoKey;
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
 * CreateContentPropertyForKeySpec
 * <p>
 * Specification for the CreateContentPropertyForKey operation.
 * <p>
 * Create content property for key
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateContentPropertyForKeyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content to add the property to.
     */
    @NotNull 
    private String id;

    /**
     * The key of the content property. Required.
     */
    @NotNull 
    private String key;

    /**
     * The content property to be created.
     */
    @NotNull 
    private ContentPropertyCreateNoKey body;

    /**
     * Constructs a validated instance of {@link CreateContentPropertyForKeyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateContentPropertyForKeyOperationSpec(Consumer<CreateContentPropertyForKeyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateContentPropertyForKeyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content to add the property to.
     * @param key                  The key of the content property. Required.
     * @param body                 The content property to be created.
     */
    @ApiStatus.Internal
    public CreateContentPropertyForKeyOperationSpec(String id, String key, ContentPropertyCreateNoKey body) {
        this.id = id;
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(key, "key is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}
