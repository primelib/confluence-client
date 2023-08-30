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
 * MacroInstance
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
    "body",
    "parameters",
    "_links"
})
@JsonTypeName("MacroInstance")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MacroInstance {

    @JsonProperty("name")
    protected String name;

    @JsonProperty("body")
    protected String body;

    @JsonProperty("parameters")
    protected Object parameters;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link MacroInstance}.
     *
     * @param spec the specification to process
     */
    public MacroInstance(Consumer<MacroInstance> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MacroInstance}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MacroInstance(Consumer)} instead.
     * @param name name
     * @param body body
     * @param parameters parameters
     * @param _links _links
     */
    @ApiStatus.Internal
    public MacroInstance(String name, String body, Object parameters, Map<String, String> _links) {
        this.name = name;
        this.body = body;
        this.parameters = parameters;
        this._links = _links;
    }

}
