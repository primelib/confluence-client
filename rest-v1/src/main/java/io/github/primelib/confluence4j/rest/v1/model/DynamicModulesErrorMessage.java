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
 * DynamicModulesErrorMessage
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
    "message"
})
@JsonTypeName("DynamicModulesErrorMessage")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DynamicModulesErrorMessage {

    /**
     * The error message.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * Constructs a validated instance of {@link DynamicModulesErrorMessage}.
     *
     * @param spec the specification to process
     */
    public DynamicModulesErrorMessage(Consumer<DynamicModulesErrorMessage> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DynamicModulesErrorMessage}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DynamicModulesErrorMessage(Consumer)} instead.
     * @param message The error message.
     */
    @ApiStatus.Internal
    public DynamicModulesErrorMessage(String message) {
        this.message = message;
    }

}
