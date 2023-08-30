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
 * UserDetailsBusiness
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
    "position",
    "department",
    "location"
})
@JsonTypeName("UserDetails_business")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserDetailsBusiness {

    /**
     * This property has been deprecated due to privacy changes. There is no replacement. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("position")
    protected String position;

    /**
     * This property has been deprecated due to privacy changes. There is no replacement. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("department")
    protected String department;

    /**
     * This property has been deprecated due to privacy changes. There is no replacement. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("location")
    protected String location;

    /**
     * Constructs a validated instance of {@link UserDetailsBusiness}.
     *
     * @param spec the specification to process
     */
    public UserDetailsBusiness(Consumer<UserDetailsBusiness> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserDetailsBusiness}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserDetailsBusiness(Consumer)} instead.
     * @param position This property has been deprecated due to privacy changes. There is no replacement. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param department This property has been deprecated due to privacy changes. There is no replacement. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param location This property has been deprecated due to privacy changes. There is no replacement. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @ApiStatus.Internal
    public UserDetailsBusiness(String position, String department, String location) {
        this.position = position;
        this.department = department;
        this.location = location;
    }

}
