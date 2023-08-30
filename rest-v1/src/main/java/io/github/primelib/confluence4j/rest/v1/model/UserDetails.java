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
 * UserDetails
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
    "business",
    "personal"
})
@JsonTypeName("UserDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserDetails {

    @JsonProperty("business")
    protected UserDetailsBusiness business;

    @JsonProperty("personal")
    protected UserDetailsPersonal personal;

    /**
     * Constructs a validated instance of {@link UserDetails}.
     *
     * @param spec the specification to process
     */
    public UserDetails(Consumer<UserDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserDetails(Consumer)} instead.
     * @param business business
     * @param personal personal
     */
    @ApiStatus.Internal
    public UserDetails(UserDetailsBusiness business, UserDetailsPersonal personal) {
        this.business = business;
        this.personal = personal;
    }

}
