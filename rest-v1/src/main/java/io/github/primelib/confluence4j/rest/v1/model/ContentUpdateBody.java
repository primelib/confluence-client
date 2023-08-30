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
 * ContentUpdateBody
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
@JsonTypeName("ContentUpdate_body")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentUpdateBody {

    @JsonProperty("view")
    protected ContentBodyCreate view;

    @JsonProperty("export_view")
    protected ContentBodyCreate exportView;

    @JsonProperty("styled_view")
    protected ContentBodyCreate styledView;

    @JsonProperty("storage")
    protected ContentBodyCreateStorage storage;

    @JsonProperty("editor")
    protected ContentBodyCreate editor;

    @JsonProperty("editor2")
    protected ContentBodyCreate editor2;

    @JsonProperty("wiki")
    protected ContentBodyCreate wiki;

    @JsonProperty("atlas_doc_format")
    protected ContentBodyCreate atlasDocFormat;

    @JsonProperty("anonymous_export_view")
    protected ContentBodyCreate anonymousExportView;

    /**
     * Constructs a validated instance of {@link ContentUpdateBody}.
     *
     * @param spec the specification to process
     */
    public ContentUpdateBody(Consumer<ContentUpdateBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentUpdateBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentUpdateBody(Consumer)} instead.
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
    public ContentUpdateBody(ContentBodyCreate view, ContentBodyCreate exportView, ContentBodyCreate styledView, ContentBodyCreateStorage storage, ContentBodyCreate editor, ContentBodyCreate editor2, ContentBodyCreate wiki, ContentBodyCreate atlasDocFormat, ContentBodyCreate anonymousExportView) {
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
