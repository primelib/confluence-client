package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.PrimaryBodyRepresentation;
import io.github.primelib.confluence4j.rest.v2.model.Task;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetTasksSpec
 * <p>
 * Specification for the GetTasks operation.
 * <p>
 * Get tasks
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetTasksOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     */
    @Nullable 
    private PrimaryBodyRepresentation bodyFormat;

    /**
     * Specifies whether to include blank tasks in the response. Defaults to {@code true}.
     */
    @Nullable 
    private Boolean includeBlankTasks;

    /**
     * Filters on the status of the task.
     */
    @Nullable 
    private String status;

    /**
     * Filters on task ID. Multiple IDs can be specified.
     */
    @Nullable 
    private List<Long> taskId;

    /**
     * Filters on the space ID of the task. Multiple IDs can be specified.
     */
    @Nullable 
    private List<Long> spaceId;

    /**
     * Filters on the page ID of the task. Multiple IDs can be specified. Note - page and blog post filters can be used in conjunction.
     */
    @Nullable 
    private List<Long> pageId;

    /**
     * Filters on the blog post ID of the task. Multiple IDs can be specified. Note - page and blog post filters can be used in conjunction.
     */
    @Nullable 
    private List<Long> blogpostId;

    /**
     * Filters on the Account ID of the user who created this task. Multiple IDs can be specified.
     */
    @Nullable 
    private List<String> createdBy;

    /**
     * Filters on the Account ID of the user to whom this task is assigned. Multiple IDs can be specified.
     */
    @Nullable 
    private List<String> assignedTo;

    /**
     * Filters on the Account ID of the user who completed this task. Multiple IDs can be specified.
     */
    @Nullable 
    private List<String> completedBy;

    /**
     * Filters on start of date-time range of task based on creation date (inclusive). Input is epoch time in milliseconds.
     */
    @Nullable 
    private Long createdAtFrom;

    /**
     * Filters on end of date-time range of task based on creation date (inclusive). Input is epoch time in milliseconds.
     */
    @Nullable 
    private Long createdAtTo;

    /**
     * Filters on start of date-time range of task based on due date (inclusive). Input is epoch time in milliseconds.
     */
    @Nullable 
    private Long dueAtFrom;

    /**
     * Filters on end of date-time range of task based on due date (inclusive). Input is epoch time in milliseconds.
     */
    @Nullable 
    private Long dueAtTo;

    /**
     * Filters on start of date-time range of task based on completion date (inclusive). Input is epoch time in milliseconds.
     */
    @Nullable 
    private Long completedAtFrom;

    /**
     * Filters on end of date-time range of task based on completion date (inclusive). Input is epoch time in milliseconds.
     */
    @Nullable 
    private Long completedAtTo;

    /**
     * Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     */
    @Nullable 
    private String cursor;

    /**
     * Maximum number of tasks per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetTasksOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetTasksOperationSpec(Consumer<GetTasksOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetTasksOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     * @param includeBlankTasks    Specifies whether to include blank tasks in the response. Defaults to {@code true}.
     * @param status               Filters on the status of the task.
     * @param taskId               Filters on task ID. Multiple IDs can be specified.
     * @param spaceId              Filters on the space ID of the task. Multiple IDs can be specified.
     * @param pageId               Filters on the page ID of the task. Multiple IDs can be specified. Note - page and blog post filters can be used in conjunction.
     * @param blogpostId           Filters on the blog post ID of the task. Multiple IDs can be specified. Note - page and blog post filters can be used in conjunction.
     * @param createdBy            Filters on the Account ID of the user who created this task. Multiple IDs can be specified.
     * @param assignedTo           Filters on the Account ID of the user to whom this task is assigned. Multiple IDs can be specified.
     * @param completedBy          Filters on the Account ID of the user who completed this task. Multiple IDs can be specified.
     * @param createdAtFrom        Filters on start of date-time range of task based on creation date (inclusive). Input is epoch time in milliseconds.
     * @param createdAtTo          Filters on end of date-time range of task based on creation date (inclusive). Input is epoch time in milliseconds.
     * @param dueAtFrom            Filters on start of date-time range of task based on due date (inclusive). Input is epoch time in milliseconds.
     * @param dueAtTo              Filters on end of date-time range of task based on due date (inclusive). Input is epoch time in milliseconds.
     * @param completedAtFrom      Filters on start of date-time range of task based on completion date (inclusive). Input is epoch time in milliseconds.
     * @param completedAtTo        Filters on end of date-time range of task based on completion date (inclusive). Input is epoch time in milliseconds.
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     * @param limit                Maximum number of tasks per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.
     */
    @ApiStatus.Internal
    public GetTasksOperationSpec(PrimaryBodyRepresentation bodyFormat, Boolean includeBlankTasks, String status, List<Long> taskId, List<Long> spaceId, List<Long> pageId, List<Long> blogpostId, List<String> createdBy, List<String> assignedTo, List<String> completedBy, Long createdAtFrom, Long createdAtTo, Long dueAtFrom, Long dueAtTo, Long completedAtFrom, Long completedAtTo, String cursor, Integer limit) {
        this.bodyFormat = bodyFormat;
        this.includeBlankTasks = includeBlankTasks;
        this.status = status;
        this.taskId = taskId;
        this.spaceId = spaceId;
        this.pageId = pageId;
        this.blogpostId = blogpostId;
        this.createdBy = createdBy;
        this.assignedTo = assignedTo;
        this.completedBy = completedBy;
        this.createdAtFrom = createdAtFrom;
        this.createdAtTo = createdAtTo;
        this.dueAtFrom = dueAtFrom;
        this.dueAtTo = dueAtTo;
        this.completedAtFrom = completedAtFrom;
        this.completedAtTo = completedAtTo;
        this.cursor = cursor;
        this.limit = limit;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}
