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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentMetadata
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
    "currentuser",
    "properties",
    "frontend",
    "labels"
})
@JsonTypeName("ContentMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentMetadata {

    @JsonProperty("currentuser")
    protected ContentMetadataCurrentuser currentuser;

    @JsonProperty("properties")
    protected Map<String, String> properties;

    @JsonProperty("frontend")
    protected Map<String, Object> frontend;

    @JsonProperty("labels")
    protected ContentMetadataLabels labels;

    /**
     * Constructs a validated instance of {@link ContentMetadata}.
     *
     * @param spec the specification to process
     */
    public ContentMetadata(Consumer<ContentMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentMetadata(Consumer)} instead.
     * @param currentuser currentuser
     * @param properties properties
     * @param frontend frontend
     * @param labels labels
     */
    @ApiStatus.Internal
    public ContentMetadata(ContentMetadataCurrentuser currentuser, Map<String, String> properties, Map<String, Object> frontend, ContentMetadataLabels labels) {
        this.currentuser = currentuser;
        this.properties = properties;
        this.frontend = frontend;
        this.labels = labels;
    }

}
