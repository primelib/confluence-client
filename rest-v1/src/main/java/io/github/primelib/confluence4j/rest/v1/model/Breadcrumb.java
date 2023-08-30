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
 * Breadcrumb
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
    "label",
    "url",
    "separator"
})
@JsonTypeName("Breadcrumb")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Breadcrumb {

    @JsonProperty("label")
    protected String label;

    @JsonProperty("url")
    protected String url;

    @JsonProperty("separator")
    protected String separator;

    /**
     * Constructs a validated instance of {@link Breadcrumb}.
     *
     * @param spec the specification to process
     */
    public Breadcrumb(Consumer<Breadcrumb> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Breadcrumb}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Breadcrumb(Consumer)} instead.
     * @param label label
     * @param url url
     * @param separator separator
     */
    @ApiStatus.Internal
    public Breadcrumb(String label, String url, String separator) {
        this.label = label;
        this.url = url;
        this.separator = separator;
    }

}
