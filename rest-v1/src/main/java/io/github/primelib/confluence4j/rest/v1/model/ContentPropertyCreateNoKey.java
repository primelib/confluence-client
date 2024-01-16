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
 * ContentPropertyCreateNoKey
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
    "value"
})
@JsonTypeName("ContentPropertyCreateNoKey")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentPropertyCreateNoKey {

    @JsonProperty("value")
    protected ContentPropertyValue value;

    /**
     * Constructs a validated instance of {@link ContentPropertyCreateNoKey}.
     *
     * @param spec the specification to process
     */
    public ContentPropertyCreateNoKey(Consumer<ContentPropertyCreateNoKey> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentPropertyCreateNoKey}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentPropertyCreateNoKey(Consumer)} instead.
     * @param value value
     */
    @ApiStatus.Internal
    public ContentPropertyCreateNoKey(ContentPropertyValue value) {
        this.value = value;
    }

}
