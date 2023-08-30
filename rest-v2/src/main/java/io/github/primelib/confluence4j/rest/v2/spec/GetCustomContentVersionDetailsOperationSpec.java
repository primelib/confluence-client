package io.github.primelib.confluence4j.rest.v2.spec;

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
 * GetCustomContentVersionDetailsSpec
 * <p>
 * Specification for the GetCustomContentVersionDetails operation.
 * <p>
 * Get version details for custom content version
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetCustomContentVersionDetailsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the custom content for which version details should be returned.
     */
    @NotNull 
    private Long customContentId;

    /**
     * The version number of the custom content to be returned.
     */
    @NotNull 
    private Long versionNumber;

    /**
     * Constructs a validated instance of {@link GetCustomContentVersionDetailsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetCustomContentVersionDetailsOperationSpec(Consumer<GetCustomContentVersionDetailsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetCustomContentVersionDetailsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param customContentId      The ID of the custom content for which version details should be returned.
     * @param versionNumber        The version number of the custom content to be returned.
     */
    @ApiStatus.Internal
    public GetCustomContentVersionDetailsOperationSpec(Long customContentId, Long versionNumber) {
        this.customContentId = customContentId;
        this.versionNumber = versionNumber;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(customContentId, "customContentId is a required parameter!");
        Objects.requireNonNull(versionNumber, "versionNumber is a required parameter!");
    }
}
