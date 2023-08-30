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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentPropertyVersion
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
    "when",
    "message",
    "number",
    "minorEdit",
    "contentTypeModified"
})
@JsonTypeName("ContentProperty_version")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentPropertyVersion {

    @JsonProperty("when")
    protected OffsetDateTime when;

    @JsonProperty("message")
    protected String message;

    @JsonProperty("number")
    protected Integer number;

    @JsonProperty("minorEdit")
    protected Boolean minorEdit;

    /**
     * True if content type is modifed in this version (e.g. page to blog)
     */
    @JsonProperty("contentTypeModified")
    protected Boolean contentTypeModified;

    /**
     * Constructs a validated instance of {@link ContentPropertyVersion}.
     *
     * @param spec the specification to process
     */
    public ContentPropertyVersion(Consumer<ContentPropertyVersion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentPropertyVersion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentPropertyVersion(Consumer)} instead.
     * @param when when
     * @param message message
     * @param number number
     * @param minorEdit minorEdit
     * @param contentTypeModified True if content type is modifed in this version (e.g. page to blog)
     */
    @ApiStatus.Internal
    public ContentPropertyVersion(OffsetDateTime when, String message, Integer number, Boolean minorEdit, Boolean contentTypeModified) {
        this.when = when;
        this.message = message;
        this.number = number;
        this.minorEdit = minorEdit;
        this.contentTypeModified = contentTypeModified;
    }

}
