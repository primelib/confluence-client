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
 * RelationData
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
    "createdBy",
    "createdDate",
    "friendlyCreatedDate"
})
@JsonTypeName("RelationData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RelationData {

    @JsonProperty("createdBy")
    protected User createdBy;

    @JsonProperty("createdDate")
    protected OffsetDateTime createdDate;

    @JsonProperty("friendlyCreatedDate")
    protected String friendlyCreatedDate;

    /**
     * Constructs a validated instance of {@link RelationData}.
     *
     * @param spec the specification to process
     */
    public RelationData(Consumer<RelationData> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RelationData}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RelationData(Consumer)} instead.
     * @param createdBy createdBy
     * @param createdDate createdDate
     * @param friendlyCreatedDate friendlyCreatedDate
     */
    @ApiStatus.Internal
    public RelationData(User createdBy, OffsetDateTime createdDate, String friendlyCreatedDate) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.friendlyCreatedDate = friendlyCreatedDate;
    }

}
