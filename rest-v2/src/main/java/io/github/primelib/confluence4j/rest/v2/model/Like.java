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
 * Like
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
@JsonTypeName("Like")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Like {

    /**
     * Account ID.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * Constructs a validated instance of {@link Like}.
     *
     * @param spec the specification to process
     */
    public Like(Consumer<Like> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Like}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Like(Consumer)} instead.
     * @param accountId Account ID.
     */
    @ApiStatus.Internal
    public Like(String accountId) {
        this.accountId = accountId;
    }

}
