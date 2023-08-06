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
 * UserAnonymous
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
    "type",
    "profilePicture",
    "displayName",
    "operations",
    "isExternalCollaborator",
    "_expandable",
    "_links"
})
@JsonTypeName("UserAnonymous")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserAnonymous {

    @JsonProperty("type")
    protected String type;

    @JsonProperty("profilePicture")
    protected Icon profilePicture;

    @JsonProperty("displayName")
    protected String displayName;

    @JsonProperty("operations")
    protected List<OperationCheckResult> operations;

    /**
     * Whether the user is an external collaborator user
     */
    @JsonProperty("isExternalCollaborator")
    protected Boolean isExternalCollaborator;

    @JsonProperty("_expandable")
    protected UserAnonymousExpandable _expandable;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link UserAnonymous}.
     *
     * @param spec the specification to process
     */
    public UserAnonymous(Consumer<UserAnonymous> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserAnonymous}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserAnonymous(Consumer)} instead.
     * @param type type
     * @param profilePicture profilePicture
     * @param displayName displayName
     * @param operations operations
     * @param isExternalCollaborator Whether the user is an external collaborator user
     * @param _expandable _expandable
     * @param _links _links
     */
    @ApiStatus.Internal
    public UserAnonymous(String type, Icon profilePicture, String displayName, List<OperationCheckResult> operations, Boolean isExternalCollaborator, UserAnonymousExpandable _expandable, Map<String, String> _links) {
        this.type = type;
        this.profilePicture = profilePicture;
        this.displayName = displayName;
        this.operations = operations;
        this.isExternalCollaborator = isExternalCollaborator;
        this._expandable = _expandable;
        this._links = _links;
    }

}
