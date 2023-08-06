package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

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
 * GetRestrictionsSpec
 * <p>
 * Specification for the GetRestrictions operation.
 * <p>
 * Get restrictions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetRestrictionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content to be queried for its restrictions.
     */
    @NotNull 
    private String id;

    /**
     * A multi-value parameter indicating which properties of the content restrictions to expand. By default, the following objects are expanded: {@code restrictions.user}, {@code restrictions.group}.
     * - {@code restrictions.user} returns the piece of content that the restrictions are applied to. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. - {@code content} returns the piece of content that the restrictions are applied to.
     */
    @Nullable 
    private List<String> expand;

    /**
     * The starting index of the users and groups in the returned restrictions.
     */
    @Nullable 
    private Integer start;

    /**
     * The maximum number of users and the maximum number of groups, in the returned restrictions, to return per page. Note, this may be restricted by fixed system limits.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetRestrictionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetRestrictionsOperationSpec(Consumer<GetRestrictionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetRestrictionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content to be queried for its restrictions.
     * @param expand               A multi-value parameter indicating which properties of the content restrictions to expand. By default, the following objects are expanded: {@code restrictions.user}, {@code restrictions.group}.  - {@code restrictions.user} returns the piece of content that the restrictions are applied to. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. - {@code content} returns the piece of content that the restrictions are applied to.
     * @param start                The starting index of the users and groups in the returned restrictions.
     * @param limit                The maximum number of users and the maximum number of groups, in the returned restrictions, to return per page. Note, this may be restricted by fixed system limits.
     */
    @ApiStatus.Internal
    public GetRestrictionsOperationSpec(String id, List<String> expand, Integer start, Integer limit) {
        this.id = id;
        this.expand = expand;
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
