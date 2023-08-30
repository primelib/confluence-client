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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AddContentRestrictionRestrictionsUserInner
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
    "type",
    "username",
    "userKey",
    "accountId"
})
@JsonTypeName("AddContentRestriction_restrictions_user_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddContentRestrictionRestrictionsUserInner {

    /**
     * Set to 'known'.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * This property is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("username")
    protected String username;

    /**
     * This property is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("userKey")
    protected String userKey;

    /**
     * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * Constructs a validated instance of {@link AddContentRestrictionRestrictionsUserInner}.
     *
     * @param spec the specification to process
     */
    public AddContentRestrictionRestrictionsUserInner(Consumer<AddContentRestrictionRestrictionsUserInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AddContentRestrictionRestrictionsUserInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AddContentRestrictionRestrictionsUserInner(Consumer)} instead.
     * @param type Set to 'known'.
     * @param username This property is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param userKey This property is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.
     */
    @ApiStatus.Internal
    public AddContentRestrictionRestrictionsUserInner(TypeEnum type, String username, String userKey, String accountId) {
        this.type = type;
        this.username = username;
        this.userKey = userKey;
        this.accountId = accountId;
    }

    /**
     * Set to 'known'.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        KNOWN("known"),
        UNKNOWN("unknown"),
        ANONYMOUS("anonymous"),
        USER("user");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
