package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.Task;
import io.github.primelib.confluence4j.rest.v2.model.UpdateTaskRequest;
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
 * UpdateTaskSpec
 * <p>
 * Specification for the UpdateTask operation.
 * <p>
 * Update task
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateTaskOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the task to be updated. If you don't know the task ID, use Get tasks and filter the results.
     */
    @NotNull 
    private Long id;

    /**
     */
    @NotNull 
    private UpdateTaskRequest updateTaskRequest;

    /**
     * Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @Nullable 
    private Boolean serializeIdsAsStrings;

    /**
     * Constructs a validated instance of {@link UpdateTaskOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateTaskOperationSpec(Consumer<UpdateTaskOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateTaskOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the task to be updated. If you don't know the task ID, use Get tasks and filter the results.
     * @param updateTaskRequest    
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @ApiStatus.Internal
    public UpdateTaskOperationSpec(Long id, UpdateTaskRequest updateTaskRequest, Boolean serializeIdsAsStrings) {
        this.id = id;
        this.updateTaskRequest = updateTaskRequest;
        this.serializeIdsAsStrings = serializeIdsAsStrings;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(updateTaskRequest, "updateTaskRequest is a required parameter!");
    }
}
