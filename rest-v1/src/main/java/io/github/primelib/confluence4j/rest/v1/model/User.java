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

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * User
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
    "username",
    "userKey",
    "accountId",
    "accountType",
    "email",
    "publicName",
    "profilePicture",
    "displayName",
    "timeZone",
    "isExternalCollaborator",
    "externalCollaborator",
    "operations",
    "details",
    "personalSpace",
    "_expandable",
    "_links"
})
@JsonTypeName("User")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class User {

    @JsonProperty("type")
    protected TypeEnum type;

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

    /**
     * The account type of the user, may return empty string if unavailable. App is if the user is a bot user created on behalf of an Atlassian app.
     */
    @JsonProperty("accountType")
    protected AccountTypeEnum accountType;

    /**
     * The email address of the user. Depending on the user's privacy setting, this may return an empty string.
     */
    @JsonProperty("email")
    protected String email;

    /**
     * The public name or nickname of the user. Will always contain a value.
     */
    @JsonProperty("publicName")
    protected String publicName;

    @JsonProperty("profilePicture")
    protected Icon profilePicture;

    /**
     * The displays name of the user. Depending on the user's privacy setting, this may be the same as publicName.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * This displays user time zone. Depending on the user's privacy setting, this may return null.
     */
    @JsonProperty("timeZone")
    protected String timeZone;

    /**
     * Whether the user is an external collaborator user
     */
    @JsonProperty("isExternalCollaborator")
    protected Boolean isExternalCollaborator;

    /**
     * Whether the user is an external collaborator user
     */
    @JsonProperty("externalCollaborator")
    protected Boolean externalCollaborator;

    @JsonProperty("operations")
    protected List<OperationCheckResult> operations;

    @JsonProperty("details")
    protected UserDetails details;

    @JsonProperty("personalSpace")
    protected Space personalSpace;

    @JsonProperty("_expandable")
    protected BulkUserLookupExpandable _expandable;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link User}.
     *
     * @param spec the specification to process
     */
    public User(Consumer<User> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link User}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #User(Consumer)} instead.
     * @param type type
     * @param username This property is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param userKey This property is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.
     * @param accountType The account type of the user, may return empty string if unavailable. App is if the user is a bot user created on behalf of an Atlassian app.
     * @param email The email address of the user. Depending on the user's privacy setting, this may return an empty string.
     * @param publicName The public name or nickname of the user. Will always contain a value.
     * @param profilePicture profilePicture
     * @param displayName The displays name of the user. Depending on the user's privacy setting, this may be the same as publicName.
     * @param timeZone This displays user time zone. Depending on the user's privacy setting, this may return null.
     * @param isExternalCollaborator Whether the user is an external collaborator user
     * @param externalCollaborator Whether the user is an external collaborator user
     * @param operations operations
     * @param details details
     * @param personalSpace personalSpace
     * @param _expandable _expandable
     * @param _links _links
     */
    @ApiStatus.Internal
    public User(TypeEnum type, String username, String userKey, String accountId, AccountTypeEnum accountType, String email, String publicName, Icon profilePicture, String displayName, String timeZone, Boolean isExternalCollaborator, Boolean externalCollaborator, List<OperationCheckResult> operations, UserDetails details, Space personalSpace, BulkUserLookupExpandable _expandable, Map<String, String> _links) {
        this.type = type;
        this.username = username;
        this.userKey = userKey;
        this.accountId = accountId;
        this.accountType = accountType;
        this.email = email;
        this.publicName = publicName;
        this.profilePicture = profilePicture;
        this.displayName = displayName;
        this.timeZone = timeZone;
        this.isExternalCollaborator = isExternalCollaborator;
        this.externalCollaborator = externalCollaborator;
        this.operations = operations;
        this.details = details;
        this.personalSpace = personalSpace;
        this._expandable = _expandable;
        this._links = _links;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        KNOWN("known"),
        UNKNOWN("unknown"),
        ANONYMOUS("anonymous"),
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

    /**
     * The account type of the user, may return empty string if unavailable. App is if the user is a bot user created on behalf of an Atlassian app.
     */
    @AllArgsConstructor
    public enum AccountTypeEnum {
        ATLASSIAN("atlassian"),
        APP("app"),
        EMPTY("");

        private static final AccountTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static AccountTypeEnum of(String input) {
            if (input != null) {
                for (AccountTypeEnum v : VALUES) {
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
