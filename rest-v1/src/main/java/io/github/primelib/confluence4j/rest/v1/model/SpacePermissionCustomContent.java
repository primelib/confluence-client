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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SpacePermissionCustomContent
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
    "subject",
    "operations"
})
@JsonTypeName("SpacePermissionCustomContent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePermissionCustomContent {

    @JsonProperty("subject")
    protected PermissionSubject subject;

    @JsonProperty("operations")
    protected List<SpacePermissionCustomContentOperationsInner> operations;

    /**
     * Constructs a validated instance of {@link SpacePermissionCustomContent}.
     *
     * @param spec the specification to process
     */
    public SpacePermissionCustomContent(Consumer<SpacePermissionCustomContent> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePermissionCustomContent}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePermissionCustomContent(Consumer)} instead.
     * @param subject subject
     * @param operations operations
     */
    @ApiStatus.Internal
    public SpacePermissionCustomContent(PermissionSubject subject, List<SpacePermissionCustomContentOperationsInner> operations) {
        this.subject = subject;
        this.operations = operations;
    }

}
