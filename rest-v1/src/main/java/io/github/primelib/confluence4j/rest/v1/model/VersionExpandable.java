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
 * VersionExpandable
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
    "content",
    "collaborators"
})
@JsonTypeName("Version__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionExpandable {

    @JsonProperty("content")
    protected String content;

    @JsonProperty("collaborators")
    protected String collaborators;

    /**
     * Constructs a validated instance of {@link VersionExpandable}.
     *
     * @param spec the specification to process
     */
    public VersionExpandable(Consumer<VersionExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link VersionExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #VersionExpandable(Consumer)} instead.
     * @param content content
     * @param collaborators collaborators
     */
    @ApiStatus.Internal
    public VersionExpandable(String content, String collaborators) {
        this.content = content;
        this.collaborators = collaborators;
    }

}
