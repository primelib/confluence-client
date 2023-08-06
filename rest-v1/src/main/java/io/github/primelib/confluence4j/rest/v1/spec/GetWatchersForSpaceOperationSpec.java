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
 * GetWatchersForSpaceSpec
 * <p>
 * Specification for the GetWatchersForSpace operation.
 * <p>
 * Get space watchers
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWatchersForSpaceOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the space to get watchers.
     */
    @NotNull 
    private String spaceKey;

    /**
     * The start point of the collection to return.
     */
    @Nullable 
    private String start;

    /**
     * The limit of the number of items to return, this may be restricted by fixed system limits.
     */
    @Nullable 
    private String limit;

    /**
     * Constructs a validated instance of {@link GetWatchersForSpaceOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetWatchersForSpaceOperationSpec(Consumer<GetWatchersForSpaceOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetWatchersForSpaceOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceKey             The key of the space to get watchers.
     * @param start                The start point of the collection to return.
     * @param limit                The limit of the number of items to return, this may be restricted by fixed system limits.
     */
    @ApiStatus.Internal
    public GetWatchersForSpaceOperationSpec(String spaceKey, String start, String limit) {
        this.spaceKey = spaceKey;
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
