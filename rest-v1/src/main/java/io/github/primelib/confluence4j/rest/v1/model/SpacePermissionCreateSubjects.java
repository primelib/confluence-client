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
 * SpacePermissionCreateSubjects
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
    "group"
})
@JsonTypeName("SpacePermissionCreate_subjects")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePermissionCreateSubjects {

    @JsonProperty("user")
    protected SpacePermissionCreateSubjectsUser user;

    @JsonProperty("group")
    protected SpacePermissionCreateSubjectsGroup group;

    /**
     * Constructs a validated instance of {@link SpacePermissionCreateSubjects}.
     *
     * @param spec the specification to process
     */
    public SpacePermissionCreateSubjects(Consumer<SpacePermissionCreateSubjects> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePermissionCreateSubjects}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePermissionCreateSubjects(Consumer)} instead.
     * @param user user
     * @param group group
     */
    @ApiStatus.Internal
    public SpacePermissionCreateSubjects(SpacePermissionCreateSubjectsUser user, SpacePermissionCreateSubjectsGroup group) {
        this.user = user;
        this.group = group;
    }

}
