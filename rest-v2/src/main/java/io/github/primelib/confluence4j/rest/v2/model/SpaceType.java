package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SpaceType
 * 
 *
 */
@JsonTypeName("SpaceType")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum SpaceType {
    GLOBAL("global"),
    PERSONAL("personal");

    private final String value;
}
