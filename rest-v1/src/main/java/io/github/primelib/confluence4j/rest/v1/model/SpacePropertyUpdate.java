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
 * SpacePropertyUpdate
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
    "version",
    "space"
})
@JsonTypeName("SpacePropertyUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePropertyUpdate {

    @JsonProperty("key")
    protected String key;

    @JsonProperty("value")
    protected SpacePropertyValue value;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("space")
    protected SpacePropertyCreateSpace space;

    /**
     * Constructs a validated instance of {@link SpacePropertyUpdate}.
     *
     * @param spec the specification to process
     */
    public SpacePropertyUpdate(Consumer<SpacePropertyUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePropertyUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePropertyUpdate(Consumer)} instead.
     * @param key key
     * @param value value
     * @param version version
     * @param space space
     */
    @ApiStatus.Internal
    public SpacePropertyUpdate(String key, SpacePropertyValue value, Version version, SpacePropertyCreateSpace space) {
        this.key = key;
        this.value = value;
        this.version = version;
        this.space = space;
    }

}
