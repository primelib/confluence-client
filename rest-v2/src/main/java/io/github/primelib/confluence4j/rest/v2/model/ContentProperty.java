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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentProperty
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
    "version"
})
@JsonTypeName("ContentProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentProperty {

    /**
     * ID of the property
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Key of the property
     */
    @JsonProperty("key")
    protected String key;

    /**
     * Value of the property. Must be a valid JSON value.
     */
    @JsonProperty("value")
    protected Object value;

    @JsonProperty("version")
    protected Version version;

    /**
     * Constructs a validated instance of {@link ContentProperty}.
     *
     * @param spec the specification to process
     */
    public ContentProperty(Consumer<ContentProperty> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentProperty(Consumer)} instead.
     * @param id ID of the property
     * @param key Key of the property
     * @param value Value of the property. Must be a valid JSON value.
     * @param version version
     */
    @ApiStatus.Internal
    public ContentProperty(String id, String key, Object value, Version version) {
        this.id = id;
        this.key = key;
        this.value = value;
        this.version = version;
    }

}
