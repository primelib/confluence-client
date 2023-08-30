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
 * AccountIdEmailRecord
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
    "accountId",
    "email"
})
@JsonTypeName("AccountIdEmailRecord")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AccountIdEmailRecord {

    @JsonProperty("accountId")
    protected String accountId;

    @JsonProperty("email")
    protected String email;

    /**
     * Constructs a validated instance of {@link AccountIdEmailRecord}.
     *
     * @param spec the specification to process
     */
    public AccountIdEmailRecord(Consumer<AccountIdEmailRecord> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AccountIdEmailRecord}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AccountIdEmailRecord(Consumer)} instead.
     * @param accountId accountId
     * @param email email
     */
    @ApiStatus.Internal
    public AccountIdEmailRecord(String accountId, String email) {
        this.accountId = accountId;
        this.email = email;
    }

}
