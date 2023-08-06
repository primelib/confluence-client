package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.CopyPageHierarchyRequest;
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
 * CopyPageHierarchySpec
 * <p>
 * Specification for the CopyPageHierarchy operation.
 * <p>
 * Copy page hierarchy
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CopyPageHierarchyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private String id;

    /**
     * Request object from json post body
     */
    @NotNull 
    private CopyPageHierarchyRequest request;

    /**
     * Constructs a validated instance of {@link CopyPageHierarchyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CopyPageHierarchyOperationSpec(Consumer<CopyPageHierarchyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CopyPageHierarchyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   
     * @param request              Request object from json post body
     */
    @ApiStatus.Internal
    public CopyPageHierarchyOperationSpec(String id, CopyPageHierarchyRequest request) {
        this.id = id;
        this.request = request;

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
        Objects.requireNonNull(request, "request is a required parameter!");
    }
}
