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
 * GetViewers200Response
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
    "id",
    "count"
})
@JsonTypeName("getViewers_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetViewers200Response {

    /**
     * The content ID.
     */
    @JsonProperty("id")
    protected Integer id;

    /**
     * The total number of distinct viewers for the content.
     */
    @JsonProperty("count")
    protected Integer count;

    /**
     * Constructs a validated instance of {@link GetViewers200Response}.
     *
     * @param spec the specification to process
     */
    public GetViewers200Response(Consumer<GetViewers200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetViewers200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetViewers200Response(Consumer)} instead.
     * @param id The content ID.
     * @param count The total number of distinct viewers for the content.
     */
    @ApiStatus.Internal
    public GetViewers200Response(Integer id, Integer count) {
        this.id = id;
        this.count = count;
    }

}
