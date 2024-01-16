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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AvailableContentStates
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
    "spaceContentStates",
    "customContentStates"
})
@JsonTypeName("AvailableContentStates")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AvailableContentStates {

    /**
     * Space suggested content states that can be used in the space. This can be null if space content states are disabled in the space. This list can be empty if there are no space content states defined in the space. All spaces start with 3 default space content states, and this can be modified in the UI under space settings.
     */
    @JsonProperty("spaceContentStates")
    protected List<ContentState> spaceContentStates;

    /**
     * Custom content states that can be used by the user on the content of this call. This can be null if custom content states are disabled in the space of the content. This list can be empty if there are no custom content states defined by the user. This will at most have 3 of the most recently published content states.
     * Only the calling user has access to place these states on content, but all users can see these states once they are placed.
     */
    @JsonProperty("customContentStates")
    protected List<ContentState> customContentStates;

    /**
     * Constructs a validated instance of {@link AvailableContentStates}.
     *
     * @param spec the specification to process
     */
    public AvailableContentStates(Consumer<AvailableContentStates> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AvailableContentStates}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AvailableContentStates(Consumer)} instead.
     * @param spaceContentStates Space suggested content states that can be used in the space. This can be null if space content states are disabled in the space. This list can be empty if there are no space content states defined in the space. All spaces start with 3 default space content states, and this can be modified in the UI under space settings.
     * @param customContentStates Custom content states that can be used by the user on the content of this call. This can be null if custom content states are disabled in the space of the content. This list can be empty if there are no custom content states defined by the user. This will at most have 3 of the most recently published content states.  Only the calling user has access to place these states on content, but all users can see these states once they are placed.
     */
    @ApiStatus.Internal
    public AvailableContentStates(List<ContentState> spaceContentStates, List<ContentState> customContentStates) {
        this.spaceContentStates = spaceContentStates;
        this.customContentStates = customContentStates;
    }

}
