package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SpaceDescriptionBodyRepresentation
 * 
 *
 */
@JsonTypeName("SpaceDescriptionBodyRepresentation")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum SpaceDescriptionBodyRepresentation {
    PLAIN("plain"),
    VIEW("view");

    private final String value;
}
