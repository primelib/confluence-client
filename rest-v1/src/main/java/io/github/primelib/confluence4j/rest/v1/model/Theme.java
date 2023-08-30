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
 * Theme
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
    "themeKey",
    "name",
    "description",
    "icon",
    "_links"
})
@JsonTypeName("Theme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Theme {

    @JsonProperty("themeKey")
    protected String themeKey;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("icon")
    protected Icon icon;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link Theme}.
     *
     * @param spec the specification to process
     */
    public Theme(Consumer<Theme> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Theme}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Theme(Consumer)} instead.
     * @param themeKey themeKey
     * @param name name
     * @param description description
     * @param icon icon
     * @param _links _links
     */
    @ApiStatus.Internal
    public Theme(String themeKey, String name, String description, Icon icon, Map<String, String> _links) {
        this.themeKey = themeKey;
        this.name = name;
        this.description = description;
        this.icon = icon;
        this._links = _links;
    }

}
