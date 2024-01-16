package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VersionSortOrder
 * 
 *
 */
@JsonTypeName("VersionSortOrder")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum VersionSortOrder {
    MODIFIED_DATE("modified-date"),
    _MODIFIED_DATE("-modified-date");

    private final String value;
}
