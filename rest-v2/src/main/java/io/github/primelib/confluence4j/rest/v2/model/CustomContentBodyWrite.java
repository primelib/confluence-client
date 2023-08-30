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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CustomContentBodyWrite
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
    "representation",
    "value"
})
@JsonTypeName("CustomContentBodyWrite")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomContentBodyWrite {

    /**
     * Type of content representation used for the value field.
     */
    @JsonProperty("representation")
    protected RepresentationEnum representation;

    /**
     * Body of the custom content, in the format found in the representation field.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link CustomContentBodyWrite}.
     *
     * @param spec the specification to process
     */
    public CustomContentBodyWrite(Consumer<CustomContentBodyWrite> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomContentBodyWrite}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomContentBodyWrite(Consumer)} instead.
     * @param representation Type of content representation used for the value field.
     * @param value Body of the custom content, in the format found in the representation field.
     */
    @ApiStatus.Internal
    public CustomContentBodyWrite(RepresentationEnum representation, String value) {
        this.representation = representation;
        this.value = value;
    }

    /**
     * Type of content representation used for the value field.
     */
    @AllArgsConstructor
    public enum RepresentationEnum {
        STORAGE("storage"),
        ATLAS_DOC_FORMAT("atlas_doc_format"),
        RAW("raw");

        private static final RepresentationEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static RepresentationEnum of(String input) {
            if (input != null) {
                for (RepresentationEnum v : VALUES) {
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
