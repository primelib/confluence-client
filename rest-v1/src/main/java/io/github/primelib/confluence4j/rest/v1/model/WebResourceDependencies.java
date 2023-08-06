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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebResourceDependencies
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
    "_expandable",
    "keys",
    "contexts",
    "uris",
    "tags",
    "superbatch"
})
@JsonTypeName("WebResourceDependencies")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebResourceDependencies {

    @JsonProperty("_expandable")
    protected WebResourceDependenciesExpandable _expandable;

    @JsonProperty("keys")
    protected List<String> keys;

    @JsonProperty("contexts")
    protected List<String> contexts;

    @JsonProperty("uris")
    protected WebResourceDependenciesUris uris;

    @JsonProperty("tags")
    protected WebResourceDependenciesTags tags;

    @JsonProperty("superbatch")
    protected SuperBatchWebResources superbatch;

    /**
     * Constructs a validated instance of {@link WebResourceDependencies}.
     *
     * @param spec the specification to process
     */
    public WebResourceDependencies(Consumer<WebResourceDependencies> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebResourceDependencies}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebResourceDependencies(Consumer)} instead.
     * @param _expandable _expandable
     * @param keys keys
     * @param contexts contexts
     * @param uris uris
     * @param tags tags
     * @param superbatch superbatch
     */
    @ApiStatus.Internal
    public WebResourceDependencies(WebResourceDependenciesExpandable _expandable, List<String> keys, List<String> contexts, WebResourceDependenciesUris uris, WebResourceDependenciesTags tags, SuperBatchWebResources superbatch) {
        this._expandable = _expandable;
        this.keys = keys;
        this.contexts = contexts;
        this.uris = uris;
        this.tags = tags;
        this.superbatch = superbatch;
    }

}
