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
 * UpdateFooterCommentModel
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
    "body"
})
@JsonTypeName("UpdateFooterCommentModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateFooterCommentModel {

    @JsonProperty("version")
    protected UpdateFooterCommentModelVersion version;

    @JsonProperty("body")
    protected CreateFooterCommentModelBody body;

    /**
     * Constructs a validated instance of {@link UpdateFooterCommentModel}.
     *
     * @param spec the specification to process
     */
    public UpdateFooterCommentModel(Consumer<UpdateFooterCommentModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateFooterCommentModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateFooterCommentModel(Consumer)} instead.
     * @param version version
     * @param body body
     */
    @ApiStatus.Internal
    public UpdateFooterCommentModel(UpdateFooterCommentModelVersion version, CreateFooterCommentModelBody body) {
        this.version = version;
        this.body = body;
    }

}
