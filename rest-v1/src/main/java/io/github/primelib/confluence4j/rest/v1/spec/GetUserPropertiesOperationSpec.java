package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.User;
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
 * GetUserPropertiesSpec
 * <p>
 * Specification for the GetUserProperties operation.
 * <p>
 * Get user properties
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUserPropertiesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The account ID of the user to be queried for its properties.
     */
    @NotNull 
    private String userId;

    /**
     * The starting index of the returned properties.
     */
    @Nullable 
    private Integer start;

    /**
     * The maximum number of properties to return per page. Note, this may be restricted by fixed system limits.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetUserPropertiesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetUserPropertiesOperationSpec(Consumer<GetUserPropertiesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetUserPropertiesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param userId               The account ID of the user to be queried for its properties.
     * @param start                The starting index of the returned properties.
     * @param limit                The maximum number of properties to return per page. Note, this may be restricted by fixed system limits.
     */
    @ApiStatus.Internal
    public GetUserPropertiesOperationSpec(String userId, Integer start, Integer limit) {
        this.userId = userId;
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
        Objects.requireNonNull(userId, "userId is a required parameter!");
    }
}
