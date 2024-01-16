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
 * CustomContentLinks
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
    "webui"
})
@JsonTypeName("CustomContentLinks")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomContentLinks {

    /**
     * Web UI link of the content.
     */
    @JsonProperty("webui")
    protected String webui;

    /**
     * Constructs a validated instance of {@link CustomContentLinks}.
     *
     * @param spec the specification to process
     */
    public CustomContentLinks(Consumer<CustomContentLinks> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomContentLinks}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomContentLinks(Consumer)} instead.
     * @param webui Web UI link of the content.
     */
    @ApiStatus.Internal
    public CustomContentLinks(String webui) {
        this.webui = webui;
    }

}
