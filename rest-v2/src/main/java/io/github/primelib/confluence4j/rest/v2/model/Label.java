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
 * Label
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
    "id",
    "name",
    "prefix"
})
@JsonTypeName("Label")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Label {

    /**
     * ID of the label.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Name of the label.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Prefix of the label.
     */
    @JsonProperty("prefix")
    protected String prefix;

    /**
     * Constructs a validated instance of {@link Label}.
     *
     * @param spec the specification to process
     */
    public Label(Consumer<Label> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Label}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Label(Consumer)} instead.
     * @param id ID of the label.
     * @param name Name of the label.
     * @param prefix Prefix of the label.
     */
    @ApiStatus.Internal
    public Label(String id, String name, String prefix) {
        this.id = id;
        this.name = name;
        this.prefix = prefix;
    }

}
