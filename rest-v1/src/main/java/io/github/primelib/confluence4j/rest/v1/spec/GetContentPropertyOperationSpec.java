package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.ContentProperty;
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
 * GetContentPropertySpec
 * <p>
 * Specification for the GetContentProperty operation.
 * <p>
 * Get content property
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetContentPropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content to be queried for the property.
     */
    @NotNull 
    private String id;

    /**
     * The key of the content property.
     */
    @NotNull 
    private String key;

    /**
     * A multi-value parameter indicating which properties of the content to expand. By default, the {@code version} object is expanded.
     * - {@code content} returns the content that the property is stored against. - {@code version} returns information about the version of the property, such as the version number, when it was created, etc.
     */
    @Nullable 
    private List<String> expand;

    /**
     * Filter the results to a set of content based on their status. If set to {@code any}, content with any status is returned. By default it will fetch current and archived statuses {@code ?status=current&amp;status=archived}. All supported statuses
     * - any - archived - current - deleted - draft - trashed
     */
    @Nullable 
    private List<String> status;

    /**
     * Constructs a validated instance of {@link GetContentPropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetContentPropertyOperationSpec(Consumer<GetContentPropertyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetContentPropertyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content to be queried for the property.
     * @param key                  The key of the content property.
     * @param expand               A multi-value parameter indicating which properties of the content to expand. By default, the {@code version} object is expanded.  - {@code content} returns the content that the property is stored against. - {@code version} returns information about the version of the property, such as the version number, when it was created, etc.
     * @param status               Filter the results to a set of content based on their status. If set to {@code any}, content with any status is returned. By default it will fetch current and archived statuses {@code ?status=current&amp;status=archived}. All supported statuses  - any - archived - current - deleted - draft - trashed
     */
    @ApiStatus.Internal
    public GetContentPropertyOperationSpec(String id, String key, List<String> expand, List<String> status) {
        this.id = id;
        this.key = key;
        this.expand = expand;
        this.status = status;

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
        Objects.requireNonNull(key, "key is a required parameter!");
    }
}
