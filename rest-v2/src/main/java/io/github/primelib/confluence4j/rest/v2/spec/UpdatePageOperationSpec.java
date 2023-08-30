package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.UpdatePageRequest;
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
 * UpdatePageSpec
 * <p>
 * Specification for the UpdatePage operation.
 * <p>
 * Update page
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdatePageOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the page to be updated. If you don't know the page ID, use Get Pages and filter the results.
     */
    @NotNull 
    private Long id;

    /**
     */
    @NotNull 
    private UpdatePageRequest updatePageRequest;

    /**
     * Constructs a validated instance of {@link UpdatePageOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdatePageOperationSpec(Consumer<UpdatePageOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdatePageOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the page to be updated. If you don't know the page ID, use Get Pages and filter the results.
     * @param updatePageRequest    
     */
    @ApiStatus.Internal
    public UpdatePageOperationSpec(Long id, UpdatePageRequest updatePageRequest) {
        this.id = id;
        this.updatePageRequest = updatePageRequest;

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
        Objects.requireNonNull(updatePageRequest, "updatePageRequest is a required parameter!");
    }
}
