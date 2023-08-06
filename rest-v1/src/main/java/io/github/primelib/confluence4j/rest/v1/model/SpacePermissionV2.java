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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SpacePermissionV2
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
    "id",
    "subject",
    "operation",
    "_links"
})
@JsonTypeName("SpacePermissionV2")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePermissionV2 {

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("subject")
    protected PermissionSubject subject;

    @JsonProperty("operation")
    protected SpacePermissionV2Operation operation;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link SpacePermissionV2}.
     *
     * @param spec the specification to process
     */
    public SpacePermissionV2(Consumer<SpacePermissionV2> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePermissionV2}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePermissionV2(Consumer)} instead.
     * @param id id
     * @param subject subject
     * @param operation operation
     * @param _links _links
     */
    @ApiStatus.Internal
    public SpacePermissionV2(Long id, PermissionSubject subject, SpacePermissionV2Operation operation, Map<String, String> _links) {
        this.id = id;
        this.subject = subject;
        this.operation = operation;
        this._links = _links;
    }

}
