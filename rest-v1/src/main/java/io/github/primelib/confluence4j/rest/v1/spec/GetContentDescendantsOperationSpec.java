package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
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
 * GetContentDescendantsSpec
 * <p>
 * Specification for the GetContentDescendants operation.
 * <p>
 * Get content descendants
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetContentDescendantsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content to be queried for its descendants.
     */
    @NotNull 
    private String id;

    /**
     * A multi-value parameter indicating which properties of the children to expand, where:
     * - {@code attachment} returns all attachments for the content. - {@code comments} returns all comments for the content. - {@code page} returns all child pages of the content.
     */
    @Nullable 
    private List<String> expand;

    /**
     * Constructs a validated instance of {@link GetContentDescendantsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetContentDescendantsOperationSpec(Consumer<GetContentDescendantsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetContentDescendantsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content to be queried for its descendants.
     * @param expand               A multi-value parameter indicating which properties of the children to expand, where:  - {@code attachment} returns all attachments for the content. - {@code comments} returns all comments for the content. - {@code page} returns all child pages of the content.
     */
    @ApiStatus.Internal
    public GetContentDescendantsOperationSpec(String id, List<String> expand) {
        this.id = id;
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
    }
}
