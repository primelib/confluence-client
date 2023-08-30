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
 * CheckAccessByEmailRequest
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
    "emails"
})
@JsonTypeName("checkAccessByEmail_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CheckAccessByEmailRequest {

    /**
     * List of emails to check access to site.
     */
    @JsonProperty("emails")
    protected List<String> emails;

    /**
     * Constructs a validated instance of {@link CheckAccessByEmailRequest}.
     *
     * @param spec the specification to process
     */
    public CheckAccessByEmailRequest(Consumer<CheckAccessByEmailRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CheckAccessByEmailRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CheckAccessByEmailRequest(Consumer)} instead.
     * @param emails List of emails to check access to site.
     */
    @ApiStatus.Internal
    public CheckAccessByEmailRequest(List<String> emails) {
        this.emails = emails;
    }

}
