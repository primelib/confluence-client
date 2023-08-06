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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LookAndFeelWithLinks
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
    "headings",
    "links",
    "menus",
    "header",
    "horizontalHeader",
    "content",
    "bordersAndDividers",
    "spaceReference",
    "_links"
})
@JsonTypeName("LookAndFeelWithLinks")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LookAndFeelWithLinks {

    @JsonProperty("headings")
    protected LookAndFeelHeadings headings;

    @JsonProperty("links")
    protected LookAndFeelHeadings links;

    @JsonProperty("menus")
    protected MenusLookAndFeel menus;

    @JsonProperty("header")
    protected HeaderLookAndFeel header;

    @JsonProperty("horizontalHeader")
    protected HorizontalHeaderLookAndFeel horizontalHeader;

    @JsonProperty("content")
    protected ContentLookAndFeel content;

    @JsonProperty("bordersAndDividers")
    protected LookAndFeelHeadings bordersAndDividers;

    @JsonProperty("spaceReference")
    protected Object spaceReference;

    @JsonProperty("_links")
    protected Map<String, String> _links;

    /**
     * Constructs a validated instance of {@link LookAndFeelWithLinks}.
     *
     * @param spec the specification to process
     */
    public LookAndFeelWithLinks(Consumer<LookAndFeelWithLinks> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LookAndFeelWithLinks}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LookAndFeelWithLinks(Consumer)} instead.
     * @param headings headings
     * @param links links
     * @param menus menus
     * @param header header
     * @param horizontalHeader horizontalHeader
     * @param content content
     * @param bordersAndDividers bordersAndDividers
     * @param spaceReference spaceReference
     * @param _links _links
     */
    @ApiStatus.Internal
    public LookAndFeelWithLinks(LookAndFeelHeadings headings, LookAndFeelHeadings links, MenusLookAndFeel menus, HeaderLookAndFeel header, HorizontalHeaderLookAndFeel horizontalHeader, ContentLookAndFeel content, LookAndFeelHeadings bordersAndDividers, Object spaceReference, Map<String, String> _links) {
        this.headings = headings;
        this.links = links;
        this.menus = menus;
        this.header = header;
        this.horizontalHeader = horizontalHeader;
        this.content = content;
        this.bordersAndDividers = bordersAndDividers;
        this.spaceReference = spaceReference;
        this._links = _links;
    }

}
