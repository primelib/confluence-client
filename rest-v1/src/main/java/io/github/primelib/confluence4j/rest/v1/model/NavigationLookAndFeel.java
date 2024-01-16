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
 * NavigationLookAndFeel
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
    "color",
    "highlightColor",
    "hoverOrFocus"
})
@JsonTypeName("NavigationLookAndFeel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NavigationLookAndFeel {

    @JsonProperty("color")
    protected String color;

    @JsonProperty("highlightColor")
    protected String highlightColor;

    @JsonProperty("hoverOrFocus")
    protected NavigationLookAndFeelHoverOrFocus hoverOrFocus;

    /**
     * Constructs a validated instance of {@link NavigationLookAndFeel}.
     *
     * @param spec the specification to process
     */
    public NavigationLookAndFeel(Consumer<NavigationLookAndFeel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NavigationLookAndFeel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NavigationLookAndFeel(Consumer)} instead.
     * @param color color
     * @param highlightColor highlightColor
     * @param hoverOrFocus hoverOrFocus
     */
    @ApiStatus.Internal
    public NavigationLookAndFeel(String color, String highlightColor, NavigationLookAndFeelHoverOrFocus hoverOrFocus) {
        this.color = color;
        this.highlightColor = highlightColor;
        this.hoverOrFocus = hoverOrFocus;
    }

}
