package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ChildPageSortOrder
 * 
 *
 */
@JsonTypeName("ChildPageSortOrder")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum ChildPageSortOrder {
    CREATED_DATE("created-date"),
    _CREATED_DATE("-created-date"),
    ID("id"),
    _ID("-id"),
    CHILD_POSITION("child-position"),
    _CHILD_POSITION("-child-position"),
    MODIFIED_DATE("modified-date"),
    _MODIFIED_DATE("-modified-date");

    private final String value;
}
