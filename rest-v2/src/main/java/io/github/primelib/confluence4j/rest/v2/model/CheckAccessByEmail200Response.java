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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CheckAccessByEmail200Response
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
    "emailsWithoutAccess",
    "invalidEmails"
})
@JsonTypeName("checkAccessByEmail_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CheckAccessByEmail200Response {

    /**
     * List of emails that do not have access to site.
     */
    @JsonProperty("emailsWithoutAccess")
    protected List<String> emailsWithoutAccess;

    /**
     * List of invalid emails provided in the request.
     */
    @JsonProperty("invalidEmails")
    protected List<String> invalidEmails;

    /**
     * Constructs a validated instance of {@link CheckAccessByEmail200Response}.
     *
     * @param spec the specification to process
     */
    public CheckAccessByEmail200Response(Consumer<CheckAccessByEmail200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CheckAccessByEmail200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CheckAccessByEmail200Response(Consumer)} instead.
     * @param emailsWithoutAccess List of emails that do not have access to site.
     * @param invalidEmails List of invalid emails provided in the request.
     */
    @ApiStatus.Internal
    public CheckAccessByEmail200Response(List<String> emailsWithoutAccess, List<String> invalidEmails) {
        this.emailsWithoutAccess = emailsWithoutAccess;
        this.invalidEmails = invalidEmails;
    }

}
