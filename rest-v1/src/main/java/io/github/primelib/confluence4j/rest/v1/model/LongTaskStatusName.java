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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LongTaskStatusName
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
    "args"
})
@JsonTypeName("LongTaskStatus_name")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LongTaskStatusName {

    @JsonProperty("key")
    protected String key;

    @JsonProperty("args")
    protected List<Object> args;

    /**
     * Constructs a validated instance of {@link LongTaskStatusName}.
     *
     * @param spec the specification to process
     */
    public LongTaskStatusName(Consumer<LongTaskStatusName> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LongTaskStatusName}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LongTaskStatusName(Consumer)} instead.
     * @param key key
     * @param args args
     */
    @ApiStatus.Internal
    public LongTaskStatusName(String key, List<Object> args) {
        this.key = key;
        this.args = args;
    }

}
