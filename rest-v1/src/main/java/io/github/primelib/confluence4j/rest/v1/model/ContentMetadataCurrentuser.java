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
 * ContentMetadataCurrentuser
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
    "scheduled",
    "_expandable"
})
@JsonTypeName("ContentMetadata_currentuser")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentMetadataCurrentuser {

    @JsonProperty("favourited")
    protected ContentMetadataCurrentuserFavourited favourited;

    @JsonProperty("lastmodified")
    protected ContentMetadataCurrentuserLastmodified lastmodified;

    @JsonProperty("lastcontributed")
    protected ContentMetadataCurrentuserLastcontributed lastcontributed;

    @JsonProperty("viewed")
    protected ContentMetadataCurrentuserViewed viewed;

    @JsonProperty("scheduled")
    protected Object scheduled;

    @JsonProperty("_expandable")
    protected ContentMetadataCurrentuserExpandable _expandable;

    /**
     * Constructs a validated instance of {@link ContentMetadataCurrentuser}.
     *
     * @param spec the specification to process
     */
    public ContentMetadataCurrentuser(Consumer<ContentMetadataCurrentuser> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentMetadataCurrentuser}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentMetadataCurrentuser(Consumer)} instead.
     * @param favourited favourited
     * @param lastmodified lastmodified
     * @param lastcontributed lastcontributed
     * @param viewed viewed
     * @param scheduled scheduled
     * @param _expandable _expandable
     */
    @ApiStatus.Internal
    public ContentMetadataCurrentuser(ContentMetadataCurrentuserFavourited favourited, ContentMetadataCurrentuserLastmodified lastmodified, ContentMetadataCurrentuserLastcontributed lastcontributed, ContentMetadataCurrentuserViewed viewed, Object scheduled, ContentMetadataCurrentuserExpandable _expandable) {
        this.favourited = favourited;
        this.lastmodified = lastmodified;
        this.lastcontributed = lastcontributed;
        this.viewed = viewed;
        this.scheduled = scheduled;
        this._expandable = _expandable;
    }

}
