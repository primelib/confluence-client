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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WatchArray
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
    "size",
    "_links"
})
@JsonTypeName("WatchArray")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WatchArray {

    @JsonProperty("results")
    protected List<Watch> results;

    @JsonProperty("start")
    protected Integer start;

    @JsonProperty("limit")
    protected Integer limit;

    @JsonProperty("size")
    protected Integer size;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link WatchArray}.
     *
     * @param spec the specification to process
     */
    public WatchArray(Consumer<WatchArray> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WatchArray}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WatchArray(Consumer)} instead.
     * @param results results
     * @param start start
     * @param limit limit
     * @param size size
     * @param _links _links
     */
    @ApiStatus.Internal
    public WatchArray(List<Watch> results, Integer start, Integer limit, Integer size, Map<String, String> _links) {
        this.results = results;
        this.start = start;
        this.limit = limit;
        this.size = size;
        this._links = _links;
    }

}
