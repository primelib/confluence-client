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
 * ContentBlueprintDraftSpace
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
    "key"
})
@JsonTypeName("ContentBlueprintDraft_space")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentBlueprintDraftSpace {

    /**
     * The key of the space
     */
    @JsonProperty("key")
    protected String key;

    /**
     * Constructs a validated instance of {@link ContentBlueprintDraftSpace}.
     *
     * @param spec the specification to process
     */
    public ContentBlueprintDraftSpace(Consumer<ContentBlueprintDraftSpace> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentBlueprintDraftSpace}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentBlueprintDraftSpace(Consumer)} instead.
     * @param key The key of the space
     */
    @ApiStatus.Internal
    public ContentBlueprintDraftSpace(String key) {
        this.key = key;
    }

}
