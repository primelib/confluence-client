package io.github.primelib.confluence4j.rest.v1.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SpacePermissionCreate
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "subjects",
    "operation",
    "anonymousAccess",
    "unlicensedAccess"
})
@JsonTypeName("SpacePermissionCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePermissionCreate {

    @JsonProperty("subjects")
    protected SpacePermissionCreateSubjects subjects;

    @JsonProperty("operation")
    protected OperationCheckResult operation;

    /**
     * Grant anonymous users permission to use the operation.
     */
    @JsonProperty("anonymousAccess")
    protected Boolean anonymousAccess;

    /**
     * Grants access to unlicensed users from JIRA Service Desk when used with the 'read space' operation.
     */
    @JsonProperty("unlicensedAccess")
    protected Boolean unlicensedAccess;

    /**
     * Constructs a validated instance of {@link SpacePermissionCreate}.
     *
     * @param spec the specification to process
     */
    public SpacePermissionCreate(Consumer<SpacePermissionCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePermissionCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePermissionCreate(Consumer)} instead.
     * @param subjects subjects
     * @param operation operation
     * @param anonymousAccess Grant anonymous users permission to use the operation.
     * @param unlicensedAccess Grants access to unlicensed users from JIRA Service Desk when used with the 'read space' operation.
     */
    @ApiStatus.Internal
    public SpacePermissionCreate(SpacePermissionCreateSubjects subjects, OperationCheckResult operation, Boolean anonymousAccess, Boolean unlicensedAccess) {
        this.subjects = subjects;
        this.operation = operation;
        this.anonymousAccess = anonymousAccess;
        this.unlicensedAccess = unlicensedAccess;
    }

}
