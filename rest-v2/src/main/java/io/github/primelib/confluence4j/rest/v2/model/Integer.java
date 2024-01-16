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
 * Integer
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
    "count"
})
@JsonTypeName("Integer")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Integer {

    /**
     * The count number
     */
    @JsonProperty("count")
    protected Long count;

    /**
     * Constructs a validated instance of {@link Integer}.
     *
     * @param spec the specification to process
     */
    public Integer(Consumer<Integer> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Integer}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Integer(Consumer)} instead.
     * @param count The count number
     */
    @ApiStatus.Internal
    public Integer(Long count) {
        this.count = count;
    }

}
