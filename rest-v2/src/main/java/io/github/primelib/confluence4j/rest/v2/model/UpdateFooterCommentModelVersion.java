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
 * UpdateFooterCommentModelVersion
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
    "number",
    "message"
})
@JsonTypeName("UpdateFooterCommentModel_version")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateFooterCommentModelVersion {

    /**
     * Number of new version. Should be 1 higher than current version of the comment.
     */
    @JsonProperty("number")
    protected Integer number;

    /**
     * Optional message store for the new version.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * Constructs a validated instance of {@link UpdateFooterCommentModelVersion}.
     *
     * @param spec the specification to process
     */
    public UpdateFooterCommentModelVersion(Consumer<UpdateFooterCommentModelVersion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateFooterCommentModelVersion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateFooterCommentModelVersion(Consumer)} instead.
     * @param number Number of new version. Should be 1 higher than current version of the comment.
     * @param message Optional message store for the new version.
     */
    @ApiStatus.Internal
    public UpdateFooterCommentModelVersion(Integer number, String message) {
        this.number = number;
        this.message = message;
    }

}
