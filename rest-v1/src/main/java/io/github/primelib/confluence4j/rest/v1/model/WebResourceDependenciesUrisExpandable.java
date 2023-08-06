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
 * WebResourceDependenciesUrisExpandable
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
    "css",
    "js"
})
@JsonTypeName("WebResourceDependencies_uris__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebResourceDependenciesUrisExpandable {

    @JsonProperty("css")
    protected SuperBatchWebResourcesUrisAll css;

    @JsonProperty("js")
    protected SuperBatchWebResourcesUrisAll js;

    /**
     * Constructs a validated instance of {@link WebResourceDependenciesUrisExpandable}.
     *
     * @param spec the specification to process
     */
    public WebResourceDependenciesUrisExpandable(Consumer<WebResourceDependenciesUrisExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebResourceDependenciesUrisExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebResourceDependenciesUrisExpandable(Consumer)} instead.
     * @param css css
     * @param js js
     */
    @ApiStatus.Internal
    public WebResourceDependenciesUrisExpandable(SuperBatchWebResourcesUrisAll css, SuperBatchWebResourcesUrisAll js) {
        this.css = css;
        this.js = js;
    }

}
