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
 * SpacePermissionSubjects
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
    "user",
    "group",
    "_expandable"
})
@JsonTypeName("SpacePermission_subjects")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePermissionSubjects {

    @JsonProperty("user")
    protected SpacePermissionSubjectsUser user;

    @JsonProperty("group")
    protected SpacePermissionSubjectsGroup group;

    @JsonProperty("_expandable")
    protected ContentRestrictionRestrictionsExpandable _expandable;

    /**
     * Constructs a validated instance of {@link SpacePermissionSubjects}.
     *
     * @param spec the specification to process
     */
    public SpacePermissionSubjects(Consumer<SpacePermissionSubjects> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePermissionSubjects}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePermissionSubjects(Consumer)} instead.
     * @param user user
     * @param group group
     * @param _expandable _expandable
     */
    @ApiStatus.Internal
    public SpacePermissionSubjects(SpacePermissionSubjectsUser user, SpacePermissionSubjectsGroup group, ContentRestrictionRestrictionsExpandable _expandable) {
        this.user = user;
        this.group = group;
        this._expandable = _expandable;
    }

}
