package io.github.primelib.confluence4j.rest.v2.model;

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
 * ChildPage
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
    "id",
    "status",
    "title",
    "spaceId",
    "childPosition"
})
@JsonTypeName("ChildPage")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChildPage {

    /**
     * ID of the page.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("status")
    protected OnlyArchivedAndCurrentContentStatus status;

    /**
     * Title of the page.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * ID of the space the page is in.
     */
    @JsonProperty("spaceId")
    protected String spaceId;

    /**
     * Position of child page within the given parent page tree.
     */
    @JsonProperty("childPosition")
    protected Integer childPosition;

    /**
     * Constructs a validated instance of {@link ChildPage}.
     *
     * @param spec the specification to process
     */
    public ChildPage(Consumer<ChildPage> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChildPage}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChildPage(Consumer)} instead.
     * @param id ID of the page.
     * @param status status
     * @param title Title of the page.
     * @param spaceId ID of the space the page is in.
     * @param childPosition Position of child page within the given parent page tree.
     */
    @ApiStatus.Internal
    public ChildPage(String id, OnlyArchivedAndCurrentContentStatus status, String title, String spaceId, Integer childPosition) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.spaceId = spaceId;
        this.childPosition = childPosition;
    }

}
