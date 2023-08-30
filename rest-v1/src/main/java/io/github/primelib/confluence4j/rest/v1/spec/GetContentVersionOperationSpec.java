package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.Version;
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
 * GetContentVersionSpec
 * <p>
 * Specification for the GetContentVersion operation.
 * <p>
 * Get content version
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetContentVersionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content to be queried for its version.
     */
    @NotNull 
    private String id;

    /**
     * The number of the version to be retrieved.
     */
    @NotNull 
    private Integer versionNumber;

    /**
     * A multi-value parameter indicating which properties of the content to expand. By default, the {@code content} object is expanded.
     * - {@code collaborators} returns the users that collaborated on the version. - {@code content} returns the content for the version.
     */
    @Nullable 
    private List<String> expand;

    /**
     * Constructs a validated instance of {@link GetContentVersionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetContentVersionOperationSpec(Consumer<GetContentVersionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetContentVersionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content to be queried for its version.
     * @param versionNumber        The number of the version to be retrieved.
     * @param expand               A multi-value parameter indicating which properties of the content to expand. By default, the {@code content} object is expanded.  - {@code collaborators} returns the users that collaborated on the version. - {@code content} returns the content for the version.
     */
    @ApiStatus.Internal
    public GetContentVersionOperationSpec(String id, Integer versionNumber, List<String> expand) {
        this.id = id;
        this.versionNumber = versionNumber;
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(versionNumber, "versionNumber is a required parameter!");
    }
}
