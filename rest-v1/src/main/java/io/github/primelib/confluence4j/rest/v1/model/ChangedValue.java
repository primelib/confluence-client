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
 * ChangedValue
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
    "name",
    "oldValue",
    "hiddenOldValue",
    "newValue",
    "hiddenNewValue"
})
@JsonTypeName("ChangedValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangedValue {

    @JsonProperty("name")
    protected String name;

    @JsonProperty("oldValue")
    protected String oldValue;

    @JsonProperty("hiddenOldValue")
    protected String hiddenOldValue;

    @JsonProperty("newValue")
    protected String newValue;

    @JsonProperty("hiddenNewValue")
    protected String hiddenNewValue;

    /**
     * Constructs a validated instance of {@link ChangedValue}.
     *
     * @param spec the specification to process
     */
    public ChangedValue(Consumer<ChangedValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChangedValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChangedValue(Consumer)} instead.
     * @param name name
     * @param oldValue oldValue
     * @param hiddenOldValue hiddenOldValue
     * @param newValue newValue
     * @param hiddenNewValue hiddenNewValue
     */
    @ApiStatus.Internal
    public ChangedValue(String name, String oldValue, String hiddenOldValue, String newValue, String hiddenNewValue) {
        this.name = name;
        this.oldValue = oldValue;
        this.hiddenOldValue = hiddenOldValue;
        this.newValue = newValue;
        this.hiddenNewValue = hiddenNewValue;
    }

}
