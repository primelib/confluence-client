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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentIdToContentTypeResponse
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
    "results"
})
@JsonTypeName("ContentIdToContentTypeResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentIdToContentTypeResponse {

    /**
     * JSON object containing all requested content ids as keys and their associated content types as the values. Duplicate content ids in the request will be returned under a single key in the response. For built-in content types, the enumerations are as specified. Custom content ids will be mapped to their associated type.
     */
    @JsonProperty("results")
    protected Map<String, ContentIdToContentTypeResponseResultsValue> results;

    /**
     * Constructs a validated instance of {@link ContentIdToContentTypeResponse}.
     *
     * @param spec the specification to process
     */
    public ContentIdToContentTypeResponse(Consumer<ContentIdToContentTypeResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentIdToContentTypeResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentIdToContentTypeResponse(Consumer)} instead.
     * @param results JSON object containing all requested content ids as keys and their associated content types as the values. Duplicate content ids in the request will be returned under a single key in the response. For built-in content types, the enumerations are as specified. Custom content ids will be mapped to their associated type.
     */
    @ApiStatus.Internal
    public ContentIdToContentTypeResponse(Map<String, ContentIdToContentTypeResponseResultsValue> results) {
        this.results = results;
    }

}
