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
 * ContentPropertyUpdateRequest
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
    "key",
    "value",
    "version"
})
@JsonTypeName("ContentPropertyUpdateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentPropertyUpdateRequest {

    /**
     * Key of the content property
     */
    @JsonProperty("key")
    protected String key;

    /**
     * Value of the content property.
     */
    @JsonProperty("value")
    protected Object value;

    @JsonProperty("version")
    protected ContentPropertyUpdateRequestVersion version;

    /**
     * Constructs a validated instance of {@link ContentPropertyUpdateRequest}.
     *
     * @param spec the specification to process
     */
    public ContentPropertyUpdateRequest(Consumer<ContentPropertyUpdateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentPropertyUpdateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentPropertyUpdateRequest(Consumer)} instead.
     * @param key Key of the content property
     * @param value Value of the content property.
     * @param version version
     */
    @ApiStatus.Internal
    public ContentPropertyUpdateRequest(String key, Object value, ContentPropertyUpdateRequestVersion version) {
        this.key = key;
        this.value = value;
        this.version = version;
    }

}
