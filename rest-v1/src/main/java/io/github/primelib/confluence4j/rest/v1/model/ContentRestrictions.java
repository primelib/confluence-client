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
 * ContentRestrictions
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
    "read",
    "update",
    "_expandable",
    "_links"
})
@JsonTypeName("Content_restrictions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentRestrictions {

    @JsonProperty("read")
    protected ContentRestriction read;

    @JsonProperty("update")
    protected ContentRestriction update;

    @JsonProperty("_expandable")
    protected ContentRestrictionsExpandable _expandable;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link ContentRestrictions}.
     *
     * @param spec the specification to process
     */
    public ContentRestrictions(Consumer<ContentRestrictions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentRestrictions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentRestrictions(Consumer)} instead.
     * @param read read
     * @param update update
     * @param _expandable _expandable
     * @param _links _links
     */
    @ApiStatus.Internal
    public ContentRestrictions(ContentRestriction read, ContentRestriction update, ContentRestrictionsExpandable _expandable, Map<String, String> _links) {
        this.read = read;
        this.update = update;
        this._expandable = _expandable;
        this._links = _links;
    }

}
