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
 * ContentHistoryExpandable
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
    "lastUpdated",
    "previousVersion",
    "contributors",
    "nextVersion",
    "ownedBy",
    "lastOwnedBy"
})
@JsonTypeName("ContentHistory__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentHistoryExpandable {

    @JsonProperty("lastUpdated")
    protected String lastUpdated;

    @JsonProperty("previousVersion")
    protected String previousVersion;

    @JsonProperty("contributors")
    protected String contributors;

    @JsonProperty("nextVersion")
    protected String nextVersion;

    @JsonProperty("ownedBy")
    protected String ownedBy;

    @JsonProperty("lastOwnedBy")
    protected String lastOwnedBy;

    /**
     * Constructs a validated instance of {@link ContentHistoryExpandable}.
     *
     * @param spec the specification to process
     */
    public ContentHistoryExpandable(Consumer<ContentHistoryExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentHistoryExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentHistoryExpandable(Consumer)} instead.
     * @param lastUpdated lastUpdated
     * @param previousVersion previousVersion
     * @param contributors contributors
     * @param nextVersion nextVersion
     * @param ownedBy ownedBy
     * @param lastOwnedBy lastOwnedBy
     */
    @ApiStatus.Internal
    public ContentHistoryExpandable(String lastUpdated, String previousVersion, String contributors, String nextVersion, String ownedBy, String lastOwnedBy) {
        this.lastUpdated = lastUpdated;
        this.previousVersion = previousVersion;
        this.contributors = contributors;
        this.nextVersion = nextVersion;
        this.ownedBy = ownedBy;
        this.lastOwnedBy = lastOwnedBy;
    }

}
