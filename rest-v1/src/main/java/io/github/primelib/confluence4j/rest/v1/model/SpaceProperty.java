package io.github.primelib.confluence4j.rest.v1.model;

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

import java.util.Map;
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
    "version",
    "space",
    "_links",
    "_expandable"
})
@JsonTypeName("SpaceProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpaceProperty {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("key")
    protected String key;

    @JsonProperty("value")
    protected SpacePropertyValue value;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("space")
    protected Space space;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    @JsonProperty("_expandable")
    protected SpacePropertyExpandable _expandable;

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
     * @param id id
     * @param key key
     * @param value value
     * @param version version
     * @param space space
     * @param _links _links
     * @param _expandable _expandable
     */
    @ApiStatus.Internal
    public SpaceProperty(String id, String key, SpacePropertyValue value, Version version, Space space, Map<String, String> _links, SpacePropertyExpandable _expandable) {
        this.id = id;
        this.key = key;
        this.value = value;
        this.version = version;
        this.space = space;
        this._links = _links;
        this._expandable = _expandable;
    }

}
