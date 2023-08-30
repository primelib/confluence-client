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
 * WebResourceDependenciesTags
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
    "data",
    "js",
    "_expandable"
})
@JsonTypeName("WebResourceDependencies_tags")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebResourceDependenciesTags {

    @JsonProperty("all")
    protected String all;

    @JsonProperty("css")
    protected String css;

    @JsonProperty("data")
    protected String data;

    @JsonProperty("js")
    protected String js;

    @JsonProperty("_expandable")
    protected Map<String, Object> _expandable;

    /**
     * Constructs a validated instance of {@link WebResourceDependenciesTags}.
     *
     * @param spec the specification to process
     */
    public WebResourceDependenciesTags(Consumer<WebResourceDependenciesTags> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebResourceDependenciesTags}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebResourceDependenciesTags(Consumer)} instead.
     * @param all all
     * @param css css
     * @param data data
     * @param js js
     * @param _expandable _expandable
     */
    @ApiStatus.Internal
    public WebResourceDependenciesTags(String all, String css, String data, String js, Map<String, Object> _expandable) {
        this.all = all;
        this.css = css;
        this.data = data;
        this.js = js;
        this._expandable = _expandable;
    }

}
