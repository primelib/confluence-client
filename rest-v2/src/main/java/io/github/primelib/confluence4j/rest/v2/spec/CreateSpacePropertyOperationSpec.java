package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.Space;
import io.github.primelib.confluence4j.rest.v2.model.SpaceProperty;
import io.github.primelib.confluence4j.rest.v2.model.SpacePropertyCreateRequest;
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
 * CreateSpacePropertySpec
 * <p>
 * Specification for the CreateSpaceProperty operation.
 * <p>
 * Create space property in space
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateSpacePropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the space for which space properties should be returned.
     */
    @NotNull 
    private Long spaceId;

    /**
     * The space property to be created
     */
    @NotNull 
    private SpacePropertyCreateRequest spacePropertyCreateRequest;

    /**
     * Constructs a validated instance of {@link CreateSpacePropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateSpacePropertyOperationSpec(Consumer<CreateSpacePropertyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateSpacePropertyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceId              The ID of the space for which space properties should be returned.
     * @param spacePropertyCreateRequest The space property to be created
     */
    @ApiStatus.Internal
    public CreateSpacePropertyOperationSpec(Long spaceId, SpacePropertyCreateRequest spacePropertyCreateRequest) {
        this.spaceId = spaceId;
        this.spacePropertyCreateRequest = spacePropertyCreateRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(spaceId, "spaceId is a required parameter!");
        Objects.requireNonNull(spacePropertyCreateRequest, "spacePropertyCreateRequest is a required parameter!");
    }
}
