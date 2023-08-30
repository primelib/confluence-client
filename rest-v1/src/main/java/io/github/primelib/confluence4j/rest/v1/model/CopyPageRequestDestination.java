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
 * CopyPageRequestDestination
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
    "type",
    "value"
})
@JsonTypeName("CopyPageRequestDestination")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CopyPageRequestDestination {

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The space key for {@code space} type, and content id for {@code parent_page} and {@code existing_page}
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link CopyPageRequestDestination}.
     *
     * @param spec the specification to process
     */
    public CopyPageRequestDestination(Consumer<CopyPageRequestDestination> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CopyPageRequestDestination}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CopyPageRequestDestination(Consumer)} instead.
     * @param type type
     * @param value The space key for {@code space} type, and content id for {@code parent_page} and {@code existing_page}
     */
    @ApiStatus.Internal
    public CopyPageRequestDestination(TypeEnum type, String value) {
        this.type = type;
        this.value = value;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        SPACE("space"),
        EXISTING_PAGE("existing_page"),
        PARENT_PAGE("parent_page");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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
