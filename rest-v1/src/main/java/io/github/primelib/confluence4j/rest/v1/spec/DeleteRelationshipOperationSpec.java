package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Relation;
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
 * DeleteRelationshipSpec
 * <p>
 * Specification for the DeleteRelationship operation.
 * <p>
 * Delete relationship
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteRelationshipOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The name of the relationship.
     */
    @NotNull 
    private String relationName;

    /**
     * The source entity type of the relationship. This must be 'user', if the {@code relationName} is 'favourite'.
     */
    @NotNull 
    private String sourceType;

    /**
     * - The identifier for the source entity:
     * - If {@code sourceType} is 'user', then specify either 'current' (logged-in
     *  user) or the user key. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key.
     */
    @NotNull 
    private String sourceKey;

    /**
     * The target entity type of the relationship. This must be 'space' or 'content', if the {@code relationName} is 'favourite'.
     */
    @NotNull 
    private String targetType;

    /**
     * - The identifier for the target entity:
     * - If {@code sourceType} is 'user', then specify either 'current' (logged-in
     *  user) or the user key. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key.
     */
    @NotNull 
    private String targetKey;

    /**
     * The status of the source. This parameter is only used when the {@code sourceType} is 'content'.
     */
    @Nullable 
    private String sourceStatus;

    /**
     * The status of the target. This parameter is only used when the {@code targetType} is 'content'.
     */
    @Nullable 
    private String targetStatus;

    /**
     * The version of the source. This parameter is only used when the {@code sourceType} is 'content' and the {@code sourceStatus} is 'historical'.
     */
    @Nullable 
    private Integer sourceVersion;

    /**
     * The version of the target. This parameter is only used when the {@code targetType} is 'content' and the {@code targetStatus} is 'historical'.
     */
    @Nullable 
    private Integer targetVersion;

    /**
     * Constructs a validated instance of {@link DeleteRelationshipOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteRelationshipOperationSpec(Consumer<DeleteRelationshipOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteRelationshipOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param relationName         The name of the relationship.
     * @param sourceType           The source entity type of the relationship. This must be 'user', if the {@code relationName} is 'favourite'.
     * @param sourceKey            - The identifier for the source entity:  - If {@code sourceType} is 'user', then specify either 'current' (logged-in   user) or the user key. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key.
     * @param targetType           The target entity type of the relationship. This must be 'space' or 'content', if the {@code relationName} is 'favourite'.
     * @param targetKey            - The identifier for the target entity:  - If {@code sourceType} is 'user', then specify either 'current' (logged-in   user) or the user key. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key.
     * @param sourceStatus         The status of the source. This parameter is only used when the {@code sourceType} is 'content'.
     * @param targetStatus         The status of the target. This parameter is only used when the {@code targetType} is 'content'.
     * @param sourceVersion        The version of the source. This parameter is only used when the {@code sourceType} is 'content' and the {@code sourceStatus} is 'historical'.
     * @param targetVersion        The version of the target. This parameter is only used when the {@code targetType} is 'content' and the {@code targetStatus} is 'historical'.
     */
    @ApiStatus.Internal
    public DeleteRelationshipOperationSpec(String relationName, String sourceType, String sourceKey, String targetType, String targetKey, String sourceStatus, String targetStatus, Integer sourceVersion, Integer targetVersion) {
        this.relationName = relationName;
        this.sourceType = sourceType;
        this.sourceKey = sourceKey;
        this.targetType = targetType;
        this.targetKey = targetKey;
        this.sourceStatus = sourceStatus;
        this.targetStatus = targetStatus;
        this.sourceVersion = sourceVersion;
        this.targetVersion = targetVersion;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(relationName, "relationName is a required parameter!");
        Objects.requireNonNull(sourceType, "sourceType is a required parameter!");
        Objects.requireNonNull(sourceKey, "sourceKey is a required parameter!");
        Objects.requireNonNull(targetType, "targetType is a required parameter!");
        Objects.requireNonNull(targetKey, "targetKey is a required parameter!");
    }
}
