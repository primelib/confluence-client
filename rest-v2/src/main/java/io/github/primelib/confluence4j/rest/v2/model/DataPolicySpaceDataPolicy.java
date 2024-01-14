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
 * DataPolicySpaceDataPolicy
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
    "anyContentBlocked"
})
@JsonTypeName("DataPolicySpace_dataPolicy")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DataPolicySpaceDataPolicy {

    /**
     * Whether the space contains any content blocked for (inaccessible to) the requesting client application.
     */
    @JsonProperty("anyContentBlocked")
    protected Boolean anyContentBlocked;

    /**
     * Constructs a validated instance of {@link DataPolicySpaceDataPolicy}.
     *
     * @param spec the specification to process
     */
    public DataPolicySpaceDataPolicy(Consumer<DataPolicySpaceDataPolicy> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DataPolicySpaceDataPolicy}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DataPolicySpaceDataPolicy(Consumer)} instead.
     * @param anyContentBlocked Whether the space contains any content blocked for (inaccessible to) the requesting client application.
     */
    @ApiStatus.Internal
    public DataPolicySpaceDataPolicy(Boolean anyContentBlocked) {
        this.anyContentBlocked = anyContentBlocked;
    }

}
