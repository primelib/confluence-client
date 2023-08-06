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
 * CreateInlineCommentModelInlineCommentProperties
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
    "textSelection",
    "textSelectionMatchCount",
    "textSelectionMatchIndex"
})
@JsonTypeName("CreateInlineCommentModel_inlineCommentProperties")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateInlineCommentModelInlineCommentProperties {

    /**
     * The text to highlight
     */
    @JsonProperty("textSelection")
    protected String textSelection;

    /**
     * The number of matches for the selected text on the page (should be strictly greater than textSelectionMatchIndex)
     */
    @JsonProperty("textSelectionMatchCount")
    protected Integer textSelectionMatchCount;

    /**
     * The match index to highlight. This is zero-based. E.g. if you have 3 occurrences of "hello world" on a page
     * and you want to highlight the second occurrence, you should pass 1 for textSelectionMatchIndex and 3 for textSelectionMatchCount.
     */
    @JsonProperty("textSelectionMatchIndex")
    protected Integer textSelectionMatchIndex;

    /**
     * Constructs a validated instance of {@link CreateInlineCommentModelInlineCommentProperties}.
     *
     * @param spec the specification to process
     */
    public CreateInlineCommentModelInlineCommentProperties(Consumer<CreateInlineCommentModelInlineCommentProperties> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateInlineCommentModelInlineCommentProperties}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateInlineCommentModelInlineCommentProperties(Consumer)} instead.
     * @param textSelection The text to highlight
     * @param textSelectionMatchCount The number of matches for the selected text on the page (should be strictly greater than textSelectionMatchIndex)
     * @param textSelectionMatchIndex The match index to highlight. This is zero-based. E.g. if you have 3 occurrences of "hello world" on a page  and you want to highlight the second occurrence, you should pass 1 for textSelectionMatchIndex and 3 for textSelectionMatchCount.
     */
    @ApiStatus.Internal
    public CreateInlineCommentModelInlineCommentProperties(String textSelection, Integer textSelectionMatchCount, Integer textSelectionMatchIndex) {
        this.textSelection = textSelection;
        this.textSelectionMatchCount = textSelectionMatchCount;
        this.textSelectionMatchIndex = textSelectionMatchIndex;
    }

}
