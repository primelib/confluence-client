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
 * TaskStatusUpdate
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
    "status"
})
@JsonTypeName("TaskStatusUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TaskStatusUpdate {

    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * Constructs a validated instance of {@link TaskStatusUpdate}.
     *
     * @param spec the specification to process
     */
    public TaskStatusUpdate(Consumer<TaskStatusUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TaskStatusUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TaskStatusUpdate(Consumer)} instead.
     * @param status status
     */
    @ApiStatus.Internal
    public TaskStatusUpdate(StatusEnum status) {
        this.status = status;
    }

    @AllArgsConstructor
    public enum StatusEnum {
        COMPLETE("complete"),
        INCOMPLETE("incomplete");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
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
