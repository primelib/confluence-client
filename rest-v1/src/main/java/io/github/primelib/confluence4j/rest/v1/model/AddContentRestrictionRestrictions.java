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
 * AddContentRestrictionRestrictions
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
    "group"
})
@JsonTypeName("AddContentRestriction_restrictions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddContentRestrictionRestrictions {

    /**
     * The users that the restrictions will be applied to. This array must have at least one item, otherwise it should be omitted.
     */
    @JsonProperty("user")
    protected List<AddContentRestrictionRestrictionsUserInner> user;

    /**
     * The groups that the restrictions will be applied to. This array must have at least one item, otherwise it should be omitted.
     */
    @JsonProperty("group")
    protected List<AddContentRestrictionRestrictionsGroupInner> group;

    /**
     * Constructs a validated instance of {@link AddContentRestrictionRestrictions}.
     *
     * @param spec the specification to process
     */
    public AddContentRestrictionRestrictions(Consumer<AddContentRestrictionRestrictions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AddContentRestrictionRestrictions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AddContentRestrictionRestrictions(Consumer)} instead.
     * @param user The users that the restrictions will be applied to. This array must have at least one item, otherwise it should be omitted.
     * @param group The groups that the restrictions will be applied to. This array must have at least one item, otherwise it should be omitted.
     */
    @ApiStatus.Internal
    public AddContentRestrictionRestrictions(List<AddContentRestrictionRestrictionsUserInner> user, List<AddContentRestrictionRestrictionsGroupInner> group) {
        this.user = user;
        this.group = group;
    }

}
