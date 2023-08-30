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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AttachmentUpdate
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
    "version",
    "id",
    "type",
    "title",
    "metadata",
    "container"
})
@JsonTypeName("AttachmentUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentUpdate {

    @JsonProperty("version")
    protected AttachmentUpdateVersion version;

    /**
     * The ID of the attachment to be updated.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Set this to {@code attachment}.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The updated name of the attachment.
     */
    @JsonProperty("title")
    protected String title;

    @JsonProperty("metadata")
    protected AttachmentUpdateMetadata metadata;

    @JsonProperty("container")
    protected AttachmentUpdateContainer container;

    /**
     * Constructs a validated instance of {@link AttachmentUpdate}.
     *
     * @param spec the specification to process
     */
    public AttachmentUpdate(Consumer<AttachmentUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttachmentUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttachmentUpdate(Consumer)} instead.
     * @param version version
     * @param id The ID of the attachment to be updated.
     * @param type Set this to {@code attachment}.
     * @param title The updated name of the attachment.
     * @param metadata metadata
     * @param container container
     */
    @ApiStatus.Internal
    public AttachmentUpdate(AttachmentUpdateVersion version, String id, TypeEnum type, String title, AttachmentUpdateMetadata metadata, AttachmentUpdateContainer container) {
        this.version = version;
        this.id = id;
        this.type = type;
        this.title = title;
        this.metadata = metadata;
        this.container = container;
    }

    /**
     * Set this to {@code attachment}.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        ATTACHMENT("attachment");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
