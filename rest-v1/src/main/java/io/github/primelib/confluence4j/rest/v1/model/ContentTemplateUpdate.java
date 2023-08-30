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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ContentTemplateUpdate
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
    "name",
    "templateType",
    "body",
    "description",
    "labels",
    "space"
})
@JsonTypeName("ContentTemplateUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentTemplateUpdate {

    /**
     * The ID of the template being updated.
     */
    @JsonProperty("templateId")
    protected String templateId;

    /**
     * The name of the template. Set to the current {@code name} if this field is not being updated.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The type of the template. Set to {@code page}.
     */
    @JsonProperty("templateType")
    protected TemplateTypeEnum templateType;

    @JsonProperty("body")
    protected ContentTemplateBodyCreate body;

    /**
     * A description of the template.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Labels for the template.
     */
    @JsonProperty("labels")
    protected List<Label> labels;

    @JsonProperty("space")
    protected ContentTemplateUpdateSpace space;

    /**
     * Constructs a validated instance of {@link ContentTemplateUpdate}.
     *
     * @param spec the specification to process
     */
    public ContentTemplateUpdate(Consumer<ContentTemplateUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentTemplateUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentTemplateUpdate(Consumer)} instead.
     * @param templateId The ID of the template being updated.
     * @param name The name of the template. Set to the current {@code name} if this field is not being updated.
     * @param templateType The type of the template. Set to {@code page}.
     * @param body body
     * @param description A description of the template.
     * @param labels Labels for the template.
     * @param space space
     */
    @ApiStatus.Internal
    public ContentTemplateUpdate(String templateId, String name, TemplateTypeEnum templateType, ContentTemplateBodyCreate body, String description, List<Label> labels, ContentTemplateUpdateSpace space) {
        this.templateId = templateId;
        this.name = name;
        this.templateType = templateType;
        this.body = body;
        this.description = description;
        this.labels = labels;
        this.space = space;
    }

    /**
     * The type of the template. Set to {@code page}.
     */
    @AllArgsConstructor
    public enum TemplateTypeEnum {
        PAGE("page");

        private static final TemplateTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TemplateTypeEnum of(String input) {
            if (input != null) {
                for (TemplateTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
