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
 * OperationCheckResult
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
    "targetType"
})
@JsonTypeName("OperationCheckResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OperationCheckResult {

    /**
     * The operation itself.
     */
    @JsonProperty("operation")
    protected OperationEnum operation;

    /**
     * The space or content type that the operation applies to. Could be one of- - application - page - blogpost - comment - attachment - space
     */
    @JsonProperty("targetType")
    protected String targetType;

    /**
     * Constructs a validated instance of {@link OperationCheckResult}.
     *
     * @param spec the specification to process
     */
    public OperationCheckResult(Consumer<OperationCheckResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OperationCheckResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OperationCheckResult(Consumer)} instead.
     * @param operation The operation itself.
     * @param targetType The space or content type that the operation applies to. Could be one of- - application - page - blogpost - comment - attachment - space
     */
    @ApiStatus.Internal
    public OperationCheckResult(OperationEnum operation, String targetType) {
        this.operation = operation;
        this.targetType = targetType;
    }

    /**
     * The operation itself.
     */
    @AllArgsConstructor
    public enum OperationEnum {
        ADMINISTER("administer"),
        ARCHIVE("archive"),
        CLEAR_PERMISSIONS("clear_permissions"),
        COPY("copy"),
        CREATE("create"),
        CREATE_SPACE("create_space"),
        DELETE("delete"),
        EXPORT("export"),
        MOVE("move"),
        PURGE("purge"),
        PURGE_VERSION("purge_version"),
        READ("read"),
        RESTORE("restore"),
        RESTRICT_CONTENT("restrict_content"),
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
