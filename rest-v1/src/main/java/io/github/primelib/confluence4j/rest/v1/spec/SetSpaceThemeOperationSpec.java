package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Space;
import io.github.primelib.confluence4j.rest.v1.model.Theme;
import io.github.primelib.confluence4j.rest.v1.model.ThemeUpdate;
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
 * SetSpaceThemeSpec
 * <p>
 * Specification for the SetSpaceTheme operation.
 * <p>
 * Set space theme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetSpaceThemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the space to set the theme for.
     */
    @NotNull 
    private String spaceKey;

    /**
     */
    @NotNull 
    private ThemeUpdate body;

    /**
     * Constructs a validated instance of {@link SetSpaceThemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetSpaceThemeOperationSpec(Consumer<SetSpaceThemeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetSpaceThemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceKey             The key of the space to set the theme for.
     * @param body                 
     */
    @ApiStatus.Internal
    public SetSpaceThemeOperationSpec(String spaceKey, ThemeUpdate body) {
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
