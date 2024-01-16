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

import java.time.OffsetDateTime;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Version
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
    "by",
    "when",
    "friendlyWhen",
    "message",
    "number",
    "minorEdit",
    "content",
    "collaborators",
    "_expandable",
    "_links",
    "contentTypeModified",
    "confRev",
    "syncRev",
    "syncRevSource"
})
@JsonTypeName("Version")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Version {

    @JsonProperty("by")
    protected User by;

    @JsonProperty("when")
    protected OffsetDateTime when;

    @JsonProperty("friendlyWhen")
    protected String friendlyWhen;

    @JsonProperty("message")
    protected String message;

    /**
     * Set this to the current version number incremented by one
     */
    @JsonProperty("number")
    protected Integer number;

    /**
     * If {@code minorEdit} is set to 'true', no notification email or activity stream will be generated for the change.
     */
    @JsonProperty("minorEdit")
    protected Boolean minorEdit;

    @JsonProperty("content")
    protected Content content;

    @JsonProperty("collaborators")
    protected UsersUserKeys collaborators;

    @JsonProperty("_expandable")
    protected VersionExpandable _expandable;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * True if content type is modifed in this version (e.g. page to blog)
     */
    @JsonProperty("contentTypeModified")
    protected Boolean contentTypeModified;

    /**
     * The revision id provided by confluence to be used as a revision in Synchrony
     */
    @JsonProperty("confRev")
    protected String confRev;

    /**
     * The revision id provided by Synchrony
     */
    @JsonProperty("syncRev")
    protected String syncRev;

    /**
     * Source of the synchrony revision
     */
    @JsonProperty("syncRevSource")
    protected String syncRevSource;

    /**
     * Constructs a validated instance of {@link Version}.
     *
     * @param spec the specification to process
     */
    public Version(Consumer<Version> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Version}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Version(Consumer)} instead.
     * @param by by
     * @param when when
     * @param friendlyWhen friendlyWhen
     * @param message message
     * @param number Set this to the current version number incremented by one
     * @param minorEdit If {@code minorEdit} is set to 'true', no notification email or activity stream will be generated for the change.
     * @param content content
     * @param collaborators collaborators
     * @param _expandable _expandable
     * @param _links _links
     * @param contentTypeModified True if content type is modifed in this version (e.g. page to blog)
     * @param confRev The revision id provided by confluence to be used as a revision in Synchrony
     * @param syncRev The revision id provided by Synchrony
     * @param syncRevSource Source of the synchrony revision
     */
    @ApiStatus.Internal
    public Version(User by, OffsetDateTime when, String friendlyWhen, String message, Integer number, Boolean minorEdit, Content content, UsersUserKeys collaborators, VersionExpandable _expandable, Map<String, String> _links, Boolean contentTypeModified, String confRev, String syncRev, String syncRevSource) {
        this.by = by;
        this.when = when;
        this.friendlyWhen = friendlyWhen;
        this.message = message;
        this.number = number;
        this.minorEdit = minorEdit;
        this.content = content;
        this.collaborators = collaborators;
        this._expandable = _expandable;
        this._links = _links;
        this.contentTypeModified = contentTypeModified;
        this.confRev = confRev;
        this.syncRev = syncRev;
        this.syncRevSource = syncRevSource;
    }

}
