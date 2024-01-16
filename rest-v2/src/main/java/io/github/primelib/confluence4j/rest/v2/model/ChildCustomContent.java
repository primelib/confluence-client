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
 * ChildCustomContent
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
    "type",
    "spaceId"
})
@JsonTypeName("ChildCustomContent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChildCustomContent {

    /**
     * ID of the child custom content.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("status")
    protected OnlyArchivedAndCurrentContentStatus status;

    /**
     * Title of the custom content.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * Custom content type.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * ID of the space the custom content is in.
     */
    @JsonProperty("spaceId")
    protected String spaceId;

    /**
     * Constructs a validated instance of {@link ChildCustomContent}.
     *
     * @param spec the specification to process
     */
    public ChildCustomContent(Consumer<ChildCustomContent> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChildCustomContent}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChildCustomContent(Consumer)} instead.
     * @param id ID of the child custom content.
     * @param status status
     * @param title Title of the custom content.
     * @param type Custom content type.
     * @param spaceId ID of the space the custom content is in.
     */
    @ApiStatus.Internal
    public ChildCustomContent(String id, OnlyArchivedAndCurrentContentStatus status, String title, String type, String spaceId) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.type = type;
        this.spaceId = spaceId;
    }

}
