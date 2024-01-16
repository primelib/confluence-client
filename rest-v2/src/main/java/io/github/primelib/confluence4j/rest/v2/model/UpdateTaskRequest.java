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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * UpdateTaskRequest
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
    "localId",
    "spaceId",
    "pageId",
    "blogPostId",
    "status",
    "createdBy",
    "assignedTo",
    "completedBy",
    "createdAt",
    "updatedAt",
    "dueAt",
    "completedAt"
})
@JsonTypeName("updateTask_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateTaskRequest {

    /**
     * ID of the task.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Local ID of the task. This ID is local to the corresponding page or blog post.
     */
    @JsonProperty("localId")
    protected String localId;

    /**
     * ID of the space the task is in.
     */
    @JsonProperty("spaceId")
    protected String spaceId;

    /**
     * ID of the page the task is in.
     */
    @JsonProperty("pageId")
    protected String pageId;

    /**
     * ID of the blog post the task is in.
     */
    @JsonProperty("blogPostId")
    protected String blogPostId;

    /**
     * Status of the task.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * Account ID of the user who created this task.
     */
    @JsonProperty("createdBy")
    protected String createdBy;

    /**
     * Account ID of the user to whom this task is assigned.
     */
    @JsonProperty("assignedTo")
    protected String assignedTo;

    /**
     * Account ID of the user who completed this task.
     */
    @JsonProperty("completedBy")
    protected String completedBy;

    /**
     * Date and time when the task was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     */
    @JsonProperty("createdAt")
    protected OffsetDateTime createdAt;

    /**
     * Date and time when the task was updated. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     */
    @JsonProperty("updatedAt")
    protected OffsetDateTime updatedAt;

    /**
     * Date and time when the task is due. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     */
    @JsonProperty("dueAt")
    protected OffsetDateTime dueAt;

    /**
     * Date and time when the task was completed. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     */
    @JsonProperty("completedAt")
    protected OffsetDateTime completedAt;

    /**
     * Constructs a validated instance of {@link UpdateTaskRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateTaskRequest(Consumer<UpdateTaskRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateTaskRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateTaskRequest(Consumer)} instead.
     * @param id ID of the task.
     * @param localId Local ID of the task. This ID is local to the corresponding page or blog post.
     * @param spaceId ID of the space the task is in.
     * @param pageId ID of the page the task is in.
     * @param blogPostId ID of the blog post the task is in.
     * @param status Status of the task.
     * @param createdBy Account ID of the user who created this task.
     * @param assignedTo Account ID of the user to whom this task is assigned.
     * @param completedBy Account ID of the user who completed this task.
     * @param createdAt Date and time when the task was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     * @param updatedAt Date and time when the task was updated. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     * @param dueAt Date and time when the task is due. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     * @param completedAt Date and time when the task was completed. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     */
    @ApiStatus.Internal
    public UpdateTaskRequest(String id, String localId, String spaceId, String pageId, String blogPostId, StatusEnum status, String createdBy, String assignedTo, String completedBy, OffsetDateTime createdAt, OffsetDateTime updatedAt, OffsetDateTime dueAt, OffsetDateTime completedAt) {
        this.id = id;
        this.localId = localId;
        this.spaceId = spaceId;
        this.pageId = pageId;
        this.blogPostId = blogPostId;
        this.status = status;
        this.createdBy = createdBy;
        this.assignedTo = assignedTo;
        this.completedBy = completedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.dueAt = dueAt;
        this.completedAt = completedAt;
    }

    /**
     * Status of the task.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        COMPLETE("complete"),
        INCOMPLETE("incomplete");

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
