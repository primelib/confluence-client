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
 * AffectedObject
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
    "objectType"
})
@JsonTypeName("AffectedObject")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AffectedObject {

    @JsonProperty("name")
    protected String name;

    @JsonProperty("objectType")
    protected String objectType;

    /**
     * Constructs a validated instance of {@link AffectedObject}.
     *
     * @param spec the specification to process
     */
    public AffectedObject(Consumer<AffectedObject> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AffectedObject}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AffectedObject(Consumer)} instead.
     * @param name name
     * @param objectType objectType
     */
    @ApiStatus.Internal
    public AffectedObject(String name, String objectType) {
        this.name = name;
        this.objectType = objectType;
    }

}
