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

import java.time.OffsetDateTime;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserProperty
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
    "value",
    "id",
    "lastModifiedDate",
    "createdDate",
    "_links"
})
@JsonTypeName("UserProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserProperty {

    @JsonProperty("key")
    protected String key;

    /**
     * The value of the content property.
     */
    @JsonProperty("value")
    protected Map<String, Object> value;

    /**
     * a unique identifier for the user property
     */
    @JsonProperty("id")
    protected String id;

    /**
     * datetime when the property was last modified such as {@code 2022-02-01T12:00:00.111Z}
     */
    @JsonProperty("lastModifiedDate")
    protected OffsetDateTime lastModifiedDate;

    /**
     * datetime when the property was created such as {@code 2022-01-01T12:00:00.111Z}
     */
    @JsonProperty("createdDate")
    protected OffsetDateTime createdDate;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link UserProperty}.
     *
     * @param spec the specification to process
     */
    public UserProperty(Consumer<UserProperty> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserProperty(Consumer)} instead.
     * @param key key
     * @param value The value of the content property.
     * @param id a unique identifier for the user property
     * @param lastModifiedDate datetime when the property was last modified such as {@code 2022-02-01T12:00:00.111Z}
     * @param createdDate datetime when the property was created such as {@code 2022-01-01T12:00:00.111Z}
     * @param _links _links
     */
    @ApiStatus.Internal
    public UserProperty(String key, Map<String, Object> value, String id, OffsetDateTime lastModifiedDate, OffsetDateTime createdDate, Map<String, String> _links) {
        this.key = key;
        this.value = value;
        this.id = id;
        this.lastModifiedDate = lastModifiedDate;
        this.createdDate = createdDate;
        this._links = _links;
    }

}
