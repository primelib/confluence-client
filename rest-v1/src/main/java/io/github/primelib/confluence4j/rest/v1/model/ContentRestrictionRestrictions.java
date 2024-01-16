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
 * ContentRestrictionRestrictions
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
    "user",
    "group",
    "_expandable"
})
@JsonTypeName("ContentRestriction_restrictions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentRestrictionRestrictions {

    @JsonProperty("user")
    protected UserArray user;

    @JsonProperty("group")
    protected GroupArray group;

    @JsonProperty("_expandable")
    protected ContentRestrictionRestrictionsExpandable _expandable;

    /**
     * Constructs a validated instance of {@link ContentRestrictionRestrictions}.
     *
     * @param spec the specification to process
     */
    public ContentRestrictionRestrictions(Consumer<ContentRestrictionRestrictions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentRestrictionRestrictions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentRestrictionRestrictions(Consumer)} instead.
     * @param user user
     * @param group group
     * @param _expandable _expandable
     */
    @ApiStatus.Internal
    public ContentRestrictionRestrictions(UserArray user, GroupArray group, ContentRestrictionRestrictionsExpandable _expandable) {
        this.user = user;
        this.group = group;
        this._expandable = _expandable;
    }

}
