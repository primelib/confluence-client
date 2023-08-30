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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ContentUpdate
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
    "title",
    "type",
    "status",
    "ancestors",
    "body"
})
@JsonTypeName("ContentUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentUpdate {

    @JsonProperty("version")
    protected ContentUpdateVersion version;

    /**
     * The updated title of the content. If you are updating a non-draft {@code page} or {@code blogpost}, title is required. If you are not changing the title, set this field to the the current title.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The type of content. Set this to the current type of the content. For example, - page - blogpost - comment - attachment
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The updated status of the content. Note, if you change the status of a page from 'current' to 'draft' and it has an existing draft, the existing draft will be deleted in favor of the updated page.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * The new parent for the content. Only one parent content 'id' can be specified.
     */
    @JsonProperty("ancestors")
    protected List<ContentUpdateAncestorsInner> ancestors;

    @JsonProperty("body")
    protected ContentUpdateBody body;

    /**
     * Constructs a validated instance of {@link ContentUpdate}.
     *
     * @param spec the specification to process
     */
    public ContentUpdate(Consumer<ContentUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentUpdate(Consumer)} instead.
     * @param version version
     * @param title The updated title of the content. If you are updating a non-draft {@code page} or {@code blogpost}, title is required. If you are not changing the title, set this field to the the current title.
     * @param type The type of content. Set this to the current type of the content. For example, - page - blogpost - comment - attachment
     * @param status The updated status of the content. Note, if you change the status of a page from 'current' to 'draft' and it has an existing draft, the existing draft will be deleted in favor of the updated page.
     * @param ancestors The new parent for the content. Only one parent content 'id' can be specified.
     * @param body body
     */
    @ApiStatus.Internal
    public ContentUpdate(ContentUpdateVersion version, String title, String type, StatusEnum status, List<ContentUpdateAncestorsInner> ancestors, ContentUpdateBody body) {
        this.version = version;
        this.title = title;
        this.type = type;
        this.status = status;
        this.ancestors = ancestors;
        this.body = body;
    }

    /**
     * The updated status of the content. Note, if you change the status of a page from 'current' to 'draft' and it has an existing draft, the existing draft will be deleted in favor of the updated page.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        CURRENT("current"),
        TRASHED("trashed"),
        DELETED("deleted"),
        HISTORICAL("historical"),
        DRAFT("draft");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
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
