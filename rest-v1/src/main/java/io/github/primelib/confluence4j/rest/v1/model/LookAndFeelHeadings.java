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
 * LookAndFeelHeadings
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
    "color"
})
@JsonTypeName("LookAndFeel_headings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LookAndFeelHeadings {

    @JsonProperty("color")
    protected String color;

    /**
     * Constructs a validated instance of {@link LookAndFeelHeadings}.
     *
     * @param spec the specification to process
     */
    public LookAndFeelHeadings(Consumer<LookAndFeelHeadings> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LookAndFeelHeadings}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LookAndFeelHeadings(Consumer)} instead.
     * @param color color
     */
    @ApiStatus.Internal
    public LookAndFeelHeadings(String color) {
        this.color = color;
    }

}
