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
 * GetBlogpostContentPropertiesByIdSpec
 * <p>
 * Specification for the GetBlogpostContentPropertiesById operation.
 * <p>
 * Get content property for blog post by id
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBlogpostContentPropertiesByIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the blog post for which content properties should be returned.
     */
    @NotNull 
    private Long blogpostId;

    /**
     * The ID of the property being requested
     */
    @NotNull 
    private Long propertyId;

    /**
     * Constructs a validated instance of {@link GetBlogpostContentPropertiesByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetBlogpostContentPropertiesByIdOperationSpec(Consumer<GetBlogpostContentPropertiesByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetBlogpostContentPropertiesByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param blogpostId           The ID of the blog post for which content properties should be returned.
     * @param propertyId           The ID of the property being requested
     */
    @ApiStatus.Internal
    public GetBlogpostContentPropertiesByIdOperationSpec(Long blogpostId, Long propertyId) {
        this.blogpostId = blogpostId;
        this.propertyId = propertyId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(blogpostId, "blogpostId is a required parameter!");
        Objects.requireNonNull(propertyId, "propertyId is a required parameter!");
    }
}
