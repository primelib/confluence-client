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
 * SpaceCreate
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
    "key",
    "name",
    "description",
    "permissions"
})
@JsonTypeName("SpaceCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpaceCreate {

    /**
     * The key for the new space. Format: See [Space keys](https://confluence.atlassian.com/x/lqNMMQ).
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The name of the new space.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected SpaceDescriptionCreate description;

    /**
     * The permissions for the new space. If no permissions are provided, the [Confluence default space permissions](https://confluence.atlassian.com/x/UAgzKw#CreateaSpace-Spacepermissions) are applied. Note that if permissions are provided, the space is created with only the provided set of permissions, not including the default space permissions. Space permissions can be modified after creation using the space permissions endpoints, and a private space can be created using the create private space endpoint.
     */
    @JsonProperty("permissions")
    protected List<SpacePermissionCreate> permissions;

    /**
     * Constructs a validated instance of {@link SpaceCreate}.
     *
     * @param spec the specification to process
     */
    public SpaceCreate(Consumer<SpaceCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpaceCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpaceCreate(Consumer)} instead.
     * @param key The key for the new space. Format: See [Space keys](https://confluence.atlassian.com/x/lqNMMQ).
     * @param name The name of the new space.
     * @param description description
     * @param permissions The permissions for the new space. If no permissions are provided, the [Confluence default space permissions](https://confluence.atlassian.com/x/UAgzKw#CreateaSpace-Spacepermissions) are applied. Note that if permissions are provided, the space is created with only the provided set of permissions, not including the default space permissions. Space permissions can be modified after creation using the space permissions endpoints, and a private space can be created using the create private space endpoint.
     */
    @ApiStatus.Internal
    public SpaceCreate(String key, String name, SpaceDescriptionCreate description, List<SpacePermissionCreate> permissions) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.permissions = permissions;
    }

}
