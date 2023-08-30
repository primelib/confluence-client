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
 * GetContentsWithStateSpec
 * <p>
 * Specification for the GetContentsWithState operation.
 * <p>
 * Get content in space with given content state
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetContentsWithStateOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the space to be queried for its content state settings.
     */
    @NotNull 
    private String spaceKey;

    /**
     * The id of the content state to filter content by
     */
    @NotNull 
    private Integer stateId;

    /**
     * A multi-value parameter indicating which properties of the content to expand. Options include: space, version, history, children, etc.
     * Ex: space,version
     */
    @Nullable 
    private List<String> expand;

    /**
     * Maximum number of results to return
     */
    @Nullable 
    private Integer limit;

    /**
     * Number of result to start returning. (0 indexed)
     */
    @Nullable 
    private Integer start;

    /**
     * Constructs a validated instance of {@link GetContentsWithStateOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetContentsWithStateOperationSpec(Consumer<GetContentsWithStateOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetContentsWithStateOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceKey             The key of the space to be queried for its content state settings.
     * @param stateId              The id of the content state to filter content by
     * @param expand               A multi-value parameter indicating which properties of the content to expand. Options include: space, version, history, children, etc.  Ex: space,version
     * @param limit                Maximum number of results to return
     * @param start                Number of result to start returning. (0 indexed)
     */
    @ApiStatus.Internal
    public GetContentsWithStateOperationSpec(String spaceKey, Integer stateId, List<String> expand, Integer limit, Integer start) {
        this.spaceKey = spaceKey;
        this.stateId = stateId;
        this.expand = expand;
        this.limit = limit;
        this.start = start;

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
        Objects.requireNonNull(stateId, "stateId is a required parameter!");
    }
}
