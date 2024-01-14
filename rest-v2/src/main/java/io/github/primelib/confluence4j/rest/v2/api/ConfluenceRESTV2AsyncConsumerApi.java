package io.github.primelib.confluence4j.rest.v2.api;

import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.Attachment;
import io.github.primelib.confluence4j.rest.v2.model.BlogPostSingle;
import io.github.primelib.confluence4j.rest.v2.model.CheckAccessByEmail200Response;
import io.github.primelib.confluence4j.rest.v2.model.ContentIdToContentTypeResponse;
import io.github.primelib.confluence4j.rest.v2.model.ContentProperty;
import io.github.primelib.confluence4j.rest.v2.model.CustomContentSingle;
import io.github.primelib.confluence4j.rest.v2.model.DataPolicyMetadata;
import io.github.primelib.confluence4j.rest.v2.model.DetailedVersion;
import io.github.primelib.confluence4j.rest.v2.model.FooterCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.InlineCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultAncestor;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultAttachment;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultAttachment1;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultAttachmentCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultBlogPost;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultBlogPostCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultBlogPostInlineCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultChildCustomContent;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultChildPage;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultChildrenCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultContentProperty;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultCustomContent;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultCustomContentCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultDataPolicySpace;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultFooterCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultInlineCommentChildrenModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultInlineCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultLabel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultLabel1;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultPage;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultPageCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultPageInlineCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultSpace;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultSpacePermission;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultSpaceProperty;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultString;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultTask;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultVersion;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultVersion1;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultVersion2;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultVersion3;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultVersion4;
import io.github.primelib.confluence4j.rest.v2.model.PageSingle;
import io.github.primelib.confluence4j.rest.v2.model.PermittedOperationsResponse;
import io.github.primelib.confluence4j.rest.v2.model.Space;
import io.github.primelib.confluence4j.rest.v2.model.SpaceProperty;
import io.github.primelib.confluence4j.rest.v2.model.Task;
import io.github.primelib.confluence4j.rest.v2.model.WhiteboardSingle;
import java.util.concurrent.CompletableFuture;

import java.util.function.Consumer;

import io.github.primelib.confluence4j.rest.v2.spec.CheckAccessByEmailOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.ConvertContentIdsToContentTypesOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.CreateAttachmentPropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.CreateBlogPostOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.CreateBlogpostPropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.CreateCommentPropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.CreateCustomContentOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.CreateCustomContentPropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.CreateFooterCommentOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.CreateInlineCommentOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.CreatePageOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.CreatePagePropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.CreateSpacePropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.CreateWhiteboardOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.CreateWhiteboardPropertyOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.DeleteAttachmentOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.DeleteAttachmentPropertyByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.DeleteBlogPostOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.DeleteBlogpostPropertyByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.DeleteCommentPropertyByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.DeleteCustomContentOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.DeleteCustomContentPropertyByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.DeleteFooterCommentOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.DeleteInlineCommentOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.DeletePageOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.DeletePagePropertyByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.DeleteSpacePropertyByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.DeleteWhiteboardOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.DeleteWhiteboardPropertyByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetAttachmentByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetAttachmentCommentsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetAttachmentContentPropertiesOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetAttachmentContentPropertiesByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetAttachmentLabelsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetAttachmentOperationsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetAttachmentVersionDetailsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetAttachmentVersionsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetAttachmentsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetBlogPostByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetBlogPostFooterCommentsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetBlogPostInlineCommentsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetBlogPostLabelsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetBlogPostLikeCountOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetBlogPostLikeUsersOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetBlogPostOperationsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetBlogPostVersionDetailsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetBlogPostVersionsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetBlogPostsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetBlogPostsInSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetBlogpostAttachmentsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetBlogpostContentPropertiesOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetBlogpostContentPropertiesByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetChildCustomContentOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetChildPagesOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCommentContentPropertiesOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCommentContentPropertiesByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCustomContentAttachmentsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCustomContentByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCustomContentByTypeOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCustomContentByTypeInBlogPostOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCustomContentByTypeInPageOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCustomContentByTypeInSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCustomContentCommentsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCustomContentContentPropertiesOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCustomContentContentPropertiesByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCustomContentLabelsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCustomContentOperationsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCustomContentVersionDetailsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetCustomContentVersionsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetDataPolicySpacesOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetFooterCommentByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetFooterCommentChildrenOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetFooterCommentOperationsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetFooterCommentVersionDetailsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetFooterCommentVersionsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetFooterCommentsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetFooterLikeCountOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetFooterLikeUsersOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetInlineCommentByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetInlineCommentChildrenOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetInlineCommentOperationsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetInlineCommentVersionDetailsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetInlineCommentVersionsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetInlineCommentsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetInlineLikeCountOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetInlineLikeUsersOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetLabelAttachmentsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetLabelBlogPostsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetLabelPagesOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetLabelsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPageAncestorsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPageAttachmentsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPageByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPageContentPropertiesOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPageContentPropertiesByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPageFooterCommentsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPageInlineCommentsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPageLabelsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPageLikeCountOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPageLikeUsersOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPageOperationsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPageVersionDetailsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPageVersionsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPagesOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetPagesInSpaceOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetSpaceByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetSpaceContentLabelsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetSpaceLabelsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetSpaceOperationsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetSpacePermissionsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetSpacePropertiesOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetSpacePropertyByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetSpacesOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetTaskByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetTasksOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetWhiteboardAncestorsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetWhiteboardByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetWhiteboardContentPropertiesOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetWhiteboardContentPropertiesByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.GetWhiteboardOperationsOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.InviteByEmailOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.UpdateAttachmentPropertyByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.UpdateBlogPostOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.UpdateBlogpostPropertyByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.UpdateCommentPropertyByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.UpdateCustomContentOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.UpdateCustomContentPropertyByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.UpdateFooterCommentOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.UpdateInlineCommentOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.UpdatePageOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.UpdatePagePropertyByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.UpdateSpacePropertyByIdOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.UpdateTaskOperationSpec;
import io.github.primelib.confluence4j.rest.v2.spec.UpdateWhiteboardPropertyByIdOperationSpec;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConfluenceRESTV2AsyncConsumerApi {
    private final ConfluenceRESTV2AsyncApi api;

    public ConfluenceRESTV2AsyncConsumerApi(ConfluenceRESTV2AsyncApi api) {
        this.api = api;
    }

    /**
     * Check site access for a list of emails
     * <p>
     * Returns the list of emails from the input list that do not have access to site.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>checkAccessByEmailRequest: </li>
     * </ul>
     */
    public CompletableFuture<CheckAccessByEmail200Response> checkAccessByEmail(Consumer<CheckAccessByEmailOperationSpec> spec) {
        CheckAccessByEmailOperationSpec r = new CheckAccessByEmailOperationSpec(spec);
        return api.checkAccessByEmail(r.checkAccessByEmailRequest());
    }

    /**
     * Convert content ids to content types
     * <p>
     * Converts a list of content ids into their associated content types. This is useful for users migrating from v1 to v2 who may have stored just content ids without their associated type. This will return types as they should be used in v2. Notably, this will return {@code inline-comment} for inline comments and {@code footer-comment} for footer comments, which is distinct from them both being represented by {@code comment} in v1.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the requested content. Any content that the user does not have permission to view or does not exist will map to {@code null} in the response.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>convertContentIdsToContentTypesRequest: </li>
     * </ul>
     */
    public CompletableFuture<ContentIdToContentTypeResponse> convertContentIdsToContentTypes(Consumer<ConvertContentIdsToContentTypesOperationSpec> spec) {
        ConvertContentIdsToContentTypesOperationSpec r = new ConvertContentIdsToContentTypesOperationSpec(spec);
        return api.convertContentIdsToContentTypes(r.convertContentIdsToContentTypesRequest());
    }

    /**
     * Create content property for attachment
     * <p>
     * Creates a new content property for an attachment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the attachment.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>attachmentId: The ID of the attachment to create a property for.</li>
     *   <li>contentPropertyCreateRequest: The content property to be created</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> createAttachmentProperty(Consumer<CreateAttachmentPropertyOperationSpec> spec) {
        CreateAttachmentPropertyOperationSpec r = new CreateAttachmentPropertyOperationSpec(spec);
        return api.createAttachmentProperty(r.attachmentId(), r.contentPropertyCreateRequest());
    }

    /**
     * Create blog post
     * <p>
     * Creates a new blog post in the space specified by the spaceId.
     * By default this will create the blog post as a non-draft, unless the status is specified as draft. If creating a non-draft, the title must not be empty.
     * Currently only supports the storage representation specified in the body.representation enums below
     * Authentication - Required Scopes: [write:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createBlogPostRequest: </li>
     *   <li>_private: The blog post will be private. Only the user who creates this blog post will have permission to view and edit one.</li>
     * </ul>
     */
    public CompletableFuture<BlogPostSingle> createBlogPost(Consumer<CreateBlogPostOperationSpec> spec) {
        CreateBlogPostOperationSpec r = new CreateBlogPostOperationSpec(spec);
        return api.createBlogPost(r.createBlogPostRequest(), r._private());
    }

    /**
     * Create content property for blog post
     * <p>
     * Creates a new property for a blogpost.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the blog post.
     * Authentication - Required Scopes: [read:page:confluence, write:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>blogpostId: The ID of the blog post to create a property for.</li>
     *   <li>contentPropertyCreateRequest: The content property to be created</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> createBlogpostProperty(Consumer<CreateBlogpostPropertyOperationSpec> spec) {
        CreateBlogpostPropertyOperationSpec r = new CreateBlogpostPropertyOperationSpec(spec);
        return api.createBlogpostProperty(r.blogpostId(), r.contentPropertyCreateRequest());
    }

    /**
     * Create content property for comment
     * <p>
     * Creates a new content property for a comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the comment.
     * Authentication - Required Scopes: [read:comment:confluence, write:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>commentId: The ID of the comment to create a property for.</li>
     *   <li>contentPropertyCreateRequest: The content property to be created</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> createCommentProperty(Consumer<CreateCommentPropertyOperationSpec> spec) {
        CreateCommentPropertyOperationSpec r = new CreateCommentPropertyOperationSpec(spec);
        return api.createCommentProperty(r.commentId(), r.contentPropertyCreateRequest());
    }

    /**
     * Create custom content
     * <p>
     * Creates a new custom content in the given space, page, blogpost or other custom content.
     * Only one of {@code spaceId}, {@code pageId}, {@code blogPostId}, or {@code customContentId} is required in the request body. **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to create custom content in the space.
     * Authentication - Required Scopes: [write:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createCustomContentRequest: </li>
     * </ul>
     */
    public CompletableFuture<CustomContentSingle> createCustomContent(Consumer<CreateCustomContentOperationSpec> spec) {
        CreateCustomContentOperationSpec r = new CreateCustomContentOperationSpec(spec);
        return api.createCustomContent(r.createCustomContentRequest());
    }

    /**
     * Create content property for custom content
     * <p>
     * Creates a new content property for a piece of custom content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the custom content.
     * Authentication - Required Scopes: [read:custom-content:confluence, write:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>customContentId: The ID of the custom content to create a property for.</li>
     *   <li>contentPropertyCreateRequest: The content property to be created</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> createCustomContentProperty(Consumer<CreateCustomContentPropertyOperationSpec> spec) {
        CreateCustomContentPropertyOperationSpec r = new CreateCustomContentPropertyOperationSpec(spec);
        return api.createCustomContentProperty(r.customContentId(), r.contentPropertyCreateRequest());
    }

    /**
     * Create footer comment
     * <p>
     * Create a footer comment.
     * The footer comment can be made against several locations:
     * - at the top level (specifying pageId or blogPostId in the request body) - as a reply (specifying parentCommentId in the request body) - against an attachment (note: this is different than the comments added via the attachment properties page on the UI, which are referred to as version comments) - against a custom content
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to create comments in the space.
     * Authentication - Required Scopes: [write:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createFooterCommentModel: The footer comment to be created</li>
     * </ul>
     */
    public CompletableFuture<FooterCommentModel> createFooterComment(Consumer<CreateFooterCommentOperationSpec> spec) {
        CreateFooterCommentOperationSpec r = new CreateFooterCommentOperationSpec(spec);
        return api.createFooterComment(r.createFooterCommentModel());
    }

    /**
     * Create inline comment
     * <p>
     * Create an inline comment. This can be at the top level (specifying pageId or blogPostId in the request body) or as a reply (specifying parentCommentId in the request body). Note the inlineCommentProperties object in the request body is used to select the text the inline comment should be tied to. This is what determines the text
     * highlighting when viewing a page in Confluence.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to create comments in the space.
     * Authentication - Required Scopes: [write:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createInlineCommentModel: The inline comment to be created</li>
     * </ul>
     */
    public CompletableFuture<InlineCommentModel> createInlineComment(Consumer<CreateInlineCommentOperationSpec> spec) {
        CreateInlineCommentOperationSpec r = new CreateInlineCommentOperationSpec(spec);
        return api.createInlineComment(r.createInlineCommentModel());
    }

    /**
     * Create page
     * <p>
     * Creates a page in the space.
     * Pages are created as published by default unless specified as a draft in the status field. If creating a published page, the title must be specified.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the corresponding space. Permission to create a page in the space.
     * Authentication - Required Scopes: [write:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createPageRequest: </li>
     *   <li>embedded: Tag the content as embedded and content will be created in NCS.</li>
     *   <li>_private: The page will be private. Only the user who creates this page will have permission to view and edit one.</li>
     *   <li>rootLevel: The page will be created at the root level of the space (outside the space homepage tree).</li>
     * </ul>
     */
    public CompletableFuture<PageSingle> createPage(Consumer<CreatePageOperationSpec> spec) {
        CreatePageOperationSpec r = new CreatePageOperationSpec(spec);
        return api.createPage(r.createPageRequest(), r.embedded(), r._private(), r.rootLevel());
    }

    /**
     * Create content property for page
     * <p>
     * Creates a new content property for a page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the page.
     * Authentication - Required Scopes: [read:page:confluence, write:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>pageId: The ID of the page to create a property for.</li>
     *   <li>contentPropertyCreateRequest: The content property to be created</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> createPageProperty(Consumer<CreatePagePropertyOperationSpec> spec) {
        CreatePagePropertyOperationSpec r = new CreatePagePropertyOperationSpec(spec);
        return api.createPageProperty(r.pageId(), r.contentPropertyCreateRequest());
    }

    /**
     * Create space property in space
     * <p>
     * Creates a new space property.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) and 'Admin' permission for the space.
     * Authentication - Required Scopes: [read:space:confluence, write:space:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceId: The ID of the space for which space properties should be returned.</li>
     *   <li>spacePropertyCreateRequest: The space property to be created</li>
     * </ul>
     */
    public CompletableFuture<SpaceProperty> createSpaceProperty(Consumer<CreateSpacePropertyOperationSpec> spec) {
        CreateSpacePropertyOperationSpec r = new CreateSpacePropertyOperationSpec(spec);
        return api.createSpaceProperty(r.spaceId(), r.spacePropertyCreateRequest());
    }

    /**
     * Create whiteboard
     * <p>
     * Creates a whiteboard in the space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the corresponding space. Permission to create a whiteboard in the space.
     * Authentication - Required Scopes: [write:whiteboard:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createWhiteboardRequest: </li>
     *   <li>_private: The whiteboard will be private. Only the user who creates this whiteboard will have permission to view and edit one.</li>
     * </ul>
     */
    public CompletableFuture<WhiteboardSingle> createWhiteboard(Consumer<CreateWhiteboardOperationSpec> spec) {
        CreateWhiteboardOperationSpec r = new CreateWhiteboardOperationSpec(spec);
        return api.createWhiteboard(r.createWhiteboardRequest(), r._private());
    }

    /**
     * Create content property for whiteboard
     * <p>
     * Creates a new content property for a whiteboard.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the whiteboard.
     * Authentication - Required Scopes: [read:whiteboard:confluence, write:whiteboard:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the whiteboard to create a property for.</li>
     *   <li>contentPropertyCreateRequest: The content property to be created</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> createWhiteboardProperty(Consumer<CreateWhiteboardPropertyOperationSpec> spec) {
        CreateWhiteboardPropertyOperationSpec r = new CreateWhiteboardPropertyOperationSpec(spec);
        return api.createWhiteboardProperty(r.id(), r.contentPropertyCreateRequest());
    }

    /**
     * Delete attachment
     * <p>
     * Delete an attachment by id.
     * Deleting an attachment moves the attachment to the trash, where it can be restored later. To permanently delete an attachment (or "purge" it), the endpoint must be called on a **trashed** attachment with the following param {@code purge=true}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the container of the attachment. Permission to delete attachments in the space. Permission to administer the space (if attempting to purge).
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the attachment to be deleted.</li>
     *   <li>purge: If attempting to purge the attachment.</li>
     * </ul>
     */
    public CompletableFuture<Void> deleteAttachment(Consumer<DeleteAttachmentOperationSpec> spec) {
        DeleteAttachmentOperationSpec r = new DeleteAttachmentOperationSpec(spec);
        return api.deleteAttachment(r.id(), r.purge());
    }

    /**
     * Delete content property for attachment by id
     * <p>
     * Deletes a content property for an attachment by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to attachment the page.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>attachmentId: The ID of the attachment the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be deleted.</li>
     * </ul>
     */
    public CompletableFuture<Void> deleteAttachmentPropertyById(Consumer<DeleteAttachmentPropertyByIdOperationSpec> spec) {
        DeleteAttachmentPropertyByIdOperationSpec r = new DeleteAttachmentPropertyByIdOperationSpec(spec);
        return api.deleteAttachmentPropertyById(r.attachmentId(), r.propertyId());
    }

    /**
     * Delete blog post
     * <p>
     * Delete a blog post by id.
     * By default this will delete blog posts that are non-drafts. To delete a blog post that is a draft, the endpoint must be called on a
     * draft with the following param {@code draft=true}. Discarded drafts are not sent to the trash and are permanently deleted.
     * Deleting a blog post that is not a draft moves the blog post to the trash, where it can be restored later.
     * To permanently delete a blog post (or "purge" it), the endpoint must be called on a **trashed** blog post with the following param {@code purge=true}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the blog post and its corresponding space. Permission to delete blog posts in the space. Permission to administer the space (if attempting to purge).
     * Authentication - Required Scopes: [delete:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the blog post to be deleted.</li>
     *   <li>purge: If attempting to purge the blog post.</li>
     *   <li>draft: If attempting to delete a blog post that is a draft.</li>
     * </ul>
     */
    public CompletableFuture<Void> deleteBlogPost(Consumer<DeleteBlogPostOperationSpec> spec) {
        DeleteBlogPostOperationSpec r = new DeleteBlogPostOperationSpec(spec);
        return api.deleteBlogPost(r.id(), r.purge(), r.draft());
    }

    /**
     * Delete content property for blogpost by id
     * <p>
     * Deletes a content property for a blogpost by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the blog post.
     * Authentication - Required Scopes: [read:page:confluence, write:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>blogpostId: The ID of the blog post the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be deleted.</li>
     * </ul>
     */
    public CompletableFuture<Void> deleteBlogpostPropertyById(Consumer<DeleteBlogpostPropertyByIdOperationSpec> spec) {
        DeleteBlogpostPropertyByIdOperationSpec r = new DeleteBlogpostPropertyByIdOperationSpec(spec);
        return api.deleteBlogpostPropertyById(r.blogpostId(), r.propertyId());
    }

    /**
     * Delete content property for comment by id
     * <p>
     * Deletes a content property for a comment by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the comment.
     * Authentication - Required Scopes: [read:comment:confluence, write:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>commentId: The ID of the comment the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be deleted.</li>
     * </ul>
     */
    public CompletableFuture<Void> deleteCommentPropertyById(Consumer<DeleteCommentPropertyByIdOperationSpec> spec) {
        DeleteCommentPropertyByIdOperationSpec r = new DeleteCommentPropertyByIdOperationSpec(spec);
        return api.deleteCommentPropertyById(r.commentId(), r.propertyId());
    }

    /**
     * Delete custom content
     * <p>
     * Delete a custom content by id.
     * Deleting a custom content will either move it to the trash or permanently delete it (purge it), depending on the apiSupport. To permanently delete a **trashed** custom content, the endpoint must be called with the following param {@code purge=true}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to delete custom content in the space. Permission to administer the space (if attempting to purge).
     * Authentication - Required Scopes: [delete:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the custom content to be deleted.</li>
     *   <li>purge: If attempting to purge the custom content.</li>
     * </ul>
     */
    public CompletableFuture<Void> deleteCustomContent(Consumer<DeleteCustomContentOperationSpec> spec) {
        DeleteCustomContentOperationSpec r = new DeleteCustomContentOperationSpec(spec);
        return api.deleteCustomContent(r.id(), r.purge());
    }

    /**
     * Delete content property for custom content by id
     * <p>
     * Deletes a content property for a piece of custom content by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the custom content.
     * Authentication - Required Scopes: [read:custom-content:confluence, write:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>customContentId: The ID of the custom content the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be deleted.</li>
     * </ul>
     */
    public CompletableFuture<Void> deleteCustomContentPropertyById(Consumer<DeleteCustomContentPropertyByIdOperationSpec> spec) {
        DeleteCustomContentPropertyByIdOperationSpec r = new DeleteCustomContentPropertyByIdOperationSpec(spec);
        return api.deleteCustomContentPropertyById(r.customContentId(), r.propertyId());
    }

    /**
     * Delete footer comment
     * <p>
     * Deletes a footer comment. This is a permanent deletion and cannot be reverted.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to delete comments in the space.
     * Authentication - Required Scopes: [delete:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>commentId: The ID of the comment to be retrieved.</li>
     * </ul>
     */
    public CompletableFuture<Void> deleteFooterComment(Consumer<DeleteFooterCommentOperationSpec> spec) {
        DeleteFooterCommentOperationSpec r = new DeleteFooterCommentOperationSpec(spec);
        return api.deleteFooterComment(r.commentId());
    }

    /**
     * Delete inline comment
     * <p>
     * Deletes an inline comment. This is a permanent deletion and cannot be reverted.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to delete comments in the space.
     * Authentication - Required Scopes: [delete:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>commentId: The ID of the comment to be deleted.</li>
     * </ul>
     */
    public CompletableFuture<Void> deleteInlineComment(Consumer<DeleteInlineCommentOperationSpec> spec) {
        DeleteInlineCommentOperationSpec r = new DeleteInlineCommentOperationSpec(spec);
        return api.deleteInlineComment(r.commentId());
    }

    /**
     * Delete page
     * <p>
     * Delete a page by id.
     * By default this will delete pages that are non-drafts. To delete a page that is a draft, the endpoint must be called on a
     * draft with the following param {@code draft=true}. Discarded drafts are not sent to the trash and are permanently deleted.
     * Deleting a page moves the page to the trash, where it can be restored later. To permanently delete a page (or "purge" it), the endpoint must be called on a **trashed** page with the following param {@code purge=true}.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page and its corresponding space. Permission to delete pages in the space. Permission to administer the space (if attempting to purge).
     * Authentication - Required Scopes: [delete:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the page to be deleted.</li>
     *   <li>purge: If attempting to purge the page.</li>
     *   <li>draft: If attempting to delete a page that is a draft.</li>
     * </ul>
     */
    public CompletableFuture<Void> deletePage(Consumer<DeletePageOperationSpec> spec) {
        DeletePageOperationSpec r = new DeletePageOperationSpec(spec);
        return api.deletePage(r.id(), r.purge(), r.draft());
    }

    /**
     * Delete content property for page by id
     * <p>
     * Deletes a content property for a page by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the page.
     * Authentication - Required Scopes: [read:page:confluence, write:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>pageId: The ID of the page the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be deleted.</li>
     * </ul>
     */
    public CompletableFuture<Void> deletePagePropertyById(Consumer<DeletePagePropertyByIdOperationSpec> spec) {
        DeletePagePropertyByIdOperationSpec r = new DeletePagePropertyByIdOperationSpec(spec);
        return api.deletePagePropertyById(r.pageId(), r.propertyId());
    }

    /**
     * Delete space property by id
     * <p>
     * Deletes a space property by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) and 'Admin' permission for the space.
     * Authentication - Required Scopes: [read:space:confluence, write:space:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceId: The ID of the space the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be deleted.</li>
     * </ul>
     */
    public CompletableFuture<Void> deleteSpacePropertyById(Consumer<DeleteSpacePropertyByIdOperationSpec> spec) {
        DeleteSpacePropertyByIdOperationSpec r = new DeleteSpacePropertyByIdOperationSpec(spec);
        return api.deleteSpacePropertyById(r.spaceId(), r.propertyId());
    }

    /**
     * Delete whiteboard
     * <p>
     * Delete a whiteboard by id.
     * Deleting a whiteboard moves the whiteboard to the trash, where it can be restored later
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the whiteboard and its corresponding space. Permission to delete whiteboards in the space.
     * Authentication - Required Scopes: [delete:whiteboard:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the whiteboard to be deleted.</li>
     * </ul>
     */
    public CompletableFuture<Void> deleteWhiteboard(Consumer<DeleteWhiteboardOperationSpec> spec) {
        DeleteWhiteboardOperationSpec r = new DeleteWhiteboardOperationSpec(spec);
        return api.deleteWhiteboard(r.id());
    }

    /**
     * Delete content property for whiteboard by id
     * <p>
     * Deletes a content property for a whiteboard by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the whiteboard.
     * Authentication - Required Scopes: [read:whiteboard:confluence, write:whiteboard:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>whiteboardId: The ID of the whiteboard the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be deleted.</li>
     * </ul>
     */
    public CompletableFuture<Void> deleteWhiteboardPropertyById(Consumer<DeleteWhiteboardPropertyByIdOperationSpec> spec) {
        DeleteWhiteboardPropertyByIdOperationSpec r = new DeleteWhiteboardPropertyByIdOperationSpec(spec);
        return api.deleteWhiteboardPropertyById(r.whiteboardId(), r.propertyId());
    }

    /**
     * Get attachment by id
     * <p>
     * Returns a specific attachment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the attachment's container.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the attachment to be returned. If you don't know the attachment's ID, use Get attachments for page/blogpost/custom content.</li>
     *   <li>version: Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details.</li>
     * </ul>
     */
    public CompletableFuture<Attachment> getAttachmentById(Consumer<GetAttachmentByIdOperationSpec> spec) {
        GetAttachmentByIdOperationSpec r = new GetAttachmentByIdOperationSpec(spec);
        return api.getAttachmentById(r.id(), r.version());
    }

    /**
     * Get attachment comments
     * <p>
     * Returns the comments of the specific attachment. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the attachment and its corresponding containers.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the attachment for which comments should be returned.</li>
     *   <li>bodyFormat: The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultAttachmentCommentModel> getAttachmentComments(Consumer<GetAttachmentCommentsOperationSpec> spec) {
        GetAttachmentCommentsOperationSpec r = new GetAttachmentCommentsOperationSpec(spec);
        return api.getAttachmentComments(r.id(), r.bodyFormat(), r.cursor(), r.limit(), r.sort());
    }

    /**
     * Get content properties for attachment
     * <p>
     * Retrieves all Content Properties tied to a specified attachment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the attachment.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>attachmentId: The ID of the attachment for which content properties should be returned.</li>
     *   <li>key: Filters the response to return a specific content property with matching key (case sensitive).</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultContentProperty> getAttachmentContentProperties(Consumer<GetAttachmentContentPropertiesOperationSpec> spec) {
        GetAttachmentContentPropertiesOperationSpec r = new GetAttachmentContentPropertiesOperationSpec(spec);
        return api.getAttachmentContentProperties(r.attachmentId(), r.key(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get content property for attachment by id
     * <p>
     * Retrieves a specific Content Property by ID that is attached to a specified attachment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the attachment.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>attachmentId: The ID of the attachment for which content properties should be returned.</li>
     *   <li>propertyId: The ID of the content property to be returned</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> getAttachmentContentPropertiesById(Consumer<GetAttachmentContentPropertiesByIdOperationSpec> spec) {
        GetAttachmentContentPropertiesByIdOperationSpec r = new GetAttachmentContentPropertiesByIdOperationSpec(spec);
        return api.getAttachmentContentPropertiesById(r.attachmentId(), r.propertyId());
    }

    /**
     * Get labels for attachment
     * <p>
     * Returns the labels of specific attachment. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the parent content of the attachment and its corresponding space.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the attachment for which labels should be returned.</li>
     *   <li>prefix: Filter the results to labels based on their prefix.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of labels per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultLabel> getAttachmentLabels(Consumer<GetAttachmentLabelsOperationSpec> spec) {
        GetAttachmentLabelsOperationSpec r = new GetAttachmentLabelsOperationSpec(spec);
        return api.getAttachmentLabels(r.id(), r.prefix(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get permitted operations for attachment
     * <p>
     * Returns the permitted operations on specific attachment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the parent content of the attachment and its corresponding space.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the attachment for which operations should be returned.</li>
     * </ul>
     */
    public CompletableFuture<PermittedOperationsResponse> getAttachmentOperations(Consumer<GetAttachmentOperationsOperationSpec> spec) {
        GetAttachmentOperationsOperationSpec r = new GetAttachmentOperationsOperationSpec(spec);
        return api.getAttachmentOperations(r.id());
    }

    /**
     * Get version details for attachment version
     * <p>
     * Retrieves version details for the specified attachment and version number.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the attachment.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>attachmentId: The ID of the attachment for which version details should be returned.</li>
     *   <li>versionNumber: The version number of the attachment to be returned.</li>
     * </ul>
     */
    public CompletableFuture<DetailedVersion> getAttachmentVersionDetails(Consumer<GetAttachmentVersionDetailsOperationSpec> spec) {
        GetAttachmentVersionDetailsOperationSpec r = new GetAttachmentVersionDetailsOperationSpec(spec);
        return api.getAttachmentVersionDetails(r.attachmentId(), r.versionNumber());
    }

    /**
     * Get attachment versions
     * <p>
     * Returns the versions of specific attachment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the attachment and its corresponding space.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the attachment to be queried for its versions. If you don't know the attachment ID, use Get attachments and filter the results.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of versions per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultVersion> getAttachmentVersions(Consumer<GetAttachmentVersionsOperationSpec> spec) {
        GetAttachmentVersionsOperationSpec r = new GetAttachmentVersionsOperationSpec(spec);
        return api.getAttachmentVersions(r.id(), r.cursor(), r.limit(), r.sort());
    }

    /**
     * Get attachments
     * <p>
     * Returns all attachments. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the container of the attachment.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>status: Filter the results to attachments based on their status. By default, {@code current} and {@code archived} are used.</li>
     *   <li>mediaType: Filters on the mediaType of attachments. Only one may be specified.</li>
     *   <li>filename: Filters on the file-name of attachments. Only one may be specified.</li>
     *   <li>limit: Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultAttachment> getAttachments(Consumer<GetAttachmentsOperationSpec> spec) {
        GetAttachmentsOperationSpec r = new GetAttachmentsOperationSpec(spec);
        return api.getAttachments(r.sort(), r.cursor(), r.status(), r.mediaType(), r.filename(), r.limit());
    }

    /**
     * Get blog post by id
     * <p>
     * Returns a specific blog post.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the blog post and its corresponding space.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the blog post to be returned. If you don't know the blog post ID, use Get blog posts and filter the results.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>getDraft: Retrieve the draft version of this blog post.</li>
     *   <li>version: Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details.</li>
     * </ul>
     */
    public CompletableFuture<BlogPostSingle> getBlogPostById(Consumer<GetBlogPostByIdOperationSpec> spec) {
        GetBlogPostByIdOperationSpec r = new GetBlogPostByIdOperationSpec(spec);
        return api.getBlogPostById(r.id(), r.bodyFormat(), r.getDraft(), r.version());
    }

    /**
     * Get footer comments for blog post
     * <p>
     * Returns the root footer comments of specific blog post. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the blog post and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the blog post for which footer comments should be returned.</li>
     *   <li>bodyFormat: The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of footer comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultBlogPostCommentModel> getBlogPostFooterComments(Consumer<GetBlogPostFooterCommentsOperationSpec> spec) {
        GetBlogPostFooterCommentsOperationSpec r = new GetBlogPostFooterCommentsOperationSpec(spec);
        return api.getBlogPostFooterComments(r.id(), r.bodyFormat(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get inline comments for blog post
     * <p>
     * Returns the root inline comments of specific blog post. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the blog post and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the blog post for which inline comments should be returned.</li>
     *   <li>bodyFormat: The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of inline comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultBlogPostInlineCommentModel> getBlogPostInlineComments(Consumer<GetBlogPostInlineCommentsOperationSpec> spec) {
        GetBlogPostInlineCommentsOperationSpec r = new GetBlogPostInlineCommentsOperationSpec(spec);
        return api.getBlogPostInlineComments(r.id(), r.bodyFormat(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get labels for blog post
     * <p>
     * Returns the labels of specific blog post. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the blog post and its corresponding space.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the blog post for which labels should be returned.</li>
     *   <li>prefix: Filter the results to labels based on their prefix.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of labels per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultLabel> getBlogPostLabels(Consumer<GetBlogPostLabelsOperationSpec> spec) {
        GetBlogPostLabelsOperationSpec r = new GetBlogPostLabelsOperationSpec(spec);
        return api.getBlogPostLabels(r.id(), r.prefix(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get like count for blog post
     * <p>
     * Returns the count of likes of specific blog post.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the blog post and its corresponding space.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the blog post for which like count should be returned.</li>
     * </ul>
     */
    public CompletableFuture<Integer> getBlogPostLikeCount(Consumer<GetBlogPostLikeCountOperationSpec> spec) {
        GetBlogPostLikeCountOperationSpec r = new GetBlogPostLikeCountOperationSpec(spec);
        return api.getBlogPostLikeCount(r.id());
    }

    /**
     * Get account IDs of likes for blog post
     * <p>
     * Returns the account IDs of likes of specific blog post.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the blog post and its corresponding space.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the blog post for which account IDs should be returned.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of account IDs per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultString> getBlogPostLikeUsers(Consumer<GetBlogPostLikeUsersOperationSpec> spec) {
        GetBlogPostLikeUsersOperationSpec r = new GetBlogPostLikeUsersOperationSpec(spec);
        return api.getBlogPostLikeUsers(r.id(), r.cursor(), r.limit());
    }

    /**
     * Get permitted operations for blog post
     * <p>
     * Returns the permitted operations on specific blog post.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the parent content of the blog post and its corresponding space.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the blog post for which operations should be returned.</li>
     * </ul>
     */
    public CompletableFuture<PermittedOperationsResponse> getBlogPostOperations(Consumer<GetBlogPostOperationsOperationSpec> spec) {
        GetBlogPostOperationsOperationSpec r = new GetBlogPostOperationsOperationSpec(spec);
        return api.getBlogPostOperations(r.id());
    }

    /**
     * Get version details for blog post version
     * <p>
     * Retrieves version details for the specified blog post and version number.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the blog post.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>blogpostId: The ID of the blog post for which version details should be returned.</li>
     *   <li>versionNumber: The version number of the blog post to be returned.</li>
     * </ul>
     */
    public CompletableFuture<DetailedVersion> getBlogPostVersionDetails(Consumer<GetBlogPostVersionDetailsOperationSpec> spec) {
        GetBlogPostVersionDetailsOperationSpec r = new GetBlogPostVersionDetailsOperationSpec(spec);
        return api.getBlogPostVersionDetails(r.blogpostId(), r.versionNumber());
    }

    /**
     * Get blog post versions
     * <p>
     * Returns the versions of specific blog post.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the blog post and its corresponding space.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the blog post to be queried for its versions. If you don't know the blog post ID, use Get blog posts and filter the results.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of versions per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultVersion1> getBlogPostVersions(Consumer<GetBlogPostVersionsOperationSpec> spec) {
        GetBlogPostVersionsOperationSpec r = new GetBlogPostVersionsOperationSpec(spec);
        return api.getBlogPostVersions(r.id(), r.bodyFormat(), r.cursor(), r.limit(), r.sort());
    }

    /**
     * Get blog posts
     * <p>
     * Returns all blog posts. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only blog posts that the user has permission to view will be returned.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: Filter the results based on blog post ids. Multiple blog post ids can be specified as a comma-separated list.</li>
     *   <li>spaceId: Filter the results based on space ids. Multiple space ids can be specified as a comma-separated list.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>status: Filter the results to blog posts based on their status. By default, {@code current} is used.</li>
     *   <li>title: Filter the results to blog posts based on their title.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of blog posts per result to return. If more results exist, use the {@code Link} response header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultBlogPost> getBlogPosts(Consumer<GetBlogPostsOperationSpec> spec) {
        GetBlogPostsOperationSpec r = new GetBlogPostsOperationSpec(spec);
        return api.getBlogPosts(r.id(), r.spaceId(), r.sort(), r.status(), r.title(), r.bodyFormat(), r.cursor(), r.limit());
    }

    /**
     * Get blog posts in space
     * <p>
     * Returns all blog posts in a space. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) and view the space. Only blog posts that the user has permission to view will be returned.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the space for which blog posts should be returned.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>status: Filter the results to blog posts based on their status. By default, {@code current} is used.</li>
     *   <li>title: Filter the results to blog posts based on their title.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of blog posts per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultBlogPost> getBlogPostsInSpace(Consumer<GetBlogPostsInSpaceOperationSpec> spec) {
        GetBlogPostsInSpaceOperationSpec r = new GetBlogPostsInSpaceOperationSpec(spec);
        return api.getBlogPostsInSpace(r.id(), r.sort(), r.status(), r.title(), r.bodyFormat(), r.cursor(), r.limit());
    }

    /**
     * Get attachments for blog post
     * <p>
     * Returns the attachments of specific blog post. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the blog post and its corresponding space.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the blog post for which attachments should be returned.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>status: Filter the results to attachments based on their status. By default, {@code current} and {@code archived} are used.</li>
     *   <li>mediaType: Filters on the mediaType of attachments. Only one may be specified.</li>
     *   <li>filename: Filters on the file-name of attachments. Only one may be specified.</li>
     *   <li>limit: Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultAttachment> getBlogpostAttachments(Consumer<GetBlogpostAttachmentsOperationSpec> spec) {
        GetBlogpostAttachmentsOperationSpec r = new GetBlogpostAttachmentsOperationSpec(spec);
        return api.getBlogpostAttachments(r.id(), r.sort(), r.cursor(), r.status(), r.mediaType(), r.filename(), r.limit());
    }

    /**
     * Get content properties for blog post
     * <p>
     * Retrieves all Content Properties tied to a specified blog post.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the blog post.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>blogpostId: The ID of the blog post for which content properties should be returned.</li>
     *   <li>key: Filters the response to return a specific content property with matching key (case sensitive).</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultContentProperty> getBlogpostContentProperties(Consumer<GetBlogpostContentPropertiesOperationSpec> spec) {
        GetBlogpostContentPropertiesOperationSpec r = new GetBlogpostContentPropertiesOperationSpec(spec);
        return api.getBlogpostContentProperties(r.blogpostId(), r.key(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get content property for blog post by id
     * <p>
     * Retrieves a specific Content Property by ID that is attached to a specified blog post.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the blog post.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>blogpostId: The ID of the blog post for which content properties should be returned.</li>
     *   <li>propertyId: The ID of the property being requested</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> getBlogpostContentPropertiesById(Consumer<GetBlogpostContentPropertiesByIdOperationSpec> spec) {
        GetBlogpostContentPropertiesByIdOperationSpec r = new GetBlogpostContentPropertiesByIdOperationSpec(spec);
        return api.getBlogpostContentPropertiesById(r.blogpostId(), r.propertyId());
    }

    /**
     * Get child custom content
     * <p>
     * Returns all child custom content for given custom content id. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only custom content that the user has permission to view will be returned.
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the parent custom content. If you don't know the custom content ID, use Get custom-content and filter the results.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultChildCustomContent> getChildCustomContent(Consumer<GetChildCustomContentOperationSpec> spec) {
        GetChildCustomContentOperationSpec r = new GetChildCustomContentOperationSpec(spec);
        return api.getChildCustomContent(r.id(), r.cursor(), r.limit(), r.sort());
    }

    /**
     * Get child pages
     * <p>
     * Returns all child pages for given page id. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only pages that the user has permission to view will be returned.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the parent page. If you don't know the page ID, use Get pages and filter the results.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultChildPage> getChildPages(Consumer<GetChildPagesOperationSpec> spec) {
        GetChildPagesOperationSpec r = new GetChildPagesOperationSpec(spec);
        return api.getChildPages(r.id(), r.cursor(), r.limit(), r.sort());
    }

    /**
     * Get content properties for comment
     * <p>
     * Retrieves Content Properties attached to a specified comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the comment.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>commentId: The ID of the comment for which content properties should be returned.</li>
     *   <li>key: Filters the response to return a specific content property with matching key (case sensitive).</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultContentProperty> getCommentContentProperties(Consumer<GetCommentContentPropertiesOperationSpec> spec) {
        GetCommentContentPropertiesOperationSpec r = new GetCommentContentPropertiesOperationSpec(spec);
        return api.getCommentContentProperties(r.commentId(), r.key(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get content property for comment by id
     * <p>
     * Retrieves a specific Content Property by ID that is attached to a specified comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the comment.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>commentId: The ID of the comment for which content properties should be returned.</li>
     *   <li>propertyId: The ID of the content property being requested.</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> getCommentContentPropertiesById(Consumer<GetCommentContentPropertiesByIdOperationSpec> spec) {
        GetCommentContentPropertiesByIdOperationSpec r = new GetCommentContentPropertiesByIdOperationSpec(spec);
        return api.getCommentContentPropertiesById(r.commentId(), r.propertyId());
    }

    /**
     * Get attachments for custom content
     * <p>
     * Returns the attachments of specific custom content. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the custom content and its corresponding space.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the custom content for which attachments should be returned.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>status: Filter the results to attachments based on their status. By default, {@code current} and {@code archived} are used.</li>
     *   <li>mediaType: Filters on the mediaType of attachments. Only one may be specified.</li>
     *   <li>filename: Filters on the file-name of attachments. Only one may be specified.</li>
     *   <li>limit: Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultAttachment> getCustomContentAttachments(Consumer<GetCustomContentAttachmentsOperationSpec> spec) {
        GetCustomContentAttachmentsOperationSpec r = new GetCustomContentAttachmentsOperationSpec(spec);
        return api.getCustomContentAttachments(r.id(), r.sort(), r.cursor(), r.status(), r.mediaType(), r.filename(), r.limit());
    }

    /**
     * Get custom content by id
     * <p>
     * Returns a specific piece of custom content.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content, the container of the custom content, and the corresponding space (if different from the container).
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the custom content to be returned. If you don't know the custom content ID, use Get Custom Content by Type and filter the results.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned.</li>
     *   <li>version: Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details.</li>
     * </ul>
     */
    public CompletableFuture<CustomContentSingle> getCustomContentById(Consumer<GetCustomContentByIdOperationSpec> spec) {
        GetCustomContentByIdOperationSpec r = new GetCustomContentByIdOperationSpec(spec);
        return api.getCustomContentById(r.id(), r.bodyFormat(), r.version());
    }

    /**
     * Get custom content by type
     * <p>
     * Returns all custom content for a given type. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content, the container of the custom content, and the corresponding space (if different from the container).
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>type: The type of custom content being requested. See: https://developer.atlassian.com/cloud/confluence/custom-content/ for additional details on custom content.</li>
     *   <li>id: Filter the results based on custom content ids. Multiple custom content ids can be specified as a comma-separated list.</li>
     *   <li>spaceId: Filter the results based on space ids. Multiple space ids can be specified as a comma-separated list.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultCustomContent> getCustomContentByType(Consumer<GetCustomContentByTypeOperationSpec> spec) {
        GetCustomContentByTypeOperationSpec r = new GetCustomContentByTypeOperationSpec(spec);
        return api.getCustomContentByType(r.type(), r.id(), r.spaceId(), r.sort(), r.cursor(), r.limit(), r.bodyFormat());
    }

    /**
     * Get custom content by type in blog post
     * <p>
     * Returns all custom content for a given type within a given blogpost. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content, the container of the custom content (blog post), and the corresponding space.
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the blog post for which custom content should be returned.</li>
     *   <li>type: The type of custom content being requested. See: https://developer.atlassian.com/cloud/confluence/custom-content/ for additional details on custom content.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultCustomContent> getCustomContentByTypeInBlogPost(Consumer<GetCustomContentByTypeInBlogPostOperationSpec> spec) {
        GetCustomContentByTypeInBlogPostOperationSpec r = new GetCustomContentByTypeInBlogPostOperationSpec(spec);
        return api.getCustomContentByTypeInBlogPost(r.id(), r.type(), r.sort(), r.cursor(), r.limit(), r.bodyFormat());
    }

    /**
     * Get custom content by type in page
     * <p>
     * Returns all custom content for a given type within a given page. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content, the container of the custom content (page), and the corresponding space.
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the page for which custom content should be returned.</li>
     *   <li>type: The type of custom content being requested. See: https://developer.atlassian.com/cloud/confluence/custom-content/ for additional details on custom content.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultCustomContent> getCustomContentByTypeInPage(Consumer<GetCustomContentByTypeInPageOperationSpec> spec) {
        GetCustomContentByTypeInPageOperationSpec r = new GetCustomContentByTypeInPageOperationSpec(spec);
        return api.getCustomContentByTypeInPage(r.id(), r.type(), r.sort(), r.cursor(), r.limit(), r.bodyFormat());
    }

    /**
     * Get custom content by type in space
     * <p>
     * Returns all custom content for a given type within a given space. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content and the corresponding space.
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the space for which custom content should be returned.</li>
     *   <li>type: The type of custom content being requested. See: https://developer.atlassian.com/cloud/confluence/custom-content/ for additional details on custom content.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultCustomContent> getCustomContentByTypeInSpace(Consumer<GetCustomContentByTypeInSpaceOperationSpec> spec) {
        GetCustomContentByTypeInSpaceOperationSpec r = new GetCustomContentByTypeInSpaceOperationSpec(spec);
        return api.getCustomContentByTypeInSpace(r.id(), r.type(), r.cursor(), r.limit(), r.bodyFormat());
    }

    /**
     * Get custom content comments
     * <p>
     * Returns the comments of the specific custom content. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content and its corresponding containers.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the custom content for which comments should be returned.</li>
     *   <li>bodyFormat: The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultCustomContentCommentModel> getCustomContentComments(Consumer<GetCustomContentCommentsOperationSpec> spec) {
        GetCustomContentCommentsOperationSpec r = new GetCustomContentCommentsOperationSpec(spec);
        return api.getCustomContentComments(r.id(), r.bodyFormat(), r.cursor(), r.limit(), r.sort());
    }

    /**
     * Get content properties for custom content
     * <p>
     * Retrieves Content Properties tied to a specified custom content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content.
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>customContentId: The ID of the custom content for which content properties should be returned.</li>
     *   <li>key: Filters the response to return a specific content property with matching key (case sensitive).</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultContentProperty> getCustomContentContentProperties(Consumer<GetCustomContentContentPropertiesOperationSpec> spec) {
        GetCustomContentContentPropertiesOperationSpec r = new GetCustomContentContentPropertiesOperationSpec(spec);
        return api.getCustomContentContentProperties(r.customContentId(), r.key(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get content property for custom content by id
     * <p>
     * Retrieves a specific Content Property by ID that is attached to a specified custom content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page.
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>customContentId: The ID of the custom content for which content properties should be returned.</li>
     *   <li>propertyId: The ID of the content property being requested.</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> getCustomContentContentPropertiesById(Consumer<GetCustomContentContentPropertiesByIdOperationSpec> spec) {
        GetCustomContentContentPropertiesByIdOperationSpec r = new GetCustomContentContentPropertiesByIdOperationSpec(spec);
        return api.getCustomContentContentPropertiesById(r.customContentId(), r.propertyId());
    }

    /**
     * Get labels for custom content
     * <p>
     * Returns the labels for a specific piece of custom content. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content and its corresponding space.
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the custom content for which labels should be returned.</li>
     *   <li>prefix: Filter the results to labels based on their prefix.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of labels per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultLabel> getCustomContentLabels(Consumer<GetCustomContentLabelsOperationSpec> spec) {
        GetCustomContentLabelsOperationSpec r = new GetCustomContentLabelsOperationSpec(spec);
        return api.getCustomContentLabels(r.id(), r.prefix(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get permitted operations for custom content
     * <p>
     * Returns the permitted operations on specific custom content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the parent content of the custom content and its corresponding space.
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the custom content for which operations should be returned.</li>
     * </ul>
     */
    public CompletableFuture<PermittedOperationsResponse> getCustomContentOperations(Consumer<GetCustomContentOperationsOperationSpec> spec) {
        GetCustomContentOperationsOperationSpec r = new GetCustomContentOperationsOperationSpec(spec);
        return api.getCustomContentOperations(r.id());
    }

    /**
     * Get version details for custom content version
     * <p>
     * Retrieves version details for the specified custom content and version number.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page.
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>customContentId: The ID of the custom content for which version details should be returned.</li>
     *   <li>versionNumber: The version number of the custom content to be returned.</li>
     * </ul>
     */
    public CompletableFuture<DetailedVersion> getCustomContentVersionDetails(Consumer<GetCustomContentVersionDetailsOperationSpec> spec) {
        GetCustomContentVersionDetailsOperationSpec r = new GetCustomContentVersionDetailsOperationSpec(spec);
        return api.getCustomContentVersionDetails(r.customContentId(), r.versionNumber());
    }

    /**
     * Get custom content versions
     * <p>
     * Returns the versions of specific custom content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content and its corresponding page and space.
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>customContentId: The ID of the custom content to be queried for its versions. If you don't know the custom content ID, use Get custom-content by type and filter the results.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of versions per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultVersion3> getCustomContentVersions(Consumer<GetCustomContentVersionsOperationSpec> spec) {
        GetCustomContentVersionsOperationSpec r = new GetCustomContentVersionsOperationSpec(spec);
        return api.getCustomContentVersions(r.customContentId(), r.bodyFormat(), r.cursor(), r.limit(), r.sort());
    }

    /**
     * Get data policy metadata for the workspace (EAP)
     * <p>
     * Returns data policy metadata for the workspace.
     * **[Permissions](#permissions) required:** Only apps can make this request. Permission to access the Confluence site ('Can use' global permission).
     */
    public CompletableFuture<DataPolicyMetadata> getDataPolicyMetadata() {
        return api.getDataPolicyMetadata();
    }

    /**
     * Get spaces with data policies (EAP)
     * <p>
     * Returns all spaces. The results will be sorted by id ascending. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Only apps can make this request. Permission to access the Confluence site ('Can use' global permission). Only spaces that the app has permission to view will be returned.
     * Authentication - Required Scopes: [read:space:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>ids: Filter the results to spaces based on their IDs. Multiple IDs can be specified as a comma-separated list.</li>
     *   <li>keys: Filter the results to spaces based on their keys. Multiple keys can be specified as a comma-separated list.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of spaces per result to return. If more results exist, use the {@code Link} response header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultDataPolicySpace> getDataPolicySpaces(Consumer<GetDataPolicySpacesOperationSpec> spec) {
        GetDataPolicySpacesOperationSpec r = new GetDataPolicySpacesOperationSpec(spec);
        return api.getDataPolicySpaces(r.ids(), r.keys(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get footer comment by id
     * <p>
     * Retrieves a footer comment by id
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the container and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>commentId: The ID of the comment to be retrieved.</li>
     *   <li>bodyFormat: The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>version: Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details.</li>
     * </ul>
     */
    public CompletableFuture<FooterCommentModel> getFooterCommentById(Consumer<GetFooterCommentByIdOperationSpec> spec) {
        GetFooterCommentByIdOperationSpec r = new GetFooterCommentByIdOperationSpec(spec);
        return api.getFooterCommentById(r.commentId(), r.bodyFormat(), r.version());
    }

    /**
     * Get children footer comments
     * <p>
     * Returns the children footer comments of specific comment. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the parent comment for which footer comment children should be returned.</li>
     *   <li>bodyFormat: The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of footer comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultChildrenCommentModel> getFooterCommentChildren(Consumer<GetFooterCommentChildrenOperationSpec> spec) {
        GetFooterCommentChildrenOperationSpec r = new GetFooterCommentChildrenOperationSpec(spec);
        return api.getFooterCommentChildren(r.id(), r.bodyFormat(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get permitted operations for footer comment
     * <p>
     * Returns the permitted operations on specific footer comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the parent content of the footer comment and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the footer comment for which operations should be returned.</li>
     * </ul>
     */
    public CompletableFuture<PermittedOperationsResponse> getFooterCommentOperations(Consumer<GetFooterCommentOperationsOperationSpec> spec) {
        GetFooterCommentOperationsOperationSpec r = new GetFooterCommentOperationsOperationSpec(spec);
        return api.getFooterCommentOperations(r.id());
    }

    /**
     * Get version details for footer comment version
     * <p>
     * Retrieves version details for the specified footer comment version.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blog post and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the footer comment for which version details should be returned.</li>
     *   <li>versionNumber: The version number of the footer comment to be returned.</li>
     * </ul>
     */
    public CompletableFuture<DetailedVersion> getFooterCommentVersionDetails(Consumer<GetFooterCommentVersionDetailsOperationSpec> spec) {
        GetFooterCommentVersionDetailsOperationSpec r = new GetFooterCommentVersionDetailsOperationSpec(spec);
        return api.getFooterCommentVersionDetails(r.id(), r.versionNumber());
    }

    /**
     * Get footer comment versions
     * <p>
     * Retrieves the versions of the specified footer comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blog post and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the footer comment for which versions should be returned</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of versions per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultVersion4> getFooterCommentVersions(Consumer<GetFooterCommentVersionsOperationSpec> spec) {
        GetFooterCommentVersionsOperationSpec r = new GetFooterCommentVersionsOperationSpec(spec);
        return api.getFooterCommentVersions(r.id(), r.bodyFormat(), r.cursor(), r.limit(), r.sort());
    }

    /**
     * Get footer comments
     * <p>
     * Returns all footer comments. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the container and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>bodyFormat: The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of footer comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultFooterCommentModel> getFooterComments(Consumer<GetFooterCommentsOperationSpec> spec) {
        GetFooterCommentsOperationSpec r = new GetFooterCommentsOperationSpec(spec);
        return api.getFooterComments(r.bodyFormat(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get like count for footer comment
     * <p>
     * Returns the count of likes of specific footer comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page/blogpost and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the footer comment for which like count should be returned.</li>
     * </ul>
     */
    public CompletableFuture<Integer> getFooterLikeCount(Consumer<GetFooterLikeCountOperationSpec> spec) {
        GetFooterLikeCountOperationSpec r = new GetFooterLikeCountOperationSpec(spec);
        return api.getFooterLikeCount(r.id());
    }

    /**
     * Get account IDs of likes for footer comment
     * <p>
     * Returns the account IDs of likes of specific footer comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page/blogpost and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the footer comment for which like count should be returned.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of account IDs per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultString> getFooterLikeUsers(Consumer<GetFooterLikeUsersOperationSpec> spec) {
        GetFooterLikeUsersOperationSpec r = new GetFooterLikeUsersOperationSpec(spec);
        return api.getFooterLikeUsers(r.id(), r.cursor(), r.limit());
    }

    /**
     * Get inline comment by id
     * <p>
     * Retrieves an inline comment by id
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>commentId: The ID of the comment to be retrieved.</li>
     *   <li>bodyFormat: The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>version: Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details.</li>
     * </ul>
     */
    public CompletableFuture<InlineCommentModel> getInlineCommentById(Consumer<GetInlineCommentByIdOperationSpec> spec) {
        GetInlineCommentByIdOperationSpec r = new GetInlineCommentByIdOperationSpec(spec);
        return api.getInlineCommentById(r.commentId(), r.bodyFormat(), r.version());
    }

    /**
     * Get children inline comments
     * <p>
     * Returns the children inline comments of specific comment. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the parent comment for which inline comment children should be returned.</li>
     *   <li>bodyFormat: The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of footer comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultInlineCommentChildrenModel> getInlineCommentChildren(Consumer<GetInlineCommentChildrenOperationSpec> spec) {
        GetInlineCommentChildrenOperationSpec r = new GetInlineCommentChildrenOperationSpec(spec);
        return api.getInlineCommentChildren(r.id(), r.bodyFormat(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get permitted operations for inline comment
     * <p>
     * Returns the permitted operations on specific inline comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the parent content of the inline comment and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the inline comment for which operations should be returned.</li>
     * </ul>
     */
    public CompletableFuture<PermittedOperationsResponse> getInlineCommentOperations(Consumer<GetInlineCommentOperationsOperationSpec> spec) {
        GetInlineCommentOperationsOperationSpec r = new GetInlineCommentOperationsOperationSpec(spec);
        return api.getInlineCommentOperations(r.id());
    }

    /**
     * Get version details for inline comment version
     * <p>
     * Retrieves version details for the specified inline comment version.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blog post and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the inline comment for which version details should be returned.</li>
     *   <li>versionNumber: The version number of the inline comment to be returned.</li>
     * </ul>
     */
    public CompletableFuture<DetailedVersion> getInlineCommentVersionDetails(Consumer<GetInlineCommentVersionDetailsOperationSpec> spec) {
        GetInlineCommentVersionDetailsOperationSpec r = new GetInlineCommentVersionDetailsOperationSpec(spec);
        return api.getInlineCommentVersionDetails(r.id(), r.versionNumber());
    }

    /**
     * Get inline comment versions
     * <p>
     * Retrieves the versions of the specified inline comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blog post and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the inline comment for which versions should be returned</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of versions per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultVersion4> getInlineCommentVersions(Consumer<GetInlineCommentVersionsOperationSpec> spec) {
        GetInlineCommentVersionsOperationSpec r = new GetInlineCommentVersionsOperationSpec(spec);
        return api.getInlineCommentVersions(r.id(), r.bodyFormat(), r.cursor(), r.limit(), r.sort());
    }

    /**
     * Get inline comments
     * <p>
     * Returns all inline comments. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>bodyFormat: The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of footer comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultInlineCommentModel> getInlineComments(Consumer<GetInlineCommentsOperationSpec> spec) {
        GetInlineCommentsOperationSpec r = new GetInlineCommentsOperationSpec(spec);
        return api.getInlineComments(r.bodyFormat(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get like count for inline comment
     * <p>
     * Returns the count of likes of specific inline comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page/blogpost and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the inline comment for which like count should be returned.</li>
     * </ul>
     */
    public CompletableFuture<Integer> getInlineLikeCount(Consumer<GetInlineLikeCountOperationSpec> spec) {
        GetInlineLikeCountOperationSpec r = new GetInlineLikeCountOperationSpec(spec);
        return api.getInlineLikeCount(r.id());
    }

    /**
     * Get account IDs of likes for inline comment
     * <p>
     * Returns the account IDs of likes of specific inline comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page/blogpost and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the inline comment for which like count should be returned.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of account IDs per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultString> getInlineLikeUsers(Consumer<GetInlineLikeUsersOperationSpec> spec) {
        GetInlineLikeUsersOperationSpec r = new GetInlineLikeUsersOperationSpec(spec);
        return api.getInlineLikeUsers(r.id(), r.cursor(), r.limit());
    }

    /**
     * Get attachments for label
     * <p>
     * Returns the attachments of specified label. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the attachment and its corresponding space.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the label for which attachments should be returned.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultAttachment1> getLabelAttachments(Consumer<GetLabelAttachmentsOperationSpec> spec) {
        GetLabelAttachmentsOperationSpec r = new GetLabelAttachmentsOperationSpec(spec);
        return api.getLabelAttachments(r.id(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get blog posts for label
     * <p>
     * Returns the blogposts of specified label. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the label for which blog posts should be returned.</li>
     *   <li>spaceId: Filter the results based on space ids. Multiple space ids can be specified as a comma-separated list.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of blog posts per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultBlogPost> getLabelBlogPosts(Consumer<GetLabelBlogPostsOperationSpec> spec) {
        GetLabelBlogPostsOperationSpec r = new GetLabelBlogPostsOperationSpec(spec);
        return api.getLabelBlogPosts(r.id(), r.spaceId(), r.bodyFormat(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get pages for label
     * <p>
     * Returns the pages of specified label. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the label for which pages should be returned.</li>
     *   <li>spaceId: Filter the results based on space ids. Multiple space ids can be specified as a comma-separated list.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultPage> getLabelPages(Consumer<GetLabelPagesOperationSpec> spec) {
        GetLabelPagesOperationSpec r = new GetLabelPagesOperationSpec(spec);
        return api.getLabelPages(r.id(), r.spaceId(), r.bodyFormat(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get labels
     * <p>
     * Returns all labels. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only labels that the user has permission to view will be returned.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>labelId: Filters on label ID. Multiple IDs can be specified as a comma-separated list.</li>
     *   <li>prefix: Filters on label prefix. Multiple IDs can be specified as a comma-separated list.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>limit: Maximum number of labels per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultLabel1> getLabels(Consumer<GetLabelsOperationSpec> spec) {
        GetLabelsOperationSpec r = new GetLabelsOperationSpec(spec);
        return api.getLabels(r.labelId(), r.prefix(), r.cursor(), r.sort(), r.limit());
    }

    /**
     * Get all ancestors of page
     * <p>
     * Returns all ancestors for a given page by ID in top-to-bottom order (that is, the highest ancestor is the first item in the response payload). The number of results is limited by the {@code limit} parameter and additional results (if available) will be available by calling this endpoint with the ID of first ancestor in the response payload.
     * This endpoint returns minimal information about each ancestor. To fetch more details, use a related endpoint, such as [Get page by id](https://developer.atlassian.com/cloud/confluence/rest/v2/api-group-page/#api-pages-id-get).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the page.</li>
     *   <li>limit: Maximum number of pages per result to return. If more results exist, call this endpoint with the highest ancestor's ID to fetch the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultAncestor> getPageAncestors(Consumer<GetPageAncestorsOperationSpec> spec) {
        GetPageAncestorsOperationSpec r = new GetPageAncestorsOperationSpec(spec);
        return api.getPageAncestors(r.id(), r.limit());
    }

    /**
     * Get attachments for page
     * <p>
     * Returns the attachments of specific page. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the page for which attachments should be returned.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>status: Filter the results to attachments based on their status. By default, {@code current} and {@code archived} are used.</li>
     *   <li>mediaType: Filters on the mediaType of attachments. Only one may be specified.</li>
     *   <li>filename: Filters on the file-name of attachments. Only one may be specified.</li>
     *   <li>limit: Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultAttachment> getPageAttachments(Consumer<GetPageAttachmentsOperationSpec> spec) {
        GetPageAttachmentsOperationSpec r = new GetPageAttachmentsOperationSpec(spec);
        return api.getPageAttachments(r.id(), r.sort(), r.cursor(), r.status(), r.mediaType(), r.filename(), r.limit());
    }

    /**
     * Get page by id
     * <p>
     * Returns a specific page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page and its corresponding space.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the page to be returned. If you don't know the page ID, use Get pages and filter the results.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>getDraft: Retrieve the draft version of this page.</li>
     *   <li>version: Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details.</li>
     * </ul>
     */
    public CompletableFuture<PageSingle> getPageById(Consumer<GetPageByIdOperationSpec> spec) {
        GetPageByIdOperationSpec r = new GetPageByIdOperationSpec(spec);
        return api.getPageById(r.id(), r.bodyFormat(), r.getDraft(), r.version());
    }

    /**
     * Get content properties for page
     * <p>
     * Retrieves Content Properties tied to a specified page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>pageId: The ID of the page for which content properties should be returned.</li>
     *   <li>key: Filters the response to return a specific content property with matching key (case sensitive).</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultContentProperty> getPageContentProperties(Consumer<GetPageContentPropertiesOperationSpec> spec) {
        GetPageContentPropertiesOperationSpec r = new GetPageContentPropertiesOperationSpec(spec);
        return api.getPageContentProperties(r.pageId(), r.key(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get content property for page by id
     * <p>
     * Retrieves a specific Content Property by ID that is attached to a specified page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>pageId: The ID of the page for which content properties should be returned.</li>
     *   <li>propertyId: The ID of the content property being requested.</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> getPageContentPropertiesById(Consumer<GetPageContentPropertiesByIdOperationSpec> spec) {
        GetPageContentPropertiesByIdOperationSpec r = new GetPageContentPropertiesByIdOperationSpec(spec);
        return api.getPageContentPropertiesById(r.pageId(), r.propertyId());
    }

    /**
     * Get footer comments for page
     * <p>
     * Returns the root footer comments of specific page. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the page for which footer comments should be returned.</li>
     *   <li>bodyFormat: The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of footer comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultPageCommentModel> getPageFooterComments(Consumer<GetPageFooterCommentsOperationSpec> spec) {
        GetPageFooterCommentsOperationSpec r = new GetPageFooterCommentsOperationSpec(spec);
        return api.getPageFooterComments(r.id(), r.bodyFormat(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get inline comments for page
     * <p>
     * Returns the root inline comments of specific page. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the page for which inline comments should be returned.</li>
     *   <li>bodyFormat: The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of inline comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultPageInlineCommentModel> getPageInlineComments(Consumer<GetPageInlineCommentsOperationSpec> spec) {
        GetPageInlineCommentsOperationSpec r = new GetPageInlineCommentsOperationSpec(spec);
        return api.getPageInlineComments(r.id(), r.bodyFormat(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get labels for page
     * <p>
     * Returns the labels of specific page. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the page for which labels should be returned.</li>
     *   <li>prefix: Filter the results to labels based on their prefix.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of labels per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultLabel> getPageLabels(Consumer<GetPageLabelsOperationSpec> spec) {
        GetPageLabelsOperationSpec r = new GetPageLabelsOperationSpec(spec);
        return api.getPageLabels(r.id(), r.prefix(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get like count for page
     * <p>
     * Returns the count of likes of specific page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the page for which like count should be returned.</li>
     * </ul>
     */
    public CompletableFuture<Integer> getPageLikeCount(Consumer<GetPageLikeCountOperationSpec> spec) {
        GetPageLikeCountOperationSpec r = new GetPageLikeCountOperationSpec(spec);
        return api.getPageLikeCount(r.id());
    }

    /**
     * Get account IDs of likes for page
     * <p>
     * Returns the account IDs of likes of specific page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the page for which like count should be returned.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of account IDs per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultString> getPageLikeUsers(Consumer<GetPageLikeUsersOperationSpec> spec) {
        GetPageLikeUsersOperationSpec r = new GetPageLikeUsersOperationSpec(spec);
        return api.getPageLikeUsers(r.id(), r.cursor(), r.limit());
    }

    /**
     * Get permitted operations for page
     * <p>
     * Returns the permitted operations on specific page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the parent content of the page and its corresponding space.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the page for which operations should be returned.</li>
     * </ul>
     */
    public CompletableFuture<PermittedOperationsResponse> getPageOperations(Consumer<GetPageOperationsOperationSpec> spec) {
        GetPageOperationsOperationSpec r = new GetPageOperationsOperationSpec(spec);
        return api.getPageOperations(r.id());
    }

    /**
     * Get version details for page version
     * <p>
     * Retrieves version details for the specified page and version number.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>pageId: The ID of the page for which version details should be returned.</li>
     *   <li>versionNumber: The version number of the page to be returned.</li>
     * </ul>
     */
    public CompletableFuture<DetailedVersion> getPageVersionDetails(Consumer<GetPageVersionDetailsOperationSpec> spec) {
        GetPageVersionDetailsOperationSpec r = new GetPageVersionDetailsOperationSpec(spec);
        return api.getPageVersionDetails(r.pageId(), r.versionNumber());
    }

    /**
     * Get page versions
     * <p>
     * Returns the versions of specific page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page and its corresponding space.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the page to be queried for its versions. If you don't know the page ID, use Get pages and filter the results.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of versions per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultVersion2> getPageVersions(Consumer<GetPageVersionsOperationSpec> spec) {
        GetPageVersionsOperationSpec r = new GetPageVersionsOperationSpec(spec);
        return api.getPageVersions(r.id(), r.bodyFormat(), r.cursor(), r.limit(), r.sort());
    }

    /**
     * Get pages
     * <p>
     * Returns all pages. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only pages that the user has permission to view will be returned.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: Filter the results based on page ids. Multiple page ids can be specified as a comma-separated list.</li>
     *   <li>spaceId: Filter the results based on space ids. Multiple space ids can be specified as a comma-separated list.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>status: Filter the results to pages based on their status. By default, {@code current} and {@code archived} are used.</li>
     *   <li>title: Filter the results to pages based on their title.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultPage> getPages(Consumer<GetPagesOperationSpec> spec) {
        GetPagesOperationSpec r = new GetPagesOperationSpec(spec);
        return api.getPages(r.id(), r.spaceId(), r.sort(), r.status(), r.title(), r.bodyFormat(), r.cursor(), r.limit());
    }

    /**
     * Get pages in space
     * <p>
     * Returns all pages in a space. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) and 'View' permission for the space. Only pages that the user has permission to view will be returned.
     * Authentication - Required Scopes: [read:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the space for which pages should be returned.</li>
     *   <li>depth: Filter the results to pages at the root level of the space or to all pages in the space.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>status: Filter the results to pages based on their status. By default, {@code current} and {@code archived} are used.</li>
     *   <li>title: Filter the results to pages based on their title.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultPage> getPagesInSpace(Consumer<GetPagesInSpaceOperationSpec> spec) {
        GetPagesInSpaceOperationSpec r = new GetPagesInSpaceOperationSpec(spec);
        return api.getPagesInSpace(r.id(), r.depth(), r.sort(), r.status(), r.title(), r.bodyFormat(), r.cursor(), r.limit());
    }

    /**
     * Get space by id
     * <p>
     * Returns a specific space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the space.
     * Authentication - Required Scopes: [read:space:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the space to be returned.</li>
     *   <li>descriptionFormat: The content format type to be returned in the {@code description} field of the response. If available, the representation will be available under a response field of the same name under the {@code description} field.</li>
     *   <li>includeIcon: If the icon for the space should be fetched or not.</li>
     * </ul>
     */
    public CompletableFuture<Space> getSpaceById(Consumer<GetSpaceByIdOperationSpec> spec) {
        GetSpaceByIdOperationSpec r = new GetSpaceByIdOperationSpec(spec);
        return api.getSpaceById(r.id(), r.descriptionFormat(), r.includeIcon());
    }

    /**
     * Get labels for space content
     * <p>
     * Returns the labels of space content (pages, blogposts etc). The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the space.
     * Authentication - Required Scopes: [read:space:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the space for which labels should be returned.</li>
     *   <li>prefix: Filter the results to labels based on their prefix.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of labels per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultLabel> getSpaceContentLabels(Consumer<GetSpaceContentLabelsOperationSpec> spec) {
        GetSpaceContentLabelsOperationSpec r = new GetSpaceContentLabelsOperationSpec(spec);
        return api.getSpaceContentLabels(r.id(), r.prefix(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get labels for space
     * <p>
     * Returns the labels of specific space. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the space.
     * Authentication - Required Scopes: [read:space:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the space for which labels should be returned.</li>
     *   <li>prefix: Filter the results to labels based on their prefix.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of labels per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultLabel> getSpaceLabels(Consumer<GetSpaceLabelsOperationSpec> spec) {
        GetSpaceLabelsOperationSpec r = new GetSpaceLabelsOperationSpec(spec);
        return api.getSpaceLabels(r.id(), r.prefix(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get permitted operations for space
     * <p>
     * Returns the permitted operations on specific space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the corresponding space.
     * Authentication - Required Scopes: [read:space:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the space for which operations should be returned.</li>
     * </ul>
     */
    public CompletableFuture<PermittedOperationsResponse> getSpaceOperations(Consumer<GetSpaceOperationsOperationSpec> spec) {
        GetSpaceOperationsOperationSpec r = new GetSpaceOperationsOperationSpec(spec);
        return api.getSpaceOperations(r.id());
    }

    /**
     * Get space permissions
     * <p>
     * Returns space permissions for a specific space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the space.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the space to be returned.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of spaces per result to return. If more results exist, use the {@code Link} response header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultSpacePermission> getSpacePermissions(Consumer<GetSpacePermissionsOperationSpec> spec) {
        GetSpacePermissionsOperationSpec r = new GetSpacePermissionsOperationSpec(spec);
        return api.getSpacePermissions(r.id(), r.cursor(), r.limit());
    }

    /**
     * Get space properties in space
     * <p>
     * Returns all properties for the given space. Space properties are a key-value storage associated with a space. The limit parameter specifies the maximum number of results returned in a single response. Use the {@code link} response header to paginate through additional results.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) and 'View' permission for the space.
     * Authentication - Required Scopes: [read:space:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceId: The ID of the space for which space properties should be returned.</li>
     *   <li>key: The key of the space property to retrieve. This should be used when a user knows the key of their property, but needs to retrieve the id for use in other methods.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultSpaceProperty> getSpaceProperties(Consumer<GetSpacePropertiesOperationSpec> spec) {
        GetSpacePropertiesOperationSpec r = new GetSpacePropertiesOperationSpec(spec);
        return api.getSpaceProperties(r.spaceId(), r.key(), r.cursor(), r.limit());
    }

    /**
     * Get space property by id
     * <p>
     * Retrieve a space property by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) and 'View' permission for the space.
     * Authentication - Required Scopes: [read:space:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceId: The ID of the space the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be retrieved.</li>
     * </ul>
     */
    public CompletableFuture<SpaceProperty> getSpacePropertyById(Consumer<GetSpacePropertyByIdOperationSpec> spec) {
        GetSpacePropertyByIdOperationSpec r = new GetSpacePropertyByIdOperationSpec(spec);
        return api.getSpacePropertyById(r.spaceId(), r.propertyId());
    }

    /**
     * Get spaces
     * <p>
     * Returns all spaces. The results will be sorted by id ascending. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only spaces that the user has permission to view will be returned.
     * Authentication - Required Scopes: [read:space:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>ids: Filter the results to spaces based on their IDs. Multiple IDs can be specified as a comma-separated list.</li>
     *   <li>keys: Filter the results to spaces based on their keys. Multiple keys can be specified as a comma-separated list.</li>
     *   <li>type: Filter the results to spaces based on their type.</li>
     *   <li>status: Filter the results to spaces based on their status.</li>
     *   <li>labels: Filter the results to spaces based on their labels. Multiple labels can be specified as a comma-separated list.</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>descriptionFormat: The content format type to be returned in the {@code description} field of the response. If available, the representation will be available under a response field of the same name under the {@code description} field.</li>
     *   <li>includeIcon: If the icon for the space should be fetched or not.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of spaces per result to return. If more results exist, use the {@code Link} response header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultSpace> getSpaces(Consumer<GetSpacesOperationSpec> spec) {
        GetSpacesOperationSpec r = new GetSpacesOperationSpec(spec);
        return api.getSpaces(r.ids(), r.keys(), r.type(), r.status(), r.labels(), r.sort(), r.descriptionFormat(), r.includeIcon(), r.cursor(), r.limit());
    }

    /**
     * Get task by id
     * <p>
     * Returns a specific task.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the containing page or blog post and its corresponding space.
     * Authentication - Required Scopes: [read:task:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the task to be returned. If you don't know the task ID, use Get tasks and filter the results.</li>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     * </ul>
     */
    public CompletableFuture<Task> getTaskById(Consumer<GetTaskByIdOperationSpec> spec) {
        GetTaskByIdOperationSpec r = new GetTaskByIdOperationSpec(spec);
        return api.getTaskById(r.id(), r.bodyFormat());
    }

    /**
     * Get tasks
     * <p>
     * Returns all tasks. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only tasks that the user has permission to view will be returned.
     * Authentication - Required Scopes: [read:task:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>bodyFormat: The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.</li>
     *   <li>includeBlankTasks: Specifies whether to include blank tasks in the response. Defaults to {@code true}.</li>
     *   <li>status: Filters on the status of the task.</li>
     *   <li>taskId: Filters on task ID. Multiple IDs can be specified.</li>
     *   <li>spaceId: Filters on the space ID of the task. Multiple IDs can be specified.</li>
     *   <li>pageId: Filters on the page ID of the task. Multiple IDs can be specified. Note - page and blog post filters can be used in conjunction.</li>
     *   <li>blogpostId: Filters on the blog post ID of the task. Multiple IDs can be specified. Note - page and blog post filters can be used in conjunction.</li>
     *   <li>createdBy: Filters on the Account ID of the user who created this task. Multiple IDs can be specified.</li>
     *   <li>assignedTo: Filters on the Account ID of the user to whom this task is assigned. Multiple IDs can be specified.</li>
     *   <li>completedBy: Filters on the Account ID of the user who completed this task. Multiple IDs can be specified.</li>
     *   <li>createdAtFrom: Filters on start of date-time range of task based on creation date (inclusive). Input is epoch time in milliseconds.</li>
     *   <li>createdAtTo: Filters on end of date-time range of task based on creation date (inclusive). Input is epoch time in milliseconds.</li>
     *   <li>dueAtFrom: Filters on start of date-time range of task based on due date (inclusive). Input is epoch time in milliseconds.</li>
     *   <li>dueAtTo: Filters on end of date-time range of task based on due date (inclusive). Input is epoch time in milliseconds.</li>
     *   <li>completedAtFrom: Filters on start of date-time range of task based on completion date (inclusive). Input is epoch time in milliseconds.</li>
     *   <li>completedAtTo: Filters on end of date-time range of task based on completion date (inclusive). Input is epoch time in milliseconds.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of tasks per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultTask> getTasks(Consumer<GetTasksOperationSpec> spec) {
        GetTasksOperationSpec r = new GetTasksOperationSpec(spec);
        return api.getTasks(r.bodyFormat(), r.includeBlankTasks(), r.status(), r.taskId(), r.spaceId(), r.pageId(), r.blogpostId(), r.createdBy(), r.assignedTo(), r.completedBy(), r.createdAtFrom(), r.createdAtTo(), r.dueAtFrom(), r.dueAtTo(), r.completedAtFrom(), r.completedAtTo(), r.cursor(), r.limit());
    }

    /**
     * Get all ancestors of the whiteboard
     * <p>
     * Returns all ancestors for a given whiteboard by ID in top-to-bottom order (that is, the highest ancestor is the first item in the response payload). The number of results is limited by the {@code limit} parameter and additional results (if available) will be available by calling this endpoint with the ID of first ancestor in the response payload.
     * This endpoint returns minimal information about each ancestor. To fetch more details, use a related endpoint, such as [Get page by id](https://developer.atlassian.com/cloud/confluence/rest/v2/api-group-page/#api-pages-id-get).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Permission to view the whiteboard and its corresponding space
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the whiteboard.</li>
     *   <li>limit: Maximum number of items per result to return. If more results exist, call the endpoint with the highest ancestor's ID to fetch the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultAncestor> getWhiteboardAncestors(Consumer<GetWhiteboardAncestorsOperationSpec> spec) {
        GetWhiteboardAncestorsOperationSpec r = new GetWhiteboardAncestorsOperationSpec(spec);
        return api.getWhiteboardAncestors(r.id(), r.limit());
    }

    /**
     * Get whiteboard by id
     * <p>
     * Returns a specific whiteboard.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the whiteboard and its corresponding space.
     * Authentication - Required Scopes: [read:whiteboard:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the whiteboard to be returned</li>
     * </ul>
     */
    public CompletableFuture<WhiteboardSingle> getWhiteboardById(Consumer<GetWhiteboardByIdOperationSpec> spec) {
        GetWhiteboardByIdOperationSpec r = new GetWhiteboardByIdOperationSpec(spec);
        return api.getWhiteboardById(r.id());
    }

    /**
     * Get content properties for whiteboard
     * <p>
     * Retrieves Content Properties tied to a specified whiteboard.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the whiteboard.
     * Authentication - Required Scopes: [read:whiteboard:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the whiteboard for which content properties should be returned.</li>
     *   <li>key: Filters the response to return a specific content property with matching key (case sensitive).</li>
     *   <li>sort: Used to sort the result by a particular field.</li>
     *   <li>cursor: Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.</li>
     *   <li>limit: Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.</li>
     * </ul>
     */
    public CompletableFuture<MultiEntityResultContentProperty> getWhiteboardContentProperties(Consumer<GetWhiteboardContentPropertiesOperationSpec> spec) {
        GetWhiteboardContentPropertiesOperationSpec r = new GetWhiteboardContentPropertiesOperationSpec(spec);
        return api.getWhiteboardContentProperties(r.id(), r.key(), r.sort(), r.cursor(), r.limit());
    }

    /**
     * Get content property for whiteboard by id
     * <p>
     * Retrieves a specific Content Property by ID that is attached to a specified whiteboard.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the whiteboard.
     * Authentication - Required Scopes: [read:whiteboard:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>whiteboardId: The ID of the whiteboard for which content properties should be returned.</li>
     *   <li>propertyId: The ID of the content property being requested.</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> getWhiteboardContentPropertiesById(Consumer<GetWhiteboardContentPropertiesByIdOperationSpec> spec) {
        GetWhiteboardContentPropertiesByIdOperationSpec r = new GetWhiteboardContentPropertiesByIdOperationSpec(spec);
        return api.getWhiteboardContentPropertiesById(r.whiteboardId(), r.propertyId());
    }

    /**
     * Get permitted operations for a whiteboard
     * <p>
     * Returns the permitted operations on specific whiteboard.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the whiteboard and its corresponding space.
     * Authentication - Required Scopes: [read:whiteboard:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the whiteboard for which operations should be returned.</li>
     * </ul>
     */
    public CompletableFuture<PermittedOperationsResponse> getWhiteboardOperations(Consumer<GetWhiteboardOperationsOperationSpec> spec) {
        GetWhiteboardOperationsOperationSpec r = new GetWhiteboardOperationsOperationSpec(spec);
        return api.getWhiteboardOperations(r.id());
    }

    /**
     * Invite a list of emails to the site
     * <p>
     * Invite a list of emails to the site.
     * Ignores all invalid emails and no action is taken for the emails that already have access to the site.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>checkAccessByEmailRequest: </li>
     * </ul>
     */
    public CompletableFuture<Void> inviteByEmail(Consumer<InviteByEmailOperationSpec> spec) {
        InviteByEmailOperationSpec r = new InviteByEmailOperationSpec(spec);
        return api.inviteByEmail(r.checkAccessByEmailRequest());
    }

    /**
     * Update content property for attachment by id
     * <p>
     * Update a content property for attachment by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the attachment.
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>attachmentId: The ID of the attachment the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be updated.</li>
     *   <li>contentPropertyUpdateRequest: The content property to be updated.</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> updateAttachmentPropertyById(Consumer<UpdateAttachmentPropertyByIdOperationSpec> spec) {
        UpdateAttachmentPropertyByIdOperationSpec r = new UpdateAttachmentPropertyByIdOperationSpec(spec);
        return api.updateAttachmentPropertyById(r.attachmentId(), r.propertyId(), r.contentPropertyUpdateRequest());
    }

    /**
     * Update blog post
     * <p>
     * Update a blog post by id.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the blog post and its corresponding space. Permission to update blog posts in the space.
     * Authentication - Required Scopes: [write:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the blog post to be updated. If you don't know the blog post ID, use Get Blog Posts and filter the results.</li>
     *   <li>updateBlogPostRequest: </li>
     * </ul>
     */
    public CompletableFuture<BlogPostSingle> updateBlogPost(Consumer<UpdateBlogPostOperationSpec> spec) {
        UpdateBlogPostOperationSpec r = new UpdateBlogPostOperationSpec(spec);
        return api.updateBlogPost(r.id(), r.updateBlogPostRequest());
    }

    /**
     * Update content property for blog post by id
     * <p>
     * Update a content property for blog post by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the blog post.
     * Authentication - Required Scopes: [read:page:confluence, write:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>blogpostId: The ID of the blog post the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be updated.</li>
     *   <li>contentPropertyUpdateRequest: The content property to be updated.</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> updateBlogpostPropertyById(Consumer<UpdateBlogpostPropertyByIdOperationSpec> spec) {
        UpdateBlogpostPropertyByIdOperationSpec r = new UpdateBlogpostPropertyByIdOperationSpec(spec);
        return api.updateBlogpostPropertyById(r.blogpostId(), r.propertyId(), r.contentPropertyUpdateRequest());
    }

    /**
     * Update content property for comment by id
     * <p>
     * Update a content property for a comment by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the comment.
     * Authentication - Required Scopes: [read:comment:confluence, write:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>commentId: The ID of the comment the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be updated.</li>
     *   <li>contentPropertyUpdateRequest: The content property to be updated.</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> updateCommentPropertyById(Consumer<UpdateCommentPropertyByIdOperationSpec> spec) {
        UpdateCommentPropertyByIdOperationSpec r = new UpdateCommentPropertyByIdOperationSpec(spec);
        return api.updateCommentPropertyById(r.commentId(), r.propertyId(), r.contentPropertyUpdateRequest());
    }

    /**
     * Update custom content
     * <p>
     * Update a custom content by id.
     * {@code spaceId} is always required and maximum one of {@code pageId}, {@code blogPostId}, or {@code customContentId} is allowed in the request body. **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to update custom content in the space.
     * Authentication - Required Scopes: [write:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the custom content to be updated. If you don't know the custom content ID, use Get Custom Content by Type and filter the results.</li>
     *   <li>updateCustomContentRequest: </li>
     * </ul>
     */
    public CompletableFuture<CustomContentSingle> updateCustomContent(Consumer<UpdateCustomContentOperationSpec> spec) {
        UpdateCustomContentOperationSpec r = new UpdateCustomContentOperationSpec(spec);
        return api.updateCustomContent(r.id(), r.updateCustomContentRequest());
    }

    /**
     * Update content property for custom content by id
     * <p>
     * Update a content property for a piece of custom content by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the custom content.
     * Authentication - Required Scopes: [read:custom-content:confluence, write:custom-content:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>customContentId: The ID of the custom content the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be updated.</li>
     *   <li>contentPropertyUpdateRequest: The content property to be updated.</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> updateCustomContentPropertyById(Consumer<UpdateCustomContentPropertyByIdOperationSpec> spec) {
        UpdateCustomContentPropertyByIdOperationSpec r = new UpdateCustomContentPropertyByIdOperationSpec(spec);
        return api.updateCustomContentPropertyById(r.customContentId(), r.propertyId(), r.contentPropertyUpdateRequest());
    }

    /**
     * Update footer comment
     * <p>
     * Update a footer comment. This can be used to update the body text of a comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to create comments in the space.
     * Authentication - Required Scopes: [write:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>commentId: The ID of the comment to be retrieved.</li>
     *   <li>updateFooterCommentModel: The footer comment to be created</li>
     * </ul>
     */
    public CompletableFuture<FooterCommentModel> updateFooterComment(Consumer<UpdateFooterCommentOperationSpec> spec) {
        UpdateFooterCommentOperationSpec r = new UpdateFooterCommentOperationSpec(spec);
        return api.updateFooterComment(r.commentId(), r.updateFooterCommentModel());
    }

    /**
     * Update inline comment
     * <p>
     * Update an inline comment. This can be used to update the body text of a comment and/or to resolve the comment
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to create comments in the space.
     * Authentication - Required Scopes: [write:comment:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>commentId: The ID of the comment to be retrieved.</li>
     *   <li>updateInlineCommentModel: The inline comment to be updated</li>
     * </ul>
     */
    public CompletableFuture<InlineCommentModel> updateInlineComment(Consumer<UpdateInlineCommentOperationSpec> spec) {
        UpdateInlineCommentOperationSpec r = new UpdateInlineCommentOperationSpec(spec);
        return api.updateInlineComment(r.commentId(), r.updateInlineCommentModel());
    }

    /**
     * Update page
     * <p>
     * Update a page by id.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page and its corresponding space. Permission to update pages in the space.
     * Authentication - Required Scopes: [write:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the page to be updated. If you don't know the page ID, use Get Pages and filter the results.</li>
     *   <li>updatePageRequest: </li>
     * </ul>
     */
    public CompletableFuture<PageSingle> updatePage(Consumer<UpdatePageOperationSpec> spec) {
        UpdatePageOperationSpec r = new UpdatePageOperationSpec(spec);
        return api.updatePage(r.id(), r.updatePageRequest());
    }

    /**
     * Update content property for page by id
     * <p>
     * Update a content property for a page by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the page.
     * Authentication - Required Scopes: [read:page:confluence, write:page:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>pageId: The ID of the page the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be updated.</li>
     *   <li>contentPropertyUpdateRequest: The content property to be updated.</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> updatePagePropertyById(Consumer<UpdatePagePropertyByIdOperationSpec> spec) {
        UpdatePagePropertyByIdOperationSpec r = new UpdatePagePropertyByIdOperationSpec(spec);
        return api.updatePagePropertyById(r.pageId(), r.propertyId(), r.contentPropertyUpdateRequest());
    }

    /**
     * Update space property by id
     * <p>
     * Update a space property by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) and 'Admin' permission for the space.
     * Authentication - Required Scopes: [read:space:confluence, write:space:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>spaceId: The ID of the space the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be updated.</li>
     *   <li>spacePropertyUpdateRequest: The space property to be updated.</li>
     * </ul>
     */
    public CompletableFuture<SpaceProperty> updateSpacePropertyById(Consumer<UpdateSpacePropertyByIdOperationSpec> spec) {
        UpdateSpacePropertyByIdOperationSpec r = new UpdateSpacePropertyByIdOperationSpec(spec);
        return api.updateSpacePropertyById(r.spaceId(), r.propertyId(), r.spacePropertyUpdateRequest());
    }

    /**
     * Update task
     * <p>
     * Update a task by id.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the containing page or blog post and view its corresponding space.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the task to be updated. If you don't know the task ID, use Get tasks and filter the results.</li>
     *   <li>updateTaskRequest: </li>
     * </ul>
     */
    public CompletableFuture<Task> updateTask(Consumer<UpdateTaskOperationSpec> spec) {
        UpdateTaskOperationSpec r = new UpdateTaskOperationSpec(spec);
        return api.updateTask(r.id(), r.updateTaskRequest());
    }

    /**
     * Update content property for whiteboard by id
     * <p>
     * Update a content property for a whiteboard by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the whiteboard.
     * Authentication - Required Scopes: [read:whiteboard:confluence, write:whiteboard:confluence]
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>whiteboardId: The ID of the whiteboard the property belongs to.</li>
     *   <li>propertyId: The ID of the property to be updated.</li>
     *   <li>contentPropertyUpdateRequest: The content property to be updated.</li>
     * </ul>
     */
    public CompletableFuture<ContentProperty> updateWhiteboardPropertyById(Consumer<UpdateWhiteboardPropertyByIdOperationSpec> spec) {
        UpdateWhiteboardPropertyByIdOperationSpec r = new UpdateWhiteboardPropertyByIdOperationSpec(spec);
        return api.updateWhiteboardPropertyById(r.whiteboardId(), r.propertyId(), r.contentPropertyUpdateRequest());
    }

}
