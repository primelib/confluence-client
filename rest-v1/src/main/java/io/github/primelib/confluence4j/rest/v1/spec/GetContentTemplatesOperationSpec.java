package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.ContentTemplate;
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
 * GetContentTemplatesSpec
 * <p>
 * Specification for the GetContentTemplates operation.
 * <p>
 * Get content templates
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetContentTemplatesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the space to be queried for templates. If the {@code spaceKey} is not specified, global templates will be returned.
     */
    @Nullable 
    private String spaceKey;

    /**
     * The starting index of the returned templates.
     */
    @Nullable 
    private Integer start;

    /**
     * The maximum number of templates to return per page. Note, this may be restricted by fixed system limits.
     */
    @Nullable 
    private Integer limit;

    /**
     * A multi-value parameter indicating which properties of the template to expand.
     * - {@code body} returns the content of the template in storage format.
     */
    @Nullable 
    private List<String> expand;

    /**
     * Constructs a validated instance of {@link GetContentTemplatesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetContentTemplatesOperationSpec(Consumer<GetContentTemplatesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetContentTemplatesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceKey             The key of the space to be queried for templates. If the {@code spaceKey} is not specified, global templates will be returned.
     * @param start                The starting index of the returned templates.
     * @param limit                The maximum number of templates to return per page. Note, this may be restricted by fixed system limits.
     * @param expand               A multi-value parameter indicating which properties of the template to expand.  - {@code body} returns the content of the template in storage format.
     */
    @ApiStatus.Internal
    public GetContentTemplatesOperationSpec(String spaceKey, Integer start, Integer limit, List<String> expand) {
        this.spaceKey = spaceKey;
        this.start = start;
        this.limit = limit;
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
    }
}
