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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MultiEntityResultLabel
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
    "results",
    "_links"
})
@JsonTypeName("MultiEntityResult_Label_")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MultiEntityResultLabel {

    @JsonProperty("results")
    protected List<Label> results;

    @JsonProperty("_links")
    protected MultiEntityResultAttachmentLinks _links;

    /**
     * Constructs a validated instance of {@link MultiEntityResultLabel}.
     *
     * @param spec the specification to process
     */
    public MultiEntityResultLabel(Consumer<MultiEntityResultLabel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MultiEntityResultLabel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MultiEntityResultLabel(Consumer)} instead.
     * @param results results
     * @param _links _links
     */
    @ApiStatus.Internal
    public MultiEntityResultLabel(List<Label> results, MultiEntityResultAttachmentLinks _links) {
        this.results = results;
        this._links = _links;
    }

}
