package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BlogPostSortOrder
 * 
 *
 */
@JsonTypeName("BlogPostSortOrder")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum BlogPostSortOrder {
    ID("id"),
    _ID("-id"),
    CREATED_DATE("created-date"),
    _CREATED_DATE("-created-date"),
    MODIFIED_DATE("modified-date"),
    _MODIFIED_DATE("-modified-date");

    private final String value;
}
