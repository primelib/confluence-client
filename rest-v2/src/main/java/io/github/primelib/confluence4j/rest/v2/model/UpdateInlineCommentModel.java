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
 * UpdateInlineCommentModel
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
    "version",
    "body",
    "resolved"
})
@JsonTypeName("UpdateInlineCommentModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateInlineCommentModel {

    @JsonProperty("version")
    protected UpdateFooterCommentModelVersion version;

    @JsonProperty("body")
    protected CreateFooterCommentModelBody body;

    /**
     * Resolved state of the comment. Set to true to resolve the comment, set to false to reopen it. If matching the existing state (i.e. true -&amp;gt; resolved or false -&amp;gt; open/reopened) , no change will occur. A dangling comment cannot be updated.
     */
    @JsonProperty("resolved")
    protected Boolean resolved;

    /**
     * Constructs a validated instance of {@link UpdateInlineCommentModel}.
     *
     * @param spec the specification to process
     */
    public UpdateInlineCommentModel(Consumer<UpdateInlineCommentModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateInlineCommentModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateInlineCommentModel(Consumer)} instead.
     * @param version version
     * @param body body
     * @param resolved Resolved state of the comment. Set to true to resolve the comment, set to false to reopen it. If matching the existing state (i.e. true -&amp;gt; resolved or false -&amp;gt; open/reopened) , no change will occur. A dangling comment cannot be updated.
     */
    @ApiStatus.Internal
    public UpdateInlineCommentModel(UpdateFooterCommentModelVersion version, CreateFooterCommentModelBody body, Boolean resolved) {
        this.version = version;
        this.body = body;
        this.resolved = resolved;
    }

}
