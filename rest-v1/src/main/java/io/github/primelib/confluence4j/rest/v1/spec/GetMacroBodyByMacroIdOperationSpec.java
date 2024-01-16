package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

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
 * GetMacroBodyByMacroIdSpec
 * <p>
 * Specification for the GetMacroBodyByMacroId operation.
 * <p>
 * Get macro body by macro ID
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetMacroBodyByMacroIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID for the content that contains the macro.
     */
    @NotNull 
    private String id;

    /**
     * The version of the content that contains the macro. Specifying {@code 0} as the {@code version} will return the macro body for the latest content version.
     */
    @NotNull 
    private Integer version;

    /**
     * The ID of the macro. This is usually passed by the app that the macro is in. Otherwise, find the macro ID by querying the desired content and version, then expanding the body in storage format. For example, '/content/196611/version/7?expand=content.body.storage'.
     */
    @NotNull 
    private String macroId;

    /**
     * Constructs a validated instance of {@link GetMacroBodyByMacroIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetMacroBodyByMacroIdOperationSpec(Consumer<GetMacroBodyByMacroIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetMacroBodyByMacroIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID for the content that contains the macro.
     * @param version              The version of the content that contains the macro. Specifying {@code 0} as the {@code version} will return the macro body for the latest content version.
     * @param macroId              The ID of the macro. This is usually passed by the app that the macro is in. Otherwise, find the macro ID by querying the desired content and version, then expanding the body in storage format. For example, '/content/196611/version/7?expand=content.body.storage'.
     */
    @ApiStatus.Internal
    public GetMacroBodyByMacroIdOperationSpec(String id, Integer version, String macroId) {
        this.id = id;
        this.version = version;
        this.macroId = macroId;

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
        Objects.requireNonNull(version, "version is a required parameter!");
        Objects.requireNonNull(macroId, "macroId is a required parameter!");
    }
}
