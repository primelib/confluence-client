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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentCreateSpace
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
    "name",
    "icon",
    "identifiers",
    "description",
    "homepage",
    "type",
    "metadata",
    "operations",
    "permissions",
    "status",
    "settings",
    "theme",
    "lookAndFeel",
    "history",
    "key",
    "links"
})
@JsonTypeName("ContentCreate_space")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentCreateSpace {

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("icon")
    protected Icon icon;

    @JsonProperty("identifiers")
    protected GlobalSpaceIdentifier identifiers;

    @JsonProperty("description")
    protected ContentCreateSpaceDescription description;

    @JsonProperty("homepage")
    protected Content homepage;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("metadata")
    protected ContentCreateSpaceMetadata metadata;

    @JsonProperty("operations")
    protected List<OperationCheckResult> operations;

    @JsonProperty("permissions")
    protected List<SpacePermission> permissions;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("settings")
    protected SpaceSettings settings;

    @JsonProperty("theme")
    protected Theme theme;

    @JsonProperty("lookAndFeel")
    protected LookAndFeel lookAndFeel;

    @JsonProperty("history")
    protected ContentCreateSpaceHistory history;

    /**
     * The key of the space.
     */
    @JsonProperty("key")
    protected String key;

    @JsonProperty("links")
    protected Map<String, Object> links;

    /**
     * Constructs a validated instance of {@link ContentCreateSpace}.
     *
     * @param spec the specification to process
     */
    public ContentCreateSpace(Consumer<ContentCreateSpace> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentCreateSpace}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentCreateSpace(Consumer)} instead.
     * @param id id
     * @param name name
     * @param icon icon
     * @param identifiers identifiers
     * @param description description
     * @param homepage homepage
     * @param type type
     * @param metadata metadata
     * @param operations operations
     * @param permissions permissions
     * @param status status
     * @param settings settings
     * @param theme theme
     * @param lookAndFeel lookAndFeel
     * @param history history
     * @param key The key of the space.
     * @param links links
     */
    @ApiStatus.Internal
    public ContentCreateSpace(Long id, String name, Icon icon, GlobalSpaceIdentifier identifiers, ContentCreateSpaceDescription description, Content homepage, String type, ContentCreateSpaceMetadata metadata, List<OperationCheckResult> operations, List<SpacePermission> permissions, String status, SpaceSettings settings, Theme theme, LookAndFeel lookAndFeel, ContentCreateSpaceHistory history, String key, Map<String, Object> links) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.identifiers = identifiers;
        this.description = description;
        this.homepage = homepage;
        this.type = type;
        this.metadata = metadata;
        this.operations = operations;
        this.permissions = permissions;
        this.status = status;
        this.settings = settings;
        this.theme = theme;
        this.lookAndFeel = lookAndFeel;
        this.history = history;
        this.key = key;
        this.links = links;
    }

}
