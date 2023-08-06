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
 * CQLPersonalDataConvertedQueries
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
    "queryStrings"
})
@JsonTypeName("CQLPersonalDataConvertedQueries")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CQLPersonalDataConvertedQueries {

    /**
     * The list of converted CQL query strings with account IDs in place of user identifiers.
     */
    @JsonProperty("queryStrings")
    protected List<String> queryStrings;

    /**
     * Constructs a validated instance of {@link CQLPersonalDataConvertedQueries}.
     *
     * @param spec the specification to process
     */
    public CQLPersonalDataConvertedQueries(Consumer<CQLPersonalDataConvertedQueries> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CQLPersonalDataConvertedQueries}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CQLPersonalDataConvertedQueries(Consumer)} instead.
     * @param queryStrings The list of converted CQL query strings with account IDs in place of user identifiers.
     */
    @ApiStatus.Internal
    public CQLPersonalDataConvertedQueries(List<String> queryStrings) {
        this.queryStrings = queryStrings;
    }

}
