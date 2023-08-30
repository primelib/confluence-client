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
 * ContentPermissionRequest
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
    "subject",
    "operation"
})
@JsonTypeName("ContentPermissionRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentPermissionRequest {

    @JsonProperty("subject")
    protected PermissionSubjectWithGroupId subject;

    /**
     * The content permission operation to check.
     */
    @JsonProperty("operation")
    protected OperationEnum operation;

    /**
     * Constructs a validated instance of {@link ContentPermissionRequest}.
     *
     * @param spec the specification to process
     */
    public ContentPermissionRequest(Consumer<ContentPermissionRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentPermissionRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentPermissionRequest(Consumer)} instead.
     * @param subject subject
     * @param operation The content permission operation to check.
     */
    @ApiStatus.Internal
    public ContentPermissionRequest(PermissionSubjectWithGroupId subject, OperationEnum operation) {
        this.subject = subject;
        this.operation = operation;
    }

    /**
     * The content permission operation to check.
     */
    @AllArgsConstructor
    public enum OperationEnum {
        READ("read"),
        UPDATE("update"),
        DELETE("delete");

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
