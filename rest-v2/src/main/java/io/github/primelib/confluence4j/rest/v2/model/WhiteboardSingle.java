package io.github.primelib.confluence4j.rest.v2.model;

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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WhiteboardSingle
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
    "type",
    "status",
    "title",
    "parentId",
    "parentType",
    "position",
    "authorId",
    "ownerId",
    "createdAt",
    "version",
    "_links"
})
@JsonTypeName("WhiteboardSingle")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WhiteboardSingle {

    /**
     * ID of the whiteboard.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The content type of the object
     */
    @JsonProperty("type")
    protected String type;

    @JsonProperty("status")
    protected ContentStatus status;

    /**
     * Title of the whiteboard.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * ID of the parent content, or null if there is no parent content.
     */
    @JsonProperty("parentId")
    protected String parentId;

    @JsonProperty("parentType")
    protected ParentContentType parentType;

    /**
     * Position of whiteboard within the given parent page tree.
     */
    @JsonProperty("position")
    protected Integer position;

    /**
     * The account ID of the user who created this whiteboard originally.
     */
    @JsonProperty("authorId")
    protected String authorId;

    /**
     * The account ID of the user who owns this whiteboard.
     */
    @JsonProperty("ownerId")
    protected String ownerId;

    /**
     * Date and time when the whiteboard was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     */
    @JsonProperty("createdAt")
    protected OffsetDateTime createdAt;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("_links")
    protected AbstractPageLinks _links;

    /**
     * Constructs a validated instance of {@link WhiteboardSingle}.
     *
     * @param spec the specification to process
     */
    public WhiteboardSingle(Consumer<WhiteboardSingle> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WhiteboardSingle}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WhiteboardSingle(Consumer)} instead.
     * @param id ID of the whiteboard.
     * @param type The content type of the object
     * @param status status
     * @param title Title of the whiteboard.
     * @param parentId ID of the parent content, or null if there is no parent content.
     * @param parentType parentType
     * @param position Position of whiteboard within the given parent page tree.
     * @param authorId The account ID of the user who created this whiteboard originally.
     * @param ownerId The account ID of the user who owns this whiteboard.
     * @param createdAt Date and time when the whiteboard was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     * @param version version
     * @param _links _links
     */
    @ApiStatus.Internal
    public WhiteboardSingle(String id, String type, ContentStatus status, String title, String parentId, ParentContentType parentType, Integer position, String authorId, String ownerId, OffsetDateTime createdAt, Version version, AbstractPageLinks _links) {
        this.id = id;
        this.type = type;
        this.status = status;
        this.title = title;
        this.parentId = parentId;
        this.parentType = parentType;
        this.position = position;
        this.authorId = authorId;
        this.ownerId = ownerId;
        this.createdAt = createdAt;
        this.version = version;
        this._links = _links;
    }

}
