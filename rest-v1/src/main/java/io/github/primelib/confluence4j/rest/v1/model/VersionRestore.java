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
 * VersionRestore
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
    "operationKey",
    "params"
})
@JsonTypeName("VersionRestore")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionRestore {

    /**
     * Set to 'restore'.
     */
    @JsonProperty("operationKey")
    protected OperationKeyEnum operationKey;

    @JsonProperty("params")
    protected VersionRestoreParams params;

    /**
     * Constructs a validated instance of {@link VersionRestore}.
     *
     * @param spec the specification to process
     */
    public VersionRestore(Consumer<VersionRestore> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link VersionRestore}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #VersionRestore(Consumer)} instead.
     * @param operationKey Set to 'restore'.
     * @param params params
     */
    @ApiStatus.Internal
    public VersionRestore(OperationKeyEnum operationKey, VersionRestoreParams params) {
        this.operationKey = operationKey;
        this.params = params;
    }

    /**
     * Set to 'restore'.
     */
    @AllArgsConstructor
    public enum OperationKeyEnum {
        RESTORE("restore");

        private static final OperationKeyEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OperationKeyEnum of(String input) {
            if (input != null) {
                for (OperationKeyEnum v : VALUES) {
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
