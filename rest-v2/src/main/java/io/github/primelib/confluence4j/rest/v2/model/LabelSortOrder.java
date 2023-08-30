package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * LabelSortOrder
 * 
 *
 */
@JsonTypeName("LabelSortOrder")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum LabelSortOrder {
    CREATED_DATE("created-date"),
    _CREATED_DATE("-created-date"),
    ID("id"),
    _ID("-id"),
    NAME("name"),
    _NAME("-name");

    private final String value;
}
