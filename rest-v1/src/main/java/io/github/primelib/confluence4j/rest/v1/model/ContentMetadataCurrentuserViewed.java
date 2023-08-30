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
 * ContentMetadataCurrentuserViewed
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
    "lastSeen",
    "friendlyLastSeen"
})
@JsonTypeName("ContentMetadata_currentuser_viewed")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentMetadataCurrentuserViewed {

    @JsonProperty("lastSeen")
    protected OffsetDateTime lastSeen;

    @JsonProperty("friendlyLastSeen")
    protected String friendlyLastSeen;

    /**
     * Constructs a validated instance of {@link ContentMetadataCurrentuserViewed}.
     *
     * @param spec the specification to process
     */
    public ContentMetadataCurrentuserViewed(Consumer<ContentMetadataCurrentuserViewed> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentMetadataCurrentuserViewed}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentMetadataCurrentuserViewed(Consumer)} instead.
     * @param lastSeen lastSeen
     * @param friendlyLastSeen friendlyLastSeen
     */
    @ApiStatus.Internal
    public ContentMetadataCurrentuserViewed(OffsetDateTime lastSeen, String friendlyLastSeen) {
        this.lastSeen = lastSeen;
        this.friendlyLastSeen = friendlyLastSeen;
    }

}
