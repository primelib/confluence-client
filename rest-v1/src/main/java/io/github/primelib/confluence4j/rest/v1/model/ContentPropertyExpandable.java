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
 * ContentPropertyExpandable
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
    "content",
    "additionalProperties"
})
@JsonTypeName("ContentProperty__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentPropertyExpandable {

    @JsonProperty("content")
    protected String content;

    @JsonProperty("additionalProperties")
    protected String additionalProperties;

    /**
     * Constructs a validated instance of {@link ContentPropertyExpandable}.
     *
     * @param spec the specification to process
     */
    public ContentPropertyExpandable(Consumer<ContentPropertyExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentPropertyExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentPropertyExpandable(Consumer)} instead.
     * @param content content
     * @param additionalProperties additionalProperties
     */
    @ApiStatus.Internal
    public ContentPropertyExpandable(String content, String additionalProperties) {
        this.content = content;
        this.additionalProperties = additionalProperties;
    }

}
