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
 * LabeledContent
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
    "contentType",
    "contentId",
    "title"
})
@JsonTypeName("LabeledContent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LabeledContent {

    @JsonProperty("contentType")
    protected LabeledContentType contentType;

    @JsonProperty("contentId")
    protected Long contentId;

    /**
     * Title of the content.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * Constructs a validated instance of {@link LabeledContent}.
     *
     * @param spec the specification to process
     */
    public LabeledContent(Consumer<LabeledContent> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LabeledContent}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LabeledContent(Consumer)} instead.
     * @param contentType contentType
     * @param contentId contentId
     * @param title Title of the content.
     */
    @ApiStatus.Internal
    public LabeledContent(LabeledContentType contentType, Long contentId, String title) {
        this.contentType = contentType;
        this.contentId = contentId;
        this.title = title;
    }

}
