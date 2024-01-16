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
 * LookAndFeelSelection
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
    "spaceKey",
    "lookAndFeelType"
})
@JsonTypeName("LookAndFeelSelection")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LookAndFeelSelection {

    /**
     * The key of the space for which the look and feel settings will be set.
     */
    @JsonProperty("spaceKey")
    protected String spaceKey;

    @JsonProperty("lookAndFeelType")
    protected LookAndFeelTypeEnum lookAndFeelType;

    /**
     * Constructs a validated instance of {@link LookAndFeelSelection}.
     *
     * @param spec the specification to process
     */
    public LookAndFeelSelection(Consumer<LookAndFeelSelection> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LookAndFeelSelection}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LookAndFeelSelection(Consumer)} instead.
     * @param spaceKey The key of the space for which the look and feel settings will be set.
     * @param lookAndFeelType lookAndFeelType
     */
    @ApiStatus.Internal
    public LookAndFeelSelection(String spaceKey, LookAndFeelTypeEnum lookAndFeelType) {
        this.spaceKey = spaceKey;
        this.lookAndFeelType = lookAndFeelType;
    }

    @AllArgsConstructor
    public enum LookAndFeelTypeEnum {
        GLOBAL("global"),
        CUSTOM("custom"),
        THEME("theme");

        private static final LookAndFeelTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static LookAndFeelTypeEnum of(String input) {
            if (input != null) {
                for (LookAndFeelTypeEnum v : VALUES) {
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
