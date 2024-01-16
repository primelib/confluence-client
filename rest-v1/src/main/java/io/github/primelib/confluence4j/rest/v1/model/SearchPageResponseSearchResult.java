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
 * SearchPageResponseSearchResult
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
    "totalSize",
    "cqlQuery",
    "searchDuration",
    "archivedResultCount",
    "_links"
})
@JsonTypeName("SearchPageResponseSearchResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchPageResponseSearchResult {

    @JsonProperty("results")
    protected List<SearchResult> results;

    @JsonProperty("start")
    protected Integer start;

    @JsonProperty("limit")
    protected Integer limit;

    @JsonProperty("size")
    protected Integer size;

    @JsonProperty("totalSize")
    protected Integer totalSize;

    @JsonProperty("cqlQuery")
    protected String cqlQuery;

    @JsonProperty("searchDuration")
    protected Integer searchDuration;

    @JsonProperty("archivedResultCount")
    protected Integer archivedResultCount;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link SearchPageResponseSearchResult}.
     *
     * @param spec the specification to process
     */
    public SearchPageResponseSearchResult(Consumer<SearchPageResponseSearchResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SearchPageResponseSearchResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SearchPageResponseSearchResult(Consumer)} instead.
     * @param results results
     * @param start start
     * @param limit limit
     * @param size size
     * @param totalSize totalSize
     * @param cqlQuery cqlQuery
     * @param searchDuration searchDuration
     * @param archivedResultCount archivedResultCount
     * @param _links _links
     */
    @ApiStatus.Internal
    public SearchPageResponseSearchResult(List<SearchResult> results, Integer start, Integer limit, Integer size, Integer totalSize, String cqlQuery, Integer searchDuration, Integer archivedResultCount, Map<String, String> _links) {
        this.results = results;
        this.start = start;
        this.limit = limit;
        this.size = size;
        this.totalSize = totalSize;
        this.cqlQuery = cqlQuery;
        this.searchDuration = searchDuration;
        this.archivedResultCount = archivedResultCount;
        this._links = _links;
    }

}
