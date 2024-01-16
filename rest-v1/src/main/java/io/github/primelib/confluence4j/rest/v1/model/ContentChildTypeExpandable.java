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
 * ContentChildTypeExpandable
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
    "all",
    "attachment",
    "comment",
    "page",
    "whiteboard"
})
@JsonTypeName("ContentChildType__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentChildTypeExpandable {

    @JsonProperty("all")
    protected String all;

    @JsonProperty("attachment")
    protected String attachment;

    @JsonProperty("comment")
    protected String comment;

    @JsonProperty("page")
    protected String page;

    @JsonProperty("whiteboard")
    protected String whiteboard;

    /**
     * Constructs a validated instance of {@link ContentChildTypeExpandable}.
     *
     * @param spec the specification to process
     */
    public ContentChildTypeExpandable(Consumer<ContentChildTypeExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentChildTypeExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentChildTypeExpandable(Consumer)} instead.
     * @param all all
     * @param attachment attachment
     * @param comment comment
     * @param page page
     * @param whiteboard whiteboard
     */
    @ApiStatus.Internal
    public ContentChildTypeExpandable(String all, String attachment, String comment, String page, String whiteboard) {
        this.all = all;
        this.attachment = attachment;
        this.comment = comment;
        this.page = page;
        this.whiteboard = whiteboard;
    }

}
