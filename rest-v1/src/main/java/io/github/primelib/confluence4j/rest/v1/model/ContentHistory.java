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
 * ContentHistory
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
    "latest",
    "createdBy",
    "ownedBy",
    "lastOwnedBy",
    "createdDate",
    "lastUpdated",
    "previousVersion",
    "contributors",
    "nextVersion",
    "_expandable",
    "_links"
})
@JsonTypeName("ContentHistory")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentHistory {

    @JsonProperty("latest")
    protected Boolean latest;

    @JsonProperty("createdBy")
    protected User createdBy;

    @JsonProperty("ownedBy")
    protected User ownedBy;

    @JsonProperty("lastOwnedBy")
    protected User lastOwnedBy;

    @JsonProperty("createdDate")
    protected OffsetDateTime createdDate;

    @JsonProperty("lastUpdated")
    protected Version lastUpdated;

    @JsonProperty("previousVersion")
    protected Version previousVersion;

    @JsonProperty("contributors")
    protected ContentHistoryContributors contributors;

    @JsonProperty("nextVersion")
    protected Version nextVersion;

    @JsonProperty("_expandable")
    protected ContentHistoryExpandable _expandable;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link ContentHistory}.
     *
     * @param spec the specification to process
     */
    public ContentHistory(Consumer<ContentHistory> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentHistory}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentHistory(Consumer)} instead.
     * @param latest latest
     * @param createdBy createdBy
     * @param ownedBy ownedBy
     * @param lastOwnedBy lastOwnedBy
     * @param createdDate createdDate
     * @param lastUpdated lastUpdated
     * @param previousVersion previousVersion
     * @param contributors contributors
     * @param nextVersion nextVersion
     * @param _expandable _expandable
     * @param _links _links
     */
    @ApiStatus.Internal
    public ContentHistory(Boolean latest, User createdBy, User ownedBy, User lastOwnedBy, OffsetDateTime createdDate, Version lastUpdated, Version previousVersion, ContentHistoryContributors contributors, Version nextVersion, ContentHistoryExpandable _expandable, Map<String, String> _links) {
        this.latest = latest;
        this.createdBy = createdBy;
        this.ownedBy = ownedBy;
        this.lastOwnedBy = lastOwnedBy;
        this.createdDate = createdDate;
        this.lastUpdated = lastUpdated;
        this.previousVersion = previousVersion;
        this.contributors = contributors;
        this.nextVersion = nextVersion;
        this._expandable = _expandable;
        this._links = _links;
    }

}
