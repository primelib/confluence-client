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
 * Space
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
    "key",
    "name",
    "icon",
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
    "_expandable",
    "_links"
})
@JsonTypeName("Space")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Space {

    @JsonProperty("id")
    protected Long id;

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

    @JsonProperty("type")
    protected String type;

    @JsonProperty("metadata")
    protected SpaceMetadata metadata;

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

    @JsonProperty("_expandable")
    protected SpaceExpandable _expandable;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link Space}.
     *
     * @param spec the specification to process
     */
    public Space(Consumer<Space> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Space}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Space(Consumer)} instead.
     * @param id id
     * @param key key
     * @param name name
     * @param icon icon
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
     * @param _expandable _expandable
     * @param _links _links
     */
    @ApiStatus.Internal
    public Space(Long id, String key, String name, Icon icon, SpaceDescription description, Content homepage, String type, SpaceMetadata metadata, List<OperationCheckResult> operations, List<SpacePermission> permissions, String status, SpaceSettings settings, Theme theme, LookAndFeel lookAndFeel, ContentCreateSpaceHistory history, SpaceExpandable _expandable, Map<String, String> _links) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.icon = icon;
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
        this._expandable = _expandable;
        this._links = _links;
    }

}
