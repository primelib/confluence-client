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
 * CopyPageRequest
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
    "destination",
    "pageTitle",
    "body"
})
@JsonTypeName("CopyPageRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CopyPageRequest {

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

    @JsonProperty("destination")
    protected CopyPageRequestDestination destination;

    /**
     * If defined, this will replace the title of the destination page.
     */
    @JsonProperty("pageTitle")
    protected String pageTitle;

    @JsonProperty("body")
    protected CopyPageRequestBody body;

    /**
     * Constructs a validated instance of {@link CopyPageRequest}.
     *
     * @param spec the specification to process
     */
    public CopyPageRequest(Consumer<CopyPageRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CopyPageRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CopyPageRequest(Consumer)} instead.
     * @param copyAttachments If set to {@code true}, attachments are copied to the destination page.
     * @param copyPermissions If set to {@code true}, page permissions are copied to the destination page.
     * @param copyProperties If set to {@code true}, content properties are copied to the destination page.
     * @param copyLabels If set to {@code true}, labels are copied to the destination page.
     * @param copyCustomContents If set to {@code true}, custom contents are copied to the destination page.
     * @param destination destination
     * @param pageTitle If defined, this will replace the title of the destination page.
     * @param body body
     */
    @ApiStatus.Internal
    public CopyPageRequest(Boolean copyAttachments, Boolean copyPermissions, Boolean copyProperties, Boolean copyLabels, Boolean copyCustomContents, CopyPageRequestDestination destination, String pageTitle, CopyPageRequestBody body) {
        this.copyAttachments = copyAttachments;
        this.copyPermissions = copyPermissions;
        this.copyProperties = copyProperties;
        this.copyLabels = copyLabels;
        this.copyCustomContents = copyCustomContents;
        this.destination = destination;
        this.pageTitle = pageTitle;
        this.body = body;
    }

}
