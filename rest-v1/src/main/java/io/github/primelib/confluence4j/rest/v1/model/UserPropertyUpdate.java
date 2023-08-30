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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserPropertyUpdate
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
    "value"
})
@JsonTypeName("UserPropertyUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserPropertyUpdate {

    /**
     * The value of the user property.
     */
    @JsonProperty("value")
    protected Map<String, Object> value;

    /**
     * Constructs a validated instance of {@link UserPropertyUpdate}.
     *
     * @param spec the specification to process
     */
    public UserPropertyUpdate(Consumer<UserPropertyUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserPropertyUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserPropertyUpdate(Consumer)} instead.
     * @param value The value of the user property.
     */
    @ApiStatus.Internal
    public UserPropertyUpdate(Map<String, Object> value) {
        this.value = value;
    }

}
