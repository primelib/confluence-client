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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentPageResponse
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
    "results",
    "start",
    "limit",
    "size"
})
@JsonTypeName("ContentPageResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentPageResponse {

    @JsonProperty("results")
    protected List<Content> results;

    @JsonProperty("start")
    protected Integer start;

    @JsonProperty("limit")
    protected Integer limit;

    @JsonProperty("size")
    protected Integer size;

    /**
     * Constructs a validated instance of {@link ContentPageResponse}.
     *
     * @param spec the specification to process
     */
    public ContentPageResponse(Consumer<ContentPageResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentPageResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentPageResponse(Consumer)} instead.
     * @param results results
     * @param start start
     * @param limit limit
     * @param size size
     */
    @ApiStatus.Internal
    public ContentPageResponse(List<Content> results, Integer start, Integer limit, Integer size) {
        this.results = results;
        this.start = start;
        this.limit = limit;
        this.size = size;
    }

}
