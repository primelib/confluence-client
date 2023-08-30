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
 * BulkRemoveContentStatesRequest
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
    "ids"
})
@JsonTypeName("bulkRemoveContentStates_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkRemoveContentStatesRequest {

    @JsonProperty("ids")
    protected List<String> ids;

    /**
     * Constructs a validated instance of {@link BulkRemoveContentStatesRequest}.
     *
     * @param spec the specification to process
     */
    public BulkRemoveContentStatesRequest(Consumer<BulkRemoveContentStatesRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BulkRemoveContentStatesRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BulkRemoveContentStatesRequest(Consumer)} instead.
     * @param ids ids
     */
    @ApiStatus.Internal
    public BulkRemoveContentStatesRequest(List<String> ids) {
        this.ids = ids;
    }

}
