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
    "version",
    "_links",
    "_expandable"
})
@JsonTypeName("ContentProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentProperty {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("key")
    protected String key;

    @JsonProperty("value")
    protected ContentPropertyValue value;

    @JsonProperty("version")
    protected ContentPropertyVersion version;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    @JsonProperty("_expandable")
    protected ContentPropertyExpandable _expandable;

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
     * @param id id
     * @param key key
     * @param value value
     * @param version version
     * @param _links _links
     * @param _expandable _expandable
     */
    @ApiStatus.Internal
    public ContentProperty(String id, String key, ContentPropertyValue value, ContentPropertyVersion version, Map<String, String> _links, ContentPropertyExpandable _expandable) {
        this.id = id;
        this.key = key;
        this.value = value;
        this.version = version;
        this._links = _links;
        this._expandable = _expandable;
    }

}
