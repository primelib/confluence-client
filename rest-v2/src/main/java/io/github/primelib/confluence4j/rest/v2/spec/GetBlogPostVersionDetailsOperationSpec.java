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
 * GetBlogPostVersionDetailsSpec
 * <p>
 * Specification for the GetBlogPostVersionDetails operation.
 * <p>
 * Get version details for blog post version
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBlogPostVersionDetailsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the blog post for which version details should be returned.
     */
    @NotNull 
    private Long blogpostId;

    /**
     * The version number of the blog post to be returned.
     */
    @NotNull 
    private Long versionNumber;

    /**
     * Constructs a validated instance of {@link GetBlogPostVersionDetailsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetBlogPostVersionDetailsOperationSpec(Consumer<GetBlogPostVersionDetailsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetBlogPostVersionDetailsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param blogpostId           The ID of the blog post for which version details should be returned.
     * @param versionNumber        The version number of the blog post to be returned.
     */
    @ApiStatus.Internal
    public GetBlogPostVersionDetailsOperationSpec(Long blogpostId, Long versionNumber) {
        this.blogpostId = blogpostId;
        this.versionNumber = versionNumber;

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
        Objects.requireNonNull(versionNumber, "versionNumber is a required parameter!");
    }
}
