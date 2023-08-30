package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InlineCommentResolutionStatus
 * 
 *
 */
@JsonTypeName("InlineCommentResolutionStatus")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum InlineCommentResolutionStatus {
    OPEN("open"),
    REOPENED("reopened"),
    RESOLVED("resolved"),
    DANGLING("dangling");

    private final String value;
}
