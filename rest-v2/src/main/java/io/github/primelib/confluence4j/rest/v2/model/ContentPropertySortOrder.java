package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ContentPropertySortOrder
 * 
 *
 */
@JsonTypeName("ContentPropertySortOrder")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum ContentPropertySortOrder {
    KEY("key"),
    _KEY("-key");

    private final String value;
}
