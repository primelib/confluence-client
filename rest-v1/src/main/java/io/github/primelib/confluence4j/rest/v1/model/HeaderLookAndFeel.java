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
 * HeaderLookAndFeel
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
    "button",
    "primaryNavigation",
    "secondaryNavigation",
    "search"
})
@JsonTypeName("HeaderLookAndFeel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HeaderLookAndFeel {

    @JsonProperty("backgroundColor")
    protected String backgroundColor;

    @JsonProperty("button")
    protected ButtonLookAndFeel button;

    @JsonProperty("primaryNavigation")
    protected NavigationLookAndFeel primaryNavigation;

    @JsonProperty("secondaryNavigation")
    protected NavigationLookAndFeel secondaryNavigation;

    @JsonProperty("search")
    protected SearchFieldLookAndFeel search;

    /**
     * Constructs a validated instance of {@link HeaderLookAndFeel}.
     *
     * @param spec the specification to process
     */
    public HeaderLookAndFeel(Consumer<HeaderLookAndFeel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link HeaderLookAndFeel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #HeaderLookAndFeel(Consumer)} instead.
     * @param backgroundColor backgroundColor
     * @param button button
     * @param primaryNavigation primaryNavigation
     * @param secondaryNavigation secondaryNavigation
     * @param search search
     */
    @ApiStatus.Internal
    public HeaderLookAndFeel(String backgroundColor, ButtonLookAndFeel button, NavigationLookAndFeel primaryNavigation, NavigationLookAndFeel secondaryNavigation, SearchFieldLookAndFeel search) {
        this.backgroundColor = backgroundColor;
        this.button = button;
        this.primaryNavigation = primaryNavigation;
        this.secondaryNavigation = secondaryNavigation;
        this.search = search;
    }

}
