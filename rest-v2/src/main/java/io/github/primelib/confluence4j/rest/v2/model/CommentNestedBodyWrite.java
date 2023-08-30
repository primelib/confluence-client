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
 * CommentNestedBodyWrite
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
@JsonTypeName("CommentNestedBodyWrite")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CommentNestedBodyWrite {

    @JsonProperty("storage")
    protected CommentBodyWrite storage;

    @JsonProperty("atlas_doc_format")
    protected CommentBodyWrite atlasDocFormat;

    @JsonProperty("wiki")
    protected CommentBodyWrite wiki;

    /**
     * Constructs a validated instance of {@link CommentNestedBodyWrite}.
     *
     * @param spec the specification to process
     */
    public CommentNestedBodyWrite(Consumer<CommentNestedBodyWrite> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CommentNestedBodyWrite}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CommentNestedBodyWrite(Consumer)} instead.
     * @param storage storage
     * @param atlasDocFormat atlasDocFormat
     * @param wiki wiki
     */
    @ApiStatus.Internal
    public CommentNestedBodyWrite(CommentBodyWrite storage, CommentBodyWrite atlasDocFormat, CommentBodyWrite wiki) {
        this.storage = storage;
        this.atlasDocFormat = atlasDocFormat;
        this.wiki = wiki;
    }

}
