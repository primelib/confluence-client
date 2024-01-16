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
 * ContentMetadataCurrentuserFavourited
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
    "isFavourite",
    "favouritedDate"
})
@JsonTypeName("ContentMetadata_currentuser_favourited")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentMetadataCurrentuserFavourited {

    @JsonProperty("isFavourite")
    protected Boolean isFavourite;

    @JsonProperty("favouritedDate")
    protected OffsetDateTime favouritedDate;

    /**
     * Constructs a validated instance of {@link ContentMetadataCurrentuserFavourited}.
     *
     * @param spec the specification to process
     */
    public ContentMetadataCurrentuserFavourited(Consumer<ContentMetadataCurrentuserFavourited> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentMetadataCurrentuserFavourited}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentMetadataCurrentuserFavourited(Consumer)} instead.
     * @param isFavourite isFavourite
     * @param favouritedDate favouritedDate
     */
    @ApiStatus.Internal
    public ContentMetadataCurrentuserFavourited(Boolean isFavourite, OffsetDateTime favouritedDate) {
        this.isFavourite = isFavourite;
        this.favouritedDate = favouritedDate;
    }

}
