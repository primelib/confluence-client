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
 * BlueprintTemplateOriginalTemplate
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
@JsonTypeName("BlueprintTemplate_originalTemplate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BlueprintTemplateOriginalTemplate {

    @JsonProperty("pluginKey")
    protected String pluginKey;

    @JsonProperty("moduleKey")
    protected String moduleKey;

    /**
     * Constructs a validated instance of {@link BlueprintTemplateOriginalTemplate}.
     *
     * @param spec the specification to process
     */
    public BlueprintTemplateOriginalTemplate(Consumer<BlueprintTemplateOriginalTemplate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BlueprintTemplateOriginalTemplate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BlueprintTemplateOriginalTemplate(Consumer)} instead.
     * @param pluginKey pluginKey
     * @param moduleKey moduleKey
     */
    @ApiStatus.Internal
    public BlueprintTemplateOriginalTemplate(String pluginKey, String moduleKey) {
        this.pluginKey = pluginKey;
        this.moduleKey = moduleKey;
    }

}
