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
 * LookAndFeel
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
    "spaceReference"
})
@JsonTypeName("LookAndFeel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LookAndFeel {

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

    /**
     * Constructs a validated instance of {@link LookAndFeel}.
     *
     * @param spec the specification to process
     */
    public LookAndFeel(Consumer<LookAndFeel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LookAndFeel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LookAndFeel(Consumer)} instead.
     * @param headings headings
     * @param links links
     * @param menus menus
     * @param header header
     * @param horizontalHeader horizontalHeader
     * @param content content
     * @param bordersAndDividers bordersAndDividers
     * @param spaceReference spaceReference
     */
    @ApiStatus.Internal
    public LookAndFeel(LookAndFeelHeadings headings, LookAndFeelHeadings links, MenusLookAndFeel menus, HeaderLookAndFeel header, HorizontalHeaderLookAndFeel horizontalHeader, ContentLookAndFeel content, LookAndFeelHeadings bordersAndDividers, Object spaceReference) {
        this.headings = headings;
        this.links = links;
        this.menus = menus;
        this.header = header;
        this.horizontalHeader = horizontalHeader;
        this.content = content;
        this.bordersAndDividers = bordersAndDividers;
        this.spaceReference = spaceReference;
    }

}
