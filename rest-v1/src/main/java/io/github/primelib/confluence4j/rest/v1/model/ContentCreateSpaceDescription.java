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
 * ContentCreateSpaceDescription
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
    "plain",
    "view",
    "_expandable"
})
@JsonTypeName("ContentCreate_space_description")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentCreateSpaceDescription {

    @JsonProperty("plain")
    protected SpaceDescription plain;

    @JsonProperty("view")
    protected SpaceDescription view;

    @JsonProperty("_expandable")
    protected ContentCreateSpaceDescriptionExpandable _expandable;

    /**
     * Constructs a validated instance of {@link ContentCreateSpaceDescription}.
     *
     * @param spec the specification to process
     */
    public ContentCreateSpaceDescription(Consumer<ContentCreateSpaceDescription> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentCreateSpaceDescription}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentCreateSpaceDescription(Consumer)} instead.
     * @param plain plain
     * @param view view
     * @param _expandable _expandable
     */
    @ApiStatus.Internal
    public ContentCreateSpaceDescription(SpaceDescription plain, SpaceDescription view, ContentCreateSpaceDescriptionExpandable _expandable) {
        this.plain = plain;
        this.view = view;
        this._expandable = _expandable;
    }

}
