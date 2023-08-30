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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SpaceSettings
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
    "routeOverrideEnabled",
    "editor",
    "spaceKey",
    "_links"
})
@JsonTypeName("SpaceSettings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpaceSettings {

    /**
     * Defines whether an override for the space home should be used. This is used in conjunction with a space theme provided by an app. For example, if this property is set to true, a theme can display a page other than the space homepage when users visit the root URL for a space. This property allows apps to provide content-only theming without overriding the space home.
     */
    @JsonProperty("routeOverrideEnabled")
    protected Boolean routeOverrideEnabled;

    @JsonProperty("editor")
    protected SpaceSettingsEditor editor;

    @JsonProperty("spaceKey")
    protected String spaceKey;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link SpaceSettings}.
     *
     * @param spec the specification to process
     */
    public SpaceSettings(Consumer<SpaceSettings> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpaceSettings}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpaceSettings(Consumer)} instead.
     * @param routeOverrideEnabled Defines whether an override for the space home should be used. This is used in conjunction with a space theme provided by an app. For example, if this property is set to true, a theme can display a page other than the space homepage when users visit the root URL for a space. This property allows apps to provide content-only theming without overriding the space home.
     * @param editor editor
     * @param spaceKey spaceKey
     * @param _links _links
     */
    @ApiStatus.Internal
    public SpaceSettings(Boolean routeOverrideEnabled, SpaceSettingsEditor editor, String spaceKey, Map<String, String> _links) {
        this.routeOverrideEnabled = routeOverrideEnabled;
        this.editor = editor;
        this.spaceKey = spaceKey;
        this._links = _links;
    }

}
