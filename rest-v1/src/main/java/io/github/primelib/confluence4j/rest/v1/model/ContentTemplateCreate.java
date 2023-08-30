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
 * ContentTemplateCreate
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
    "name",
    "templateType",
    "body",
    "description",
    "labels",
    "space"
})
@JsonTypeName("ContentTemplateCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentTemplateCreate {

    /**
     * The name of the new template.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The type of the new template. Set to {@code page}.
     */
    @JsonProperty("templateType")
    protected String templateType;

    @JsonProperty("body")
    protected ContentTemplateBodyCreate body;

    /**
     * A description of the new template.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Labels for the new template.
     */
    @JsonProperty("labels")
    protected List<Label> labels;

    @JsonProperty("space")
    protected ContentTemplateCreateSpace space;

    /**
     * Constructs a validated instance of {@link ContentTemplateCreate}.
     *
     * @param spec the specification to process
     */
    public ContentTemplateCreate(Consumer<ContentTemplateCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentTemplateCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentTemplateCreate(Consumer)} instead.
     * @param name The name of the new template.
     * @param templateType The type of the new template. Set to {@code page}.
     * @param body body
     * @param description A description of the new template.
     * @param labels Labels for the new template.
     * @param space space
     */
    @ApiStatus.Internal
    public ContentTemplateCreate(String name, String templateType, ContentTemplateBodyCreate body, String description, List<Label> labels, ContentTemplateCreateSpace space) {
        this.name = name;
        this.templateType = templateType;
        this.body = body;
        this.description = description;
        this.labels = labels;
        this.space = space;
    }

}
