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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SpaceExpandable
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
    "settings",
    "metadata",
    "operations",
    "lookAndFeel",
    "permissions",
    "icon",
    "description",
    "theme",
    "history",
    "homepage",
    "identifiers"
})
@JsonTypeName("Space__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpaceExpandable {

    @JsonProperty("settings")
    protected String settings;

    @JsonProperty("metadata")
    protected String metadata;

    @JsonProperty("operations")
    protected String operations;

    @JsonProperty("lookAndFeel")
    protected String lookAndFeel;

    @JsonProperty("permissions")
    protected String permissions;

    @JsonProperty("icon")
    protected String icon;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("theme")
    protected String theme;

    @JsonProperty("history")
    protected String history;

    @JsonProperty("homepage")
    protected String homepage;

    @JsonProperty("identifiers")
    protected String identifiers;

    /**
     * Constructs a validated instance of {@link SpaceExpandable}.
     *
     * @param spec the specification to process
     */
    public SpaceExpandable(Consumer<SpaceExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpaceExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpaceExpandable(Consumer)} instead.
     * @param settings settings
     * @param metadata metadata
     * @param operations operations
     * @param lookAndFeel lookAndFeel
     * @param permissions permissions
     * @param icon icon
     * @param description description
     * @param theme theme
     * @param history history
     * @param homepage homepage
     * @param identifiers identifiers
     */
    @ApiStatus.Internal
    public SpaceExpandable(String settings, String metadata, String operations, String lookAndFeel, String permissions, String icon, String description, String theme, String history, String homepage, String identifiers) {
        this.settings = settings;
        this.metadata = metadata;
        this.operations = operations;
        this.lookAndFeel = lookAndFeel;
        this.permissions = permissions;
        this.icon = icon;
        this.description = description;
        this.theme = theme;
        this.history = history;
        this.homepage = homepage;
        this.identifiers = identifiers;
    }

}
