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
 * SuperBatchWebResourcesTags
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
    "js"
})
@JsonTypeName("SuperBatchWebResources_tags")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SuperBatchWebResourcesTags {

    @JsonProperty("all")
    protected String all;

    @JsonProperty("css")
    protected String css;

    @JsonProperty("data")
    protected String data;

    @JsonProperty("js")
    protected String js;

    /**
     * Constructs a validated instance of {@link SuperBatchWebResourcesTags}.
     *
     * @param spec the specification to process
     */
    public SuperBatchWebResourcesTags(Consumer<SuperBatchWebResourcesTags> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SuperBatchWebResourcesTags}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SuperBatchWebResourcesTags(Consumer)} instead.
     * @param all all
     * @param css css
     * @param data data
     * @param js js
     */
    @ApiStatus.Internal
    public SuperBatchWebResourcesTags(String all, String css, String data, String js) {
        this.all = all;
        this.css = css;
        this.data = data;
        this.js = js;
    }

}
