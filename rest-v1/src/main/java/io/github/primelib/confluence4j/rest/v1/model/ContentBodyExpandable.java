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
 * ContentBodyExpandable
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
    "editor",
    "view",
    "export_view",
    "styled_view",
    "storage",
    "editor2",
    "anonymous_export_view",
    "atlas_doc_format",
    "wiki",
    "dynamic",
    "raw"
})
@JsonTypeName("Content_body__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentBodyExpandable {

    @JsonProperty("editor")
    protected String editor;

    @JsonProperty("view")
    protected String view;

    @JsonProperty("export_view")
    protected String exportView;

    @JsonProperty("styled_view")
    protected String styledView;

    @JsonProperty("storage")
    protected String storage;

    @JsonProperty("editor2")
    protected String editor2;

    @JsonProperty("anonymous_export_view")
    protected String anonymousExportView;

    @JsonProperty("atlas_doc_format")
    protected String atlasDocFormat;

    @JsonProperty("wiki")
    protected String wiki;

    @JsonProperty("dynamic")
    protected String dynamic;

    @JsonProperty("raw")
    protected String raw;

    /**
     * Constructs a validated instance of {@link ContentBodyExpandable}.
     *
     * @param spec the specification to process
     */
    public ContentBodyExpandable(Consumer<ContentBodyExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentBodyExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentBodyExpandable(Consumer)} instead.
     * @param editor editor
     * @param view view
     * @param exportView exportView
     * @param styledView styledView
     * @param storage storage
     * @param editor2 editor2
     * @param anonymousExportView anonymousExportView
     * @param atlasDocFormat atlasDocFormat
     * @param wiki wiki
     * @param dynamic dynamic
     * @param raw raw
     */
    @ApiStatus.Internal
    public ContentBodyExpandable(String editor, String view, String exportView, String styledView, String storage, String editor2, String anonymousExportView, String atlasDocFormat, String wiki, String dynamic, String raw) {
        this.editor = editor;
        this.view = view;
        this.exportView = exportView;
        this.styledView = styledView;
        this.storage = storage;
        this.editor2 = editor2;
        this.anonymousExportView = anonymousExportView;
        this.atlasDocFormat = atlasDocFormat;
        this.wiki = wiki;
        this.dynamic = dynamic;
        this.raw = raw;
    }

}
