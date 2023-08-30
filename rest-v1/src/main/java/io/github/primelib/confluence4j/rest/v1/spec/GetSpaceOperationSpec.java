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
 * GetSpaceSpec
 * <p>
 * Specification for the GetSpace operation.
 * <p>
 * Get space
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetSpaceOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the space to be returned.
     */
    @NotNull 
    private String spaceKey;

    /**
     * A multi-value parameter indicating which properties of the spaces to expand, where:
     * 
     * - {@code settings} returns the settings for the space, similar to [Get space settings](#api-space-spaceKey-settings-get).
     *  - {@code metadata} returns the space metadata.
     *  - {@code metadata.labels} returns the space labels, which are used to categorize the space.
     *  - {@code operations} returns the operations for a space, which are used when setting permissions.
     *  - {@code lookAndFeel} returns information about the look and feel of the space, including the color scheme.
     *  - {@code permissions} returns the permissions for the space. Note that this may return permissions for deleted groups,
     *  because deleting a group doesn't remove associated space permissions.
     *  - {@code icon} returns information about space icon.
     *  - {@code description} returns the description of the space.
     *  - {@code description.plain} returns the description of the space, the plain format.
     *  - {@code description.view} returns the description of the space, the view format.
     *  - {@code theme} returns information about the space theme.
     *  - {@code homepage} returns information about the space homepage.
     *  - {@code history} returns information about the history of the space.
     */
    @Nullable 
    private List<String> expand;

    /**
     * Constructs a validated instance of {@link GetSpaceOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetSpaceOperationSpec(Consumer<GetSpaceOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetSpaceOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceKey             The key of the space to be returned.
     * @param expand               A multi-value parameter indicating which properties of the spaces to expand, where:    - {@code settings} returns the settings for the space, similar to [Get space settings](#api-space-spaceKey-settings-get).   - {@code metadata} returns the space metadata.   - {@code metadata.labels} returns the space labels, which are used to categorize the space.   - {@code operations} returns the operations for a space, which are used when setting permissions.   - {@code lookAndFeel} returns information about the look and feel of the space, including the color scheme.   - {@code permissions} returns the permissions for the space. Note that this may return permissions for deleted groups,   because deleting a group doesn't remove associated space permissions.   - {@code icon} returns information about space icon.   - {@code description} returns the description of the space.   - {@code description.plain} returns the description of the space, the plain format.   - {@code description.view} returns the description of the space, the view format.   - {@code theme} returns information about the space theme.   - {@code homepage} returns information about the space homepage.   - {@code history} returns information about the history of the space.
     */
    @ApiStatus.Internal
    public GetSpaceOperationSpec(String spaceKey, List<String> expand) {
        this.spaceKey = spaceKey;
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
    }
}
