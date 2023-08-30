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
 * SpacePermissionCustomContentOperationsInner
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
    "key",
    "target",
    "access"
})
@JsonTypeName("SpacePermissionCustomContent_operations_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePermissionCustomContentOperationsInner {

    /**
     * The operation type
     */
    @JsonProperty("key")
    protected KeyEnum key;

    /**
     * The custom content type
     */
    @JsonProperty("target")
    protected String target;

    /**
     * Grant or restrict access
     */
    @JsonProperty("access")
    protected Boolean access;

    /**
     * Constructs a validated instance of {@link SpacePermissionCustomContentOperationsInner}.
     *
     * @param spec the specification to process
     */
    public SpacePermissionCustomContentOperationsInner(Consumer<SpacePermissionCustomContentOperationsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePermissionCustomContentOperationsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePermissionCustomContentOperationsInner(Consumer)} instead.
     * @param key The operation type
     * @param target The custom content type
     * @param access Grant or restrict access
     */
    @ApiStatus.Internal
    public SpacePermissionCustomContentOperationsInner(KeyEnum key, String target, Boolean access) {
        this.key = key;
        this.target = target;
        this.access = access;
    }

    /**
     * The operation type
     */
    @AllArgsConstructor
    public enum KeyEnum {
        READ("read"),
        CREATE("create"),
        DELETE("delete");

        private static final KeyEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static KeyEnum of(String input) {
            if (input != null) {
                for (KeyEnum v : VALUES) {
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
