package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
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
 * GetLabelsForContentSpec
 * <p>
 * Specification for the GetLabelsForContent operation.
 * <p>
 * Get labels for content
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetLabelsForContentOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content to be queried for its labels.
     */
    @NotNull 
    private String id;

    /**
     * Filters the results to labels with the specified prefix. If this parameter is not specified, then labels with any prefix will be returned.
     * - {@code global} prefix is used by default when a user adds a label via the UI. - {@code my} prefix can be explicitly added by a user when adding a label via the UI, e.g. 'my:example-label'. Also, when a page is selected as a favourite, the 'my:favourite' label is automatically added. - {@code team} can used when adding labels via [Add labels to content](#api-content-id-label-post) but is not used in the UI.
     */
    @Nullable 
    private String prefix;

    /**
     * The starting index of the returned labels.
     */
    @Nullable 
    private Integer start;

    /**
     * The maximum number of labels to return per page. Note, this may be restricted by fixed system limits.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetLabelsForContentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetLabelsForContentOperationSpec(Consumer<GetLabelsForContentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetLabelsForContentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content to be queried for its labels.
     * @param prefix               Filters the results to labels with the specified prefix. If this parameter is not specified, then labels with any prefix will be returned.  - {@code global} prefix is used by default when a user adds a label via the UI. - {@code my} prefix can be explicitly added by a user when adding a label via the UI, e.g. 'my:example-label'. Also, when a page is selected as a favourite, the 'my:favourite' label is automatically added. - {@code team} can used when adding labels via [Add labels to content](#api-content-id-label-post) but is not used in the UI.
     * @param start                The starting index of the returned labels.
     * @param limit                The maximum number of labels to return per page. Note, this may be restricted by fixed system limits.
     */
    @ApiStatus.Internal
    public GetLabelsForContentOperationSpec(String id, String prefix, Integer start, Integer limit) {
        this.id = id;
        this.prefix = prefix;
        this.start = start;
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
        Objects.requireNonNull(id, "id is a required parameter!");
    }
}
