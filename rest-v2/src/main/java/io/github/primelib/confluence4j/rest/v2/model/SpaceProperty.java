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
 * SpaceProperty
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
    "id",
    "key",
    "value",
    "createdAt",
    "createdBy",
    "version"
})
@JsonTypeName("SpaceProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpaceProperty {

    /**
     * ID of the space property.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Key of the space property.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * Value of the space property.
     */
    @JsonProperty("value")
    protected Object value;

    /**
     * RFC3339 compliant date time at which the property was created.
     */
    @JsonProperty("createdAt")
    protected OffsetDateTime createdAt;

    /**
     * Atlassian account ID of the user that created the space property.
     */
    @JsonProperty("createdBy")
    protected String createdBy;

    @JsonProperty("version")
    protected SpacePropertyVersion version;

    /**
     * Constructs a validated instance of {@link SpaceProperty}.
     *
     * @param spec the specification to process
     */
    public SpaceProperty(Consumer<SpaceProperty> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpaceProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpaceProperty(Consumer)} instead.
     * @param id ID of the space property.
     * @param key Key of the space property.
     * @param value Value of the space property.
     * @param createdAt RFC3339 compliant date time at which the property was created.
     * @param createdBy Atlassian account ID of the user that created the space property.
     * @param version version
     */
    @ApiStatus.Internal
    public SpaceProperty(String id, String key, Object value, OffsetDateTime createdAt, String createdBy, SpacePropertyVersion version) {
        this.id = id;
        this.key = key;
        this.value = value;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.version = version;
    }

}
