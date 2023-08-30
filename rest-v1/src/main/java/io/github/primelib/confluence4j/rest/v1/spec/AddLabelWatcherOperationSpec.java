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
 * AddLabelWatcherSpec
 * <p>
 * Specification for the AddLabelWatcher operation.
 * <p>
 * Add label watcher
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddLabelWatcherOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Note, you must add header when making a request, as this operation has XSRF protection.
     */
    @NotNull 
    private String xAtlassianToken;

    /**
     * The name of the label to add the watcher to.
     */
    @NotNull 
    private String labelName;

    /**
     * This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @Nullable 
    private String key;

    /**
     * This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @Nullable 
    private String username;

    /**
     * The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.
     */
    @Nullable 
    private String accountId;

    /**
     * Constructs a validated instance of {@link AddLabelWatcherOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddLabelWatcherOperationSpec(Consumer<AddLabelWatcherOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AddLabelWatcherOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param xAtlassianToken      Note, you must add header when making a request, as this operation has XSRF protection.
     * @param labelName            The name of the label to add the watcher to.
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.
     */
    @ApiStatus.Internal
    public AddLabelWatcherOperationSpec(String xAtlassianToken, String labelName, String key, String username, String accountId) {
        this.xAtlassianToken = xAtlassianToken;
        this.labelName = labelName;
        this.key = key;
        this.username = username;
        this.accountId = accountId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(xAtlassianToken, "xAtlassianToken is a required parameter!");
        Objects.requireNonNull(labelName, "labelName is a required parameter!");
    }
}
