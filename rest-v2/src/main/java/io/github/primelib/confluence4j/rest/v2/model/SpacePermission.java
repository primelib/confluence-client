package io.github.primelib.confluence4j.rest.v2.model;

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
 * SpacePermission
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
    "principal",
    "operation"
})
@JsonTypeName("SpacePermission")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePermission {

    /**
     * ID of the space permission.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("principal")
    protected SpacePermissionPrincipal principal;

    @JsonProperty("operation")
    protected SpacePermissionOperation operation;

    /**
     * Constructs a validated instance of {@link SpacePermission}.
     *
     * @param spec the specification to process
     */
    public SpacePermission(Consumer<SpacePermission> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePermission}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePermission(Consumer)} instead.
     * @param id ID of the space permission.
     * @param principal principal
     * @param operation operation
     */
    @ApiStatus.Internal
    public SpacePermission(String id, SpacePermissionPrincipal principal, SpacePermissionOperation operation) {
        this.id = id;
        this.principal = principal;
        this.operation = operation;
    }

}
