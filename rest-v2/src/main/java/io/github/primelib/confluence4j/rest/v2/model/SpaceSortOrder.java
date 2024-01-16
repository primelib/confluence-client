package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SpaceSortOrder
 * 
 *
 */
@JsonTypeName("SpaceSortOrder")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum SpaceSortOrder {
    ID("id"),
    _ID("-id"),
    KEY("key"),
    _KEY("-key"),
    NAME("name"),
    _NAME("-name");

    private final String value;
}
