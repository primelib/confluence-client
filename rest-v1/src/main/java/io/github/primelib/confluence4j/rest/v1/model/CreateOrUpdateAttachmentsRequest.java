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

import java.io.File;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateOrUpdateAttachmentsRequest
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
    "file",
    "comment",
    "minorEdit"
})
@JsonTypeName("createOrUpdateAttachments_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateOrUpdateAttachmentsRequest {

    /**
     * The relative location and name of the attachment to be added to the content.
     */
    @JsonProperty("file")
    protected File _file;

    /**
     * The comment for the attachment that is being added. If you specify a comment, then every file must have a comment and the comments must be in the same order as the files. Alternatively, don't specify any comments.
     */
    @JsonProperty("comment")
    protected File comment;

    /**
     * If {@code minorEdits} is set to 'true', no notification email or activity stream will be generated when the attachment is added to the content.
     */
    @JsonProperty("minorEdit")
    protected File minorEdit;

    /**
     * Constructs a validated instance of {@link CreateOrUpdateAttachmentsRequest}.
     *
     * @param spec the specification to process
     */
    public CreateOrUpdateAttachmentsRequest(Consumer<CreateOrUpdateAttachmentsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateOrUpdateAttachmentsRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateOrUpdateAttachmentsRequest(Consumer)} instead.
     * @param _file The relative location and name of the attachment to be added to the content.
     * @param comment The comment for the attachment that is being added. If you specify a comment, then every file must have a comment and the comments must be in the same order as the files. Alternatively, don't specify any comments.
     * @param minorEdit If {@code minorEdits} is set to 'true', no notification email or activity stream will be generated when the attachment is added to the content.
     */
    @ApiStatus.Internal
    public CreateOrUpdateAttachmentsRequest(File _file, File comment, File minorEdit) {
        this._file = _file;
        this.comment = comment;
        this.minorEdit = minorEdit;
    }

}
