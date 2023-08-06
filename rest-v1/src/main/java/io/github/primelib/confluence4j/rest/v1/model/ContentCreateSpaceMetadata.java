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
 * ContentCreateSpaceMetadata
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
    "labels",
    "_expandable"
})
@JsonTypeName("ContentCreate_space_metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentCreateSpaceMetadata {

    @JsonProperty("labels")
    protected LabelArray labels;

    @JsonProperty("_expandable")
    protected Object _expandable;

    /**
     * Constructs a validated instance of {@link ContentCreateSpaceMetadata}.
     *
     * @param spec the specification to process
     */
    public ContentCreateSpaceMetadata(Consumer<ContentCreateSpaceMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentCreateSpaceMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentCreateSpaceMetadata(Consumer)} instead.
     * @param labels labels
     * @param _expandable _expandable
     */
    @ApiStatus.Internal
    public ContentCreateSpaceMetadata(LabelArray labels, Object _expandable) {
        this.labels = labels;
        this._expandable = _expandable;
    }

}
