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
 * SuperBatchWebResources
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
    "uris",
    "tags",
    "metatags",
    "_expandable"
})
@JsonTypeName("SuperBatchWebResources")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SuperBatchWebResources {

    @JsonProperty("uris")
    protected SuperBatchWebResourcesUris uris;

    @JsonProperty("tags")
    protected SuperBatchWebResourcesTags tags;

    @JsonProperty("metatags")
    protected String metatags;

    @JsonProperty("_expandable")
    protected Map<String, Object> _expandable;

    /**
     * Constructs a validated instance of {@link SuperBatchWebResources}.
     *
     * @param spec the specification to process
     */
    public SuperBatchWebResources(Consumer<SuperBatchWebResources> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SuperBatchWebResources}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SuperBatchWebResources(Consumer)} instead.
     * @param uris uris
     * @param tags tags
     * @param metatags metatags
     * @param _expandable _expandable
     */
    @ApiStatus.Internal
    public SuperBatchWebResources(SuperBatchWebResourcesUris uris, SuperBatchWebResourcesTags tags, String metatags, Map<String, Object> _expandable) {
        this.uris = uris;
        this.tags = tags;
        this.metatags = metatags;
        this._expandable = _expandable;
    }

}
