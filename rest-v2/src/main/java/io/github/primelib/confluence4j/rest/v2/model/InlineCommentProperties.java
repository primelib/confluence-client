package io.github.primelib.confluence4j.rest.v2.model;

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
 * InlineCommentProperties
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
    "inlineMarkerRef",
    "inlineOriginalSelection",
    "inline-marker-ref",
    "inline-original-selection"
})
@JsonTypeName("InlineCommentProperties")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InlineCommentProperties {

    /**
     * Property value used to reference the highlighted element in DOM.
     */
    @JsonProperty("inlineMarkerRef")
    protected String inlineMarkerRef;

    /**
     * Text that is highlighted.
     */
    @JsonProperty("inlineOriginalSelection")
    protected String inlineOriginalSelection;

    /**
     * Deprecated, use {@code inlineMarkerRef} instead.
     */
    @JsonProperty("inline-marker-ref")
    protected String inlineMarkerRef;

    /**
     * Deprecated, use {@code inlineOriginalSelection} instead.
     */
    @JsonProperty("inline-original-selection")
    protected String inlineOriginalSelection;

    /**
     * Constructs a validated instance of {@link InlineCommentProperties}.
     *
     * @param spec the specification to process
     */
    public InlineCommentProperties(Consumer<InlineCommentProperties> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link InlineCommentProperties}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #InlineCommentProperties(Consumer)} instead.
     * @param inlineMarkerRef Property value used to reference the highlighted element in DOM.
     * @param inlineOriginalSelection Text that is highlighted.
     * @param inlineMarkerRef Deprecated, use {@code inlineMarkerRef} instead.
     * @param inlineOriginalSelection Deprecated, use {@code inlineOriginalSelection} instead.
     */
    @ApiStatus.Internal
    public InlineCommentProperties(String inlineMarkerRef, String inlineOriginalSelection, String inlineMarkerRef, String inlineOriginalSelection) {
        this.inlineMarkerRef = inlineMarkerRef;
        this.inlineOriginalSelection = inlineOriginalSelection;
        this.inlineMarkerRef = inlineMarkerRef;
        this.inlineOriginalSelection = inlineOriginalSelection;
    }

}
