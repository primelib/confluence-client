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
 * AttachmentUpdateMetadata
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
    "mediaType",
    "comment"
})
@JsonTypeName("AttachmentUpdate_metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentUpdateMetadata {

    /**
     * The media type of the attachment, e.g. 'img/jpg'.
     */
    @JsonProperty("mediaType")
    protected String mediaType;

    /**
     * The comment for this update.
     */
    @JsonProperty("comment")
    protected String comment;

    /**
     * Constructs a validated instance of {@link AttachmentUpdateMetadata}.
     *
     * @param spec the specification to process
     */
    public AttachmentUpdateMetadata(Consumer<AttachmentUpdateMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttachmentUpdateMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttachmentUpdateMetadata(Consumer)} instead.
     * @param mediaType The media type of the attachment, e.g. 'img/jpg'.
     * @param comment The comment for this update.
     */
    @ApiStatus.Internal
    public AttachmentUpdateMetadata(String mediaType, String comment) {
        this.mediaType = mediaType;
        this.comment = comment;
    }

}
