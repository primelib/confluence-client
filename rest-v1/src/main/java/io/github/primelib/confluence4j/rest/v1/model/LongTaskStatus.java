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
 * LongTaskStatus
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
    "name",
    "elapsedTime",
    "percentageComplete",
    "successful",
    "finished",
    "messages",
    "status",
    "errors",
    "additionalDetails"
})
@JsonTypeName("LongTaskStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LongTaskStatus {

    /**
     * the ARI for the long task, based on its ID
     */
    @JsonProperty("ari")
    protected String ari;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("name")
    protected LongTaskStatusName name;

    @JsonProperty("elapsedTime")
    protected Long elapsedTime;

    @JsonProperty("percentageComplete")
    protected Integer percentageComplete;

    @JsonProperty("successful")
    protected Boolean successful;

    @JsonProperty("finished")
    protected Boolean finished;

    @JsonProperty("messages")
    protected List<Message> messages;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("errors")
    protected List<Message> errors;

    @JsonProperty("additionalDetails")
    protected LongTaskStatusAdditionalDetails additionalDetails;

    /**
     * Constructs a validated instance of {@link LongTaskStatus}.
     *
     * @param spec the specification to process
     */
    public LongTaskStatus(Consumer<LongTaskStatus> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LongTaskStatus}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LongTaskStatus(Consumer)} instead.
     * @param ari the ARI for the long task, based on its ID
     * @param id id
     * @param name name
     * @param elapsedTime elapsedTime
     * @param percentageComplete percentageComplete
     * @param successful successful
     * @param finished finished
     * @param messages messages
     * @param status status
     * @param errors errors
     * @param additionalDetails additionalDetails
     */
    @ApiStatus.Internal
    public LongTaskStatus(String ari, String id, LongTaskStatusName name, Long elapsedTime, Integer percentageComplete, Boolean successful, Boolean finished, List<Message> messages, String status, List<Message> errors, LongTaskStatusAdditionalDetails additionalDetails) {
        this.ari = ari;
        this.id = id;
        this.name = name;
        this.elapsedTime = elapsedTime;
        this.percentageComplete = percentageComplete;
        this.successful = successful;
        this.finished = finished;
        this.messages = messages;
        this.status = status;
        this.errors = errors;
        this.additionalDetails = additionalDetails;
    }

}
