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
 * CQLPersonalDataMigrationRequest
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
@JsonTypeName("CQLPersonalDataMigrationRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CQLPersonalDataMigrationRequest {

    /**
     * A list of queries with user identifiers. Maximum of 100 queries.
     */
    @JsonProperty("queryStrings")
    protected List<String> queryStrings;

    /**
     * Constructs a validated instance of {@link CQLPersonalDataMigrationRequest}.
     *
     * @param spec the specification to process
     */
    public CQLPersonalDataMigrationRequest(Consumer<CQLPersonalDataMigrationRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CQLPersonalDataMigrationRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CQLPersonalDataMigrationRequest(Consumer)} instead.
     * @param queryStrings A list of queries with user identifiers. Maximum of 100 queries.
     */
    @ApiStatus.Internal
    public CQLPersonalDataMigrationRequest(List<String> queryStrings) {
        this.queryStrings = queryStrings;
    }

}
