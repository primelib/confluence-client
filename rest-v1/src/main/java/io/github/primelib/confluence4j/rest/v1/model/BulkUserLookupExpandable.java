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
 * BulkUserLookupExpandable
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
    "operations",
    "details",
    "personalSpace"
})
@JsonTypeName("BulkUserLookup__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkUserLookupExpandable {

    @JsonProperty("operations")
    protected String operations;

    @JsonProperty("details")
    protected String details;

    @JsonProperty("personalSpace")
    protected String personalSpace;

    /**
     * Constructs a validated instance of {@link BulkUserLookupExpandable}.
     *
     * @param spec the specification to process
     */
    public BulkUserLookupExpandable(Consumer<BulkUserLookupExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BulkUserLookupExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BulkUserLookupExpandable(Consumer)} instead.
     * @param operations operations
     * @param details details
     * @param personalSpace personalSpace
     */
    @ApiStatus.Internal
    public BulkUserLookupExpandable(String operations, String details, String personalSpace) {
        this.operations = operations;
        this.details = details;
        this.personalSpace = personalSpace;
    }

}
