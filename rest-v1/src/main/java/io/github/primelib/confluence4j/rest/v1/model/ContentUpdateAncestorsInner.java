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
 * ContentUpdateAncestorsInner
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
    "id"
})
@JsonTypeName("ContentUpdate_ancestors_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentUpdateAncestorsInner {

    @JsonProperty("id")
    protected ContentUpdateAncestorsInnerId id;

    /**
     * Constructs a validated instance of {@link ContentUpdateAncestorsInner}.
     *
     * @param spec the specification to process
     */
    public ContentUpdateAncestorsInner(Consumer<ContentUpdateAncestorsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentUpdateAncestorsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentUpdateAncestorsInner(Consumer)} instead.
     * @param id id
     */
    @ApiStatus.Internal
    public ContentUpdateAncestorsInner(ContentUpdateAncestorsInnerId id) {
        this.id = id;
    }

}
