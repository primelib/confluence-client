package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.ContentState;
import io.github.primelib.confluence4j.rest.v1.model.ContentStateRestInput;
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
 * SetContentStateSpec
 * <p>
 * Specification for the SetContentState operation.
 * <p>
 * Set the content state of a content and publishes a new version of the content.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetContentStateOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The Id of the content whose content state is to be set.
     */
    @NotNull 
    private String id;

    /**
     * Content state fields for state. Pass in id for an existing state, or new name and color for best matching existing state, or new state if allowed in space.
     */
    @NotNull 
    private ContentStateRestInput contentStateRestInput;

    /**
     * Status of content onto which state will be placed. If draft, then draft state will change. If current, state will be placed onto a new version of the content with same body as previous version.
     */
    @Nullable 
    private String status;

    /**
     * Constructs a validated instance of {@link SetContentStateOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetContentStateOperationSpec(Consumer<SetContentStateOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetContentStateOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The Id of the content whose content state is to be set.
     * @param contentStateRestInput Content state fields for state. Pass in id for an existing state, or new name and color for best matching existing state, or new state if allowed in space.
     * @param status               Status of content onto which state will be placed. If draft, then draft state will change. If current, state will be placed onto a new version of the content with same body as previous version.
     */
    @ApiStatus.Internal
    public SetContentStateOperationSpec(String id, ContentStateRestInput contentStateRestInput, String status) {
        this.id = id;
        this.contentStateRestInput = contentStateRestInput;
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(contentStateRestInput, "contentStateRestInput is a required parameter!");
    }
}
