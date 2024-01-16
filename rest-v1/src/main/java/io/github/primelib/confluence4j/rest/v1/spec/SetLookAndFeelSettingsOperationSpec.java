package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
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
 * SetLookAndFeelSettingsSpec
 * <p>
 * Specification for the SetLookAndFeelSettings operation.
 * <p>
 * Set look and feel settings
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetLookAndFeelSettingsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The look and feel type to be set.
     */
    @NotNull 
    private String body;

    /**
     * The key of the space for which the look and feel settings will be set. If this is not set, the global look and feel settings will be set.
     */
    @Nullable 
    private String spaceKey;

    /**
     * Constructs a validated instance of {@link SetLookAndFeelSettingsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetLookAndFeelSettingsOperationSpec(Consumer<SetLookAndFeelSettingsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetLookAndFeelSettingsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param body                 The look and feel type to be set.
     * @param spaceKey             The key of the space for which the look and feel settings will be set. If this is not set, the global look and feel settings will be set.
     */
    @ApiStatus.Internal
    public SetLookAndFeelSettingsOperationSpec(String body, String spaceKey) {
        this.body = body;
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
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}
