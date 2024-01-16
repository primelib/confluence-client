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
 * SpacePropertyCreate
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
    "value",
    "space"
})
@JsonTypeName("SpacePropertyCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePropertyCreate {

    /**
     * The key of the new property.
     */
    @JsonProperty("key")
    protected String key;

    @JsonProperty("value")
    protected PropertyValue value;

    @JsonProperty("space")
    protected SpacePropertyCreateSpace space;

    /**
     * Constructs a validated instance of {@link SpacePropertyCreate}.
     *
     * @param spec the specification to process
     */
    public SpacePropertyCreate(Consumer<SpacePropertyCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePropertyCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePropertyCreate(Consumer)} instead.
     * @param key The key of the new property.
     * @param value value
     * @param space space
     */
    @ApiStatus.Internal
    public SpacePropertyCreate(String key, PropertyValue value, SpacePropertyCreateSpace space) {
        this.key = key;
        this.value = value;
        this.space = space;
    }

}
