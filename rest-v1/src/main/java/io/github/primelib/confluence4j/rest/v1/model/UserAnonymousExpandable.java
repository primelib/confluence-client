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
 * UserAnonymousExpandable
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
    "operations"
})
@JsonTypeName("UserAnonymous__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserAnonymousExpandable {

    @JsonProperty("operations")
    protected String operations;

    /**
     * Constructs a validated instance of {@link UserAnonymousExpandable}.
     *
     * @param spec the specification to process
     */
    public UserAnonymousExpandable(Consumer<UserAnonymousExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserAnonymousExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserAnonymousExpandable(Consumer)} instead.
     * @param operations operations
     */
    @ApiStatus.Internal
    public UserAnonymousExpandable(String operations) {
        this.operations = operations;
    }

}
