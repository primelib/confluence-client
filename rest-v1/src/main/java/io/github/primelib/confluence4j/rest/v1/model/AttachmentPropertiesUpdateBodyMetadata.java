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
 * AttachmentPropertiesUpdateBodyMetadata
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
    "mediaType"
})
@JsonTypeName("AttachmentPropertiesUpdateBody_metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentPropertiesUpdateBodyMetadata {

    @JsonProperty("mediaType")
    protected String mediaType;

    /**
     * Constructs a validated instance of {@link AttachmentPropertiesUpdateBodyMetadata}.
     *
     * @param spec the specification to process
     */
    public AttachmentPropertiesUpdateBodyMetadata(Consumer<AttachmentPropertiesUpdateBodyMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttachmentPropertiesUpdateBodyMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttachmentPropertiesUpdateBodyMetadata(Consumer)} instead.
     * @param mediaType mediaType
     */
    @ApiStatus.Internal
    public AttachmentPropertiesUpdateBodyMetadata(String mediaType) {
        this.mediaType = mediaType;
    }

}
