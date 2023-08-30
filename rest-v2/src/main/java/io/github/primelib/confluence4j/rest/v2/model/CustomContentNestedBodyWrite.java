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
 * CustomContentNestedBodyWrite
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
    "raw"
})
@JsonTypeName("CustomContentNestedBodyWrite")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomContentNestedBodyWrite {

    @JsonProperty("storage")
    protected CustomContentBodyWrite storage;

    @JsonProperty("atlas_doc_format")
    protected CustomContentBodyWrite atlasDocFormat;

    @JsonProperty("raw")
    protected CustomContentBodyWrite raw;

    /**
     * Constructs a validated instance of {@link CustomContentNestedBodyWrite}.
     *
     * @param spec the specification to process
     */
    public CustomContentNestedBodyWrite(Consumer<CustomContentNestedBodyWrite> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomContentNestedBodyWrite}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomContentNestedBodyWrite(Consumer)} instead.
     * @param storage storage
     * @param atlasDocFormat atlasDocFormat
     * @param raw raw
     */
    @ApiStatus.Internal
    public CustomContentNestedBodyWrite(CustomContentBodyWrite storage, CustomContentBodyWrite atlasDocFormat, CustomContentBodyWrite raw) {
        this.storage = storage;
        this.atlasDocFormat = atlasDocFormat;
        this.raw = raw;
    }

}
