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
 * AccountId
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
    "accountId"
})
@JsonTypeName("AccountId")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AccountId {

    @JsonProperty("accountId")
    protected String accountId;

    /**
     * Constructs a validated instance of {@link AccountId}.
     *
     * @param spec the specification to process
     */
    public AccountId(Consumer<AccountId> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AccountId}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AccountId(Consumer)} instead.
     * @param accountId accountId
     */
    @ApiStatus.Internal
    public AccountId(String accountId) {
        this.accountId = accountId;
    }

}
