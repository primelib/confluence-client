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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WatchUser
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
    "profilePicture",
    "displayName",
    "timeZone",
    "operations",
    "isExternalCollaborator",
    "details",
    "accountType",
    "email",
    "publicName",
    "personalSpace",
    "externalCollaborator"
})
@JsonTypeName("WatchUser")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WatchUser {

    @JsonProperty("type")
    protected String type;

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

    @JsonProperty("profilePicture")
    protected Icon profilePicture;

    @JsonProperty("displayName")
    protected String displayName;

    @JsonProperty("timeZone")
    protected String timeZone;

    @JsonProperty("operations")
    protected List<OperationCheckResult> operations;

    @JsonProperty("isExternalCollaborator")
    protected Boolean isExternalCollaborator;

    @JsonProperty("details")
    protected UserDetails details;

    @JsonProperty("accountType")
    protected String accountType;

    @JsonProperty("email")
    protected String email;

    @JsonProperty("publicName")
    protected String publicName;

    @JsonProperty("personalSpace")
    protected Object personalSpace;

    @JsonProperty("externalCollaborator")
    protected Boolean externalCollaborator;

    /**
     * Constructs a validated instance of {@link WatchUser}.
     *
     * @param spec the specification to process
     */
    public WatchUser(Consumer<WatchUser> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WatchUser}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WatchUser(Consumer)} instead.
     * @param type type
     * @param username This property is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param userKey This property is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.
     * @param profilePicture profilePicture
     * @param displayName displayName
     * @param timeZone timeZone
     * @param operations operations
     * @param isExternalCollaborator isExternalCollaborator
     * @param details details
     * @param accountType accountType
     * @param email email
     * @param publicName publicName
     * @param personalSpace personalSpace
     * @param externalCollaborator externalCollaborator
     */
    @ApiStatus.Internal
    public WatchUser(String type, String username, String userKey, String accountId, Icon profilePicture, String displayName, String timeZone, List<OperationCheckResult> operations, Boolean isExternalCollaborator, UserDetails details, String accountType, String email, String publicName, Object personalSpace, Boolean externalCollaborator) {
        this.type = type;
        this.username = username;
        this.userKey = userKey;
        this.accountId = accountId;
        this.profilePicture = profilePicture;
        this.displayName = displayName;
        this.timeZone = timeZone;
        this.operations = operations;
        this.isExternalCollaborator = isExternalCollaborator;
        this.details = details;
        this.accountType = accountType;
        this.email = email;
        this.publicName = publicName;
        this.personalSpace = personalSpace;
        this.externalCollaborator = externalCollaborator;
    }

}
