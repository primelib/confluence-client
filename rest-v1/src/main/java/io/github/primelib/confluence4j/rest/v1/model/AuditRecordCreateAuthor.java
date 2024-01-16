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
 * AuditRecordCreateAuthor
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
    "type",
    "displayName",
    "operations",
    "username",
    "userKey"
})
@JsonTypeName("AuditRecordCreate_author")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordCreateAuthor {

    /**
     * Set to 'user'.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The name that is displayed on the audit log in the Confluence UI.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * Always defaults to null.
     */
    @JsonProperty("operations")
    protected Object operations;

    /**
     * This property is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("username")
    protected String username;

    /**
     * This property is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("userKey")
    protected String userKey;

    /**
     * Constructs a validated instance of {@link AuditRecordCreateAuthor}.
     *
     * @param spec the specification to process
     */
    public AuditRecordCreateAuthor(Consumer<AuditRecordCreateAuthor> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuditRecordCreateAuthor}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuditRecordCreateAuthor(Consumer)} instead.
     * @param type Set to 'user'.
     * @param displayName The name that is displayed on the audit log in the Confluence UI.
     * @param operations Always defaults to null.
     * @param username This property is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param userKey This property is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @ApiStatus.Internal
    public AuditRecordCreateAuthor(TypeEnum type, String displayName, Object operations, String username, String userKey) {
        this.type = type;
        this.displayName = displayName;
        this.operations = operations;
        this.username = username;
        this.userKey = userKey;
    }

    /**
     * Set to 'user'.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        USER("user");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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
