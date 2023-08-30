package io.github.primelib.confluence4j.rest.v1.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * LabeledContentType
 * 
 *
 */
@JsonTypeName("LabeledContentType")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum LabeledContentType {
    PAGE("page"),
    BLOGPOST("blogpost"),
    ATTACHMENT("attachment"),
    PAGE_TEMPLATE("page_template");

    private final String value;
}
