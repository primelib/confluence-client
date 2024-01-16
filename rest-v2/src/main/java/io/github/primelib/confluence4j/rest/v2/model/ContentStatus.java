package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ContentStatus
 * 
 *
 */
@JsonTypeName("ContentStatus")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum ContentStatus {
    CURRENT("current"),
    TRASHED("trashed"),
    HISTORICAL("historical"),
    DELETED("deleted"),
    ANY("any"),
    DRAFT("draft"),
    ARCHIVED("archived");

    private final String value;
}
