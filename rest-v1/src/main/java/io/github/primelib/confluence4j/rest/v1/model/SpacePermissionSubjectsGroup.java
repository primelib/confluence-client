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
 * SpacePermissionSubjectsGroup
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
    "size",
    "start",
    "limit"
})
@JsonTypeName("SpacePermission_subjects_group")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePermissionSubjectsGroup {

    @JsonProperty("results")
    protected List<Group> results;

    @JsonProperty("size")
    protected Integer size;

    @JsonProperty("start")
    protected Integer start;

    @JsonProperty("limit")
    protected Integer limit;

    /**
     * Constructs a validated instance of {@link SpacePermissionSubjectsGroup}.
     *
     * @param spec the specification to process
     */
    public SpacePermissionSubjectsGroup(Consumer<SpacePermissionSubjectsGroup> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePermissionSubjectsGroup}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePermissionSubjectsGroup(Consumer)} instead.
     * @param results results
     * @param size size
     * @param start start
     * @param limit limit
     */
    @ApiStatus.Internal
    public SpacePermissionSubjectsGroup(List<Group> results, Integer size, Integer start, Integer limit) {
        this.results = results;
        this.size = size;
        this.start = start;
        this.limit = limit;
    }

}
