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
 * ContentCreateAncestorsInner
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
@JsonTypeName("ContentCreate_ancestors_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentCreateAncestorsInner {

    /**
     * The {@code id} of the parent content.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Constructs a validated instance of {@link ContentCreateAncestorsInner}.
     *
     * @param spec the specification to process
     */
    public ContentCreateAncestorsInner(Consumer<ContentCreateAncestorsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentCreateAncestorsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentCreateAncestorsInner(Consumer)} instead.
     * @param id The {@code id} of the parent content.
     */
    @ApiStatus.Internal
    public ContentCreateAncestorsInner(String id) {
        this.id = id;
    }

}
