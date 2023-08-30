package io.github.primelib.confluence4j.rest.v1.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.LookAndFeel;
import io.github.primelib.confluence4j.rest.v1.model.LookAndFeelSettings;
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
 * ResetLookAndFeelSettingsSpec
 * <p>
 * Specification for the ResetLookAndFeelSettings operation.
 * <p>
 * Reset look and feel settings
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResetLookAndFeelSettingsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the space for which the look and feel settings will be reset. If this is not set, the global look and feel settings will be reset.
     */
    @Nullable 
    private String spaceKey;

    /**
     * Constructs a validated instance of {@link ResetLookAndFeelSettingsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ResetLookAndFeelSettingsOperationSpec(Consumer<ResetLookAndFeelSettingsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ResetLookAndFeelSettingsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceKey             The key of the space for which the look and feel settings will be reset. If this is not set, the global look and feel settings will be reset.
     */
    @ApiStatus.Internal
    public ResetLookAndFeelSettingsOperationSpec(String spaceKey) {
        this.spaceKey = spaceKey;

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
