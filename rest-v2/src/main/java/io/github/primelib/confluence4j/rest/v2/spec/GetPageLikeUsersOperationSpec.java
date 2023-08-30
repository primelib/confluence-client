package io.github.primelib.confluence4j.rest.v2.spec;

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
 * GetPageLikeUsersSpec
 * <p>
 * Specification for the GetPageLikeUsers operation.
 * <p>
 * Get account IDs of likes for page
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPageLikeUsersOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the page for which like count should be returned.
     */
    @NotNull 
    private Long id;

    /**
     * Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     */
    @Nullable 
    private String cursor;

    /**
     * Maximum number of account IDs per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetPageLikeUsersOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPageLikeUsersOperationSpec(Consumer<GetPageLikeUsersOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetPageLikeUsersOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the page for which like count should be returned.
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     * @param limit                Maximum number of account IDs per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.
     */
    @ApiStatus.Internal
    public GetPageLikeUsersOperationSpec(Long id, String cursor, Integer limit) {
        this.id = id;
        this.cursor = cursor;
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
