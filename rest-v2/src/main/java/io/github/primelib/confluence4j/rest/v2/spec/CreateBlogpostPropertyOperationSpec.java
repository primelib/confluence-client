package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.ContentProperty;
import io.github.primelib.confluence4j.rest.v2.model.ContentPropertyCreateRequest;
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
 * CreateBlogpostPropertySpec
 * <p>
 * Specification for the CreateBlogpostProperty operation.
 * <p>
 * Create content property for blog post
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateBlogpostPropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the blog post to create a property for.
     */
    @NotNull 
    private Long blogpostId;

    /**
     * The content property to be created
     */
    @NotNull 
    private ContentPropertyCreateRequest contentPropertyCreateRequest;

    /**
     * Constructs a validated instance of {@link CreateBlogpostPropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateBlogpostPropertyOperationSpec(Consumer<CreateBlogpostPropertyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateBlogpostPropertyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param blogpostId           The ID of the blog post to create a property for.
     * @param contentPropertyCreateRequest The content property to be created
     */
    @ApiStatus.Internal
    public CreateBlogpostPropertyOperationSpec(Long blogpostId, ContentPropertyCreateRequest contentPropertyCreateRequest) {
        this.blogpostId = blogpostId;
        this.contentPropertyCreateRequest = contentPropertyCreateRequest;

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
        Objects.requireNonNull(contentPropertyCreateRequest, "contentPropertyCreateRequest is a required parameter!");
    }
}
