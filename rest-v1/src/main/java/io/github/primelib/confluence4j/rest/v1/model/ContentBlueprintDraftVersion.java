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
 * ContentBlueprintDraftVersion
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
    "number"
})
@JsonTypeName("ContentBlueprintDraft_version")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentBlueprintDraftVersion {

    /**
     * The version number. Set this to {@code 1}.
     */
    @JsonProperty("number")
    protected Integer number;

    /**
     * Constructs a validated instance of {@link ContentBlueprintDraftVersion}.
     *
     * @param spec the specification to process
     */
    public ContentBlueprintDraftVersion(Consumer<ContentBlueprintDraftVersion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentBlueprintDraftVersion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentBlueprintDraftVersion(Consumer)} instead.
     * @param number The version number. Set this to {@code 1}.
     */
    @ApiStatus.Internal
    public ContentBlueprintDraftVersion(Integer number) {
        this.number = number;
    }

}
