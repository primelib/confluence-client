package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
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
 * GetContentPropertiesSpec
 * <p>
 * Specification for the GetContentProperties operation.
 * <p>
 * Get content properties
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetContentPropertiesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content to be queried for its properties.
     */
    @NotNull 
    private String id;

    /**
     * The key of the content property.
     */
    @Nullable 
    private List<String> key;

    /**
     * A multi-value parameter indicating which properties of the content to expand. By default, the {@code version} object is expanded.
     * - {@code content} returns the content that the property is stored against. - {@code version} returns information about the version of the property, such as the version number, when it was created, etc.
     */
    @Nullable 
    private List<String> expand;

    /**
     * The starting index of the returned properties.
     */
    @Nullable 
    private Integer start;

    /**
     * The maximum number of properties to return per page. Note, this may be restricted by fixed system limits.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetContentPropertiesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetContentPropertiesOperationSpec(Consumer<GetContentPropertiesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetContentPropertiesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content to be queried for its properties.
     * @param key                  The key of the content property.
     * @param expand               A multi-value parameter indicating which properties of the content to expand. By default, the {@code version} object is expanded.  - {@code content} returns the content that the property is stored against. - {@code version} returns information about the version of the property, such as the version number, when it was created, etc.
     * @param start                The starting index of the returned properties.
     * @param limit                The maximum number of properties to return per page. Note, this may be restricted by fixed system limits.
     */
    @ApiStatus.Internal
    public GetContentPropertiesOperationSpec(String id, List<String> key, List<String> expand, Integer start, Integer limit) {
        this.id = id;
        this.key = key;
        this.expand = expand;
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
        Objects.requireNonNull(id, "id is a required parameter!");
    }
}
