package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
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
 * GetAllLabelContentSpec
 * <p>
 * Specification for the GetAllLabelContent operation.
 * <p>
 * Get label information
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAllLabelContentOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Name of the label to query.
     */
    @NotNull 
    private String name;

    /**
     * The type of contents that are to be returned.
     */
    @Nullable 
    private String type;

    /**
     * The starting offset for the results.
     */
    @Nullable 
    private Integer start;

    /**
     * The number of results to be returned.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetAllLabelContentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAllLabelContentOperationSpec(Consumer<GetAllLabelContentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetAllLabelContentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param name                 Name of the label to query.
     * @param type                 The type of contents that are to be returned.
     * @param start                The starting offset for the results.
     * @param limit                The number of results to be returned.
     */
    @ApiStatus.Internal
    public GetAllLabelContentOperationSpec(String name, String type, Integer start, Integer limit) {
        this.name = name;
        this.type = type;
        this.start = start;
        this.limit = limit;

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
