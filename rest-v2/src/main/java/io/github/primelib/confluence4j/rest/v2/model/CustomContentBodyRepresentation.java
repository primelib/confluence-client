package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomContentBodyRepresentation
 * 
 *
 */
@JsonTypeName("CustomContentBodyRepresentation")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum CustomContentBodyRepresentation {
    RAW("raw"),
    STORAGE("storage"),
    ATLAS_DOC_FORMAT("atlas_doc_format");

    private final String value;
}
