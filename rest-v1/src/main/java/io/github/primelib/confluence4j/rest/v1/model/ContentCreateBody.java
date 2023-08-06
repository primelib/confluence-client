package io.github.primelib.confluence4j.rest.v1.model;

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
 * ContentCreateBody
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
    "view",
    "export_view",
    "styled_view",
    "storage",
    "editor",
    "editor2",
    "wiki",
    "anonymous_export_view",
    "plain",
    "atlas_doc_format",
    "raw"
})
@JsonTypeName("ContentCreate_body")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentCreateBody {

    @JsonProperty("view")
    protected ContentBodyCreate view;

    @JsonProperty("export_view")
    protected ContentBodyCreate exportView;

    @JsonProperty("styled_view")
    protected ContentBodyCreate styledView;

    @JsonProperty("storage")
    protected ContentBodyCreate storage;

    @JsonProperty("editor")
    protected ContentBodyCreate editor;

    @JsonProperty("editor2")
    protected ContentBodyCreate editor2;

    @JsonProperty("wiki")
    protected ContentBodyCreate wiki;

    @JsonProperty("anonymous_export_view")
    protected ContentBodyCreate anonymousExportView;

    @JsonProperty("plain")
    protected ContentBodyCreate plain;

    @JsonProperty("atlas_doc_format")
    protected ContentBodyCreate atlasDocFormat;

    @JsonProperty("raw")
    protected ContentBodyCreate raw;

    /**
     * Constructs a validated instance of {@link ContentCreateBody}.
     *
     * @param spec the specification to process
     */
    public ContentCreateBody(Consumer<ContentCreateBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentCreateBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentCreateBody(Consumer)} instead.
     * @param view view
     * @param exportView exportView
     * @param styledView styledView
     * @param storage storage
     * @param editor editor
     * @param editor2 editor2
     * @param wiki wiki
     * @param anonymousExportView anonymousExportView
     * @param plain plain
     * @param atlasDocFormat atlasDocFormat
     * @param raw raw
     */
    @ApiStatus.Internal
    public ContentCreateBody(ContentBodyCreate view, ContentBodyCreate exportView, ContentBodyCreate styledView, ContentBodyCreate storage, ContentBodyCreate editor, ContentBodyCreate editor2, ContentBodyCreate wiki, ContentBodyCreate anonymousExportView, ContentBodyCreate plain, ContentBodyCreate atlasDocFormat, ContentBodyCreate raw) {
        this.view = view;
        this.exportView = exportView;
        this.styledView = styledView;
        this.storage = storage;
        this.editor = editor;
        this.editor2 = editor2;
        this.wiki = wiki;
        this.anonymousExportView = anonymousExportView;
        this.plain = plain;
        this.atlasDocFormat = atlasDocFormat;
        this.raw = raw;
    }

}
