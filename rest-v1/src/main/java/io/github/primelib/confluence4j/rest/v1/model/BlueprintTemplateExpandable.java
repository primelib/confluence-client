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
 * BlueprintTemplateExpandable
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
    "body"
})
@JsonTypeName("BlueprintTemplate__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BlueprintTemplateExpandable {

    @JsonProperty("body")
    protected String body;

    /**
     * Constructs a validated instance of {@link BlueprintTemplateExpandable}.
     *
     * @param spec the specification to process
     */
    public BlueprintTemplateExpandable(Consumer<BlueprintTemplateExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BlueprintTemplateExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BlueprintTemplateExpandable(Consumer)} instead.
     * @param body body
     */
    @ApiStatus.Internal
    public BlueprintTemplateExpandable(String body) {
        this.body = body;
    }

}
