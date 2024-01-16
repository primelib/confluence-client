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
 * VersionedEntity
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
    "title",
    "id",
    "body"
})
@JsonTypeName("VersionedEntity")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionedEntity {

    /**
     * Title of the entity.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * ID of the entity.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("body")
    protected BodyBulk body;

    /**
     * Constructs a validated instance of {@link VersionedEntity}.
     *
     * @param spec the specification to process
     */
    public VersionedEntity(Consumer<VersionedEntity> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link VersionedEntity}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #VersionedEntity(Consumer)} instead.
     * @param title Title of the entity.
     * @param id ID of the entity.
     * @param body body
     */
    @ApiStatus.Internal
    public VersionedEntity(String title, String id, BodyBulk body) {
        this.title = title;
        this.id = id;
        this.body = body;
    }

}
