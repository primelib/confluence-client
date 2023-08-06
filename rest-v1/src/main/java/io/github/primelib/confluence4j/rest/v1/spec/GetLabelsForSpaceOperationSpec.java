package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Space;
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
 * GetLabelsForSpaceSpec
 * <p>
 * Specification for the GetLabelsForSpace operation.
 * <p>
 * Get Space Labels
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetLabelsForSpaceOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the space to get labels for.
     */
    @NotNull 
    private String spaceKey;

    /**
     * Filters the results to labels with the specified prefix. If this parameter is not specified, then labels with any prefix will be returned.
     * - {@code global} prefix is used by labels that are on content within the provided space. - {@code my} prefix can be explicitly added by a user when adding a label via the UI, e.g. 'my:example-label'. - {@code team} prefix is used for labels applied to the space.
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
     * Constructs a validated instance of {@link GetLabelsForSpaceOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetLabelsForSpaceOperationSpec(Consumer<GetLabelsForSpaceOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetLabelsForSpaceOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceKey             The key of the space to get labels for.
     * @param prefix               Filters the results to labels with the specified prefix. If this parameter is not specified, then labels with any prefix will be returned.  - {@code global} prefix is used by labels that are on content within the provided space. - {@code my} prefix can be explicitly added by a user when adding a label via the UI, e.g. 'my:example-label'. - {@code team} prefix is used for labels applied to the space.
     * @param start                The starting index of the returned labels.
     * @param limit                The maximum number of labels to return per page. Note, this may be restricted by fixed system limits.
     */
    @ApiStatus.Internal
    public GetLabelsForSpaceOperationSpec(String spaceKey, String prefix, Integer start, Integer limit) {
        this.spaceKey = spaceKey;
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
        Objects.requireNonNull(spaceKey, "spaceKey is a required parameter!");
    }
}
