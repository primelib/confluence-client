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
 * Relation
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
    "name",
    "relationData",
    "source",
    "target",
    "_expandable",
    "_links"
})
@JsonTypeName("Relation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Relation {

    @JsonProperty("name")
    protected String name;

    @JsonProperty("relationData")
    protected RelationData relationData;

    @JsonProperty("source")
    protected RelationSource source;

    @JsonProperty("target")
    protected RelationSource target;

    @JsonProperty("_expandable")
    protected RelationExpandable _expandable;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link Relation}.
     *
     * @param spec the specification to process
     */
    public Relation(Consumer<Relation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Relation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Relation(Consumer)} instead.
     * @param name name
     * @param relationData relationData
     * @param source source
     * @param target target
     * @param _expandable _expandable
     * @param _links _links
     */
    @ApiStatus.Internal
    public Relation(String name, RelationData relationData, RelationSource source, RelationSource target, RelationExpandable _expandable, Map<String, String> _links) {
        this.name = name;
        this.relationData = relationData;
        this.source = source;
        this.target = target;
        this._expandable = _expandable;
        this._links = _links;
    }

}
