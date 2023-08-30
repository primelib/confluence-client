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
 * ContentRestrictionExpandable
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
    "restrictions",
    "content"
})
@JsonTypeName("ContentRestriction__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentRestrictionExpandable {

    @JsonProperty("restrictions")
    protected String restrictions;

    @JsonProperty("content")
    protected String content;

    /**
     * Constructs a validated instance of {@link ContentRestrictionExpandable}.
     *
     * @param spec the specification to process
     */
    public ContentRestrictionExpandable(Consumer<ContentRestrictionExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentRestrictionExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentRestrictionExpandable(Consumer)} instead.
     * @param restrictions restrictions
     * @param content content
     */
    @ApiStatus.Internal
    public ContentRestrictionExpandable(String restrictions, String content) {
        this.restrictions = restrictions;
        this.content = content;
    }

}
