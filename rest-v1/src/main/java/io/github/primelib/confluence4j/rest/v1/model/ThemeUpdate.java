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
 * ThemeUpdate
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
    "themeKey"
})
@JsonTypeName("ThemeUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ThemeUpdate {

    /**
     * The key of the theme to be set as the space theme.
     */
    @JsonProperty("themeKey")
    protected String themeKey;

    /**
     * Constructs a validated instance of {@link ThemeUpdate}.
     *
     * @param spec the specification to process
     */
    public ThemeUpdate(Consumer<ThemeUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ThemeUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ThemeUpdate(Consumer)} instead.
     * @param themeKey The key of the theme to be set as the space theme.
     */
    @ApiStatus.Internal
    public ThemeUpdate(String themeKey) {
        this.themeKey = themeKey;
    }

}
