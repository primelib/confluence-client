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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConvertContentIdsToContentTypesRequest
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
    "contentIds"
})
@JsonTypeName("convertContentIdsToContentTypes_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConvertContentIdsToContentTypesRequest {

    /**
     * The content ids to convert. They may be provided as strings or numbers.
     */
    @JsonProperty("contentIds")
    protected List<ConvertContentIdsToContentTypesRequestContentIdsInner> contentIds;

    /**
     * Constructs a validated instance of {@link ConvertContentIdsToContentTypesRequest}.
     *
     * @param spec the specification to process
     */
    public ConvertContentIdsToContentTypesRequest(Consumer<ConvertContentIdsToContentTypesRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ConvertContentIdsToContentTypesRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ConvertContentIdsToContentTypesRequest(Consumer)} instead.
     * @param contentIds The content ids to convert. They may be provided as strings or numbers.
     */
    @ApiStatus.Internal
    public ConvertContentIdsToContentTypesRequest(List<ConvertContentIdsToContentTypesRequestContentIdsInner> contentIds) {
        this.contentIds = contentIds;
    }

}
