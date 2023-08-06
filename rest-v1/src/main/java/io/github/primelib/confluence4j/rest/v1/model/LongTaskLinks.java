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
 * LongTaskLinks
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
    "status"
})
@JsonTypeName("LongTask_links")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LongTaskLinks {

    /**
     * The URL to retrive status of long task.
     */
    @JsonProperty("status")
    protected String status;

    /**
     * Constructs a validated instance of {@link LongTaskLinks}.
     *
     * @param spec the specification to process
     */
    public LongTaskLinks(Consumer<LongTaskLinks> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LongTaskLinks}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LongTaskLinks(Consumer)} instead.
     * @param status The URL to retrive status of long task.
     */
    @ApiStatus.Internal
    public LongTaskLinks(String status) {
        this.status = status;
    }

}
