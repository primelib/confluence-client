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
 * LongTask
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
    "ari",
    "id",
    "links"
})
@JsonTypeName("LongTask")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LongTask {

    /**
     * the ARI for the long task, based on its ID
     */
    @JsonProperty("ari")
    protected String ari;

    /**
     * a unique identifier for the long task
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("links")
    protected LongTaskLinks links;

    /**
     * Constructs a validated instance of {@link LongTask}.
     *
     * @param spec the specification to process
     */
    public LongTask(Consumer<LongTask> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LongTask}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LongTask(Consumer)} instead.
     * @param ari the ARI for the long task, based on its ID
     * @param id a unique identifier for the long task
     * @param links links
     */
    @ApiStatus.Internal
    public LongTask(String ari, String id, LongTaskLinks links) {
        this.ari = ari;
        this.id = id;
        this.links = links;
    }

}
