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
 * ContentCreate
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
    "title",
    "type",
    "space",
    "status",
    "container",
    "ancestors",
    "body"
})
@JsonTypeName("ContentCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentCreate {

    /**
     * The ID of the draft content. Required when publishing a draft.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("title")
    protected String title;

    /**
     * The type of the new content. Custom content types defined by apps are also supported. eg. 'page', 'blogpost', 'comment' etc.
     */
    @JsonProperty("type")
    protected String type;

    @JsonProperty("space")
    protected ContentCreateSpace space;

    /**
     * The status of the new content.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    @JsonProperty("container")
    protected ContentCreateContainer container;

    /**
     * The parent content of the new content.
     * If you are creating a top-level {@code page} or {@code comment}, this can be left blank. If you are creating a child page, this is where the parent page id goes. If you are creating a child comment, this is where the parent comment id goes. Only one parent content id can be specified.
     */
    @JsonProperty("ancestors")
    protected List<ContentCreateAncestorsInner> ancestors;

    @JsonProperty("body")
    protected ContentCreateBody body;

    /**
     * Constructs a validated instance of {@link ContentCreate}.
     *
     * @param spec the specification to process
     */
    public ContentCreate(Consumer<ContentCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentCreate(Consumer)} instead.
     * @param id The ID of the draft content. Required when publishing a draft.
     * @param title title
     * @param type The type of the new content. Custom content types defined by apps are also supported. eg. 'page', 'blogpost', 'comment' etc.
     * @param space space
     * @param status The status of the new content.
     * @param container container
     * @param ancestors The parent content of the new content.  If you are creating a top-level {@code page} or {@code comment}, this can be left blank. If you are creating a child page, this is where the parent page id goes. If you are creating a child comment, this is where the parent comment id goes. Only one parent content id can be specified.
     * @param body body
     */
    @ApiStatus.Internal
    public ContentCreate(String id, String title, String type, ContentCreateSpace space, StatusEnum status, ContentCreateContainer container, List<ContentCreateAncestorsInner> ancestors, ContentCreateBody body) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.space = space;
        this.status = status;
        this.container = container;
        this.ancestors = ancestors;
        this.body = body;
    }

    /**
     * The status of the new content.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        CURRENT("current"),
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
