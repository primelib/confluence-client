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
 * LabelDetails
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
    "label",
    "associatedContents"
})
@JsonTypeName("LabelDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LabelDetails {

    @JsonProperty("label")
    protected Label label;

    @JsonProperty("associatedContents")
    protected LabeledContentPageResponse associatedContents;

    /**
     * Constructs a validated instance of {@link LabelDetails}.
     *
     * @param spec the specification to process
     */
    public LabelDetails(Consumer<LabelDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LabelDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LabelDetails(Consumer)} instead.
     * @param label label
     * @param associatedContents associatedContents
     */
    @ApiStatus.Internal
    public LabelDetails(Label label, LabeledContentPageResponse associatedContents) {
        this.label = label;
        this.associatedContents = associatedContents;
    }

}
