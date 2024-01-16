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
 * ContentRestrictionsExpandable
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
    "read",
    "update"
})
@JsonTypeName("Content_restrictions__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentRestrictionsExpandable {

    @JsonProperty("read")
    protected String read;

    @JsonProperty("update")
    protected String update;

    /**
     * Constructs a validated instance of {@link ContentRestrictionsExpandable}.
     *
     * @param spec the specification to process
     */
    public ContentRestrictionsExpandable(Consumer<ContentRestrictionsExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentRestrictionsExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentRestrictionsExpandable(Consumer)} instead.
     * @param read read
     * @param update update
     */
    @ApiStatus.Internal
    public ContentRestrictionsExpandable(String read, String update) {
        this.read = read;
        this.update = update;
    }

}
