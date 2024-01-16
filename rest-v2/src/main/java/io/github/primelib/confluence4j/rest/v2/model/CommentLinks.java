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
 * CommentLinks
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
@JsonTypeName("CommentLinks")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CommentLinks {

    /**
     * Web UI link of the content.
     */
    @JsonProperty("webui")
    protected String webui;

    /**
     * Constructs a validated instance of {@link CommentLinks}.
     *
     * @param spec the specification to process
     */
    public CommentLinks(Consumer<CommentLinks> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CommentLinks}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CommentLinks(Consumer)} instead.
     * @param webui Web UI link of the content.
     */
    @ApiStatus.Internal
    public CommentLinks(String webui) {
        this.webui = webui;
    }

}
