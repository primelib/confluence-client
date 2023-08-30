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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentCreateSpaceHistory
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
    "createdDate",
    "createdBy"
})
@JsonTypeName("ContentCreate_space_history")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentCreateSpaceHistory {

    @JsonProperty("createdDate")
    protected OffsetDateTime createdDate;

    @JsonProperty("createdBy")
    protected User createdBy;

    /**
     * Constructs a validated instance of {@link ContentCreateSpaceHistory}.
     *
     * @param spec the specification to process
     */
    public ContentCreateSpaceHistory(Consumer<ContentCreateSpaceHistory> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentCreateSpaceHistory}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentCreateSpaceHistory(Consumer)} instead.
     * @param createdDate createdDate
     * @param createdBy createdBy
     */
    @ApiStatus.Internal
    public ContentCreateSpaceHistory(OffsetDateTime createdDate, User createdBy) {
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

}
