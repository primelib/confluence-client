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
 * CopyPageHierarchyTitleOptions
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
    "prefix",
    "replace",
    "search"
})
@JsonTypeName("CopyPageHierarchyTitleOptions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CopyPageHierarchyTitleOptions {

    @JsonProperty("prefix")
    protected String prefix;

    @JsonProperty("replace")
    protected String replace;

    @JsonProperty("search")
    protected String search;

    /**
     * Constructs a validated instance of {@link CopyPageHierarchyTitleOptions}.
     *
     * @param spec the specification to process
     */
    public CopyPageHierarchyTitleOptions(Consumer<CopyPageHierarchyTitleOptions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CopyPageHierarchyTitleOptions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CopyPageHierarchyTitleOptions(Consumer)} instead.
     * @param prefix prefix
     * @param replace replace
     * @param search search
     */
    @ApiStatus.Internal
    public CopyPageHierarchyTitleOptions(String prefix, String replace, String search) {
        this.prefix = prefix;
        this.replace = replace;
        this.search = search;
    }

}
