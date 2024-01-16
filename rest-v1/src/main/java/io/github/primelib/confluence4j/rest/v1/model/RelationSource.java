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
 * RelationSource
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
    "id",
    "type",
    "status",
    "title",
    "space",
    "history",
    "version",
    "ancestors",
    "operations",
    "children",
    "childTypes",
    "descendants",
    "container",
    "body",
    "restrictions",
    "metadata",
    "macroRenderedOutput",
    "extensions",
    "_expandable",
    "_links",
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
    "details",
    "personalSpace",
    "key",
    "name",
    "icon",
    "description",
    "homepage",
    "permissions",
    "settings",
    "theme",
    "lookAndFeel"
})
@JsonTypeName("Relation_source")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RelationSource {

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("space")
    protected Space space;

    @JsonProperty("history")
    protected ContentCreateSpaceHistory history;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("ancestors")
    protected List<Content> ancestors;

    @JsonProperty("operations")
    protected List<OperationCheckResult> operations;

    @JsonProperty("children")
    protected ContentChildren children;

    @JsonProperty("childTypes")
    protected ContentChildType childTypes;

    @JsonProperty("descendants")
    protected ContentChildren descendants;

    /**
     * Container for content. This can be either a space (containing a page or blogpost) or a page/blog post (containing an attachment or comment)
     */
    @JsonProperty("container")
    protected Map<String, Object> container;

    @JsonProperty("body")
    protected ContentBody body;

    @JsonProperty("restrictions")
    protected ContentRestrictions restrictions;

    @JsonProperty("metadata")
    protected SpaceMetadata metadata;

    @JsonProperty("macroRenderedOutput")
    protected Map<String, Object> macroRenderedOutput;

    @JsonProperty("extensions")
    protected Object extensions;

    @JsonProperty("_expandable")
    protected SpaceExpandable _expandable;

    @JsonProperty("_links")
    protected Map<String, String> _links;

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

    @JsonProperty("details")
    protected UserDetails details;

    @JsonProperty("personalSpace")
    protected Space personalSpace;

    @JsonProperty("key")
    protected String key;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("icon")
    protected Icon icon;

    @JsonProperty("description")
    protected SpaceDescription description;

    @JsonProperty("homepage")
    protected Content homepage;

    @JsonProperty("permissions")
    protected List<SpacePermission> permissions;

    @JsonProperty("settings")
    protected SpaceSettings settings;

    @JsonProperty("theme")
    protected Theme theme;

    @JsonProperty("lookAndFeel")
    protected LookAndFeel lookAndFeel;

    /**
     * Constructs a validated instance of {@link RelationSource}.
     *
     * @param spec the specification to process
     */
    public RelationSource(Consumer<RelationSource> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RelationSource}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RelationSource(Consumer)} instead.
     * @param id id
     * @param type type
     * @param status status
     * @param title title
     * @param space space
     * @param history history
     * @param version version
     * @param ancestors ancestors
     * @param operations operations
     * @param children children
     * @param childTypes childTypes
     * @param descendants descendants
     * @param container Container for content. This can be either a space (containing a page or blogpost) or a page/blog post (containing an attachment or comment)
     * @param body body
     * @param restrictions restrictions
     * @param metadata metadata
     * @param macroRenderedOutput macroRenderedOutput
     * @param extensions extensions
     * @param _expandable _expandable
     * @param _links _links
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
     * @param details details
     * @param personalSpace personalSpace
     * @param key key
     * @param name name
     * @param icon icon
     * @param description description
     * @param homepage homepage
     * @param permissions permissions
     * @param settings settings
     * @param theme theme
     * @param lookAndFeel lookAndFeel
     */
    @ApiStatus.Internal
    public RelationSource(Long id, String type, String status, String title, Space space, ContentCreateSpaceHistory history, Version version, List<Content> ancestors, List<OperationCheckResult> operations, ContentChildren children, ContentChildType childTypes, ContentChildren descendants, Map<String, Object> container, ContentBody body, ContentRestrictions restrictions, SpaceMetadata metadata, Map<String, Object> macroRenderedOutput, Object extensions, SpaceExpandable _expandable, Map<String, String> _links, String username, String userKey, String accountId, AccountTypeEnum accountType, String email, String publicName, Icon profilePicture, String displayName, String timeZone, Boolean isExternalCollaborator, Boolean externalCollaborator, UserDetails details, Space personalSpace, String key, String name, Icon icon, SpaceDescription description, Content homepage, List<SpacePermission> permissions, SpaceSettings settings, Theme theme, LookAndFeel lookAndFeel) {
        this.id = id;
        this.type = type;
        this.status = status;
        this.title = title;
        this.space = space;
        this.history = history;
        this.version = version;
        this.ancestors = ancestors;
        this.operations = operations;
        this.children = children;
        this.childTypes = childTypes;
        this.descendants = descendants;
        this.container = container;
        this.body = body;
        this.restrictions = restrictions;
        this.metadata = metadata;
        this.macroRenderedOutput = macroRenderedOutput;
        this.extensions = extensions;
        this._expandable = _expandable;
        this._links = _links;
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
        this.details = details;
        this.personalSpace = personalSpace;
        this.key = key;
        this.name = name;
        this.icon = icon;
        this.description = description;
        this.homepage = homepage;
        this.permissions = permissions;
        this.settings = settings;
        this.theme = theme;
        this.lookAndFeel = lookAndFeel;
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
