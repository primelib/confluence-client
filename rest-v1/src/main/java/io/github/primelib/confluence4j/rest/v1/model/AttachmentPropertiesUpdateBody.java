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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttachmentPropertiesUpdateBody
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
    "id",
    "type",
    "status",
    "title",
    "container",
    "metadata",
    "extensions",
    "version"
})
@JsonTypeName("AttachmentPropertiesUpdateBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentPropertiesUpdateBody {

    @JsonProperty("id")
    protected String id;

    /**
     * Set this to "attachment"
     */
    @JsonProperty("type")
    protected String type;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("title")
    protected String title;

    /**
     * Container for content. This can be either a space (containing a page or blogpost) or a page/blog post (containing an attachment or comment)
     */
    @JsonProperty("container")
    protected Map<String, Object> container;

    @JsonProperty("metadata")
    protected AttachmentPropertiesUpdateBodyMetadata metadata;

    @JsonProperty("extensions")
    protected Object extensions;

    @JsonProperty("version")
    protected Version version;

    /**
     * Constructs a validated instance of {@link AttachmentPropertiesUpdateBody}.
     *
     * @param spec the specification to process
     */
    public AttachmentPropertiesUpdateBody(Consumer<AttachmentPropertiesUpdateBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttachmentPropertiesUpdateBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttachmentPropertiesUpdateBody(Consumer)} instead.
     * @param id id
     * @param type Set this to "attachment"
     * @param status status
     * @param title title
     * @param container Container for content. This can be either a space (containing a page or blogpost) or a page/blog post (containing an attachment or comment)
     * @param metadata metadata
     * @param extensions extensions
     * @param version version
     */
    @ApiStatus.Internal
    public AttachmentPropertiesUpdateBody(String id, String type, String status, String title, Map<String, Object> container, AttachmentPropertiesUpdateBodyMetadata metadata, Object extensions, Version version) {
        this.id = id;
        this.type = type;
        this.status = status;
        this.title = title;
        this.container = container;
        this.metadata = metadata;
        this.extensions = extensions;
        this.version = version;
    }

}
