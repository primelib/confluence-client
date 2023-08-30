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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebResourceDependenciesUris
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
    "all",
    "css",
    "js",
    "_expandable"
})
@JsonTypeName("WebResourceDependencies_uris")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebResourceDependenciesUris {

    @JsonProperty("all")
    protected SuperBatchWebResourcesUrisAll all;

    @JsonProperty("css")
    protected SuperBatchWebResourcesUrisAll css;

    @JsonProperty("js")
    protected SuperBatchWebResourcesUrisAll js;

    @JsonProperty("_expandable")
    protected WebResourceDependenciesUrisExpandable _expandable;

    /**
     * Constructs a validated instance of {@link WebResourceDependenciesUris}.
     *
     * @param spec the specification to process
     */
    public WebResourceDependenciesUris(Consumer<WebResourceDependenciesUris> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebResourceDependenciesUris}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebResourceDependenciesUris(Consumer)} instead.
     * @param all all
     * @param css css
     * @param js js
     * @param _expandable _expandable
     */
    @ApiStatus.Internal
    public WebResourceDependenciesUris(SuperBatchWebResourcesUrisAll all, SuperBatchWebResourcesUrisAll css, SuperBatchWebResourcesUrisAll js, WebResourceDependenciesUrisExpandable _expandable) {
        this.all = all;
        this.css = css;
        this.js = js;
        this._expandable = _expandable;
    }

}
