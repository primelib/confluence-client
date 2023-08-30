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
 * AsyncContentBody
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
    "renderTaskId",
    "error",
    "status",
    "embeddedContent",
    "webresource",
    "mediaToken",
    "_expandable",
    "_links"
})
@JsonTypeName("AsyncContentBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AsyncContentBody {

    @JsonProperty("value")
    protected String value;

    @JsonProperty("representation")
    protected RepresentationEnum representation;

    @JsonProperty("renderTaskId")
    protected String renderTaskId;

    @JsonProperty("error")
    protected String error;

    /**
     * Rerunning is reserved for when the job is working, but there is a previous run's value in the cache. You may choose to continue polling, or use the cached value.
     */
    @JsonProperty("status")
    protected StatusEnum status;

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
     * Constructs a validated instance of {@link AsyncContentBody}.
     *
     * @param spec the specification to process
     */
    public AsyncContentBody(Consumer<AsyncContentBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AsyncContentBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AsyncContentBody(Consumer)} instead.
     * @param value value
     * @param representation representation
     * @param renderTaskId renderTaskId
     * @param error error
     * @param status Rerunning is reserved for when the job is working, but there is a previous run's value in the cache. You may choose to continue polling, or use the cached value.
     * @param embeddedContent embeddedContent
     * @param webresource webresource
     * @param mediaToken mediaToken
     * @param _expandable _expandable
     * @param _links _links
     */
    @ApiStatus.Internal
    public AsyncContentBody(String value, RepresentationEnum representation, String renderTaskId, String error, StatusEnum status, List<EmbeddedContent> embeddedContent, WebResourceDependencies webresource, AsyncContentBodyMediaToken mediaToken, AsyncContentBodyExpandable _expandable, Map<String, String> _links) {
        this.value = value;
        this.representation = representation;
        this.renderTaskId = renderTaskId;
        this.error = error;
        this.status = status;
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
        ATLAS_DOC_FORMAT("atlas_doc_format");

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

    /**
     * Rerunning is reserved for when the job is working, but there is a previous run's value in the cache. You may choose to continue polling, or use the cached value.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        WORKING("WORKING"),
        QUEUED("QUEUED"),
        FAILED("FAILED"),
        COMPLETED("COMPLETED"),
        RERUNNING("RERUNNING");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
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
