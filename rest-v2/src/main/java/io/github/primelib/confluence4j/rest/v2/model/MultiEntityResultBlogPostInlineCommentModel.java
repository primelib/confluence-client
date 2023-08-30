package io.github.primelib.confluence4j.rest.v2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MultiEntityResultBlogPostInlineCommentModel
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "results",
    "_links"
})
@JsonTypeName("MultiEntityResult_BlogPostInlineCommentModel_")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MultiEntityResultBlogPostInlineCommentModel {

    @JsonProperty("results")
    protected List<BlogPostInlineCommentModel> results;

    @JsonProperty("_links")
    protected MultiEntityResultAttachmentLinks _links;

    /**
     * Constructs a validated instance of {@link MultiEntityResultBlogPostInlineCommentModel}.
     *
     * @param spec the specification to process
     */
    public MultiEntityResultBlogPostInlineCommentModel(Consumer<MultiEntityResultBlogPostInlineCommentModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MultiEntityResultBlogPostInlineCommentModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MultiEntityResultBlogPostInlineCommentModel(Consumer)} instead.
     * @param results results
     * @param _links _links
     */
    @ApiStatus.Internal
    public MultiEntityResultBlogPostInlineCommentModel(List<BlogPostInlineCommentModel> results, MultiEntityResultAttachmentLinks _links) {
        this.results = results;
        this._links = _links;
    }

}
