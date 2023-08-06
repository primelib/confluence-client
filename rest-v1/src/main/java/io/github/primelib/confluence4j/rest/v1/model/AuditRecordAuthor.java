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
 * AuditRecordAuthor
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
    "userKey",
    "accountId",
    "accountType",
    "externalCollaborator",
    "isExternalCollaborator",
    "publicName"
})
@JsonTypeName("AuditRecord_author")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordAuthor {

    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("displayName")
    protected String displayName;

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
     * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.
     */
    @JsonProperty("accountId")
    protected String accountId;

    @JsonProperty("accountType")
    protected String accountType;

    @JsonProperty("externalCollaborator")
    protected Boolean externalCollaborator;

    /**
     * Whether the user is an external collaborator user
     */
    @JsonProperty("isExternalCollaborator")
    protected Boolean isExternalCollaborator;

    /**
     * The public name or nickname of the user. Will always contain a value.
     */
    @JsonProperty("publicName")
    protected String publicName;

    /**
     * Constructs a validated instance of {@link AuditRecordAuthor}.
     *
     * @param spec the specification to process
     */
    public AuditRecordAuthor(Consumer<AuditRecordAuthor> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuditRecordAuthor}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuditRecordAuthor(Consumer)} instead.
     * @param type type
     * @param displayName displayName
     * @param operations operations
     * @param username This property is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param userKey This property is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.
     * @param accountType accountType
     * @param externalCollaborator externalCollaborator
     * @param isExternalCollaborator Whether the user is an external collaborator user
     * @param publicName The public name or nickname of the user. Will always contain a value.
     */
    @ApiStatus.Internal
    public AuditRecordAuthor(TypeEnum type, String displayName, Object operations, String username, String userKey, String accountId, String accountType, Boolean externalCollaborator, Boolean isExternalCollaborator, String publicName) {
        this.type = type;
        this.displayName = displayName;
        this.operations = operations;
        this.username = username;
        this.userKey = userKey;
        this.accountId = accountId;
        this.accountType = accountType;
        this.externalCollaborator = externalCollaborator;
        this.isExternalCollaborator = isExternalCollaborator;
        this.publicName = publicName;
    }

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
