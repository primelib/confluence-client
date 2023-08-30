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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SpacePermissionRequest
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
    "operation",
    "_links"
})
@JsonTypeName("SpacePermissionRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePermissionRequest {

    @JsonProperty("subject")
    protected PermissionSubject subject;

    @JsonProperty("operation")
    protected SpacePermissionV2Operation operation;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link SpacePermissionRequest}.
     *
     * @param spec the specification to process
     */
    public SpacePermissionRequest(Consumer<SpacePermissionRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePermissionRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePermissionRequest(Consumer)} instead.
     * @param subject subject
     * @param operation operation
     * @param _links _links
     */
    @ApiStatus.Internal
    public SpacePermissionRequest(PermissionSubject subject, SpacePermissionV2Operation operation, Map<String, String> _links) {
        this.subject = subject;
        this.operation = operation;
        this._links = _links;
    }

}
