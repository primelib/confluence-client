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
 * LongTaskStatusAdditionalDetails
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
    "destinationId",
    "destinationUrl",
    "totalPageNeedToCopy",
    "additionalProperties"
})
@JsonTypeName("LongTaskStatus_additionalDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LongTaskStatusAdditionalDetails {

    @JsonProperty("destinationId")
    protected String destinationId;

    @JsonProperty("destinationUrl")
    protected String destinationUrl;

    @JsonProperty("totalPageNeedToCopy")
    protected Integer totalPageNeedToCopy;

    @JsonProperty("additionalProperties")
    protected String additionalProperties;

    /**
     * Constructs a validated instance of {@link LongTaskStatusAdditionalDetails}.
     *
     * @param spec the specification to process
     */
    public LongTaskStatusAdditionalDetails(Consumer<LongTaskStatusAdditionalDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LongTaskStatusAdditionalDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LongTaskStatusAdditionalDetails(Consumer)} instead.
     * @param destinationId destinationId
     * @param destinationUrl destinationUrl
     * @param totalPageNeedToCopy totalPageNeedToCopy
     * @param additionalProperties additionalProperties
     */
    @ApiStatus.Internal
    public LongTaskStatusAdditionalDetails(String destinationId, String destinationUrl, Integer totalPageNeedToCopy, String additionalProperties) {
        this.destinationId = destinationId;
        this.destinationUrl = destinationUrl;
        this.totalPageNeedToCopy = totalPageNeedToCopy;
        this.additionalProperties = additionalProperties;
    }

}
