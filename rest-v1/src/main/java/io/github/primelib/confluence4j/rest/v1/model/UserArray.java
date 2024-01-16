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
 * UserArray
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
    "_links"
})
@JsonTypeName("UserArray")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserArray {

    @JsonProperty("results")
    protected List<User> results;

    @JsonProperty("start")
    protected Integer start;

    @JsonProperty("limit")
    protected Integer limit;

    @JsonProperty("size")
    protected Integer size;

    /**
     * This property will return total count of the objects before pagination is applied. This value is returned if {@code shouldReturnTotalSize} is set to {@code true}.
     */
    @JsonProperty("totalSize")
    protected Long totalSize;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link UserArray}.
     *
     * @param spec the specification to process
     */
    public UserArray(Consumer<UserArray> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserArray}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserArray(Consumer)} instead.
     * @param results results
     * @param start start
     * @param limit limit
     * @param size size
     * @param totalSize This property will return total count of the objects before pagination is applied. This value is returned if {@code shouldReturnTotalSize} is set to {@code true}.
     * @param _links _links
     */
    @ApiStatus.Internal
    public UserArray(List<User> results, Integer start, Integer limit, Integer size, Long totalSize, Map<String, String> _links) {
        this.results = results;
        this.start = start;
        this.limit = limit;
        this.size = size;
        this.totalSize = totalSize;
        this._links = _links;
    }

}
