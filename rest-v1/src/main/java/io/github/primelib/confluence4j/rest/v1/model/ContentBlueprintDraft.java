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
 * ContentBlueprintDraft
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
    "space",
    "ancestors"
})
@JsonTypeName("ContentBlueprintDraft")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentBlueprintDraft {

    @JsonProperty("version")
    protected ContentBlueprintDraftVersion version;

    /**
     * The title of the content. If you don't want to change the title, set this to the current title of the draft.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The type of content. Set this to {@code page}.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The status of the content. Set this to {@code current} or omit it altogether.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    @JsonProperty("space")
    protected ContentBlueprintDraftSpace space;

    /**
     * The new ancestor (i.e. parent page) for the content. If you have specified an ancestor, you must also specify a {@code space} property in the request body for the space that the ancestor is in.
     * Note, if you specify more than one ancestor, the last ID in the array will be selected as the parent page for the content.
     */
    @JsonProperty("ancestors")
    protected List<ContentBlueprintDraftAncestorsInner> ancestors;

    /**
     * Constructs a validated instance of {@link ContentBlueprintDraft}.
     *
     * @param spec the specification to process
     */
    public ContentBlueprintDraft(Consumer<ContentBlueprintDraft> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentBlueprintDraft}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentBlueprintDraft(Consumer)} instead.
     * @param version version
     * @param title The title of the content. If you don't want to change the title, set this to the current title of the draft.
     * @param type The type of content. Set this to {@code page}.
     * @param status The status of the content. Set this to {@code current} or omit it altogether.
     * @param space space
     * @param ancestors The new ancestor (i.e. parent page) for the content. If you have specified an ancestor, you must also specify a {@code space} property in the request body for the space that the ancestor is in.  Note, if you specify more than one ancestor, the last ID in the array will be selected as the parent page for the content.
     */
    @ApiStatus.Internal
    public ContentBlueprintDraft(ContentBlueprintDraftVersion version, String title, TypeEnum type, StatusEnum status, ContentBlueprintDraftSpace space, List<ContentBlueprintDraftAncestorsInner> ancestors) {
        this.version = version;
        this.title = title;
        this.type = type;
        this.status = status;
        this.space = space;
        this.ancestors = ancestors;
    }

    /**
     * The type of content. Set this to {@code page}.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        PAGE("page");

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

    /**
     * The status of the content. Set this to {@code current} or omit it altogether.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        CURRENT("current");

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
