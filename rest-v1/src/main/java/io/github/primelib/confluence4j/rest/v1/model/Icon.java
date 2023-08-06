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
 * Icon
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
    "path",
    "width",
    "height",
    "isDefault"
})
@JsonTypeName("Icon")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Icon {

    @JsonProperty("path")
    protected String path;

    @JsonProperty("width")
    protected Integer width;

    @JsonProperty("height")
    protected Integer height;

    @JsonProperty("isDefault")
    protected Boolean isDefault;

    /**
     * Constructs a validated instance of {@link Icon}.
     *
     * @param spec the specification to process
     */
    public Icon(Consumer<Icon> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Icon}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Icon(Consumer)} instead.
     * @param path path
     * @param width width
     * @param height height
     * @param isDefault isDefault
     */
    @ApiStatus.Internal
    public Icon(String path, Integer width, Integer height, Boolean isDefault) {
        this.path = path;
        this.width = width;
        this.height = height;
        this.isDefault = isDefault;
    }

}
