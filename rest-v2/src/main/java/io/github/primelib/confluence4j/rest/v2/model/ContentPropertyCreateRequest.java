package io.github.primelib.confluence4j.rest.v2.model;

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
 * ContentPropertyCreateRequest
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
@JsonTypeName("ContentPropertyCreateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentPropertyCreateRequest {

    /**
     * Key of the content property
     */
    @JsonProperty("key")
    protected String key;

    /**
     * Value of the content property.
     */
    @JsonProperty("value")
    protected Object value;

    /**
     * Constructs a validated instance of {@link ContentPropertyCreateRequest}.
     *
     * @param spec the specification to process
     */
    public ContentPropertyCreateRequest(Consumer<ContentPropertyCreateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentPropertyCreateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentPropertyCreateRequest(Consumer)} instead.
     * @param key Key of the content property
     * @param value Value of the content property.
     */
    @ApiStatus.Internal
    public ContentPropertyCreateRequest(String key, Object value) {
        this.key = key;
        this.value = value;
    }

}
