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
 * VersionRestoreParams
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
    "versionNumber",
    "message",
    "restoreTitle"
})
@JsonTypeName("VersionRestore_params")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionRestoreParams {

    /**
     * The version number to be restored.
     */
    @JsonProperty("versionNumber")
    protected Integer versionNumber;

    /**
     * Description for the version.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * If true, the content title will be the same as the title from the version restored. Defaults to {@code false}.
     */
    @JsonProperty("restoreTitle")
    protected Boolean restoreTitle;

    /**
     * Constructs a validated instance of {@link VersionRestoreParams}.
     *
     * @param spec the specification to process
     */
    public VersionRestoreParams(Consumer<VersionRestoreParams> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link VersionRestoreParams}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #VersionRestoreParams(Consumer)} instead.
     * @param versionNumber The version number to be restored.
     * @param message Description for the version.
     * @param restoreTitle If true, the content title will be the same as the title from the version restored. Defaults to {@code false}.
     */
    @ApiStatus.Internal
    public VersionRestoreParams(Integer versionNumber, String message, Boolean restoreTitle) {
        this.versionNumber = versionNumber;
        this.message = message;
        this.restoreTitle = restoreTitle;
    }

}
