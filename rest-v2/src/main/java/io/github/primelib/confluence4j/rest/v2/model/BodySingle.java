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
 * BodySingle
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
    "storage",
    "atlas_doc_format",
    "view"
})
@JsonTypeName("BodySingle")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BodySingle {

    @JsonProperty("storage")
    protected BodyType storage;

    @JsonProperty("atlas_doc_format")
    protected BodyType atlasDocFormat;

    @JsonProperty("view")
    protected BodyType view;

    /**
     * Constructs a validated instance of {@link BodySingle}.
     *
     * @param spec the specification to process
     */
    public BodySingle(Consumer<BodySingle> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BodySingle}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BodySingle(Consumer)} instead.
     * @param storage storage
     * @param atlasDocFormat atlasDocFormat
     * @param view view
     */
    @ApiStatus.Internal
    public BodySingle(BodyType storage, BodyType atlasDocFormat, BodyType view) {
        this.storage = storage;
        this.atlasDocFormat = atlasDocFormat;
        this.view = view;
    }

}
