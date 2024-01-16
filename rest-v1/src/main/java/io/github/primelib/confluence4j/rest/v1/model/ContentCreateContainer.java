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
 * ContentCreateContainer
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
    "type"
})
@JsonTypeName("ContentCreate_container")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentCreateContainer {

    @JsonProperty("id")
    protected ContentCreateContainerId id;

    /**
     * The {@code type} of the container.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link ContentCreateContainer}.
     *
     * @param spec the specification to process
     */
    public ContentCreateContainer(Consumer<ContentCreateContainer> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentCreateContainer}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentCreateContainer(Consumer)} instead.
     * @param id id
     * @param type The {@code type} of the container.
     */
    @ApiStatus.Internal
    public ContentCreateContainer(ContentCreateContainerId id, String type) {
        this.id = id;
        this.type = type;
    }

}
