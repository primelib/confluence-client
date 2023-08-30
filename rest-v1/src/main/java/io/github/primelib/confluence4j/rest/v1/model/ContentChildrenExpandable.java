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
 * ContentChildrenExpandable
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
    "attachment",
    "comment",
    "page"
})
@JsonTypeName("ContentChildren__expandable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentChildrenExpandable {

    @JsonProperty("attachment")
    protected String attachment;

    @JsonProperty("comment")
    protected String comment;

    @JsonProperty("page")
    protected String page;

    /**
     * Constructs a validated instance of {@link ContentChildrenExpandable}.
     *
     * @param spec the specification to process
     */
    public ContentChildrenExpandable(Consumer<ContentChildrenExpandable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentChildrenExpandable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentChildrenExpandable(Consumer)} instead.
     * @param attachment attachment
     * @param comment comment
     * @param page page
     */
    @ApiStatus.Internal
    public ContentChildrenExpandable(String attachment, String comment, String page) {
        this.attachment = attachment;
        this.comment = comment;
        this.page = page;
    }

}
