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
 * RelationExpandable
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
    "relationData",
    "source",
    "target"
})
@JsonTypeName("Relation__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RelationExpandable {

    @JsonProperty("relationData")
    protected String relationData;

    @JsonProperty("source")
    protected String source;

    @JsonProperty("target")
    protected String target;

    /**
     * Constructs a validated instance of {@link RelationExpandable}.
     *
     * @param spec the specification to process
     */
    public RelationExpandable(Consumer<RelationExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RelationExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RelationExpandable(Consumer)} instead.
     * @param relationData relationData
     * @param source source
     * @param target target
     */
    @ApiStatus.Internal
    public RelationExpandable(String relationData, String source, String target) {
        this.relationData = relationData;
        this.source = source;
        this.target = target;
    }

}
