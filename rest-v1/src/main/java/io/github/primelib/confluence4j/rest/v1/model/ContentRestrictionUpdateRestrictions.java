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
 * ContentRestrictionUpdateRestrictions
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
    "group",
    "user"
})
@JsonTypeName("ContentRestrictionUpdate_restrictions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentRestrictionUpdateRestrictions {

    /**
     * The groups that the restrictions will be applied to. This array must have at least one item, otherwise it should be omitted. At least one of {@code name} or {@code id} is required, and {@code id} should be used where possible in advance of the {@code name} deprecation.
     */
    @JsonProperty("group")
    protected List<ContentRestrictionUpdateRestrictionsGroupInner> group;

    @JsonProperty("user")
    protected ContentRestrictionUpdateRestrictionsUser user;

    /**
     * Constructs a validated instance of {@link ContentRestrictionUpdateRestrictions}.
     *
     * @param spec the specification to process
     */
    public ContentRestrictionUpdateRestrictions(Consumer<ContentRestrictionUpdateRestrictions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentRestrictionUpdateRestrictions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentRestrictionUpdateRestrictions(Consumer)} instead.
     * @param group The groups that the restrictions will be applied to. This array must have at least one item, otherwise it should be omitted. At least one of {@code name} or {@code id} is required, and {@code id} should be used where possible in advance of the {@code name} deprecation.
     * @param user user
     */
    @ApiStatus.Internal
    public ContentRestrictionUpdateRestrictions(List<ContentRestrictionUpdateRestrictionsGroupInner> group, ContentRestrictionUpdateRestrictionsUser user) {
        this.group = group;
        this.user = user;
    }

}
