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
 * GetSpacePropertiesSpec
 * <p>
 * Specification for the GetSpaceProperties operation.
 * <p>
 * Get space properties
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetSpacePropertiesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the space to be queried for its properties.
     */
    @NotNull 
    private String spaceKey;

    /**
     * A multi-value parameter indicating which properties of the space property to expand. By default, the {@code version} object is expanded.
     * - {@code version} returns information about the version of the content. - {@code space} returns the space that the properties are in.
     */
    @Nullable 
    private List<String> expand;

    /**
     * The starting index of the returned objects.
     */
    @Nullable 
    private Integer start;

    /**
     * The maximum number of properties to return per page. Note, this may be restricted by fixed system limits.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetSpacePropertiesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetSpacePropertiesOperationSpec(Consumer<GetSpacePropertiesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetSpacePropertiesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceKey             The key of the space to be queried for its properties.
     * @param expand               A multi-value parameter indicating which properties of the space property to expand. By default, the {@code version} object is expanded.  - {@code version} returns information about the version of the content. - {@code space} returns the space that the properties are in.
     * @param start                The starting index of the returned objects.
     * @param limit                The maximum number of properties to return per page. Note, this may be restricted by fixed system limits.
     */
    @ApiStatus.Internal
    public GetSpacePropertiesOperationSpec(String spaceKey, List<String> expand, Integer start, Integer limit) {
        this.spaceKey = spaceKey;
        this.expand = expand;
        this.start = start;
        this.limit = limit;

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
    }
}
