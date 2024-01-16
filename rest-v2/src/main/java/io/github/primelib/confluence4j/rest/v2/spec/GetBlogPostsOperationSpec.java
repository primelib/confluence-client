package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.BlogPostSortOrder;
import io.github.primelib.confluence4j.rest.v2.model.PrimaryBodyRepresentation;
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
 * GetBlogPostsSpec
 * <p>
 * Specification for the GetBlogPosts operation.
 * <p>
 * Get blog posts
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBlogPostsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Filter the results based on blog post ids. Multiple blog post ids can be specified as a comma-separated list.
     */
    @Nullable 
    private List<Long> id;

    /**
     * Filter the results based on space ids. Multiple space ids can be specified as a comma-separated list.
     */
    @Nullable 
    private List<Long> spaceId;

    /**
     * Used to sort the result by a particular field.
     */
    @Nullable 
    private BlogPostSortOrder sort;

    /**
     * Filter the results to blog posts based on their status. By default, {@code current} is used.
     */
    @Nullable 
    private List<String> status;

    /**
     * Filter the results to blog posts based on their title.
     */
    @Nullable 
    private String title;

    /**
     * The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     */
    @Nullable 
    private PrimaryBodyRepresentation bodyFormat;

    /**
     * Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     */
    @Nullable 
    private String cursor;

    /**
     * Maximum number of blog posts per result to return. If more results exist, use the {@code Link} response header to retrieve a relative URL that will return the next set of results.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetBlogPostsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetBlogPostsOperationSpec(Consumer<GetBlogPostsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetBlogPostsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   Filter the results based on blog post ids. Multiple blog post ids can be specified as a comma-separated list.
     * @param spaceId              Filter the results based on space ids. Multiple space ids can be specified as a comma-separated list.
     * @param sort                 Used to sort the result by a particular field.
     * @param status               Filter the results to blog posts based on their status. By default, {@code current} is used.
     * @param title                Filter the results to blog posts based on their title.
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     * @param limit                Maximum number of blog posts per result to return. If more results exist, use the {@code Link} response header to retrieve a relative URL that will return the next set of results.
     */
    @ApiStatus.Internal
    public GetBlogPostsOperationSpec(List<Long> id, List<Long> spaceId, BlogPostSortOrder sort, List<String> status, String title, PrimaryBodyRepresentation bodyFormat, String cursor, Integer limit) {
        this.id = id;
        this.spaceId = spaceId;
        this.sort = sort;
        this.status = status;
        this.title = title;
        this.bodyFormat = bodyFormat;
        this.cursor = cursor;
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
    }
}
