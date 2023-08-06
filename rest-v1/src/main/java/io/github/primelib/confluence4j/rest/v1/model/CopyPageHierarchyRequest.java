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
 * CopyPageHierarchyRequest
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
    "copyAttachments",
    "copyPermissions",
    "copyProperties",
    "copyLabels",
    "copyCustomContents",
    "copyDescendants",
    "destinationPageId",
    "titleOptions"
})
@JsonTypeName("CopyPageHierarchyRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CopyPageHierarchyRequest {

    /**
     * If set to {@code true}, attachments are copied to the destination page.
     */
    @JsonProperty("copyAttachments")
    protected Boolean copyAttachments;

    /**
     * If set to {@code true}, page permissions are copied to the destination page.
     */
    @JsonProperty("copyPermissions")
    protected Boolean copyPermissions;

    /**
     * If set to {@code true}, content properties are copied to the destination page.
     */
    @JsonProperty("copyProperties")
    protected Boolean copyProperties;

    /**
     * If set to {@code true}, labels are copied to the destination page.
     */
    @JsonProperty("copyLabels")
    protected Boolean copyLabels;

    /**
     * If set to {@code true}, custom contents are copied to the destination page.
     */
    @JsonProperty("copyCustomContents")
    protected Boolean copyCustomContents;

    /**
     * If set to {@code true}, descendants are copied to the destination page.
     */
    @JsonProperty("copyDescendants")
    protected Boolean copyDescendants;

    @JsonProperty("destinationPageId")
    protected String destinationPageId;

    @JsonProperty("titleOptions")
    protected CopyPageHierarchyTitleOptions titleOptions;

    /**
     * Constructs a validated instance of {@link CopyPageHierarchyRequest}.
     *
     * @param spec the specification to process
     */
    public CopyPageHierarchyRequest(Consumer<CopyPageHierarchyRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CopyPageHierarchyRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CopyPageHierarchyRequest(Consumer)} instead.
     * @param copyAttachments If set to {@code true}, attachments are copied to the destination page.
     * @param copyPermissions If set to {@code true}, page permissions are copied to the destination page.
     * @param copyProperties If set to {@code true}, content properties are copied to the destination page.
     * @param copyLabels If set to {@code true}, labels are copied to the destination page.
     * @param copyCustomContents If set to {@code true}, custom contents are copied to the destination page.
     * @param copyDescendants If set to {@code true}, descendants are copied to the destination page.
     * @param destinationPageId destinationPageId
     * @param titleOptions titleOptions
     */
    @ApiStatus.Internal
    public CopyPageHierarchyRequest(Boolean copyAttachments, Boolean copyPermissions, Boolean copyProperties, Boolean copyLabels, Boolean copyCustomContents, Boolean copyDescendants, String destinationPageId, CopyPageHierarchyTitleOptions titleOptions) {
        this.copyAttachments = copyAttachments;
        this.copyPermissions = copyPermissions;
        this.copyProperties = copyProperties;
        this.copyLabels = copyLabels;
        this.copyCustomContents = copyCustomContents;
        this.copyDescendants = copyDescendants;
        this.destinationPageId = destinationPageId;
        this.titleOptions = titleOptions;
    }

}
