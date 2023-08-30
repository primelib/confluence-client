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
 * Watch
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
    "type",
    "watcher",
    "contentId"
})
@JsonTypeName("Watch")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Watch {

    @JsonProperty("type")
    protected String type;

    @JsonProperty("watcher")
    protected WatchUser watcher;

    @JsonProperty("contentId")
    protected Long contentId;

    /**
     * Constructs a validated instance of {@link Watch}.
     *
     * @param spec the specification to process
     */
    public Watch(Consumer<Watch> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Watch}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Watch(Consumer)} instead.
     * @param type type
     * @param watcher watcher
     * @param contentId contentId
     */
    @ApiStatus.Internal
    public Watch(String type, WatchUser watcher, Long contentId) {
        this.type = type;
        this.watcher = watcher;
        this.contentId = contentId;
    }

}
