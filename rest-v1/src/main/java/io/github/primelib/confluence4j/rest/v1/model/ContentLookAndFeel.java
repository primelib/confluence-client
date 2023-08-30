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
 * ContentLookAndFeel
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
    "screen",
    "container",
    "header",
    "body"
})
@JsonTypeName("ContentLookAndFeel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentLookAndFeel {

    @JsonProperty("screen")
    protected ScreenLookAndFeel screen;

    @JsonProperty("container")
    protected ContainerLookAndFeel container;

    @JsonProperty("header")
    protected ContainerLookAndFeel header;

    @JsonProperty("body")
    protected ContainerLookAndFeel body;

    /**
     * Constructs a validated instance of {@link ContentLookAndFeel}.
     *
     * @param spec the specification to process
     */
    public ContentLookAndFeel(Consumer<ContentLookAndFeel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentLookAndFeel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentLookAndFeel(Consumer)} instead.
     * @param screen screen
     * @param container container
     * @param header header
     * @param body body
     */
    @ApiStatus.Internal
    public ContentLookAndFeel(ScreenLookAndFeel screen, ContainerLookAndFeel container, ContainerLookAndFeel header, ContainerLookAndFeel body) {
        this.screen = screen;
        this.container = container;
        this.header = header;
        this.body = body;
    }

}
