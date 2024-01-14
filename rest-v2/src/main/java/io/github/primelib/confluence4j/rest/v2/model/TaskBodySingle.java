package io.github.primelib.confluence4j.rest.v2.model;

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
 * TaskBodySingle
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
    "storage",
    "atlas_doc_format"
})
@JsonTypeName("TaskBodySingle")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TaskBodySingle {

    @JsonProperty("storage")
    protected BodyType storage;

    @JsonProperty("atlas_doc_format")
    protected BodyType atlasDocFormat;

    /**
     * Constructs a validated instance of {@link TaskBodySingle}.
     *
     * @param spec the specification to process
     */
    public TaskBodySingle(Consumer<TaskBodySingle> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TaskBodySingle}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TaskBodySingle(Consumer)} instead.
     * @param storage storage
     * @param atlasDocFormat atlasDocFormat
     */
    @ApiStatus.Internal
    public TaskBodySingle(BodyType storage, BodyType atlasDocFormat) {
        this.storage = storage;
        this.atlasDocFormat = atlasDocFormat;
    }

}
