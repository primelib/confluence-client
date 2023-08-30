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
 * DeleteBlogpostPropertyByIdSpec
 * <p>
 * Specification for the DeleteBlogpostPropertyById operation.
 * <p>
 * Delete content property for blogpost by id
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteBlogpostPropertyByIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the blog post the property belongs to.
     */
    @NotNull 
    private Long blogpostId;

    /**
     * The ID of the property to be deleted.
     */
    @NotNull 
    private Long propertyId;

    /**
     * Constructs a validated instance of {@link DeleteBlogpostPropertyByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteBlogpostPropertyByIdOperationSpec(Consumer<DeleteBlogpostPropertyByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteBlogpostPropertyByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param blogpostId           The ID of the blog post the property belongs to.
     * @param propertyId           The ID of the property to be deleted.
     */
    @ApiStatus.Internal
    public DeleteBlogpostPropertyByIdOperationSpec(Long blogpostId, Long propertyId) {
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
