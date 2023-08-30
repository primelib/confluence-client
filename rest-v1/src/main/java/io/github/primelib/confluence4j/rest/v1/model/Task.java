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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Task
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
    "globalId",
    "id",
    "contentId",
    "status",
    "title",
    "description",
    "body",
    "creator",
    "assignee",
    "completeUser",
    "createDate",
    "dueDate",
    "updateDate",
    "completeDate",
    "_links"
})
@JsonTypeName("Task")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Task {

    @JsonProperty("globalId")
    protected Long globalId;

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("contentId")
    protected Long contentId;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("body")
    protected String body;

    @JsonProperty("creator")
    protected String creator;

    @JsonProperty("assignee")
    protected String assignee;

    @JsonProperty("completeUser")
    protected String completeUser;

    @JsonProperty("createDate")
    protected Long createDate;

    @JsonProperty("dueDate")
    protected Long dueDate;

    @JsonProperty("updateDate")
    protected Long updateDate;

    @JsonProperty("completeDate")
    protected Long completeDate;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link Task}.
     *
     * @param spec the specification to process
     */
    public Task(Consumer<Task> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Task}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Task(Consumer)} instead.
     * @param globalId globalId
     * @param id id
     * @param contentId contentId
     * @param status status
     * @param title title
     * @param description description
     * @param body body
     * @param creator creator
     * @param assignee assignee
     * @param completeUser completeUser
     * @param createDate createDate
     * @param dueDate dueDate
     * @param updateDate updateDate
     * @param completeDate completeDate
     * @param _links _links
     */
    @ApiStatus.Internal
    public Task(Long globalId, Long id, Long contentId, String status, String title, String description, String body, String creator, String assignee, String completeUser, Long createDate, Long dueDate, Long updateDate, Long completeDate, Map<String, String> _links) {
        this.globalId = globalId;
        this.id = id;
        this.contentId = contentId;
        this.status = status;
        this.title = title;
        this.description = description;
        this.body = body;
        this.creator = creator;
        this.assignee = assignee;
        this.completeUser = completeUser;
        this.createDate = createDate;
        this.dueDate = dueDate;
        this.updateDate = updateDate;
        this.completeDate = completeDate;
        this._links = _links;
    }

}
