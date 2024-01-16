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
 * EmbeddedContent
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
    "entityId",
    "entityType",
    "entity"
})
@JsonTypeName("EmbeddedContent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EmbeddedContent {

    @JsonProperty("entityId")
    protected Long entityId;

    @JsonProperty("entityType")
    protected String entityType;

    @JsonProperty("entity")
    protected Map<String, Object> entity;

    /**
     * Constructs a validated instance of {@link EmbeddedContent}.
     *
     * @param spec the specification to process
     */
    public EmbeddedContent(Consumer<EmbeddedContent> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EmbeddedContent}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EmbeddedContent(Consumer)} instead.
     * @param entityId entityId
     * @param entityType entityType
     * @param entity entity
     */
    @ApiStatus.Internal
    public EmbeddedContent(Long entityId, String entityType, Map<String, Object> entity) {
        this.entityId = entityId;
        this.entityType = entityType;
        this.entity = entity;
    }

}
