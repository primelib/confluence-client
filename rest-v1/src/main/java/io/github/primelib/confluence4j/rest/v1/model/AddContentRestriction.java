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
 * AddContentRestriction
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
    "operation",
    "restrictions"
})
@JsonTypeName("AddContentRestriction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddContentRestriction {

    /**
     * The restriction operation applied to content.
     */
    @JsonProperty("operation")
    protected OperationEnum operation;

    @JsonProperty("restrictions")
    protected AddContentRestrictionRestrictions restrictions;

    /**
     * Constructs a validated instance of {@link AddContentRestriction}.
     *
     * @param spec the specification to process
     */
    public AddContentRestriction(Consumer<AddContentRestriction> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AddContentRestriction}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AddContentRestriction(Consumer)} instead.
     * @param operation The restriction operation applied to content.
     * @param restrictions restrictions
     */
    @ApiStatus.Internal
    public AddContentRestriction(OperationEnum operation, AddContentRestrictionRestrictions restrictions) {
        this.operation = operation;
        this.restrictions = restrictions;
    }

    /**
     * The restriction operation applied to content.
     */
    @AllArgsConstructor
    public enum OperationEnum {
        READ("read"),
        UPDATE("update");

        private static final OperationEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OperationEnum of(String input) {
            if (input != null) {
                for (OperationEnum v : VALUES) {
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
