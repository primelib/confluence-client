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
 * ContentStateBulkSetTaskUpdate
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
    "set",
    "failed",
    "percentage",
    "message",
    "state",
    "success"
})
@JsonTypeName("ContentStateBulkSetTaskUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentStateBulkSetTaskUpdate {

    @JsonProperty("set")
    protected List<String> set;

    @JsonProperty("failed")
    protected List<ContentStateFailure> failed;

    @JsonProperty("percentage")
    protected Long percentage;

    @JsonProperty("message")
    protected String message;

    @JsonProperty("state")
    protected ContentState state;

    @JsonProperty("success")
    protected Boolean success;

    /**
     * Constructs a validated instance of {@link ContentStateBulkSetTaskUpdate}.
     *
     * @param spec the specification to process
     */
    public ContentStateBulkSetTaskUpdate(Consumer<ContentStateBulkSetTaskUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentStateBulkSetTaskUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentStateBulkSetTaskUpdate(Consumer)} instead.
     * @param set set
     * @param failed failed
     * @param percentage percentage
     * @param message message
     * @param state state
     * @param success success
     */
    @ApiStatus.Internal
    public ContentStateBulkSetTaskUpdate(List<String> set, List<ContentStateFailure> failed, Long percentage, String message, ContentState state, Boolean success) {
        this.set = set;
        this.failed = failed;
        this.percentage = percentage;
        this.message = message;
        this.state = state;
        this.success = success;
    }

}
