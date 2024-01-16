package io.github.primelib.confluence4j.rest.v1.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Task;
import io.github.primelib.confluence4j.rest.v1.model.User;
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
 * SearchTasksSpec
 * <p>
 * Specification for the SearchTasks operation.
 * <p>
 * Get inline tasks based on search parameters
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchTasksOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The starting offset for the results.
     */
    @Nullable 
    private Integer start;

    /**
     * The number of results to be returned.
     */
    @Nullable 
    private Integer limit;

    /**
     * The space key of a space. Multiple space keys can be specified.
     */
    @Nullable 
    private String spaceKey;

    /**
     * The page id of a page. Multiple page ids can be specified.
     */
    @Nullable 
    private String pageId;

    /**
     * Account ID of a user to whom a task is assigned. Multiple users can be specified.
     */
    @Nullable 
    private String assignee;

    /**
     * Account ID of a user to who created a task. Multiple users can be specified.
     */
    @Nullable 
    private String creator;

    /**
     * Account ID of a user who completed a task. Multiple users can be specified.
     */
    @Nullable 
    private String completedUser;

    /**
     * Start of date range based on due dates (inclusive).
     */
    @Nullable 
    private Long duedateFrom;

    /**
     * End of date range based on due dates (inclusive).
     */
    @Nullable 
    private Long duedateTo;

    /**
     * Start of date range based on create dates (inclusive).
     */
    @Nullable 
    private Long createdateFrom;

    /**
     * End of date range based on create dates (inclusive).
     */
    @Nullable 
    private Long createdateTo;

    /**
     * Start of date range based on complete dates (inclusive).
     */
    @Nullable 
    private Long completedateFrom;

    /**
     * End of date range based on complete dates (inclusive).
     */
    @Nullable 
    private Long completedateTo;

    /**
     * The status of the task. (checked/unchecked)
     */
    @Nullable 
    private String status;

    /**
     * Constructs a validated instance of {@link SearchTasksOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchTasksOperationSpec(Consumer<SearchTasksOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SearchTasksOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param start                The starting offset for the results.
     * @param limit                The number of results to be returned.
     * @param spaceKey             The space key of a space. Multiple space keys can be specified.
     * @param pageId               The page id of a page. Multiple page ids can be specified.
     * @param assignee             Account ID of a user to whom a task is assigned. Multiple users can be specified.
     * @param creator              Account ID of a user to who created a task. Multiple users can be specified.
     * @param completedUser        Account ID of a user who completed a task. Multiple users can be specified.
     * @param duedateFrom          Start of date range based on due dates (inclusive).
     * @param duedateTo            End of date range based on due dates (inclusive).
     * @param createdateFrom       Start of date range based on create dates (inclusive).
     * @param createdateTo         End of date range based on create dates (inclusive).
     * @param completedateFrom     Start of date range based on complete dates (inclusive).
     * @param completedateTo       End of date range based on complete dates (inclusive).
     * @param status               The status of the task. (checked/unchecked)
     */
    @ApiStatus.Internal
    public SearchTasksOperationSpec(Integer start, Integer limit, String spaceKey, String pageId, String assignee, String creator, String completedUser, Long duedateFrom, Long duedateTo, Long createdateFrom, Long createdateTo, Long completedateFrom, Long completedateTo, String status) {
        this.start = start;
        this.limit = limit;
        this.spaceKey = spaceKey;
        this.pageId = pageId;
        this.assignee = assignee;
        this.creator = creator;
        this.completedUser = completedUser;
        this.duedateFrom = duedateFrom;
        this.duedateTo = duedateTo;
        this.createdateFrom = createdateFrom;
        this.createdateTo = createdateTo;
        this.completedateFrom = completedateFrom;
        this.completedateTo = completedateTo;
        this.status = status;

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
