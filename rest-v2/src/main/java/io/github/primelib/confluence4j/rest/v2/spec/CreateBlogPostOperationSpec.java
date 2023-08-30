package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.CreateBlogPostRequest;
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
 * CreateBlogPostSpec
 * <p>
 * Specification for the CreateBlogPost operation.
 * <p>
 * Create blog post
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateBlogPostOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private CreateBlogPostRequest createBlogPostRequest;

    /**
     * The blog post will be private. Only the user who creates this blog post will have permission to view and edit one.
     */
    @Nullable 
    private Boolean _private;

    /**
     * Constructs a validated instance of {@link CreateBlogPostOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateBlogPostOperationSpec(Consumer<CreateBlogPostOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateBlogPostOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param createBlogPostRequest 
     * @param _private             The blog post will be private. Only the user who creates this blog post will have permission to view and edit one.
     */
    @ApiStatus.Internal
    public CreateBlogPostOperationSpec(CreateBlogPostRequest createBlogPostRequest, Boolean _private) {
        this.createBlogPostRequest = createBlogPostRequest;
        this._private = _private;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(createBlogPostRequest, "createBlogPostRequest is a required parameter!");
    }
}
