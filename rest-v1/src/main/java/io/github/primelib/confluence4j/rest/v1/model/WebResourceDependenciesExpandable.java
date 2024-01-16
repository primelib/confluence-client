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
 * WebResourceDependenciesExpandable
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
    "uris"
})
@JsonTypeName("WebResourceDependencies__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebResourceDependenciesExpandable {

    @JsonProperty("uris")
    protected MessageArgsInner uris;

    /**
     * Constructs a validated instance of {@link WebResourceDependenciesExpandable}.
     *
     * @param spec the specification to process
     */
    public WebResourceDependenciesExpandable(Consumer<WebResourceDependenciesExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebResourceDependenciesExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebResourceDependenciesExpandable(Consumer)} instead.
     * @param uris uris
     */
    @ApiStatus.Internal
    public WebResourceDependenciesExpandable(MessageArgsInner uris) {
        this.uris = uris;
    }

}
