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
 * SpaceSettingsEditor
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
    "page",
    "blogpost",
    "default"
})
@JsonTypeName("SpaceSettings_editor")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpaceSettingsEditor {

    @JsonProperty("page")
    protected String page;

    @JsonProperty("blogpost")
    protected String blogpost;

    @JsonProperty("default")
    protected String _default;

    /**
     * Constructs a validated instance of {@link SpaceSettingsEditor}.
     *
     * @param spec the specification to process
     */
    public SpaceSettingsEditor(Consumer<SpaceSettingsEditor> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpaceSettingsEditor}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpaceSettingsEditor(Consumer)} instead.
     * @param page page
     * @param blogpost blogpost
     * @param _default _default
     */
    @ApiStatus.Internal
    public SpaceSettingsEditor(String page, String blogpost, String _default) {
        this.page = page;
        this.blogpost = blogpost;
        this._default = _default;
    }

}
