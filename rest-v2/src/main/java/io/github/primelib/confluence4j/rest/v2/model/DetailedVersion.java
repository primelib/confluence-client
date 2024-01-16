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

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DetailedVersion
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
    "number",
    "authorId",
    "message",
    "createdAt",
    "minorEdit",
    "contentTypeModified",
    "collaborators",
    "prevVersion",
    "nextVersion"
})
@JsonTypeName("DetailedVersion")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DetailedVersion {

    /**
     * The current version number.
     */
    @JsonProperty("number")
    protected Integer number;

    /**
     * The account ID of the user who created this version.
     */
    @JsonProperty("authorId")
    protected String authorId;

    /**
     * Message associated with the current version.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * Date and time when the version was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     */
    @JsonProperty("createdAt")
    protected OffsetDateTime createdAt;

    /**
     * Describes if this version is a minor version. Email notifications and activity stream updates are not created for minor versions.
     */
    @JsonProperty("minorEdit")
    protected Boolean minorEdit;

    /**
     * Describes if the content type is modified in this version (e.g. page to blog)
     */
    @JsonProperty("contentTypeModified")
    protected Boolean contentTypeModified;

    /**
     * The account IDs of users that collaborated on this version.
     */
    @JsonProperty("collaborators")
    protected List<String> collaborators;

    /**
     * The version number of the version prior to this current content update.
     */
    @JsonProperty("prevVersion")
    protected Integer prevVersion;

    /**
     * The version number of the version after this current content update.
     */
    @JsonProperty("nextVersion")
    protected Integer nextVersion;

    /**
     * Constructs a validated instance of {@link DetailedVersion}.
     *
     * @param spec the specification to process
     */
    public DetailedVersion(Consumer<DetailedVersion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DetailedVersion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DetailedVersion(Consumer)} instead.
     * @param number The current version number.
     * @param authorId The account ID of the user who created this version.
     * @param message Message associated with the current version.
     * @param createdAt Date and time when the version was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     * @param minorEdit Describes if this version is a minor version. Email notifications and activity stream updates are not created for minor versions.
     * @param contentTypeModified Describes if the content type is modified in this version (e.g. page to blog)
     * @param collaborators The account IDs of users that collaborated on this version.
     * @param prevVersion The version number of the version prior to this current content update.
     * @param nextVersion The version number of the version after this current content update.
     */
    @ApiStatus.Internal
    public DetailedVersion(Integer number, String authorId, String message, OffsetDateTime createdAt, Boolean minorEdit, Boolean contentTypeModified, List<String> collaborators, Integer prevVersion, Integer nextVersion) {
        this.number = number;
        this.authorId = authorId;
        this.message = message;
        this.createdAt = createdAt;
        this.minorEdit = minorEdit;
        this.contentTypeModified = contentTypeModified;
        this.collaborators = collaborators;
        this.prevVersion = prevVersion;
        this.nextVersion = nextVersion;
    }

}
