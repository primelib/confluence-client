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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentTemplate
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
    "templateId",
    "originalTemplate",
    "referencingBlueprint",
    "name",
    "description",
    "space",
    "labels",
    "templateType",
    "editorVersion",
    "body",
    "_expandable",
    "_links"
})
@JsonTypeName("ContentTemplate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentTemplate {

    @JsonProperty("templateId")
    protected String templateId;

    @JsonProperty("originalTemplate")
    protected ContentTemplateOriginalTemplate originalTemplate;

    @JsonProperty("referencingBlueprint")
    protected String referencingBlueprint;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("space")
    protected Map<String, Object> space;

    @JsonProperty("labels")
    protected List<Label> labels;

    @JsonProperty("templateType")
    protected String templateType;

    @JsonProperty("editorVersion")
    protected String editorVersion;

    @JsonProperty("body")
    protected ContentTemplateBody body;

    @JsonProperty("_expandable")
    protected BlueprintTemplateExpandable _expandable;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link ContentTemplate}.
     *
     * @param spec the specification to process
     */
    public ContentTemplate(Consumer<ContentTemplate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentTemplate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentTemplate(Consumer)} instead.
     * @param templateId templateId
     * @param originalTemplate originalTemplate
     * @param referencingBlueprint referencingBlueprint
     * @param name name
     * @param description description
     * @param space space
     * @param labels labels
     * @param templateType templateType
     * @param editorVersion editorVersion
     * @param body body
     * @param _expandable _expandable
     * @param _links _links
     */
    @ApiStatus.Internal
    public ContentTemplate(String templateId, ContentTemplateOriginalTemplate originalTemplate, String referencingBlueprint, String name, String description, Map<String, Object> space, List<Label> labels, String templateType, String editorVersion, ContentTemplateBody body, BlueprintTemplateExpandable _expandable, Map<String, String> _links) {
        this.templateId = templateId;
        this.originalTemplate = originalTemplate;
        this.referencingBlueprint = referencingBlueprint;
        this.name = name;
        this.description = description;
        this.space = space;
        this.labels = labels;
        this.templateType = templateType;
        this.editorVersion = editorVersion;
        this.body = body;
        this._expandable = _expandable;
        this._links = _links;
    }

}
