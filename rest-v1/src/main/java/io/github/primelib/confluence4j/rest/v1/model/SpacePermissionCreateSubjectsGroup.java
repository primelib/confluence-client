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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SpacePermissionCreateSubjectsGroup
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
    "results",
    "size"
})
@JsonTypeName("SpacePermissionCreate_subjects_group")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePermissionCreateSubjectsGroup {

    @JsonProperty("results")
    protected List<GroupCreate> results;

    @JsonProperty("size")
    protected Integer size;

    /**
     * Constructs a validated instance of {@link SpacePermissionCreateSubjectsGroup}.
     *
     * @param spec the specification to process
     */
    public SpacePermissionCreateSubjectsGroup(Consumer<SpacePermissionCreateSubjectsGroup> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePermissionCreateSubjectsGroup}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePermissionCreateSubjectsGroup(Consumer)} instead.
     * @param results results
     * @param size size
     */
    @ApiStatus.Internal
    public SpacePermissionCreateSubjectsGroup(List<GroupCreate> results, Integer size) {
        this.results = results;
        this.size = size;
    }

}
