package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomContentSortOrder
 * 
 *
 */
@JsonTypeName("CustomContentSortOrder")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum CustomContentSortOrder {
    ID("id"),
    _ID("-id"),
    CREATED_DATE("created-date"),
    _CREATED_DATE("-created-date"),
    MODIFIED_DATE("modified-date"),
    _MODIFIED_DATE("-modified-date"),
    TITLE("title"),
    _TITLE("-title");

    private final String value;
}
