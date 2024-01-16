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
 * ContainerSummary
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
    "title",
    "displayUrl"
})
@JsonTypeName("ContainerSummary")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContainerSummary {

    @JsonProperty("title")
    protected String title;

    @JsonProperty("displayUrl")
    protected String displayUrl;

    /**
     * Constructs a validated instance of {@link ContainerSummary}.
     *
     * @param spec the specification to process
     */
    public ContainerSummary(Consumer<ContainerSummary> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContainerSummary}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContainerSummary(Consumer)} instead.
     * @param title title
     * @param displayUrl displayUrl
     */
    @ApiStatus.Internal
    public ContainerSummary(String title, String displayUrl) {
        this.title = title;
        this.displayUrl = displayUrl;
    }

}
