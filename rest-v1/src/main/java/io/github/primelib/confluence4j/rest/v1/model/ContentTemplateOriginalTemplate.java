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
 * ContentTemplateOriginalTemplate
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
    "pluginKey",
    "moduleKey"
})
@JsonTypeName("ContentTemplate_originalTemplate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentTemplateOriginalTemplate {

    @JsonProperty("pluginKey")
    protected String pluginKey;

    @JsonProperty("moduleKey")
    protected String moduleKey;

    /**
     * Constructs a validated instance of {@link ContentTemplateOriginalTemplate}.
     *
     * @param spec the specification to process
     */
    public ContentTemplateOriginalTemplate(Consumer<ContentTemplateOriginalTemplate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentTemplateOriginalTemplate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentTemplateOriginalTemplate(Consumer)} instead.
     * @param pluginKey pluginKey
     * @param moduleKey moduleKey
     */
    @ApiStatus.Internal
    public ContentTemplateOriginalTemplate(String pluginKey, String moduleKey) {
        this.pluginKey = pluginKey;
        this.moduleKey = moduleKey;
    }

}
