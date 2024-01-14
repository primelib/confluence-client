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
 * DataPolicySpace
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
    "key",
    "name",
    "description",
    "dataPolicy",
    "icon",
    "_links"
})
@JsonTypeName("DataPolicySpace")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DataPolicySpace {

    /**
     * ID of the space.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Key of the space.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * Name of the space.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected SpaceDescription description;

    @JsonProperty("dataPolicy")
    protected DataPolicySpaceDataPolicy dataPolicy;

    @JsonProperty("icon")
    protected SpaceIcon icon;

    @JsonProperty("_links")
    protected SpaceLinks _links;

    /**
     * Constructs a validated instance of {@link DataPolicySpace}.
     *
     * @param spec the specification to process
     */
    public DataPolicySpace(Consumer<DataPolicySpace> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DataPolicySpace}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DataPolicySpace(Consumer)} instead.
     * @param id ID of the space.
     * @param key Key of the space.
     * @param name Name of the space.
     * @param description description
     * @param dataPolicy dataPolicy
     * @param icon icon
     * @param _links _links
     */
    @ApiStatus.Internal
    public DataPolicySpace(String id, String key, String name, SpaceDescription description, DataPolicySpaceDataPolicy dataPolicy, SpaceIcon icon, SpaceLinks _links) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.description = description;
        this.dataPolicy = dataPolicy;
        this.icon = icon;
        this._links = _links;
    }

}
