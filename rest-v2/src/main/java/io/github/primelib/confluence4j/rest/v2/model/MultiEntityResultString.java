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
 * MultiEntityResultString
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
@JsonTypeName("MultiEntityResult_String_")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MultiEntityResultString {

    @JsonProperty("results")
    protected List<Like> results;

    @JsonProperty("_links")
    protected MultiEntityResultAttachmentLinks _links;

    /**
     * Constructs a validated instance of {@link MultiEntityResultString}.
     *
     * @param spec the specification to process
     */
    public MultiEntityResultString(Consumer<MultiEntityResultString> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MultiEntityResultString}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MultiEntityResultString(Consumer)} instead.
     * @param results results
     * @param _links _links
     */
    @ApiStatus.Internal
    public MultiEntityResultString(List<Like> results, MultiEntityResultAttachmentLinks _links) {
        this.results = results;
        this._links = _links;
    }

}
