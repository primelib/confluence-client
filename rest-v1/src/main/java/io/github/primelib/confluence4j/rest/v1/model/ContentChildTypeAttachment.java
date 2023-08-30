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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentChildTypeAttachment
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
    "_links"
})
@JsonTypeName("ContentChildType_attachment")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentChildTypeAttachment {

    @JsonProperty("value")
    protected Boolean value;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link ContentChildTypeAttachment}.
     *
     * @param spec the specification to process
     */
    public ContentChildTypeAttachment(Consumer<ContentChildTypeAttachment> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentChildTypeAttachment}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentChildTypeAttachment(Consumer)} instead.
     * @param value value
     * @param _links _links
     */
    @ApiStatus.Internal
    public ContentChildTypeAttachment(Boolean value, Map<String, String> _links) {
        this.value = value;
        this._links = _links;
    }

}
