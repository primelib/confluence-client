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
 * BulkContentStateSetInput
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
    "ids",
    "contentState"
})
@JsonTypeName("BulkContentStateSetInput")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkContentStateSetInput {

    /**
     * maximum number of ids you can pass in is 300
     */
    @JsonProperty("ids")
    protected List<String> ids;

    @JsonProperty("contentState")
    protected ContentStateInput contentState;

    /**
     * Constructs a validated instance of {@link BulkContentStateSetInput}.
     *
     * @param spec the specification to process
     */
    public BulkContentStateSetInput(Consumer<BulkContentStateSetInput> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BulkContentStateSetInput}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BulkContentStateSetInput(Consumer)} instead.
     * @param ids maximum number of ids you can pass in is 300
     * @param contentState contentState
     */
    @ApiStatus.Internal
    public BulkContentStateSetInput(List<String> ids, ContentStateInput contentState) {
        this.ids = ids;
        this.contentState = contentState;
    }

}
