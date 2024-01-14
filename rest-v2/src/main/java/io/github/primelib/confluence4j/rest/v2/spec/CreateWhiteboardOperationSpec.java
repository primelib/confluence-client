package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.CreateWhiteboardRequest;
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
 * CreateWhiteboardSpec
 * <p>
 * Specification for the CreateWhiteboard operation.
 * <p>
 * Create whiteboard
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWhiteboardOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private CreateWhiteboardRequest createWhiteboardRequest;

    /**
     * The whiteboard will be private. Only the user who creates this whiteboard will have permission to view and edit one.
     */
    @Nullable 
    private Boolean _private;

    /**
     * Constructs a validated instance of {@link CreateWhiteboardOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateWhiteboardOperationSpec(Consumer<CreateWhiteboardOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateWhiteboardOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param createWhiteboardRequest 
     * @param _private             The whiteboard will be private. Only the user who creates this whiteboard will have permission to view and edit one.
     */
    @ApiStatus.Internal
    public CreateWhiteboardOperationSpec(CreateWhiteboardRequest createWhiteboardRequest, Boolean _private) {
        this.createWhiteboardRequest = createWhiteboardRequest;
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
        Objects.requireNonNull(createWhiteboardRequest, "createWhiteboardRequest is a required parameter!");
    }
}
