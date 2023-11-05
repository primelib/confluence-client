package io.github.primelib.confluence4j.rest.v1.api;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;
import lombok.Builder;

import io.github.primelib.confluence4j.rest.v1.model.AccountId;
import io.github.primelib.confluence4j.rest.v1.model.AccountIdEmailRecord;
import io.github.primelib.confluence4j.rest.v1.model.AddLabelsToContentRequest;
import io.github.primelib.confluence4j.rest.v1.model.ArchivePagesRequest;
import io.github.primelib.confluence4j.rest.v1.model.AsyncContentBody;
import io.github.primelib.confluence4j.rest.v1.model.AsyncId;
import io.github.primelib.confluence4j.rest.v1.model.AttachmentPropertiesUpdateBody;
import io.github.primelib.confluence4j.rest.v1.model.AuditRecord;
import io.github.primelib.confluence4j.rest.v1.model.AuditRecordArray;
import io.github.primelib.confluence4j.rest.v1.model.AuditRecordCreate;
import io.github.primelib.confluence4j.rest.v1.model.AvailableContentStates;
import io.github.primelib.confluence4j.rest.v1.model.BlueprintTemplateArray;
import io.github.primelib.confluence4j.rest.v1.model.BulkContentStateSetInput;
import io.github.primelib.confluence4j.rest.v1.model.BulkRemoveContentStatesRequest;
import io.github.primelib.confluence4j.rest.v1.model.BulkUserLookupArray;
import io.github.primelib.confluence4j.rest.v1.model.ConnectModules;
import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.ContentArray;
import io.github.primelib.confluence4j.rest.v1.model.ContentBlueprintDraft;
import io.github.primelib.confluence4j.rest.v1.model.ContentBody;
import io.github.primelib.confluence4j.rest.v1.model.ContentBodyCreate;
import io.github.primelib.confluence4j.rest.v1.model.ContentChildren;
import io.github.primelib.confluence4j.rest.v1.model.ContentCreate;
import io.github.primelib.confluence4j.rest.v1.model.ContentHistory;
import io.github.primelib.confluence4j.rest.v1.model.ContentPermissionRequest;
import io.github.primelib.confluence4j.rest.v1.model.ContentProperty;
import io.github.primelib.confluence4j.rest.v1.model.ContentPropertyArray;
import io.github.primelib.confluence4j.rest.v1.model.ContentPropertyCreate;
import io.github.primelib.confluence4j.rest.v1.model.ContentPropertyCreateNoKey;
import io.github.primelib.confluence4j.rest.v1.model.ContentPropertyUpdate;
import io.github.primelib.confluence4j.rest.v1.model.ContentRestriction;
import io.github.primelib.confluence4j.rest.v1.model.ContentRestrictionAddOrUpdateArray;
import io.github.primelib.confluence4j.rest.v1.model.ContentRestrictionArray;
import io.github.primelib.confluence4j.rest.v1.model.ContentState;
import io.github.primelib.confluence4j.rest.v1.model.ContentStateBulkSetTaskUpdate;
import io.github.primelib.confluence4j.rest.v1.model.ContentStateResponse;
import io.github.primelib.confluence4j.rest.v1.model.ContentStateRestInput;
import io.github.primelib.confluence4j.rest.v1.model.ContentStateSettings;
import io.github.primelib.confluence4j.rest.v1.model.ContentTemplate;
import io.github.primelib.confluence4j.rest.v1.model.ContentTemplateArray;
import io.github.primelib.confluence4j.rest.v1.model.ContentTemplateCreate;
import io.github.primelib.confluence4j.rest.v1.model.ContentTemplateUpdate;
import io.github.primelib.confluence4j.rest.v1.model.ContentUpdate;
import io.github.primelib.confluence4j.rest.v1.model.CopyPageHierarchyRequest;
import io.github.primelib.confluence4j.rest.v1.model.CopyPageRequest;
import java.io.File;
import io.github.primelib.confluence4j.rest.v1.model.GetContentForSpace200Response;
import io.github.primelib.confluence4j.rest.v1.model.GetRestrictionsByOperation200ResponseValue;
import io.github.primelib.confluence4j.rest.v1.model.GetViewers200Response;
import io.github.primelib.confluence4j.rest.v1.model.GetViews200Response;
import io.github.primelib.confluence4j.rest.v1.model.Group;
import io.github.primelib.confluence4j.rest.v1.model.GroupArrayWithLinks;
import io.github.primelib.confluence4j.rest.v1.model.GroupName;
import io.github.primelib.confluence4j.rest.v1.model.LabelArray;
import io.github.primelib.confluence4j.rest.v1.model.LabelCreate;
import io.github.primelib.confluence4j.rest.v1.model.LabelDetails;
import io.github.primelib.confluence4j.rest.v1.model.LongTask;
import io.github.primelib.confluence4j.rest.v1.model.LongTaskStatusArray;
import io.github.primelib.confluence4j.rest.v1.model.LongTaskStatusWithLinks;
import io.github.primelib.confluence4j.rest.v1.model.LookAndFeel;
import io.github.primelib.confluence4j.rest.v1.model.LookAndFeelSelection;
import io.github.primelib.confluence4j.rest.v1.model.LookAndFeelSettings;
import io.github.primelib.confluence4j.rest.v1.model.LookAndFeelWithLinks;
import io.github.primelib.confluence4j.rest.v1.model.MacroInstance;
import io.github.primelib.confluence4j.rest.v1.model.MovePage200Response;
import io.github.primelib.confluence4j.rest.v1.model.PermissionCheckResponse;
import io.github.primelib.confluence4j.rest.v1.model.Relation;
import io.github.primelib.confluence4j.rest.v1.model.RelationArray;
import io.github.primelib.confluence4j.rest.v1.model.RetentionPeriod;
import io.github.primelib.confluence4j.rest.v1.model.SearchPageResponseSearchResult;
import io.github.primelib.confluence4j.rest.v1.model.Space;
import io.github.primelib.confluence4j.rest.v1.model.SpaceArray;
import io.github.primelib.confluence4j.rest.v1.model.SpaceCreate;
import io.github.primelib.confluence4j.rest.v1.model.SpacePermissionCustomContent;
import io.github.primelib.confluence4j.rest.v1.model.SpacePermissionRequest;
import io.github.primelib.confluence4j.rest.v1.model.SpacePermissionV2;
import io.github.primelib.confluence4j.rest.v1.model.SpaceProperty;
import io.github.primelib.confluence4j.rest.v1.model.SpacePropertyArray;
import io.github.primelib.confluence4j.rest.v1.model.SpacePropertyCreate;
import io.github.primelib.confluence4j.rest.v1.model.SpacePropertyCreateNoKey;
import io.github.primelib.confluence4j.rest.v1.model.SpacePropertyUpdate;
import io.github.primelib.confluence4j.rest.v1.model.SpaceSettings;
import io.github.primelib.confluence4j.rest.v1.model.SpaceSettingsUpdate;
import io.github.primelib.confluence4j.rest.v1.model.SpaceUpdate;
import io.github.primelib.confluence4j.rest.v1.model.SpaceWatchArray;
import io.github.primelib.confluence4j.rest.v1.model.SystemInfoEntity;
import io.github.primelib.confluence4j.rest.v1.model.Task;
import io.github.primelib.confluence4j.rest.v1.model.TaskPageResponse;
import io.github.primelib.confluence4j.rest.v1.model.TaskStatusUpdate;
import io.github.primelib.confluence4j.rest.v1.model.Theme;
import io.github.primelib.confluence4j.rest.v1.model.ThemeArray;
import io.github.primelib.confluence4j.rest.v1.model.ThemeUpdate;
import io.github.primelib.confluence4j.rest.v1.model.User;
import io.github.primelib.confluence4j.rest.v1.model.UserAnonymous;
import io.github.primelib.confluence4j.rest.v1.model.UserArray;
import io.github.primelib.confluence4j.rest.v1.model.UserProperty;
import io.github.primelib.confluence4j.rest.v1.model.UserPropertyCreate;
import io.github.primelib.confluence4j.rest.v1.model.UserPropertyKeyArray;
import io.github.primelib.confluence4j.rest.v1.model.UserPropertyUpdate;
import io.github.primelib.confluence4j.rest.v1.model.UserWatch;
import io.github.primelib.confluence4j.rest.v1.model.Version;
import io.github.primelib.confluence4j.rest.v1.model.VersionArray;
import io.github.primelib.confluence4j.rest.v1.model.VersionRestore;
import io.github.primelib.confluence4j.rest.v1.model.WatchArray;
import java.util.concurrent.CompletableFuture;
import feign.RequestLine;
import feign.Param;
import feign.Headers;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public interface ConfluenceRESTV1AsyncApi {

    /**
     * Add content watcher
     * <p>
     * Adds a user as a watcher to a piece of content. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * Note, you must add the {@code X-Atlassian-Token: no-check} header when making a request, as this operation has XSRF protection.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param contentId            The ID of the content to add the watcher to. (required)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (optional)
     */
    @RequestLine("POST /wiki/rest/api/user/watch/content/{contentId}?key={key}&username={username}&accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> addContentWatcher(@Param("contentId") @NotNull String contentId, @Param("key") @Nullable String key, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Add new custom content permission to space
     * <p>
     * Adds new custom content permission to space.
     * If the permission to be added is a group permission, the group can be identified by its group name or group id.
     * Note: Only apps can access this REST resource and only make changes to the respective app permissions.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [read:space.permission:confluence, write:space.permission:confluence]
     * @param spaceKey             The key of the space to be queried for its content. (required)
     * @param body                 The permissions to be created. (required)
     */
    @RequestLine("POST /wiki/rest/api/space/{spaceKey}/permission/custom-content")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Void> addCustomContentPermissions(@Param("spaceKey") @NotNull String spaceKey, @NotNull SpacePermissionCustomContent body);

    /**
     * Add group to content restriction
     * <p>
     * Deprecated, use [Add group to content restriction via groupId](https://developer.atlassian.com/cloud/confluence/rest/v1/api-group-content-restrictions/#api-wiki-rest-api-content-id-restriction-byoperation-operationkey-bygroupid-groupid-put). Adds a group to a content restriction. That is, grant read or update permission to the group for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content that the restriction applies to. (required)
     * @param operationKey         The operation that the restriction applies to. (required)
     * @param groupName            The name of the group to add to the content restriction. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("PUT /wiki/rest/api/content/{id}/restriction/byOperation/{operationKey}/group/{groupName}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> addGroupToContentRestriction(@Param("id") @NotNull String id, @Param("operationKey") @NotNull String operationKey, @Param("groupName") @NotNull String groupName);

    /**
     * Add group to content restriction
     * <p>
     * Adds a group to a content restriction by Group Id. That is, grant read or update permission to the group for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content that the restriction applies to. (required)
     * @param operationKey         The operation that the restriction applies to. (required)
     * @param groupId              The groupId of the group to add to the content restriction. (required)
     */
    @RequestLine("PUT /wiki/rest/api/content/{id}/restriction/byOperation/{operationKey}/byGroupId/{groupId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> addGroupToContentRestrictionByGroupId(@Param("id") @NotNull String id, @Param("operationKey") @NotNull String operationKey, @Param("groupId") @NotNull String groupId);

    /**
     * Add label watcher
     * <p>
     * Adds a user as a watcher to a label. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * Note, you must add the {@code X-Atlassian-Token: no-check} header when making a request, as this operation has XSRF protection.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param xAtlassianToken      Note, you must add header when making a request, as this operation has XSRF protection. (required)
     * @param labelName            The name of the label to add the watcher to. (required)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (optional)
     */
    @RequestLine("POST /wiki/rest/api/user/watch/label/{labelName}?key={key}&username={username}&accountId={accountId}")
    @Headers({
        "X-Atlassian-Token: {xAtlassianToken}", 
        "Accept: application/json"
    })
    CompletableFuture<Void> addLabelWatcher(@Param("xAtlassianToken") @NotNull String xAtlassianToken, @Param("labelName") @NotNull String labelName, @Param("key") @Nullable String key, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Add labels to content
     * <p>
     * Adds labels to a piece of content. Does not modify the existing labels.
     * Notes:
     * - Labels can also be added when creating content ([Create content](#api-content-post)). - Labels can be updated when updating content ([Update content](#api-content-id-put)). This will delete the existing labels and replace them with the labels in the request.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content that will have labels added to it. (required)
     * @param body                 The labels to add to the content. (required)
     */
    @RequestLine("POST /wiki/rest/api/content/{id}/label")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<LabelArray> addLabelsToContent(@Param("id") @NotNull String id, @NotNull AddLabelsToContentRequest body);

    /**
     * Add labels to a space
     * <p>
     * Adds labels to a piece of content. Does not modify the existing labels.
     * Notes:
     * - Labels can also be added when creating content ([Create content](#api-content-post)). - Labels can be updated when updating content ([Update content](#api-content-id-put)). This will delete the existing labels and replace them with the labels in the request.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spaceKey             The key of the space to add labels to. (required)
     * @param labelCreate          The labels to add to the content. (required)
     */
    @RequestLine("POST /wiki/rest/api/space/{spaceKey}/label")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<LabelArray> addLabelsToSpace(@Param("spaceKey") @NotNull String spaceKey, @NotNull List<LabelCreate> labelCreate);

    /**
     * Add new permission to space
     * <p>
     * Adds new permission to space.
     * If the permission to be added is a group permission, the group can be identified by its group name or group id.
     * Note: Apps cannot access this REST resource - including when utilizing user impersonation.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [read:space.permission:confluence, write:space.permission:confluence]
     * @param spaceKey             The key of the space to be queried for its content. (required)
     * @param body                 The permission to be created. (required)
     */
    @RequestLine("POST /wiki/rest/api/space/{spaceKey}/permission")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<SpacePermissionV2> addPermissionToSpace(@Param("spaceKey") @NotNull String spaceKey, @NotNull SpacePermissionRequest body);

    /**
     * Add restrictions
     * <p>
     * Adds restrictions to a piece of content. Note, this does not change any existing restrictions on the content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content to add restrictions to. (required)
     * @param body                 The restrictions to be added to the content. (required)
     * @param expand               A multi-value parameter indicating which properties of the content restrictions (returned in response) to expand.  - {@code restrictions.user} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code content} returns the piece of content that the restrictions are applied to. (optional)
     */
    @RequestLine("POST /wiki/rest/api/content/{id}/restriction?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentRestrictionArray> addRestrictions(@Param("id") @NotNull String id, @NotNull ContentRestrictionAddOrUpdateArray body, @Param("expand") @Nullable List<String> expand);

    /**
     * Add space watcher
     * <p>
     * Adds a user as a watcher to a space. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * Note, you must add the {@code X-Atlassian-Token: no-check} header when making a request, as this operation has XSRF protection.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param xAtlassianToken      Note, you must add header when making a request, as this operation has XSRF protection. (required)
     * @param spaceKey             The key of the space to add the watcher to. (required)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (optional)
     */
    @RequestLine("POST /wiki/rest/api/user/watch/space/{spaceKey}?key={key}&username={username}&accountId={accountId}")
    @Headers({
        "X-Atlassian-Token: {xAtlassianToken}", 
        "Accept: application/json"
    })
    CompletableFuture<Void> addSpaceWatcher(@Param("xAtlassianToken") @NotNull String xAtlassianToken, @Param("spaceKey") @NotNull String spaceKey, @Param("key") @Nullable String key, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Add user to content restriction
     * <p>
     * Adds a user to a content restriction. That is, grant read or update permission to the user for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content that the restriction applies to. (required)
     * @param operationKey         The operation that the restriction applies to. (required)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (optional)
     */
    @RequestLine("PUT /wiki/rest/api/content/{id}/restriction/byOperation/{operationKey}/user?key={key}&username={username}&accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> addUserToContentRestriction(@Param("id") @NotNull String id, @Param("operationKey") @NotNull String operationKey, @Param("key") @Nullable String key, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Add member to group
     * <p>
     * Adds a user as a member in a group.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: User must be a site admin.
     *
     * Authentication - Required Scopes: [write:confluence-groups]
     * @param name                 Name of the group whose membership is updated (required)
     * @param body                 AccountId of the user who needs to be added as member. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("POST /wiki/rest/api/group/user?name={name}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Void> addUserToGroup(@Param("name") @NotNull String name, @NotNull AccountId body);

    /**
     * Add member to group by groupId
     * <p>
     * Adds a user as a member in a group represented by its groupId
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: User must be a site admin.
     *
     * Authentication - Required Scopes: [write:confluence-groups]
     * @param groupId              GroupId of the group whose membership is updated (required)
     * @param body                 AccountId of the user who needs to be added as member. (required)
     */
    @RequestLine("POST /wiki/rest/api/group/userByGroupId?groupId={groupId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Void> addUserToGroupByGroupId(@Param("groupId") @NotNull String groupId, @NotNull AccountId body);

    /**
     * Archive pages
     * <p>
     * Archives a list of pages. The pages to be archived are specified as a list of content IDs. This API accepts the archival request and returns a task ID. The archival process happens asynchronously. Use the /longtask/&amp;lt;taskId&amp;gt; REST API to get the copy task status.
     * Each content ID needs to resolve to page objects that are not already in an archived state. The content IDs need not belong to the same space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Archive' permission for each of the pages in the corresponding space it belongs to.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param archivePagesRequest  The pages to be archived. (optional)
     */
    @RequestLine("POST /wiki/rest/api/content/archive")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<LongTask> archivePages(@Nullable ArchivePagesRequest archivePagesRequest);

    /**
     * Asynchronously convert content body
     * <p>
     * Converts a content body from one format to another format asynchronously. Returns the asyncId for the asynchronous task.
     * Supported conversions:
     * - storage: export_view
     * No other conversions are supported at the moment. Once a conversion is completed, it will be available for 5 minutes at the result endpoint.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: If request specifies 'contentIdContext', 'View' permission for the space, and permission to view the content.
     *
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param to                   The name of the target format for the content body. (required)
     * @param body                 The content body to convert. (required)
     * @param expand               A multi-value parameter indicating which properties of the content to expand and populate. Expands are dependent on the {@code to} conversion format and may be irrelevant for certain conversions (e.g. {@code macroRenderedOutput} is redundant when converting to {@code view} format).   If rendering to {@code view} format, and the body content being converted includes arbitrary nested content (such as macros); then it is  necessary to include webresource expands in the request. Webresources for content body are the batched JS and CSS dependencies for any nested dynamic content (i.e. macros).  - {@code embeddedContent} returns metadata for nested content (e.g. page included using page include macro) - {@code mediaToken} returns JWT token for retrieving attachment data from Media API - {@code macroRenderedOutput} additionally converts body to view format - {@code webresource.superbatch.uris.js} returns all common JS dependencies as static URLs - {@code webresource.superbatch.uris.css} returns all common CSS dependencies as static URLs - {@code webresource.superbatch.uris.all} returns all common dependencies as static URLs - {@code webresource.superbatch.tags.all} returns all common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.superbatch.tags.css} returns all common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.superbatch.tags.js} returns all common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags - {@code webresource.uris.js} returns JS dependencies specific to conversion - {@code webresource.uris.css} returns CSS dependencies specific to conversion - {@code webresource.uris.all} returns all dependencies specific to conversion      - {@code webresource.tags.all} returns common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.tags.css} returns common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.tags.js} returns common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags (optional)
     * @param spaceKeyContext      The space key used for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code spaceKeyContext=TEST} parameter is provided, then the link will be converted to a link to the "Example page" page in the "TEST" space. (optional)
     * @param contentIdContext     The content ID used to find the space for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code contentIdContext=123} parameter is provided, then the link will be converted to a link to the "Example page" page in the same space that has the content with ID=123. Note, {@code spaceKeyContext} will be ignored if this parameter is provided. (optional)
     * @param allowCache           If this field is false, the cache will erase its current value and begin a new conversion. If this field is true, the cache will not erase its current value, and will set the status of the async conversion to RERUNNING. Once the data is updated, the status will change to COMPLETED.  Large macros that take long to convert, and whose data need not immediately up to date (same as previous conversion's result within last 5 minutes) should set this fields to true. Cache values are stored per user per content body and expansions. (optional, defaults to false)
     * @param embeddedContentRender Mode used for rendering embedded content, like attachments.  - {@code current} renders the embedded content using the latest version. - {@code version-at-save} renders the embedded content using the version at the time of save. (optional, defaults to current)
     */
    @RequestLine("POST /wiki/rest/api/contentbody/convert/async/{to}?expand={expand}&spaceKeyContext={spaceKeyContext}&contentIdContext={contentIdContext}&allowCache={allowCache}&embeddedContentRender={embeddedContentRender}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<AsyncId> asyncConvertContentBodyRequest(@Param("to") @NotNull String to, @NotNull ContentBodyCreate body, @Param("expand") @Nullable List<String> expand, @Param("spaceKeyContext") @Nullable String spaceKeyContext, @Param("contentIdContext") @Nullable String contentIdContext, @Param("allowCache") @Nullable Boolean allowCache, @Param("embeddedContentRender") @Nullable String embeddedContentRender);

    /**
     * Get asynchronously converted content body from the id or the current status of the task.
     * <p>
     * Returns the asynchronous content body for the corresponding id if the task is complete
     * or returns the status of the task.
     * After the task is completed, the result can be obtained for 5 minutes, or until an identical conversion request is made again, with allowCache query param set to false.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: If request specifies 'contentIdContext', 'View' permission for the space, and permission to view the content.
     *
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param id                   The asyncId of the macro task to get the converted body. (required)
     */
    @RequestLine("GET /wiki/rest/api/contentbody/convert/async/{id}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<AsyncContentBody> asyncConvertContentBodyResponse(@Param("id") @NotNull String id);

    /**
     * Bulk remove content states from content
     * <p>
     * Creates a long running task that Removes content state from draft or published versions of pages specified.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required** Content Edit Permission for a content to have its state removed via this endpoint.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param status               Set status to one of [current,draft]. (required)
     * @param bulkRemoveContentStatesRequest  (optional)
     */
    @RequestLine("POST /wiki/rest/api/content-states/delete?status={status}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<AsyncId> bulkRemoveContentStates(@Param("status") @NotNull String status, @Nullable BulkRemoveContentStatesRequest bulkRemoveContentStatesRequest);

    /**
     * Bulk set content state of many contents
     * <p>
     * Creates a long running task that sets content state of draft or published versions of pages specified.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required** Content Edit Permission for a content to have its state set via this endpoint.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param status               Set status to one of [current,draft]. (required)
     * @param bulkContentStateSetInput The content state and ids to set it to. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("PUT /wiki/rest/api/content-states?status={status}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<AsyncId> bulkSetContentStates(@Param("status") @NotNull String status, @NotNull BulkContentStateSetInput bulkContentStateSetInput);

    /**
     * Check content permissions
     * <p>
     * Check if a user or a group can perform an operation to the specified content. The {@code operation} to check must be provided. The user’s account ID or the ID of the group can be provided in the {@code subject} to check permissions against a specified user or group. The following permission checks are done to make sure that the user or group has the proper access:
     * - site permissions - space permissions - content restrictions
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) if checking permission for self, otherwise 'Confluence Administrator' global permission is required.
     *
     * Authentication - Required Scopes: [read:confluence-content.permission]
     * @param id                   The ID of the content to check permissions against. (required)
     * @param body                 The content permission request. (required)
     */
    @RequestLine("POST /wiki/rest/api/content/{id}/permission/check")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<PermissionCheckResponse> checkContentPermission(@Param("id") @NotNull String id, @NotNull ContentPermissionRequest body);

    /**
     * Convert content body
     * <p>
     * Converts a content body from one format to another format.
     * Supported conversions:
     * - storage: view, export_view, styled_view, editor - editor: storage - view: none - export_view: none - styled_view: none
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: If request specifies 'contentIdContext', 'View' permission for the space, and permission to view the content.
     *
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param to                   The name of the target format for the content body. (required)
     * @param body                 The content body to convert. (required)
     * @param spaceKeyContext      The space key used for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code spaceKeyContext=TEST} parameter is provided, then the link will be converted to a link to the "Example page" page in the "TEST" space. (optional)
     * @param contentIdContext     The content ID used to find the space for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code contentIdContext=123} parameter is provided, then the link will be converted to a link to the "Example page" page in the same space that has the content with ID=123. Note, {@code spaceKeyContext} will be ignored if this parameter is provided. (optional)
     * @param embeddedContentRender Mode used for rendering embedded content, like attachments.  - {@code current} renders the embedded content using the latest version. - {@code version-at-save} renders the embedded content using the version at the time of save. (optional, defaults to current)
     * @param expand               A multi-value parameter indicating which properties of the content to expand and populate. Expands are dependent on the {@code to} conversion format and may be irrelevant for certain conversions (e.g. {@code macroRenderedOutput} is redundant when converting to {@code view} format).   If rendering to {@code view} format, and the body content being converted includes arbitrary nested content (such as macros); then it is  necessary to include webresource expands in the request. Webresources for content body are the batched JS and CSS dependencies for any nested dynamic content (i.e. macros).  - {@code embeddedContent} returns metadata for nested content (e.g. page included using page include macro) - {@code mediaToken} returns JWT token for retrieving attachment data from Media API - {@code macroRenderedOutput} additionally converts body to view format - {@code webresource.superbatch.uris.js} returns all common JS dependencies as static URLs - {@code webresource.superbatch.uris.css} returns all common CSS dependencies as static URLs - {@code webresource.superbatch.uris.all} returns all common dependencies as static URLs - {@code webresource.superbatch.tags.all} returns all common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.superbatch.tags.css} returns all common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.superbatch.tags.js} returns all common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags - {@code webresource.uris.js} returns JS dependencies specific to conversion - {@code webresource.uris.css} returns CSS dependencies specific to conversion - {@code webresource.uris.all} returns all dependencies specific to conversion      - {@code webresource.tags.all} returns common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.tags.css} returns common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.tags.js} returns common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags (optional)
     */
    @RequestLine("POST /wiki/rest/api/contentbody/convert/{to}?spaceKeyContext={spaceKeyContext}&contentIdContext={contentIdContext}&embeddedContentRender={embeddedContentRender}&expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentBody> convertContentBody(@Param("to") @NotNull String to, @NotNull ContentBodyCreate body, @Param("spaceKeyContext") @Nullable String spaceKeyContext, @Param("contentIdContext") @Nullable String contentIdContext, @Param("embeddedContentRender") @Nullable String embeddedContentRender, @Param("expand") @Nullable List<String> expand);

    /**
     * Copy single page
     * <p>
     * Copies a single page and its associated properties, permissions, attachments, and custom contents.
     * The {@code id} path parameter refers to the content ID of the page to copy. The target of the page to be copied
     * is defined using the {@code destination} in the request body and can be one of the following types.
     * 
     * - {@code space}: page will be copied to the specified space as a root page on the space
     *  - {@code parent_page}: page will be copied as a child of the specified parent page
     *  - {@code existing_page}: page will be copied and replace the specified page
     * By default, the following objects are expanded: {@code space}, {@code history}, {@code version}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Add' permission for the space that the content will be copied in and permission to update the content if copying to an {@code existing_page}.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                    (required)
     * @param request              Request object from json post body (required)
     * @param expand               A multi-value parameter indicating which properties of the content to expand. Maximum sub-expansions allowed is {@code 8}.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment. (optional)
     */
    @RequestLine("POST /wiki/rest/api/content/{id}/copy?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json;charset=UTF-8"
    })
    CompletableFuture<Content> copyPage(@Param("id") @NotNull String id, @NotNull CopyPageRequest request, @Param("expand") @Nullable List<String> expand);

    /**
     * Copy page hierarchy
     * <p>
     * Copy page hierarchy allows the copying of an entire hierarchy of pages and their associated properties, permissions and attachments.
     * The id path parameter refers to the content id of the page to copy, and the new parent of this copied page is defined using the destinationPageId in the request body.
     * The titleOptions object defines the rules of renaming page titles during the copy;
     * for example, search and replace can be used in conjunction to rewrite the copied page titles.
     *  Response example:
     * &amp;lt;pre&amp;gt;&amp;lt;code&amp;gt;
     * {
     * 
     * 
     *  "id" : "1180606",
     * 
     * 
     *  "links" : {
     * 
     * 
     * 
     * 
     * 
     * "status" : "/rest/api/longtask/1180606"
     * 
     * 
     *  }
     * }
     * &amp;lt;/code&amp;gt;&amp;lt;/pre&amp;gt;
     * Use the /longtask/&amp;lt;taskId&amp;gt; REST API to get the copy task status.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                    (required)
     * @param request              Request object from json post body (required)
     */
    @RequestLine("POST /wiki/rest/api/content/{id}/pagehierarchy/copy")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<LongTask> copyPageHierarchy(@Param("id") @NotNull String id, @NotNull CopyPageHierarchyRequest request);

    /**
     * Create attachment
     * <p>
     * Adds an attachment to a piece of content. This method only adds a new attachment. If you want to update an existing attachment, use [Create or update attachments](#api-content-id-child-attachment-put).
     * Note, you must set a {@code X-Atlassian-Token: nocheck} header on the request for this method, otherwise it will be blocked. This protects against XSRF attacks, which is necessary as this method accepts multipart/form-data.
     * The media type 'multipart/form-data' is defined in [RFC 7578](https://www.ietf.org/rfc/rfc7578.txt). Most client libraries have classes that make it easier to implement multipart posts, like the [MultipartEntityBuilder](https://hc.apache.org/httpcomponents-client-5.1.x/current/httpclient5/apidocs/) Java class provided by Apache HTTP Components.
     * Note, according to [RFC 7578](https://tools.ietf.org/html/rfc7578#section-4.5), in the case where the form data is text, the charset parameter for the "text/plain" Content-Type may be used to indicate the character encoding used in that part. In the case of this API endpoint, the {@code comment} body parameter should be sent with {@code type=text/plain} and {@code charset=utf-8} values. This will force the charset to be UTF-8.
     * Example: This curl command attaches a file ('example.txt') to a container (id='123') with a comment and {@code minorEdits}=true.
     * {@code }` bash curl -D- \\
     *  -u admin:admin \\
     *  -X POST \\
     *  -H 'X-Atlassian-Token: nocheck' \\
     *  -F 'file=@"example.txt"' \\
     *  -F 'minorEdit="true"' \\
     *  -F 'comment="Example attachment comment"; type=text/plain; charset=utf-8' \\
     *  http://myhost/rest/api/content/123/child/attachment {@code }` **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-file]
     * @param id                   The ID of the content to add the attachment to. (required)
     * @param _file                The relative location and name of the attachment to be added to the content. (required)
     * @param minorEdit            If {@code minorEdits} is set to 'true', no notification email or activity stream will be generated when the attachment is added to the content. (required)
     * @param status               The status of the content that the attachment is being added to. (optional, defaults to current)
     * @param comment              The comment for the attachment that is being added. If you specify a comment, then every file must have a comment and the comments must be in the same order as the files. Alternatively, don't specify any comments. (optional)
     */
    @RequestLine("POST /wiki/rest/api/content/{id}/child/attachment?status={status}")
    @Headers({
        "Content-Type: multipart/form-data", 
        "Accept: application/json"
    })
    CompletableFuture<ContentArray> createAttachment(@Param("id") @NotNull String id, @Param("file") @NotNull File _file, @Param("minorEdit") @NotNull File minorEdit, @Param("status") @Nullable String status, @Param("comment") @Nullable File comment);

    /**
     * Create audit record
     * <p>
     * Creates a record in the audit log.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission.
     *
     * Authentication - Required Scopes: [read:audit-log:confluence, write:audit-log:confluence]
     * @param body                 The record to be created in the audit log. (required)
     */
    @RequestLine("POST /wiki/rest/api/audit")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<AuditRecord> createAuditRecord(@NotNull AuditRecordCreate body);

    /**
     * Create content
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Creates a new piece of content or publishes an existing draft.
     * To publish a draft, add the {@code id} and {@code status} properties to the body of the request. Set the {@code id} to the ID of the draft and set the {@code status} to 'current'. When the request is sent, a new piece of content will be created and the metadata from the draft will be transferred into it.
     * By default, the following objects are expanded: {@code space}, {@code history}, {@code version}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Add' permission for the space that the content will be created in, and permission to view the draft if publishing a draft.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param content              The new content to be created. Set the {@code representation} to the name of the body format type. For example, if you use {@code storage} for the body format, set '{@code representation}={@code storage}'. See [Confluence storage format](https://confluence.atlassian.com/x/AJkiLw).  If you are not sure how to generate the different formats, you can create a page in the Confluence application, retrieve the content using [Get content](#api-content-get), and expand the desired content format, e.g. {@code expand=body.storage}. (required)
     * @param status               Filter the returned content by status. (optional, defaults to current)
     * @param expand               A multi-value parameter indicating which properties of the content to expand. Maximum sub-expansions allowed is {@code 8}.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("POST /wiki/rest/api/content?status={status}&expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Content> createContent(@NotNull ContentCreate content, @Param("status") @Nullable String status, @Param("expand") @Nullable List<String> expand);

    /**
     * Create content property
     * <p>
     * Creates a property for an existing piece of content. For more information about content properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/).
     * This is the same as [Create content property for key](#api-content-id-property-key-post) except that the key is specified in the request body instead of as a path parameter.
     * Content properties can also be added when creating a new piece of content by including them in the {@code metadata.properties} of the request.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-props]
     * @param id                   The ID of the content to add the property to. (required)
     * @param body                 The content property to be created. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("POST /wiki/rest/api/content/{id}/property")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> createContentProperty(@Param("id") @NotNull String id, @NotNull ContentPropertyCreate body);

    /**
     * Create content property for key
     * <p>
     * Creates a property for an existing piece of content. For more information about content properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/).
     * This is the same as [Create content property](#api-content-id-property-post) except that the key is specified as a path parameter instead of in the request body.
     * Content properties can also be added when creating a new piece of content by including them in the {@code metadata.properties} of the request.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-props]
     * @param id                   The ID of the content to add the property to. (required)
     * @param key                  The key of the content property. Required. (required)
     * @param body                 The content property to be created. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("POST /wiki/rest/api/content/{id}/property/{key}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> createContentPropertyForKey(@Param("id") @NotNull String id, @Param("key") @NotNull String key, @NotNull ContentPropertyCreateNoKey body);

    /**
     * Create content template
     * <p>
     * Creates a new content template. Note, blueprint templates cannot be created via the REST API.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space to create a space template or 'Confluence Administrator' global permission to create a global template.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param body                 The content template to be created. The content body must be in 'storage' format. (required)
     */
    @RequestLine("POST /wiki/rest/api/template")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentTemplate> createContentTemplate(@NotNull ContentTemplateCreate body);

    /**
     * Create new user group
     * <p>
     * Creates a new user group.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: User must be a site admin.
     *
     * Authentication - Required Scopes: [write:confluence-groups]
     * @param body                 Name of the group that is to be created. (required)
     */
    @RequestLine("POST /wiki/rest/api/group")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Group> createGroup(@NotNull GroupName body);

    /**
     * Create or update attachment
     * <p>
     * Adds an attachment to a piece of content. If the attachment already exists for the content, then the attachment is updated (i.e. a new version of the attachment is created).
     * Note, you must set a {@code X-Atlassian-Token: nocheck} header on the request for this method, otherwise it will be blocked. This protects against XSRF attacks, which is necessary as this method accepts multipart/form-data.
     * The media type 'multipart/form-data' is defined in [RFC 7578](https://www.ietf.org/rfc/rfc7578.txt). Most client libraries have classes that make it easier to implement multipart posts, like the [MultipartEntityBuilder](https://hc.apache.org/httpcomponents-client-5.1.x/current/httpclient5/apidocs/) Java class provided by Apache HTTP Components.
     * Note, according to [RFC 7578](https://tools.ietf.org/html/rfc7578#section-4.5), in the case where the form data is text, the charset parameter for the "text/plain" Content-Type may be used to indicate the character encoding used in that part. In the case of this API endpoint, the {@code comment} body parameter should be sent with {@code type=text/plain} and {@code charset=utf-8} values. This will force the charset to be UTF-8.
     * Example: This curl command attaches a file ('example.txt') to a piece of content (id='123') with a comment and {@code minorEdits}=true. If the 'example.txt' file already exists, it will update it with a new version of the attachment.
     * {@code }` bash curl -D- \\
     *  -u admin:admin \\
     *  -X PUT \\
     *  -H 'X-Atlassian-Token: nocheck' \\
     *  -F 'file=@"example.txt"' \\
     *  -F 'minorEdit="true"' \\
     *  -F 'comment="Example attachment comment"; type=text/plain; charset=utf-8' \\
     *  http://myhost/rest/api/content/123/child/attachment {@code }` **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-file]
     * @param id                   The ID of the content to add the attachment to. (required)
     * @param _file                The relative location and name of the attachment to be added to the content. (required)
     * @param minorEdit            If {@code minorEdits} is set to 'true', no notification email or activity stream will be generated when the attachment is added to the content. (required)
     * @param status               The status of the content that the attachment is being added to. This should always be set to 'current'. (optional, defaults to current)
     * @param comment              The comment for the attachment that is being added. If you specify a comment, then every file must have a comment and the comments must be in the same order as the files. Alternatively, don't specify any comments. (optional)
     */
    @RequestLine("PUT /wiki/rest/api/content/{id}/child/attachment?status={status}")
    @Headers({
        "Content-Type: multipart/form-data", 
        "Accept: application/json"
    })
    CompletableFuture<ContentArray> createOrUpdateAttachments(@Param("id") @NotNull String id, @Param("file") @NotNull File _file, @Param("minorEdit") @NotNull File minorEdit, @Param("status") @Nullable String status, @Param("comment") @Nullable File comment);

    /**
     * Create private space
     * <p>
     * Creates a new space that is only visible to the creator. This method is the same as the [Create space](#api-space-post) method with permissions set to the current user only. Note, currently you cannot set space labels when creating a space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Create Space(s)' global permission.
     *
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spacePrivateCreate   The space to be created. (required)
     */
    @RequestLine("POST /wiki/rest/api/space/_private")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Space> createPrivateSpace(@NotNull SpaceCreate spacePrivateCreate);

    /**
     * Create relationship
     * <p>
     * Creates a relationship between two entities (user, space, content). The 'favourite' relationship is supported by default, but you can use this method to create any type of relationship between two entities.
     * For example, the following method creates a 'sibling' relationship between two pieces of content: {@code GET /wiki/rest/api/relation/sibling/from/content/123/to/content/456}
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param relationName         The name of the relationship. This method supports the 'favourite' (i.e. 'save for later') relationship. You can also specify any other value for this parameter to create a custom relationship type. (required)
     * @param sourceType           The source entity type of the relationship. This must be 'user', if the {@code relationName} is 'favourite'. (required)
     * @param sourceKey            - The identifier for the source entity:  - If {@code sourceType} is 'user', then specify either 'current' (logged-in   user) or the user key. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key. (required)
     * @param targetType           The target entity type of the relationship. This must be 'space' or 'content', if the {@code relationName} is 'favourite'. (required)
     * @param targetKey            - The identifier for the target entity:  - If {@code sourceType} is 'user', then specify either 'current' (logged-in   user) or the user key. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key. (required)
     * @param sourceStatus         The status of the source. This parameter is only used when the {@code sourceType} is 'content'. (optional)
     * @param targetStatus         The status of the target. This parameter is only used when the {@code targetType} is 'content'. (optional)
     * @param sourceVersion        The version of the source. This parameter is only used when the {@code sourceType} is 'content' and the {@code sourceStatus} is 'historical'. (optional)
     * @param targetVersion        The version of the target. This parameter is only used when the {@code targetType} is 'content' and the {@code targetStatus} is 'historical'. (optional)
     */
    @RequestLine("PUT /wiki/rest/api/relation/{relationName}/from/{sourceType}/{sourceKey}/to/{targetType}/{targetKey}?sourceStatus={sourceStatus}&targetStatus={targetStatus}&sourceVersion={sourceVersion}&targetVersion={targetVersion}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Relation> createRelationship(@Param("relationName") @NotNull String relationName, @Param("sourceType") @NotNull String sourceType, @Param("sourceKey") @NotNull String sourceKey, @Param("targetType") @NotNull String targetType, @Param("targetKey") @NotNull String targetKey, @Param("sourceStatus") @Nullable String sourceStatus, @Param("targetStatus") @Nullable String targetStatus, @Param("sourceVersion") @Nullable Integer sourceVersion, @Param("targetVersion") @Nullable Integer targetVersion);

    /**
     * Create space
     * <p>
     * Creates a new space. Note, currently you cannot set space labels when creating a space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Create Space(s)' global permission.
     *
     * Authentication - Required Scopes: [write:confluence-space]
     * @param body                 The space to be created. (required)
     */
    @RequestLine("POST /wiki/rest/api/space")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Space> createSpace(@NotNull SpaceCreate body);

    /**
     * Create space property
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Creates a new space property.
     * **[Permissions required](https://confluence.atlassian.com/x/_AozKw)**: ‘Admin’ permission for the space.
     *
     * Authentication - Required Scopes: [write:confluence-props]
     * @param spaceKey             The key of the space that the property will be created in. (required)
     * @param body                 The space property to be created. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("POST /wiki/rest/api/space/{spaceKey}/property")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<SpaceProperty> createSpaceProperty(@Param("spaceKey") @NotNull String spaceKey, @NotNull SpacePropertyCreate body);

    /**
     * Create space property for key
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Creates a new space property. This is the same as {@code POST /wiki/rest/api/space/{spaceKey}/property} but the key for the property is passed as a path parameter, rather than in the request body.
     * **[Permissions required](https://confluence.atlassian.com/x/_AozKw)**: ‘Admin’ permission for the space.
     *
     * Authentication - Required Scopes: [write:confluence-props]
     * @param spaceKey             The key of the space that the property will be created in. (required)
     * @param key                  The key of the property to be created. (required)
     * @param body                 The space property to be created. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("POST /wiki/rest/api/space/{spaceKey}/property/{key}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<SpaceProperty> createSpacePropertyForKey(@Param("spaceKey") @NotNull String spaceKey, @Param("key") @NotNull String key, @NotNull SpacePropertyCreateNoKey body);

    /**
     * Create user property by key
     * <p>
     * Creates a property for a user. For more information
     * about user properties, see [Confluence entity properties] (https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/). {@code Note}, these properties stored against a user are on a Confluence site level and not space/content level.
     * {@code Note:} the number of properties which could be created per app in a tenant for each user might be restricted by fixed system limits. **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [write:user.property:confluence]
     * @param userId               The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192 (required)
     * @param key                  The key of the user property. (required)
     * @param body                 The user property to be created. (required)
     */
    @RequestLine("POST /wiki/rest/api/user/{userId}/property/{key}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Void> createUserProperty(@Param("userId") @NotNull String userId, @Param("key") @NotNull String key, @NotNull UserPropertyCreate body);

    /**
     * Delete content
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Moves a piece of content to the space's trash or purges it from the trash, depending on the content's type and status:
     * - If the content's type is {@code page},{@code blogpost}, or {@code attachment} and its status is {@code current}, it will be trashed. - If the content's type is {@code page},{@code blogpost}, or {@code attachment} and its status is {@code trashed}, the content will be purged from the trash and deleted permanently. Note, you must also set the {@code status} query parameter to {@code trashed} in your request. - If the content's type is {@code comment}, it will be deleted permanently without being trashed.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Delete' permission for the space that the content is in.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content to be deleted. (required)
     * @param status               Set this to {@code trashed}, if the content's status is {@code trashed} and you want to purge it. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("DELETE /wiki/rest/api/content/{id}?status={status}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteContent(@Param("id") @NotNull String id, @Param("status") @Nullable String status);

    /**
     * Delete content property
     * <p>
     * Deletes a content property. For more information about content properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-props]
     * @param id                   The ID of the content that the property belongs to. (required)
     * @param key                  The key of the property. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("DELETE /wiki/rest/api/content/{id}/property/{key}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteContentProperty(@Param("id") @NotNull String id, @Param("key") @NotNull String key);

    /**
     * Delete content version
     * <p>
     * Delete a historical version. This does not delete the changes made to the content in that version, rather the changes for the deleted version are rolled up into the next version. Note, you cannot delete the current version.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content that the version will be deleted from. (required)
     * @param versionNumber        The number of the version to be deleted. The version number starts from 1 up to current version. (required)
     */
    @RequestLine("DELETE /wiki/rest/api/content/{id}/version/{versionNumber}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteContentVersion(@Param("id") @NotNull String id, @Param("versionNumber") @NotNull Integer versionNumber);

    /**
     * Remove label from a space
     * <p>
     * Removes a label from a space.
     *  Note:
     * - Either {@code name} or {@code labelId} must be provided.
     *
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spaceKey             The key of the space to remove a labels from. (required)
     * @param name                 The name of the label to remove (optional)
     * @param labelId              The ID of the label to remove (optional)
     * @param prefix               The prefix of the label to remove. If not provided defaults to global. (optional)
     */
    @RequestLine("DELETE /wiki/rest/api/space/{spaceKey}/label?name={name}&labelId={labelId}&prefix={prefix}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteLabelFromSpace(@Param("spaceKey") @NotNull String spaceKey, @Param("name") @Nullable String name, @Param("labelId") @Nullable Integer labelId, @Param("prefix") @Nullable String prefix);

    /**
     * Delete page tree
     * <p>
     * Moves a pagetree rooted at a page to the space's trash:
     * - If the content's type is {@code page} and its status is {@code current}, it will be trashed including all its descendants. - For every other combination of content type and status, this API is not supported.
     * This API accepts the pageTree delete request and returns a task ID. The delete process happens asynchronously.
     *  Response example:
     * &amp;lt;pre&amp;gt;&amp;lt;code&amp;gt;
     * {
     * 
     * 
     *  "id" : "1180606",
     * 
     * 
     *  "links" : {
     * 
     * 
     * 
     * 
     * 
     * "status" : "/rest/api/longtask/1180606"
     * 
     * 
     *  }
     * }
     * &amp;lt;/code&amp;gt;&amp;lt;/pre&amp;gt;
     * Use the {@code /longtask/&amp;lt;taskId&amp;gt;} REST API to get the copy task status.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Delete' permission for the space that the content is in.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content which forms root of the page tree, to be deleted. (required)
     */
    @RequestLine("DELETE /wiki/rest/api/content/{id}/pageTree")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<LongTask> deletePageTree(@Param("id") @NotNull String id);

    /**
     * Delete relationship
     * <p>
     * Deletes a relationship between two entities (user, space, content).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). For favourite relationships, the current user can only delete their own favourite relationships. A space administrator can delete favourite relationships for any user.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param relationName         The name of the relationship. (required)
     * @param sourceType           The source entity type of the relationship. This must be 'user', if the {@code relationName} is 'favourite'. (required)
     * @param sourceKey            - The identifier for the source entity:  - If {@code sourceType} is 'user', then specify either 'current' (logged-in   user) or the user key. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key. (required)
     * @param targetType           The target entity type of the relationship. This must be 'space' or 'content', if the {@code relationName} is 'favourite'. (required)
     * @param targetKey            - The identifier for the target entity:  - If {@code sourceType} is 'user', then specify either 'current' (logged-in   user) or the user key. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key. (required)
     * @param sourceStatus         The status of the source. This parameter is only used when the {@code sourceType} is 'content'. (optional)
     * @param targetStatus         The status of the target. This parameter is only used when the {@code targetType} is 'content'. (optional)
     * @param sourceVersion        The version of the source. This parameter is only used when the {@code sourceType} is 'content' and the {@code sourceStatus} is 'historical'. (optional)
     * @param targetVersion        The version of the target. This parameter is only used when the {@code targetType} is 'content' and the {@code targetStatus} is 'historical'. (optional)
     */
    @RequestLine("DELETE /wiki/rest/api/relation/{relationName}/from/{sourceType}/{sourceKey}/to/{targetType}/{targetKey}?sourceStatus={sourceStatus}&targetStatus={targetStatus}&sourceVersion={sourceVersion}&targetVersion={targetVersion}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteRelationship(@Param("relationName") @NotNull String relationName, @Param("sourceType") @NotNull String sourceType, @Param("sourceKey") @NotNull String sourceKey, @Param("targetType") @NotNull String targetType, @Param("targetKey") @NotNull String targetKey, @Param("sourceStatus") @Nullable String sourceStatus, @Param("targetStatus") @Nullable String targetStatus, @Param("sourceVersion") @Nullable Integer sourceVersion, @Param("targetVersion") @Nullable Integer targetVersion);

    /**
     * Delete restrictions
     * <p>
     * Removes all restrictions (read and update) on a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content to remove restrictions from. (required)
     * @param expand               A multi-value parameter indicating which properties of the content restrictions (returned in response) to expand.  - {@code restrictions.user} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code content} returns the piece of content that the restrictions are applied to. (optional)
     */
    @RequestLine("DELETE /wiki/rest/api/content/{id}/restriction?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentRestrictionArray> deleteRestrictions(@Param("id") @NotNull String id, @Param("expand") @Nullable List<String> expand);

    /**
     * Delete space
     * <p>
     * Deletes a space. Note, the space will be deleted in a long running task. Therefore, the space may not be deleted yet when this method has returned. Clients should poll the status link that is returned in the response until the task completes.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spaceKey             The key of the space to delete. (required)
     */
    @RequestLine("DELETE /wiki/rest/api/space/{spaceKey}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<LongTask> deleteSpace(@Param("spaceKey") @NotNull String spaceKey);

    /**
     * Delete space property
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Deletes a space property.
     * **[Permissions required](https://confluence.atlassian.com/x/_AozKw)**: ‘Admin’ permission for the space.
     *
     * Authentication - Required Scopes: [write:confluence-props]
     * @param spaceKey             The key of the space that the property is in. (required)
     * @param key                  The key of the property to be deleted. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("DELETE /wiki/rest/api/space/{spaceKey}/property/{key}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteSpaceProperty(@Param("spaceKey") @NotNull String spaceKey, @Param("key") @NotNull String key);

    /**
     * Delete user property
     * <p>
     * Deletes a property for the given user. For more information about user properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/). {@code Note}, these properties stored against a user are on a Confluence site level and not space/content level.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [write:user.property:confluence]
     * @param userId               The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192 (required)
     * @param key                  The key of the user property. (required)
     */
    @RequestLine("DELETE /wiki/rest/api/user/{userId}/property/{key}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteUserProperty(@Param("userId") @NotNull String userId, @Param("key") @NotNull String key);

    /**
     * Get URI to download attachment
     * <p>
     * Redirects the client to a URL that serves an attachment's binary data.
     *
     * Authentication - Required Scopes: [readonly:content.attachment:confluence]
     * @param id                   The ID of the content that the attachment is attached to. (required)
     * @param attachmentId         The ID of the attachment to download. (required)
     * @param version              The version of the attachment. If this parameter is absent, the redirect URI will download the latest version of the attachment. (optional)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/child/attachment/{attachmentId}/download?version={version}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> downloadAttatchment(@Param("id") @NotNull String id, @Param("attachmentId") @NotNull String attachmentId, @Param("version") @Nullable Integer version);

    /**
     * Export audit records
     * <p>
     * Exports audit records as a CSV file or ZIP file.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission.
     *
     * Authentication - Required Scopes: [read:audit-log:confluence]
     * @param startDate            Filters the exported results to the records on or after the {@code startDate}. The {@code startDate} must be specified as [epoch time](https://www.epochconverter.com/) in milliseconds. (optional)
     * @param endDate              Filters the exported results to the records on or before the {@code endDate}. The {@code endDate} must be specified as [epoch time](https://www.epochconverter.com/) in milliseconds. (optional)
     * @param searchString         Filters the exported results to records that have string property values matching the {@code searchString}. (optional)
     * @param format               The format of the export file for the audit records. (optional, defaults to csv)
     */
    @RequestLine("GET /wiki/rest/api/audit/export?startDate={startDate}&endDate={endDate}&searchString={searchString}&format={format}")
    @Headers({
        "Accept: application/zip"
    })
    CompletableFuture<File> exportAuditRecords(@Param("startDate") @Nullable String startDate, @Param("endDate") @Nullable String endDate, @Param("searchString") @Nullable String searchString, @Param("format") @Nullable String format);

    /**
     * Find source entities related to a target entity
     * <p>
     * Returns all target entities that have a particular relationship to the source entity. Note, relationships are one way.
     * For example, the following method finds all users that have a 'collaborator' relationship to a piece of content with an ID of '1234': {@code GET /wiki/rest/api/relation/collaborator/to/content/1234/from/user} Note, 'collaborator' is an example custom relationship type.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view both the target entity and source entity.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param relationName         The name of the relationship. This method supports relationships created via [Create relationship](#api-wiki-rest-api-relation-relationname-from-sourcetype-sourcekey-to-targettype-targetkey-put). Note, this method does not support 'like' or 'favourite' relationships. (required)
     * @param sourceType           The source entity type of the relationship. (required)
     * @param targetType           The target entity type of the relationship. (required)
     * @param targetKey            The identifier for the target entity:  - If {@code targetType} is {@code user}, then specify either {@code current} (logged-in user), the user key of the user, or the account ID of the user. Note that the user key has been deprecated in favor of the account ID for this parameter. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. - If {@code targetType} is 'content', then specify the content ID. - If {@code targetType} is 'space', then specify the space key. (required)
     * @param sourceStatus         The status of the source. This parameter is only used when the {@code sourceType} is 'content'. (optional)
     * @param targetStatus         The status of the target. This parameter is only used when the {@code targetType} is 'content'. (optional)
     * @param sourceVersion        The version of the source. This parameter is only used when the {@code sourceType} is 'content' and the {@code sourceStatus} is 'historical'. (optional)
     * @param targetVersion        The version of the target. This parameter is only used when the {@code targetType} is 'content' and the {@code targetStatus} is 'historical'. (optional)
     * @param expand               A multi-value parameter indicating which properties of the response object to expand.  - {@code relationData} returns information about the relationship, such as who created it and when it was created. - {@code source} returns the source entity. - {@code target} returns the target entity. (optional)
     * @param start                The starting index of the returned relationships. (optional, defaults to 0)
     * @param limit                The maximum number of relationships to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     */
    @RequestLine("GET /wiki/rest/api/relation/{relationName}/to/{targetType}/{targetKey}/from/{sourceType}?sourceStatus={sourceStatus}&targetStatus={targetStatus}&sourceVersion={sourceVersion}&targetVersion={targetVersion}&expand={expand}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<RelationArray> findSourcesForTarget(@Param("relationName") @NotNull String relationName, @Param("sourceType") @NotNull String sourceType, @Param("targetType") @NotNull String targetType, @Param("targetKey") @NotNull String targetKey, @Param("sourceStatus") @Nullable String sourceStatus, @Param("targetStatus") @Nullable String targetStatus, @Param("sourceVersion") @Nullable Integer sourceVersion, @Param("targetVersion") @Nullable Integer targetVersion, @Param("expand") @Nullable List<String> expand, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Find target entities related to a source entity
     * <p>
     * Returns all target entities that have a particular relationship to the source entity. Note, relationships are one way.
     * For example, the following method finds all content that the current user has an 'ignore' relationship with: {@code GET /wiki/rest/api/relation/ignore/from/user/current/to/content} Note, 'ignore' is an example custom relationship type.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view both the target entity and source entity.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param relationName         The name of the relationship. This method supports relationships created via [Create relationship](#api-wiki-rest-api-relation-relationname-from-sourcetype-sourcekey-to-targettype-targetkey-put). Note, this method does not support 'like' or 'favourite' relationships. (required)
     * @param sourceType           The source entity type of the relationship. (required)
     * @param sourceKey            The identifier for the source entity:  - If {@code sourceType} is {@code user}, then specify either {@code current} (logged-in user), the user key of the user, or the account ID of the user. Note that the user key has been deprecated in favor of the account ID for this parameter. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key. (required)
     * @param targetType           The target entity type of the relationship. (required)
     * @param sourceStatus         The status of the source. This parameter is only used when the {@code sourceType} is 'content'. (optional)
     * @param targetStatus         The status of the target. This parameter is only used when the {@code targetType} is 'content'. (optional)
     * @param sourceVersion        The version of the source. This parameter is only used when the {@code sourceType} is 'content' and the {@code sourceStatus} is 'historical'. (optional)
     * @param targetVersion        The version of the target. This parameter is only used when the {@code targetType} is 'content' and the {@code targetStatus} is 'historical'. (optional)
     * @param expand               A multi-value parameter indicating which properties of the response object to expand.  - {@code relationData} returns information about the relationship, such as who created it and when it was created. - {@code source} returns the source entity. - {@code target} returns the target entity. (optional)
     * @param start                The starting index of the returned relationships. (optional, defaults to 0)
     * @param limit                The maximum number of relationships to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     */
    @RequestLine("GET /wiki/rest/api/relation/{relationName}/from/{sourceType}/{sourceKey}/to/{targetType}?sourceStatus={sourceStatus}&targetStatus={targetStatus}&sourceVersion={sourceVersion}&targetVersion={targetVersion}&expand={expand}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<RelationArray> findTargetFromSource(@Param("relationName") @NotNull String relationName, @Param("sourceType") @NotNull String sourceType, @Param("sourceKey") @NotNull String sourceKey, @Param("targetType") @NotNull String targetType, @Param("sourceStatus") @Nullable String sourceStatus, @Param("targetStatus") @Nullable String targetStatus, @Param("sourceVersion") @Nullable Integer sourceVersion, @Param("targetVersion") @Nullable Integer targetVersion, @Param("expand") @Nullable List<String> expand, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get label information
     * <p>
     * Returns label information and a list of contents associated with the label.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only contents that the user is permitted to view is returned.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param name                 Name of the label to query. (required)
     * @param type                 The type of contents that are to be returned. (optional)
     * @param start                The starting offset for the results. (optional, defaults to 0)
     * @param limit                The number of results to be returned. (optional, defaults to 200)
     */
    @RequestLine("GET /wiki/rest/api/label?name={name}&type={type}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<LabelDetails> getAllLabelContent(@Param("name") @NotNull String name, @Param("type") @Nullable String type, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get macro body by macro ID and convert representation Asynchronously
     * <p>
     * Returns Async Id of the conversion task which will convert the macro into a content body of the desired format. The result will be available for 5 minutes after completion of the conversion.
     * About the macro ID: When a macro is created in a new version of content, Confluence will generate a random ID for it, unless an ID is specified (by an app). The macro ID will look similar to this: '884bd9-0cb8-41d5-98be-f80943c14f96'. The ID is then persisted as new versions of content are created, and is only modified by Confluence if there are conflicting IDs.
     * Note, to preserve backwards compatibility this resource will also match on the hash of the macro body, even if a macro ID is found. This check will eventually become redundant, as macro IDs are generated for pages and transparently propagate out to all instances.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content that the macro is in.
     *
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param id                   The ID for the content that contains the macro. (required)
     * @param version              The version of the content that contains the macro. Specifying {@code 0} as the {@code version} will return the macro body for the latest content version. (required)
     * @param macroId              The ID of the macro. For apps, this is passed to the macro by the Connect/Forge framework. Otherwise, find the macro ID by querying the desired content and version, then expanding the body in storage format. For example, '/content/196611/version/7?expand=content.body.storage'. (required)
     * @param to                   The content representation to return the macro in. Currently, the following conversions are allowed:  - {@code export_view} - {@code styled_view} - {@code view} (required)
     * @param expand               A multi-value parameter indicating which properties of the content to expand and populate. Expands are dependent on the {@code to} conversion format and may be irrelevant for certain conversions (e.g. {@code macroRenderedOutput} is redundant when converting to {@code view} format).   If rendering to {@code view} format, and the body content being converted includes arbitrary nested content (such as macros); then it is  necessary to include webresource expands in the request. Webresources for content body are the batched JS and CSS dependencies for any nested dynamic content (i.e. macros).  - {@code embeddedContent} returns metadata for nested content (e.g. page included using page include macro) - {@code mediaToken} returns JWT token for retrieving attachment data from Media API - {@code macroRenderedOutput} additionally converts body to view format - {@code webresource.superbatch.uris.js} returns all common JS dependencies as static URLs - {@code webresource.superbatch.uris.css} returns all common CSS dependencies as static URLs - {@code webresource.superbatch.uris.all} returns all common dependencies as static URLs - {@code webresource.superbatch.tags.all} returns all common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.superbatch.tags.css} returns all common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.superbatch.tags.js} returns all common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags - {@code webresource.uris.js} returns JS dependencies specific to conversion - {@code webresource.uris.css} returns CSS dependencies specific to conversion - {@code webresource.uris.all} returns all dependencies specific to conversion      - {@code webresource.tags.all} returns common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.tags.css} returns common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.tags.js} returns common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags (optional)
     * @param allowCache           If this field is false, the cache will erase its current value and begin a conversion. If this field is true, the cache will not erase its current value, and will set the status of the result in cache to RERUNNING. Once the data is updated, the status will change to COMPLETED.  Large macros that take long to convert, and who want to show intermediate, but potentially stale data, immediately should set this field to true. Cache values are stored per macro per user per content and expansions. (optional, defaults to false)
     * @param spaceKeyContext      The space key used for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code spaceKeyContext=TEST} parameter is provided, then the link will be converted to a link to the "Example page" page in the "TEST" space. (optional)
     * @param embeddedContentRender Mode used for rendering embedded content, like attachments.  - {@code current} renders the embedded content using the latest version. - {@code version-at-save} renders the embedded content using the version at the time of save. (optional, defaults to current)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/history/{version}/macro/id/{macroId}/convert/async/{to}?expand={expand}&allowCache={allowCache}&spaceKeyContext={spaceKeyContext}&embeddedContentRender={embeddedContentRender}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<AsyncId> getAndAsyncConvertMacroBodyByMacroId(@Param("id") @NotNull String id, @Param("version") @NotNull Integer version, @Param("macroId") @NotNull String macroId, @Param("to") @NotNull String to, @Param("expand") @Nullable List<String> expand, @Param("allowCache") @Nullable Boolean allowCache, @Param("spaceKeyContext") @Nullable String spaceKeyContext, @Param("embeddedContentRender") @Nullable String embeddedContentRender);

    /**
     * Get macro body by macro ID and convert the representation synchronously
     * <p>
     * Returns the body of a macro in format specified in path, for the given macro ID. This includes information like the name of the macro, the body of the macro, and any macro parameters.
     * About the macro ID: When a macro is created in a new version of content, Confluence will generate a random ID for it, unless an ID is specified (by an app). The macro ID will look similar to this: '50884bd9-0cb8-41d5-98be-f80943c14f96'. The ID is then persisted as new versions of content are created, and is only modified by Confluence if there are conflicting IDs.
     * Note, to preserve backwards compatibility this resource will also match on the hash of the macro body, even if a macro ID is found. This check will eventually become redundant, as macro IDs are generated for pages and transparently propagate out to all instances.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content that the macro is in.
     *
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param id                   The ID for the content that contains the macro. (required)
     * @param version              The version of the content that contains the macro. Specifying {@code 0} as the {@code version} will return the macro body for the latest content version. (required)
     * @param macroId              The ID of the macro. This is usually passed by the app that the macro is in. Otherwise, find the macro ID by querying the desired content and version, then expanding the body in storage format. For example, '/content/196611/version/7?expand=content.body.storage'. (required)
     * @param to                   The content representation to return the macro in. (required)
     * @param expand               A multi-value parameter indicating which properties of the content to expand and populate. Expands are dependent on the {@code to} conversion format and may be irrelevant for certain conversions (e.g. {@code macroRenderedOutput} is redundant when converting to {@code view} format).   If rendering to {@code view} format, and the body content being converted includes arbitrary nested content (such as macros); then it is  necessary to include webresource expands in the request. Webresources for content body are the batched JS and CSS dependencies for any nested dynamic content (i.e. macros).  - {@code embeddedContent} returns metadata for nested content (e.g. page included using page include macro) - {@code mediaToken} returns JWT token for retrieving attachment data from Media API - {@code macroRenderedOutput} additionally converts body to view format - {@code webresource.superbatch.uris.js} returns all common JS dependencies as static URLs - {@code webresource.superbatch.uris.css} returns all common CSS dependencies as static URLs - {@code webresource.superbatch.uris.all} returns all common dependencies as static URLs - {@code webresource.superbatch.tags.all} returns all common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.superbatch.tags.css} returns all common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.superbatch.tags.js} returns all common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags - {@code webresource.uris.js} returns JS dependencies specific to conversion - {@code webresource.uris.css} returns CSS dependencies specific to conversion - {@code webresource.uris.all} returns all dependencies specific to conversion      - {@code webresource.tags.all} returns common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.tags.css} returns common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.tags.js} returns common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags (optional)
     * @param spaceKeyContext      The space key used for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code spaceKeyContext=TEST} parameter is provided, then the link will be converted to a link to the "Example page" page in the "TEST" space. (optional)
     * @param embeddedContentRender Mode used for rendering embedded content, like attachments.  - {@code current} renders the embedded content using the latest version. - {@code version-at-save} renders the embedded content using the version at the time of save. (optional, defaults to current)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/history/{version}/macro/id/{macroId}/convert/{to}?expand={expand}&spaceKeyContext={spaceKeyContext}&embeddedContentRender={embeddedContentRender}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentBody> getAndConvertMacroBodyByMacroId(@Param("id") @NotNull String id, @Param("version") @NotNull Integer version, @Param("macroId") @NotNull String macroId, @Param("to") @NotNull String to, @Param("expand") @Nullable List<String> expand, @Param("spaceKeyContext") @Nullable String spaceKeyContext, @Param("embeddedContentRender") @Nullable String embeddedContentRender);

    /**
     * Get anonymous user
     * <p>
     * Returns information about how anonymous users are represented, like the profile picture and display name.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-user]
     * @param expand               A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do. (optional)
     */
    @RequestLine("GET /wiki/rest/api/user/anonymous?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<UserAnonymous> getAnonymousUser(@Param("expand") @Nullable List<String> expand);

    /**
     * Get attachments
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns the attachments for a piece of content.
     * By default, the following objects are expanded: {@code metadata}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content. If the content is a blog post, 'View' permission for the space is required.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param id                   The ID of the content to be queried for its attachments. (required)
     * @param expand               A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment. (optional)
     * @param start                The starting index of the returned attachments. (optional, defaults to 0)
     * @param limit                The maximum number of attachments to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     * @param filename             Filter the results to attachments that match the filename. (optional)
     * @param mediaType            Filter the results to attachments that match the media type. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/content/{id}/child/attachment?expand={expand}&start={start}&limit={limit}&filename={filename}&mediaType={mediaType}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentArray> getAttachments(@Param("id") @NotNull String id, @Param("expand") @Nullable List<String> expand, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit, @Param("filename") @Nullable String filename, @Param("mediaType") @Nullable String mediaType);

    /**
     * Get audit records
     * <p>
     * Returns all records in the audit log, optionally for a certain date range. This contains information about events like space exports, group membership changes, app installations, etc. For more information, see [Audit log](https://confluence.atlassian.com/confcloud/audit-log-802164269.html) in the Confluence administrator's guide.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission.
     *
     * Authentication - Required Scopes: [read:audit-log:confluence]
     * @param startDate            Filters the results to the records on or after the {@code startDate}. The {@code startDate} must be specified as [epoch time](https://www.epochconverter.com/) in milliseconds. (optional)
     * @param endDate              Filters the results to the records on or before the {@code endDate}. The {@code endDate} must be specified as [epoch time](https://www.epochconverter.com/) in milliseconds. (optional)
     * @param searchString         Filters the results to records that have string property values matching the {@code searchString}. (optional)
     * @param start                The starting index of the returned records. (optional, defaults to 0)
     * @param limit                The maximum number of records to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 1000)
     */
    @RequestLine("GET /wiki/rest/api/audit?startDate={startDate}&endDate={endDate}&searchString={searchString}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<AuditRecordArray> getAuditRecords(@Param("startDate") @Nullable String startDate, @Param("endDate") @Nullable String endDate, @Param("searchString") @Nullable String searchString, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get audit records for time period
     * <p>
     * Returns records from the audit log, for a time period back from the current date. For example, you can use this method to get the last 3 months of records.
     * This contains information about events like space exports, group membership changes, app installations, etc. For more information, see [Audit log](https://confluence.atlassian.com/confcloud/audit-log-802164269.html) in the Confluence administrator's guide.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission.
     *
     * Authentication - Required Scopes: [read:audit-log:confluence]
     * @param number               The number of units for the time period. (optional, defaults to 3)
     * @param units                The unit of time that the time period is measured in. (optional, defaults to MONTHS)
     * @param searchString         Filters the results to records that have string property values matching the {@code searchString}. (optional)
     * @param start                The starting index of the returned records. (optional, defaults to 0)
     * @param limit                The maximum number of records to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 1000)
     */
    @RequestLine("GET /wiki/rest/api/audit/since?number={number}&units={units}&searchString={searchString}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<AuditRecordArray> getAuditRecordsForTimePeriod(@Param("number") @Nullable Long number, @Param("units") @Nullable String units, @Param("searchString") @Nullable String searchString, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Gets available content states for content.
     * <p>
     * Gets content states that are available for the content to be set as. Will return all enabled Space Content States. Will only return most the 3 most recently published custom content states to match UI editor list. To get all custom content states, use the /content-states endpoint.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   id of content to get available states for (required)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/state/available")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<AvailableContentStates> getAvailableContentStates(@Param("id") @NotNull String id);

    /**
     * Get blueprint templates
     * <p>
     * Returns all templates provided by blueprints. Use this method to retrieve all global blueprint templates or all blueprint templates in a space.
     * Note, all global blueprints are inherited by each space. Space blueprints can be customised without affecting the global blueprints.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space to view blueprints for the space and permission to access the Confluence site ('Can use' global permission) to view global blueprints.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spaceKey             The key of the space to be queried for templates. If the {@code spaceKey} is not specified, global blueprint templates will be returned. (optional)
     * @param start                The starting index of the returned templates. (optional, defaults to 0)
     * @param limit                The maximum number of templates to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     * @param expand               A multi-value parameter indicating which properties of the template to expand.  - {@code body} returns the content of the template in storage format. (optional)
     */
    @RequestLine("GET /wiki/rest/api/template/blueprint?spaceKey={spaceKey}&start={start}&limit={limit}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<BlueprintTemplateArray> getBlueprintTemplates(@Param("spaceKey") @Nullable String spaceKey, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit, @Param("expand") @Nullable List<String> expand);

    /**
     * Get multiple users using ids
     * <p>
     * Returns user details for the ids provided in request.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-user]
     * @param accountId            A list of accountId's of users to be returned. (required)
     * @param expand               A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.   - {@code personalSpace} returns the user's personal space, if it exists.   - {@code isExternalCollaborator} returns whether the user is an external collaborator user. (optional)
     * @param limit                The maximum number of results returned. Currently API returns 200 results max. If more that 200 ids are passed first 200 will be returned. (optional)
     */
    @RequestLine("GET /wiki/rest/api/user/bulk?accountId={accountId}&expand={expand}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<BulkUserLookupArray> getBulkUserLookup(@Param("accountId") @NotNull String accountId, @Param("expand") @Nullable List<String> expand, @Param("limit") @Nullable Integer limit);

    /**
     * Get content
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns all content in a Confluence instance.
     * By default, the following objects are expanded: {@code space}, {@code history}, {@code version}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only content that the user has permission to view will be returned.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param type                 The type of content to return. For example:   - page   - blogpost (optional, defaults to page)
     * @param spaceKey             The key of the space to be queried for its content. (optional)
     * @param title                The title of the page to be returned. Required for &amp;lt;code&amp;gt;page&amp;lt;/code&amp;gt; type. (optional)
     * @param status               Filter the results to a set of content based on their status. If set to {@code any}, content with any status is returned. Note, the {@code historical} status is currently not supported. (optional, defaults to current)
     * @param postingDay           The posting date of the blog post to be returned. Required for &amp;lt;code&amp;gt;blogpost&amp;lt;/code&amp;gt; type. Format: &amp;lt;code&amp;gt;yyyy-mm-dd&amp;lt;/code&amp;gt;. (optional)
     * @param expand               A multi-value parameter indicating which properties of the content to expand. Maximum sub-expansions allowed is {@code 8}.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment. (optional)
     * @param trigger              If set to {@code viewed}, the request will trigger a 'viewed' event for the content. When this event is triggered, the page/blogpost will appear on the 'Recently visited' tab of the user's Confluence dashboard. (optional)
     * @param orderby              Orders the content by a particular field. Specify the field and sort direction for this parameter, as follows: 'fieldpath asc/desc'. For example, 'history.createdDate desc'. (optional)
     * @param start                The starting index of the returned content. (optional, defaults to 0)
     * @param limit                The maximum number of content objects to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/content?type={type}&spaceKey={spaceKey}&title={title}&status={status}&postingDay={postingDay}&expand={expand}&trigger={trigger}&orderby={orderby}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentArray> getContent(@Param("type") @Nullable String type, @Param("spaceKey") @Nullable String spaceKey, @Param("title") @Nullable String title, @Param("status") @Nullable List<String> status, @Param("postingDay") @Nullable String postingDay, @Param("expand") @Nullable List<String> expand, @Param("trigger") @Nullable String trigger, @Param("orderby") @Nullable String orderby, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get content by ID
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns a single piece of content, like a page or a blog post.
     * By default, the following objects are expanded: {@code space}, {@code history}, {@code version}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content. If the content is a blog post, 'View' permission for the space is required.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param id                   The ID of the content to be returned. If you don't know the content ID, use [Get content](#api-content-get) and filter the results. (required)
     * @param status               Filter the results to a set of content based on their status. If set to {@code any}, content with any status is returned. Note, the {@code historical} status is currently not supported. (optional, defaults to current)
     * @param version              The version number of the content to be returned. (optional)
     * @param embeddedContentRender The version of embedded content (e.g. attachments) to render.  - &amp;lt;code&amp;gt;current&amp;lt;/code&amp;gt; renders the latest version of the embedded content. - &amp;lt;code&amp;gt;version-at-save&amp;lt;/code&amp;gt; renders the version of the embedded content at the time of save. (optional, defaults to current)
     * @param expand               A multi-value parameter indicating which properties of the content to expand. Maximum sub-expansions allowed is {@code 8}.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment. (optional)
     * @param trigger              If set to {@code viewed}, the request will trigger a 'viewed' event for the content. When this event is triggered, the page/blogpost will appear on the 'Recently visited' tab of the user's Confluence dashboard. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/content/{id}?status={status}&version={version}&embeddedContentRender={embeddedContentRender}&expand={expand}&trigger={trigger}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Content> getContentById(@Param("id") @NotNull String id, @Param("status") @Nullable List<String> status, @Param("version") @Nullable Integer version, @Param("embeddedContentRender") @Nullable String embeddedContentRender, @Param("expand") @Nullable List<String> expand, @Param("trigger") @Nullable String trigger);

    /**
     * Get content by type for space
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns all content of a given type, in a space. The returned content is ordered by content ID in ascending order.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space. Note, the returned list will only contain content that the current user has permission to view.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spaceKey             The key of the space to be queried for its content. (required)
     * @param type                 The type of content to return. {@code page}, {@code blogpost}, {@code &amp;lt;some_customContentType&amp;gt;}. (required)
     * @param depth                Filter the results to content at the root level of the space or all content. (optional, defaults to all)
     * @param expand               A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment. (optional)
     * @param start                The starting index of the returned content. (optional, defaults to 0)
     * @param limit                The maximum number of content objects to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/space/{spaceKey}/content/{type}?depth={depth}&expand={expand}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentArray> getContentByTypeForSpace(@Param("spaceKey") @NotNull String spaceKey, @Param("type") @NotNull String type, @Param("depth") @Nullable String depth, @Param("expand") @Nullable List<String> expand, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get content children
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns a map of the direct children of a piece of content. A piece of content has different types of child content, depending on its type. These are the default parent-child content type relationships:
     * - {@code page}: child content is {@code page}, {@code comment}, {@code attachment} - {@code blogpost}: child content is {@code comment}, {@code attachment} - {@code attachment}: child content is {@code comment} - {@code comment}: child content is {@code attachment}
     * Apps can override these default relationships. Apps can also introduce new content types that create new parent-child content relationships.
     * Note, the map will always include all child content types that are valid for the content. However, if the content has no instances of a child content type, the map will contain an empty array for that child content type.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space, and permission to view the content if it is a page.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param id                   The ID of the content to be queried for its children. (required)
     * @param expand               A multi-value parameter indicating which properties of the children to expand, where:  - {@code attachment} returns all attachments for the content. - {@code comments} returns all comments for the content. - {@code page} returns all child pages of the content. - Custom content types that are provided by apps are also supported. (optional)
     * @param parentVersion        The version of the parent content to retrieve children for. Currently, this only works for the latest version. (optional, defaults to 0)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/content/{id}/child?expand={expand}&parentVersion={parentVersion}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentChildren> getContentChildren(@Param("id") @NotNull String id, @Param("expand") @Nullable List<String> expand, @Param("parentVersion") @Nullable Integer parentVersion);

    /**
     * Get content children by type
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns all children of a given type, for a piece of content. A piece of content has different types of child content, depending on its type:
     * - {@code page}: child content is {@code page}, {@code comment}, {@code attachment} - {@code blogpost}: child content is {@code comment}, {@code attachment} - {@code attachment}: child content is {@code comment} - {@code comment}: child content is {@code attachment}
     * Custom content types that are provided by apps can also be returned.
     * Note, this method only returns direct children. To return children at all levels, use [Get descendants by type](#api-content-id-descendant-type-get).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space, and permission to view the content if it is a page.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param id                   The ID of the content to be queried for its children. (required)
     * @param type                 The type of children to return. (required)
     * @param expand               A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment. (optional)
     * @param parentVersion        The version of the parent content to retrieve children for. Currently, this only works for the latest version. (optional, defaults to 0)
     * @param start                The starting index of the returned content. (optional)
     * @param limit                The maximum number of content to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/content/{id}/child/{type}?expand={expand}&parentVersion={parentVersion}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentArray> getContentChildrenByType(@Param("id") @NotNull String id, @Param("type") @NotNull String type, @Param("expand") @Nullable List<String> expand, @Param("parentVersion") @Nullable Integer parentVersion, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get content comments
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns the comments on a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space, and permission to view the content if it is a page.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param id                   The ID of the content to be queried for its comments. (required)
     * @param expand               A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment. (optional)
     * @param parentVersion        The version of the parent content to retrieve children for. Currently, this only works for the latest version. (optional, defaults to 0)
     * @param start                The starting index of the returned comments. (optional)
     * @param limit                The maximum number of comments to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     * @param location             The location of the comments in the page. Multiple locations can be specified. If no location is specified, comments from all locations are returned. (optional)
     * @param depth                Currently, this parameter is not used. Comments are returned at the root level only. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/content/{id}/child/comment?expand={expand}&parentVersion={parentVersion}&start={start}&limit={limit}&location={location}&depth={depth}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentArray> getContentComments(@Param("id") @NotNull String id, @Param("expand") @Nullable List<String> expand, @Param("parentVersion") @Nullable Integer parentVersion, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit, @Param("location") @Nullable List<String> location, @Param("depth") @Nullable String depth);

    /**
     * Get content descendants
     * <p>
     * Returns a map of the descendants of a piece of content. This is similar to [Get content children](#api-content-id-child-get), except that this method returns child pages at all levels, rather than just the direct child pages.
     * A piece of content has different types of descendants, depending on its type:
     * - {@code page}: descendant is {@code page}, {@code comment}, {@code attachment} - {@code blogpost}: descendant is {@code comment}, {@code attachment} - {@code attachment}: descendant is {@code comment} - {@code comment}: descendant is {@code attachment}
     * The map will always include all descendant types that are valid for the content. However, if the content has no instances of a descendant type, the map will contain an empty array for that descendant type.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space, and permission to view the content if it is a page.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param id                   The ID of the content to be queried for its descendants. (required)
     * @param expand               A multi-value parameter indicating which properties of the children to expand, where:  - {@code attachment} returns all attachments for the content. - {@code comments} returns all comments for the content. - {@code page} returns all child pages of the content. (optional)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/descendant?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentChildren> getContentDescendants(@Param("id") @NotNull String id, @Param("expand") @Nullable List<String> expand);

    /**
     * Get content for space
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns all content in a space. The returned content is grouped by type (pages then blogposts), then ordered by content ID in ascending order.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space. Note, the returned list will only contain content that the current user has permission to view.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spaceKey             The key of the space to be queried for its content. (required)
     * @param depth                Filter the results to content at the root level of the space or all content. (optional, defaults to all)
     * @param expand               A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment. (optional)
     * @param start                The starting index of the returned content. (optional, defaults to 0)
     * @param limit                The maximum number of content objects to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/space/{spaceKey}/content?depth={depth}&expand={expand}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<GetContentForSpace200Response> getContentForSpace(@Param("spaceKey") @NotNull String spaceKey, @Param("depth") @Nullable String depth, @Param("expand") @Nullable List<String> expand, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get content properties
     * <p>
     * Returns the properties for a piece of content. For more information about content properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space, and permission to view the content if it is a page.
     *
     * Authentication - Required Scopes: [read:confluence-props]
     * @param id                   The ID of the content to be queried for its properties. (required)
     * @param key                  The key of the content property. (optional)
     * @param expand               A multi-value parameter indicating which properties of the content to expand. By default, the {@code version} object is expanded.  - {@code content} returns the content that the property is stored against. - {@code version} returns information about the version of the property, such as the version number, when it was created, etc. (optional)
     * @param start                The starting index of the returned properties. (optional, defaults to 0)
     * @param limit                The maximum number of properties to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 10)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/content/{id}/property?key={key}&expand={expand}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentPropertyArray> getContentProperties(@Param("id") @NotNull String id, @Param("key") @Nullable List<String> key, @Param("expand") @Nullable List<String> expand, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get content property
     * <p>
     * Returns a content property for a piece of content. For more information, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space, and permission to view the content if it is a page.
     *
     * Authentication - Required Scopes: [read:confluence-props]
     * @param id                   The ID of the content to be queried for the property. (required)
     * @param key                  The key of the content property. (required)
     * @param expand               A multi-value parameter indicating which properties of the content to expand. By default, the {@code version} object is expanded.  - {@code content} returns the content that the property is stored against. - {@code version} returns information about the version of the property, such as the version number, when it was created, etc. (optional)
     * @param status               Filter the results to a set of content based on their status. If set to {@code any}, content with any status is returned. By default it will fetch current and archived statuses {@code ?status=current&amp;status=archived}. All supported statuses  - any - archived - current - deleted - draft - trashed (optional, defaults to current,archived)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/content/{id}/property/{key}?expand={expand}&status={status}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> getContentProperty(@Param("id") @NotNull String id, @Param("key") @NotNull String key, @Param("expand") @Nullable List<String> expand, @Param("status") @Nullable List<String> status);

    /**
     * Get content restriction status for group
     * <p>
     * Deprecated, use [Get content restriction status for group via groupId](https://developer.atlassian.com/cloud/confluence/rest/v1/api-group-content-restrictions/#api-wiki-rest-api-content-id-restriction-byoperation-operationkey-bygroupid-groupid-get). Returns whether the specified content restriction applies to a group. For example, if a page with {@code id=123} has a {@code read} restriction for the {@code admins} group, the following request will return {@code true}:
     * {@code /wiki/rest/api/content/123/restriction/byOperation/read/group/admins}
     * Note that a response of {@code true} does not guarantee that the group can view the page, as it does not account for account-inherited restrictions, space permissions, or even product access. For more information, see [Confluence permissions](https://confluence.atlassian.com/x/_AozKw).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     *
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param id                   The ID of the content that the restriction applies to. (required)
     * @param operationKey         The operation that the restriction applies to. (required)
     * @param groupName            The name of the group to be queried for whether the content restriction applies to it. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/content/{id}/restriction/byOperation/{operationKey}/group/{groupName}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> getContentRestrictionStatusForGroup(@Param("id") @NotNull String id, @Param("operationKey") @NotNull String operationKey, @Param("groupName") @NotNull String groupName);

    /**
     * Get content restriction status for user
     * <p>
     * Returns whether the specified content restriction applies to a user. For example, if a page with {@code id=123} has a {@code read} restriction for a user with an account ID of {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}, the following request will return {@code true}:
     * {@code /wiki/rest/api/content/123/restriction/byOperation/read/user?accountId=384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}
     * Note that a response of {@code true} does not guarantee that the user can view the page, as it does not account for account-inherited restrictions, space permissions, or even product access. For more information, see [Confluence permissions](https://confluence.atlassian.com/x/_AozKw).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     *
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param id                   The ID of the content that the restriction applies to. (required)
     * @param operationKey         The operation that is restricted. (required)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (optional)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/restriction/byOperation/{operationKey}/user?key={key}&username={username}&accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> getContentRestrictionStatusForUser(@Param("id") @NotNull String id, @Param("operationKey") @NotNull String operationKey, @Param("key") @Nullable String key, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Get content state
     * <p>
     * Gets the current content state of the draft or current version of content. To specify the draft version, set the parameter status to draft, otherwise archived or current will get the relevant published state. **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param id                   The id of the content whose content state is of interest. (required)
     * @param status               Set status to one of [current,draft,archived]. Default value is current. (optional, defaults to current)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/state?status={status}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentStateResponse> getContentState(@Param("id") @NotNull String id, @Param("status") @Nullable String status);

    /**
     * Get content state settings for space
     * <p>
     * Get object describing whether content states are allowed at all, if custom content states or space content states are restricted, and a list of space content states allowed for the space if they are not restricted.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Space admin permission
     *
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spaceKey             The key of the space to be queried for its content state settings. (required)
     */
    @RequestLine("GET /wiki/rest/api/space/{spaceKey}/state/settings")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentStateSettings> getContentStateSettings(@Param("spaceKey") @NotNull String spaceKey);

    /**
     * Get content template
     * <p>
     * Returns a content template. This includes information about template, like the name, the space or blueprint that the template is in, the body of the template, and more.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space to view space templates and permission to access the Confluence site ('Can use' global permission) to view global templates.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param contentTemplateId    The ID of the content template to be returned. (required)
     */
    @RequestLine("GET /wiki/rest/api/template/{contentTemplateId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentTemplate> getContentTemplate(@Param("contentTemplateId") @NotNull String contentTemplateId);

    /**
     * Get content templates
     * <p>
     * Returns all content templates. Use this method to retrieve all global content templates or all content templates in a space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space to view space templates and permission to access the Confluence site ('Can use' global permission) to view global templates.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spaceKey             The key of the space to be queried for templates. If the {@code spaceKey} is not specified, global templates will be returned. (optional)
     * @param start                The starting index of the returned templates. (optional, defaults to 0)
     * @param limit                The maximum number of templates to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     * @param expand               A multi-value parameter indicating which properties of the template to expand.  - {@code body} returns the content of the template in storage format. (optional)
     */
    @RequestLine("GET /wiki/rest/api/template/page?spaceKey={spaceKey}&start={start}&limit={limit}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentTemplateArray> getContentTemplates(@Param("spaceKey") @Nullable String spaceKey, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit, @Param("expand") @Nullable List<String> expand);

    /**
     * Get content version
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns a version for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content. If the content is a blog post, 'View' permission for the space is required.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param id                   The ID of the content to be queried for its version. (required)
     * @param versionNumber        The number of the version to be retrieved. (required)
     * @param expand               A multi-value parameter indicating which properties of the content to expand. By default, the {@code content} object is expanded.  - {@code collaborators} returns the users that collaborated on the version. - {@code content} returns the content for the version. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/content/{id}/version/{versionNumber}?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Version> getContentVersion(@Param("id") @NotNull String id, @Param("versionNumber") @NotNull Integer versionNumber, @Param("expand") @Nullable List<String> expand);

    /**
     * Get content versions
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns the versions for a piece of content in descending order.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content. If the content is a blog post, 'View' permission for the space is required.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param id                   The ID of the content to be queried for its versions. (required)
     * @param start                The starting index of the returned versions. (optional, defaults to 0)
     * @param limit                The maximum number of versions to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 200)
     * @param expand               A multi-value parameter indicating which properties of the content to expand. By default, the {@code content} object is expanded.  - {@code collaborators} returns the users that collaborated on the version. - {@code content} returns the content for the version. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/content/{id}/version?start={start}&limit={limit}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<VersionArray> getContentVersions(@Param("id") @NotNull String id, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit, @Param("expand") @Nullable List<String> expand);

    /**
     * Get content watch status
     * <p>
     * Returns whether a user is watching a piece of content. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param contentId            The ID of the content to be queried for whether the specified user is watching it. (required)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (optional)
     */
    @RequestLine("GET /wiki/rest/api/user/watch/content/{contentId}?key={key}&username={username}&accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<UserWatch> getContentWatchStatus(@Param("contentId") @NotNull String contentId, @Param("key") @Nullable String key, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Get content in space with given content state
     * <p>
     * Finds paginated content with
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Space View Permission
     *
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spaceKey             The key of the space to be queried for its content state settings. (required)
     * @param stateId              The id of the content state to filter content by (required)
     * @param expand               A multi-value parameter indicating which properties of the content to expand. Options include: space, version, history, children, etc.  Ex: space,version (optional)
     * @param limit                Maximum number of results to return (optional, defaults to 25)
     * @param start                Number of result to start returning. (0 indexed) (optional)
     */
    @RequestLine("GET /wiki/rest/api/space/{spaceKey}/state/content?state-id={stateId}&expand={expand}&limit={limit}&start={start}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentArray> getContentsWithState(@Param("spaceKey") @NotNull String spaceKey, @Param("stateId") @NotNull Integer stateId, @Param("expand") @Nullable List<String> expand, @Param("limit") @Nullable Integer limit, @Param("start") @Nullable Integer start);

    /**
     * Get current user
     * <p>
     * Returns the currently logged-in user. This includes information about the user, like the display name, userKey, account ID, profile picture, and more.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-user]
     * @param expand               A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.   - {@code personalSpace} returns the user's personal space, if it exists.   - {@code isExternalCollaborator} returns whether the user is an external collaborator user. (optional)
     */
    @RequestLine("GET /wiki/rest/api/user/current?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<User> getCurrentUser(@Param("expand") @Nullable List<String> expand);

    /**
     * Get Custom Content States
     * <p>
     * Get custom content states that authenticated user has created.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required** Must have user authentication.
     *
     * Authentication - Required Scopes: [read:user.property:confluence]
     */
    @RequestLine("GET /wiki/rest/api/content-states")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<List<ContentState>> getCustomContentStates();

    /**
     * Get content descendants by type
     * <p>
     * Returns all descendants of a given type, for a piece of content. This is similar to [Get content children by type](#api-content-id-child-type-get), except that this method returns child pages at all levels, rather than just the direct child pages.
     * A piece of content has different types of descendants, depending on its type:
     * - {@code page}: descendant is {@code page}, {@code comment}, {@code attachment} - {@code blogpost}: descendant is {@code comment}, {@code attachment} - {@code attachment}: descendant is {@code comment} - {@code comment}: descendant is {@code attachment}
     * Custom content types that are provided by apps can also be returned.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space, and permission to view the content if it is a page.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param id                   The ID of the content to be queried for its descendants. (required)
     * @param type                 The type of descendants to return. (required)
     * @param depth                Filter the results to descendants upto a desired level of the content. Note, the maximum value supported is 100. root level of the content means immediate (level 1) descendants of the type requested. all represents returning all descendants of the type requested. (optional, defaults to all)
     * @param expand               A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment. (optional)
     * @param start                The starting index of the returned content. (optional, defaults to 0)
     * @param limit                The maximum number of content to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/descendant/{type}?depth={depth}&expand={expand}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentArray> getDescendantsOfType(@Param("id") @NotNull String id, @Param("type") @NotNull String type, @Param("depth") @Nullable String depth, @Param("expand") @Nullable List<String> expand, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get global theme
     * <p>
     * Returns the globally assigned theme.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: None
     *
     * Authentication - Required Scopes: [manage:confluence-configuration]
     */
    @RequestLine("GET /wiki/rest/api/settings/theme/selected")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Theme> getGlobalTheme();

    /**
     * Get group
     * <p>
     * Returns a user group for a given group id.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-groups]
     * @param id                   The id of the group. (required)
     */
    @RequestLine("GET /wiki/rest/api/group/by-id?id={id}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Group> getGroupByGroupId(@Param("id") @NotNull String id);

    /**
     * Get group
     * <p>
     * Returns a user group for a given group name.
     * Use updated Get group API
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * @param groupName            The name of the group. This is the same as the group name shown in the Confluence administration console. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/group/{groupName}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Group> getGroupByName(@Param("groupName") @NotNull String groupName);

    /**
     * Get group
     * <p>
     * Returns a user group for a given group name.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-groups]
     * @param name                 The name of the group. This is the same as the group name shown in the Confluence administration console. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/group/by-name?name={name}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Group> getGroupByQueryParam(@Param("name") @NotNull String name);

    /**
     * Get group members
     * <p>
     * Returns the users that are members of a group.
     * Use updated Get group API
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * @param groupName            The name of the group to be queried for its members. (required)
     * @param start                The starting index of the returned users. (optional, defaults to 0)
     * @param limit                The maximum number of users to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 200)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/group/{groupName}/member?start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<UserArray> getGroupMembers(@Param("groupName") @NotNull String groupName, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get group members
     * <p>
     * Returns the users that are members of a group.
     * Use updated Get group API
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-groups]
     * @param groupId              The id of the group to be queried for its members. (required)
     * @param start                The starting index of the returned users. (optional, defaults to 0)
     * @param limit                The maximum number of users to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 200)
     * @param shouldReturnTotalSize Whether to include total size parameter in the results. Note, fetching total size property is an expensive operation; use it if your use case needs this value. (optional, defaults to false)
     * @param expand               A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.   - {@code personalSpace} returns the user's personal space, if it exists.   - {@code isExternalCollaborator} returns whether the user is an external collaborator user. (optional)
     */
    @RequestLine("GET /wiki/rest/api/group/{groupId}/membersByGroupId?start={start}&limit={limit}&shouldReturnTotalSize={shouldReturnTotalSize}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<UserArray> getGroupMembersByGroupId(@Param("groupId") @NotNull String groupId, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit, @Param("shouldReturnTotalSize") @Nullable Boolean shouldReturnTotalSize, @Param("expand") @Nullable List<String> expand);

    /**
     * Get group memberships for user
     * <p>
     * Returns the groups that a user is a member of.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-user]
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (required)
     * @param start                The starting index of the returned groups. (optional, defaults to 0)
     * @param limit                The maximum number of groups to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 200)
     */
    @RequestLine("GET /wiki/rest/api/user/memberof?accountId={accountId}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<GroupArrayWithLinks> getGroupMembershipsForUser(@Param("accountId") @NotNull String accountId, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get groups
     * <p>
     * Returns all user groups. The returned groups are ordered alphabetically in ascending order by group name.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-groups]
     * @param start                The starting index of the returned groups. (optional, defaults to 0)
     * @param limit                The maximum number of groups to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 200)
     * @param accessType           The group permission level for which to filter results. (optional)
     */
    @RequestLine("GET /wiki/rest/api/group?start={start}&limit={limit}&accessType={accessType}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<GroupArrayWithLinks> getGroups(@Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit, @Param("accessType") @Nullable String accessType);

    /**
     * Get content history
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns the most recent update for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param id                   The ID of the content to be queried for its history. (required)
     * @param expand               A multi-value parameter indicating which properties of the content history to expand. Maximum sub-expansions allowed is {@code 8}.  - {@code lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code previousVersion} returns information about the update prior to the current content update. For this method, it contains the same information as {@code lastUpdated}. - {@code contributors} returns all of the users who have contributed to the content. - {@code nextVersion} This parameter is not used for this method. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/content/{id}/history?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentHistory> getHistoryForContent(@Param("id") @NotNull String id, @Param("expand") @Nullable List<String> expand);

    /**
     * Get content restriction status for group
     * <p>
     * Returns whether the specified content restriction applies to a group. For example, if a page with {@code id=123} has a {@code read} restriction for the {@code 123456} group id, the following request will return {@code true}:
     * {@code /wiki/rest/api/content/123/restriction/byOperation/read/byGroupId/123456}
     * Note that a response of {@code true} does not guarantee that the group can view the page, as it does not account for account-inherited restrictions, space permissions, or even product access. For more information, see [Confluence permissions](https://confluence.atlassian.com/x/_AozKw).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     *
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param id                   The ID of the content that the restriction applies to. (required)
     * @param operationKey         The operation that the restriction applies to. (required)
     * @param groupId              The id of the group to be queried for whether the content restriction applies to it. (required)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/restriction/byOperation/{operationKey}/byGroupId/{groupId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> getIndividualGroupRestrictionStatusByGroupId(@Param("id") @NotNull String id, @Param("operationKey") @NotNull String operationKey, @Param("groupId") @NotNull String groupId);

    /**
     * Get labels for content
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns the labels on a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space and permission to view the content if it is a page.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param id                   The ID of the content to be queried for its labels. (required)
     * @param prefix               Filters the results to labels with the specified prefix. If this parameter is not specified, then labels with any prefix will be returned.  - {@code global} prefix is used by default when a user adds a label via the UI. - {@code my} prefix can be explicitly added by a user when adding a label via the UI, e.g. 'my:example-label'. Also, when a page is selected as a favourite, the 'my:favourite' label is automatically added. - {@code team} can used when adding labels via [Add labels to content](#api-content-id-label-post) but is not used in the UI. (optional)
     * @param start                The starting index of the returned labels. (optional, defaults to 0)
     * @param limit                The maximum number of labels to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 200)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/content/{id}/label?prefix={prefix}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<LabelArray> getLabelsForContent(@Param("id") @NotNull String id, @Param("prefix") @Nullable String prefix, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get Space Labels
     * <p>
     * Returns a list of labels associated with a space. Can provide a prefix as well as other filters to select different types of labels.
     *
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spaceKey             The key of the space to get labels for. (required)
     * @param prefix               Filters the results to labels with the specified prefix. If this parameter is not specified, then labels with any prefix will be returned.  - {@code global} prefix is used by labels that are on content within the provided space. - {@code my} prefix can be explicitly added by a user when adding a label via the UI, e.g. 'my:example-label'. - {@code team} prefix is used for labels applied to the space. (optional)
     * @param start                The starting index of the returned labels. (optional, defaults to 0)
     * @param limit                The maximum number of labels to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 200)
     */
    @RequestLine("GET /wiki/rest/api/space/{spaceKey}/label?prefix={prefix}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<LabelArray> getLabelsForSpace(@Param("spaceKey") @NotNull String spaceKey, @Param("prefix") @Nullable String prefix, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get look and feel settings
     * <p>
     * Returns the look and feel settings for the site or a single space. This includes attributes such as the color scheme, padding, and border radius.
     * The look and feel settings for a space can be inherited from the global look and feel settings or provided by a theme.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: None
     *
     * Authentication - Required Scopes: [manage:confluence-configuration]
     * @param spaceKey             The key of the space for which the look and feel settings will be returned. If this is not set, only the global look and feel settings are returned. (optional)
     */
    @RequestLine("GET /wiki/rest/api/settings/lookandfeel?spaceKey={spaceKey}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<LookAndFeelSettings> getLookAndFeelSettings(@Param("spaceKey") @Nullable String spaceKey);

    /**
     * Get macro body by macro ID
     * <p>
     * Returns the body of a macro in storage format, for the given macro ID. This includes information like the name of the macro, the body of the macro, and any macro parameters. This method is mainly used by Cloud apps.
     * About the macro ID: When a macro is created in a new version of content, Confluence will generate a random ID for it, unless an ID is specified (by an app). The macro ID will look similar to this: '50884bd9-0cb8-41d5-98be-f80943c14f96'. The ID is then persisted as new versions of content are created, and is only modified by Confluence if there are conflicting IDs.
     * Note, to preserve backwards compatibility this resource will also match on the hash of the macro body, even if a macro ID is found. This check will eventually become redundant, as macro IDs are generated for pages and transparently propagate out to all instances.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content that the macro is in.
     *
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param id                   The ID for the content that contains the macro. (required)
     * @param version              The version of the content that contains the macro. Specifying {@code 0} as the {@code version} will return the macro body for the latest content version. (required)
     * @param macroId              The ID of the macro. This is usually passed by the app that the macro is in. Otherwise, find the macro ID by querying the desired content and version, then expanding the body in storage format. For example, '/content/196611/version/7?expand=content.body.storage'. (required)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/history/{version}/macro/id/{macroId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MacroInstance> getMacroBodyByMacroId(@Param("id") @NotNull String id, @Param("version") @NotNull Integer version, @Param("macroId") @NotNull String macroId);

    /**
     * Get group members
     * <p>
     * Returns the users that are members of a group.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-groups]
     * @param name                 The name of the group to be queried for its members. (required)
     * @param start                The starting index of the returned users. (optional, defaults to 0)
     * @param limit                The maximum number of users to return per page. Note, this is restricted by fixed system limit of 200 which is to say if the limit parameter exceeds 200, this API will return a maximum of 200 users per page. (optional, defaults to 200)
     * @param shouldReturnTotalSize Whether to include total size parameter in the results. Note, fetching total size property is an expensive operation; use it if your use case needs this value. (optional, defaults to false)
     * @param expand               A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.   - {@code personalSpace} returns the user's personal space, if it exists.   - {@code isExternalCollaborator} returns whether the user is an external collaborator user. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/group/member?name={name}&start={start}&limit={limit}&shouldReturnTotalSize={shouldReturnTotalSize}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<UserArray> getMembersByQueryParam(@Param("name") @NotNull String name, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit, @Param("shouldReturnTotalSize") @Nullable Boolean shouldReturnTotalSize, @Param("expand") @Nullable List<String> expand);

    /**
     * Get modules
     * <p>
     * Returns all modules registered dynamically by the calling app.
     * **[Permissions](#permissions) required:** Only Connect apps can make this request.
     *
     */
    @RequestLine("GET /atlassian-connect/1/app/module/dynamic")
    @Headers({
        "Accept: */*"
    })
    CompletableFuture<ConnectModules> getModules();

    /**
     * Get user email address
     * <p>
     * Returns a user's email address. This API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. Required. (required)
     */
    @RequestLine("GET /wiki/rest/api/user/email?accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<AccountIdEmailRecord> getPrivacyUnsafeUserEmail(@Param("accountId") @NotNull String accountId);

    /**
     * Get user email addresses in batch
     * <p>
     * Returns user email addresses for a set of accountIds. This API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603).
     * Any accounts which are not available will not be included in the result.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * @param accountId            The account IDs of the users. (required)
     */
    @RequestLine("GET /wiki/rest/api/user/email/bulk?accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<List<AccountIdEmailRecord>> getPrivacyUnsafeUserEmailBulk(@Param("accountId") @NotNull List<String> accountId);

    /**
     * Find relationship from source to target
     * <p>
     * Find whether a particular type of relationship exists from a source entity to a target entity. Note, relationships are one way.
     * For example, you can use this method to find whether the current user has selected a particular page as a favorite (i.e. 'save for later'): {@code GET /wiki/rest/api/relation/favourite/from/user/current/to/content/123}
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view both the target entity and source entity.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param relationName         The name of the relationship. This method supports the 'favourite' (i.e. 'save for later') relationship as well as any other relationship types created via [Create relationship](#api-wiki-rest-api-relation-relationname-from-sourcetype-sourcekey-to-targettype-targetkey-put). (required)
     * @param sourceType           The source entity type of the relationship. This must be 'user', if the {@code relationName} is 'favourite'. (required)
     * @param sourceKey            - The identifier for the source entity:  - If {@code sourceType} is {@code user}, then specify either {@code current} (logged-in user), the user key of the user, or the account ID of the user. Note that the user key has been deprecated in favor of the account ID for this parameter. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key. (required)
     * @param targetType           The target entity type of the relationship. This must be 'space' or 'content', if the {@code relationName} is 'favourite'. (required)
     * @param targetKey            The identifier for the target entity:  - If {@code targetType} is {@code user}, then specify either {@code current} (logged-in user), the user key of the user, or the account ID of the user. Note that the user key has been deprecated in favor of the account ID for this parameter. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. - If {@code targetType} is 'content', then specify the content ID. - If {@code targetType} is 'space', then specify the space key. (required)
     * @param sourceStatus         The status of the source. This parameter is only used when the {@code sourceType} is 'content'. (optional)
     * @param targetStatus         The status of the target. This parameter is only used when the {@code targetType} is 'content'. (optional)
     * @param sourceVersion        The version of the source. This parameter is only used when the {@code sourceType} is 'content' and the {@code sourceStatus} is 'historical'. (optional)
     * @param targetVersion        The version of the target. This parameter is only used when the {@code targetType} is 'content' and the {@code targetStatus} is 'historical'. (optional)
     * @param expand               A multi-value parameter indicating which properties of the response object to expand.  - {@code relationData} returns information about the relationship, such as who created it and when it was created. - {@code source} returns the source entity. - {@code target} returns the target entity. (optional)
     */
    @RequestLine("GET /wiki/rest/api/relation/{relationName}/from/{sourceType}/{sourceKey}/to/{targetType}/{targetKey}?sourceStatus={sourceStatus}&targetStatus={targetStatus}&sourceVersion={sourceVersion}&targetVersion={targetVersion}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Relation> getRelationship(@Param("relationName") @NotNull String relationName, @Param("sourceType") @NotNull String sourceType, @Param("sourceKey") @NotNull String sourceKey, @Param("targetType") @NotNull String targetType, @Param("targetKey") @NotNull String targetKey, @Param("sourceStatus") @Nullable String sourceStatus, @Param("targetStatus") @Nullable String targetStatus, @Param("sourceVersion") @Nullable Integer sourceVersion, @Param("targetVersion") @Nullable Integer targetVersion, @Param("expand") @Nullable List<String> expand);

    /**
     * Get restrictions
     * <p>
     * Returns the restrictions on a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     *
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param id                   The ID of the content to be queried for its restrictions. (required)
     * @param expand               A multi-value parameter indicating which properties of the content restrictions to expand. By default, the following objects are expanded: {@code restrictions.user}, {@code restrictions.group}.  - {@code restrictions.user} returns the piece of content that the restrictions are applied to. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. - {@code content} returns the piece of content that the restrictions are applied to. (optional)
     * @param start                The starting index of the users and groups in the returned restrictions. (optional, defaults to 0)
     * @param limit                The maximum number of users and the maximum number of groups, in the returned restrictions, to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 100)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/restriction?expand={expand}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentRestrictionArray> getRestrictions(@Param("id") @NotNull String id, @Param("expand") @Nullable List<String> expand, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get restrictions by operation
     * <p>
     * Returns restrictions on a piece of content by operation. This method is similar to [Get restrictions](#api-content-id-restriction-get) except that the operations are properties of the return object, rather than items in a results array.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     *
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param id                   The ID of the content to be queried for its restrictions. (required)
     * @param expand               A multi-value parameter indicating which properties of the content restrictions to expand.  - {@code restrictions.user} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code content} returns the piece of content that the restrictions are applied to. (optional)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/restriction/byOperation?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Map<String, GetRestrictionsByOperation200ResponseValue>> getRestrictionsByOperation(@Param("id") @NotNull String id, @Param("expand") @Nullable List<String> expand);

    /**
     * Get restrictions for operation
     * <p>
     * Returns the restictions on a piece of content for a given operation (read or update).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     *
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param id                   The ID of the content to be queried for its restrictions. (required)
     * @param operationKey         The operation type of the restrictions to be returned. (required)
     * @param expand               A multi-value parameter indicating which properties of the content restrictions to expand.  - {@code restrictions.user} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code content} returns the piece of content that the restrictions are applied to. (optional)
     * @param start                The starting index of the users and groups in the returned restrictions. (optional, defaults to 0)
     * @param limit                The maximum number of users and the maximum number of groups, in the returned restrictions, to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 100)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/restriction/byOperation/{operationKey}?expand={expand}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentRestriction> getRestrictionsForOperation(@Param("id") @NotNull String id, @Param("operationKey") @NotNull String operationKey, @Param("expand") @Nullable List<String> expand, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get retention period
     * <p>
     * Returns the retention period for records in the audit log. The retention period is how long an audit record is kept for, from creation date until it is deleted.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission.
     *
     * Authentication - Required Scopes: [read:audit-log:confluence]
     */
    @RequestLine("GET /wiki/rest/api/audit/retention")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<RetentionPeriod> getRetentionPeriod();

    /**
     * Get space
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns a space. This includes information like the name, description, and permissions, but not the content in the space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space.
     *
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spaceKey             The key of the space to be returned. (required)
     * @param expand               A multi-value parameter indicating which properties of the spaces to expand, where:    - {@code settings} returns the settings for the space, similar to [Get space settings](#api-space-spaceKey-settings-get).   - {@code metadata} returns the space metadata.   - {@code metadata.labels} returns the space labels, which are used to categorize the space.   - {@code operations} returns the operations for a space, which are used when setting permissions.   - {@code lookAndFeel} returns information about the look and feel of the space, including the color scheme.   - {@code permissions} returns the permissions for the space. Note that this may return permissions for deleted groups,   because deleting a group doesn't remove associated space permissions.   - {@code icon} returns information about space icon.   - {@code description} returns the description of the space.   - {@code description.plain} returns the description of the space, the plain format.   - {@code description.view} returns the description of the space, the view format.   - {@code theme} returns information about the space theme.   - {@code homepage} returns information about the space homepage.   - {@code history} returns information about the history of the space. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/space/{spaceKey}?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Space> getSpace(@Param("spaceKey") @NotNull String spaceKey, @Param("expand") @Nullable List<String> expand);

    /**
     * Get space suggested content states
     * <p>
     * Get content states that are suggested in the space. **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Space view permission
     *
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spaceKey             The key of the space to be queried for its content state settings. (required)
     */
    @RequestLine("GET /wiki/rest/api/space/{spaceKey}/state")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<List<ContentState>> getSpaceContentStates(@Param("spaceKey") @NotNull String spaceKey);

    /**
     * Get space properties
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns all properties for the given space. Space properties are a key-value storage associated with a space.
     * **[Permissions required](https://confluence.atlassian.com/x/_AozKw)**: ‘View’ permission for the space.
     *
     * Authentication - Required Scopes: [read:confluence-props]
     * @param spaceKey             The key of the space to be queried for its properties. (required)
     * @param expand               A multi-value parameter indicating which properties of the space property to expand. By default, the {@code version} object is expanded.  - {@code version} returns information about the version of the content. - {@code space} returns the space that the properties are in. (optional)
     * @param start                The starting index of the returned objects. (optional, defaults to 0)
     * @param limit                The maximum number of properties to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 10)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/space/{spaceKey}/property?expand={expand}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<SpacePropertyArray> getSpaceProperties(@Param("spaceKey") @NotNull String spaceKey, @Param("expand") @Nullable List<String> expand, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get space property
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns a space property.
     * **[Permissions required](https://confluence.atlassian.com/x/_AozKw)**: ‘View’ permission for the space.
     *
     * Authentication - Required Scopes: [read:confluence-props]
     * @param spaceKey             The key of the space that the property is in. (required)
     * @param key                  The key of the space property. (required)
     * @param expand               A multi-value parameter indicating which properties of the space property to expand. By default, the {@code version} object is expanded.  - {@code version} returns information about the version of the content. - {@code space} returns the space that the properties are in. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/space/{spaceKey}/property/{key}?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<SpaceProperty> getSpaceProperty(@Param("spaceKey") @NotNull String spaceKey, @Param("key") @NotNull String key, @Param("expand") @Nullable List<String> expand);

    /**
     * Get space settings
     * <p>
     * Returns the settings of a space. Currently only the {@code routeOverrideEnabled} setting can be returned.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space.
     *
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spaceKey             The key of the space to be queried for its settings. (required)
     */
    @RequestLine("GET /wiki/rest/api/space/{spaceKey}/settings")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<SpaceSettings> getSpaceSettings(@Param("spaceKey") @NotNull String spaceKey);

    /**
     * Get space theme
     * <p>
     * Returns the theme selected for a space, if one is set. If no space theme is set, this means that the space is inheriting the global look and feel settings.
     * **[Permissions required](https://confluence.atlassian.com/x/_AozKw)**: ‘View’ permission for the space.
     *
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spaceKey             The key of the space to be queried for its theme. (required)
     */
    @RequestLine("GET /wiki/rest/api/space/{spaceKey}/theme")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Theme> getSpaceTheme(@Param("spaceKey") @NotNull String spaceKey);

    /**
     * Get spaces
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns all spaces. The returned spaces are ordered alphabetically in ascending order by space key.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Note, the returned list will only contain spaces that the current user has permission to view.
     *
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spaceKey             The key of the space to be returned. To return multiple spaces, specify this parameter multiple times with different values. (optional)
     * @param spaceId              The id of the space to be returned. To return multiple spaces, specify this parameter multiple times with different values. (optional)
     * @param type                 Filter the results to spaces based on their type. (optional)
     * @param status               Filter the results to spaces based on their status. (optional)
     * @param label                Filter the results to spaces based on their label. (optional)
     * @param favourite            Filter the results to the favourite spaces of the user specified by {@code favouriteUserKey}. Note, 'favourite' spaces are also known as 'saved for later' spaces. (optional)
     * @param favouriteUserKey     The userKey of the user, whose favourite spaces are used to filter the results when using the {@code favourite} parameter.  Leave blank for the current user. Use [Get user](#api-user-get) to get the userKey for a user. (optional)
     * @param expand               A multi-value parameter indicating which properties of the spaces to expand, where:    - {@code settings} returns the settings for the space, similar to [Get space settings](#api-space-spaceKey-settings-get).   - {@code metadata} returns the space metadata.   - {@code metadata.labels} returns the space labels, which are used to categorize the space.   - {@code operations} returns the operations for a space, which are used when setting permissions.   - {@code lookAndFeel} returns information about the look and feel of the space, including the color scheme.   - {@code permissions} returns the permissions for the space. Note that this may return permissions for deleted groups,   because deleting a group doesn't remove associated space permissions.   - {@code icon} returns information about space icon.   - {@code description} returns the description of the space.   - {@code description.plain} returns the description of the space, the plain format.   - {@code description.view} returns the description of the space, the view format.   - {@code theme} returns information about the space theme.   - {@code homepage} returns information about the space homepage.   - {@code history} returns information about the history of the space. (optional)
     * @param start                The starting index of the returned spaces. (optional, defaults to 0)
     * @param limit                The maximum number of spaces to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/space?spaceKey={spaceKey}&spaceId={spaceId}&type={type}&status={status}&label={label}&favourite={favourite}&favouriteUserKey={favouriteUserKey}&expand={expand}&start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<SpaceArray> getSpaces(@Param("spaceKey") @Nullable List<String> spaceKey, @Param("spaceId") @Nullable List<Long> spaceId, @Param("type") @Nullable String type, @Param("status") @Nullable String status, @Param("label") @Nullable List<String> label, @Param("favourite") @Nullable Boolean favourite, @Param("favouriteUserKey") @Nullable String favouriteUserKey, @Param("expand") @Nullable List<String> expand, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get system info
     * <p>
     * Returns the system information for the Confluence Cloud tenant. This information is used by Atlassian.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [manage:confluence-configuration]
     */
    @RequestLine("GET /wiki/rest/api/settings/systemInfo")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<SystemInfoEntity> getSystemInfo();

    /**
     * Get long-running task
     * <p>
     * Returns information about an active long-running task (e.g. space export), such as how long it has been running and the percentage of the task that has completed.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param id                   The ID of the task. (required)
     */
    @RequestLine("GET /wiki/rest/api/longtask/{id}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<LongTaskStatusWithLinks> getTask(@Param("id") @NotNull String id);

    /**
     * Get inline task based on global ID
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns inline task based on the global ID.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content associated with the task.
     *
     * Authentication - Required Scopes: [read:inlinetask:confluence]
     * @param inlineTaskId         Global ID of the inline task (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/inlinetasks/{inlineTaskId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Task> getTaskById(@Param("inlineTaskId") @NotNull String inlineTaskId);

    /**
     * Get update on long running task for setting of content state.
     * <p>
     * Get Status of long running task that was previously created to set or remove content states from content. User must first create a task by passing in details to /wiki/rest/api/content-states PUT or DELETE endpoints.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required** Must have created long running task
     *
     * @param taskId               taskId returned by put or delete requests to /wiki/rest/api/content-states (required)
     */
    @RequestLine("GET /wiki/rest/api/content-states/task/{taskId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentStateBulkSetTaskUpdate> getTaskUpdate(@Param("taskId") @NotNull String taskId);

    /**
     * Get long-running tasks
     * <p>
     * Returns information about all active long-running tasks (e.g. space export), such as how long each task has been running and the percentage of each task that has completed.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:content.metadata:confluence]
     * @param start                The starting index of the returned tasks. (optional, defaults to 0)
     * @param limit                The maximum number of tasks to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 100)
     */
    @RequestLine("GET /wiki/rest/api/longtask?start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<LongTaskStatusArray> getTasks(@Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get theme
     * <p>
     * Returns a theme. This includes information about the theme name, description, and icon.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: None
     *
     * Authentication - Required Scopes: [manage:confluence-configuration]
     * @param themeKey             The key of the theme to be returned. (required)
     */
    @RequestLine("GET /wiki/rest/api/settings/theme/{themeKey}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Theme> getTheme(@Param("themeKey") @NotNull String themeKey);

    /**
     * Get themes
     * <p>
     * Returns all themes, not including the default theme.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: None
     *
     * Authentication - Required Scopes: [manage:confluence-configuration]
     * @param start                The starting index of the returned themes. (optional, defaults to 0)
     * @param limit                The maximum number of themes to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 100)
     */
    @RequestLine("GET /wiki/rest/api/settings/theme?start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ThemeArray> getThemes(@Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get user
     * <p>
     * Returns a user. This includes information about the user, such as the display name, account ID, profile picture, and more. The information returned may be restricted by the user's profile visibility settings.
     * **Note:** to add, edit, or delete users in your organization, see the [user management REST API](/cloud/admin/user-management/about/).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-user]
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (required)
     * @param expand               A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.   - {@code personalSpace} returns the user's personal space, if it exists.   - {@code isExternalCollaborator} returns whether the user is an external collaborator user. (optional)
     */
    @RequestLine("GET /wiki/rest/api/user?accountId={accountId}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<User> getUser(@Param("accountId") @NotNull String accountId, @Param("expand") @Nullable List<String> expand);

    /**
     * Get user properties
     * <p>
     * Returns the properties for a user as list of property keys. For more information about user properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/). {@code Note}, these properties stored against a user are on a Confluence site level and not space/content level.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:user.property:confluence]
     * @param userId               The account ID of the user to be queried for its properties. (required)
     * @param start                The starting index of the returned properties. (optional, defaults to 0)
     * @param limit                The maximum number of properties to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 5)
     */
    @RequestLine("GET /wiki/rest/api/user/{userId}/property?start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<UserPropertyKeyArray> getUserProperties(@Param("userId") @NotNull String userId, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get user property
     * <p>
     * Returns the property corresponding to {@code key} for a user. For more information about user properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/). {@code Note}, these properties stored against a user are on a Confluence site level and not space/content level.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:user.property:confluence]
     * @param userId               The account ID of the user to be queried for its properties. (required)
     * @param key                  The key of the user property. (required)
     */
    @RequestLine("GET /wiki/rest/api/user/{userId}/property/{key}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<UserProperty> getUserProperty(@Param("userId") @NotNull String userId, @Param("key") @NotNull String key);

    /**
     * Get viewers
     * <p>
     * Get the total number of distinct viewers a piece of content has.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param contentId            The ID of the content to get the viewers for. (required)
     * @param fromDate             The number of views for the content since the date. (optional)
     */
    @RequestLine("GET /wiki/rest/api/analytics/content/{contentId}/viewers?fromDate={fromDate}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<GetViewers200Response> getViewers(@Param("contentId") @NotNull String contentId, @Param("fromDate") @Nullable String fromDate);

    /**
     * Get views
     * <p>
     * Get the total number of views a piece of content has.
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param contentId            The ID of the content to get the views for. (required)
     * @param fromDate             The number of views for the content since the date. (optional)
     */
    @RequestLine("GET /wiki/rest/api/analytics/content/{contentId}/views?fromDate={fromDate}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<GetViews200Response> getViews(@Param("contentId") @NotNull String contentId, @Param("fromDate") @Nullable String fromDate);

    /**
     * Get space watchers
     * <p>
     * Returns a list of watchers of a space
     *
     * Authentication - Required Scopes: [read:watcher:confluence, read:user:confluence]
     * @param spaceKey             The key of the space to get watchers. (required)
     * @param start                The start point of the collection to return. (optional)
     * @param limit                The limit of the number of items to return, this may be restricted by fixed system limits. (optional)
     */
    @RequestLine("GET /wiki/rest/api/space/{spaceKey}/watch?start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<SpaceWatchArray> getWatchersForSpace(@Param("spaceKey") @NotNull String spaceKey, @Param("start") @Nullable String start, @Param("limit") @Nullable String limit);

    /**
     * Get watches for page
     * <p>
     * Returns the watches for a page. A user that watches a page will receive receive notifications when the page is updated.
     * If you want to manage watches for a page, use the following {@code user} methods:
     * - [Get content watch status for user](#api-user-watch-content-contentId-get) - [Add content watch](#api-user-watch-content-contentId-post) - [Remove content watch](#api-user-watch-content-contentId-delete)
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param id                   The ID of the content to be queried for its watches. (required)
     * @param start                The starting index of the returned watches. (optional, defaults to 0)
     * @param limit                The maximum number of watches to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 200)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/notification/child-created?start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<WatchArray> getWatchesForPage(@Param("id") @NotNull String id, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get watches for space
     * <p>
     * Returns all space watches for the space that the content is in. A user that watches a space will receive receive notifications when any content in the space is updated.
     * If you want to manage watches for a space, use the following {@code user} methods:
     * - [Get space watch status for user](#api-user-watch-space-spaceKey-get) - [Add space watch](#api-user-watch-space-spaceKey-post) - [Remove space watch](#api-user-watch-space-spaceKey-delete)
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param id                   The ID of the content to be queried for its watches. (required)
     * @param start                The starting index of the returned watches. (optional, defaults to 0)
     * @param limit                The maximum number of watches to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 200)
     */
    @RequestLine("GET /wiki/rest/api/content/{id}/notification/created?start={start}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<SpaceWatchArray> getWatchesForSpace(@Param("id") @NotNull String id, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit);

    /**
     * Get label watch status
     * <p>
     * Returns whether a user is watching a label. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param labelName            The name of the label to be queried for whether the specified user is watching it. (required)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (optional)
     */
    @RequestLine("GET /wiki/rest/api/user/watch/label/{labelName}?key={key}&username={username}&accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<UserWatch> isWatchingLabel(@Param("labelName") @NotNull String labelName, @Param("key") @Nullable String key, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Get space watch status
     * <p>
     * Returns whether a user is watching a space. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spaceKey             The key of the space to be queried for whether the specified user is watching it. (required)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (optional)
     */
    @RequestLine("GET /wiki/rest/api/user/watch/space/{spaceKey}?key={key}&username={username}&accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<UserWatch> isWatchingSpace(@Param("spaceKey") @NotNull String spaceKey, @Param("key") @Nullable String key, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Move a page to a new location relative to a target page
     * <p>
     * Move a page to a new location relative to a target page:
     * * {@code before} - move the page under the same parent as the target, before the target in the list of children * {@code after} - move the page under the same parent as the target, after the target in the list of children * {@code append} - move the page to be a child of the target
     * Caution: This API can move pages to the top level of a space. Top-level pages are difficult to find in the UI because they do not show up in the page tree display. To avoid this, never use {@code before} or {@code after} positions when the {@code targetId} is a top-level page.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param pageId               The ID of the page to be moved (required)
     * @param position             The position to move the page to relative to the target page: * {@code before} - move the page under the same parent as the target, before the target in the list of children * {@code after} - move the page under the same parent as the target, after the target in the list of children * {@code append} - move the page to be a child of the target (required)
     * @param targetId             The ID of the target page for this operation (required)
     */
    @RequestLine("PUT /wiki/rest/api/content/{pageId}/move/{position}/{targetId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MovePage200Response> movePage(@Param("pageId") @NotNull String pageId, @Param("position") @NotNull String position, @Param("targetId") @NotNull String targetId);

    /**
     * Publish legacy draft
     * <p>
     * Publishes a legacy draft of a page created from a blueprint. Legacy drafts will eventually be removed in favor of shared drafts. For now, this method works the same as [Publish shared draft](#api-content-blueprint-instance-draftId-put).
     * By default, the following objects are expanded: {@code body.storage}, {@code history}, {@code space}, {@code version}, {@code ancestors}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the draft and 'Add' permission for the space that the content will be created in.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param draftId              The ID of the draft page that was created from a blueprint. You can find the {@code draftId} in the Confluence application by opening the draft page and checking the page URL. (required)
     * @param body                  (required)
     * @param status               The status of the content to be updated, i.e. the draft. This is set to 'draft' by default, so you shouldn't need to specify it. (optional, defaults to draft)
     * @param expand               A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment. (optional)
     */
    @RequestLine("POST /wiki/rest/api/content/blueprint/instance/{draftId}?status={status}&expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Content> publishLegacyDraft(@Param("draftId") @NotNull String draftId, @NotNull ContentBlueprintDraft body, @Param("status") @Nullable String status, @Param("expand") @Nullable List<String> expand);

    /**
     * Publish shared draft
     * <p>
     * Publishes a shared draft of a page created from a blueprint.
     * By default, the following objects are expanded: {@code body.storage}, {@code history}, {@code space}, {@code version}, {@code ancestors}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the draft and 'Add' permission for the space that the content will be created in.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param draftId              The ID of the draft page that was created from a blueprint. You can find the {@code draftId} in the Confluence application by opening the draft page and checking the page URL. (required)
     * @param body                  (required)
     * @param status               The status of the content to be updated, i.e. the draft. This is set to 'draft' by default, so you shouldn't need to specify it. (optional, defaults to draft)
     * @param expand               A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment. (optional)
     */
    @RequestLine("PUT /wiki/rest/api/content/blueprint/instance/{draftId}?status={status}&expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Content> publishSharedDraft(@Param("draftId") @NotNull String draftId, @NotNull ContentBlueprintDraft body, @Param("status") @Nullable String status, @Param("expand") @Nullable List<String> expand);

    /**
     * Register modules
     * <p>
     * Registers a list of modules. For the list of modules that support dynamic registration, see [Dynamic modules](https://developer.atlassian.com/cloud/confluence/dynamic-modules/).
     * **[Permissions](#permissions) required:** Only Connect apps can make this request.
     *
     * @param body                  (required)
     */
    @RequestLine("POST /atlassian-connect/1/app/module/dynamic")
    @Headers({
        "Content-Type: */*", 
        "Accept: application/json"
    })
    CompletableFuture<Void> registerModules(@NotNull ConnectModules body);

    /**
     * Removes the content state of a content and publishes a new version.
     * <p>
     * Removes the content state of the content specified and creates a new version (publishes the content without changing the body) of the content with the new status.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The Id of the content whose content state is to be set. (required)
     * @param status               status of content state from which to delete state. Can be draft or archived (optional)
     */
    @RequestLine("DELETE /wiki/rest/api/content/{id}/state?status={status}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentStateResponse> removeContentState(@Param("id") @NotNull String id, @Param("status") @Nullable String status);

    /**
     * Remove content watcher
     * <p>
     * Removes a user as a watcher from a piece of content. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param xAtlassianToken      Note, you must add header when making a request, as this operation has XSRF protection. (required)
     * @param contentId            The ID of the content to remove the watcher from. (required)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (optional)
     */
    @RequestLine("DELETE /wiki/rest/api/user/watch/content/{contentId}?key={key}&username={username}&accountId={accountId}")
    @Headers({
        "X-Atlassian-Token: {xAtlassianToken}", 
        "Accept: application/json"
    })
    CompletableFuture<Void> removeContentWatcher(@Param("xAtlassianToken") @NotNull String xAtlassianToken, @Param("contentId") @NotNull String contentId, @Param("key") @Nullable String key, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Delete user group
     * <p>
     * Delete user group.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: User must be a site admin.
     *
     * Authentication - Required Scopes: [write:confluence-groups]
     * @param name                 Name of the group to delete. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("DELETE /wiki/rest/api/group?name={name}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> removeGroup(@Param("name") @NotNull String name);

    /**
     * Delete user group
     * <p>
     * Delete user group.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: User must be a site admin.
     *
     * Authentication - Required Scopes: [write:confluence-groups]
     * @param id                   Id of the group to delete. (required)
     */
    @RequestLine("DELETE /wiki/rest/api/group/by-id?id={id}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> removeGroupById(@Param("id") @NotNull String id);

    /**
     * Remove group from content restriction
     * <p>
     * Removes a group from a content restriction. That is, remove read or update permission for the group for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content that the restriction applies to. (required)
     * @param operationKey         The operation that the restriction applies to. (required)
     * @param groupId              The id of the group to remove from the content restriction. (required)
     */
    @RequestLine("DELETE /wiki/rest/api/content/{id}/restriction/byOperation/{operationKey}/byGroupId/{groupId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> removeGroupFromContentRestriction(@Param("id") @NotNull String id, @Param("operationKey") @NotNull String operationKey, @Param("groupId") @NotNull String groupId);

    /**
     * Remove group from content restriction
     * <p>
     * Deprecated, use [Remove group from content restriction by groupId](https://developer.atlassian.com/cloud/confluence/rest/v1/api-group-content-restrictions/#api-wiki-rest-api-content-id-restriction-byoperation-operationkey-user-delete). Removes a group from a content restriction. That is, remove read or update permission for the group for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content that the restriction applies to. (required)
     * @param operationKey         The operation that the restriction applies to. (required)
     * @param groupName            The name of the group to remove from the content restriction. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("DELETE /wiki/rest/api/content/{id}/restriction/byOperation/{operationKey}/group/{groupName}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> removeGroupFromContentRestrictionById(@Param("id") @NotNull String id, @Param("operationKey") @NotNull String operationKey, @Param("groupName") @NotNull String groupName);

    /**
     * Remove label from content
     * <p>
     * Removes a label from a piece of content. Labels can't be deleted from archived content. This is similar to [Remove label from content using query parameter](#api-content-id-label-delete) except that the label name is specified via a path parameter.
     * Use this method if the label name does not have "/" characters, as the path parameter does not accept "/" characters for security reasons. Otherwise, use [Remove label from content using query parameter](#api-content-id-label-delete).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content that the label will be removed from. (required)
     * @param label                The name of the label to be removed. (required)
     */
    @RequestLine("DELETE /wiki/rest/api/content/{id}/label/{label}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> removeLabelFromContent(@Param("id") @NotNull String id, @Param("label") @NotNull String label);

    /**
     * Remove label from content using query parameter
     * <p>
     * Removes a label from a piece of content. Labels can't be deleted from archived content. This is similar to [Remove label from content](#api-content-id-label-label-delete) except that the label name is specified via a query parameter.
     * Use this method if the label name has "/" characters, as [Remove label from content using query parameter](#api-content-id-label-delete) does not accept "/" characters for the label name.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content that the label will be removed from. (required)
     * @param name                 The name of the label to be removed. (required)
     */
    @RequestLine("DELETE /wiki/rest/api/content/{id}/label?name={name}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> removeLabelFromContentUsingQueryParameter(@Param("id") @NotNull String id, @Param("name") @NotNull String name);

    /**
     * Remove label watcher
     * <p>
     * Removes a user as a watcher from a label. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param labelName            The name of the label to remove the watcher from. (required)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (optional)
     */
    @RequestLine("DELETE /wiki/rest/api/user/watch/label/{labelName}?key={key}&username={username}&accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> removeLabelWatcher(@Param("labelName") @NotNull String labelName, @Param("key") @Nullable String key, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Remove member from group
     * <p>
     * Remove user as a member from a group.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: User must be a site admin.
     *
     * Authentication - Required Scopes: [write:confluence-groups]
     * @param name                 Name of the group whose membership is updated. (required)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("DELETE /wiki/rest/api/group/user?name={name}&key={key}&username={username}&accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> removeMemberFromGroup(@Param("name") @NotNull String name, @Param("key") @Nullable String key, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Remove member from group using group id
     * <p>
     * Remove user as a member from a group.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: User must be a site admin.
     *
     * Authentication - Required Scopes: [write:confluence-groups]
     * @param groupId              Id of the group whose membership is updated. (required)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (optional)
     */
    @RequestLine("DELETE /wiki/rest/api/group/userByGroupId?groupId={groupId}&key={key}&username={username}&accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> removeMemberFromGroupByGroupId(@Param("groupId") @NotNull String groupId, @Param("key") @Nullable String key, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Remove modules
     * <p>
     * Remove all or a list of modules registered by the calling app.
     * **[Permissions](#permissions) required:** Only Connect apps can make this request.
     *
     * @param moduleKey            The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, {@code moduleKey=dynamic-attachment-entity-property&amp;moduleKey=dynamic-select-field}. Nonexistent keys are ignored. (required)
     */
    @RequestLine("DELETE /atlassian-connect/1/app/module/dynamic?moduleKey={moduleKey}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> removeModules(@Param("moduleKey") @NotNull List<String> moduleKey);

    /**
     * Remove a space permission
     * <p>
     * Removes a space permission. Note that removing Read Space permission for a user or group will remove all the space permissions for that user or group.
     * Note: Apps cannot access this REST resource - including when utilizing user impersonation.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [write:space.permission:confluence]
     * @param spaceKey             The key of the space to be queried for its content. (required)
     * @param id                   Id of the permission to be deleted. (required)
     */
    @RequestLine("DELETE /wiki/rest/api/space/{spaceKey}/permission/{id}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> removePermission(@Param("spaceKey") @NotNull String spaceKey, @Param("id") @NotNull Integer id);

    /**
     * Remove space watch
     * <p>
     * Removes a user as a watcher from a space. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spaceKey             The key of the space to remove the watcher from. (required)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (optional)
     */
    @RequestLine("DELETE /wiki/rest/api/user/watch/space/{spaceKey}?key={key}&username={username}&accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> removeSpaceWatch(@Param("spaceKey") @NotNull String spaceKey, @Param("key") @Nullable String key, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Remove template
     * <p>
     * Deletes a template. This results in different actions depending on the type of template:
     * - If the template is a content template, it is deleted. - If the template is a modified space-level blueprint template, it reverts to the template inherited from the global-level blueprint template. - If the template is a modified global-level blueprint template, it reverts to the default global-level blueprint template.
     *  Note, unmodified blueprint templates cannot be deleted.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**:
     * 
     * 
     * 
     *  'Admin' permission for the space to delete a space template or 'Confluence Administrator'
     * 
     * 
     * 
     *  global permission to delete a global template.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param contentTemplateId    The ID of the template to be deleted. (required)
     */
    @RequestLine("DELETE /wiki/rest/api/template/{contentTemplateId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> removeTemplate(@Param("contentTemplateId") @NotNull String contentTemplateId);

    /**
     * Remove user from content restriction
     * <p>
     * Removes a group from a content restriction. That is, remove read or update permission for the group for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content that the restriction applies to. (required)
     * @param operationKey         The operation that the restriction applies to. (required)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. (optional)
     */
    @RequestLine("DELETE /wiki/rest/api/content/{id}/restriction/byOperation/{operationKey}/user?key={key}&username={username}&accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> removeUserFromContentRestriction(@Param("id") @NotNull String id, @Param("operationKey") @NotNull String operationKey, @Param("key") @Nullable String key, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Reset look and feel settings
     * <p>
     * Resets the custom look and feel settings for the site or a single space. This changes the values of the custom settings to be the same as the default settings. It does not change which settings (default or custom) are selected. Note, the default space settings are inherited from the current global settings.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [manage:confluence-configuration]
     * @param spaceKey             The key of the space for which the look and feel settings will be reset. If this is not set, the global look and feel settings will be reset. (optional)
     */
    @RequestLine("DELETE /wiki/rest/api/settings/lookandfeel/custom?spaceKey={spaceKey}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> resetLookAndFeelSettings(@Param("spaceKey") @Nullable String spaceKey);

    /**
     * Reset space theme
     * <p>
     * Resets the space theme. This means that the space will inherit the global look and feel settings
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spaceKey             The key of the space to reset the theme for. (required)
     */
    @RequestLine("DELETE /wiki/rest/api/space/{spaceKey}/theme")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> resetSpaceTheme(@Param("spaceKey") @NotNull String spaceKey);

    /**
     * Restore content version
     * <p>
     * Restores a historical version to be the latest version. That is, a new version is created with the content of the historical version.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content for which the history will be restored. (required)
     * @param body                 The content version to be restored. (required)
     * @param expand               A multi-value parameter indicating which properties of the content to expand. By default, the {@code content} object is expanded.  - {@code collaborators} returns the users that collaborated on the version. - {@code content} returns the content for the version. (optional)
     */
    @RequestLine("POST /wiki/rest/api/content/{id}/version?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Version> restoreContentVersion(@Param("id") @NotNull String id, @NotNull VersionRestore body, @Param("expand") @Nullable List<String> expand);

    /**
     * Search content
     * <p>
     * Searches for content using the [Confluence Query Language (CQL)](https://developer.atlassian.com/cloud/confluence/advanced-searching-using-cql/).
     * **Note that CQL input queries submitted through the {@code /wiki/rest/api/search} endpoint no longer support user-specific fields like {@code user}, {@code user.fullname}, {@code user.accountid}, and {@code user.userkey}.**
     * See this [deprecation notice](https://developer.atlassian.com/cloud/confluence/deprecation-notice-search-api/) for more details.
     * Example initial call: {@code }{@code  /wiki/rest/api/search?cql=type=page&amp;limit=25 }{@code }
     * Example response: {@code }` {
     *  "results": [
     * 
     *  { ... },
     * 
     *  { ... },
     * 
     *  ...
     * 
     *  { ... }
     *  ],
     *  "limit": 25,
     *  "size": 25,
     *  ...
     *  "_links": {
     * 
     *  "base": "&amp;lt;url&amp;gt;",
     * 
     *  "context": "&amp;lt;url&amp;gt;",
     * 
     *  "next": "/rest/api/search?cql=type=page&amp;limit=25&amp;cursor=raNDoMsTRiNg",
     * 
     *  "self": "&amp;lt;url&amp;gt;"
     *  } } {@code }`
     * When additional results are available, returns {@code next} and {@code prev} URLs to retrieve them in subsequent calls. The URLs each contain a cursor that points to the appropriate set of results. Use {@code limit} to specify the number of results returned in each call.
     * Example subsequent call (taken from example response): {@code }{@code  /wiki/rest/api/search?cql=type=page&amp;limit=25&amp;cursor=raNDoMsTRiNg }{@code } The response to this will have a {@code prev} URL similar to the {@code next} in the example response.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the entities. Note, only entities that the user has permission to view will be returned.
     *
     * Authentication - Required Scopes: [search:confluence]
     * @param cql                  The CQL query to be used for the search. See [Advanced Searching using CQL](https://developer.atlassian.com/cloud/confluence/advanced-searching-using-cql/) for instructions on how to build a CQL query. (required)
     * @param cqlcontext           The space, content, and content status to execute the search against.  - {@code spaceKey} Key of the space to search against. Optional. - {@code contentId} ID of the content to search against. Optional. Must be in the space specified by {@code spaceKey}. - {@code contentStatuses} Content statuses to search against. Optional.  Specify these values in an object. For example, {@code cqlcontext={%22spaceKey%22:%22TEST%22, %22contentId%22:%22123%22}} (optional)
     * @param cursor               Pointer to a set of search results, returned as part of the {@code next} or {@code prev} URL from the previous search call. (optional)
     * @param next                  (optional, defaults to false)
     * @param prev                  (optional, defaults to false)
     * @param limit                The maximum number of content objects to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     * @param start                The start point of the collection to return (optional, defaults to 0)
     * @param includeArchivedSpaces Whether to include content from archived spaces in the results. (optional, defaults to false)
     * @param excludeCurrentSpaces Whether to exclude current spaces and only show archived spaces. (optional, defaults to false)
     * @param excerpt              The excerpt strategy to apply to the result (optional, defaults to highlight)
     * @param sitePermissionTypeFilter Filters users by permission type. Use {@code none} to default to licensed users, {@code externalCollaborator} for external/guest users, and {@code all} to include all permission types. (optional, defaults to none)
     * @param _u                    (optional)
     * @param expand                (optional)
     */
    @RequestLine("GET /wiki/rest/api/search?cql={cql}&cqlcontext={cqlcontext}&cursor={cursor}&next={next}&prev={prev}&limit={limit}&start={start}&includeArchivedSpaces={includeArchivedSpaces}&excludeCurrentSpaces={excludeCurrentSpaces}&excerpt={excerpt}&sitePermissionTypeFilter={sitePermissionTypeFilter}&_={_u}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<SearchPageResponseSearchResult> searchByCQL(@Param("cql") @NotNull String cql, @Param("cqlcontext") @Nullable String cqlcontext, @Param("cursor") @Nullable String cursor, @Param("next") @Nullable Boolean next, @Param("prev") @Nullable Boolean prev, @Param("limit") @Nullable Integer limit, @Param("start") @Nullable Integer start, @Param("includeArchivedSpaces") @Nullable Boolean includeArchivedSpaces, @Param("excludeCurrentSpaces") @Nullable Boolean excludeCurrentSpaces, @Param("excerpt") @Nullable String excerpt, @Param("sitePermissionTypeFilter") @Nullable String sitePermissionTypeFilter, @Param("_u") @Nullable Long _u, @Param("expand") @Nullable List<String> expand);

    /**
     * Search content by CQL
     * <p>
     * Returns the list of content that matches a Confluence Query Language (CQL) query. For information on CQL, see: [Advanced searching using CQL](https://developer.atlassian.com/cloud/confluence/advanced-searching-using-cql/).
     * Example initial call: {@code }{@code  /wiki/rest/api/content/search?cql=type=page&amp;limit=25 }{@code }
     * Example response: {@code }` {
     *  "results": [
     * 
     *  { ... },
     * 
     *  { ... },
     * 
     *  ...
     * 
     *  { ... }
     *  ],
     *  "limit": 25,
     *  "size": 25,
     *  ...
     *  "_links": {
     * 
     *  "base": "&amp;lt;url&amp;gt;",
     * 
     *  "context": "&amp;lt;url&amp;gt;",
     * 
     *  "next": "/rest/api/content/search?cql=type=page&amp;limit=25&amp;cursor=raNDoMsTRiNg",
     * 
     *  "self": "&amp;lt;url&amp;gt;"
     *  } } {@code }`
     * When additional results are available, returns {@code next} and {@code prev} URLs to retrieve them in subsequent calls. The URLs each contain a cursor that points to the appropriate set of results. Use {@code limit} to specify the number of results returned in each call. Example subsequent call (taken from example response): {@code }{@code  /wiki/rest/api/content/search?cql=type=page&amp;limit=25&amp;cursor=raNDoMsTRiNg }{@code } The response to this will have a {@code prev} URL similar to the {@code next} in the example response.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only content that the user has permission to view will be returned.
     *
     * Authentication - Required Scopes: [search:confluence]
     * @param cql                  The CQL string that is used to find the requested content. (required)
     * @param cqlcontext           The space, content, and content status to execute the search against. Specify this as an object with the following properties:  - {@code spaceKey} Key of the space to search against. Optional. - {@code contentId} ID of the content to search against. Optional. Must be in the space spacified by {@code spaceKey}. - {@code contentStatuses} Content statuses to search against. Optional. (optional)
     * @param expand               A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment. (optional)
     * @param cursor               Pointer to a set of search results, returned as part of the {@code next} or {@code prev} URL from the previous search call. (optional)
     * @param limit                The maximum number of content objects to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     */
    @RequestLine("GET /wiki/rest/api/content/search?cql={cql}&cqlcontext={cqlcontext}&expand={expand}&cursor={cursor}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentArray> searchContentByCQL(@Param("cql") @NotNull String cql, @Param("cqlcontext") @Nullable String cqlcontext, @Param("expand") @Nullable List<String> expand, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit);

    /**
     * Search groups by partial query
     * <p>
     * Get search results of groups by partial query provided.
     *
     * Authentication - Required Scopes: [read:confluence-groups]
     * @param query                the search term used to query results. (required)
     * @param start                The starting index of the returned groups. (optional, defaults to 0)
     * @param limit                The maximum number of groups to return per page. Note, this is restricted to a maximum limit of 200 groups. (optional, defaults to 200)
     * @param shouldReturnTotalSize Whether to include total size parameter in the results. Note, fetching total size property is an expensive operation; use it if your use case needs this value. (optional, defaults to false)
     */
    @RequestLine("GET /wiki/rest/api/group/picker?query={query}&start={start}&limit={limit}&shouldReturnTotalSize={shouldReturnTotalSize}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<GroupArrayWithLinks> searchGroups(@Param("query") @NotNull String query, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit, @Param("shouldReturnTotalSize") @Nullable Boolean shouldReturnTotalSize);

    /**
     * Get inline tasks based on search parameters
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns inline tasks based on the search query.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only tasks in contents that the user has permission to view are returned.
     *
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param start                The starting offset for the results. (optional, defaults to 0)
     * @param limit                The number of results to be returned. (optional, defaults to 20)
     * @param spaceKey             The space key of a space. Multiple space keys can be specified. (optional)
     * @param pageId               The page id of a page. Multiple page ids can be specified. (optional)
     * @param assignee             Account ID of a user to whom a task is assigned. Multiple users can be specified. (optional)
     * @param creator              Account ID of a user to who created a task. Multiple users can be specified. (optional)
     * @param completedUser        Account ID of a user who completed a task. Multiple users can be specified. (optional)
     * @param duedateFrom          Start of date range based on due dates (inclusive). (optional)
     * @param duedateTo            End of date range based on due dates (inclusive). (optional)
     * @param createdateFrom       Start of date range based on create dates (inclusive). (optional)
     * @param createdateTo         End of date range based on create dates (inclusive). (optional)
     * @param completedateFrom     Start of date range based on complete dates (inclusive). (optional)
     * @param completedateTo       End of date range based on complete dates (inclusive). (optional)
     * @param status               The status of the task. (checked/unchecked) (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /wiki/rest/api/inlinetasks/search?start={start}&limit={limit}&spaceKey={spaceKey}&pageId={pageId}&assignee={assignee}&creator={creator}&completedUser={completedUser}&duedateFrom={duedateFrom}&duedateTo={duedateTo}&createdateFrom={createdateFrom}&createdateTo={createdateTo}&completedateFrom={completedateFrom}&completedateTo={completedateTo}&status={status}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<TaskPageResponse> searchTasks(@Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit, @Param("spaceKey") @Nullable String spaceKey, @Param("pageId") @Nullable String pageId, @Param("assignee") @Nullable String assignee, @Param("creator") @Nullable String creator, @Param("completedUser") @Nullable String completedUser, @Param("duedateFrom") @Nullable Long duedateFrom, @Param("duedateTo") @Nullable Long duedateTo, @Param("createdateFrom") @Nullable Long createdateFrom, @Param("createdateTo") @Nullable Long createdateTo, @Param("completedateFrom") @Nullable Long completedateFrom, @Param("completedateTo") @Nullable Long completedateTo, @Param("status") @Nullable String status);

    /**
     * Search users
     * <p>
     * Searches for users using user-specific queries from the [Confluence Query Language (CQL)](https://developer.atlassian.com/cloud/confluence/advanced-searching-using-cql/).
     * Note that CQL input queries submitted through the {@code /wiki/rest/api/search/user} endpoint only support user-specific fields like {@code user}, {@code user.fullname}, {@code user.accountid}, and {@code user.userkey}.
     * Note that some user fields may be set to null depending on the user's privacy settings. These are: email, profilePicture, displayName, and timeZone.
     *
     * Authentication - Required Scopes: [read:content-details:confluence]
     * @param cql                  The CQL query to be used for the search. See [Advanced Searching using CQL](https://developer.atlassian.com/cloud/confluence/advanced-searching-using-cql/) for instructions on how to build a CQL query.  Example queries:           cql=type=user will return all users           cql=user="1234" will return user with accountId "1234"           You can also use IN, NOT IN, != operators           cql=user IN ("12", "34") will return users with accountids "12" and "34"           cql=user.fullname~jo will return users with nickname/full name starting with "jo"           cql=user.accountid="123" will return user with accountId "123" (required)
     * @param start                The starting index of the returned users. (optional, defaults to 0)
     * @param limit                The maximum number of user objects to return per page. Note, this may be restricted by fixed system limits. (optional, defaults to 25)
     * @param expand               A multi-value parameter indicating which properties of the user to expand.  - {@code operations} returns the operations for the user, which are used when setting permissions. - {@code personalSpace} returns the personal space of the user. (optional)
     * @param sitePermissionTypeFilter Filters users by permission type. Use {@code none} to default to licensed users, {@code externalCollaborator} for external/guest users, and {@code all} to include all permission types. (optional, defaults to none)
     */
    @RequestLine("GET /wiki/rest/api/search/user?cql={cql}&start={start}&limit={limit}&expand={expand}&sitePermissionTypeFilter={sitePermissionTypeFilter}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<SearchPageResponseSearchResult> searchUser(@Param("cql") @NotNull String cql, @Param("start") @Nullable Integer start, @Param("limit") @Nullable Integer limit, @Param("expand") @Nullable List<String> expand, @Param("sitePermissionTypeFilter") @Nullable String sitePermissionTypeFilter);

    /**
     * Set the content state of a content and publishes a new version of the content.
     * <p>
     * Sets the content state of the content specified and creates a new version (publishes the content without changing the body) of the content with the new state.
     * You may pass in either an id of a state, or the name and color of a desired new state. If all 3 are passed in, id will be used. If the name and color passed in already exist under the current user's existing custom states, the existing state will be reused. If custom states are disabled in the space of the content (which can be determined by getting the content state space settings of the content's space) then this set will fail.
     * You may not remove a content state via this PUT request. You must use the DELETE method. A specified state is required in the body of this request.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The Id of the content whose content state is to be set. (required)
     * @param contentStateRestInput Content state fields for state. Pass in id for an existing state, or new name and color for best matching existing state, or new state if allowed in space. (required)
     * @param status               Status of content onto which state will be placed. If draft, then draft state will change. If current, state will be placed onto a new version of the content with same body as previous version. (optional)
     */
    @RequestLine("PUT /wiki/rest/api/content/{id}/state?status={status}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentStateResponse> setContentState(@Param("id") @NotNull String id, @NotNull ContentStateRestInput contentStateRestInput, @Param("status") @Nullable String status);

    /**
     * Set look and feel settings
     * <p>
     * Sets the look and feel settings to either the default settings or the custom settings, for the site or a single space. Note, the default space settings are inherited from the current global settings.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [manage:confluence-configuration]
     * @param body                 The look and feel type to be set. (required)
     * @param spaceKey             The key of the space for which the look and feel settings will be set. If this is not set, the global look and feel settings will be set. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("PUT /wiki/rest/api/settings/lookandfeel/selected?spaceKey={spaceKey}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<String> setLookAndFeelSettings(@NotNull String body, @Param("spaceKey") @Nullable String spaceKey);

    /**
     * Set retention period
     * <p>
     * Sets the retention period for records in the audit log. The retention period can be set to a maximum of 1 year.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission.
     *
     * Authentication - Required Scopes: [write:audit-log:confluence]
     * @param body                 The updated retention period. (required)
     */
    @RequestLine("PUT /wiki/rest/api/audit/retention")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<RetentionPeriod> setRetentionPeriod(@NotNull RetentionPeriod body);

    /**
     * Set space theme
     * <p>
     * Sets the theme for a space. Note, if you want to reset the space theme to the default Confluence theme, use the 'Reset space theme' method instead of this method.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spaceKey             The key of the space to set the theme for. (required)
     * @param body                  (required)
     */
    @RequestLine("PUT /wiki/rest/api/space/{spaceKey}/theme")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Theme> setSpaceTheme(@Param("spaceKey") @NotNull String spaceKey, @NotNull ThemeUpdate body);

    /**
     * Update attachment data
     * <p>
     * Updates the binary data of an attachment, given the attachment ID, and optionally the comment and the minor edit field.
     * This method is essentially the same as [Create or update attachments](#api-content-id-child-attachment-put), except that it matches the attachment ID rather than the name.
     * Note, you must set a {@code X-Atlassian-Token: nocheck} header on the request for this method, otherwise it will be blocked. This protects against XSRF attacks, which is necessary as this method accepts multipart/form-data.
     * The media type 'multipart/form-data' is defined in [RFC 7578](https://www.ietf.org/rfc/rfc7578.txt). Most client libraries have classes that make it easier to implement multipart posts, like the [MultipartEntityBuilder](https://hc.apache.org/httpcomponents-client-5.1.x/current/httpclient5/apidocs/) Java class provided by Apache HTTP Components.
     * Note, according to [RFC 7578](https://tools.ietf.org/html/rfc7578#section-4.5), in the case where the form data is text, the charset parameter for the "text/plain" Content-Type may be used to indicate the character encoding used in that part. In the case of this API endpoint, the {@code comment} body parameter should be sent with {@code type=text/plain} and {@code charset=utf-8} values. This will force the charset to be UTF-8.
     * Example: This curl command updates an attachment (id='att456') that is attached to a piece of content (id='123') with a comment and {@code minorEdits}=true.
     * {@code }` bash curl -D- \\
     *  -u admin:admin \\
     *  -X POST \\
     *  -H 'X-Atlassian-Token: nocheck' \\
     *  -F 'file=@"example.txt"' \\
     *  -F 'minorEdit="true"' \\
     *  -F 'comment="Example attachment comment"; type=text/plain; charset=utf-8' \\
     *  http://myhost/rest/api/content/123/child/attachment/att456/data {@code }` **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-file]
     * @param id                   The ID of the content that the attachment is attached to. (required)
     * @param attachmentId         The ID of the attachment to update. (required)
     * @param _file                The relative location and name of the attachment to be added to the content. (required)
     * @param minorEdit            If {@code minorEdits} is set to 'true', no notification email or activity stream will be generated when the attachment is added to the content. (required)
     * @param comment              The comment for the attachment that is being added. If you specify a comment, then every file must have a comment and the comments must be in the same order as the files. Alternatively, don't specify any comments. (optional)
     */
    @RequestLine("POST /wiki/rest/api/content/{id}/child/attachment/{attachmentId}/data")
    @Headers({
        "Content-Type: multipart/form-data", 
        "Accept: application/json"
    })
    CompletableFuture<Content> updateAttachmentData(@Param("id") @NotNull String id, @Param("attachmentId") @NotNull String attachmentId, @Param("file") @NotNull File _file, @Param("minorEdit") @NotNull File minorEdit, @Param("comment") @Nullable File comment);

    /**
     * Update attachment properties
     * <p>
     * Updates the attachment properties, i.e. the non-binary data of an attachment like the filename, media-type, comment, and parent container.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-file, write:confluence-props]
     * @param id                   The ID of the content that the attachment is attached to. (required)
     * @param attachmentId         The ID of the attachment to update. (required)
     * @param body                 The details of the attachment to be updated. (required)
     */
    @RequestLine("PUT /wiki/rest/api/content/{id}/child/attachment/{attachmentId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Content> updateAttachmentProperties(@Param("id") @NotNull String id, @Param("attachmentId") @NotNull String attachmentId, @NotNull AttachmentPropertiesUpdateBody body);

    /**
     * Update content
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Updates a piece of content. Use this method to update the title or body of a piece of content, change the status, change the parent page, and more.
     * Note, updating draft content is currently not supported.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content to be updated. (required)
     * @param content              The updated content. (required)
     * @param status               The updated status of the content. Use this parameter to change the status of a piece of content without passing the entire request body. (optional, defaults to current)
     * @param conflictPolicy       The action that should be taken when conflicts are discovered. Only used when publishing a draft page. (optional, defaults to abort)
     * @deprecated
     */
    @Deprecated
    @RequestLine("PUT /wiki/rest/api/content/{id}?status={status}&conflictPolicy={conflictPolicy}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Content> updateContent(@Param("id") @NotNull String id, @NotNull ContentUpdate content, @Param("status") @Nullable String status, @Param("conflictPolicy") @Nullable String conflictPolicy);

    /**
     * Update content property
     * <p>
     * Updates an existing content property. This method will also create a new property for a piece of content, if the property key does not exist and the property version is 1. For more information about content properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     *
     * Authentication - Required Scopes: [write:confluence-props]
     * @param id                   The ID of the content that the property belongs to. (required)
     * @param key                  The key of the property. (required)
     * @param body                 The content property being updated. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("PUT /wiki/rest/api/content/{id}/property/{key}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> updateContentProperty(@Param("id") @NotNull String id, @Param("key") @NotNull String key, @NotNull ContentPropertyUpdate body);

    /**
     * Update content template
     * <p>
     * Updates a content template. Note, blueprint templates cannot be updated via the REST API.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space to update a space template or 'Confluence Administrator' global permission to update a global template.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param body                 The updated content template. (required)
     */
    @RequestLine("PUT /wiki/rest/api/template")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentTemplate> updateContentTemplate(@NotNull ContentTemplateUpdate body);

    /**
     * Select look and feel settings
     * <p>
     * Sets the look and feel settings to the default (global) settings, the custom settings, or the current theme's settings for a space. The custom and theme settings can only be selected if there is already a theme set for a space. Note, the default space settings are inherited from the current global settings.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [manage:confluence-configuration]
     * @param body                 The look and feel type to be set. (required)
     */
    @RequestLine("PUT /wiki/rest/api/settings/lookandfeel")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<LookAndFeelSelection> updateLookAndFeel(@NotNull LookAndFeelSelection body);

    /**
     * Update look and feel settings
     * <p>
     * Updates the look and feel settings for the site or for a single space. If custom settings exist, they are updated. If no custom settings exist, then a set of custom settings is created.
     * Note, if a theme is selected for a space, the space look and feel settings are provided by the theme and cannot be overridden.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [manage:confluence-configuration]
     * @param body                 The updated settings. All values for the settings must be included, regardless of whether they are being changed.  One way to create the request body is to copy the settings from the response body of [Get look and feel settings](#api-settings-lookandfeel-get) and modify it as needed. (required)
     * @param spaceKey             The key of the space for which the look and feel settings will be updated. If this is not set, the global look and feel settings will be updated. (optional)
     */
    @RequestLine("POST /wiki/rest/api/settings/lookandfeel/custom?spaceKey={spaceKey}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<LookAndFeelWithLinks> updateLookAndFeelSettings(@NotNull LookAndFeel body, @Param("spaceKey") @Nullable String spaceKey);

    /**
     * Update restrictions
     * <p>
     * Updates restrictions for a piece of content. This removes the existing restrictions and replaces them with the restrictions in the request.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     *
     * Authentication - Required Scopes: [write:confluence-content]
     * @param id                   The ID of the content to update restrictions for. (required)
     * @param body                 The updated restrictions for the content. (required)
     * @param expand               A multi-value parameter indicating which properties of the content restrictions (returned in response) to expand.  - {@code restrictions.user} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code content} returns the piece of content that the restrictions are applied to. (optional)
     */
    @RequestLine("PUT /wiki/rest/api/content/{id}/restriction?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentRestrictionArray> updateRestrictions(@Param("id") @NotNull String id, @NotNull ContentRestrictionAddOrUpdateArray body, @Param("expand") @Nullable List<String> expand);

    /**
     * Update space
     * <p>
     * Updates the name, description, or homepage of a space.
     * -
     *  For security reasons, permissions cannot be updated via the API and must be changed via the user interface instead. -
     *  Currently you cannot set space labels when updating a space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spaceKey             The key of the space to update. (required)
     * @param body                 The updated space. (required)
     */
    @RequestLine("PUT /wiki/rest/api/space/{spaceKey}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Space> updateSpace(@Param("spaceKey") @NotNull String spaceKey, @NotNull SpaceUpdate body);

    /**
     * Update space property
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Updates a space property. Note, you cannot update the key of a space property, only the value.
     * **[Permissions required](https://confluence.atlassian.com/x/_AozKw)**: ‘Admin’ permission for the space.
     *
     * Authentication - Required Scopes: [write:confluence-props]
     * @param spaceKey             The key of the space that the property is in. (required)
     * @param key                  The key of the property to be updated. (required)
     * @param body                 The space property being updated. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("PUT /wiki/rest/api/space/{spaceKey}/property/{key}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<SpaceProperty> updateSpaceProperty(@Param("spaceKey") @NotNull String spaceKey, @Param("key") @NotNull String key, @NotNull SpacePropertyUpdate body);

    /**
     * Update space settings
     * <p>
     * Updates the settings for a space. Currently only the {@code routeOverrideEnabled} setting can be updated.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spaceKey             The key of the space whose settings will be updated. (required)
     * @param spaceSettingsUpdate  The space settings to update. (required)
     */
    @RequestLine("PUT /wiki/rest/api/space/{spaceKey}/settings")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<SpaceSettings> updateSpaceSettings(@Param("spaceKey") @NotNull String spaceKey, @NotNull SpaceSettingsUpdate spaceSettingsUpdate);

    /**
     * Update inline task given global ID
     * <p>
     * Updates an inline tasks status given its global ID
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content associated with the task.
     *
     * Authentication - Required Scopes: [read:inlinetask:confluence, write:inlinetask:confluence]
     * @param inlineTaskId         Global ID of the inline task to update (required)
     * @param taskStatusUpdate     The updated task status. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("PUT /wiki/rest/api/inlinetasks/{inlineTaskId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Task> updateTaskById(@Param("inlineTaskId") @NotNull String inlineTaskId, @NotNull TaskStatusUpdate taskStatusUpdate);

    /**
     * Update user property
     * <p>
     * Updates a property for the given user. Note, you cannot update the key of a user property, only the value. For more information about user properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/). {@code Note}, these properties stored against a user are on a Confluence site level and not space/content level.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * Authentication - Required Scopes: [write:user.property:confluence]
     * @param userId               The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192 (required)
     * @param key                  The key of the user property. (required)
     * @param body                 The user property to be updated. (required)
     */
    @RequestLine("PUT /wiki/rest/api/user/{userId}/property/{key}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Void> updateUserProperty(@Param("userId") @NotNull String userId, @Param("key") @NotNull String key, @NotNull UserPropertyUpdate body);

}
