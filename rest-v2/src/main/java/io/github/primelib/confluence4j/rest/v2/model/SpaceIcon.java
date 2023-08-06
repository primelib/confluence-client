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
 * SpaceIcon
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
    "path"
})
@JsonTypeName("SpaceIcon")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpaceIcon {

    /**
     * The path (relative to base URL) at which the space's icon can be retrieved. The format should be like {@code /wiki/download/...} or {@code /wiki/aa-avatar/...}
     */
    @JsonProperty("path")
    protected String path;

    /**
     * Constructs a validated instance of {@link SpaceIcon}.
     *
     * @param spec the specification to process
     */
    public SpaceIcon(Consumer<SpaceIcon> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpaceIcon}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpaceIcon(Consumer)} instead.
     * @param path The path (relative to base URL) at which the space's icon can be retrieved. The format should be like {@code /wiki/download/...} or {@code /wiki/aa-avatar/...}
     */
    @ApiStatus.Internal
    public SpaceIcon(String path) {
        this.path = path;
    }

}
