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
 * ThemeNoLinks
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
    "icon"
})
@JsonTypeName("ThemeNoLinks")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ThemeNoLinks {

    @JsonProperty("themeKey")
    protected String themeKey;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("icon")
    protected Icon icon;

    /**
     * Constructs a validated instance of {@link ThemeNoLinks}.
     *
     * @param spec the specification to process
     */
    public ThemeNoLinks(Consumer<ThemeNoLinks> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ThemeNoLinks}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ThemeNoLinks(Consumer)} instead.
     * @param themeKey themeKey
     * @param name name
     * @param description description
     * @param icon icon
     */
    @ApiStatus.Internal
    public ThemeNoLinks(String themeKey, String name, String description, Icon icon) {
        this.themeKey = themeKey;
        this.name = name;
        this.description = description;
        this.icon = icon;
    }

}
