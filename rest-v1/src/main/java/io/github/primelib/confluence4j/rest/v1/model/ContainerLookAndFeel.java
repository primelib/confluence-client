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
 * ContainerLookAndFeel
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
    "background",
    "backgroundAttachment",
    "backgroundBlendMode",
    "backgroundClip",
    "backgroundColor",
    "backgroundImage",
    "backgroundOrigin",
    "backgroundPosition",
    "backgroundRepeat",
    "backgroundSize",
    "padding",
    "borderRadius"
})
@JsonTypeName("ContainerLookAndFeel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContainerLookAndFeel {

    @JsonProperty("background")
    protected String background;

    @JsonProperty("backgroundAttachment")
    protected String backgroundAttachment;

    @JsonProperty("backgroundBlendMode")
    protected String backgroundBlendMode;

    @JsonProperty("backgroundClip")
    protected String backgroundClip;

    @JsonProperty("backgroundColor")
    protected String backgroundColor;

    @JsonProperty("backgroundImage")
    protected String backgroundImage;

    @JsonProperty("backgroundOrigin")
    protected String backgroundOrigin;

    @JsonProperty("backgroundPosition")
    protected String backgroundPosition;

    @JsonProperty("backgroundRepeat")
    protected String backgroundRepeat;

    @JsonProperty("backgroundSize")
    protected String backgroundSize;

    @JsonProperty("padding")
    protected String padding;

    @JsonProperty("borderRadius")
    protected String borderRadius;

    /**
     * Constructs a validated instance of {@link ContainerLookAndFeel}.
     *
     * @param spec the specification to process
     */
    public ContainerLookAndFeel(Consumer<ContainerLookAndFeel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContainerLookAndFeel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContainerLookAndFeel(Consumer)} instead.
     * @param background background
     * @param backgroundAttachment backgroundAttachment
     * @param backgroundBlendMode backgroundBlendMode
     * @param backgroundClip backgroundClip
     * @param backgroundColor backgroundColor
     * @param backgroundImage backgroundImage
     * @param backgroundOrigin backgroundOrigin
     * @param backgroundPosition backgroundPosition
     * @param backgroundRepeat backgroundRepeat
     * @param backgroundSize backgroundSize
     * @param padding padding
     * @param borderRadius borderRadius
     */
    @ApiStatus.Internal
    public ContainerLookAndFeel(String background, String backgroundAttachment, String backgroundBlendMode, String backgroundClip, String backgroundColor, String backgroundImage, String backgroundOrigin, String backgroundPosition, String backgroundRepeat, String backgroundSize, String padding, String borderRadius) {
        this.background = background;
        this.backgroundAttachment = backgroundAttachment;
        this.backgroundBlendMode = backgroundBlendMode;
        this.backgroundClip = backgroundClip;
        this.backgroundColor = backgroundColor;
        this.backgroundImage = backgroundImage;
        this.backgroundOrigin = backgroundOrigin;
        this.backgroundPosition = backgroundPosition;
        this.backgroundRepeat = backgroundRepeat;
        this.backgroundSize = backgroundSize;
        this.padding = padding;
        this.borderRadius = borderRadius;
    }

}
