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
 * ContentRestrictionAddOrUpdateArray
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
    "restrictionsHash",
    "_links"
})
@JsonTypeName("ContentRestrictionAddOrUpdateArray")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentRestrictionAddOrUpdateArray {

    @JsonProperty("results")
    protected List<ContentRestrictionUpdate> results;

    @JsonProperty("start")
    protected Integer start;

    @JsonProperty("limit")
    protected Integer limit;

    @JsonProperty("size")
    protected Integer size;

    /**
     * This property is used by the UI to figure out whether a set of restrictions has changed.
     */
    @JsonProperty("restrictionsHash")
    protected String restrictionsHash;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link ContentRestrictionAddOrUpdateArray}.
     *
     * @param spec the specification to process
     */
    public ContentRestrictionAddOrUpdateArray(Consumer<ContentRestrictionAddOrUpdateArray> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentRestrictionAddOrUpdateArray}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentRestrictionAddOrUpdateArray(Consumer)} instead.
     * @param results results
     * @param start start
     * @param limit limit
     * @param size size
     * @param restrictionsHash This property is used by the UI to figure out whether a set of restrictions has changed.
     * @param _links _links
     */
    @ApiStatus.Internal
    public ContentRestrictionAddOrUpdateArray(List<ContentRestrictionUpdate> results, Integer start, Integer limit, Integer size, String restrictionsHash, Map<String, String> _links) {
        this.results = results;
        this.start = start;
        this.limit = limit;
        this.size = size;
        this.restrictionsHash = restrictionsHash;
        this._links = _links;
    }

}
