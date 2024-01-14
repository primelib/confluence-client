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
 * UpdatePageRequestVersion
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
@JsonTypeName("updatePage_request_version")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdatePageRequestVersion {

    /**
     * The new version of the updated page.
     * Set this to the current version number plus one, unless you are updating the status to 'draft' which requires a version number of 1.
     * If you don't know the current version number, use Get page by id.
     */
    @JsonProperty("number")
    protected Integer number;

    /**
     * An optional message to be stored with the version.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * Constructs a validated instance of {@link UpdatePageRequestVersion}.
     *
     * @param spec the specification to process
     */
    public UpdatePageRequestVersion(Consumer<UpdatePageRequestVersion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdatePageRequestVersion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdatePageRequestVersion(Consumer)} instead.
     * @param number The new version of the updated page.  Set this to the current version number plus one, unless you are updating the status to 'draft' which requires a version number of 1.  If you don't know the current version number, use Get page by id.
     * @param message An optional message to be stored with the version.
     */
    @ApiStatus.Internal
    public UpdatePageRequestVersion(Integer number, String message) {
        this.number = number;
        this.message = message;
    }

}
