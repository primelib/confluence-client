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
 * ContentMetadataCurrentuserLastmodified
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
    "friendlyLastModified"
})
@JsonTypeName("ContentMetadata_currentuser_lastmodified")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentMetadataCurrentuserLastmodified {

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("friendlyLastModified")
    protected String friendlyLastModified;

    /**
     * Constructs a validated instance of {@link ContentMetadataCurrentuserLastmodified}.
     *
     * @param spec the specification to process
     */
    public ContentMetadataCurrentuserLastmodified(Consumer<ContentMetadataCurrentuserLastmodified> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentMetadataCurrentuserLastmodified}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentMetadataCurrentuserLastmodified(Consumer)} instead.
     * @param version version
     * @param friendlyLastModified friendlyLastModified
     */
    @ApiStatus.Internal
    public ContentMetadataCurrentuserLastmodified(Version version, String friendlyLastModified) {
        this.version = version;
        this.friendlyLastModified = friendlyLastModified;
    }

}
