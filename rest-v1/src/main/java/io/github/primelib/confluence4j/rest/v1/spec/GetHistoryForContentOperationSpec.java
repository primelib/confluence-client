package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.Version;
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
 * GetHistoryForContentSpec
 * <p>
 * Specification for the GetHistoryForContent operation.
 * <p>
 * Get content history
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetHistoryForContentOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content to be queried for its history.
     */
    @NotNull 
    private String id;

    /**
     * A multi-value parameter indicating which properties of the content history to expand. Maximum sub-expansions allowed is {@code 8}.
     * - {@code lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code previousVersion} returns information about the update prior to the current content update. For this method, it contains the same information as {@code lastUpdated}. - {@code contributors} returns all of the users who have contributed to the content. - {@code nextVersion} This parameter is not used for this method.
     */
    @Nullable 
    private List<String> expand;

    /**
     * Constructs a validated instance of {@link GetHistoryForContentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetHistoryForContentOperationSpec(Consumer<GetHistoryForContentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetHistoryForContentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content to be queried for its history.
     * @param expand               A multi-value parameter indicating which properties of the content history to expand. Maximum sub-expansions allowed is {@code 8}.  - {@code lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code previousVersion} returns information about the update prior to the current content update. For this method, it contains the same information as {@code lastUpdated}. - {@code contributors} returns all of the users who have contributed to the content. - {@code nextVersion} This parameter is not used for this method.
     */
    @ApiStatus.Internal
    public GetHistoryForContentOperationSpec(String id, List<String> expand) {
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
