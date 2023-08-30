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
 * AbstractPageLinks
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
    "webui",
    "editui",
    "tinyui"
})
@JsonTypeName("AbstractPageLinks")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AbstractPageLinks {

    /**
     * Web UI link of the content.
     */
    @JsonProperty("webui")
    protected String webui;

    /**
     * Edit UI link of the content.
     */
    @JsonProperty("editui")
    protected String editui;

    /**
     * Web UI link of the content.
     */
    @JsonProperty("tinyui")
    protected String tinyui;

    /**
     * Constructs a validated instance of {@link AbstractPageLinks}.
     *
     * @param spec the specification to process
     */
    public AbstractPageLinks(Consumer<AbstractPageLinks> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AbstractPageLinks}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AbstractPageLinks(Consumer)} instead.
     * @param webui Web UI link of the content.
     * @param editui Edit UI link of the content.
     * @param tinyui Web UI link of the content.
     */
    @ApiStatus.Internal
    public AbstractPageLinks(String webui, String editui, String tinyui) {
        this.webui = webui;
        this.editui = editui;
        this.tinyui = tinyui;
    }

}
