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
 * ContentStateSettings
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
    "contentStatesAllowed",
    "customContentStatesAllowed",
    "spaceContentStatesAllowed",
    "spaceContentStates"
})
@JsonTypeName("ContentStateSettings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentStateSettings {

    /**
     * Whether users can place any content states on content
     */
    @JsonProperty("contentStatesAllowed")
    protected Boolean contentStatesAllowed;

    /**
     * Whether users can place their custom states on content
     */
    @JsonProperty("customContentStatesAllowed")
    protected Boolean customContentStatesAllowed;

    /**
     * Whether users can place space suggested states on content
     */
    @JsonProperty("spaceContentStatesAllowed")
    protected Boolean spaceContentStatesAllowed;

    /**
     * space suggested content states that users can choose from
     */
    @JsonProperty("spaceContentStates")
    protected List<ContentState> spaceContentStates;

    /**
     * Constructs a validated instance of {@link ContentStateSettings}.
     *
     * @param spec the specification to process
     */
    public ContentStateSettings(Consumer<ContentStateSettings> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentStateSettings}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentStateSettings(Consumer)} instead.
     * @param contentStatesAllowed Whether users can place any content states on content
     * @param customContentStatesAllowed Whether users can place their custom states on content
     * @param spaceContentStatesAllowed Whether users can place space suggested states on content
     * @param spaceContentStates space suggested content states that users can choose from
     */
    @ApiStatus.Internal
    public ContentStateSettings(Boolean contentStatesAllowed, Boolean customContentStatesAllowed, Boolean spaceContentStatesAllowed, List<ContentState> spaceContentStates) {
        this.contentStatesAllowed = contentStatesAllowed;
        this.customContentStatesAllowed = customContentStatesAllowed;
        this.spaceContentStatesAllowed = spaceContentStatesAllowed;
        this.spaceContentStates = spaceContentStates;
    }

}
