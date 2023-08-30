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
 * SpacePermissionV2Operation
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
    "target"
})
@JsonTypeName("SpacePermissionV2_operation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePermissionV2Operation {

    @JsonProperty("key")
    protected KeyEnum key;

    /**
     * The space or content type that the operation applies to.
     */
    @JsonProperty("target")
    protected TargetEnum target;

    /**
     * Constructs a validated instance of {@link SpacePermissionV2Operation}.
     *
     * @param spec the specification to process
     */
    public SpacePermissionV2Operation(Consumer<SpacePermissionV2Operation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePermissionV2Operation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePermissionV2Operation(Consumer)} instead.
     * @param key key
     * @param target The space or content type that the operation applies to.
     */
    @ApiStatus.Internal
    public SpacePermissionV2Operation(KeyEnum key, TargetEnum target) {
        this.key = key;
        this.target = target;
    }

    @AllArgsConstructor
    public enum KeyEnum {
        ADMINISTER("administer"),
        ARCHIVE("archive"),
        COPY("copy"),
        CREATE("create"),
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

    /**
     * The space or content type that the operation applies to.
     */
    @AllArgsConstructor
    public enum TargetEnum {
        PAGE("page"),
        BLOGPOST("blogpost"),
        COMMENT("comment"),
        ATTACHMENT("attachment"),
        SPACE("space");

        private static final TargetEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TargetEnum of(String input) {
            if (input != null) {
                for (TargetEnum v : VALUES) {
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
