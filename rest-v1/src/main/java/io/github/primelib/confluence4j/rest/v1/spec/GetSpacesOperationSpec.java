package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Space;
import io.github.primelib.confluence4j.rest.v1.model.User;
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
 * GetSpacesSpec
 * <p>
 * Specification for the GetSpaces operation.
 * <p>
 * Get spaces
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetSpacesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the space to be returned. To return multiple spaces, specify this parameter multiple times with different values.
     */
    @Nullable 
    private List<String> spaceKey;

    /**
     * The id of the space to be returned. To return multiple spaces, specify this parameter multiple times with different values.
     */
    @Nullable 
    private List<Long> spaceId;

    /**
     * Filter the results to spaces based on their type.
     */
    @Nullable 
    private String type;

    /**
     * Filter the results to spaces based on their status.
     */
    @Nullable 
    private String status;

    /**
     * Filter the results to spaces based on their label.
     */
    @Nullable 
    private List<String> label;

    /**
     * Filter the results to the favourite spaces of the user specified by {@code favouriteUserKey}. Note, 'favourite' spaces are also known as 'saved for later' spaces.
     */
    @Nullable 
    private Boolean favourite;

    /**
     * The userKey of the user, whose favourite spaces are used to filter the results when using the {@code favourite} parameter.
     * Leave blank for the current user. Use [Get user](#api-user-get) to get the userKey for a user.
     */
    @Nullable 
    private String favouriteUserKey;

    /**
     * A multi-value parameter indicating which properties of the spaces to expand, where:
     * 
     * - {@code settings} returns the settings for the space, similar to [Get space settings](#api-space-spaceKey-settings-get).
     *  - {@code metadata} returns the space metadata.
     *  - {@code metadata.labels} returns the space labels, which are used to categorize the space.
     *  - {@code operations} returns the operations for a space, which are used when setting permissions.
     *  - {@code lookAndFeel} returns information about the look and feel of the space, including the color scheme.
     *  - {@code permissions} returns the permissions for the space. Note that this may return permissions for deleted groups,
     *  because deleting a group doesn't remove associated space permissions.
     *  - {@code icon} returns information about space icon.
     *  - {@code description} returns the description of the space.
     *  - {@code description.plain} returns the description of the space, the plain format.
     *  - {@code description.view} returns the description of the space, the view format.
     *  - {@code theme} returns information about the space theme.
     *  - {@code homepage} returns information about the space homepage.
     *  - {@code history} returns information about the history of the space.
     */
    @Nullable 
    private List<String> expand;

    /**
     * The starting index of the returned spaces.
     */
    @Nullable 
    private Integer start;

    /**
     * The maximum number of spaces to return per page. Note, this may be restricted by fixed system limits.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetSpacesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetSpacesOperationSpec(Consumer<GetSpacesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetSpacesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceKey             The key of the space to be returned. To return multiple spaces, specify this parameter multiple times with different values.
     * @param spaceId              The id of the space to be returned. To return multiple spaces, specify this parameter multiple times with different values.
     * @param type                 Filter the results to spaces based on their type.
     * @param status               Filter the results to spaces based on their status.
     * @param label                Filter the results to spaces based on their label.
     * @param favourite            Filter the results to the favourite spaces of the user specified by {@code favouriteUserKey}. Note, 'favourite' spaces are also known as 'saved for later' spaces.
     * @param favouriteUserKey     The userKey of the user, whose favourite spaces are used to filter the results when using the {@code favourite} parameter.  Leave blank for the current user. Use [Get user](#api-user-get) to get the userKey for a user.
     * @param expand               A multi-value parameter indicating which properties of the spaces to expand, where:    - {@code settings} returns the settings for the space, similar to [Get space settings](#api-space-spaceKey-settings-get).   - {@code metadata} returns the space metadata.   - {@code metadata.labels} returns the space labels, which are used to categorize the space.   - {@code operations} returns the operations for a space, which are used when setting permissions.   - {@code lookAndFeel} returns information about the look and feel of the space, including the color scheme.   - {@code permissions} returns the permissions for the space. Note that this may return permissions for deleted groups,   because deleting a group doesn't remove associated space permissions.   - {@code icon} returns information about space icon.   - {@code description} returns the description of the space.   - {@code description.plain} returns the description of the space, the plain format.   - {@code description.view} returns the description of the space, the view format.   - {@code theme} returns information about the space theme.   - {@code homepage} returns information about the space homepage.   - {@code history} returns information about the history of the space.
     * @param start                The starting index of the returned spaces.
     * @param limit                The maximum number of spaces to return per page. Note, this may be restricted by fixed system limits.
     */
    @ApiStatus.Internal
    public GetSpacesOperationSpec(List<String> spaceKey, List<Long> spaceId, String type, String status, List<String> label, Boolean favourite, String favouriteUserKey, List<String> expand, Integer start, Integer limit) {
        this.spaceKey = spaceKey;
        this.spaceId = spaceId;
        this.type = type;
        this.status = status;
        this.label = label;
        this.favourite = favourite;
        this.favouriteUserKey = favouriteUserKey;
        this.expand = expand;
        this.start = start;
        this.limit = limit;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}
