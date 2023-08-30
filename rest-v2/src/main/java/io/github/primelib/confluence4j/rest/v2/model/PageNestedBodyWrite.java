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
 * PageNestedBodyWrite
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
@JsonTypeName("PageNestedBodyWrite")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PageNestedBodyWrite {

    @JsonProperty("storage")
    protected PageBodyWrite storage;

    @JsonProperty("atlas_doc_format")
    protected PageBodyWrite atlasDocFormat;

    @JsonProperty("wiki")
    protected PageBodyWrite wiki;

    /**
     * Constructs a validated instance of {@link PageNestedBodyWrite}.
     *
     * @param spec the specification to process
     */
    public PageNestedBodyWrite(Consumer<PageNestedBodyWrite> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PageNestedBodyWrite}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PageNestedBodyWrite(Consumer)} instead.
     * @param storage storage
     * @param atlasDocFormat atlasDocFormat
     * @param wiki wiki
     */
    @ApiStatus.Internal
    public PageNestedBodyWrite(PageBodyWrite storage, PageBodyWrite atlasDocFormat, PageBodyWrite wiki) {
        this.storage = storage;
        this.atlasDocFormat = atlasDocFormat;
        this.wiki = wiki;
    }

}
