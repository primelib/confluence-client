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
 * TopNavigationLookAndFeelHoverOrFocus
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
    "backgroundColor",
    "color"
})
@JsonTypeName("TopNavigationLookAndFeel_hoverOrFocus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TopNavigationLookAndFeelHoverOrFocus {

    @JsonProperty("backgroundColor")
    protected String backgroundColor;

    @JsonProperty("color")
    protected String color;

    /**
     * Constructs a validated instance of {@link TopNavigationLookAndFeelHoverOrFocus}.
     *
     * @param spec the specification to process
     */
    public TopNavigationLookAndFeelHoverOrFocus(Consumer<TopNavigationLookAndFeelHoverOrFocus> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TopNavigationLookAndFeelHoverOrFocus}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TopNavigationLookAndFeelHoverOrFocus(Consumer)} instead.
     * @param backgroundColor backgroundColor
     * @param color color
     */
    @ApiStatus.Internal
    public TopNavigationLookAndFeelHoverOrFocus(String backgroundColor, String color) {
        this.backgroundColor = backgroundColor;
        this.color = color;
    }

}
