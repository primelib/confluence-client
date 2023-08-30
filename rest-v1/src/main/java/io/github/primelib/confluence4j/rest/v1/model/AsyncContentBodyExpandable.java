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
 * AsyncContentBodyExpandable
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
    "content",
    "embeddedContent",
    "webresource",
    "mediaToken"
})
@JsonTypeName("AsyncContentBody__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AsyncContentBodyExpandable {

    @JsonProperty("content")
    protected String content;

    @JsonProperty("embeddedContent")
    protected String embeddedContent;

    @JsonProperty("webresource")
    protected String webresource;

    @JsonProperty("mediaToken")
    protected String mediaToken;

    /**
     * Constructs a validated instance of {@link AsyncContentBodyExpandable}.
     *
     * @param spec the specification to process
     */
    public AsyncContentBodyExpandable(Consumer<AsyncContentBodyExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AsyncContentBodyExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AsyncContentBodyExpandable(Consumer)} instead.
     * @param content content
     * @param embeddedContent embeddedContent
     * @param webresource webresource
     * @param mediaToken mediaToken
     */
    @ApiStatus.Internal
    public AsyncContentBodyExpandable(String content, String embeddedContent, String webresource, String mediaToken) {
        this.content = content;
        this.embeddedContent = embeddedContent;
        this.webresource = webresource;
        this.mediaToken = mediaToken;
    }

}
