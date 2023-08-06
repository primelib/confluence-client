package io.github.primelib.confluence4j.rest.v1.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.ArchivePagesRequest;
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
 * ArchivePagesSpec
 * <p>
 * Specification for the ArchivePages operation.
 * <p>
 * Archive pages
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ArchivePagesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The pages to be archived.
     */
    @Nullable 
    private ArchivePagesRequest archivePagesRequest;

    /**
     * Constructs a validated instance of {@link ArchivePagesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ArchivePagesOperationSpec(Consumer<ArchivePagesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ArchivePagesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param archivePagesRequest  The pages to be archived.
     */
    @ApiStatus.Internal
    public ArchivePagesOperationSpec(ArchivePagesRequest archivePagesRequest) {
        this.archivePagesRequest = archivePagesRequest;

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
