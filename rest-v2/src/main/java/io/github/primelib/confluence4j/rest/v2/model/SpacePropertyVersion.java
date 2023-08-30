package io.github.primelib.confluence4j.rest.v2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SpacePropertyVersion
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "createdAt",
    "createdBy",
    "message",
    "number"
})
@JsonTypeName("SpaceProperty_version")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePropertyVersion {

    /**
     * RFC3339 compliant date time at which the property's current version was created.
     */
    @JsonProperty("createdAt")
    protected OffsetDateTime createdAt;

    /**
     * Atlassian account ID of the user that created the space property's current version.
     */
    @JsonProperty("createdBy")
    protected String createdBy;

    /**
     * Message associated with the current version.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * The space property's current version number.
     */
    @JsonProperty("number")
    protected Integer number;

    /**
     * Constructs a validated instance of {@link SpacePropertyVersion}.
     *
     * @param spec the specification to process
     */
    public SpacePropertyVersion(Consumer<SpacePropertyVersion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePropertyVersion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePropertyVersion(Consumer)} instead.
     * @param createdAt RFC3339 compliant date time at which the property's current version was created.
     * @param createdBy Atlassian account ID of the user that created the space property's current version.
     * @param message Message associated with the current version.
     * @param number The space property's current version number.
     */
    @ApiStatus.Internal
    public SpacePropertyVersion(OffsetDateTime createdAt, String createdBy, String message, Integer number) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.message = message;
        this.number = number;
    }

}
