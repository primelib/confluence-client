package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.CreatePageRequest;
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
 * CreatePageSpec
 * <p>
 * Specification for the CreatePage operation.
 * <p>
 * Create page
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreatePageOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private CreatePageRequest createPageRequest;

    /**
     * Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @Nullable 
    private Boolean serializeIdsAsStrings;

    /**
     * Tag the content as embedded and content will be created in NCS.
     */
    @Nullable 
    private Boolean embedded;

    /**
     * The page will be private. Only the user who creates this page will have permission to view and edit one.
     */
    @Nullable 
    private Boolean _private;

    /**
     * Constructs a validated instance of {@link CreatePageOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreatePageOperationSpec(Consumer<CreatePageOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreatePageOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param createPageRequest    
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param embedded             Tag the content as embedded and content will be created in NCS.
     * @param _private             The page will be private. Only the user who creates this page will have permission to view and edit one.
     */
    @ApiStatus.Internal
    public CreatePageOperationSpec(CreatePageRequest createPageRequest, Boolean serializeIdsAsStrings, Boolean embedded, Boolean _private) {
        this.createPageRequest = createPageRequest;
        this.serializeIdsAsStrings = serializeIdsAsStrings;
        this.embedded = embedded;
        this._private = _private;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(createPageRequest, "createPageRequest is a required parameter!");
    }
}
