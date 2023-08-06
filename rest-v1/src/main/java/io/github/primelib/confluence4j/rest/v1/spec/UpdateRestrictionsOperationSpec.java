package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.ContentRestriction;
import io.github.primelib.confluence4j.rest.v1.model.ContentRestrictionAddOrUpdateArray;
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
 * UpdateRestrictionsSpec
 * <p>
 * Specification for the UpdateRestrictions operation.
 * <p>
 * Update restrictions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateRestrictionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content to update restrictions for.
     */
    @NotNull 
    private String id;

    /**
     * The updated restrictions for the content.
     */
    @NotNull 
    private ContentRestrictionAddOrUpdateArray body;

    /**
     * A multi-value parameter indicating which properties of the content restrictions (returned in response) to expand.
     * - {@code restrictions.user} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code content} returns the piece of content that the restrictions are applied to.
     */
    @Nullable 
    private List<String> expand;

    /**
     * Constructs a validated instance of {@link UpdateRestrictionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateRestrictionsOperationSpec(Consumer<UpdateRestrictionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateRestrictionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content to update restrictions for.
     * @param body                 The updated restrictions for the content.
     * @param expand               A multi-value parameter indicating which properties of the content restrictions (returned in response) to expand.  - {@code restrictions.user} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code content} returns the piece of content that the restrictions are applied to.
     */
    @ApiStatus.Internal
    public UpdateRestrictionsOperationSpec(String id, ContentRestrictionAddOrUpdateArray body, List<String> expand) {
        this.id = id;
        this.body = body;
        this.expand = expand;

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
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}
