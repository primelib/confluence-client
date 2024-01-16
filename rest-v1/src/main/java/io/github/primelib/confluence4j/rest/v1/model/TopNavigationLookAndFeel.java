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
 * TopNavigationLookAndFeel
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
@JsonTypeName("TopNavigationLookAndFeel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TopNavigationLookAndFeel {

    @JsonProperty("color")
    protected String color;

    @JsonProperty("highlightColor")
    protected String highlightColor;

    @JsonProperty("hoverOrFocus")
    protected TopNavigationLookAndFeelHoverOrFocus hoverOrFocus;

    /**
     * Constructs a validated instance of {@link TopNavigationLookAndFeel}.
     *
     * @param spec the specification to process
     */
    public TopNavigationLookAndFeel(Consumer<TopNavigationLookAndFeel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TopNavigationLookAndFeel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TopNavigationLookAndFeel(Consumer)} instead.
     * @param color color
     * @param highlightColor highlightColor
     * @param hoverOrFocus hoverOrFocus
     */
    @ApiStatus.Internal
    public TopNavigationLookAndFeel(String color, String highlightColor, TopNavigationLookAndFeelHoverOrFocus hoverOrFocus) {
        this.color = color;
        this.highlightColor = highlightColor;
        this.hoverOrFocus = hoverOrFocus;
    }

}
