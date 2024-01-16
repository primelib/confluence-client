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
 * ContentRestrictionUpdate
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
    "restrictions",
    "content"
})
@JsonTypeName("ContentRestrictionUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentRestrictionUpdate {

    /**
     * The restriction operation applied to content.
     */
    @JsonProperty("operation")
    protected OperationEnum operation;

    @JsonProperty("restrictions")
    protected ContentRestrictionUpdateRestrictions restrictions;

    @JsonProperty("content")
    protected Content content;

    /**
     * Constructs a validated instance of {@link ContentRestrictionUpdate}.
     *
     * @param spec the specification to process
     */
    public ContentRestrictionUpdate(Consumer<ContentRestrictionUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentRestrictionUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentRestrictionUpdate(Consumer)} instead.
     * @param operation The restriction operation applied to content.
     * @param restrictions restrictions
     * @param content content
     */
    @ApiStatus.Internal
    public ContentRestrictionUpdate(OperationEnum operation, ContentRestrictionUpdateRestrictions restrictions, Content content) {
        this.operation = operation;
        this.restrictions = restrictions;
        this.content = content;
    }

    /**
     * The restriction operation applied to content.
     */
    @AllArgsConstructor
    public enum OperationEnum {
        ADMINISTER("administer"),
        COPY("copy"),
        CREATE("create"),
        DELETE("delete"),
        EXPORT("export"),
        MOVE("move"),
        PURGE("purge"),
        PURGE_VERSION("purge_version"),
        READ("read"),
        RESTORE("restore"),
        UPDATE("update"),
        USE("use");

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
