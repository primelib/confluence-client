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
 * ContentExpandable
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
    "childTypes",
    "container",
    "metadata",
    "operations",
    "children",
    "restrictions",
    "history",
    "ancestors",
    "body",
    "version",
    "descendants",
    "space",
    "extensions",
    "schedulePublishDate",
    "schedulePublishInfo",
    "macroRenderedOutput"
})
@JsonTypeName("Content__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentExpandable {

    @JsonProperty("childTypes")
    protected String childTypes;

    @JsonProperty("container")
    protected String container;

    @JsonProperty("metadata")
    protected String metadata;

    @JsonProperty("operations")
    protected String operations;

    @JsonProperty("children")
    protected String children;

    @JsonProperty("restrictions")
    protected String restrictions;

    @JsonProperty("history")
    protected String history;

    @JsonProperty("ancestors")
    protected String ancestors;

    @JsonProperty("body")
    protected String body;

    @JsonProperty("version")
    protected String version;

    @JsonProperty("descendants")
    protected String descendants;

    @JsonProperty("space")
    protected String space;

    @JsonProperty("extensions")
    protected String extensions;

    @JsonProperty("schedulePublishDate")
    protected String schedulePublishDate;

    @JsonProperty("schedulePublishInfo")
    protected String schedulePublishInfo;

    @JsonProperty("macroRenderedOutput")
    protected String macroRenderedOutput;

    /**
     * Constructs a validated instance of {@link ContentExpandable}.
     *
     * @param spec the specification to process
     */
    public ContentExpandable(Consumer<ContentExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentExpandable(Consumer)} instead.
     * @param childTypes childTypes
     * @param container container
     * @param metadata metadata
     * @param operations operations
     * @param children children
     * @param restrictions restrictions
     * @param history history
     * @param ancestors ancestors
     * @param body body
     * @param version version
     * @param descendants descendants
     * @param space space
     * @param extensions extensions
     * @param schedulePublishDate schedulePublishDate
     * @param schedulePublishInfo schedulePublishInfo
     * @param macroRenderedOutput macroRenderedOutput
     */
    @ApiStatus.Internal
    public ContentExpandable(String childTypes, String container, String metadata, String operations, String children, String restrictions, String history, String ancestors, String body, String version, String descendants, String space, String extensions, String schedulePublishDate, String schedulePublishInfo, String macroRenderedOutput) {
        this.childTypes = childTypes;
        this.container = container;
        this.metadata = metadata;
        this.operations = operations;
        this.children = children;
        this.restrictions = restrictions;
        this.history = history;
        this.ancestors = ancestors;
        this.body = body;
        this.version = version;
        this.descendants = descendants;
        this.space = space;
        this.extensions = extensions;
        this.schedulePublishDate = schedulePublishDate;
        this.schedulePublishInfo = schedulePublishInfo;
        this.macroRenderedOutput = macroRenderedOutput;
    }

}
