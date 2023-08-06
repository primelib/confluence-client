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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * RetentionPeriod
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
    "number",
    "units"
})
@JsonTypeName("RetentionPeriod")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RetentionPeriod {

    /**
     * The number of units for the retention period.
     */
    @JsonProperty("number")
    protected Integer number;

    /**
     * The unit of time that the retention period is measured in.
     */
    @JsonProperty("units")
    protected UnitsEnum units;

    /**
     * Constructs a validated instance of {@link RetentionPeriod}.
     *
     * @param spec the specification to process
     */
    public RetentionPeriod(Consumer<RetentionPeriod> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RetentionPeriod}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RetentionPeriod(Consumer)} instead.
     * @param number The number of units for the retention period.
     * @param units The unit of time that the retention period is measured in.
     */
    @ApiStatus.Internal
    public RetentionPeriod(Integer number, UnitsEnum units) {
        this.number = number;
        this.units = units;
    }

    /**
     * The unit of time that the retention period is measured in.
     */
    @AllArgsConstructor
    public enum UnitsEnum {
        NANOS("NANOS"),
        MICROS("MICROS"),
        MILLIS("MILLIS"),
        SECONDS("SECONDS"),
        MINUTES("MINUTES"),
        HOURS("HOURS"),
        HALF_DAYS("HALF_DAYS"),
        DAYS("DAYS"),
        WEEKS("WEEKS"),
        MONTHS("MONTHS"),
        YEARS("YEARS"),
        DECADES("DECADES"),
        CENTURIES("CENTURIES"),
        MILLENNIA("MILLENNIA"),
        ERAS("ERAS"),
        FOREVER("FOREVER");

        private static final UnitsEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static UnitsEnum of(String input) {
            if (input != null) {
                for (UnitsEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
