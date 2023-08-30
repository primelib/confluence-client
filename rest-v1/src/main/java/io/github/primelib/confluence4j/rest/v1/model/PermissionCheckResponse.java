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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PermissionCheckResponse
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
    "hasPermission",
    "errors",
    "_links"
})
@JsonTypeName("PermissionCheckResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PermissionCheckResponse {

    @JsonProperty("hasPermission")
    protected Boolean hasPermission;

    @JsonProperty("errors")
    protected List<Message> errors;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link PermissionCheckResponse}.
     *
     * @param spec the specification to process
     */
    public PermissionCheckResponse(Consumer<PermissionCheckResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PermissionCheckResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PermissionCheckResponse(Consumer)} instead.
     * @param hasPermission hasPermission
     * @param errors errors
     * @param _links _links
     */
    @ApiStatus.Internal
    public PermissionCheckResponse(Boolean hasPermission, List<Message> errors, Map<String, String> _links) {
        this.hasPermission = hasPermission;
        this.errors = errors;
        this._links = _links;
    }

}
