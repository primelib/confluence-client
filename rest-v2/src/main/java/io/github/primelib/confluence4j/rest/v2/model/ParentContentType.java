package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ParentContentType
 * 
 *
 */
@JsonTypeName("ParentContentType")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum ParentContentType {
    PAGE("page"),
    WHITEBOARD("whiteboard");

    private final String value;
}
