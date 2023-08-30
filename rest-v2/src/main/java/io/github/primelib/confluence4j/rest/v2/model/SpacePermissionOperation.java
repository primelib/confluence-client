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
 * SpacePermissionOperation
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
    "targetType"
})
@JsonTypeName("SpacePermission_operation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePermissionOperation {

    /**
     * The type of operation.
     */
    @JsonProperty("key")
    protected KeyEnum key;

    /**
     * The type of entity the operation type targets.
     */
    @JsonProperty("targetType")
    protected TargetTypeEnum targetType;

    /**
     * Constructs a validated instance of {@link SpacePermissionOperation}.
     *
     * @param spec the specification to process
     */
    public SpacePermissionOperation(Consumer<SpacePermissionOperation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePermissionOperation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePermissionOperation(Consumer)} instead.
     * @param key The type of operation.
     * @param targetType The type of entity the operation type targets.
     */
    @ApiStatus.Internal
    public SpacePermissionOperation(KeyEnum key, TargetTypeEnum targetType) {
        this.key = key;
        this.targetType = targetType;
    }

    /**
     * The type of operation.
     */
    @AllArgsConstructor
    public enum KeyEnum {
        USE("use"),
        CREATE("create"),
        READ("read"),
        UPDATE("update"),
        DELETE("delete"),
        COPY("copy"),
        MOVE("move"),
        EXPORT("export"),
        PURGE("purge"),
        PURGE_VERSION("purge_version"),
        ADMINISTER("administer"),
        RESTORE("restore"),
        CREATE_SPACE("create_space"),
        RESTRICT_CONTENT("restrict_content"),
        ARCHIVE("archive");

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
     * The type of entity the operation type targets.
     */
    @AllArgsConstructor
    public enum TargetTypeEnum {
        PAGE("page"),
        BLOGPOST("blogpost"),
        COMMENT("comment"),
        ATTACHMENT("attachment"),
        WHITEBOARD("whiteboard"),
        SPACE("space"),
        APPLICATION("application"),
        USERPROFILE("userProfile");

        private static final TargetTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TargetTypeEnum of(String input) {
            if (input != null) {
                for (TargetTypeEnum v : VALUES) {
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
