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
 * ContentUpdateVersion
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
@JsonTypeName("ContentUpdate_version")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentUpdateVersion {

    /**
     * The version number.
     */
    @JsonProperty("number")
    protected Integer number;

    /**
     * An optional message to be stored with the corresponding version.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * Constructs a validated instance of {@link ContentUpdateVersion}.
     *
     * @param spec the specification to process
     */
    public ContentUpdateVersion(Consumer<ContentUpdateVersion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentUpdateVersion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentUpdateVersion(Consumer)} instead.
     * @param number The version number.
     * @param message An optional message to be stored with the corresponding version.
     */
    @ApiStatus.Internal
    public ContentUpdateVersion(Integer number, String message) {
        this.number = number;
        this.message = message;
    }

}
