package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DownloadAttatchmentSpec
 * <p>
 * Specification for the DownloadAttatchment operation.
 * <p>
 * Get URI to download attachment
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DownloadAttatchmentOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content that the attachment is attached to.
     */
    @NotNull 
    private String id;

    /**
     * The ID of the attachment to download.
     */
    @NotNull 
    private String attachmentId;

    /**
     * The version of the attachment. If this parameter is absent, the redirect URI will download the latest version of the attachment.
     */
    @Nullable 
    private Integer version;

    /**
     * Constructs a validated instance of {@link DownloadAttatchmentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DownloadAttatchmentOperationSpec(Consumer<DownloadAttatchmentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DownloadAttatchmentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content that the attachment is attached to.
     * @param attachmentId         The ID of the attachment to download.
     * @param version              The version of the attachment. If this parameter is absent, the redirect URI will download the latest version of the attachment.
     */
    @ApiStatus.Internal
    public DownloadAttatchmentOperationSpec(String id, String attachmentId, Integer version) {
        this.id = id;
        this.attachmentId = attachmentId;
        this.version = version;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(attachmentId, "attachmentId is a required parameter!");
    }
}
