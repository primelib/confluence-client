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
 * SpaceWatch
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
    "spaceKey",
    "labelName",
    "prefix"
})
@JsonTypeName("SpaceWatch")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpaceWatch {

    @JsonProperty("type")
    protected String type;

    @JsonProperty("watcher")
    protected WatchUser watcher;

    @JsonProperty("spaceKey")
    protected String spaceKey;

    @JsonProperty("labelName")
    protected String labelName;

    @JsonProperty("prefix")
    protected String prefix;

    /**
     * Constructs a validated instance of {@link SpaceWatch}.
     *
     * @param spec the specification to process
     */
    public SpaceWatch(Consumer<SpaceWatch> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpaceWatch}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpaceWatch(Consumer)} instead.
     * @param type type
     * @param watcher watcher
     * @param spaceKey spaceKey
     * @param labelName labelName
     * @param prefix prefix
     */
    @ApiStatus.Internal
    public SpaceWatch(String type, WatchUser watcher, String spaceKey, String labelName, String prefix) {
        this.type = type;
        this.watcher = watcher;
        this.spaceKey = spaceKey;
        this.labelName = labelName;
        this.prefix = prefix;
    }

}
