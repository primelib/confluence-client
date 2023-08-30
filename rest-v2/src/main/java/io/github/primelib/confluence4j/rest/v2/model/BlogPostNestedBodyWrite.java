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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BlogPostNestedBodyWrite
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
    "storage",
    "atlas_doc_format",
    "wiki"
})
@JsonTypeName("BlogPostNestedBodyWrite")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BlogPostNestedBodyWrite {

    @JsonProperty("storage")
    protected BlogPostBodyWrite storage;

    @JsonProperty("atlas_doc_format")
    protected BlogPostBodyWrite atlasDocFormat;

    @JsonProperty("wiki")
    protected BlogPostBodyWrite wiki;

    /**
     * Constructs a validated instance of {@link BlogPostNestedBodyWrite}.
     *
     * @param spec the specification to process
     */
    public BlogPostNestedBodyWrite(Consumer<BlogPostNestedBodyWrite> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BlogPostNestedBodyWrite}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BlogPostNestedBodyWrite(Consumer)} instead.
     * @param storage storage
     * @param atlasDocFormat atlasDocFormat
     * @param wiki wiki
     */
    @ApiStatus.Internal
    public BlogPostNestedBodyWrite(BlogPostBodyWrite storage, BlogPostBodyWrite atlasDocFormat, BlogPostBodyWrite wiki) {
        this.storage = storage;
        this.atlasDocFormat = atlasDocFormat;
        this.wiki = wiki;
    }

}
