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
 * SpacePropertyCreateRequest
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
@JsonTypeName("SpacePropertyCreateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePropertyCreateRequest {

    /**
     * Key of the space property
     */
    @JsonProperty("key")
    protected String key;

    /**
     * Value of the space property.
     */
    @JsonProperty("value")
    protected Object value;

    /**
     * Constructs a validated instance of {@link SpacePropertyCreateRequest}.
     *
     * @param spec the specification to process
     */
    public SpacePropertyCreateRequest(Consumer<SpacePropertyCreateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePropertyCreateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePropertyCreateRequest(Consumer)} instead.
     * @param key Key of the space property
     * @param value Value of the space property.
     */
    @ApiStatus.Internal
    public SpacePropertyCreateRequest(String key, Object value) {
        this.key = key;
        this.value = value;
    }

}
