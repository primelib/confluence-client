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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Space
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
    "type",
    "status",
    "createdAt",
    "homepageId",
    "description",
    "icon"
})
@JsonTypeName("Space")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Space {

    /**
     * ID of the space.
     * Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @JsonProperty("id")
    protected Long id;

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

    @JsonProperty("type")
    protected SpaceType type;

    @JsonProperty("status")
    protected SpaceStatus status;

    /**
     * Date and time when the space was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     */
    @JsonProperty("createdAt")
    protected OffsetDateTime createdAt;

    /**
     * ID of the space's homepage.
     * Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @JsonProperty("homepageId")
    protected Long homepageId;

    @JsonProperty("description")
    protected SpaceDescription description;

    @JsonProperty("icon")
    protected SpaceIcon icon;

    /**
     * Constructs a validated instance of {@link Space}.
     *
     * @param spec the specification to process
     */
    public Space(Consumer<Space> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Space}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Space(Consumer)} instead.
     * @param id ID of the space.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param key Key of the space.
     * @param name Name of the space.
     * @param type type
     * @param status status
     * @param createdAt Date and time when the space was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     * @param homepageId ID of the space's homepage.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param description description
     * @param icon icon
     */
    @ApiStatus.Internal
    public Space(Long id, String key, String name, SpaceType type, SpaceStatus status, OffsetDateTime createdAt, Long homepageId, SpaceDescription description, SpaceIcon icon) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.type = type;
        this.status = status;
        this.createdAt = createdAt;
        this.homepageId = homepageId;
        this.description = description;
        this.icon = icon;
    }

}
