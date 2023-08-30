package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
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
 * DeleteContentVersionSpec
 * <p>
 * Specification for the DeleteContentVersion operation.
 * <p>
 * Delete content version
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteContentVersionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content that the version will be deleted from.
     */
    @NotNull 
    private String id;

    /**
     * The number of the version to be deleted. The version number starts from 1 up to current version.
     */
    @NotNull 
    private Integer versionNumber;

    /**
     * Constructs a validated instance of {@link DeleteContentVersionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteContentVersionOperationSpec(Consumer<DeleteContentVersionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteContentVersionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content that the version will be deleted from.
     * @param versionNumber        The number of the version to be deleted. The version number starts from 1 up to current version.
     */
    @ApiStatus.Internal
    public DeleteContentVersionOperationSpec(String id, Integer versionNumber) {
        this.id = id;
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(versionNumber, "versionNumber is a required parameter!");
    }
}
