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
 * ContentBodyCreate
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
    "value",
    "representation"
})
@JsonTypeName("ContentBodyCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentBodyCreate {

    /**
     * The body of the content in the relevant format.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * The content format type. Set the value of this property to the name of the format being used, e.g. 'storage'.
     */
    @JsonProperty("representation")
    protected RepresentationEnum representation;

    /**
     * Constructs a validated instance of {@link ContentBodyCreate}.
     *
     * @param spec the specification to process
     */
    public ContentBodyCreate(Consumer<ContentBodyCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentBodyCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentBodyCreate(Consumer)} instead.
     * @param value The body of the content in the relevant format.
     * @param representation The content format type. Set the value of this property to the name of the format being used, e.g. 'storage'.
     */
    @ApiStatus.Internal
    public ContentBodyCreate(String value, RepresentationEnum representation) {
        this.value = value;
        this.representation = representation;
    }

    /**
     * The content format type. Set the value of this property to the name of the format being used, e.g. 'storage'.
     */
    @AllArgsConstructor
    public enum RepresentationEnum {
        VIEW("view"),
        EXPORT_VIEW("export_view"),
        STYLED_VIEW("styled_view"),
        STORAGE("storage"),
        EDITOR("editor"),
        EDITOR2("editor2"),
        ANONYMOUS_EXPORT_VIEW("anonymous_export_view"),
        WIKI("wiki"),
        ATLAS_DOC_FORMAT("atlas_doc_format"),
        PLAIN("plain"),
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
