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

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SearchResult
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
    "content",
    "user",
    "space",
    "title",
    "excerpt",
    "url",
    "resultParentContainer",
    "resultGlobalContainer",
    "breadcrumbs",
    "entityType",
    "iconCssClass",
    "lastModified",
    "friendlyLastModified",
    "score"
})
@JsonTypeName("SearchResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchResult {

    @JsonProperty("content")
    protected Content content;

    @JsonProperty("user")
    protected User user;

    @JsonProperty("space")
    protected Space space;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("excerpt")
    protected String excerpt;

    @JsonProperty("url")
    protected String url;

    @JsonProperty("resultParentContainer")
    protected ContainerSummary resultParentContainer;

    @JsonProperty("resultGlobalContainer")
    protected ContainerSummary resultGlobalContainer;

    @JsonProperty("breadcrumbs")
    protected List<Breadcrumb> breadcrumbs;

    @JsonProperty("entityType")
    protected String entityType;

    @JsonProperty("iconCssClass")
    protected String iconCssClass;

    @JsonProperty("lastModified")
    protected OffsetDateTime lastModified;

    @JsonProperty("friendlyLastModified")
    protected String friendlyLastModified;

    @JsonProperty("score")
    protected BigDecimal score;

    /**
     * Constructs a validated instance of {@link SearchResult}.
     *
     * @param spec the specification to process
     */
    public SearchResult(Consumer<SearchResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SearchResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SearchResult(Consumer)} instead.
     * @param content content
     * @param user user
     * @param space space
     * @param title title
     * @param excerpt excerpt
     * @param url url
     * @param resultParentContainer resultParentContainer
     * @param resultGlobalContainer resultGlobalContainer
     * @param breadcrumbs breadcrumbs
     * @param entityType entityType
     * @param iconCssClass iconCssClass
     * @param lastModified lastModified
     * @param friendlyLastModified friendlyLastModified
     * @param score score
     */
    @ApiStatus.Internal
    public SearchResult(Content content, User user, Space space, String title, String excerpt, String url, ContainerSummary resultParentContainer, ContainerSummary resultGlobalContainer, List<Breadcrumb> breadcrumbs, String entityType, String iconCssClass, OffsetDateTime lastModified, String friendlyLastModified, BigDecimal score) {
        this.content = content;
        this.user = user;
        this.space = space;
        this.title = title;
        this.excerpt = excerpt;
        this.url = url;
        this.resultParentContainer = resultParentContainer;
        this.resultGlobalContainer = resultGlobalContainer;
        this.breadcrumbs = breadcrumbs;
        this.entityType = entityType;
        this.iconCssClass = iconCssClass;
        this.lastModified = lastModified;
        this.friendlyLastModified = friendlyLastModified;
        this.score = score;
    }

}
