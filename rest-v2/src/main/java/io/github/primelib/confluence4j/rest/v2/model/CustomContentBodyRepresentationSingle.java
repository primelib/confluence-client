package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomContentBodyRepresentationSingle
 * 
 *
 */
@JsonTypeName("CustomContentBodyRepresentationSingle")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum CustomContentBodyRepresentationSingle {
    RAW("raw"),
    STORAGE("storage"),
    ATLAS_DOC_FORMAT("atlas_doc_format"),
    VIEW("view"),
    EXPORT_VIEW("export_view"),
    ANONYMOUS_EXPORT_VIEW("anonymous_export_view");

    private final String value;
}
