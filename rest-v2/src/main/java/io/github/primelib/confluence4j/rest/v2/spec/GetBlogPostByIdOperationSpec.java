package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.PrimaryBodyRepresentation;
import io.github.primelib.confluence4j.rest.v2.model.PrimaryBodyRepresentationSingle;
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
 * GetBlogPostByIdSpec
 * <p>
 * Specification for the GetBlogPostById operation.
 * <p>
 * Get blog post by id
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBlogPostByIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the blog post to be returned. If you don't know the blog post ID, use Get blog posts and filter the results.
     */
    @NotNull 
    private Long id;

    /**
     * The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     */
    @Nullable 
    private PrimaryBodyRepresentationSingle bodyFormat;

    /**
     * Retrieve the draft version of this blog post.
     */
    @Nullable 
    private Boolean getDraft;

    /**
     * Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details.
     */
    @Nullable 
    private Integer version;

    /**
     * Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @Nullable 
    private Boolean serializeIdsAsStrings;

    /**
     * Constructs a validated instance of {@link GetBlogPostByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetBlogPostByIdOperationSpec(Consumer<GetBlogPostByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetBlogPostByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the blog post to be returned. If you don't know the blog post ID, use Get blog posts and filter the results.
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     * @param getDraft             Retrieve the draft version of this blog post.
     * @param version              Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details.
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @ApiStatus.Internal
    public GetBlogPostByIdOperationSpec(Long id, PrimaryBodyRepresentationSingle bodyFormat, Boolean getDraft, Integer version, Boolean serializeIdsAsStrings) {
        this.id = id;
        this.bodyFormat = bodyFormat;
        this.getDraft = getDraft;
        this.version = version;
        this.serializeIdsAsStrings = serializeIdsAsStrings;

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
