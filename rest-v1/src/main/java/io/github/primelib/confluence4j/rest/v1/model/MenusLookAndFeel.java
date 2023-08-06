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
 * MenusLookAndFeel
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
    "hoverOrFocus",
    "color"
})
@JsonTypeName("MenusLookAndFeel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MenusLookAndFeel {

    @JsonProperty("hoverOrFocus")
    protected MenusLookAndFeelHoverOrFocus hoverOrFocus;

    @JsonProperty("color")
    protected String color;

    /**
     * Constructs a validated instance of {@link MenusLookAndFeel}.
     *
     * @param spec the specification to process
     */
    public MenusLookAndFeel(Consumer<MenusLookAndFeel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MenusLookAndFeel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MenusLookAndFeel(Consumer)} instead.
     * @param hoverOrFocus hoverOrFocus
     * @param color color
     */
    @ApiStatus.Internal
    public MenusLookAndFeel(MenusLookAndFeelHoverOrFocus hoverOrFocus, String color) {
        this.hoverOrFocus = hoverOrFocus;
        this.color = color;
    }

}
