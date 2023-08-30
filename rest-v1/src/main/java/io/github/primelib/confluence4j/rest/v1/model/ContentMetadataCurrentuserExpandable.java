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
 * ContentMetadataCurrentuserExpandable
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
    "favourited",
    "lastmodified",
    "lastcontributed",
    "viewed",
    "scheduled"
})
@JsonTypeName("ContentMetadata_currentuser__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentMetadataCurrentuserExpandable {

    @JsonProperty("favourited")
    protected String favourited;

    @JsonProperty("lastmodified")
    protected String lastmodified;

    @JsonProperty("lastcontributed")
    protected String lastcontributed;

    @JsonProperty("viewed")
    protected String viewed;

    @JsonProperty("scheduled")
    protected String scheduled;

    /**
     * Constructs a validated instance of {@link ContentMetadataCurrentuserExpandable}.
     *
     * @param spec the specification to process
     */
    public ContentMetadataCurrentuserExpandable(Consumer<ContentMetadataCurrentuserExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentMetadataCurrentuserExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentMetadataCurrentuserExpandable(Consumer)} instead.
     * @param favourited favourited
     * @param lastmodified lastmodified
     * @param lastcontributed lastcontributed
     * @param viewed viewed
     * @param scheduled scheduled
     */
    @ApiStatus.Internal
    public ContentMetadataCurrentuserExpandable(String favourited, String lastmodified, String lastcontributed, String viewed, String scheduled) {
        this.favourited = favourited;
        this.lastmodified = lastmodified;
        this.lastcontributed = lastcontributed;
        this.viewed = viewed;
        this.scheduled = scheduled;
    }

}
