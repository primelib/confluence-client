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
 * MultiEntityResultSpaceProperty
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
    "results"
})
@JsonTypeName("MultiEntityResult_SpaceProperty_")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MultiEntityResultSpaceProperty {

    @JsonProperty("results")
    protected List<SpaceProperty> results;

    /**
     * Constructs a validated instance of {@link MultiEntityResultSpaceProperty}.
     *
     * @param spec the specification to process
     */
    public MultiEntityResultSpaceProperty(Consumer<MultiEntityResultSpaceProperty> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MultiEntityResultSpaceProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MultiEntityResultSpaceProperty(Consumer)} instead.
     * @param results results
     */
    @ApiStatus.Internal
    public MultiEntityResultSpaceProperty(List<SpaceProperty> results) {
        this.results = results;
    }

}
