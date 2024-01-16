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
 * ContentPropertyCreate
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
    "key",
    "value"
})
@JsonTypeName("ContentPropertyCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentPropertyCreate {

    /**
     * The key of the new property.
     */
    @JsonProperty("key")
    protected String key;

    @JsonProperty("value")
    protected ContentPropertyValue value;

    /**
     * Constructs a validated instance of {@link ContentPropertyCreate}.
     *
     * @param spec the specification to process
     */
    public ContentPropertyCreate(Consumer<ContentPropertyCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentPropertyCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentPropertyCreate(Consumer)} instead.
     * @param key The key of the new property.
     * @param value value
     */
    @ApiStatus.Internal
    public ContentPropertyCreate(String key, ContentPropertyValue value) {
        this.key = key;
        this.value = value;
    }

}
