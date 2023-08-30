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
 * ContentTemplateBody
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
    "atlas_doc_format",
    "anonymous_export_view"
})
@JsonTypeName("ContentTemplateBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentTemplateBody {

    @JsonProperty("view")
    protected ContentBody view;

    @JsonProperty("export_view")
    protected ContentBody exportView;

    @JsonProperty("styled_view")
    protected ContentBody styledView;

    @JsonProperty("storage")
    protected ContentBody storage;

    @JsonProperty("editor")
    protected ContentBody editor;

    @JsonProperty("editor2")
    protected ContentBody editor2;

    @JsonProperty("wiki")
    protected ContentBody wiki;

    @JsonProperty("atlas_doc_format")
    protected ContentBody atlasDocFormat;

    @JsonProperty("anonymous_export_view")
    protected ContentBody anonymousExportView;

    /**
     * Constructs a validated instance of {@link ContentTemplateBody}.
     *
     * @param spec the specification to process
     */
    public ContentTemplateBody(Consumer<ContentTemplateBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentTemplateBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentTemplateBody(Consumer)} instead.
     * @param view view
     * @param exportView exportView
     * @param styledView styledView
     * @param storage storage
     * @param editor editor
     * @param editor2 editor2
     * @param wiki wiki
     * @param atlasDocFormat atlasDocFormat
     * @param anonymousExportView anonymousExportView
     */
    @ApiStatus.Internal
    public ContentTemplateBody(ContentBody view, ContentBody exportView, ContentBody styledView, ContentBody storage, ContentBody editor, ContentBody editor2, ContentBody wiki, ContentBody atlasDocFormat, ContentBody anonymousExportView) {
        this.view = view;
        this.exportView = exportView;
        this.styledView = styledView;
        this.storage = storage;
        this.editor = editor;
        this.editor2 = editor2;
        this.wiki = wiki;
        this.atlasDocFormat = atlasDocFormat;
        this.anonymousExportView = anonymousExportView;
    }

}
