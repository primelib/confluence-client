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
 * UserDetailsPersonal
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
    "phone",
    "im",
    "website",
    "email"
})
@JsonTypeName("UserDetails_personal")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserDetailsPersonal {

    /**
     * This property has been deprecated due to privacy changes. There is no replacement. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("phone")
    protected String phone;

    /**
     * This property has been deprecated due to privacy changes. There is no replacement. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("im")
    protected String im;

    /**
     * This property has been deprecated due to privacy changes. There is no replacement. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("website")
    protected String website;

    /**
     * This property has been deprecated due to privacy changes. Use the {@code User.email} property instead. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("email")
    protected String email;

    /**
     * Constructs a validated instance of {@link UserDetailsPersonal}.
     *
     * @param spec the specification to process
     */
    public UserDetailsPersonal(Consumer<UserDetailsPersonal> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserDetailsPersonal}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserDetailsPersonal(Consumer)} instead.
     * @param phone This property has been deprecated due to privacy changes. There is no replacement. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param im This property has been deprecated due to privacy changes. There is no replacement. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param website This property has been deprecated due to privacy changes. There is no replacement. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param email This property has been deprecated due to privacy changes. Use the {@code User.email} property instead. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @ApiStatus.Internal
    public UserDetailsPersonal(String phone, String im, String website, String email) {
        this.phone = phone;
        this.im = im;
        this.website = website;
        this.email = email;
    }

}
