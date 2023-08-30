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
 * ContentRestrictionRestrictionsExpandable
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
@JsonTypeName("ContentRestriction_restrictions__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentRestrictionRestrictionsExpandable {

    @JsonProperty("user")
    protected String user;

    @JsonProperty("group")
    protected String group;

    /**
     * Constructs a validated instance of {@link ContentRestrictionRestrictionsExpandable}.
     *
     * @param spec the specification to process
     */
    public ContentRestrictionRestrictionsExpandable(Consumer<ContentRestrictionRestrictionsExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentRestrictionRestrictionsExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentRestrictionRestrictionsExpandable(Consumer)} instead.
     * @param user user
     * @param group group
     */
    @ApiStatus.Internal
    public ContentRestrictionRestrictionsExpandable(String user, String group) {
        this.user = user;
        this.group = group;
    }

}
