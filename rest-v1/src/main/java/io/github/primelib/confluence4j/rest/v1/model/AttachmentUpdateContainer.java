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
 * AttachmentUpdateContainer
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
@JsonTypeName("AttachmentUpdate_container")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentUpdateContainer {

    /**
     * The {@code id} of the parent content.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The content type. You can only attach attachments to content of type: {@code page}, {@code blogpost}.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link AttachmentUpdateContainer}.
     *
     * @param spec the specification to process
     */
    public AttachmentUpdateContainer(Consumer<AttachmentUpdateContainer> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttachmentUpdateContainer}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttachmentUpdateContainer(Consumer)} instead.
     * @param id The {@code id} of the parent content.
     * @param type The content type. You can only attach attachments to content of type: {@code page}, {@code blogpost}.
     */
    @ApiStatus.Internal
    public AttachmentUpdateContainer(String id, String type) {
        this.id = id;
        this.type = type;
    }

}
