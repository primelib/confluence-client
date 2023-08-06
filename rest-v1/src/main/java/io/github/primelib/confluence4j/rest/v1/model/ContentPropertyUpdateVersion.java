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
 * ContentPropertyUpdateVersion
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
    "minorEdit"
})
@JsonTypeName("ContentPropertyUpdate_version")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentPropertyUpdateVersion {

    @JsonProperty("number")
    protected ContentPropertyUpdateVersionNumber number;

    /**
     * If {@code minorEdit} is set to 'true', no notification email or activity stream will be generated for the change.
     */
    @JsonProperty("minorEdit")
    protected Boolean minorEdit;

    /**
     * Constructs a validated instance of {@link ContentPropertyUpdateVersion}.
     *
     * @param spec the specification to process
     */
    public ContentPropertyUpdateVersion(Consumer<ContentPropertyUpdateVersion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentPropertyUpdateVersion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentPropertyUpdateVersion(Consumer)} instead.
     * @param number number
     * @param minorEdit If {@code minorEdit} is set to 'true', no notification email or activity stream will be generated for the change.
     */
    @ApiStatus.Internal
    public ContentPropertyUpdateVersion(ContentPropertyUpdateVersionNumber number, Boolean minorEdit) {
        this.number = number;
        this.minorEdit = minorEdit;
    }

}
