package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Space;
import io.github.primelib.confluence4j.rest.v1.model.SpaceProperty;
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
 * GetSpacePropertySpec
 * <p>
 * Specification for the GetSpaceProperty operation.
 * <p>
 * Get space property
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetSpacePropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the space that the property is in.
     */
    @NotNull 
    private String spaceKey;

    /**
     * The key of the space property.
     */
    @NotNull 
    private String key;

    /**
     * A multi-value parameter indicating which properties of the space property to expand. By default, the {@code version} object is expanded.
     * - {@code version} returns information about the version of the content. - {@code space} returns the space that the properties are in.
     */
    @Nullable 
    private List<String> expand;

    /**
     * Constructs a validated instance of {@link GetSpacePropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetSpacePropertyOperationSpec(Consumer<GetSpacePropertyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetSpacePropertyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceKey             The key of the space that the property is in.
     * @param key                  The key of the space property.
     * @param expand               A multi-value parameter indicating which properties of the space property to expand. By default, the {@code version} object is expanded.  - {@code version} returns information about the version of the content. - {@code space} returns the space that the properties are in.
     */
    @ApiStatus.Internal
    public GetSpacePropertyOperationSpec(String spaceKey, String key, List<String> expand) {
        this.spaceKey = spaceKey;
        this.key = key;
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
        Objects.requireNonNull(spaceKey, "spaceKey is a required parameter!");
        Objects.requireNonNull(key, "key is a required parameter!");
    }
}
