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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AsyncContentBodyMediaToken
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
    "collectionIds",
    "contentId",
    "expiryDateTime",
    "fileIds",
    "token"
})
@JsonTypeName("AsyncContentBody_mediaToken")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AsyncContentBodyMediaToken {

    @JsonProperty("collectionIds")
    protected List<String> collectionIds;

    @JsonProperty("contentId")
    protected String contentId;

    @JsonProperty("expiryDateTime")
    protected String expiryDateTime;

    @JsonProperty("fileIds")
    protected List<String> fileIds;

    @JsonProperty("token")
    protected String token;

    /**
     * Constructs a validated instance of {@link AsyncContentBodyMediaToken}.
     *
     * @param spec the specification to process
     */
    public AsyncContentBodyMediaToken(Consumer<AsyncContentBodyMediaToken> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AsyncContentBodyMediaToken}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AsyncContentBodyMediaToken(Consumer)} instead.
     * @param collectionIds collectionIds
     * @param contentId contentId
     * @param expiryDateTime expiryDateTime
     * @param fileIds fileIds
     * @param token token
     */
    @ApiStatus.Internal
    public AsyncContentBodyMediaToken(List<String> collectionIds, String contentId, String expiryDateTime, List<String> fileIds, String token) {
        this.collectionIds = collectionIds;
        this.contentId = contentId;
        this.expiryDateTime = expiryDateTime;
        this.fileIds = fileIds;
        this.token = token;
    }

}
