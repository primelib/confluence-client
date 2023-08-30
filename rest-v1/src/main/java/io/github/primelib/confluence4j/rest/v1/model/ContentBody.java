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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ContentBody
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
    "value",
    "representation",
    "embeddedContent",
    "webresource",
    "mediaToken",
    "_expandable",
    "_links"
})
@JsonTypeName("ContentBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentBody {

    @JsonProperty("value")
    protected String value;

    @JsonProperty("representation")
    protected RepresentationEnum representation;

    @JsonProperty("embeddedContent")
    protected List<EmbeddedContent> embeddedContent;

    @JsonProperty("webresource")
    protected WebResourceDependencies webresource;

    @JsonProperty("mediaToken")
    protected AsyncContentBodyMediaToken mediaToken;

    @JsonProperty("_expandable")
    protected AsyncContentBodyExpandable _expandable;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link ContentBody}.
     *
     * @param spec the specification to process
     */
    public ContentBody(Consumer<ContentBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentBody(Consumer)} instead.
     * @param value value
     * @param representation representation
     * @param embeddedContent embeddedContent
     * @param webresource webresource
     * @param mediaToken mediaToken
     * @param _expandable _expandable
     * @param _links _links
     */
    @ApiStatus.Internal
    public ContentBody(String value, RepresentationEnum representation, List<EmbeddedContent> embeddedContent, WebResourceDependencies webresource, AsyncContentBodyMediaToken mediaToken, AsyncContentBodyExpandable _expandable, Map<String, String> _links) {
        this.value = value;
        this.representation = representation;
        this.embeddedContent = embeddedContent;
        this.webresource = webresource;
        this.mediaToken = mediaToken;
        this._expandable = _expandable;
        this._links = _links;
    }

    @AllArgsConstructor
    public enum RepresentationEnum {
        VIEW("view"),
        EXPORT_VIEW("export_view"),
        STYLED_VIEW("styled_view"),
        STORAGE("storage"),
        EDITOR("editor"),
        EDITOR2("editor2"),
        ANONYMOUS_EXPORT_VIEW("anonymous_export_view"),
        WIKI("wiki"),
        ATLAS_DOC_FORMAT("atlas_doc_format"),
        RAW("raw");

        private static final RepresentationEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static RepresentationEnum of(String input) {
            if (input != null) {
                for (RepresentationEnum v : VALUES) {
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
