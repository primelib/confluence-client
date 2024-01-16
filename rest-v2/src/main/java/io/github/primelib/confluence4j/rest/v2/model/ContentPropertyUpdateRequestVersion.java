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
 * ContentPropertyUpdateRequestVersion
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
@JsonTypeName("ContentPropertyUpdateRequest_version")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentPropertyUpdateRequestVersion {

    /**
     * Version number of the new version. Should be 1 more than the current version number.
     */
    @JsonProperty("number")
    protected Integer number;

    /**
     * Message to be associated with the new version.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * Constructs a validated instance of {@link ContentPropertyUpdateRequestVersion}.
     *
     * @param spec the specification to process
     */
    public ContentPropertyUpdateRequestVersion(Consumer<ContentPropertyUpdateRequestVersion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentPropertyUpdateRequestVersion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentPropertyUpdateRequestVersion(Consumer)} instead.
     * @param number Version number of the new version. Should be 1 more than the current version number.
     * @param message Message to be associated with the new version.
     */
    @ApiStatus.Internal
    public ContentPropertyUpdateRequestVersion(Integer number, String message) {
        this.number = number;
        this.message = message;
    }

}
