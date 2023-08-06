package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Group;
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
 * GetGroupByQueryParamSpec
 * <p>
 * Specification for the GetGroupByQueryParam operation.
 * <p>
 * Get group
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetGroupByQueryParamOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The name of the group. This is the same as the group name shown in the Confluence administration console.
     */
    @NotNull 
    private String name;

    /**
     * Constructs a validated instance of {@link GetGroupByQueryParamOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetGroupByQueryParamOperationSpec(Consumer<GetGroupByQueryParamOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetGroupByQueryParamOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param name                 The name of the group. This is the same as the group name shown in the Confluence administration console.
     */
    @ApiStatus.Internal
    public GetGroupByQueryParamOperationSpec(String name) {
        this.name = name;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(name, "name is a required parameter!");
    }
}
