package io.github.primelib.confluence4j.rest.v1.api;

import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import lombok.Builder;

import io.github.primelib.confluence4j.rest.v1.model.AccountId;
import io.github.primelib.confluence4j.rest.v1.model.AccountIdEmailRecord;
import io.github.primelib.confluence4j.rest.v1.model.AsyncContentBody;
import io.github.primelib.confluence4j.rest.v1.model.AsyncId;
import io.github.primelib.confluence4j.rest.v1.model.AuditRecord;
import io.github.primelib.confluence4j.rest.v1.model.AuditRecordArray;
import io.github.primelib.confluence4j.rest.v1.model.AvailableContentStates;
import io.github.primelib.confluence4j.rest.v1.model.BlueprintTemplateArray;
import io.github.primelib.confluence4j.rest.v1.model.BulkUserLookupArray;
import io.github.primelib.confluence4j.rest.v1.model.ConnectModules;
import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.ContentArray;
import io.github.primelib.confluence4j.rest.v1.model.ContentBody;
import io.github.primelib.confluence4j.rest.v1.model.ContentChildren;
import io.github.primelib.confluence4j.rest.v1.model.ContentHistory;
import io.github.primelib.confluence4j.rest.v1.model.ContentProperty;
import io.github.primelib.confluence4j.rest.v1.model.ContentPropertyArray;
import io.github.primelib.confluence4j.rest.v1.model.ContentRestriction;
import io.github.primelib.confluence4j.rest.v1.model.ContentRestrictionArray;
import io.github.primelib.confluence4j.rest.v1.model.ContentState;
import io.github.primelib.confluence4j.rest.v1.model.ContentStateBulkSetTaskUpdate;
import io.github.primelib.confluence4j.rest.v1.model.ContentStateResponse;
import io.github.primelib.confluence4j.rest.v1.model.ContentStateSettings;
import io.github.primelib.confluence4j.rest.v1.model.ContentTemplate;
import io.github.primelib.confluence4j.rest.v1.model.ContentTemplateArray;
import java.io.File;
import io.github.primelib.confluence4j.rest.v1.model.GetContentForSpace200Response;
import io.github.primelib.confluence4j.rest.v1.model.GetRestrictionsByOperation200ResponseValue;
import io.github.primelib.confluence4j.rest.v1.model.GetViewers200Response;
import io.github.primelib.confluence4j.rest.v1.model.GetViews200Response;
import io.github.primelib.confluence4j.rest.v1.model.Group;
import io.github.primelib.confluence4j.rest.v1.model.GroupArrayWithLinks;
import io.github.primelib.confluence4j.rest.v1.model.LabelArray;
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
import io.github.primelib.confluence4j.rest.v1.model.SpacePermissionV2;
import io.github.primelib.confluence4j.rest.v1.model.SpaceProperty;
import io.github.primelib.confluence4j.rest.v1.model.SpacePropertyArray;
import io.github.primelib.confluence4j.rest.v1.model.SpaceSettings;
import io.github.primelib.confluence4j.rest.v1.model.SpaceWatchArray;
import io.github.primelib.confluence4j.rest.v1.model.SystemInfoEntity;
import io.github.primelib.confluence4j.rest.v1.model.Task;
import io.github.primelib.confluence4j.rest.v1.model.TaskPageResponse;
import io.github.primelib.confluence4j.rest.v1.model.Theme;
import io.github.primelib.confluence4j.rest.v1.model.ThemeArray;
import io.github.primelib.confluence4j.rest.v1.model.User;
import io.github.primelib.confluence4j.rest.v1.model.UserAnonymous;
import io.github.primelib.confluence4j.rest.v1.model.UserArray;
import io.github.primelib.confluence4j.rest.v1.model.UserProperty;
import io.github.primelib.confluence4j.rest.v1.model.UserPropertyKeyArray;
import io.github.primelib.confluence4j.rest.v1.model.UserWatch;
import io.github.primelib.confluence4j.rest.v1.model.Version;
import io.github.primelib.confluence4j.rest.v1.model.VersionArray;
import io.github.primelib.confluence4j.rest.v1.model.WatchArray;

import java.util.function.Consumer;

import io.github.primelib.confluence4j.rest.v1.spec.AddContentWatcherOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.AddCustomContentPermissionsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.AddGroupToContentRestrictionOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.AddGroupToContentRestrictionByGroupIdOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.AddLabelWatcherOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.AddLabelsToContentOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.AddLabelsToSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.AddPermissionToSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.AddRestrictionsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.AddSpaceWatcherOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.AddUserToContentRestrictionOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.AddUserToGroupOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.AddUserToGroupByGroupIdOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.ArchivePagesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.AsyncConvertContentBodyRequestOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.AsyncConvertContentBodyResponseOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.BulkRemoveContentStatesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.BulkSetContentStatesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CheckContentPermissionOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.ConvertContentBodyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CopyPageOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CopyPageHierarchyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CreateAttachmentOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CreateAuditRecordOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CreateContentOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CreateContentPropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CreateContentPropertyForKeyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CreateContentTemplateOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CreateGroupOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CreateOrUpdateAttachmentsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CreatePrivateSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CreateRelationshipOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CreateSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CreateSpacePropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CreateSpacePropertyForKeyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.CreateUserPropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.DeleteContentOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.DeleteContentPropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.DeleteContentVersionOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.DeleteLabelFromSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.DeletePageTreeOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.DeleteRelationshipOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.DeleteRestrictionsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.DeleteSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.DeleteSpacePropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.DeleteUserPropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.DownloadAttatchmentOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.ExportAuditRecordsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.FindSourcesForTargetOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.FindTargetFromSourceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetAllLabelContentOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetAndAsyncConvertMacroBodyByMacroIdOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetAndConvertMacroBodyByMacroIdOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetAnonymousUserOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetAttachmentsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetAuditRecordsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetAuditRecordsForTimePeriodOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetAvailableContentStatesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetBlueprintTemplatesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetBulkUserLookupOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentByTypeForSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentChildrenOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentChildrenByTypeOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentCommentsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentDescendantsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentForSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentPropertiesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentPropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentRestrictionStatusForGroupOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentRestrictionStatusForUserOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentStateOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentStateSettingsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentTemplateOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentTemplatesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentVersionOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentVersionsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentWatchStatusOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetContentsWithStateOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetCurrentUserOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetDescendantsOfTypeOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetGroupByGroupIdOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetGroupByNameOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetGroupByQueryParamOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetGroupMembersOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetGroupMembersByGroupIdOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetGroupMembershipsForUserOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetGroupsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetHistoryForContentOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetIndividualGroupRestrictionStatusByGroupIdOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetLabelsForContentOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetLabelsForSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetLookAndFeelSettingsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetMacroBodyByMacroIdOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetMembersByQueryParamOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetPrivacyUnsafeUserEmailOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetPrivacyUnsafeUserEmailBulkOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetRelationshipOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetRestrictionsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetRestrictionsByOperationOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetRestrictionsForOperationOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetSpaceContentStatesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetSpacePropertiesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetSpacePropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetSpaceSettingsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetSpaceThemeOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetSpacesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetTaskOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetTaskByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetTaskUpdateOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetTasksOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetThemeOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetThemesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetUserOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetUserPropertiesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetUserPropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetViewersOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetViewsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetWatchersForSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetWatchesForPageOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.GetWatchesForSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.IsWatchingLabelOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.IsWatchingSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.MovePageOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.PublishLegacyDraftOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.PublishSharedDraftOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RegisterModulesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveContentStateOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveContentWatcherOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveGroupOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveGroupByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveGroupFromContentRestrictionOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveGroupFromContentRestrictionByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveLabelFromContentOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveLabelFromContentUsingQueryParameterOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveLabelWatcherOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveMemberFromGroupOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveMemberFromGroupByGroupIdOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveModulesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemovePermissionOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveSpaceWatchOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveTemplateOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RemoveUserFromContentRestrictionOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.ResetLookAndFeelSettingsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.ResetSpaceThemeOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.RestoreContentVersionOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.SearchByCQLOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.SearchContentByCQLOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.SearchGroupsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.SearchTasksOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.SearchUserOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.SetContentStateOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.SetLookAndFeelSettingsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.SetRetentionPeriodOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.SetSpaceThemeOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.UpdateAttachmentDataOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.UpdateAttachmentPropertiesOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.UpdateContentOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.UpdateContentPropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.UpdateContentTemplateOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.UpdateLookAndFeelOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.UpdateLookAndFeelSettingsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.UpdateRestrictionsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.UpdateSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.UpdateSpacePropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.UpdateSpaceSettingsOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.UpdateTaskByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v1.spec.UpdateUserPropertyOperationSpec;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConfluenceRESTV1ConsumerApi {
    private final ConfluenceRESTV1Api api;

    public ConfluenceRESTV1ConsumerApi(ConfluenceRESTV1Api api) {
        this.api = api;
    }

    /**
     * Add content watcher
     * <p>
     * Adds a user as a watcher to a piece of content. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * Note, you must add the {@code X-Atlassian-Token: no-check} header when making a request, as this operation has XSRF protection.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>contentId: The ID of the content to add the watcher to.</li>
     *   <li>key: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>username: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     * </ul>
     */
    public void addContentWatcher(Consumer<AddContentWatcherOperationSpec> spec) {
        AddContentWatcherOperationSpec r = new AddContentWatcherOperationSpec(spec);
        api.addContentWatcher(r.contentId(), r.key(), r.username(), r.accountId());
    }

    /**
     * Add new custom content permission to space
     * <p>
     * Adds new custom content permission to space.
     * If the permission to be added is a group permission, the group can be identified by its group name or group id.
     * Note: Only apps can access this REST resource and only make changes to the respective app permissions.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     * Authentication - Required Scopes: [read:space.permission:confluence, write:space.permission:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be queried for its content.</li>
     *   <li>body: The permissions to be created.</li>
     * </ul>
     */
    public void addCustomContentPermissions(Consumer<AddCustomContentPermissionsOperationSpec> spec) {
        AddCustomContentPermissionsOperationSpec r = new AddCustomContentPermissionsOperationSpec(spec);
        api.addCustomContentPermissions(r.spaceKey(), r.body());
    }

    /**
     * Add group to content restriction
     * <p>
     * Deprecated, use [Add group to content restriction via groupId](https://developer.atlassian.com/cloud/confluence/rest/v1/api-group-content-restrictions/#api-wiki-rest-api-content-id-restriction-byoperation-operationkey-bygroupid-groupid-put). Adds a group to a content restriction. That is, grant read or update permission to the group for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the restriction applies to.</li>
     *   <li>operationKey: The operation that the restriction applies to.</li>
     *   <li>groupName: The name of the group to add to the content restriction.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public void addGroupToContentRestriction(Consumer<AddGroupToContentRestrictionOperationSpec> spec) {
        AddGroupToContentRestrictionOperationSpec r = new AddGroupToContentRestrictionOperationSpec(spec);
        api.addGroupToContentRestriction(r.id(), r.operationKey(), r.groupName());
    }

    /**
     * Add group to content restriction
     * <p>
     * Adds a group to a content restriction by Group Id. That is, grant read or update permission to the group for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the restriction applies to.</li>
     *   <li>operationKey: The operation that the restriction applies to.</li>
     *   <li>groupId: The groupId of the group to add to the content restriction.</li>
     * </ul>
     */
    public void addGroupToContentRestrictionByGroupId(Consumer<AddGroupToContentRestrictionByGroupIdOperationSpec> spec) {
        AddGroupToContentRestrictionByGroupIdOperationSpec r = new AddGroupToContentRestrictionByGroupIdOperationSpec(spec);
        api.addGroupToContentRestrictionByGroupId(r.id(), r.operationKey(), r.groupId());
    }

    /**
     * Add label watcher
     * <p>
     * Adds a user as a watcher to a label. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * Note, you must add the {@code X-Atlassian-Token: no-check} header when making a request, as this operation has XSRF protection.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>xAtlassianToken: Note, you must add header when making a request, as this operation has XSRF protection.</li>
     *   <li>labelName: The name of the label to add the watcher to.</li>
     *   <li>key: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>username: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     * </ul>
     */
    public void addLabelWatcher(Consumer<AddLabelWatcherOperationSpec> spec) {
        AddLabelWatcherOperationSpec r = new AddLabelWatcherOperationSpec(spec);
        api.addLabelWatcher(r.xAtlassianToken(), r.labelName(), r.key(), r.username(), r.accountId());
    }

    /**
     * Add labels to content
     * <p>
     * Adds labels to a piece of content. Does not modify the existing labels.
     * Notes:
     * - Labels can also be added when creating content ([Create content](#api-content-post)). - Labels can be updated when updating content ([Update content](#api-content-id-put)). This will delete the existing labels and replace them with the labels in the request.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that will have labels added to it.</li>
     *   <li>body: The labels to add to the content.</li>
     * </ul>
     */
    public LabelArray addLabelsToContent(Consumer<AddLabelsToContentOperationSpec> spec) {
        AddLabelsToContentOperationSpec r = new AddLabelsToContentOperationSpec(spec);
        return api.addLabelsToContent(r.id(), r.body());
    }

    /**
     * Add labels to a space
     * <p>
     * Adds labels to a piece of content. Does not modify the existing labels.
     * Notes:
     * - Labels can also be added when creating content ([Create content](#api-content-post)). - Labels can be updated when updating content ([Update content](#api-content-id-put)). This will delete the existing labels and replace them with the labels in the request.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to add labels to.</li>
     *   <li>labelCreate: The labels to add to the content.</li>
     * </ul>
     */
    public LabelArray addLabelsToSpace(Consumer<AddLabelsToSpaceOperationSpec> spec) {
        AddLabelsToSpaceOperationSpec r = new AddLabelsToSpaceOperationSpec(spec);
        return api.addLabelsToSpace(r.spaceKey(), r.labelCreate());
    }

    /**
     * Add new permission to space
     * <p>
     * Adds new permission to space.
     * If the permission to be added is a group permission, the group can be identified by its group name or group id.
     * Note: Apps cannot access this REST resource - including when utilizing user impersonation.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     * Authentication - Required Scopes: [read:space.permission:confluence, write:space.permission:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be queried for its content.</li>
     *   <li>body: The permission to be created.</li>
     * </ul>
     */
    public SpacePermissionV2 addPermissionToSpace(Consumer<AddPermissionToSpaceOperationSpec> spec) {
        AddPermissionToSpaceOperationSpec r = new AddPermissionToSpaceOperationSpec(spec);
        return api.addPermissionToSpace(r.spaceKey(), r.body());
    }

    /**
     * Add restrictions
     * <p>
     * Adds restrictions to a piece of content. Note, this does not change any existing restrictions on the content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to add restrictions to.</li>
     *   <li>body: The restrictions to be added to the content.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content restrictions (returned in response) to expand.  - {@code restrictions.user} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code content} returns the piece of content that the restrictions are applied to.</li>
     * </ul>
     */
    public ContentRestrictionArray addRestrictions(Consumer<AddRestrictionsOperationSpec> spec) {
        AddRestrictionsOperationSpec r = new AddRestrictionsOperationSpec(spec);
        return api.addRestrictions(r.id(), r.body(), r.expand());
    }

    /**
     * Add space watcher
     * <p>
     * Adds a user as a watcher to a space. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * Note, you must add the {@code X-Atlassian-Token: no-check} header when making a request, as this operation has XSRF protection.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>xAtlassianToken: Note, you must add header when making a request, as this operation has XSRF protection.</li>
     *   <li>spaceKey: The key of the space to add the watcher to.</li>
     *   <li>key: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>username: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     * </ul>
     */
    public void addSpaceWatcher(Consumer<AddSpaceWatcherOperationSpec> spec) {
        AddSpaceWatcherOperationSpec r = new AddSpaceWatcherOperationSpec(spec);
        api.addSpaceWatcher(r.xAtlassianToken(), r.spaceKey(), r.key(), r.username(), r.accountId());
    }

    /**
     * Add user to content restriction
     * <p>
     * Adds a user to a content restriction. That is, grant read or update permission to the user for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the restriction applies to.</li>
     *   <li>operationKey: The operation that the restriction applies to.</li>
     *   <li>key: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>username: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     * </ul>
     */
    public void addUserToContentRestriction(Consumer<AddUserToContentRestrictionOperationSpec> spec) {
        AddUserToContentRestrictionOperationSpec r = new AddUserToContentRestrictionOperationSpec(spec);
        api.addUserToContentRestriction(r.id(), r.operationKey(), r.key(), r.username(), r.accountId());
    }

    /**
     * Add member to group
     * <p>
     * Adds a user as a member in a group.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: User must be a site admin.
     * Authentication - Required Scopes: [write:confluence-groups]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>name: Name of the group whose membership is updated</li>
     *   <li>body: AccountId of the user who needs to be added as member.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public void addUserToGroup(Consumer<AddUserToGroupOperationSpec> spec) {
        AddUserToGroupOperationSpec r = new AddUserToGroupOperationSpec(spec);
        api.addUserToGroup(r.name(), r.body());
    }

    /**
     * Add member to group by groupId
     * <p>
     * Adds a user as a member in a group represented by its groupId
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: User must be a site admin.
     * Authentication - Required Scopes: [write:confluence-groups]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>groupId: GroupId of the group whose membership is updated</li>
     *   <li>body: AccountId of the user who needs to be added as member.</li>
     * </ul>
     */
    public void addUserToGroupByGroupId(Consumer<AddUserToGroupByGroupIdOperationSpec> spec) {
        AddUserToGroupByGroupIdOperationSpec r = new AddUserToGroupByGroupIdOperationSpec(spec);
        api.addUserToGroupByGroupId(r.groupId(), r.body());
    }

    /**
     * Archive pages
     * <p>
     * Archives a list of pages. The pages to be archived are specified as a list of content IDs. This API accepts the archival request and returns a task ID. The archival process happens asynchronously. Use the /longtask/&amp;lt;taskId&amp;gt; REST API to get the copy task status.
     * Each content ID needs to resolve to page objects that are not already in an archived state. The content IDs need not belong to the same space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Archive' permission for each of the pages in the corresponding space it belongs to.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>archivePagesRequest: The pages to be archived.</li>
     * </ul>
     */
    public LongTask archivePages(Consumer<ArchivePagesOperationSpec> spec) {
        ArchivePagesOperationSpec r = new ArchivePagesOperationSpec(spec);
        return api.archivePages(r.archivePagesRequest());
    }

    /**
     * Asynchronously convert content body
     * <p>
     * Converts a content body from one format to another format asynchronously. Returns the asyncId for the asynchronous task.
     * Supported conversions:
     * - storage: export_view
     * No other conversions are supported at the moment. Once a conversion is completed, it will be available for 5 minutes at the result endpoint.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: If request specifies 'contentIdContext', 'View' permission for the space, and permission to view the content.
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>to: The name of the target format for the content body.</li>
     *   <li>body: The content body to convert.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand and populate. Expands are dependent on the {@code to} conversion format and may be irrelevant for certain conversions (e.g. {@code macroRenderedOutput} is redundant when converting to {@code view} format).   If rendering to {@code view} format, and the body content being converted includes arbitrary nested content (such as macros); then it is  necessary to include webresource expands in the request. Webresources for content body are the batched JS and CSS dependencies for any nested dynamic content (i.e. macros).  - {@code embeddedContent} returns metadata for nested content (e.g. page included using page include macro) - {@code mediaToken} returns JWT token for retrieving attachment data from Media API - {@code macroRenderedOutput} additionally converts body to view format - {@code webresource.superbatch.uris.js} returns all common JS dependencies as static URLs - {@code webresource.superbatch.uris.css} returns all common CSS dependencies as static URLs - {@code webresource.superbatch.uris.all} returns all common dependencies as static URLs - {@code webresource.superbatch.tags.all} returns all common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.superbatch.tags.css} returns all common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.superbatch.tags.js} returns all common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags - {@code webresource.uris.js} returns JS dependencies specific to conversion - {@code webresource.uris.css} returns CSS dependencies specific to conversion - {@code webresource.uris.all} returns all dependencies specific to conversion      - {@code webresource.tags.all} returns common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.tags.css} returns common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.tags.js} returns common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags</li>
     *   <li>spaceKeyContext: The space key used for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code spaceKeyContext=TEST} parameter is provided, then the link will be converted to a link to the "Example page" page in the "TEST" space.</li>
     *   <li>contentIdContext: The content ID used to find the space for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code contentIdContext=123} parameter is provided, then the link will be converted to a link to the "Example page" page in the same space that has the content with ID=123. Note, {@code spaceKeyContext} will be ignored if this parameter is provided.</li>
     *   <li>allowCache: If this field is false, the cache will erase its current value and begin a new conversion. If this field is true, the cache will not erase its current value, and will set the status of the async conversion to RERUNNING. Once the data is updated, the status will change to COMPLETED.  Large macros that take long to convert, and whose data need not immediately up to date (same as previous conversion's result within last 5 minutes) should set this fields to true. Cache values are stored per user per content body and expansions.</li>
     *   <li>embeddedContentRender: Mode used for rendering embedded content, like attachments.  - {@code current} renders the embedded content using the latest version. - {@code version-at-save} renders the embedded content using the version at the time of save.</li>
     * </ul>
     */
    public AsyncId asyncConvertContentBodyRequest(Consumer<AsyncConvertContentBodyRequestOperationSpec> spec) {
        AsyncConvertContentBodyRequestOperationSpec r = new AsyncConvertContentBodyRequestOperationSpec(spec);
        return api.asyncConvertContentBodyRequest(r.to(), r.body(), r.expand(), r.spaceKeyContext(), r.contentIdContext(), r.allowCache(), r.embeddedContentRender());
    }

    /**
     * Get asynchronously converted content body from the id or the current status of the task.
     * <p>
     * Returns the asynchronous content body for the corresponding id if the task is complete
     * or returns the status of the task.
     * After the task is completed, the result can be obtained for 5 minutes, or until an identical conversion request is made again, with allowCache query param set to false.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: If request specifies 'contentIdContext', 'View' permission for the space, and permission to view the content.
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The asyncId of the macro task to get the converted body.</li>
     * </ul>
     */
    public AsyncContentBody asyncConvertContentBodyResponse(Consumer<AsyncConvertContentBodyResponseOperationSpec> spec) {
        AsyncConvertContentBodyResponseOperationSpec r = new AsyncConvertContentBodyResponseOperationSpec(spec);
        return api.asyncConvertContentBodyResponse(r.id());
    }

    /**
     * Bulk remove content states from content
     * <p>
     * Creates a long running task that Removes content state from draft or published versions of pages specified.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required** Content Edit Permission for a content to have its state removed via this endpoint.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>status: Set status to one of [current,draft].</li>
     *   <li>bulkRemoveContentStatesRequest: </li>
     * </ul>
     */
    public AsyncId bulkRemoveContentStates(Consumer<BulkRemoveContentStatesOperationSpec> spec) {
        BulkRemoveContentStatesOperationSpec r = new BulkRemoveContentStatesOperationSpec(spec);
        return api.bulkRemoveContentStates(r.status(), r.bulkRemoveContentStatesRequest());
    }

    /**
     * Bulk set content state of many contents
     * <p>
     * Creates a long running task that sets content state of draft or published versions of pages specified.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required** Content Edit Permission for a content to have its state set via this endpoint.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>status: Set status to one of [current,draft].</li>
     *   <li>bulkContentStateSetInput: The content state and ids to set it to.</li>
     * </ul>
     */
    public AsyncId bulkSetContentStates(Consumer<BulkSetContentStatesOperationSpec> spec) {
        BulkSetContentStatesOperationSpec r = new BulkSetContentStatesOperationSpec(spec);
        return api.bulkSetContentStates(r.status(), r.bulkContentStateSetInput());
    }

    /**
     * Check content permissions
     * <p>
     * Check if a user or a group can perform an operation to the specified content. The {@code operation} to check must be provided. The user’s account ID or the ID of the group can be provided in the {@code subject} to check permissions against a specified user or group. The following permission checks are done to make sure that the user or group has the proper access:
     * - site permissions - space permissions - content restrictions
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) if checking permission for self, otherwise 'Confluence Administrator' global permission is required.
     * Authentication - Required Scopes: [read:confluence-content.permission]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to check permissions against.</li>
     *   <li>body: The content permission request.</li>
     * </ul>
     */
    public PermissionCheckResponse checkContentPermission(Consumer<CheckContentPermissionOperationSpec> spec) {
        CheckContentPermissionOperationSpec r = new CheckContentPermissionOperationSpec(spec);
        return api.checkContentPermission(r.id(), r.body());
    }

    /**
     * Convert content body
     * <p>
     * Converts a content body from one format to another format.
     * Supported conversions:
     * - storage: view, export_view, styled_view, editor - editor: storage - view: none - export_view: none - styled_view: none
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: If request specifies 'contentIdContext', 'View' permission for the space, and permission to view the content.
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>to: The name of the target format for the content body.</li>
     *   <li>body: The content body to convert.</li>
     *   <li>spaceKeyContext: The space key used for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code spaceKeyContext=TEST} parameter is provided, then the link will be converted to a link to the "Example page" page in the "TEST" space.</li>
     *   <li>contentIdContext: The content ID used to find the space for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code contentIdContext=123} parameter is provided, then the link will be converted to a link to the "Example page" page in the same space that has the content with ID=123. Note, {@code spaceKeyContext} will be ignored if this parameter is provided.</li>
     *   <li>embeddedContentRender: Mode used for rendering embedded content, like attachments.  - {@code current} renders the embedded content using the latest version. - {@code version-at-save} renders the embedded content using the version at the time of save.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand and populate. Expands are dependent on the {@code to} conversion format and may be irrelevant for certain conversions (e.g. {@code macroRenderedOutput} is redundant when converting to {@code view} format).   If rendering to {@code view} format, and the body content being converted includes arbitrary nested content (such as macros); then it is  necessary to include webresource expands in the request. Webresources for content body are the batched JS and CSS dependencies for any nested dynamic content (i.e. macros).  - {@code embeddedContent} returns metadata for nested content (e.g. page included using page include macro) - {@code mediaToken} returns JWT token for retrieving attachment data from Media API - {@code macroRenderedOutput} additionally converts body to view format - {@code webresource.superbatch.uris.js} returns all common JS dependencies as static URLs - {@code webresource.superbatch.uris.css} returns all common CSS dependencies as static URLs - {@code webresource.superbatch.uris.all} returns all common dependencies as static URLs - {@code webresource.superbatch.tags.all} returns all common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.superbatch.tags.css} returns all common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.superbatch.tags.js} returns all common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags - {@code webresource.uris.js} returns JS dependencies specific to conversion - {@code webresource.uris.css} returns CSS dependencies specific to conversion - {@code webresource.uris.all} returns all dependencies specific to conversion      - {@code webresource.tags.all} returns common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.tags.css} returns common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.tags.js} returns common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags</li>
     * </ul>
     */
    public ContentBody convertContentBody(Consumer<ConvertContentBodyOperationSpec> spec) {
        ConvertContentBodyOperationSpec r = new ConvertContentBodyOperationSpec(spec);
        return api.convertContentBody(r.to(), r.body(), r.spaceKeyContext(), r.contentIdContext(), r.embeddedContentRender(), r.expand());
    }

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
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: </li>
     *   <li>request: Request object from json post body</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand. Maximum sub-expansions allowed is {@code 8}.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.</li>
     * </ul>
     */
    public Content copyPage(Consumer<CopyPageOperationSpec> spec) {
        CopyPageOperationSpec r = new CopyPageOperationSpec(spec);
        return api.copyPage(r.id(), r.request(), r.expand());
    }

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
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: </li>
     *   <li>request: Request object from json post body</li>
     * </ul>
     */
    public LongTask copyPageHierarchy(Consumer<CopyPageHierarchyOperationSpec> spec) {
        CopyPageHierarchyOperationSpec r = new CopyPageHierarchyOperationSpec(spec);
        return api.copyPageHierarchy(r.id(), r.request());
    }

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
     * Authentication - Required Scopes: [write:confluence-file]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to add the attachment to.</li>
     *   <li>_file: The relative location and name of the attachment to be added to the content.</li>
     *   <li>minorEdit: If {@code minorEdits} is set to 'true', no notification email or activity stream will be generated when the attachment is added to the content.</li>
     *   <li>status: The status of the content that the attachment is being added to.</li>
     *   <li>comment: The comment for the attachment that is being added. If you specify a comment, then every file must have a comment and the comments must be in the same order as the files. Alternatively, don't specify any comments.</li>
     * </ul>
     */
    public ContentArray createAttachment(Consumer<CreateAttachmentOperationSpec> spec) {
        CreateAttachmentOperationSpec r = new CreateAttachmentOperationSpec(spec);
        return api.createAttachment(r.id(), r._file(), r.minorEdit(), r.status(), r.comment());
    }

    /**
     * Create audit record
     * <p>
     * Creates a record in the audit log.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission.
     * Authentication - Required Scopes: [read:audit-log:confluence, write:audit-log:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The record to be created in the audit log.</li>
     * </ul>
     */
    public AuditRecord createAuditRecord(Consumer<CreateAuditRecordOperationSpec> spec) {
        CreateAuditRecordOperationSpec r = new CreateAuditRecordOperationSpec(spec);
        return api.createAuditRecord(r.body());
    }

    /**
     * Create content
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Creates a new piece of content or publishes an existing draft.
     * To publish a draft, add the {@code id} and {@code status} properties to the body of the request. Set the {@code id} to the ID of the draft and set the {@code status} to 'current'. When the request is sent, a new piece of content will be created and the metadata from the draft will be transferred into it.
     * By default, the following objects are expanded: {@code space}, {@code history}, {@code version}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Add' permission for the space that the content will be created in, and permission to view the draft if publishing a draft.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>content: The new content to be created. Set the {@code representation} to the name of the body format type. For example, if you use {@code storage} for the body format, set '{@code representation}={@code storage}'. See [Confluence storage format](https://confluence.atlassian.com/x/AJkiLw).  If you are not sure how to generate the different formats, you can create a page in the Confluence application, retrieve the content using [Get content](#api-content-get), and expand the desired content format, e.g. {@code expand=body.storage}.</li>
     *   <li>status: Filter the returned content by status.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand. Maximum sub-expansions allowed is {@code 8}.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public Content createContent(Consumer<CreateContentOperationSpec> spec) {
        CreateContentOperationSpec r = new CreateContentOperationSpec(spec);
        return api.createContent(r.content(), r.status(), r.expand());
    }

    /**
     * Create content property
     * <p>
     * Creates a property for an existing piece of content. For more information about content properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/).
     * This is the same as [Create content property for key](#api-content-id-property-key-post) except that the key is specified in the request body instead of as a path parameter.
     * Content properties can also be added when creating a new piece of content by including them in the {@code metadata.properties} of the request.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     * Authentication - Required Scopes: [write:confluence-props]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to add the property to.</li>
     *   <li>body: The content property to be created.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public ContentProperty createContentProperty(Consumer<CreateContentPropertyOperationSpec> spec) {
        CreateContentPropertyOperationSpec r = new CreateContentPropertyOperationSpec(spec);
        return api.createContentProperty(r.id(), r.body());
    }

    /**
     * Create content property for key
     * <p>
     * Creates a property for an existing piece of content. For more information about content properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/).
     * This is the same as [Create content property](#api-content-id-property-post) except that the key is specified as a path parameter instead of in the request body.
     * Content properties can also be added when creating a new piece of content by including them in the {@code metadata.properties} of the request.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     * Authentication - Required Scopes: [write:confluence-props]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to add the property to.</li>
     *   <li>key: The key of the content property. Required.</li>
     *   <li>body: The content property to be created.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public ContentProperty createContentPropertyForKey(Consumer<CreateContentPropertyForKeyOperationSpec> spec) {
        CreateContentPropertyForKeyOperationSpec r = new CreateContentPropertyForKeyOperationSpec(spec);
        return api.createContentPropertyForKey(r.id(), r.key(), r.body());
    }

    /**
     * Create content template
     * <p>
     * Creates a new content template. Note, blueprint templates cannot be created via the REST API.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space to create a space template or 'Confluence Administrator' global permission to create a global template.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The content template to be created. The content body must be in 'storage' format.</li>
     * </ul>
     */
    public ContentTemplate createContentTemplate(Consumer<CreateContentTemplateOperationSpec> spec) {
        CreateContentTemplateOperationSpec r = new CreateContentTemplateOperationSpec(spec);
        return api.createContentTemplate(r.body());
    }

    /**
     * Create new user group
     * <p>
     * Creates a new user group.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: User must be a site admin.
     * Authentication - Required Scopes: [write:confluence-groups]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: Name of the group that is to be created.</li>
     * </ul>
     */
    public Group createGroup(Consumer<CreateGroupOperationSpec> spec) {
        CreateGroupOperationSpec r = new CreateGroupOperationSpec(spec);
        return api.createGroup(r.body());
    }

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
     * Authentication - Required Scopes: [write:confluence-file]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to add the attachment to.</li>
     *   <li>_file: The relative location and name of the attachment to be added to the content.</li>
     *   <li>minorEdit: If {@code minorEdits} is set to 'true', no notification email or activity stream will be generated when the attachment is added to the content.</li>
     *   <li>status: The status of the content that the attachment is being added to. This should always be set to 'current'.</li>
     *   <li>comment: The comment for the attachment that is being added. If you specify a comment, then every file must have a comment and the comments must be in the same order as the files. Alternatively, don't specify any comments.</li>
     * </ul>
     */
    public ContentArray createOrUpdateAttachments(Consumer<CreateOrUpdateAttachmentsOperationSpec> spec) {
        CreateOrUpdateAttachmentsOperationSpec r = new CreateOrUpdateAttachmentsOperationSpec(spec);
        return api.createOrUpdateAttachments(r.id(), r._file(), r.minorEdit(), r.status(), r.comment());
    }

    /**
     * Create private space
     * <p>
     * Creates a new space that is only visible to the creator. This method is the same as the [Create space](#api-space-post) method with permissions set to the current user only. Note, currently you cannot set space labels when creating a space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Create Space(s)' global permission.
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spacePrivateCreate: The space to be created.</li>
     * </ul>
     */
    public Space createPrivateSpace(Consumer<CreatePrivateSpaceOperationSpec> spec) {
        CreatePrivateSpaceOperationSpec r = new CreatePrivateSpaceOperationSpec(spec);
        return api.createPrivateSpace(r.spacePrivateCreate());
    }

    /**
     * Create relationship
     * <p>
     * Creates a relationship between two entities (user, space, content). The 'favourite' relationship is supported by default, but you can use this method to create any type of relationship between two entities.
     * For example, the following method creates a 'sibling' relationship between two pieces of content: {@code GET /wiki/rest/api/relation/sibling/from/content/123/to/content/456}
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>relationName: The name of the relationship. This method supports the 'favourite' (i.e. 'save for later') relationship. You can also specify any other value for this parameter to create a custom relationship type.</li>
     *   <li>sourceType: The source entity type of the relationship. This must be 'user', if the {@code relationName} is 'favourite'.</li>
     *   <li>sourceKey: - The identifier for the source entity:  - If {@code sourceType} is 'user', then specify either 'current' (logged-in   user) or the user key. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key.</li>
     *   <li>targetType: The target entity type of the relationship. This must be 'space' or 'content', if the {@code relationName} is 'favourite'.</li>
     *   <li>targetKey: - The identifier for the target entity:  - If {@code sourceType} is 'user', then specify either 'current' (logged-in   user) or the user key. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key.</li>
     *   <li>sourceStatus: The status of the source. This parameter is only used when the {@code sourceType} is 'content'.</li>
     *   <li>targetStatus: The status of the target. This parameter is only used when the {@code targetType} is 'content'.</li>
     *   <li>sourceVersion: The version of the source. This parameter is only used when the {@code sourceType} is 'content' and the {@code sourceStatus} is 'historical'.</li>
     *   <li>targetVersion: The version of the target. This parameter is only used when the {@code targetType} is 'content' and the {@code targetStatus} is 'historical'.</li>
     * </ul>
     */
    public Relation createRelationship(Consumer<CreateRelationshipOperationSpec> spec) {
        CreateRelationshipOperationSpec r = new CreateRelationshipOperationSpec(spec);
        return api.createRelationship(r.relationName(), r.sourceType(), r.sourceKey(), r.targetType(), r.targetKey(), r.sourceStatus(), r.targetStatus(), r.sourceVersion(), r.targetVersion());
    }

    /**
     * Create space
     * <p>
     * Creates a new space. Note, currently you cannot set space labels when creating a space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Create Space(s)' global permission.
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The space to be created.</li>
     * </ul>
     */
    public Space createSpace(Consumer<CreateSpaceOperationSpec> spec) {
        CreateSpaceOperationSpec r = new CreateSpaceOperationSpec(spec);
        return api.createSpace(r.body());
    }

    /**
     * Create space property
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Creates a new space property.
     * **[Permissions required](https://confluence.atlassian.com/x/_AozKw)**: ‘Admin’ permission for the space.
     * Authentication - Required Scopes: [write:confluence-props]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space that the property will be created in.</li>
     *   <li>body: The space property to be created.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public SpaceProperty createSpaceProperty(Consumer<CreateSpacePropertyOperationSpec> spec) {
        CreateSpacePropertyOperationSpec r = new CreateSpacePropertyOperationSpec(spec);
        return api.createSpaceProperty(r.spaceKey(), r.body());
    }

    /**
     * Create space property for key
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Creates a new space property. This is the same as {@code POST /wiki/rest/api/space/{spaceKey}/property} but the key for the property is passed as a path parameter, rather than in the request body.
     * **[Permissions required](https://confluence.atlassian.com/x/_AozKw)**: ‘Admin’ permission for the space.
     * Authentication - Required Scopes: [write:confluence-props]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space that the property will be created in.</li>
     *   <li>key: The key of the property to be created.</li>
     *   <li>body: The space property to be created.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public SpaceProperty createSpacePropertyForKey(Consumer<CreateSpacePropertyForKeyOperationSpec> spec) {
        CreateSpacePropertyForKeyOperationSpec r = new CreateSpacePropertyForKeyOperationSpec(spec);
        return api.createSpacePropertyForKey(r.spaceKey(), r.key(), r.body());
    }

    /**
     * Create user property by key
     * <p>
     * Creates a property for a user. For more information
     * about user properties, see [Confluence entity properties] (https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/). {@code Note}, these properties stored against a user are on a Confluence site level and not space/content level.
     * {@code Note:} the number of properties which could be created per app in a tenant for each user might be restricted by fixed system limits. **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [write:user.property:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>userId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192</li>
     *   <li>key: The key of the user property.</li>
     *   <li>body: The user property to be created.</li>
     * </ul>
     */
    public void createUserProperty(Consumer<CreateUserPropertyOperationSpec> spec) {
        CreateUserPropertyOperationSpec r = new CreateUserPropertyOperationSpec(spec);
        api.createUserProperty(r.userId(), r.key(), r.body());
    }

    /**
     * Delete content
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Moves a piece of content to the space's trash or purges it from the trash, depending on the content's type and status:
     * - If the content's type is {@code page},{@code blogpost}, or {@code attachment} and its status is {@code current}, it will be trashed. - If the content's type is {@code page},{@code blogpost}, or {@code attachment} and its status is {@code trashed}, the content will be purged from the trash and deleted permanently. Note, you must also set the {@code status} query parameter to {@code trashed} in your request. - If the content's type is {@code comment}, it will be deleted permanently without being trashed.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Delete' permission for the space that the content is in.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be deleted.</li>
     *   <li>status: Set this to {@code trashed}, if the content's status is {@code trashed} and you want to purge it.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public void deleteContent(Consumer<DeleteContentOperationSpec> spec) {
        DeleteContentOperationSpec r = new DeleteContentOperationSpec(spec);
        api.deleteContent(r.id(), r.status());
    }

    /**
     * Delete content property
     * <p>
     * Deletes a content property. For more information about content properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     * Authentication - Required Scopes: [write:confluence-props]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the property belongs to.</li>
     *   <li>key: The key of the property.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public void deleteContentProperty(Consumer<DeleteContentPropertyOperationSpec> spec) {
        DeleteContentPropertyOperationSpec r = new DeleteContentPropertyOperationSpec(spec);
        api.deleteContentProperty(r.id(), r.key());
    }

    /**
     * Delete content version
     * <p>
     * Delete a historical version. This does not delete the changes made to the content in that version, rather the changes for the deleted version are rolled up into the next version. Note, you cannot delete the current version.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the version will be deleted from.</li>
     *   <li>versionNumber: The number of the version to be deleted. The version number starts from 1 up to current version.</li>
     * </ul>
     */
    public void deleteContentVersion(Consumer<DeleteContentVersionOperationSpec> spec) {
        DeleteContentVersionOperationSpec r = new DeleteContentVersionOperationSpec(spec);
        api.deleteContentVersion(r.id(), r.versionNumber());
    }

    /**
     * Remove label from a space
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to remove a labels from.</li>
     *   <li>name: The name of the label to remove</li>
     *   <li>prefix: The prefix of the label to remove. If not provided defaults to global.</li>
     * </ul>
     */
    public void deleteLabelFromSpace(Consumer<DeleteLabelFromSpaceOperationSpec> spec) {
        DeleteLabelFromSpaceOperationSpec r = new DeleteLabelFromSpaceOperationSpec(spec);
        api.deleteLabelFromSpace(r.spaceKey(), r.name(), r.prefix());
    }

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
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content which forms root of the page tree, to be deleted.</li>
     * </ul>
     */
    public LongTask deletePageTree(Consumer<DeletePageTreeOperationSpec> spec) {
        DeletePageTreeOperationSpec r = new DeletePageTreeOperationSpec(spec);
        return api.deletePageTree(r.id());
    }

    /**
     * Delete relationship
     * <p>
     * Deletes a relationship between two entities (user, space, content).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). For favourite relationships, the current user can only delete their own favourite relationships. A space administrator can delete favourite relationships for any user.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>relationName: The name of the relationship.</li>
     *   <li>sourceType: The source entity type of the relationship. This must be 'user', if the {@code relationName} is 'favourite'.</li>
     *   <li>sourceKey: - The identifier for the source entity:  - If {@code sourceType} is 'user', then specify either 'current' (logged-in   user) or the user key. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key.</li>
     *   <li>targetType: The target entity type of the relationship. This must be 'space' or 'content', if the {@code relationName} is 'favourite'.</li>
     *   <li>targetKey: - The identifier for the target entity:  - If {@code sourceType} is 'user', then specify either 'current' (logged-in   user) or the user key. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key.</li>
     *   <li>sourceStatus: The status of the source. This parameter is only used when the {@code sourceType} is 'content'.</li>
     *   <li>targetStatus: The status of the target. This parameter is only used when the {@code targetType} is 'content'.</li>
     *   <li>sourceVersion: The version of the source. This parameter is only used when the {@code sourceType} is 'content' and the {@code sourceStatus} is 'historical'.</li>
     *   <li>targetVersion: The version of the target. This parameter is only used when the {@code targetType} is 'content' and the {@code targetStatus} is 'historical'.</li>
     * </ul>
     */
    public void deleteRelationship(Consumer<DeleteRelationshipOperationSpec> spec) {
        DeleteRelationshipOperationSpec r = new DeleteRelationshipOperationSpec(spec);
        api.deleteRelationship(r.relationName(), r.sourceType(), r.sourceKey(), r.targetType(), r.targetKey(), r.sourceStatus(), r.targetStatus(), r.sourceVersion(), r.targetVersion());
    }

    /**
     * Delete restrictions
     * <p>
     * Removes all restrictions (read and update) on a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to remove restrictions from.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content restrictions (returned in response) to expand.  - {@code restrictions.user} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code content} returns the piece of content that the restrictions are applied to.</li>
     * </ul>
     */
    public ContentRestrictionArray deleteRestrictions(Consumer<DeleteRestrictionsOperationSpec> spec) {
        DeleteRestrictionsOperationSpec r = new DeleteRestrictionsOperationSpec(spec);
        return api.deleteRestrictions(r.id(), r.expand());
    }

    /**
     * Delete space
     * <p>
     * Deletes a space. Note, the space will be deleted in a long running task. Therefore, the space may not be deleted yet when this method has returned. Clients should poll the status link that is returned in the response until the task completes.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to delete.</li>
     * </ul>
     */
    public LongTask deleteSpace(Consumer<DeleteSpaceOperationSpec> spec) {
        DeleteSpaceOperationSpec r = new DeleteSpaceOperationSpec(spec);
        return api.deleteSpace(r.spaceKey());
    }

    /**
     * Delete space property
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Deletes a space property.
     * **[Permissions required](https://confluence.atlassian.com/x/_AozKw)**: ‘Admin’ permission for the space.
     * Authentication - Required Scopes: [write:confluence-props]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space that the property is in.</li>
     *   <li>key: The key of the property to be deleted.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public void deleteSpaceProperty(Consumer<DeleteSpacePropertyOperationSpec> spec) {
        DeleteSpacePropertyOperationSpec r = new DeleteSpacePropertyOperationSpec(spec);
        api.deleteSpaceProperty(r.spaceKey(), r.key());
    }

    /**
     * Delete user property
     * <p>
     * Deletes a property for the given user. For more information about user properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/). {@code Note}, these properties stored against a user are on a Confluence site level and not space/content level.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [write:user.property:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>userId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192</li>
     *   <li>key: The key of the user property.</li>
     * </ul>
     */
    public void deleteUserProperty(Consumer<DeleteUserPropertyOperationSpec> spec) {
        DeleteUserPropertyOperationSpec r = new DeleteUserPropertyOperationSpec(spec);
        api.deleteUserProperty(r.userId(), r.key());
    }

    /**
     * Get URI to download attachment
     * <p>
     * Redirects the client to a URL that serves an attachment's binary data.
     * Authentication - Required Scopes: [readonly:content.attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the attachment is attached to.</li>
     *   <li>attachmentId: The ID of the attachment to download.</li>
     *   <li>version: The version of the attachment. If this parameter is absent, the redirect URI will download the latest version of the attachment.</li>
     * </ul>
     */
    public void downloadAttatchment(Consumer<DownloadAttatchmentOperationSpec> spec) {
        DownloadAttatchmentOperationSpec r = new DownloadAttatchmentOperationSpec(spec);
        api.downloadAttatchment(r.id(), r.attachmentId(), r.version());
    }

    /**
     * Export audit records
     * <p>
     * Exports audit records as a CSV file or ZIP file.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission.
     * Authentication - Required Scopes: [read:audit-log:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>startDate: Filters the exported results to the records on or after the {@code startDate}. The {@code startDate} must be specified as a [timestamp](https://www.unixtimestamp.com/).</li>
     *   <li>endDate: Filters the exported results to the records on or before the {@code endDate}. The {@code endDate} must be specified as a [timestamp](https://www.unixtimestamp.com/).</li>
     *   <li>searchString: Filters the exported results to records that have string property values matching the {@code searchString}.</li>
     *   <li>format: The format of the export file for the audit records.</li>
     * </ul>
     */
    public File exportAuditRecords(Consumer<ExportAuditRecordsOperationSpec> spec) {
        ExportAuditRecordsOperationSpec r = new ExportAuditRecordsOperationSpec(spec);
        return api.exportAuditRecords(r.startDate(), r.endDate(), r.searchString(), r.format());
    }

    /**
     * Find source entities related to a target entity
     * <p>
     * Returns all target entities that have a particular relationship to the source entity. Note, relationships are one way.
     * For example, the following method finds all users that have a 'collaborator' relationship to a piece of content with an ID of '1234': {@code GET /wiki/rest/api/relation/collaborator/to/content/1234/from/user} Note, 'collaborator' is an example custom relationship type.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view both the target entity and source entity.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>relationName: The name of the relationship. This method supports relationships created via [Create relationship](#api-wiki-rest-api-relation-relationname-from-sourcetype-sourcekey-to-targettype-targetkey-put). Note, this method does not support 'like' or 'favourite' relationships.</li>
     *   <li>sourceType: The source entity type of the relationship.</li>
     *   <li>targetType: The target entity type of the relationship.</li>
     *   <li>targetKey: The identifier for the target entity:  - If {@code targetType} is {@code user}, then specify either {@code current} (logged-in user), the user key of the user, or the account ID of the user. Note that the user key has been deprecated in favor of the account ID for this parameter. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. - If {@code targetType} is 'content', then specify the content ID. - If {@code targetType} is 'space', then specify the space key.</li>
     *   <li>sourceStatus: The status of the source. This parameter is only used when the {@code sourceType} is 'content'.</li>
     *   <li>targetStatus: The status of the target. This parameter is only used when the {@code targetType} is 'content'.</li>
     *   <li>sourceVersion: The version of the source. This parameter is only used when the {@code sourceType} is 'content' and the {@code sourceStatus} is 'historical'.</li>
     *   <li>targetVersion: The version of the target. This parameter is only used when the {@code targetType} is 'content' and the {@code targetStatus} is 'historical'.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the response object to expand.  - {@code relationData} returns information about the relationship, such as who created it and when it was created. - {@code source} returns the source entity. - {@code target} returns the target entity.</li>
     *   <li>start: The starting index of the returned relationships.</li>
     *   <li>limit: The maximum number of relationships to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public RelationArray findSourcesForTarget(Consumer<FindSourcesForTargetOperationSpec> spec) {
        FindSourcesForTargetOperationSpec r = new FindSourcesForTargetOperationSpec(spec);
        return api.findSourcesForTarget(r.relationName(), r.sourceType(), r.targetType(), r.targetKey(), r.sourceStatus(), r.targetStatus(), r.sourceVersion(), r.targetVersion(), r.expand(), r.start(), r.limit());
    }

    /**
     * Find target entities related to a source entity
     * <p>
     * Returns all target entities that have a particular relationship to the source entity. Note, relationships are one way.
     * For example, the following method finds all content that the current user has an 'ignore' relationship with: {@code GET /wiki/rest/api/relation/ignore/from/user/current/to/content} Note, 'ignore' is an example custom relationship type.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view both the target entity and source entity.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>relationName: The name of the relationship. This method supports relationships created via [Create relationship](#api-wiki-rest-api-relation-relationname-from-sourcetype-sourcekey-to-targettype-targetkey-put). Note, this method does not support 'like' or 'favourite' relationships.</li>
     *   <li>sourceType: The source entity type of the relationship.</li>
     *   <li>sourceKey: The identifier for the source entity:  - If {@code sourceType} is {@code user}, then specify either {@code current} (logged-in user), the user key of the user, or the account ID of the user. Note that the user key has been deprecated in favor of the account ID for this parameter. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key.</li>
     *   <li>targetType: The target entity type of the relationship.</li>
     *   <li>sourceStatus: The status of the source. This parameter is only used when the {@code sourceType} is 'content'.</li>
     *   <li>targetStatus: The status of the target. This parameter is only used when the {@code targetType} is 'content'.</li>
     *   <li>sourceVersion: The version of the source. This parameter is only used when the {@code sourceType} is 'content' and the {@code sourceStatus} is 'historical'.</li>
     *   <li>targetVersion: The version of the target. This parameter is only used when the {@code targetType} is 'content' and the {@code targetStatus} is 'historical'.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the response object to expand.  - {@code relationData} returns information about the relationship, such as who created it and when it was created. - {@code source} returns the source entity. - {@code target} returns the target entity.</li>
     *   <li>start: The starting index of the returned relationships.</li>
     *   <li>limit: The maximum number of relationships to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public RelationArray findTargetFromSource(Consumer<FindTargetFromSourceOperationSpec> spec) {
        FindTargetFromSourceOperationSpec r = new FindTargetFromSourceOperationSpec(spec);
        return api.findTargetFromSource(r.relationName(), r.sourceType(), r.sourceKey(), r.targetType(), r.sourceStatus(), r.targetStatus(), r.sourceVersion(), r.targetVersion(), r.expand(), r.start(), r.limit());
    }

    /**
     * Get label information
     * <p>
     * Returns label information and a list of contents associated with the label.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only contents that the user is permitted to view is returned.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>name: Name of the label to query.</li>
     *   <li>type: The type of contents that are to be returned.</li>
     *   <li>start: The starting offset for the results.</li>
     *   <li>limit: The number of results to be returned.</li>
     * </ul>
     */
    public LabelDetails getAllLabelContent(Consumer<GetAllLabelContentOperationSpec> spec) {
        GetAllLabelContentOperationSpec r = new GetAllLabelContentOperationSpec(spec);
        return api.getAllLabelContent(r.name(), r.type(), r.start(), r.limit());
    }

    /**
     * Get macro body by macro ID and convert representation Asynchronously
     * <p>
     * Returns Async Id of the conversion task which will convert the macro into a content body of the desired format. The result will be available for 5 minutes after completion of the conversion.
     * About the macro ID: When a macro is created in a new version of content, Confluence will generate a random ID for it, unless an ID is specified (by an app). The macro ID will look similar to this: '884bd9-0cb8-41d5-98be-f80943c14f96'. The ID is then persisted as new versions of content are created, and is only modified by Confluence if there are conflicting IDs.
     * Note, to preserve backwards compatibility this resource will also match on the hash of the macro body, even if a macro ID is found. This check will eventually become redundant, as macro IDs are generated for pages and transparently propagate out to all instances.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content that the macro is in.
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID for the content that contains the macro.</li>
     *   <li>version: The version of the content that contains the macro. Specifying {@code 0} as the {@code version} will return the macro body for the latest content version.</li>
     *   <li>macroId: The ID of the macro. For apps, this is passed to the macro by the Connect/Forge framework. Otherwise, find the macro ID by querying the desired content and version, then expanding the body in storage format. For example, '/content/196611/version/7?expand=content.body.storage'.</li>
     *   <li>to: The content representation to return the macro in. Currently, the following conversions are allowed:  - {@code export_view} - {@code styled_view} - {@code view}</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand and populate. Expands are dependent on the {@code to} conversion format and may be irrelevant for certain conversions (e.g. {@code macroRenderedOutput} is redundant when converting to {@code view} format).   If rendering to {@code view} format, and the body content being converted includes arbitrary nested content (such as macros); then it is  necessary to include webresource expands in the request. Webresources for content body are the batched JS and CSS dependencies for any nested dynamic content (i.e. macros).  - {@code embeddedContent} returns metadata for nested content (e.g. page included using page include macro) - {@code mediaToken} returns JWT token for retrieving attachment data from Media API - {@code macroRenderedOutput} additionally converts body to view format - {@code webresource.superbatch.uris.js} returns all common JS dependencies as static URLs - {@code webresource.superbatch.uris.css} returns all common CSS dependencies as static URLs - {@code webresource.superbatch.uris.all} returns all common dependencies as static URLs - {@code webresource.superbatch.tags.all} returns all common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.superbatch.tags.css} returns all common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.superbatch.tags.js} returns all common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags - {@code webresource.uris.js} returns JS dependencies specific to conversion - {@code webresource.uris.css} returns CSS dependencies specific to conversion - {@code webresource.uris.all} returns all dependencies specific to conversion      - {@code webresource.tags.all} returns common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.tags.css} returns common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.tags.js} returns common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags</li>
     *   <li>allowCache: If this field is false, the cache will erase its current value and begin a conversion. If this field is true, the cache will not erase its current value, and will set the status of the result in cache to RERUNNING. Once the data is updated, the status will change to COMPLETED.  Large macros that take long to convert, and who want to show intermediate, but potentially stale data, immediately should set this field to true. Cache values are stored per macro per user per content and expansions.</li>
     *   <li>spaceKeyContext: The space key used for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code spaceKeyContext=TEST} parameter is provided, then the link will be converted to a link to the "Example page" page in the "TEST" space.</li>
     *   <li>embeddedContentRender: Mode used for rendering embedded content, like attachments.  - {@code current} renders the embedded content using the latest version. - {@code version-at-save} renders the embedded content using the version at the time of save.</li>
     * </ul>
     */
    public AsyncId getAndAsyncConvertMacroBodyByMacroId(Consumer<GetAndAsyncConvertMacroBodyByMacroIdOperationSpec> spec) {
        GetAndAsyncConvertMacroBodyByMacroIdOperationSpec r = new GetAndAsyncConvertMacroBodyByMacroIdOperationSpec(spec);
        return api.getAndAsyncConvertMacroBodyByMacroId(r.id(), r.version(), r.macroId(), r.to(), r.expand(), r.allowCache(), r.spaceKeyContext(), r.embeddedContentRender());
    }

    /**
     * Get macro body by macro ID and convert the representation synchronously
     * <p>
     * Returns the body of a macro in format specified in path, for the given macro ID. This includes information like the name of the macro, the body of the macro, and any macro parameters.
     * About the macro ID: When a macro is created in a new version of content, Confluence will generate a random ID for it, unless an ID is specified (by an app). The macro ID will look similar to this: '50884bd9-0cb8-41d5-98be-f80943c14f96'. The ID is then persisted as new versions of content are created, and is only modified by Confluence if there are conflicting IDs.
     * Note, to preserve backwards compatibility this resource will also match on the hash of the macro body, even if a macro ID is found. This check will eventually become redundant, as macro IDs are generated for pages and transparently propagate out to all instances.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content that the macro is in.
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID for the content that contains the macro.</li>
     *   <li>version: The version of the content that contains the macro. Specifying {@code 0} as the {@code version} will return the macro body for the latest content version.</li>
     *   <li>macroId: The ID of the macro. This is usually passed by the app that the macro is in. Otherwise, find the macro ID by querying the desired content and version, then expanding the body in storage format. For example, '/content/196611/version/7?expand=content.body.storage'.</li>
     *   <li>to: The content representation to return the macro in.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand and populate. Expands are dependent on the {@code to} conversion format and may be irrelevant for certain conversions (e.g. {@code macroRenderedOutput} is redundant when converting to {@code view} format).   If rendering to {@code view} format, and the body content being converted includes arbitrary nested content (such as macros); then it is  necessary to include webresource expands in the request. Webresources for content body are the batched JS and CSS dependencies for any nested dynamic content (i.e. macros).  - {@code embeddedContent} returns metadata for nested content (e.g. page included using page include macro) - {@code mediaToken} returns JWT token for retrieving attachment data from Media API - {@code macroRenderedOutput} additionally converts body to view format - {@code webresource.superbatch.uris.js} returns all common JS dependencies as static URLs - {@code webresource.superbatch.uris.css} returns all common CSS dependencies as static URLs - {@code webresource.superbatch.uris.all} returns all common dependencies as static URLs - {@code webresource.superbatch.tags.all} returns all common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.superbatch.tags.css} returns all common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.superbatch.tags.js} returns all common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags - {@code webresource.uris.js} returns JS dependencies specific to conversion - {@code webresource.uris.css} returns CSS dependencies specific to conversion - {@code webresource.uris.all} returns all dependencies specific to conversion      - {@code webresource.tags.all} returns common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.tags.css} returns common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.tags.js} returns common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags</li>
     *   <li>spaceKeyContext: The space key used for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code spaceKeyContext=TEST} parameter is provided, then the link will be converted to a link to the "Example page" page in the "TEST" space.</li>
     *   <li>embeddedContentRender: Mode used for rendering embedded content, like attachments.  - {@code current} renders the embedded content using the latest version. - {@code version-at-save} renders the embedded content using the version at the time of save.</li>
     * </ul>
     */
    public ContentBody getAndConvertMacroBodyByMacroId(Consumer<GetAndConvertMacroBodyByMacroIdOperationSpec> spec) {
        GetAndConvertMacroBodyByMacroIdOperationSpec r = new GetAndConvertMacroBodyByMacroIdOperationSpec(spec);
        return api.getAndConvertMacroBodyByMacroId(r.id(), r.version(), r.macroId(), r.to(), r.expand(), r.spaceKeyContext(), r.embeddedContentRender());
    }

    /**
     * Get anonymous user
     * <p>
     * Returns information about how anonymous users are represented, like the profile picture and display name.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-user]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>expand: A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.</li>
     * </ul>
     */
    public UserAnonymous getAnonymousUser(Consumer<GetAnonymousUserOperationSpec> spec) {
        GetAnonymousUserOperationSpec r = new GetAnonymousUserOperationSpec(spec);
        return api.getAnonymousUser(r.expand());
    }

    /**
     * Get attachments
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns the attachments for a piece of content.
     * By default, the following objects are expanded: {@code metadata}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content. If the content is a blog post, 'View' permission for the space is required.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its attachments.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.</li>
     *   <li>start: The starting index of the returned attachments.</li>
     *   <li>limit: The maximum number of attachments to return per page. Note, this may be restricted by fixed system limits.</li>
     *   <li>filename: Filter the results to attachments that match the filename.</li>
     *   <li>mediaType: Filter the results to attachments that match the media type.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public ContentArray getAttachments(Consumer<GetAttachmentsOperationSpec> spec) {
        GetAttachmentsOperationSpec r = new GetAttachmentsOperationSpec(spec);
        return api.getAttachments(r.id(), r.expand(), r.start(), r.limit(), r.filename(), r.mediaType());
    }

    /**
     * Get audit records
     * <p>
     * Returns all records in the audit log, optionally for a certain date range. This contains information about events like space exports, group membership changes, app installations, etc. For more information, see [Audit log](https://confluence.atlassian.com/confcloud/audit-log-802164269.html) in the Confluence administrator's guide.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission.
     * Authentication - Required Scopes: [read:audit-log:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>startDate: Filters the results to the records on or after the {@code startDate}. The {@code startDate} must be specified as a [timestamp](https://www.unixtimestamp.com/).</li>
     *   <li>endDate: Filters the results to the records on or before the {@code endDate}. The {@code endDate} must be specified as a [timestamp](https://www.unixtimestamp.com/).</li>
     *   <li>searchString: Filters the results to records that have string property values matching the {@code searchString}.</li>
     *   <li>start: The starting index of the returned records.</li>
     *   <li>limit: The maximum number of records to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public AuditRecordArray getAuditRecords(Consumer<GetAuditRecordsOperationSpec> spec) {
        GetAuditRecordsOperationSpec r = new GetAuditRecordsOperationSpec(spec);
        return api.getAuditRecords(r.startDate(), r.endDate(), r.searchString(), r.start(), r.limit());
    }

    /**
     * Get audit records for time period
     * <p>
     * Returns records from the audit log, for a time period back from the current date. For example, you can use this method to get the last 3 months of records.
     * This contains information about events like space exports, group membership changes, app installations, etc. For more information, see [Audit log](https://confluence.atlassian.com/confcloud/audit-log-802164269.html) in the Confluence administrator's guide.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission.
     * Authentication - Required Scopes: [read:audit-log:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>number: The number of units for the time period.</li>
     *   <li>units: The unit of time that the time period is measured in.</li>
     *   <li>searchString: Filters the results to records that have string property values matching the {@code searchString}.</li>
     *   <li>start: The starting index of the returned records.</li>
     *   <li>limit: The maximum number of records to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public AuditRecordArray getAuditRecordsForTimePeriod(Consumer<GetAuditRecordsForTimePeriodOperationSpec> spec) {
        GetAuditRecordsForTimePeriodOperationSpec r = new GetAuditRecordsForTimePeriodOperationSpec(spec);
        return api.getAuditRecordsForTimePeriod(r.number(), r.units(), r.searchString(), r.start(), r.limit());
    }

    /**
     * Gets available content states for content.
     * <p>
     * Gets content states that are available for the content to be set as. Will return all enabled Space Content States. Will only return most the 3 most recently published custom content states to match UI editor list. To get all custom content states, use the /content-states endpoint.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: id of content to get available states for</li>
     * </ul>
     */
    public AvailableContentStates getAvailableContentStates(Consumer<GetAvailableContentStatesOperationSpec> spec) {
        GetAvailableContentStatesOperationSpec r = new GetAvailableContentStatesOperationSpec(spec);
        return api.getAvailableContentStates(r.id());
    }

    /**
     * Get blueprint templates
     * <p>
     * Returns all templates provided by blueprints. Use this method to retrieve all global blueprint templates or all blueprint templates in a space.
     * Note, all global blueprints are inherited by each space. Space blueprints can be customised without affecting the global blueprints.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space to view blueprints for the space and permission to access the Confluence site ('Can use' global permission) to view global blueprints.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be queried for templates. If the {@code spaceKey} is not specified, global blueprint templates will be returned.</li>
     *   <li>start: The starting index of the returned templates.</li>
     *   <li>limit: The maximum number of templates to return per page. Note, this may be restricted by fixed system limits.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the template to expand.  - {@code body} returns the content of the template in storage format.</li>
     * </ul>
     */
    public BlueprintTemplateArray getBlueprintTemplates(Consumer<GetBlueprintTemplatesOperationSpec> spec) {
        GetBlueprintTemplatesOperationSpec r = new GetBlueprintTemplatesOperationSpec(spec);
        return api.getBlueprintTemplates(r.spaceKey(), r.start(), r.limit(), r.expand());
    }

    /**
     * Get multiple users using ids
     * <p>
     * Returns user details for the ids provided in request.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-user]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>accountId: A list of accountId's of users to be returned.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.   - {@code personalSpace} returns the user's personal space, if it exists.   - {@code isExternalCollaborator} returns whether the user is an external collaborator user.</li>
     *   <li>limit: The maximum number of results returned. Currently API returns 200 results max. If more that 200 ids are passed first 200 will be returned.</li>
     * </ul>
     */
    public BulkUserLookupArray getBulkUserLookup(Consumer<GetBulkUserLookupOperationSpec> spec) {
        GetBulkUserLookupOperationSpec r = new GetBulkUserLookupOperationSpec(spec);
        return api.getBulkUserLookup(r.accountId(), r.expand(), r.limit());
    }

    /**
     * Get content
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns all content in a Confluence instance.
     * By default, the following objects are expanded: {@code space}, {@code history}, {@code version}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only content that the user has permission to view will be returned.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>type: The type of content to return. For example:   - page   - blogpost</li>
     *   <li>spaceKey: The key of the space to be queried for its content.</li>
     *   <li>title: The title of the page to be returned. Required for &amp;lt;code&amp;gt;page&amp;lt;/code&amp;gt; type.</li>
     *   <li>status: Filter the results to a set of content based on their status. If set to {@code any}, content with any status is returned. Note, the {@code historical} status is currently not supported.</li>
     *   <li>postingDay: The posting date of the blog post to be returned. Required for &amp;lt;code&amp;gt;blogpost&amp;lt;/code&amp;gt; type. Format: &amp;lt;code&amp;gt;yyyy-mm-dd&amp;lt;/code&amp;gt;.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand. Maximum sub-expansions allowed is {@code 8}.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.</li>
     *   <li>trigger: If set to {@code viewed}, the request will trigger a 'viewed' event for the content. When this event is triggered, the page/blogpost will appear on the 'Recently visited' tab of the user's Confluence dashboard.</li>
     *   <li>orderby: Orders the content by a particular field. Specify the field and sort direction for this parameter, as follows: 'fieldpath asc/desc'. For example, 'history.createdDate desc'.</li>
     *   <li>start: The starting index of the returned content.</li>
     *   <li>limit: The maximum number of content objects to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public ContentArray getContent(Consumer<GetContentOperationSpec> spec) {
        GetContentOperationSpec r = new GetContentOperationSpec(spec);
        return api.getContent(r.type(), r.spaceKey(), r.title(), r.status(), r.postingDay(), r.expand(), r.trigger(), r.orderby(), r.start(), r.limit());
    }

    /**
     * Get content by ID
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns a single piece of content, like a page or a blog post.
     * By default, the following objects are expanded: {@code space}, {@code history}, {@code version}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content. If the content is a blog post, 'View' permission for the space is required.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be returned. If you don't know the content ID, use [Get content](#api-content-get) and filter the results.</li>
     *   <li>status: Filter the results to a set of content based on their status. If set to {@code any}, content with any status is returned. Note, the {@code historical} status is currently not supported.</li>
     *   <li>version: The version number of the content to be returned.</li>
     *   <li>embeddedContentRender: The version of embedded content (e.g. attachments) to render.  - &amp;lt;code&amp;gt;current&amp;lt;/code&amp;gt; renders the latest version of the embedded content. - &amp;lt;code&amp;gt;version-at-save&amp;lt;/code&amp;gt; renders the version of the embedded content at the time of save.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand. Maximum sub-expansions allowed is {@code 8}.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.</li>
     *   <li>trigger: If set to {@code viewed}, the request will trigger a 'viewed' event for the content. When this event is triggered, the page/blogpost will appear on the 'Recently visited' tab of the user's Confluence dashboard.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public Content getContentById(Consumer<GetContentByIdOperationSpec> spec) {
        GetContentByIdOperationSpec r = new GetContentByIdOperationSpec(spec);
        return api.getContentById(r.id(), r.status(), r.version(), r.embeddedContentRender(), r.expand(), r.trigger());
    }

    /**
     * Get content by type for space
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns all content of a given type, in a space. The returned content is ordered by content ID in ascending order.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space. Note, the returned list will only contain content that the current user has permission to view.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be queried for its content.</li>
     *   <li>type: The type of content to return. {@code page}, {@code blogpost}, {@code &amp;lt;some_customContentType&amp;gt;}.</li>
     *   <li>depth: Filter the results to content at the root level of the space or all content.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.</li>
     *   <li>start: The starting index of the returned content.</li>
     *   <li>limit: The maximum number of content objects to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public ContentArray getContentByTypeForSpace(Consumer<GetContentByTypeForSpaceOperationSpec> spec) {
        GetContentByTypeForSpaceOperationSpec r = new GetContentByTypeForSpaceOperationSpec(spec);
        return api.getContentByTypeForSpace(r.spaceKey(), r.type(), r.depth(), r.expand(), r.start(), r.limit());
    }

    /**
     * Get content children
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns a map of the direct children of a piece of content. A piece of content has different types of child content, depending on its type. These are the default parent-child content type relationships:
     * - {@code page}: child content is {@code page}, {@code comment}, {@code attachment} - {@code blogpost}: child content is {@code comment}, {@code attachment} - {@code attachment}: child content is {@code comment} - {@code comment}: child content is {@code attachment}
     * Apps can override these default relationships. Apps can also introduce new content types that create new parent-child content relationships.
     * Note, the map will always include all child content types that are valid for the content. However, if the content has no instances of a child content type, the map will contain an empty array for that child content type.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space, and permission to view the content if it is a page.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its children.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the children to expand, where:  - {@code attachment} returns all attachments for the content. - {@code comments} returns all comments for the content. - {@code page} returns all child pages of the content. - Custom content types that are provided by apps are also supported.</li>
     *   <li>parentVersion: The version of the parent content to retrieve children for. Currently, this only works for the latest version.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public ContentChildren getContentChildren(Consumer<GetContentChildrenOperationSpec> spec) {
        GetContentChildrenOperationSpec r = new GetContentChildrenOperationSpec(spec);
        return api.getContentChildren(r.id(), r.expand(), r.parentVersion());
    }

    /**
     * Get content children by type
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns all children of a given type, for a piece of content. A piece of content has different types of child content, depending on its type:
     * - {@code page}: child content is {@code page}, {@code comment}, {@code attachment} - {@code blogpost}: child content is {@code comment}, {@code attachment} - {@code attachment}: child content is {@code comment} - {@code comment}: child content is {@code attachment}
     * Custom content types that are provided by apps can also be returned.
     * Note, this method only returns direct children. To return children at all levels, use [Get descendants by type](#api-content-id-descendant-type-get).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space, and permission to view the content if it is a page.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its children.</li>
     *   <li>type: The type of children to return.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.</li>
     *   <li>parentVersion: The version of the parent content to retrieve children for. Currently, this only works for the latest version.</li>
     *   <li>start: The starting index of the returned content.</li>
     *   <li>limit: The maximum number of content to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public ContentArray getContentChildrenByType(Consumer<GetContentChildrenByTypeOperationSpec> spec) {
        GetContentChildrenByTypeOperationSpec r = new GetContentChildrenByTypeOperationSpec(spec);
        return api.getContentChildrenByType(r.id(), r.type(), r.expand(), r.parentVersion(), r.start(), r.limit());
    }

    /**
     * Get content comments
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns the comments on a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space, and permission to view the content if it is a page.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its comments.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.</li>
     *   <li>parentVersion: The version of the parent content to retrieve children for. Currently, this only works for the latest version.</li>
     *   <li>start: The starting index of the returned comments.</li>
     *   <li>limit: The maximum number of comments to return per page. Note, this may be restricted by fixed system limits.</li>
     *   <li>location: The location of the comments in the page. Multiple locations can be specified. If no location is specified, comments from all locations are returned.</li>
     *   <li>depth: Currently, this parameter is not used. Comments are returned at the root level only.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public ContentArray getContentComments(Consumer<GetContentCommentsOperationSpec> spec) {
        GetContentCommentsOperationSpec r = new GetContentCommentsOperationSpec(spec);
        return api.getContentComments(r.id(), r.expand(), r.parentVersion(), r.start(), r.limit(), r.location(), r.depth());
    }

    /**
     * Get content descendants
     * <p>
     * Returns a map of the descendants of a piece of content. This is similar to [Get content children](#api-content-id-child-get), except that this method returns child pages at all levels, rather than just the direct child pages.
     * A piece of content has different types of descendants, depending on its type:
     * - {@code page}: descendant is {@code page}, {@code comment}, {@code attachment} - {@code blogpost}: descendant is {@code comment}, {@code attachment} - {@code attachment}: descendant is {@code comment} - {@code comment}: descendant is {@code attachment}
     * The map will always include all descendant types that are valid for the content. However, if the content has no instances of a descendant type, the map will contain an empty array for that descendant type.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space, and permission to view the content if it is a page.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its descendants.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the children to expand, where:  - {@code attachment} returns all attachments for the content. - {@code comments} returns all comments for the content. - {@code page} returns all child pages of the content.</li>
     * </ul>
     */
    public ContentChildren getContentDescendants(Consumer<GetContentDescendantsOperationSpec> spec) {
        GetContentDescendantsOperationSpec r = new GetContentDescendantsOperationSpec(spec);
        return api.getContentDescendants(r.id(), r.expand());
    }

    /**
     * Get content for space
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns all content in a space. The returned content is grouped by type (pages then blogposts), then ordered by content ID in ascending order.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space. Note, the returned list will only contain content that the current user has permission to view.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be queried for its content.</li>
     *   <li>depth: Filter the results to content at the root level of the space or all content.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.</li>
     *   <li>start: The starting index of the returned content.</li>
     *   <li>limit: The maximum number of content objects to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public GetContentForSpace200Response getContentForSpace(Consumer<GetContentForSpaceOperationSpec> spec) {
        GetContentForSpaceOperationSpec r = new GetContentForSpaceOperationSpec(spec);
        return api.getContentForSpace(r.spaceKey(), r.depth(), r.expand(), r.start(), r.limit());
    }

    /**
     * Get content properties
     * <p>
     * Returns the properties for a piece of content. For more information about content properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space, and permission to view the content if it is a page.
     * Authentication - Required Scopes: [read:confluence-props]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its properties.</li>
     *   <li>key: The key of the content property.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand. By default, the {@code version} object is expanded.  - {@code content} returns the content that the property is stored against. - {@code version} returns information about the version of the property, such as the version number, when it was created, etc.</li>
     *   <li>start: The starting index of the returned properties.</li>
     *   <li>limit: The maximum number of properties to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public ContentPropertyArray getContentProperties(Consumer<GetContentPropertiesOperationSpec> spec) {
        GetContentPropertiesOperationSpec r = new GetContentPropertiesOperationSpec(spec);
        return api.getContentProperties(r.id(), r.key(), r.expand(), r.start(), r.limit());
    }

    /**
     * Get content property
     * <p>
     * Returns a content property for a piece of content. For more information, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space, and permission to view the content if it is a page.
     * Authentication - Required Scopes: [read:confluence-props]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for the property.</li>
     *   <li>key: The key of the content property.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand. By default, the {@code version} object is expanded.  - {@code content} returns the content that the property is stored against. - {@code version} returns information about the version of the property, such as the version number, when it was created, etc.</li>
     *   <li>status: Filter the results to a set of content based on their status. If set to {@code any}, content with any status is returned. By default it will fetch current and archived statuses {@code ?status=current&amp;status=archived}. All supported statuses  - any - archived - current - deleted - draft - trashed</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public ContentProperty getContentProperty(Consumer<GetContentPropertyOperationSpec> spec) {
        GetContentPropertyOperationSpec r = new GetContentPropertyOperationSpec(spec);
        return api.getContentProperty(r.id(), r.key(), r.expand(), r.status());
    }

    /**
     * Get content restriction status for group
     * <p>
     * Deprecated, use [Get content restriction status for group via groupId](https://developer.atlassian.com/cloud/confluence/rest/v1/api-group-content-restrictions/#api-wiki-rest-api-content-id-restriction-byoperation-operationkey-bygroupid-groupid-get). Returns whether the specified content restriction applies to a group. For example, if a page with {@code id=123} has a {@code read} restriction for the {@code admins} group, the following request will return {@code true}:
     * {@code /wiki/rest/api/content/123/restriction/byOperation/read/group/admins}
     * Note that a response of {@code true} does not guarantee that the group can view the page, as it does not account for account-inherited restrictions, space permissions, or even product access. For more information, see [Confluence permissions](https://confluence.atlassian.com/x/_AozKw).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the restriction applies to.</li>
     *   <li>operationKey: The operation that the restriction applies to.</li>
     *   <li>groupName: The name of the group to be queried for whether the content restriction applies to it.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public void getContentRestrictionStatusForGroup(Consumer<GetContentRestrictionStatusForGroupOperationSpec> spec) {
        GetContentRestrictionStatusForGroupOperationSpec r = new GetContentRestrictionStatusForGroupOperationSpec(spec);
        api.getContentRestrictionStatusForGroup(r.id(), r.operationKey(), r.groupName());
    }

    /**
     * Get content restriction status for user
     * <p>
     * Returns whether the specified content restriction applies to a user. For example, if a page with {@code id=123} has a {@code read} restriction for a user with an account ID of {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}, the following request will return {@code true}:
     * {@code /wiki/rest/api/content/123/restriction/byOperation/read/user?accountId=384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}
     * Note that a response of {@code true} does not guarantee that the user can view the page, as it does not account for account-inherited restrictions, space permissions, or even product access. For more information, see [Confluence permissions](https://confluence.atlassian.com/x/_AozKw).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the restriction applies to.</li>
     *   <li>operationKey: The operation that is restricted.</li>
     *   <li>key: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>username: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     * </ul>
     */
    public void getContentRestrictionStatusForUser(Consumer<GetContentRestrictionStatusForUserOperationSpec> spec) {
        GetContentRestrictionStatusForUserOperationSpec r = new GetContentRestrictionStatusForUserOperationSpec(spec);
        api.getContentRestrictionStatusForUser(r.id(), r.operationKey(), r.key(), r.username(), r.accountId());
    }

    /**
     * Get content state
     * <p>
     * Gets the current content state of the draft or current version of content. To specify the draft version, set the parameter status to draft, otherwise archived or current will get the relevant published state. **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The id of the content whose content state is of interest.</li>
     *   <li>status: Set status to one of [current,draft,archived]. Default value is current.</li>
     * </ul>
     */
    public ContentStateResponse getContentState(Consumer<GetContentStateOperationSpec> spec) {
        GetContentStateOperationSpec r = new GetContentStateOperationSpec(spec);
        return api.getContentState(r.id(), r.status());
    }

    /**
     * Get content state settings for space
     * <p>
     * Get object describing whether content states are allowed at all, if custom content states or space content states are restricted, and a list of space content states allowed for the space if they are not restricted.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Space admin permission
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be queried for its content state settings.</li>
     * </ul>
     */
    public ContentStateSettings getContentStateSettings(Consumer<GetContentStateSettingsOperationSpec> spec) {
        GetContentStateSettingsOperationSpec r = new GetContentStateSettingsOperationSpec(spec);
        return api.getContentStateSettings(r.spaceKey());
    }

    /**
     * Get content template
     * <p>
     * Returns a content template. This includes information about template, like the name, the space or blueprint that the template is in, the body of the template, and more.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space to view space templates and permission to access the Confluence site ('Can use' global permission) to view global templates.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>contentTemplateId: The ID of the content template to be returned.</li>
     * </ul>
     */
    public ContentTemplate getContentTemplate(Consumer<GetContentTemplateOperationSpec> spec) {
        GetContentTemplateOperationSpec r = new GetContentTemplateOperationSpec(spec);
        return api.getContentTemplate(r.contentTemplateId());
    }

    /**
     * Get content templates
     * <p>
     * Returns all content templates. Use this method to retrieve all global content templates or all content templates in a space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space to view space templates and permission to access the Confluence site ('Can use' global permission) to view global templates.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be queried for templates. If the {@code spaceKey} is not specified, global templates will be returned.</li>
     *   <li>start: The starting index of the returned templates.</li>
     *   <li>limit: The maximum number of templates to return per page. Note, this may be restricted by fixed system limits.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the template to expand.  - {@code body} returns the content of the template in storage format.</li>
     * </ul>
     */
    public ContentTemplateArray getContentTemplates(Consumer<GetContentTemplatesOperationSpec> spec) {
        GetContentTemplatesOperationSpec r = new GetContentTemplatesOperationSpec(spec);
        return api.getContentTemplates(r.spaceKey(), r.start(), r.limit(), r.expand());
    }

    /**
     * Get content version
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns a version for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content. If the content is a blog post, 'View' permission for the space is required.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its version.</li>
     *   <li>versionNumber: The number of the version to be retrieved.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand. By default, the {@code content} object is expanded.  - {@code collaborators} returns the users that collaborated on the version. - {@code content} returns the content for the version.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public Version getContentVersion(Consumer<GetContentVersionOperationSpec> spec) {
        GetContentVersionOperationSpec r = new GetContentVersionOperationSpec(spec);
        return api.getContentVersion(r.id(), r.versionNumber(), r.expand());
    }

    /**
     * Get content versions
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns the versions for a piece of content in descending order.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content. If the content is a blog post, 'View' permission for the space is required.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its versions.</li>
     *   <li>start: The starting index of the returned versions.</li>
     *   <li>limit: The maximum number of versions to return per page. Note, this may be restricted by fixed system limits.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand. By default, the {@code content} object is expanded.  - {@code collaborators} returns the users that collaborated on the version. - {@code content} returns the content for the version.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public VersionArray getContentVersions(Consumer<GetContentVersionsOperationSpec> spec) {
        GetContentVersionsOperationSpec r = new GetContentVersionsOperationSpec(spec);
        return api.getContentVersions(r.id(), r.start(), r.limit(), r.expand());
    }

    /**
     * Get content watch status
     * <p>
     * Returns whether a user is watching a piece of content. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>contentId: The ID of the content to be queried for whether the specified user is watching it.</li>
     *   <li>key: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>username: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     * </ul>
     */
    public UserWatch getContentWatchStatus(Consumer<GetContentWatchStatusOperationSpec> spec) {
        GetContentWatchStatusOperationSpec r = new GetContentWatchStatusOperationSpec(spec);
        return api.getContentWatchStatus(r.contentId(), r.key(), r.username(), r.accountId());
    }

    /**
     * Get content in space with given content state
     * <p>
     * Finds paginated content with
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Space View Permission
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be queried for its content state settings.</li>
     *   <li>stateId: The id of the content state to filter content by</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand. Options include: space, version, history, children, etc.  Ex: space,version</li>
     *   <li>limit: Maximum number of results to return</li>
     *   <li>start: Number of result to start returning. (0 indexed)</li>
     * </ul>
     */
    public ContentArray getContentsWithState(Consumer<GetContentsWithStateOperationSpec> spec) {
        GetContentsWithStateOperationSpec r = new GetContentsWithStateOperationSpec(spec);
        return api.getContentsWithState(r.spaceKey(), r.stateId(), r.expand(), r.limit(), r.start());
    }

    /**
     * Get current user
     * <p>
     * Returns the currently logged-in user. This includes information about the user, like the display name, userKey, account ID, profile picture, and more.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-user]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>expand: A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.   - {@code personalSpace} returns the user's personal space, if it exists.   - {@code isExternalCollaborator} returns whether the user is an external collaborator user.</li>
     * </ul>
     */
    public User getCurrentUser(Consumer<GetCurrentUserOperationSpec> spec) {
        GetCurrentUserOperationSpec r = new GetCurrentUserOperationSpec(spec);
        return api.getCurrentUser(r.expand());
    }

    /**
     * Get Custom Content States
     * <p>
     * Get custom content states that authenticated user has created.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required** Must have user authentication.
     * Authentication - Required Scopes: [read:user.property:confluence]
     */
    public List<ContentState> getCustomContentStates() {
        return api.getCustomContentStates();
    }

    /**
     * Get content descendants by type
     * <p>
     * Returns all descendants of a given type, for a piece of content. This is similar to [Get content children by type](#api-content-id-child-type-get), except that this method returns child pages at all levels, rather than just the direct child pages.
     * A piece of content has different types of descendants, depending on its type:
     * - {@code page}: descendant is {@code page}, {@code comment}, {@code attachment} - {@code blogpost}: descendant is {@code comment}, {@code attachment} - {@code attachment}: descendant is {@code comment} - {@code comment}: descendant is {@code attachment}
     * Custom content types that are provided by apps can also be returned.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space, and permission to view the content if it is a page.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its descendants.</li>
     *   <li>type: The type of descendants to return.</li>
     *   <li>depth: Filter the results to descendants upto a desired level of the content. Note, the maximum value supported is 100. root level of the content means immediate (level 1) descendants of the type requested. all represents returning all descendants of the type requested.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.</li>
     *   <li>start: The starting index of the returned content.</li>
     *   <li>limit: The maximum number of content to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public ContentArray getDescendantsOfType(Consumer<GetDescendantsOfTypeOperationSpec> spec) {
        GetDescendantsOfTypeOperationSpec r = new GetDescendantsOfTypeOperationSpec(spec);
        return api.getDescendantsOfType(r.id(), r.type(), r.depth(), r.expand(), r.start(), r.limit());
    }

    /**
     * Get global theme
     * <p>
     * Returns the globally assigned theme.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: None
     * Authentication - Required Scopes: [manage:confluence-configuration]
     */
    public Theme getGlobalTheme() {
        return api.getGlobalTheme();
    }

    /**
     * Get group
     * <p>
     * Returns a user group for a given group id.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-groups]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The id of the group.</li>
     * </ul>
     */
    public Group getGroupByGroupId(Consumer<GetGroupByGroupIdOperationSpec> spec) {
        GetGroupByGroupIdOperationSpec r = new GetGroupByGroupIdOperationSpec(spec);
        return api.getGroupByGroupId(r.id());
    }

    /**
     * Get group
     * <p>
     * Returns a user group for a given group name.
     * Use updated Get group API
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>groupName: The name of the group. This is the same as the group name shown in the Confluence administration console.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public Group getGroupByName(Consumer<GetGroupByNameOperationSpec> spec) {
        GetGroupByNameOperationSpec r = new GetGroupByNameOperationSpec(spec);
        return api.getGroupByName(r.groupName());
    }

    /**
     * Get group
     * <p>
     * Returns a user group for a given group name.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-groups]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>name: The name of the group. This is the same as the group name shown in the Confluence administration console.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public Group getGroupByQueryParam(Consumer<GetGroupByQueryParamOperationSpec> spec) {
        GetGroupByQueryParamOperationSpec r = new GetGroupByQueryParamOperationSpec(spec);
        return api.getGroupByQueryParam(r.name());
    }

    /**
     * Get group members
     * <p>
     * Returns the users that are members of a group.
     * Use updated Get group API
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>groupName: The name of the group to be queried for its members.</li>
     *   <li>start: The starting index of the returned users.</li>
     *   <li>limit: The maximum number of users to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public UserArray getGroupMembers(Consumer<GetGroupMembersOperationSpec> spec) {
        GetGroupMembersOperationSpec r = new GetGroupMembersOperationSpec(spec);
        return api.getGroupMembers(r.groupName(), r.start(), r.limit());
    }

    /**
     * Get group members
     * <p>
     * Returns the users that are members of a group.
     * Use updated Get group API
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-groups]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>groupId: The id of the group to be queried for its members.</li>
     *   <li>start: The starting index of the returned users.</li>
     *   <li>limit: The maximum number of users to return per page. Note, this may be restricted by fixed system limits.</li>
     *   <li>shouldReturnTotalSize: Whether to include total size parameter in the results. Note, fetching total size property is an expensive operation; use it if your use case needs this value.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.   - {@code personalSpace} returns the user's personal space, if it exists.   - {@code isExternalCollaborator} returns whether the user is an external collaborator user.</li>
     * </ul>
     */
    public UserArray getGroupMembersByGroupId(Consumer<GetGroupMembersByGroupIdOperationSpec> spec) {
        GetGroupMembersByGroupIdOperationSpec r = new GetGroupMembersByGroupIdOperationSpec(spec);
        return api.getGroupMembersByGroupId(r.groupId(), r.start(), r.limit(), r.shouldReturnTotalSize(), r.expand());
    }

    /**
     * Get group memberships for user
     * <p>
     * Returns the groups that a user is a member of.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-user]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     *   <li>start: The starting index of the returned groups.</li>
     *   <li>limit: The maximum number of groups to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public GroupArrayWithLinks getGroupMembershipsForUser(Consumer<GetGroupMembershipsForUserOperationSpec> spec) {
        GetGroupMembershipsForUserOperationSpec r = new GetGroupMembershipsForUserOperationSpec(spec);
        return api.getGroupMembershipsForUser(r.accountId(), r.start(), r.limit());
    }

    /**
     * Get groups
     * <p>
     * Returns all user groups. The returned groups are ordered alphabetically in ascending order by group name.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-groups]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>start: The starting index of the returned groups.</li>
     *   <li>limit: The maximum number of groups to return per page. Note, this may be restricted by fixed system limits.</li>
     *   <li>accessType: The group permission level for which to filter results.</li>
     * </ul>
     */
    public GroupArrayWithLinks getGroups(Consumer<GetGroupsOperationSpec> spec) {
        GetGroupsOperationSpec r = new GetGroupsOperationSpec(spec);
        return api.getGroups(r.start(), r.limit(), r.accessType());
    }

    /**
     * Get content history
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns the most recent update for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its history.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content history to expand. Maximum sub-expansions allowed is {@code 8}.  - {@code lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code previousVersion} returns information about the update prior to the current content update. For this method, it contains the same information as {@code lastUpdated}. - {@code contributors} returns all of the users who have contributed to the content. - {@code nextVersion} This parameter is not used for this method.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public ContentHistory getHistoryForContent(Consumer<GetHistoryForContentOperationSpec> spec) {
        GetHistoryForContentOperationSpec r = new GetHistoryForContentOperationSpec(spec);
        return api.getHistoryForContent(r.id(), r.expand());
    }

    /**
     * Get content restriction status for group
     * <p>
     * Returns whether the specified content restriction applies to a group. For example, if a page with {@code id=123} has a {@code read} restriction for the {@code 123456} group id, the following request will return {@code true}:
     * {@code /wiki/rest/api/content/123/restriction/byOperation/read/byGroupId/123456}
     * Note that a response of {@code true} does not guarantee that the group can view the page, as it does not account for account-inherited restrictions, space permissions, or even product access. For more information, see [Confluence permissions](https://confluence.atlassian.com/x/_AozKw).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the restriction applies to.</li>
     *   <li>operationKey: The operation that the restriction applies to.</li>
     *   <li>groupId: The id of the group to be queried for whether the content restriction applies to it.</li>
     * </ul>
     */
    public void getIndividualGroupRestrictionStatusByGroupId(Consumer<GetIndividualGroupRestrictionStatusByGroupIdOperationSpec> spec) {
        GetIndividualGroupRestrictionStatusByGroupIdOperationSpec r = new GetIndividualGroupRestrictionStatusByGroupIdOperationSpec(spec);
        api.getIndividualGroupRestrictionStatusByGroupId(r.id(), r.operationKey(), r.groupId());
    }

    /**
     * Get labels for content
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns the labels on a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space and permission to view the content if it is a page.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its labels.</li>
     *   <li>prefix: Filters the results to labels with the specified prefix. If this parameter is not specified, then labels with any prefix will be returned.  - {@code global} prefix is used by default when a user adds a label via the UI. - {@code my} prefix can be explicitly added by a user when adding a label via the UI, e.g. 'my:example-label'. Also, when a page is selected as a favourite, the 'my:favourite' label is automatically added. - {@code team} can used when adding labels via [Add labels to content](#api-content-id-label-post) but is not used in the UI.</li>
     *   <li>start: The starting index of the returned labels.</li>
     *   <li>limit: The maximum number of labels to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public LabelArray getLabelsForContent(Consumer<GetLabelsForContentOperationSpec> spec) {
        GetLabelsForContentOperationSpec r = new GetLabelsForContentOperationSpec(spec);
        return api.getLabelsForContent(r.id(), r.prefix(), r.start(), r.limit());
    }

    /**
     * Get Space Labels
     * <p>
     * Returns a list of labels associated with a space. Can provide a prefix as well as other filters to select different types of labels.
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to get labels for.</li>
     *   <li>prefix: Filters the results to labels with the specified prefix. If this parameter is not specified, then labels with any prefix will be returned.  - {@code global} prefix is used by labels that are on content within the provided space. - {@code my} prefix can be explicitly added by a user when adding a label via the UI, e.g. 'my:example-label'. - {@code team} prefix is used for labels applied to the space.</li>
     *   <li>start: The starting index of the returned labels.</li>
     *   <li>limit: The maximum number of labels to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public LabelArray getLabelsForSpace(Consumer<GetLabelsForSpaceOperationSpec> spec) {
        GetLabelsForSpaceOperationSpec r = new GetLabelsForSpaceOperationSpec(spec);
        return api.getLabelsForSpace(r.spaceKey(), r.prefix(), r.start(), r.limit());
    }

    /**
     * Get look and feel settings
     * <p>
     * Returns the look and feel settings for the site or a single space. This includes attributes such as the color scheme, padding, and border radius.
     * The look and feel settings for a space can be inherited from the global look and feel settings or provided by a theme.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: None
     * Authentication - Required Scopes: [manage:confluence-configuration]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space for which the look and feel settings will be returned. If this is not set, only the global look and feel settings are returned.</li>
     * </ul>
     */
    public LookAndFeelSettings getLookAndFeelSettings(Consumer<GetLookAndFeelSettingsOperationSpec> spec) {
        GetLookAndFeelSettingsOperationSpec r = new GetLookAndFeelSettingsOperationSpec(spec);
        return api.getLookAndFeelSettings(r.spaceKey());
    }

    /**
     * Get macro body by macro ID
     * <p>
     * Returns the body of a macro in storage format, for the given macro ID. This includes information like the name of the macro, the body of the macro, and any macro parameters. This method is mainly used by Cloud apps.
     * About the macro ID: When a macro is created in a new version of content, Confluence will generate a random ID for it, unless an ID is specified (by an app). The macro ID will look similar to this: '50884bd9-0cb8-41d5-98be-f80943c14f96'. The ID is then persisted as new versions of content are created, and is only modified by Confluence if there are conflicting IDs.
     * Note, to preserve backwards compatibility this resource will also match on the hash of the macro body, even if a macro ID is found. This check will eventually become redundant, as macro IDs are generated for pages and transparently propagate out to all instances.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content that the macro is in.
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID for the content that contains the macro.</li>
     *   <li>version: The version of the content that contains the macro. Specifying {@code 0} as the {@code version} will return the macro body for the latest content version.</li>
     *   <li>macroId: The ID of the macro. This is usually passed by the app that the macro is in. Otherwise, find the macro ID by querying the desired content and version, then expanding the body in storage format. For example, '/content/196611/version/7?expand=content.body.storage'.</li>
     * </ul>
     */
    public MacroInstance getMacroBodyByMacroId(Consumer<GetMacroBodyByMacroIdOperationSpec> spec) {
        GetMacroBodyByMacroIdOperationSpec r = new GetMacroBodyByMacroIdOperationSpec(spec);
        return api.getMacroBodyByMacroId(r.id(), r.version(), r.macroId());
    }

    /**
     * Get group members
     * <p>
     * Returns the users that are members of a group.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-groups]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>name: The name of the group to be queried for its members.</li>
     *   <li>start: The starting index of the returned users.</li>
     *   <li>limit: The maximum number of users to return per page. Note, this is restricted by fixed system limit of 200 which is to say if the limit parameter exceeds 200, this API will return a maximum of 200 users per page.</li>
     *   <li>shouldReturnTotalSize: Whether to include total size parameter in the results. Note, fetching total size property is an expensive operation; use it if your use case needs this value.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.   - {@code personalSpace} returns the user's personal space, if it exists.   - {@code isExternalCollaborator} returns whether the user is an external collaborator user.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public UserArray getMembersByQueryParam(Consumer<GetMembersByQueryParamOperationSpec> spec) {
        GetMembersByQueryParamOperationSpec r = new GetMembersByQueryParamOperationSpec(spec);
        return api.getMembersByQueryParam(r.name(), r.start(), r.limit(), r.shouldReturnTotalSize(), r.expand());
    }

    /**
     * Get modules
     * <p>
     * Returns all modules registered dynamically by the calling app.
     * **[Permissions](#permissions) required:** Only Connect apps can make this request.
     */
    public ConnectModules getModules() {
        return api.getModules();
    }

    /**
     * Get user email address
     * <p>
     * Returns a user's email address. This API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>accountId: The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}. Required.</li>
     * </ul>
     */
    public AccountIdEmailRecord getPrivacyUnsafeUserEmail(Consumer<GetPrivacyUnsafeUserEmailOperationSpec> spec) {
        GetPrivacyUnsafeUserEmailOperationSpec r = new GetPrivacyUnsafeUserEmailOperationSpec(spec);
        return api.getPrivacyUnsafeUserEmail(r.accountId());
    }

    /**
     * Get user email addresses in batch
     * <p>
     * Returns user email addresses for a set of accountIds. This API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603).
     * Any accounts which are not available will not be included in the result.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>accountId: The account IDs of the users.</li>
     * </ul>
     */
    public List<AccountIdEmailRecord> getPrivacyUnsafeUserEmailBulk(Consumer<GetPrivacyUnsafeUserEmailBulkOperationSpec> spec) {
        GetPrivacyUnsafeUserEmailBulkOperationSpec r = new GetPrivacyUnsafeUserEmailBulkOperationSpec(spec);
        return api.getPrivacyUnsafeUserEmailBulk(r.accountId());
    }

    /**
     * Find relationship from source to target
     * <p>
     * Find whether a particular type of relationship exists from a source entity to a target entity. Note, relationships are one way.
     * For example, you can use this method to find whether the current user has selected a particular page as a favorite (i.e. 'save for later'): {@code GET /wiki/rest/api/relation/favourite/from/user/current/to/content/123}
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view both the target entity and source entity.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>relationName: The name of the relationship. This method supports the 'favourite' (i.e. 'save for later') relationship as well as any other relationship types created via [Create relationship](#api-wiki-rest-api-relation-relationname-from-sourcetype-sourcekey-to-targettype-targetkey-put).</li>
     *   <li>sourceType: The source entity type of the relationship. This must be 'user', if the {@code relationName} is 'favourite'.</li>
     *   <li>sourceKey: - The identifier for the source entity:  - If {@code sourceType} is {@code user}, then specify either {@code current} (logged-in user), the user key of the user, or the account ID of the user. Note that the user key has been deprecated in favor of the account ID for this parameter. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. - If {@code sourceType} is 'content', then specify the content ID. - If {@code sourceType} is 'space', then specify the space key.</li>
     *   <li>targetType: The target entity type of the relationship. This must be 'space' or 'content', if the {@code relationName} is 'favourite'.</li>
     *   <li>targetKey: The identifier for the target entity:  - If {@code targetType} is {@code user}, then specify either {@code current} (logged-in user), the user key of the user, or the account ID of the user. Note that the user key has been deprecated in favor of the account ID for this parameter. See the [migration guide](https://developer.atlassian.com/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details. - If {@code targetType} is 'content', then specify the content ID. - If {@code targetType} is 'space', then specify the space key.</li>
     *   <li>sourceStatus: The status of the source. This parameter is only used when the {@code sourceType} is 'content'.</li>
     *   <li>targetStatus: The status of the target. This parameter is only used when the {@code targetType} is 'content'.</li>
     *   <li>sourceVersion: The version of the source. This parameter is only used when the {@code sourceType} is 'content' and the {@code sourceStatus} is 'historical'.</li>
     *   <li>targetVersion: The version of the target. This parameter is only used when the {@code targetType} is 'content' and the {@code targetStatus} is 'historical'.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the response object to expand.  - {@code relationData} returns information about the relationship, such as who created it and when it was created. - {@code source} returns the source entity. - {@code target} returns the target entity.</li>
     * </ul>
     */
    public Relation getRelationship(Consumer<GetRelationshipOperationSpec> spec) {
        GetRelationshipOperationSpec r = new GetRelationshipOperationSpec(spec);
        return api.getRelationship(r.relationName(), r.sourceType(), r.sourceKey(), r.targetType(), r.targetKey(), r.sourceStatus(), r.targetStatus(), r.sourceVersion(), r.targetVersion(), r.expand());
    }

    /**
     * Get restrictions
     * <p>
     * Returns the restrictions on a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its restrictions.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content restrictions to expand. By default, the following objects are expanded: {@code restrictions.user}, {@code restrictions.group}.  - {@code restrictions.user} returns the piece of content that the restrictions are applied to. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. - {@code content} returns the piece of content that the restrictions are applied to.</li>
     *   <li>start: The starting index of the users and groups in the returned restrictions.</li>
     *   <li>limit: The maximum number of users and the maximum number of groups, in the returned restrictions, to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public ContentRestrictionArray getRestrictions(Consumer<GetRestrictionsOperationSpec> spec) {
        GetRestrictionsOperationSpec r = new GetRestrictionsOperationSpec(spec);
        return api.getRestrictions(r.id(), r.expand(), r.start(), r.limit());
    }

    /**
     * Get restrictions by operation
     * <p>
     * Returns restrictions on a piece of content by operation. This method is similar to [Get restrictions](#api-content-id-restriction-get) except that the operations are properties of the return object, rather than items in a results array.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its restrictions.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content restrictions to expand.  - {@code restrictions.user} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code content} returns the piece of content that the restrictions are applied to.</li>
     * </ul>
     */
    public Map<String, GetRestrictionsByOperation200ResponseValue> getRestrictionsByOperation(Consumer<GetRestrictionsByOperationOperationSpec> spec) {
        GetRestrictionsByOperationOperationSpec r = new GetRestrictionsByOperationOperationSpec(spec);
        return api.getRestrictionsByOperation(r.id(), r.expand());
    }

    /**
     * Get restrictions for operation
     * <p>
     * Returns the restictions on a piece of content for a given operation (read or update).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content.
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its restrictions.</li>
     *   <li>operationKey: The operation type of the restrictions to be returned.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content restrictions to expand.  - {@code restrictions.user} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code content} returns the piece of content that the restrictions are applied to.</li>
     *   <li>start: The starting index of the users and groups in the returned restrictions.</li>
     *   <li>limit: The maximum number of users and the maximum number of groups, in the returned restrictions, to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public ContentRestriction getRestrictionsForOperation(Consumer<GetRestrictionsForOperationOperationSpec> spec) {
        GetRestrictionsForOperationOperationSpec r = new GetRestrictionsForOperationOperationSpec(spec);
        return api.getRestrictionsForOperation(r.id(), r.operationKey(), r.expand(), r.start(), r.limit());
    }

    /**
     * Get retention period
     * <p>
     * Returns the retention period for records in the audit log. The retention period is how long an audit record is kept for, from creation date until it is deleted.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission.
     * Authentication - Required Scopes: [read:audit-log:confluence]
     */
    public RetentionPeriod getRetentionPeriod() {
        return api.getRetentionPeriod();
    }

    /**
     * Get space
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns a space. This includes information like the name, description, and permissions, but not the content in the space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space.
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be returned.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the spaces to expand, where:    - {@code settings} returns the settings for the space, similar to [Get space settings](#api-space-spaceKey-settings-get).   - {@code metadata} returns the space metadata.   - {@code metadata.labels} returns the space labels, which are used to categorize the space.   - {@code operations} returns the operations for a space, which are used when setting permissions.   - {@code lookAndFeel} returns information about the look and feel of the space, including the color scheme.   - {@code permissions} returns the permissions for the space. Note that this may return permissions for deleted groups,   because deleting a group doesn't remove associated space permissions.   - {@code icon} returns information about space icon.   - {@code description} returns the description of the space.   - {@code description.plain} returns the description of the space, the plain format.   - {@code description.view} returns the description of the space, the view format.   - {@code theme} returns information about the space theme.   - {@code homepage} returns information about the space homepage.   - {@code history} returns information about the history of the space.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public Space getSpace(Consumer<GetSpaceOperationSpec> spec) {
        GetSpaceOperationSpec r = new GetSpaceOperationSpec(spec);
        return api.getSpace(r.spaceKey(), r.expand());
    }

    /**
     * Get space suggested content states
     * <p>
     * Get content states that are suggested in the space. **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Space view permission
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be queried for its content state settings.</li>
     * </ul>
     */
    public List<ContentState> getSpaceContentStates(Consumer<GetSpaceContentStatesOperationSpec> spec) {
        GetSpaceContentStatesOperationSpec r = new GetSpaceContentStatesOperationSpec(spec);
        return api.getSpaceContentStates(r.spaceKey());
    }

    /**
     * Get space properties
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns all properties for the given space. Space properties are a key-value storage associated with a space.
     * **[Permissions required](https://confluence.atlassian.com/x/_AozKw)**: ‘View’ permission for the space.
     * Authentication - Required Scopes: [read:confluence-props]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be queried for its properties.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the space property to expand. By default, the {@code version} object is expanded.  - {@code version} returns information about the version of the content. - {@code space} returns the space that the properties are in.</li>
     *   <li>start: The starting index of the returned objects.</li>
     *   <li>limit: The maximum number of properties to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public SpacePropertyArray getSpaceProperties(Consumer<GetSpacePropertiesOperationSpec> spec) {
        GetSpacePropertiesOperationSpec r = new GetSpacePropertiesOperationSpec(spec);
        return api.getSpaceProperties(r.spaceKey(), r.expand(), r.start(), r.limit());
    }

    /**
     * Get space property
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns a space property.
     * **[Permissions required](https://confluence.atlassian.com/x/_AozKw)**: ‘View’ permission for the space.
     * Authentication - Required Scopes: [read:confluence-props]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space that the property is in.</li>
     *   <li>key: The key of the space property.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the space property to expand. By default, the {@code version} object is expanded.  - {@code version} returns information about the version of the content. - {@code space} returns the space that the properties are in.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public SpaceProperty getSpaceProperty(Consumer<GetSpacePropertyOperationSpec> spec) {
        GetSpacePropertyOperationSpec r = new GetSpacePropertyOperationSpec(spec);
        return api.getSpaceProperty(r.spaceKey(), r.key(), r.expand());
    }

    /**
     * Get space settings
     * <p>
     * Returns the settings of a space. Currently only the {@code routeOverrideEnabled} setting can be returned.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'View' permission for the space.
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be queried for its settings.</li>
     * </ul>
     */
    public SpaceSettings getSpaceSettings(Consumer<GetSpaceSettingsOperationSpec> spec) {
        GetSpaceSettingsOperationSpec r = new GetSpaceSettingsOperationSpec(spec);
        return api.getSpaceSettings(r.spaceKey());
    }

    /**
     * Get space theme
     * <p>
     * Returns the theme selected for a space, if one is set. If no space theme is set, this means that the space is inheriting the global look and feel settings.
     * **[Permissions required](https://confluence.atlassian.com/x/_AozKw)**: ‘View’ permission for the space.
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be queried for its theme.</li>
     * </ul>
     */
    public Theme getSpaceTheme(Consumer<GetSpaceThemeOperationSpec> spec) {
        GetSpaceThemeOperationSpec r = new GetSpaceThemeOperationSpec(spec);
        return api.getSpaceTheme(r.spaceKey());
    }

    /**
     * Get spaces
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns all spaces. The returned spaces are ordered alphabetically in ascending order by space key.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Note, the returned list will only contain spaces that the current user has permission to view.
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be returned. To return multiple spaces, specify this parameter multiple times with different values.</li>
     *   <li>spaceId: The id of the space to be returned. To return multiple spaces, specify this parameter multiple times with different values.</li>
     *   <li>type: Filter the results to spaces based on their type.</li>
     *   <li>status: Filter the results to spaces based on their status.</li>
     *   <li>label: Filter the results to spaces based on their label.</li>
     *   <li>favourite: Filter the results to the favourite spaces of the user specified by {@code favouriteUserKey}. Note, 'favourite' spaces are also known as 'saved for later' spaces.</li>
     *   <li>favouriteUserKey: The userKey of the user, whose favourite spaces are used to filter the results when using the {@code favourite} parameter.  Leave blank for the current user. Use [Get user](#api-user-get) to get the userKey for a user.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the spaces to expand, where:    - {@code settings} returns the settings for the space, similar to [Get space settings](#api-space-spaceKey-settings-get).   - {@code metadata} returns the space metadata.   - {@code metadata.labels} returns the space labels, which are used to categorize the space.   - {@code operations} returns the operations for a space, which are used when setting permissions.   - {@code lookAndFeel} returns information about the look and feel of the space, including the color scheme.   - {@code permissions} returns the permissions for the space. Note that this may return permissions for deleted groups,   because deleting a group doesn't remove associated space permissions.   - {@code icon} returns information about space icon.   - {@code description} returns the description of the space.   - {@code description.plain} returns the description of the space, the plain format.   - {@code description.view} returns the description of the space, the view format.   - {@code theme} returns information about the space theme.   - {@code homepage} returns information about the space homepage.   - {@code history} returns information about the history of the space.</li>
     *   <li>start: The starting index of the returned spaces.</li>
     *   <li>limit: The maximum number of spaces to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public SpaceArray getSpaces(Consumer<GetSpacesOperationSpec> spec) {
        GetSpacesOperationSpec r = new GetSpacesOperationSpec(spec);
        return api.getSpaces(r.spaceKey(), r.spaceId(), r.type(), r.status(), r.label(), r.favourite(), r.favouriteUserKey(), r.expand(), r.start(), r.limit());
    }

    /**
     * Get system info
     * <p>
     * Returns the system information for the Confluence Cloud tenant. This information is used by Atlassian.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [manage:confluence-configuration]
     */
    public SystemInfoEntity getSystemInfo() {
        return api.getSystemInfo();
    }

    /**
     * Get long-running task
     * <p>
     * Returns information about an active long-running task (e.g. space export), such as how long it has been running and the percentage of the task that has completed.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-space.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the task.</li>
     * </ul>
     */
    public LongTaskStatusWithLinks getTask(Consumer<GetTaskOperationSpec> spec) {
        GetTaskOperationSpec r = new GetTaskOperationSpec(spec);
        return api.getTask(r.id());
    }

    /**
     * Get inline task based on global ID
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns inline task based on the global ID.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content associated with the task.
     * Authentication - Required Scopes: [read:inlinetask:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>inlineTaskId: Global ID of the inline task</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public Task getTaskById(Consumer<GetTaskByIdOperationSpec> spec) {
        GetTaskByIdOperationSpec r = new GetTaskByIdOperationSpec(spec);
        return api.getTaskById(r.inlineTaskId());
    }

    /**
     * Get update on long running task for setting of content state.
     * <p>
     * Get Status of long running task that was previously created to set or remove content states from content. User must first create a task by passing in details to /wiki/rest/api/content-states PUT or DELETE endpoints.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required** Must have created long running task
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>taskId: taskId returned by put or delete requests to /wiki/rest/api/content-states</li>
     * </ul>
     */
    public ContentStateBulkSetTaskUpdate getTaskUpdate(Consumer<GetTaskUpdateOperationSpec> spec) {
        GetTaskUpdateOperationSpec r = new GetTaskUpdateOperationSpec(spec);
        return api.getTaskUpdate(r.taskId());
    }

    /**
     * Get long-running tasks
     * <p>
     * Returns information about all active long-running tasks (e.g. space export), such as how long each task has been running and the percentage of each task that has completed.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:content.metadata:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>start: The starting index of the returned tasks.</li>
     *   <li>limit: The maximum number of tasks to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public LongTaskStatusArray getTasks(Consumer<GetTasksOperationSpec> spec) {
        GetTasksOperationSpec r = new GetTasksOperationSpec(spec);
        return api.getTasks(r.start(), r.limit());
    }

    /**
     * Get theme
     * <p>
     * Returns a theme. This includes information about the theme name, description, and icon.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: None
     * Authentication - Required Scopes: [manage:confluence-configuration]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>themeKey: The key of the theme to be returned.</li>
     * </ul>
     */
    public Theme getTheme(Consumer<GetThemeOperationSpec> spec) {
        GetThemeOperationSpec r = new GetThemeOperationSpec(spec);
        return api.getTheme(r.themeKey());
    }

    /**
     * Get themes
     * <p>
     * Returns all [admin-driven themes](https://developer.atlassian.com/cloud/confluence/create-a-confluence-theme/), not including the default theme. Note that this API only applies to themes set for an entire space or site by the admin. User-driven theming controls (Light, Dark, and match browser) are an unrelated feature. Admin-driven themes will override user-driven themes.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: None
     * Authentication - Required Scopes: [manage:confluence-configuration]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>start: The starting index of the returned themes.</li>
     *   <li>limit: The maximum number of themes to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public ThemeArray getThemes(Consumer<GetThemesOperationSpec> spec) {
        GetThemesOperationSpec r = new GetThemesOperationSpec(spec);
        return api.getThemes(r.start(), r.limit());
    }

    /**
     * Get user
     * <p>
     * Returns a user. This includes information about the user, such as the display name, account ID, profile picture, and more. The information returned may be restricted by the user's profile visibility settings.
     * **Note:** to add, edit, or delete users in your organization, see the [user management REST API](/cloud/admin/user-management/about/).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-user]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the user to expand.    - {@code operations} returns the operations that the user is allowed to do.   - {@code personalSpace} returns the user's personal space, if it exists.   - {@code isExternalCollaborator} returns whether the user is an external collaborator user.</li>
     * </ul>
     */
    public User getUser(Consumer<GetUserOperationSpec> spec) {
        GetUserOperationSpec r = new GetUserOperationSpec(spec);
        return api.getUser(r.accountId(), r.expand());
    }

    /**
     * Get user properties
     * <p>
     * Returns the properties for a user as list of property keys. For more information about user properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/). {@code Note}, these properties stored against a user are on a Confluence site level and not space/content level.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:user.property:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>userId: The account ID of the user to be queried for its properties.</li>
     *   <li>start: The starting index of the returned properties.</li>
     *   <li>limit: The maximum number of properties to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public UserPropertyKeyArray getUserProperties(Consumer<GetUserPropertiesOperationSpec> spec) {
        GetUserPropertiesOperationSpec r = new GetUserPropertiesOperationSpec(spec);
        return api.getUserProperties(r.userId(), r.start(), r.limit());
    }

    /**
     * Get user property
     * <p>
     * Returns the property corresponding to {@code key} for a user. For more information about user properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/). {@code Note}, these properties stored against a user are on a Confluence site level and not space/content level.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:user.property:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>userId: The account ID of the user to be queried for its properties.</li>
     *   <li>key: The key of the user property.</li>
     * </ul>
     */
    public UserProperty getUserProperty(Consumer<GetUserPropertyOperationSpec> spec) {
        GetUserPropertyOperationSpec r = new GetUserPropertyOperationSpec(spec);
        return api.getUserProperty(r.userId(), r.key());
    }

    /**
     * Get viewers
     * <p>
     * Get the total number of distinct viewers a piece of content has.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>contentId: The ID of the content to get the viewers for.</li>
     *   <li>fromDate: The number of views for the content since the date.</li>
     * </ul>
     */
    public GetViewers200Response getViewers(Consumer<GetViewersOperationSpec> spec) {
        GetViewersOperationSpec r = new GetViewersOperationSpec(spec);
        return api.getViewers(r.contentId(), r.fromDate());
    }

    /**
     * Get views
     * <p>
     * Get the total number of views a piece of content has.
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>contentId: The ID of the content to get the views for.</li>
     *   <li>fromDate: The number of views for the content since the date.</li>
     * </ul>
     */
    public GetViews200Response getViews(Consumer<GetViewsOperationSpec> spec) {
        GetViewsOperationSpec r = new GetViewsOperationSpec(spec);
        return api.getViews(r.contentId(), r.fromDate());
    }

    /**
     * Get space watchers
     * <p>
     * Returns a list of watchers of a space
     * Authentication - Required Scopes: [read:watcher:confluence, read:user:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to get watchers.</li>
     *   <li>start: The start point of the collection to return.</li>
     *   <li>limit: The limit of the number of items to return, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public SpaceWatchArray getWatchersForSpace(Consumer<GetWatchersForSpaceOperationSpec> spec) {
        GetWatchersForSpaceOperationSpec r = new GetWatchersForSpaceOperationSpec(spec);
        return api.getWatchersForSpace(r.spaceKey(), r.start(), r.limit());
    }

    /**
     * Get watches for page
     * <p>
     * Returns the watches for a page. A user that watches a page will receive receive notifications when the page is updated.
     * If you want to manage watches for a page, use the following {@code user} methods:
     * - [Get content watch status for user](#api-user-watch-content-contentId-get) - [Add content watch](#api-user-watch-content-contentId-post) - [Remove content watch](#api-user-watch-content-contentId-delete)
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its watches.</li>
     *   <li>start: The starting index of the returned watches.</li>
     *   <li>limit: The maximum number of watches to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public WatchArray getWatchesForPage(Consumer<GetWatchesForPageOperationSpec> spec) {
        GetWatchesForPageOperationSpec r = new GetWatchesForPageOperationSpec(spec);
        return api.getWatchesForPage(r.id(), r.start(), r.limit());
    }

    /**
     * Get watches for space
     * <p>
     * Returns all space watches for the space that the content is in. A user that watches a space will receive receive notifications when any content in the space is updated.
     * If you want to manage watches for a space, use the following {@code user} methods:
     * - [Get space watch status for user](#api-user-watch-space-spaceKey-get) - [Add space watch](#api-user-watch-space-spaceKey-post) - [Remove space watch](#api-user-watch-space-spaceKey-delete)
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be queried for its watches.</li>
     *   <li>start: The starting index of the returned watches.</li>
     *   <li>limit: The maximum number of watches to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public SpaceWatchArray getWatchesForSpace(Consumer<GetWatchesForSpaceOperationSpec> spec) {
        GetWatchesForSpaceOperationSpec r = new GetWatchesForSpaceOperationSpec(spec);
        return api.getWatchesForSpace(r.id(), r.start(), r.limit());
    }

    /**
     * Get label watch status
     * <p>
     * Returns whether a user is watching a label. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>labelName: The name of the label to be queried for whether the specified user is watching it.</li>
     *   <li>key: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>username: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     * </ul>
     */
    public UserWatch isWatchingLabel(Consumer<IsWatchingLabelOperationSpec> spec) {
        IsWatchingLabelOperationSpec r = new IsWatchingLabelOperationSpec(spec);
        return api.isWatchingLabel(r.labelName(), r.key(), r.username(), r.accountId());
    }

    /**
     * Get space watch status
     * <p>
     * Returns whether a user is watching a space. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [read:confluence-content.summary]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be queried for whether the specified user is watching it.</li>
     *   <li>key: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>username: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     * </ul>
     */
    public UserWatch isWatchingSpace(Consumer<IsWatchingSpaceOperationSpec> spec) {
        IsWatchingSpaceOperationSpec r = new IsWatchingSpaceOperationSpec(spec);
        return api.isWatchingSpace(r.spaceKey(), r.key(), r.username(), r.accountId());
    }

    /**
     * Move a page to a new location relative to a target page
     * <p>
     * Move a page to a new location relative to a target page:
     * * {@code before} - move the page under the same parent as the target, before the target in the list of children * {@code after} - move the page under the same parent as the target, after the target in the list of children * {@code append} - move the page to be a child of the target
     * Caution: This API can move pages to the top level of a space. Top-level pages are difficult to find in the UI because they do not show up in the page tree display. To avoid this, never use {@code before} or {@code after} positions when the {@code targetId} is a top-level page.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>pageId: The ID of the page to be moved</li>
     *   <li>position: The position to move the page to relative to the target page: * {@code before} - move the page under the same parent as the target, before the target in the list of children * {@code after} - move the page under the same parent as the target, after the target in the list of children * {@code append} - move the page to be a child of the target</li>
     *   <li>targetId: The ID of the target page for this operation</li>
     * </ul>
     */
    public MovePage200Response movePage(Consumer<MovePageOperationSpec> spec) {
        MovePageOperationSpec r = new MovePageOperationSpec(spec);
        return api.movePage(r.pageId(), r.position(), r.targetId());
    }

    /**
     * Publish legacy draft
     * <p>
     * Publishes a legacy draft of a page created from a blueprint. Legacy drafts will eventually be removed in favor of shared drafts. For now, this method works the same as [Publish shared draft](#api-content-blueprint-instance-draftId-put).
     * By default, the following objects are expanded: {@code body.storage}, {@code history}, {@code space}, {@code version}, {@code ancestors}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the draft and 'Add' permission for the space that the content will be created in.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>draftId: The ID of the draft page that was created from a blueprint. You can find the {@code draftId} in the Confluence application by opening the draft page and checking the page URL.</li>
     *   <li>body: </li>
     *   <li>status: The status of the content to be updated, i.e. the draft. This is set to 'draft' by default, so you shouldn't need to specify it.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.</li>
     * </ul>
     */
    public Content publishLegacyDraft(Consumer<PublishLegacyDraftOperationSpec> spec) {
        PublishLegacyDraftOperationSpec r = new PublishLegacyDraftOperationSpec(spec);
        return api.publishLegacyDraft(r.draftId(), r.body(), r.status(), r.expand());
    }

    /**
     * Publish shared draft
     * <p>
     * Publishes a shared draft of a page created from a blueprint.
     * By default, the following objects are expanded: {@code body.storage}, {@code history}, {@code space}, {@code version}, {@code ancestors}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the draft and 'Add' permission for the space that the content will be created in.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>draftId: The ID of the draft page that was created from a blueprint. You can find the {@code draftId} in the Confluence application by opening the draft page and checking the page URL.</li>
     *   <li>body: </li>
     *   <li>status: The status of the content to be updated, i.e. the draft. This is set to 'draft' by default, so you shouldn't need to specify it.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.</li>
     * </ul>
     */
    public Content publishSharedDraft(Consumer<PublishSharedDraftOperationSpec> spec) {
        PublishSharedDraftOperationSpec r = new PublishSharedDraftOperationSpec(spec);
        return api.publishSharedDraft(r.draftId(), r.body(), r.status(), r.expand());
    }

    /**
     * Register modules
     * <p>
     * Registers a list of modules. For the list of modules that support dynamic registration, see [Dynamic modules](https://developer.atlassian.com/cloud/confluence/dynamic-modules/).
     * **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: </li>
     * </ul>
     */
    public void registerModules(Consumer<RegisterModulesOperationSpec> spec) {
        RegisterModulesOperationSpec r = new RegisterModulesOperationSpec(spec);
        api.registerModules(r.body());
    }

    /**
     * Removes the content state of a content and publishes a new version.
     * <p>
     * Removes the content state of the content specified and creates a new version (publishes the content without changing the body) of the content with the new status.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The Id of the content whose content state is to be set.</li>
     *   <li>status: status of content state from which to delete state. Can be draft or archived</li>
     * </ul>
     */
    public ContentStateResponse removeContentState(Consumer<RemoveContentStateOperationSpec> spec) {
        RemoveContentStateOperationSpec r = new RemoveContentStateOperationSpec(spec);
        return api.removeContentState(r.id(), r.status());
    }

    /**
     * Remove content watcher
     * <p>
     * Removes a user as a watcher from a piece of content. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>xAtlassianToken: Note, you must add header when making a request, as this operation has XSRF protection.</li>
     *   <li>contentId: The ID of the content to remove the watcher from.</li>
     *   <li>key: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>username: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     * </ul>
     */
    public void removeContentWatcher(Consumer<RemoveContentWatcherOperationSpec> spec) {
        RemoveContentWatcherOperationSpec r = new RemoveContentWatcherOperationSpec(spec);
        api.removeContentWatcher(r.xAtlassianToken(), r.contentId(), r.key(), r.username(), r.accountId());
    }

    /**
     * Delete user group
     * <p>
     * Delete user group.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: User must be a site admin.
     * Authentication - Required Scopes: [write:confluence-groups]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>name: Name of the group to delete.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public void removeGroup(Consumer<RemoveGroupOperationSpec> spec) {
        RemoveGroupOperationSpec r = new RemoveGroupOperationSpec(spec);
        api.removeGroup(r.name());
    }

    /**
     * Delete user group
     * <p>
     * Delete user group.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: User must be a site admin.
     * Authentication - Required Scopes: [write:confluence-groups]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: Id of the group to delete.</li>
     * </ul>
     */
    public void removeGroupById(Consumer<RemoveGroupByIdOperationSpec> spec) {
        RemoveGroupByIdOperationSpec r = new RemoveGroupByIdOperationSpec(spec);
        api.removeGroupById(r.id());
    }

    /**
     * Remove group from content restriction
     * <p>
     * Removes a group from a content restriction. That is, remove read or update permission for the group for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the restriction applies to.</li>
     *   <li>operationKey: The operation that the restriction applies to.</li>
     *   <li>groupId: The id of the group to remove from the content restriction.</li>
     * </ul>
     */
    public void removeGroupFromContentRestriction(Consumer<RemoveGroupFromContentRestrictionOperationSpec> spec) {
        RemoveGroupFromContentRestrictionOperationSpec r = new RemoveGroupFromContentRestrictionOperationSpec(spec);
        api.removeGroupFromContentRestriction(r.id(), r.operationKey(), r.groupId());
    }

    /**
     * Remove group from content restriction
     * <p>
     * Deprecated, use [Remove group from content restriction by groupId](https://developer.atlassian.com/cloud/confluence/rest/v1/api-group-content-restrictions/#api-wiki-rest-api-content-id-restriction-byoperation-operationkey-user-delete). Removes a group from a content restriction. That is, remove read or update permission for the group for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the restriction applies to.</li>
     *   <li>operationKey: The operation that the restriction applies to.</li>
     *   <li>groupName: The name of the group to remove from the content restriction.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public void removeGroupFromContentRestrictionById(Consumer<RemoveGroupFromContentRestrictionByIdOperationSpec> spec) {
        RemoveGroupFromContentRestrictionByIdOperationSpec r = new RemoveGroupFromContentRestrictionByIdOperationSpec(spec);
        api.removeGroupFromContentRestrictionById(r.id(), r.operationKey(), r.groupName());
    }

    /**
     * Remove label from content
     * <p>
     * Removes a label from a piece of content. Labels can't be deleted from archived content. This is similar to [Remove label from content using query parameter](#api-content-id-label-delete) except that the label name is specified via a path parameter.
     * Use this method if the label name does not have "/" characters, as the path parameter does not accept "/" characters for security reasons. Otherwise, use [Remove label from content using query parameter](#api-content-id-label-delete).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the label will be removed from.</li>
     *   <li>label: The name of the label to be removed.</li>
     * </ul>
     */
    public void removeLabelFromContent(Consumer<RemoveLabelFromContentOperationSpec> spec) {
        RemoveLabelFromContentOperationSpec r = new RemoveLabelFromContentOperationSpec(spec);
        api.removeLabelFromContent(r.id(), r.label());
    }

    /**
     * Remove label from content using query parameter
     * <p>
     * Removes a label from a piece of content. Labels can't be deleted from archived content. This is similar to [Remove label from content](#api-content-id-label-label-delete) except that the label name is specified via a query parameter.
     * Use this method if the label name has "/" characters, as [Remove label from content using query parameter](#api-content-id-label-delete) does not accept "/" characters for the label name.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the label will be removed from.</li>
     *   <li>name: The name of the label to be removed.</li>
     * </ul>
     */
    public void removeLabelFromContentUsingQueryParameter(Consumer<RemoveLabelFromContentUsingQueryParameterOperationSpec> spec) {
        RemoveLabelFromContentUsingQueryParameterOperationSpec r = new RemoveLabelFromContentUsingQueryParameterOperationSpec(spec);
        api.removeLabelFromContentUsingQueryParameter(r.id(), r.name());
    }

    /**
     * Remove label watcher
     * <p>
     * Removes a user as a watcher from a label. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>labelName: The name of the label to remove the watcher from.</li>
     *   <li>key: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>username: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     * </ul>
     */
    public void removeLabelWatcher(Consumer<RemoveLabelWatcherOperationSpec> spec) {
        RemoveLabelWatcherOperationSpec r = new RemoveLabelWatcherOperationSpec(spec);
        api.removeLabelWatcher(r.labelName(), r.key(), r.username(), r.accountId());
    }

    /**
     * Remove member from group
     * <p>
     * Remove user as a member from a group.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: User must be a site admin.
     * Authentication - Required Scopes: [write:confluence-groups]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>name: Name of the group whose membership is updated.</li>
     *   <li>key: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>username: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public void removeMemberFromGroup(Consumer<RemoveMemberFromGroupOperationSpec> spec) {
        RemoveMemberFromGroupOperationSpec r = new RemoveMemberFromGroupOperationSpec(spec);
        api.removeMemberFromGroup(r.name(), r.key(), r.username(), r.accountId());
    }

    /**
     * Remove member from group using group id
     * <p>
     * Remove user as a member from a group.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: User must be a site admin.
     * Authentication - Required Scopes: [write:confluence-groups]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>groupId: Id of the group whose membership is updated.</li>
     *   <li>key: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>username: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     * </ul>
     */
    public void removeMemberFromGroupByGroupId(Consumer<RemoveMemberFromGroupByGroupIdOperationSpec> spec) {
        RemoveMemberFromGroupByGroupIdOperationSpec r = new RemoveMemberFromGroupByGroupIdOperationSpec(spec);
        api.removeMemberFromGroupByGroupId(r.groupId(), r.key(), r.username(), r.accountId());
    }

    /**
     * Remove modules
     * <p>
     * Remove all or a list of modules registered by the calling app.
     * **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>moduleKey: The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, {@code moduleKey=dynamic-attachment-entity-property&amp;moduleKey=dynamic-select-field}. Nonexistent keys are ignored.</li>
     * </ul>
     */
    public void removeModules(Consumer<RemoveModulesOperationSpec> spec) {
        RemoveModulesOperationSpec r = new RemoveModulesOperationSpec(spec);
        api.removeModules(r.moduleKey());
    }

    /**
     * Remove a space permission
     * <p>
     * Removes a space permission. Note that removing Read Space permission for a user or group will remove all the space permissions for that user or group.
     * Note: Apps cannot access this REST resource - including when utilizing user impersonation.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     * Authentication - Required Scopes: [write:space.permission:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to be queried for its content.</li>
     *   <li>id: Id of the permission to be deleted.</li>
     * </ul>
     */
    public void removePermission(Consumer<RemovePermissionOperationSpec> spec) {
        RemovePermissionOperationSpec r = new RemovePermissionOperationSpec(spec);
        api.removePermission(r.spaceKey(), r.id());
    }

    /**
     * Remove space watch
     * <p>
     * Removes a user as a watcher from a space. Choose the user by doing one of the following:
     * - Specify a user via a query parameter: Use the {@code accountId} to identify the user. - Do not specify a user: The currently logged-in user will be used.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission if specifying a user, otherwise permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to remove the watcher from.</li>
     *   <li>key: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>username: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     * </ul>
     */
    public void removeSpaceWatch(Consumer<RemoveSpaceWatchOperationSpec> spec) {
        RemoveSpaceWatchOperationSpec r = new RemoveSpaceWatchOperationSpec(spec);
        api.removeSpaceWatch(r.spaceKey(), r.key(), r.username(), r.accountId());
    }

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
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>contentTemplateId: The ID of the template to be deleted.</li>
     * </ul>
     */
    public void removeTemplate(Consumer<RemoveTemplateOperationSpec> spec) {
        RemoveTemplateOperationSpec r = new RemoveTemplateOperationSpec(spec);
        api.removeTemplate(r.contentTemplateId());
    }

    /**
     * Remove user from content restriction
     * <p>
     * Removes a group from a content restriction. That is, remove read or update permission for the group for a piece of content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the restriction applies to.</li>
     *   <li>operationKey: The operation that the restriction applies to.</li>
     *   <li>key: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>username: This parameter is no longer available and will be removed from the documentation soon. Use {@code accountId} instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.</li>
     *   <li>accountId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, {@code 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192}.</li>
     * </ul>
     */
    public void removeUserFromContentRestriction(Consumer<RemoveUserFromContentRestrictionOperationSpec> spec) {
        RemoveUserFromContentRestrictionOperationSpec r = new RemoveUserFromContentRestrictionOperationSpec(spec);
        api.removeUserFromContentRestriction(r.id(), r.operationKey(), r.key(), r.username(), r.accountId());
    }

    /**
     * Reset look and feel settings
     * <p>
     * Resets the custom look and feel settings for the site or a single space. This changes the values of the custom settings to be the same as the default settings. It does not change which settings (default or custom) are selected. Note, the default space settings are inherited from the current global settings.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     * Authentication - Required Scopes: [manage:confluence-configuration]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space for which the look and feel settings will be reset. If this is not set, the global look and feel settings will be reset.</li>
     * </ul>
     */
    public void resetLookAndFeelSettings(Consumer<ResetLookAndFeelSettingsOperationSpec> spec) {
        ResetLookAndFeelSettingsOperationSpec r = new ResetLookAndFeelSettingsOperationSpec(spec);
        api.resetLookAndFeelSettings(r.spaceKey());
    }

    /**
     * Reset space theme
     * <p>
     * Resets the space theme. This means that the space will inherit the global look and feel settings
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to reset the theme for.</li>
     * </ul>
     */
    public void resetSpaceTheme(Consumer<ResetSpaceThemeOperationSpec> spec) {
        ResetSpaceThemeOperationSpec r = new ResetSpaceThemeOperationSpec(spec);
        api.resetSpaceTheme(r.spaceKey());
    }

    /**
     * Restore content version
     * <p>
     * Restores a historical version to be the latest version. That is, a new version is created with the content of the historical version.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content for which the history will be restored.</li>
     *   <li>body: The content version to be restored.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand. By default, the {@code content} object is expanded.  - {@code collaborators} returns the users that collaborated on the version. - {@code content} returns the content for the version.</li>
     * </ul>
     */
    public Version restoreContentVersion(Consumer<RestoreContentVersionOperationSpec> spec) {
        RestoreContentVersionOperationSpec r = new RestoreContentVersionOperationSpec(spec);
        return api.restoreContentVersion(r.id(), r.body(), r.expand());
    }

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
     * Authentication - Required Scopes: [search:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>cql: The CQL query to be used for the search. See [Advanced Searching using CQL](https://developer.atlassian.com/cloud/confluence/advanced-searching-using-cql/) for instructions on how to build a CQL query.</li>
     *   <li>cqlcontext: The space, content, and content status to execute the search against.  - {@code spaceKey} Key of the space to search against. Optional. - {@code contentId} ID of the content to search against. Optional. Must be in the space specified by {@code spaceKey}. - {@code contentStatuses} Content statuses to search against. Optional.  Specify these values in an object. For example, {@code cqlcontext={%22spaceKey%22:%22TEST%22, %22contentId%22:%22123%22}}</li>
     *   <li>cursor: Pointer to a set of search results, returned as part of the {@code next} or {@code prev} URL from the previous search call.</li>
     *   <li>next: </li>
     *   <li>prev: </li>
     *   <li>limit: The maximum number of content objects to return per page. Note, this may be restricted by fixed system limits.</li>
     *   <li>start: The start point of the collection to return</li>
     *   <li>includeArchivedSpaces: Whether to include content from archived spaces in the results.</li>
     *   <li>excludeCurrentSpaces: Whether to exclude current spaces and only show archived spaces.</li>
     *   <li>excerpt: The excerpt strategy to apply to the result</li>
     *   <li>sitePermissionTypeFilter: Filters users by permission type. Use {@code none} to default to licensed users, {@code externalCollaborator} for external/guest users, and {@code all} to include all permission types.</li>
     *   <li>_u: </li>
     *   <li>expand: </li>
     * </ul>
     */
    public SearchPageResponseSearchResult searchByCQL(Consumer<SearchByCQLOperationSpec> spec) {
        SearchByCQLOperationSpec r = new SearchByCQLOperationSpec(spec);
        return api.searchByCQL(r.cql(), r.cqlcontext(), r.cursor(), r.next(), r.prev(), r.limit(), r.start(), r.includeArchivedSpaces(), r.excludeCurrentSpaces(), r.excerpt(), r.sitePermissionTypeFilter(), r._u(), r.expand());
    }

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
     * Authentication - Required Scopes: [search:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>cql: The CQL string that is used to find the requested content.</li>
     *   <li>cqlcontext: The space, content, and content status to execute the search against. Specify this as an object with the following properties:  - {@code spaceKey} Key of the space to search against. Optional. - {@code contentId} ID of the content to search against. Optional. Must be in the space spacified by {@code spaceKey}. - {@code contentStatuses} Content statuses to search against. Optional.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.</li>
     *   <li>cursor: Pointer to a set of search results, returned as part of the {@code next} or {@code prev} URL from the previous search call.</li>
     *   <li>limit: The maximum number of content objects to return per page. Note, this may be restricted by fixed system limits.</li>
     * </ul>
     */
    public ContentArray searchContentByCQL(Consumer<SearchContentByCQLOperationSpec> spec) {
        SearchContentByCQLOperationSpec r = new SearchContentByCQLOperationSpec(spec);
        return api.searchContentByCQL(r.cql(), r.cqlcontext(), r.expand(), r.cursor(), r.limit());
    }

    /**
     * Search groups by partial query
     * <p>
     * Get search results of groups by partial query provided.
     * Authentication - Required Scopes: [read:confluence-groups]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>query: the search term used to query results.</li>
     *   <li>start: The starting index of the returned groups.</li>
     *   <li>limit: The maximum number of groups to return per page. Note, this is restricted to a maximum limit of 200 groups.</li>
     *   <li>shouldReturnTotalSize: Whether to include total size parameter in the results. Note, fetching total size property is an expensive operation; use it if your use case needs this value.</li>
     * </ul>
     */
    public GroupArrayWithLinks searchGroups(Consumer<SearchGroupsOperationSpec> spec) {
        SearchGroupsOperationSpec r = new SearchGroupsOperationSpec(spec);
        return api.searchGroups(r.query(), r.start(), r.limit(), r.shouldReturnTotalSize());
    }

    /**
     * Get inline tasks based on search parameters
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Returns inline tasks based on the search query.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only tasks in contents that the user has permission to view are returned.
     * Authentication - Required Scopes: [read:confluence-content.all]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>start: The starting offset for the results.</li>
     *   <li>limit: The number of results to be returned.</li>
     *   <li>spaceKey: The space key of a space. Multiple space keys can be specified.</li>
     *   <li>pageId: The page id of a page. Multiple page ids can be specified.</li>
     *   <li>assignee: Account ID of a user to whom a task is assigned. Multiple users can be specified.</li>
     *   <li>creator: Account ID of a user to who created a task. Multiple users can be specified.</li>
     *   <li>completedUser: Account ID of a user who completed a task. Multiple users can be specified.</li>
     *   <li>duedateFrom: Start of date range based on due dates (inclusive).</li>
     *   <li>duedateTo: End of date range based on due dates (inclusive).</li>
     *   <li>createdateFrom: Start of date range based on create dates (inclusive).</li>
     *   <li>createdateTo: End of date range based on create dates (inclusive).</li>
     *   <li>completedateFrom: Start of date range based on complete dates (inclusive).</li>
     *   <li>completedateTo: End of date range based on complete dates (inclusive).</li>
     *   <li>status: The status of the task. (checked/unchecked)</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public TaskPageResponse searchTasks(Consumer<SearchTasksOperationSpec> spec) {
        SearchTasksOperationSpec r = new SearchTasksOperationSpec(spec);
        return api.searchTasks(r.start(), r.limit(), r.spaceKey(), r.pageId(), r.assignee(), r.creator(), r.completedUser(), r.duedateFrom(), r.duedateTo(), r.createdateFrom(), r.createdateTo(), r.completedateFrom(), r.completedateTo(), r.status());
    }

    /**
     * Search users
     * <p>
     * Searches for users using user-specific queries from the [Confluence Query Language (CQL)](https://developer.atlassian.com/cloud/confluence/advanced-searching-using-cql/).
     * Note that CQL input queries submitted through the {@code /wiki/rest/api/search/user} endpoint only support user-specific fields like {@code user}, {@code user.fullname}, {@code user.accountid}, and {@code user.userkey}.
     * Note that some user fields may be set to null depending on the user's privacy settings. These are: email, profilePicture, displayName, and timeZone.
     * Authentication - Required Scopes: [read:content-details:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>cql: The CQL query to be used for the search. See [Advanced Searching using CQL](https://developer.atlassian.com/cloud/confluence/advanced-searching-using-cql/) for instructions on how to build a CQL query.  Example queries:           cql=type=user will return all users           cql=user="1234" will return user with accountId "1234"           You can also use IN, NOT IN, != operators           cql=user IN ("12", "34") will return users with accountids "12" and "34"           cql=user.fullname~jo will return users with nickname/full name starting with "jo"           cql=user.accountid="123" will return user with accountId "123"</li>
     *   <li>start: The starting index of the returned users.</li>
     *   <li>limit: The maximum number of user objects to return per page. Note, this may be restricted by fixed system limits.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the user to expand.  - {@code operations} returns the operations for the user, which are used when setting permissions. - {@code personalSpace} returns the personal space of the user.</li>
     *   <li>sitePermissionTypeFilter: Filters users by permission type. Use {@code none} to default to licensed users, {@code externalCollaborator} for external/guest users, and {@code all} to include all permission types.</li>
     * </ul>
     */
    public SearchPageResponseSearchResult searchUser(Consumer<SearchUserOperationSpec> spec) {
        SearchUserOperationSpec r = new SearchUserOperationSpec(spec);
        return api.searchUser(r.cql(), r.start(), r.limit(), r.expand(), r.sitePermissionTypeFilter());
    }

    /**
     * Set the content state of a content and publishes a new version of the content.
     * <p>
     * Sets the content state of the content specified and creates a new version (publishes the content without changing the body) of the content with the new state.
     * You may pass in either an id of a state, or the name and color of a desired new state. If all 3 are passed in, id will be used. If the name and color passed in already exist under the current user's existing custom states, the existing state will be reused. If custom states are disabled in the space of the content (which can be determined by getting the content state space settings of the content's space) then this set will fail.
     * You may not remove a content state via this PUT request. You must use the DELETE method. A specified state is required in the body of this request.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The Id of the content whose content state is to be set.</li>
     *   <li>contentStateRestInput: Content state fields for state. Pass in id for an existing state, or new name and color for best matching existing state, or new state if allowed in space.</li>
     *   <li>status: Status of content onto which state will be placed. If draft, then draft state will change. If current, state will be placed onto a new version of the content with same body as previous version.</li>
     * </ul>
     */
    public ContentStateResponse setContentState(Consumer<SetContentStateOperationSpec> spec) {
        SetContentStateOperationSpec r = new SetContentStateOperationSpec(spec);
        return api.setContentState(r.id(), r.contentStateRestInput(), r.status());
    }

    /**
     * Set look and feel settings
     * <p>
     * Sets the look and feel settings to either the default settings or the custom settings, for the site or a single space. Note, the default space settings are inherited from the current global settings.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     * Authentication - Required Scopes: [manage:confluence-configuration]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The look and feel type to be set.</li>
     *   <li>spaceKey: The key of the space for which the look and feel settings will be set. If this is not set, the global look and feel settings will be set.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public String setLookAndFeelSettings(Consumer<SetLookAndFeelSettingsOperationSpec> spec) {
        SetLookAndFeelSettingsOperationSpec r = new SetLookAndFeelSettingsOperationSpec(spec);
        return api.setLookAndFeelSettings(r.body(), r.spaceKey());
    }

    /**
     * Set retention period
     * <p>
     * Sets the retention period for records in the audit log. The retention period can be set to a maximum of 1 year.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Confluence Administrator' global permission.
     * Authentication - Required Scopes: [write:audit-log:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The updated retention period.</li>
     * </ul>
     */
    public RetentionPeriod setRetentionPeriod(Consumer<SetRetentionPeriodOperationSpec> spec) {
        SetRetentionPeriodOperationSpec r = new SetRetentionPeriodOperationSpec(spec);
        return api.setRetentionPeriod(r.body());
    }

    /**
     * Set space theme
     * <p>
     * Sets the theme for a space. Note, if you want to reset the space theme to the default Confluence theme, use the 'Reset space theme' method instead of this method.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to set the theme for.</li>
     *   <li>body: </li>
     * </ul>
     */
    public Theme setSpaceTheme(Consumer<SetSpaceThemeOperationSpec> spec) {
        SetSpaceThemeOperationSpec r = new SetSpaceThemeOperationSpec(spec);
        return api.setSpaceTheme(r.spaceKey(), r.body());
    }

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
     * Authentication - Required Scopes: [write:confluence-file]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the attachment is attached to.</li>
     *   <li>attachmentId: The ID of the attachment to update.</li>
     *   <li>_file: The relative location and name of the attachment to be added to the content.</li>
     *   <li>minorEdit: If {@code minorEdits} is set to 'true', no notification email or activity stream will be generated when the attachment is added to the content.</li>
     *   <li>comment: The comment for the attachment that is being added. If you specify a comment, then every file must have a comment and the comments must be in the same order as the files. Alternatively, don't specify any comments.</li>
     * </ul>
     */
    public Content updateAttachmentData(Consumer<UpdateAttachmentDataOperationSpec> spec) {
        UpdateAttachmentDataOperationSpec r = new UpdateAttachmentDataOperationSpec(spec);
        return api.updateAttachmentData(r.id(), r.attachmentId(), r._file(), r.minorEdit(), r.comment());
    }

    /**
     * Update attachment properties
     * <p>
     * Updates the attachment properties, i.e. the non-binary data of an attachment like the filename, media-type, comment, and parent container.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     * Authentication - Required Scopes: [write:confluence-file, write:confluence-props]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the attachment is attached to.</li>
     *   <li>attachmentId: The ID of the attachment to update.</li>
     *   <li>body: The details of the attachment to be updated.</li>
     * </ul>
     */
    public Content updateAttachmentProperties(Consumer<UpdateAttachmentPropertiesOperationSpec> spec) {
        UpdateAttachmentPropertiesOperationSpec r = new UpdateAttachmentPropertiesOperationSpec(spec);
        return api.updateAttachmentProperties(r.id(), r.attachmentId(), r.body());
    }

    /**
     * Update content
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Updates a piece of content. Use this method to update the title or body of a piece of content, change the status, change the parent page, and more.
     * Note, updating draft content is currently not supported.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to be updated.</li>
     *   <li>content: The updated content.</li>
     *   <li>status: The updated status of the content. Use this parameter to change the status of a piece of content without passing the entire request body.</li>
     *   <li>conflictPolicy: The action that should be taken when conflicts are discovered. Only used when publishing a draft page.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public Content updateContent(Consumer<UpdateContentOperationSpec> spec) {
        UpdateContentOperationSpec r = new UpdateContentOperationSpec(spec);
        return api.updateContent(r.id(), r.content(), r.status(), r.conflictPolicy());
    }

    /**
     * Update content property
     * <p>
     * Updates an existing content property. This method will also create a new property for a piece of content, if the property key does not exist and the property version is 1. For more information about content properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content.
     * Authentication - Required Scopes: [write:confluence-props]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content that the property belongs to.</li>
     *   <li>key: The key of the property.</li>
     *   <li>body: The content property being updated.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public ContentProperty updateContentProperty(Consumer<UpdateContentPropertyOperationSpec> spec) {
        UpdateContentPropertyOperationSpec r = new UpdateContentPropertyOperationSpec(spec);
        return api.updateContentProperty(r.id(), r.key(), r.body());
    }

    /**
     * Update content template
     * <p>
     * Updates a content template. Note, blueprint templates cannot be updated via the REST API.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space to update a space template or 'Confluence Administrator' global permission to update a global template.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The updated content template.</li>
     * </ul>
     */
    public ContentTemplate updateContentTemplate(Consumer<UpdateContentTemplateOperationSpec> spec) {
        UpdateContentTemplateOperationSpec r = new UpdateContentTemplateOperationSpec(spec);
        return api.updateContentTemplate(r.body());
    }

    /**
     * Select look and feel settings
     * <p>
     * Sets the look and feel settings to the default (global) settings, the custom settings, or the current theme's settings for a space. The custom and theme settings can only be selected if there is already a theme set for a space. Note, the default space settings are inherited from the current global settings.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     * Authentication - Required Scopes: [manage:confluence-configuration]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The look and feel type to be set.</li>
     * </ul>
     */
    public LookAndFeelSelection updateLookAndFeel(Consumer<UpdateLookAndFeelOperationSpec> spec) {
        UpdateLookAndFeelOperationSpec r = new UpdateLookAndFeelOperationSpec(spec);
        return api.updateLookAndFeel(r.body());
    }

    /**
     * Update look and feel settings
     * <p>
     * Updates the look and feel settings for the site or for a single space. If custom settings exist, they are updated. If no custom settings exist, then a set of custom settings is created.
     * Note, if a theme is selected for a space, the space look and feel settings are provided by the theme and cannot be overridden.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     * Authentication - Required Scopes: [manage:confluence-configuration]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>body: The updated settings. All values for the settings must be included, regardless of whether they are being changed.  One way to create the request body is to copy the settings from the response body of [Get look and feel settings](#api-settings-lookandfeel-get) and modify it as needed.</li>
     *   <li>spaceKey: The key of the space for which the look and feel settings will be updated. If this is not set, the global look and feel settings will be updated.</li>
     * </ul>
     */
    public LookAndFeelWithLinks updateLookAndFeelSettings(Consumer<UpdateLookAndFeelSettingsOperationSpec> spec) {
        UpdateLookAndFeelSettingsOperationSpec r = new UpdateLookAndFeelSettingsOperationSpec(spec);
        return api.updateLookAndFeelSettings(r.body(), r.spaceKey());
    }

    /**
     * Update restrictions
     * <p>
     * Updates restrictions for a piece of content. This removes the existing restrictions and replaces them with the restrictions in the request.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the content.
     * Authentication - Required Scopes: [write:confluence-content]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the content to update restrictions for.</li>
     *   <li>body: The updated restrictions for the content.</li>
     *   <li>expand: A multi-value parameter indicating which properties of the content restrictions (returned in response) to expand.  - {@code restrictions.user} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code restrictions.group} returns the piece of content that the restrictions are applied to. Expanded by default. - {@code content} returns the piece of content that the restrictions are applied to.</li>
     * </ul>
     */
    public ContentRestrictionArray updateRestrictions(Consumer<UpdateRestrictionsOperationSpec> spec) {
        UpdateRestrictionsOperationSpec r = new UpdateRestrictionsOperationSpec(spec);
        return api.updateRestrictions(r.id(), r.body(), r.expand());
    }

    /**
     * Update space
     * <p>
     * Updates the name, description, or homepage of a space.
     * -
     *  For security reasons, permissions cannot be updated via the API and must be changed via the user interface instead. -
     *  Currently you cannot set space labels when updating a space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space to update.</li>
     *   <li>body: The updated space.</li>
     * </ul>
     */
    public Space updateSpace(Consumer<UpdateSpaceOperationSpec> spec) {
        UpdateSpaceOperationSpec r = new UpdateSpaceOperationSpec(spec);
        return api.updateSpace(r.spaceKey(), r.body());
    }

    /**
     * Update space property
     * <p>
     * Deprecated, use [Confluence's v2 API](https://developer.atlassian.com/cloud/confluence/rest/v2/intro/).
     * Updates a space property. Note, you cannot update the key of a space property, only the value.
     * **[Permissions required](https://confluence.atlassian.com/x/_AozKw)**: ‘Admin’ permission for the space.
     * Authentication - Required Scopes: [write:confluence-props]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space that the property is in.</li>
     *   <li>key: The key of the property to be updated.</li>
     *   <li>body: The space property being updated.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public SpaceProperty updateSpaceProperty(Consumer<UpdateSpacePropertyOperationSpec> spec) {
        UpdateSpacePropertyOperationSpec r = new UpdateSpacePropertyOperationSpec(spec);
        return api.updateSpaceProperty(r.spaceKey(), r.key(), r.body());
    }

    /**
     * Update space settings
     * <p>
     * Updates the settings for a space. Currently only the {@code routeOverrideEnabled} setting can be updated.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: 'Admin' permission for the space.
     * Authentication - Required Scopes: [write:confluence-space]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceKey: The key of the space whose settings will be updated.</li>
     *   <li>spaceSettingsUpdate: The space settings to update.</li>
     * </ul>
     */
    public SpaceSettings updateSpaceSettings(Consumer<UpdateSpaceSettingsOperationSpec> spec) {
        UpdateSpaceSettingsOperationSpec r = new UpdateSpaceSettingsOperationSpec(spec);
        return api.updateSpaceSettings(r.spaceKey(), r.spaceSettingsUpdate());
    }

    /**
     * Update inline task given global ID
     * <p>
     * Updates an inline tasks status given its global ID
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the content associated with the task.
     * Authentication - Required Scopes: [read:inlinetask:confluence, write:inlinetask:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>inlineTaskId: Global ID of the inline task to update</li>
     *   <li>taskStatusUpdate: The updated task status.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public Task updateTaskById(Consumer<UpdateTaskByIdOperationSpec> spec) {
        UpdateTaskByIdOperationSpec r = new UpdateTaskByIdOperationSpec(spec);
        return api.updateTaskById(r.inlineTaskId(), r.taskStatusUpdate());
    }

    /**
     * Update user property
     * <p>
     * Updates a property for the given user. Note, you cannot update the key of a user property, only the value. For more information about user properties, see [Confluence entity properties](https://developer.atlassian.com/cloud/confluence/confluence-entity-properties/). {@code Note}, these properties stored against a user are on a Confluence site level and not space/content level.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * Authentication - Required Scopes: [write:user.property:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>userId: The account ID of the user. The accountId uniquely identifies the user across all Atlassian products. For example, 384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192</li>
     *   <li>key: The key of the user property.</li>
     *   <li>body: The user property to be updated.</li>
     * </ul>
     */
    public void updateUserProperty(Consumer<UpdateUserPropertyOperationSpec> spec) {
        UpdateUserPropertyOperationSpec r = new UpdateUserPropertyOperationSpec(spec);
        api.updateUserProperty(r.userId(), r.key(), r.body());
    }

}
