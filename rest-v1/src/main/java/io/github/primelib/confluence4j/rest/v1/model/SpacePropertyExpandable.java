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
 * SpacePropertyExpandable
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
    "version",
    "space"
})
@JsonTypeName("SpaceProperty__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePropertyExpandable {

    @JsonProperty("version")
    protected String version;

    @JsonProperty("space")
    protected String space;

    /**
     * Constructs a validated instance of {@link SpacePropertyExpandable}.
     *
     * @param spec the specification to process
     */
    public SpacePropertyExpandable(Consumer<SpacePropertyExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePropertyExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePropertyExpandable(Consumer)} instead.
     * @param version version
     * @param space space
     */
    @ApiStatus.Internal
    public SpacePropertyExpandable(String version, String space) {
        this.version = version;
        this.space = space;
    }

}
