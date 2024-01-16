package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.CreateInlineCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.InlineCommentModel;
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
 * CreateInlineCommentSpec
 * <p>
 * Specification for the CreateInlineComment operation.
 * <p>
 * Create inline comment
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateInlineCommentOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The inline comment to be created
     */
    @NotNull 
    private CreateInlineCommentModel createInlineCommentModel;

    /**
     * Constructs a validated instance of {@link CreateInlineCommentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateInlineCommentOperationSpec(Consumer<CreateInlineCommentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateInlineCommentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param createInlineCommentModel The inline comment to be created
     */
    @ApiStatus.Internal
    public CreateInlineCommentOperationSpec(CreateInlineCommentModel createInlineCommentModel) {
        this.createInlineCommentModel = createInlineCommentModel;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(createInlineCommentModel, "createInlineCommentModel is a required parameter!");
    }
}
