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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UsersUserKeys
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
    "users",
    "userKeys",
    "_links"
})
@JsonTypeName("UsersUserKeys")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UsersUserKeys {

    @JsonProperty("users")
    protected List<User> users;

    @JsonProperty("userKeys")
    protected List<String> userKeys;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link UsersUserKeys}.
     *
     * @param spec the specification to process
     */
    public UsersUserKeys(Consumer<UsersUserKeys> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UsersUserKeys}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UsersUserKeys(Consumer)} instead.
     * @param users users
     * @param userKeys userKeys
     * @param _links _links
     */
    @ApiStatus.Internal
    public UsersUserKeys(List<User> users, List<String> userKeys, Map<String, String> _links) {
        this.users = users;
        this.userKeys = userKeys;
        this._links = _links;
    }

}
