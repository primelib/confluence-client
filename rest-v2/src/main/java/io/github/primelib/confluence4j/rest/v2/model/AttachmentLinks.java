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
 * AttachmentLinks
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
    "webui",
    "download"
})
@JsonTypeName("AttachmentLinks")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentLinks {

    /**
     * Web UI link of the content.
     */
    @JsonProperty("webui")
    protected String webui;

    /**
     * Download link of the content.
     */
    @JsonProperty("download")
    protected String download;

    /**
     * Constructs a validated instance of {@link AttachmentLinks}.
     *
     * @param spec the specification to process
     */
    public AttachmentLinks(Consumer<AttachmentLinks> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttachmentLinks}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttachmentLinks(Consumer)} instead.
     * @param webui Web UI link of the content.
     * @param download Download link of the content.
     */
    @ApiStatus.Internal
    public AttachmentLinks(String webui, String download) {
        this.webui = webui;
        this.download = download;
    }

}
