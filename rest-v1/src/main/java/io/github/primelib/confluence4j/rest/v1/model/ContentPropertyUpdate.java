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
 * ContentPropertyUpdate
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
    "value",
    "version"
})
@JsonTypeName("ContentPropertyUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentPropertyUpdate {

    @JsonProperty("value")
    protected ContentPropertyValue value;

    @JsonProperty("version")
    protected ContentPropertyUpdateVersion version;

    /**
     * Constructs a validated instance of {@link ContentPropertyUpdate}.
     *
     * @param spec the specification to process
     */
    public ContentPropertyUpdate(Consumer<ContentPropertyUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentPropertyUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentPropertyUpdate(Consumer)} instead.
     * @param value value
     * @param version version
     */
    @ApiStatus.Internal
    public ContentPropertyUpdate(ContentPropertyValue value, ContentPropertyUpdateVersion version) {
        this.value = value;
        this.version = version;
    }

}
