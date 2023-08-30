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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetRestrictionsByOperation200ResponseValue
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
    "operationType",
    "_links"
})
@JsonTypeName("getRestrictionsByOperation_200_response_value")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetRestrictionsByOperation200ResponseValue {

    @JsonProperty("operationType")
    protected ContentRestriction operationType;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link GetRestrictionsByOperation200ResponseValue}.
     *
     * @param spec the specification to process
     */
    public GetRestrictionsByOperation200ResponseValue(Consumer<GetRestrictionsByOperation200ResponseValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetRestrictionsByOperation200ResponseValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetRestrictionsByOperation200ResponseValue(Consumer)} instead.
     * @param operationType operationType
     * @param _links _links
     */
    @ApiStatus.Internal
    public GetRestrictionsByOperation200ResponseValue(ContentRestriction operationType, Map<String, String> _links) {
        this.operationType = operationType;
        this._links = _links;
    }

}
