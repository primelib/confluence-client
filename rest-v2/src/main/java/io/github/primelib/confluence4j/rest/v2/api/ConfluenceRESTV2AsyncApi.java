package io.github.primelib.confluence4j.rest.v2.api;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.Attachment;
import io.github.primelib.confluence4j.rest.v2.model.AttachmentSortOrder;
import io.github.primelib.confluence4j.rest.v2.model.BlogPostSingle;
import io.github.primelib.confluence4j.rest.v2.model.BlogPostSortOrder;
import io.github.primelib.confluence4j.rest.v2.model.CheckAccessByEmail200Response;
import io.github.primelib.confluence4j.rest.v2.model.CheckAccessByEmailRequest;
import io.github.primelib.confluence4j.rest.v2.model.ChildCustomContentSortOrder;
import io.github.primelib.confluence4j.rest.v2.model.ChildPageSortOrder;
import io.github.primelib.confluence4j.rest.v2.model.CommentSortOrder;
import io.github.primelib.confluence4j.rest.v2.model.ContentIdToContentTypeResponse;
import io.github.primelib.confluence4j.rest.v2.model.ContentProperty;
import io.github.primelib.confluence4j.rest.v2.model.ContentPropertyCreateRequest;
import io.github.primelib.confluence4j.rest.v2.model.ContentPropertySortOrder;
import io.github.primelib.confluence4j.rest.v2.model.ContentPropertyUpdateRequest;
import io.github.primelib.confluence4j.rest.v2.model.ConvertContentIdsToContentTypesRequest;
import io.github.primelib.confluence4j.rest.v2.model.CreateBlogPostRequest;
import io.github.primelib.confluence4j.rest.v2.model.CreateCustomContentRequest;
import io.github.primelib.confluence4j.rest.v2.model.CreateFooterCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.CreateInlineCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.CreatePageRequest;
import io.github.primelib.confluence4j.rest.v2.model.CustomContentBodyRepresentation;
import io.github.primelib.confluence4j.rest.v2.model.CustomContentBodyRepresentationSingle;
import io.github.primelib.confluence4j.rest.v2.model.CustomContentSingle;
import io.github.primelib.confluence4j.rest.v2.model.CustomContentSortOrder;
import io.github.primelib.confluence4j.rest.v2.model.DetailedVersion;
import io.github.primelib.confluence4j.rest.v2.model.FooterCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.InlineCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.LabelSortOrder;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultAncestor;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultAttachment;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultAttachment1;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultBlogPost;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultBlogPostCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultBlogPostInlineCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultChildCustomContent;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultChildPage;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultChildrenCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultContentProperty;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultCustomContent;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultFooterCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultInlineCommentChildrenModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultInlineCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.MultiEntityResultLabel;
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
import io.github.primelib.confluence4j.rest.v2.model.PageSortOrder;
import io.github.primelib.confluence4j.rest.v2.model.PermittedOperationsResponse;
import io.github.primelib.confluence4j.rest.v2.model.PrimaryBodyRepresentation;
import io.github.primelib.confluence4j.rest.v2.model.PrimaryBodyRepresentationSingle;
import io.github.primelib.confluence4j.rest.v2.model.Space;
import io.github.primelib.confluence4j.rest.v2.model.SpaceDescriptionBodyRepresentation;
import io.github.primelib.confluence4j.rest.v2.model.SpaceProperty;
import io.github.primelib.confluence4j.rest.v2.model.SpacePropertyCreateRequest;
import io.github.primelib.confluence4j.rest.v2.model.SpacePropertyUpdateRequest;
import io.github.primelib.confluence4j.rest.v2.model.SpaceSortOrder;
import io.github.primelib.confluence4j.rest.v2.model.Task;
import io.github.primelib.confluence4j.rest.v2.model.UpdateBlogPostRequest;
import io.github.primelib.confluence4j.rest.v2.model.UpdateCustomContentRequest;
import io.github.primelib.confluence4j.rest.v2.model.UpdateFooterCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.UpdateInlineCommentModel;
import io.github.primelib.confluence4j.rest.v2.model.UpdatePageRequest;
import io.github.primelib.confluence4j.rest.v2.model.UpdateTaskRequest;
import io.github.primelib.confluence4j.rest.v2.model.VersionSortOrder;
import java.util.concurrent.CompletableFuture;
import feign.RequestLine;
import feign.Param;
import feign.Headers;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public interface ConfluenceRESTV2AsyncApi {

    /**
     * Check site access for a list of emails
     * <p>
     * Returns the list of emails from the input list that do not have access to site.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * @param checkAccessByEmailRequest  (required)
     */
    @RequestLine("POST /user/access/check-access-by-email")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<CheckAccessByEmail200Response> checkAccessByEmail(@NotNull CheckAccessByEmailRequest checkAccessByEmailRequest);

    /**
     * Convert content ids to content types
     * <p>
     * Converts a list of content ids into their associated content types. This is useful for users migrating from v1 to v2 who may have stored just content ids without their associated type. This will return types as they should be used in v2. Notably, this will return {@code inline-comment} for inline comments and {@code footer-comment} for footer comments, which is distinct from them both being represented by {@code comment} in v1.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the requested content. Any content that the user does not have permission to view or does not exist will map to {@code null} in the response.
     *
     * @param convertContentIdsToContentTypesRequest  (required)
     */
    @RequestLine("POST /content/convert-ids-to-types")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentIdToContentTypeResponse> convertContentIdsToContentTypes(@NotNull ConvertContentIdsToContentTypesRequest convertContentIdsToContentTypesRequest);

    /**
     * Create content property for attachment
     * <p>
     * Creates a new content property for an attachment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the attachment.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param attachmentId         The ID of the attachment to create a property for. (required)
     * @param contentPropertyCreateRequest The content property to be created (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("POST /attachments/{attachmentId}/properties?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> createAttachmentProperty(@Param("attachmentId") @NotNull String attachmentId, @NotNull ContentPropertyCreateRequest contentPropertyCreateRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Create blog post
     * <p>
     * Creates a new blog post in the space specified by the spaceId.
     * By default this will create the blog post as a non-draft, unless the status is specified as draft. If creating a non-draft, the title must not be empty.
     * Currently only supports the storage representation specified in the body.representation enums below
     *
     * Authentication - Required Scopes: [write:page:confluence]
     * @param createBlogPostRequest  (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     * @param _private             The blog post will be private. Only the user who creates this blog post will have permission to view and edit one. (optional, defaults to false)
     */
    @RequestLine("POST /blogposts?serialize-ids-as-strings={serializeIdsAsStrings}&private={_private}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<BlogPostSingle> createBlogPost(@NotNull CreateBlogPostRequest createBlogPostRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings, @Param("_private") @Nullable Boolean _private);

    /**
     * Create content property for blog post
     * <p>
     * Creates a new property for a blogpost.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the blog post.
     *
     * Authentication - Required Scopes: [read:page:confluence, write:page:confluence]
     * @param blogpostId           The ID of the blog post to create a property for. (required)
     * @param contentPropertyCreateRequest The content property to be created (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("POST /blogposts/{blogpostId}/properties?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> createBlogpostProperty(@Param("blogpostId") @NotNull Long blogpostId, @NotNull ContentPropertyCreateRequest contentPropertyCreateRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Create content property for comment
     * <p>
     * Creates a new content property for a comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the comment.
     *
     * Authentication - Required Scopes: [read:comment:confluence, write:comment:confluence]
     * @param commentId            The ID of the comment to create a property for. (required)
     * @param contentPropertyCreateRequest The content property to be created (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("POST /comments/{commentId}/properties?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> createCommentProperty(@Param("commentId") @NotNull Long commentId, @NotNull ContentPropertyCreateRequest contentPropertyCreateRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Create custom content
     * <p>
     * Creates a new custom content in the given space, page, blogpost or other custom content.
     * Only one of {@code spaceId}, {@code pageId}, {@code blogPostId}, or {@code customContentId} is required in the request body. **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to create custom content in the space.
     *
     * Authentication - Required Scopes: [write:custom-content:confluence]
     * @param createCustomContentRequest  (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("POST /custom-content?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<CustomContentSingle> createCustomContent(@NotNull CreateCustomContentRequest createCustomContentRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Create content property for custom content
     * <p>
     * Creates a new content property for a piece of custom content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the custom content.
     *
     * Authentication - Required Scopes: [read:custom-content:confluence, write:custom-content:confluence]
     * @param customContentId      The ID of the custom content to create a property for. (required)
     * @param contentPropertyCreateRequest The content property to be created (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("POST /custom-content/{customContentId}/properties?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> createCustomContentProperty(@Param("customContentId") @NotNull Long customContentId, @NotNull ContentPropertyCreateRequest contentPropertyCreateRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Create footer comment
     * <p>
     * Create a footer comment. This can be at the top level (specifying pageId or blogPostId in the request body) or as a reply (specifying parentCommentId in the request body).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to create comments in the space.
     *
     * Authentication - Required Scopes: [write:comment:confluence]
     * @param createFooterCommentModel The footer comment to be created (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("POST /footer-comments?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<FooterCommentModel> createFooterComment(@NotNull CreateFooterCommentModel createFooterCommentModel, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Create inline comment
     * <p>
     * Create an inline comment. This can be at the top level (specifying pageId or blogPostId in the request body) or as a reply (specifying parentCommentId in the request body). Note the inlineCommentProperties object in the request body is used to select the text the inline comment should be tied to. This is what determines the text
     * highlighting when viewing a page in Confluence.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to create comments in the space.
     *
     * Authentication - Required Scopes: [write:comment:confluence]
     * @param createInlineCommentModel The inline comment to be created (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("POST /inline-comments?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<InlineCommentModel> createInlineComment(@NotNull CreateInlineCommentModel createInlineCommentModel, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Create page
     * <p>
     * Creates a page in the space.
     * Pages are created as published by default unless specified as a draft in the status field. If creating a published page, the title must be specified.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the corresponding space. Permission to create a page in the space.
     *
     * Authentication - Required Scopes: [write:page:confluence]
     * @param createPageRequest     (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     * @param embedded             Tag the content as embedded and content will be created in NCS. (optional, defaults to false)
     * @param _private             The page will be private. Only the user who creates this page will have permission to view and edit one. (optional, defaults to false)
     */
    @RequestLine("POST /pages?serialize-ids-as-strings={serializeIdsAsStrings}&embedded={embedded}&private={_private}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<PageSingle> createPage(@NotNull CreatePageRequest createPageRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings, @Param("embedded") @Nullable Boolean embedded, @Param("_private") @Nullable Boolean _private);

    /**
     * Create content property for page
     * <p>
     * Creates a new content property for a page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to update the page.
     *
     * Authentication - Required Scopes: [read:page:confluence, write:page:confluence]
     * @param pageId               The ID of the page to create a property for. (required)
     * @param contentPropertyCreateRequest The content property to be created (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("POST /pages/{pageId}/properties?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> createPageProperty(@Param("pageId") @NotNull Long pageId, @NotNull ContentPropertyCreateRequest contentPropertyCreateRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Create space property in space
     * <p>
     * Creates a new space property.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) and 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [read:space:confluence, write:space:confluence]
     * @param spaceId              The ID of the space for which space properties should be returned. (required)
     * @param spacePropertyCreateRequest The space property to be created (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("POST /spaces/{spaceId}/properties?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<SpaceProperty> createSpaceProperty(@Param("spaceId") @NotNull Long spaceId, @NotNull SpacePropertyCreateRequest spacePropertyCreateRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Delete attachment
     * <p>
     * Delete an attachment by id.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the container of the attachment. Permission to delete attachments in the space.
     *
     * @param id                   The ID of the attachment to be deleted. (required)
     */
    @RequestLine("DELETE /attachments/{id}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteAttachment(@Param("id") @NotNull Long id);

    /**
     * Delete content property for attachment by id
     * <p>
     * Deletes a content property for an attachment by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to attachment the page.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param attachmentId         The ID of the attachment the property belongs to. (required)
     * @param propertyId           The ID of the property to be deleted. (required)
     */
    @RequestLine("DELETE /attachments/{attachmentId}/properties/{propertyId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteAttachmentPropertyById(@Param("attachmentId") @NotNull String attachmentId, @Param("propertyId") @NotNull Long propertyId);

    /**
     * Delete blog post
     * <p>
     * Delete a blog post by id.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the blog post and its corresponding space. Permission to delete blog posts in the space.
     *
     * Authentication - Required Scopes: [delete:page:confluence]
     * @param id                   The ID of the blog post to be deleted. (required)
     */
    @RequestLine("DELETE /blogposts/{id}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteBlogPost(@Param("id") @NotNull Long id);

    /**
     * Delete content property for blogpost by id
     * <p>
     * Deletes a content property for a blogpost by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the blog post.
     *
     * Authentication - Required Scopes: [read:page:confluence, write:page:confluence]
     * @param blogpostId           The ID of the blog post the property belongs to. (required)
     * @param propertyId           The ID of the property to be deleted. (required)
     */
    @RequestLine("DELETE /blogposts/{blogpostId}/properties/{propertyId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteBlogpostPropertyById(@Param("blogpostId") @NotNull Long blogpostId, @Param("propertyId") @NotNull Long propertyId);

    /**
     * Delete content property for comment by id
     * <p>
     * Deletes a content property for a comment by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the comment.
     *
     * Authentication - Required Scopes: [read:comment:confluence, write:comment:confluence]
     * @param commentId            The ID of the comment the property belongs to. (required)
     * @param propertyId           The ID of the property to be deleted. (required)
     */
    @RequestLine("DELETE /comments/{commentId}/properties/{propertyId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteCommentPropertyById(@Param("commentId") @NotNull Long commentId, @Param("propertyId") @NotNull Long propertyId);

    /**
     * Delete custom content
     * <p>
     * Delete a custom content by id.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to delete custom content in the space.
     *
     * Authentication - Required Scopes: [delete:custom-content:confluence]
     * @param id                   The ID of the custom content to be deleted. (required)
     */
    @RequestLine("DELETE /custom-content/{id}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteCustomContent(@Param("id") @NotNull Long id);

    /**
     * Delete content property for custom content by id
     * <p>
     * Deletes a content property for a piece of custom content by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the custom content.
     *
     * Authentication - Required Scopes: [read:custom-content:confluence, write:custom-content:confluence]
     * @param customContentId      The ID of the custom content the property belongs to. (required)
     * @param propertyId           The ID of the property to be deleted. (required)
     */
    @RequestLine("DELETE /custom-content/{customContentId}/properties/{propertyId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteCustomContentPropertyById(@Param("customContentId") @NotNull Long customContentId, @Param("propertyId") @NotNull Long propertyId);

    /**
     * Delete footer comment
     * <p>
     * Deletes a footer comment. This is a permanent deletion and cannot be reverted.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to delete comments in the space.
     *
     * Authentication - Required Scopes: [delete:comment:confluence]
     * @param commentId            The ID of the comment to be retrieved. (required)
     */
    @RequestLine("DELETE /footer-comments/{commentId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteFooterComment(@Param("commentId") @NotNull Long commentId);

    /**
     * Delete inline comment
     * <p>
     * Deletes an inline comment. This is a permanent deletion and cannot be reverted.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to delete comments in the space.
     *
     * Authentication - Required Scopes: [delete:comment:confluence]
     * @param commentId            The ID of the comment to be deleted. (required)
     */
    @RequestLine("DELETE /inline-comments/{commentId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteInlineComment(@Param("commentId") @NotNull Long commentId);

    /**
     * Delete page
     * <p>
     * Delete a page by id.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page and its corresponding space. Permission to delete pages in the space.
     *
     * Authentication - Required Scopes: [delete:page:confluence]
     * @param id                   The ID of the page to be deleted. (required)
     */
    @RequestLine("DELETE /pages/{id}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deletePage(@Param("id") @NotNull Long id);

    /**
     * Delete content property for page by id
     * <p>
     * Deletes a content property for a page by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the page.
     *
     * Authentication - Required Scopes: [read:page:confluence, write:page:confluence]
     * @param pageId               The ID of the page the property belongs to. (required)
     * @param propertyId           The ID of the property to be deleted. (required)
     */
    @RequestLine("DELETE /pages/{pageId}/properties/{propertyId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deletePagePropertyById(@Param("pageId") @NotNull Long pageId, @Param("propertyId") @NotNull Long propertyId);

    /**
     * Delete space property by id
     * <p>
     * Deletes a space property by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) and 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [read:space:confluence, write:space:confluence]
     * @param spaceId              The ID of the space the property belongs to. (required)
     * @param propertyId           The ID of the property to be deleted. (required)
     */
    @RequestLine("DELETE /spaces/{spaceId}/properties/{propertyId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteSpacePropertyById(@Param("spaceId") @NotNull Long spaceId, @Param("propertyId") @NotNull Long propertyId);

    /**
     * Get attachment by id
     * <p>
     * Returns a specific attachment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the attachment's container.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param id                   The ID of the attachment to be returned. If you don't know the attachment's ID, use Get attachments for page/blogpost/custom content. (required)
     * @param version              Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details. (optional)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /attachments/{id}?version={version}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Attachment> getAttachmentById(@Param("id") @NotNull String id, @Param("version") @Nullable Integer version, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get content properties for attachment
     * <p>
     * Retrieves all Content Properties tied to a specified attachment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the attachment.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param attachmentId         The ID of the attachment for which content properties should be returned. (required)
     * @param key                  Filters the response to return a specific content property with matching key (case sensitive). (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /attachments/{attachmentId}/properties?key={key}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultContentProperty> getAttachmentContentProperties(@Param("attachmentId") @NotNull String attachmentId, @Param("key") @Nullable String key, @Param("sort") @Nullable ContentPropertySortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get content property for attachment by id
     * <p>
     * Retrieves a specific Content Property by ID that is attached to a specified attachment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the attachment.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param attachmentId         The ID of the attachment for which content properties should be returned. (required)
     * @param propertyId           The ID of the content property to be returned (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /attachments/{attachmentId}/properties/{propertyId}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> getAttachmentContentPropertiesById(@Param("attachmentId") @NotNull String attachmentId, @Param("propertyId") @NotNull Long propertyId, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get labels for attachment
     * <p>
     * Returns the labels of specific attachment. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the parent content of the attachment and its corresponding space.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param id                   The ID of the attachment for which labels should be returned. (required)
     * @param prefix               Filter the results to labels based on their prefix. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of labels per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /attachments/{id}/labels?prefix={prefix}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultLabel> getAttachmentLabels(@Param("id") @NotNull Long id, @Param("prefix") @Nullable String prefix, @Param("sort") @Nullable List<LabelSortOrder> sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get permitted operations for attachment
     * <p>
     * Returns the permitted operations on specific attachment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the parent content of the attachment and its corresponding space.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param id                   The ID of the attachment for which operations should be returned. (required)
     */
    @RequestLine("GET /attachments/{id}/operations")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<PermittedOperationsResponse> getAttachmentOperations(@Param("id") @NotNull Long id);

    /**
     * Get version details for attachment version
     * <p>
     * Retrieves version details for the specified attachment and version number.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the attachment.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param attachmentId         The ID of the attachment for which version details should be returned. (required)
     * @param versionNumber        The version number of the attachment to be returned. (required)
     */
    @RequestLine("GET /attachments/{attachmentId}/versions/{versionNumber}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<DetailedVersion> getAttachmentVersionDetails(@Param("attachmentId") @NotNull String attachmentId, @Param("versionNumber") @NotNull Long versionNumber);

    /**
     * Get attachment versions
     * <p>
     * Returns the versions of specific attachment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the attachment and its corresponding space.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param id                   The ID of the attachment to be queried for its versions. If you don't know the attachment ID, use Get attachments and filter the results. (required)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of versions per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param sort                 Used to sort the result by a particular field. (optional)
     */
    @RequestLine("GET /attachments/{id}/versions?cursor={cursor}&limit={limit}&sort={sort}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultVersion> getAttachmentVersions(@Param("id") @NotNull String id, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("sort") @Nullable VersionSortOrder sort);

    /**
     * Get attachments
     * <p>
     * Returns all attachments. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the container of the attachment.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param status               Filter the results to attachments based on their status. By default, {@code current} and {@code archived} are used. (optional)
     * @param mediaType            Filters on the mediaType of attachments. Only one may be specified. (optional)
     * @param filename             Filters on the file-name of attachments. Only one may be specified. (optional)
     * @param limit                Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 50)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /attachments?sort={sort}&cursor={cursor}&status={status}&mediaType={mediaType}&filename={filename}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultAttachment> getAttachments(@Param("sort") @Nullable AttachmentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("status") @Nullable List<String> status, @Param("mediaType") @Nullable String mediaType, @Param("filename") @Nullable String filename, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get blog post by id
     * <p>
     * Returns a specific blog post.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the blog post and its corresponding space.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the blog post to be returned. If you don't know the blog post ID, use Get blog posts and filter the results. (required)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param getDraft             Retrieve the draft version of this blog post. (optional, defaults to false)
     * @param version              Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details. (optional)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /blogposts/{id}?body-format={bodyFormat}&get-draft={getDraft}&version={version}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<BlogPostSingle> getBlogPostById(@Param("id") @NotNull Long id, @Param("bodyFormat") @Nullable PrimaryBodyRepresentationSingle bodyFormat, @Param("getDraft") @Nullable Boolean getDraft, @Param("version") @Nullable Integer version, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get footer comments for blog post
     * <p>
     * Returns the root footer comments of specific blog post. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the blog post and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the blog post for which footer comments should be returned. (required)
     * @param bodyFormat           The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of footer comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /blogposts/{id}/footer-comments?body-format={bodyFormat}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultBlogPostCommentModel> getBlogPostFooterComments(@Param("id") @NotNull Long id, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("sort") @Nullable CommentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get inline comments for blog post
     * <p>
     * Returns the root inline comments of specific blog post. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the blog post and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the blog post for which inline comments should be returned. (required)
     * @param bodyFormat           The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of inline comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /blogposts/{id}/inline-comments?body-format={bodyFormat}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultBlogPostInlineCommentModel> getBlogPostInlineComments(@Param("id") @NotNull Long id, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("sort") @Nullable CommentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get labels for blog post
     * <p>
     * Returns the labels of specific blog post. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the blog post and its corresponding space.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the blog post for which labels should be returned. (required)
     * @param prefix               Filter the results to labels based on their prefix. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of labels per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /blogposts/{id}/labels?prefix={prefix}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultLabel> getBlogPostLabels(@Param("id") @NotNull Long id, @Param("prefix") @Nullable String prefix, @Param("sort") @Nullable List<LabelSortOrder> sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get like count for blog post
     * <p>
     * Returns the count of likes of specific blog post.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the blog post and its corresponding space.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the blog post for which like count should be returned. (required)
     */
    @RequestLine("GET /blogposts/{id}/likes/count")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Integer> getBlogPostLikeCount(@Param("id") @NotNull Long id);

    /**
     * Get account IDs of likes for blog post
     * <p>
     * Returns the account IDs of likes of specific blog post.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the blog post and its corresponding space.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the blog post for which account IDs should be returned. (required)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of account IDs per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     */
    @RequestLine("GET /blogposts/{id}/likes/users?cursor={cursor}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultString> getBlogPostLikeUsers(@Param("id") @NotNull Long id, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit);

    /**
     * Get permitted operations for blog post
     * <p>
     * Returns the permitted operations on specific blog post.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the parent content of the blog post and its corresponding space.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the blog post for which operations should be returned. (required)
     */
    @RequestLine("GET /blogposts/{id}/operations")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<PermittedOperationsResponse> getBlogPostOperations(@Param("id") @NotNull Long id);

    /**
     * Get version details for blog post version
     * <p>
     * Retrieves version details for the specified blog post and version number.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the blog post.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param blogpostId           The ID of the blog post for which version details should be returned. (required)
     * @param versionNumber        The version number of the blog post to be returned. (required)
     */
    @RequestLine("GET /blogposts/{blogpostId}/versions/{versionNumber}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<DetailedVersion> getBlogPostVersionDetails(@Param("blogpostId") @NotNull Long blogpostId, @Param("versionNumber") @NotNull Long versionNumber);

    /**
     * Get blog post versions
     * <p>
     * Returns the versions of specific blog post.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the blog post and its corresponding space.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the blog post to be queried for its versions. If you don't know the blog post ID, use Get blog posts and filter the results. (required)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of versions per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param sort                 Used to sort the result by a particular field. (optional)
     */
    @RequestLine("GET /blogposts/{id}/versions?body-format={bodyFormat}&cursor={cursor}&limit={limit}&sort={sort}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultVersion1> getBlogPostVersions(@Param("id") @NotNull Long id, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("sort") @Nullable VersionSortOrder sort);

    /**
     * Get blog posts
     * <p>
     * Returns all blog posts. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only blog posts that the user has permission to view will be returned.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   Filter the results based on blog post ids. Multiple blog post ids can be specified as a comma-separated list. (optional)
     * @param spaceId              Filter the results based on space ids. Multiple space ids can be specified as a comma-separated list. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param status               Filter the results to blog posts based on their status. By default, {@code current} is used. (optional)
     * @param title                Filter the results to blog posts based on their title. (optional)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of blog posts per result to return. If more results exist, use the {@code Link} response header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /blogposts?id={id}&space-id={spaceId}&sort={sort}&status={status}&title={title}&body-format={bodyFormat}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultBlogPost> getBlogPosts(@Param("id") @Nullable List<Long> id, @Param("spaceId") @Nullable List<Long> spaceId, @Param("sort") @Nullable BlogPostSortOrder sort, @Param("status") @Nullable List<String> status, @Param("title") @Nullable String title, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get blog posts in space
     * <p>
     * Returns all blog posts in a space. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) and view the space. Only blog posts that the user has permission to view will be returned.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the space for which blog posts should be returned. (required)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param status               Filter the results to blog posts based on their status. By default, {@code current} is used. (optional)
     * @param title                Filter the results to blog posts based on their title. (optional)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of blog posts per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /spaces/{id}/blogposts?sort={sort}&status={status}&title={title}&body-format={bodyFormat}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultBlogPost> getBlogPostsInSpace(@Param("id") @NotNull Long id, @Param("sort") @Nullable BlogPostSortOrder sort, @Param("status") @Nullable List<String> status, @Param("title") @Nullable String title, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get attachments for blog post
     * <p>
     * Returns the attachments of specific blog post. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the blog post and its corresponding space.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param id                   The ID of the blog post for which attachments should be returned. (required)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param status               Filter the results to attachments based on their status. By default, {@code current} and {@code archived} are used. (optional)
     * @param mediaType            Filters on the mediaType of attachments. Only one may be specified. (optional)
     * @param filename             Filters on the file-name of attachments. Only one may be specified. (optional)
     * @param limit                Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 50)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /blogposts/{id}/attachments?sort={sort}&cursor={cursor}&status={status}&mediaType={mediaType}&filename={filename}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultAttachment> getBlogpostAttachments(@Param("id") @NotNull Long id, @Param("sort") @Nullable AttachmentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("status") @Nullable List<String> status, @Param("mediaType") @Nullable String mediaType, @Param("filename") @Nullable String filename, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get content properties for blog post
     * <p>
     * Retrieves all Content Properties tied to a specified blog post.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the blog post.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param blogpostId           The ID of the blog post for which content properties should be returned. (required)
     * @param key                  Filters the response to return a specific content property with matching key (case sensitive). (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /blogposts/{blogpostId}/properties?key={key}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultContentProperty> getBlogpostContentProperties(@Param("blogpostId") @NotNull Long blogpostId, @Param("key") @Nullable String key, @Param("sort") @Nullable ContentPropertySortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get content property for blog post by id
     * <p>
     * Retrieves a specific Content Property by ID that is attached to a specified blog post.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the blog post.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param blogpostId           The ID of the blog post for which content properties should be returned. (required)
     * @param propertyId           The ID of the property being requested (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /blogposts/{blogpostId}/properties/{propertyId}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> getBlogpostContentPropertiesById(@Param("blogpostId") @NotNull Long blogpostId, @Param("propertyId") @NotNull Long propertyId, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get child custom content
     * <p>
     * Returns all child custom content for given custom content id. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only custom content that the user has permission to view will be returned.
     *
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param id                   The ID of the parent custom content. If you don't know the custom content ID, use Get custom-content and filter the results. (required)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /custom-content/{id}/children?cursor={cursor}&limit={limit}&sort={sort}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultChildCustomContent> getChildCustomContent(@Param("id") @NotNull Long id, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("sort") @Nullable List<ChildCustomContentSortOrder> sort, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get child pages
     * <p>
     * Returns all child pages for given page id. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only pages that the user has permission to view will be returned.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the parent page. If you don't know the page ID, use Get pages and filter the results. (required)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /pages/{id}/children?cursor={cursor}&limit={limit}&sort={sort}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultChildPage> getChildPages(@Param("id") @NotNull Long id, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("sort") @Nullable List<ChildPageSortOrder> sort, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get content properties for comment
     * <p>
     * Retrieves Content Properties attached to a specified comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the comment.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param commentId            The ID of the comment for which content properties should be returned. (required)
     * @param key                  Filters the response to return a specific content property with matching key (case sensitive). (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /comments/{commentId}/properties?key={key}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultContentProperty> getCommentContentProperties(@Param("commentId") @NotNull Long commentId, @Param("key") @Nullable String key, @Param("sort") @Nullable ContentPropertySortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get content property for comment by id
     * <p>
     * Retrieves a specific Content Property by ID that is attached to a specified comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the comment.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param commentId            The ID of the comment for which content properties should be returned. (required)
     * @param propertyId           The ID of the content property being requested. (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /comments/{commentId}/properties/{propertyId}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> getCommentContentPropertiesById(@Param("commentId") @NotNull Long commentId, @Param("propertyId") @NotNull Long propertyId, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get attachments for custom content
     * <p>
     * Returns the attachments of specific custom content. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the custom content and its corresponding space.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param id                   The ID of the custom content for which attachments should be returned. (required)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param status               Filter the results to attachments based on their status. By default, {@code current} and {@code archived} are used. (optional)
     * @param mediaType            Filters on the mediaType of attachments. Only one may be specified. (optional)
     * @param filename             Filters on the file-name of attachments. Only one may be specified. (optional)
     * @param limit                Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 50)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /custom-content/{id}/attachments?sort={sort}&cursor={cursor}&status={status}&mediaType={mediaType}&filename={filename}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultAttachment> getCustomContentAttachments(@Param("id") @NotNull Long id, @Param("sort") @Nullable AttachmentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("status") @Nullable List<String> status, @Param("mediaType") @Nullable String mediaType, @Param("filename") @Nullable String filename, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get custom content by id
     * <p>
     * Returns a specific piece of custom content.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content, the container of the custom content, and the corresponding space (if different from the container).
     *
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param id                   The ID of the custom content to be returned. If you don't know the custom content ID, use Get Custom Content by Type and filter the results. (required)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned. (optional)
     * @param version              Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details. (optional)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /custom-content/{id}?body-format={bodyFormat}&version={version}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<CustomContentSingle> getCustomContentById(@Param("id") @NotNull Long id, @Param("bodyFormat") @Nullable CustomContentBodyRepresentationSingle bodyFormat, @Param("version") @Nullable Integer version, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get custom content by type
     * <p>
     * Returns all custom content for a given type. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content, the container of the custom content, and the corresponding space (if different from the container).
     *
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param type                 The type of custom content being requested. See: https://developer.atlassian.com/cloud/confluence/custom-content/ for additional details on custom content. (required)
     * @param id                   Filter the results based on custom content ids. Multiple custom content ids can be specified as a comma-separated list. (optional)
     * @param spaceId              Filter the results based on space ids. Multiple space ids can be specified as a comma-separated list. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned. (optional)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /custom-content?type={type}&id={id}&space-id={spaceId}&sort={sort}&cursor={cursor}&limit={limit}&body-format={bodyFormat}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultCustomContent> getCustomContentByType(@Param("type") @NotNull String type, @Param("id") @Nullable List<Long> id, @Param("spaceId") @Nullable List<Long> spaceId, @Param("sort") @Nullable CustomContentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("bodyFormat") @Nullable CustomContentBodyRepresentation bodyFormat, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get custom content by type in blog post
     * <p>
     * Returns all custom content for a given type within a given blogpost. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content, the container of the custom content (blog post), and the corresponding space.
     *
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param id                   The ID of the blog post for which custom content should be returned. (required)
     * @param type                 The type of custom content being requested. See: https://developer.atlassian.com/cloud/confluence/custom-content/ for additional details on custom content. (required)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned. (optional)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /blogposts/{id}/custom-content?type={type}&sort={sort}&cursor={cursor}&limit={limit}&body-format={bodyFormat}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultCustomContent> getCustomContentByTypeInBlogPost(@Param("id") @NotNull Long id, @Param("type") @NotNull String type, @Param("sort") @Nullable CustomContentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("bodyFormat") @Nullable CustomContentBodyRepresentation bodyFormat, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get custom content by type in page
     * <p>
     * Returns all custom content for a given type within a given page. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content, the container of the custom content (page), and the corresponding space.
     *
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param id                   The ID of the page for which custom content should be returned. (required)
     * @param type                 The type of custom content being requested. See: https://developer.atlassian.com/cloud/confluence/custom-content/ for additional details on custom content. (required)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned. (optional)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /pages/{id}/custom-content?type={type}&sort={sort}&cursor={cursor}&limit={limit}&body-format={bodyFormat}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultCustomContent> getCustomContentByTypeInPage(@Param("id") @NotNull Long id, @Param("type") @NotNull String type, @Param("sort") @Nullable CustomContentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("bodyFormat") @Nullable CustomContentBodyRepresentation bodyFormat, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get custom content by type in space
     * <p>
     * Returns all custom content for a given type within a given space. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content and the corresponding space.
     *
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param id                   The ID of the space for which custom content should be returned. (required)
     * @param type                 The type of custom content being requested. See: https://developer.atlassian.com/cloud/confluence/custom-content/ for additional details on custom content. (required)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned. (optional)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /spaces/{id}/custom-content?type={type}&cursor={cursor}&limit={limit}&body-format={bodyFormat}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultCustomContent> getCustomContentByTypeInSpace(@Param("id") @NotNull Long id, @Param("type") @NotNull String type, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("bodyFormat") @Nullable CustomContentBodyRepresentation bodyFormat, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get content properties for custom content
     * <p>
     * Retrieves Content Properties tied to a specified custom content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content.
     *
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param customContentId      The ID of the custom content for which content properties should be returned. (required)
     * @param key                  Filters the response to return a specific content property with matching key (case sensitive). (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /custom-content/{customContentId}/properties?key={key}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultContentProperty> getCustomContentContentProperties(@Param("customContentId") @NotNull Long customContentId, @Param("key") @Nullable String key, @Param("sort") @Nullable ContentPropertySortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get content property for custom content by id
     * <p>
     * Retrieves a specific Content Property by ID that is attached to a specified custom content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page.
     *
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param customContentId      The ID of the custom content for which content properties should be returned. (required)
     * @param propertyId           The ID of the content property being requested. (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /custom-content/{customContentId}/properties/{propertyId}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> getCustomContentContentPropertiesById(@Param("customContentId") @NotNull Long customContentId, @Param("propertyId") @NotNull Long propertyId, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get labels for custom content
     * <p>
     * Returns the labels for a specific piece of custom content. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content and its corresponding space.
     *
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param id                   The ID of the custom content for which labels should be returned. (required)
     * @param prefix               Filter the results to labels based on their prefix. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of labels per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /custom-content/{id}/labels?prefix={prefix}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultLabel> getCustomContentLabels(@Param("id") @NotNull Long id, @Param("prefix") @Nullable String prefix, @Param("sort") @Nullable List<LabelSortOrder> sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get permitted operations for custom content
     * <p>
     * Returns the permitted operations on specific custom content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the parent content of the custom content and its corresponding space.
     *
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param id                   The ID of the custom content for which operations should be returned. (required)
     */
    @RequestLine("GET /custom-content/{id}/operations")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<PermittedOperationsResponse> getCustomContentOperations(@Param("id") @NotNull Long id);

    /**
     * Get version details for custom content version
     * <p>
     * Retrieves version details for the specified custom content and version number.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page.
     *
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param customContentId      The ID of the custom content for which version details should be returned. (required)
     * @param versionNumber        The version number of the custom content to be returned. (required)
     */
    @RequestLine("GET /custom-content/{customContentId}/versions/{versionNumber}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<DetailedVersion> getCustomContentVersionDetails(@Param("customContentId") @NotNull Long customContentId, @Param("versionNumber") @NotNull Long versionNumber);

    /**
     * Get custom content versions
     * <p>
     * Returns the versions of specific custom content.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the custom content and its corresponding page and space.
     *
     * Authentication - Required Scopes: [read:custom-content:confluence]
     * @param customContentId      The ID of the custom content to be queried for its versions. If you don't know the custom content ID, use Get custom-content by type and filter the results. (required)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of versions per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param sort                 Used to sort the result by a particular field. (optional)
     */
    @RequestLine("GET /custom-content/{customContentId}/versions?body-format={bodyFormat}&cursor={cursor}&limit={limit}&sort={sort}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultVersion3> getCustomContentVersions(@Param("customContentId") @NotNull Long customContentId, @Param("bodyFormat") @Nullable CustomContentBodyRepresentation bodyFormat, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("sort") @Nullable VersionSortOrder sort);

    /**
     * Get footer comment by id
     * <p>
     * Retrieves a footer comment by id
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param commentId            The ID of the comment to be retrieved. (required)
     * @param bodyFormat           The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param version              Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details. (optional)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /footer-comments/{commentId}?body-format={bodyFormat}&version={version}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<FooterCommentModel> getFooterCommentById(@Param("commentId") @NotNull Long commentId, @Param("bodyFormat") @Nullable PrimaryBodyRepresentationSingle bodyFormat, @Param("version") @Nullable Integer version, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get children footer comments
     * <p>
     * Returns the children footer comments of specific comment. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the parent comment for which footer comment children should be returned. (required)
     * @param bodyFormat           The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of footer comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /footer-comments/{id}/children?body-format={bodyFormat}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultChildrenCommentModel> getFooterCommentChildren(@Param("id") @NotNull Long id, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("sort") @Nullable CommentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get permitted operations for footer comment
     * <p>
     * Returns the permitted operations on specific footer comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the parent content of the footer comment and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the footer comment for which operations should be returned. (required)
     */
    @RequestLine("GET /footer-comments/{id}/operations")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<PermittedOperationsResponse> getFooterCommentOperations(@Param("id") @NotNull Long id);

    /**
     * Get version details for footer comment version
     * <p>
     * Retrieves version details for the specified footer comment version.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blog post and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the footer comment for which version details should be returned. (required)
     * @param versionNumber        The version number of the footer comment to be returned. (required)
     */
    @RequestLine("GET /footer-comments/{id}/versions/{versionNumber}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<DetailedVersion> getFooterCommentVersionDetails(@Param("id") @NotNull Long id, @Param("versionNumber") @NotNull Long versionNumber);

    /**
     * Get footer comment versions
     * <p>
     * Retrieves the versions of the specified footer comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blog post and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the footer comment for which versions should be returned (required)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of versions per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param sort                 Used to sort the result by a particular field. (optional)
     */
    @RequestLine("GET /footer-comments/{id}/versions?body-format={bodyFormat}&cursor={cursor}&limit={limit}&sort={sort}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultVersion4> getFooterCommentVersions(@Param("id") @NotNull Long id, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("sort") @Nullable VersionSortOrder sort);

    /**
     * Get footer comments
     * <p>
     * Returns all footer comments. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param bodyFormat           The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of footer comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /footer-comments?body-format={bodyFormat}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultFooterCommentModel> getFooterComments(@Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("sort") @Nullable CommentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get like count for footer comment
     * <p>
     * Returns the count of likes of specific footer comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page/blogpost and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the footer comment for which like count should be returned. (required)
     */
    @RequestLine("GET /footer-comments/{id}/likes/count")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Integer> getFooterLikeCount(@Param("id") @NotNull Long id);

    /**
     * Get account IDs of likes for footer comment
     * <p>
     * Returns the account IDs of likes of specific footer comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page/blogpost and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the footer comment for which like count should be returned. (required)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of account IDs per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     */
    @RequestLine("GET /footer-comments/{id}/likes/users?cursor={cursor}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultString> getFooterLikeUsers(@Param("id") @NotNull Long id, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit);

    /**
     * Get inline comment by id
     * <p>
     * Retrieves an inline comment by id
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param commentId            The ID of the comment to be retrieved. (required)
     * @param bodyFormat           The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param version              Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details. (optional)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /inline-comments/{commentId}?body-format={bodyFormat}&version={version}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<InlineCommentModel> getInlineCommentById(@Param("commentId") @NotNull Long commentId, @Param("bodyFormat") @Nullable PrimaryBodyRepresentationSingle bodyFormat, @Param("version") @Nullable Integer version, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get children inline comments
     * <p>
     * Returns the children inline comments of specific comment. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the parent comment for which inline comment children should be returned. (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     * @param bodyFormat           The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of footer comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     */
    @RequestLine("GET /inline-comments/{id}/children?serialize-ids-as-strings={serializeIdsAsStrings}&body-format={bodyFormat}&sort={sort}&cursor={cursor}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultInlineCommentChildrenModel> getInlineCommentChildren(@Param("id") @NotNull Long id, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("sort") @Nullable CommentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit);

    /**
     * Get permitted operations for inline comment
     * <p>
     * Returns the permitted operations on specific inline comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the parent content of the inline comment and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the inline comment for which operations should be returned. (required)
     */
    @RequestLine("GET /inline-comments/{id}/operations")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<PermittedOperationsResponse> getInlineCommentOperations(@Param("id") @NotNull Long id);

    /**
     * Get version details for inline comment version
     * <p>
     * Retrieves version details for the specified inline comment version.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blog post and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the inline comment for which version details should be returned. (required)
     * @param versionNumber        The version number of the inline comment to be returned. (required)
     */
    @RequestLine("GET /inline-comments/{id}/versions/{versionNumber}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<DetailedVersion> getInlineCommentVersionDetails(@Param("id") @NotNull Long id, @Param("versionNumber") @NotNull Long versionNumber);

    /**
     * Get inline comment versions
     * <p>
     * Retrieves the versions of the specified inline comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blog post and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the inline comment for which versions should be returned (required)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of versions per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param sort                 Used to sort the result by a particular field. (optional)
     */
    @RequestLine("GET /inline-comments/{id}/versions?body-format={bodyFormat}&cursor={cursor}&limit={limit}&sort={sort}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultVersion4> getInlineCommentVersions(@Param("id") @NotNull Long id, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("sort") @Nullable VersionSortOrder sort);

    /**
     * Get inline comments
     * <p>
     * Returns all inline comments. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     * @param bodyFormat           The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of footer comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     */
    @RequestLine("GET /inline-comments?serialize-ids-as-strings={serializeIdsAsStrings}&body-format={bodyFormat}&sort={sort}&cursor={cursor}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultInlineCommentModel> getInlineComments(@Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("sort") @Nullable CommentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit);

    /**
     * Get like count for inline comment
     * <p>
     * Returns the count of likes of specific inline comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page/blogpost and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the inline comment for which like count should be returned. (required)
     */
    @RequestLine("GET /inline-comments/{id}/likes/count")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Integer> getInlineLikeCount(@Param("id") @NotNull Long id);

    /**
     * Get account IDs of likes for inline comment
     * <p>
     * Returns the account IDs of likes of specific inline comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page/blogpost and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the inline comment for which like count should be returned. (required)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of account IDs per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     */
    @RequestLine("GET /inline-comments/{id}/likes/users?cursor={cursor}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultString> getInlineLikeUsers(@Param("id") @NotNull Long id, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit);

    /**
     * Get attachments for label
     * <p>
     * Returns the attachments of specified label. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the attachment and its corresponding space.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param id                   The ID of the label for which attachments should be returned. (required)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /labels/{id}/attachments?sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultAttachment1> getLabelAttachments(@Param("id") @NotNull Long id, @Param("sort") @Nullable AttachmentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get blog posts for label
     * <p>
     * Returns the blogposts of specified label. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the label for which blog posts should be returned. (required)
     * @param spaceId              Filter the results based on space ids. Multiple space ids can be specified as a comma-separated list. (optional)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of blog posts per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /labels/{id}/blogposts?space-id={spaceId}&body-format={bodyFormat}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultBlogPost> getLabelBlogPosts(@Param("id") @NotNull Long id, @Param("spaceId") @Nullable List<Long> spaceId, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("sort") @Nullable BlogPostSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get pages for label
     * <p>
     * Returns the pages of specified label. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the label for which pages should be returned. (required)
     * @param spaceId              Filter the results based on space ids. Multiple space ids can be specified as a comma-separated list. (optional)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /labels/{id}/pages?space-id={spaceId}&body-format={bodyFormat}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultPage> getLabelPages(@Param("id") @NotNull Long id, @Param("spaceId") @Nullable List<Long> spaceId, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("sort") @Nullable PageSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get all ancestors of page
     * <p>
     * Returns all ancestors for a given page by ID in top-to-bottom order (that is, the highest ancestor is the first item in the response payload). The number of results is limited by the {@code limit} parameter and additional results (if available) will be available by calling this endpoint with the ID of first ancestor in the response payload.
     * This endpoint returns minimal information about each ancestor. To fetch more details, use a related endpoint, such as [Get page by id](https://developer.atlassian.com/cloud/confluence/rest/v2/api-group-page/#api-pages-id-get).
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * @param id                   The ID of the page. (required)
     * @param limit                Maximum number of pages per result to return. If more results exist, call this endpoint with the highest ancestor's ID to fetch the next set of results. (optional, defaults to 25)
     */
    @RequestLine("GET /pages/{id}/ancestors?limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultAncestor> getPageAncestors(@Param("id") @NotNull Long id, @Param("limit") @Nullable Integer limit);

    /**
     * Get attachments for page
     * <p>
     * Returns the attachments of specific page. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param id                   The ID of the page for which attachments should be returned. (required)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param status               Filter the results to attachments based on their status. By default, {@code current} and {@code archived} are used. (optional)
     * @param mediaType            Filters on the mediaType of attachments. Only one may be specified. (optional)
     * @param filename             Filters on the file-name of attachments. Only one may be specified. (optional)
     * @param limit                Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 50)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /pages/{id}/attachments?sort={sort}&cursor={cursor}&status={status}&mediaType={mediaType}&filename={filename}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultAttachment> getPageAttachments(@Param("id") @NotNull Long id, @Param("sort") @Nullable AttachmentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("status") @Nullable List<String> status, @Param("mediaType") @Nullable String mediaType, @Param("filename") @Nullable String filename, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get page by id
     * <p>
     * Returns a specific page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the page to be returned. If you don't know the page ID, use Get pages and filter the results. (required)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param getDraft             Retrieve the draft version of this page. (optional, defaults to false)
     * @param version              Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details. (optional)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /pages/{id}?body-format={bodyFormat}&get-draft={getDraft}&version={version}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<PageSingle> getPageById(@Param("id") @NotNull Long id, @Param("bodyFormat") @Nullable PrimaryBodyRepresentationSingle bodyFormat, @Param("getDraft") @Nullable Boolean getDraft, @Param("version") @Nullable Integer version, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get content properties for page
     * <p>
     * Retrieves Content Properties tied to a specified page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param pageId               The ID of the page for which content properties should be returned. (required)
     * @param key                  Filters the response to return a specific content property with matching key (case sensitive). (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of attachments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /pages/{pageId}/properties?key={key}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultContentProperty> getPageContentProperties(@Param("pageId") @NotNull Long pageId, @Param("key") @Nullable String key, @Param("sort") @Nullable ContentPropertySortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get content property for page by id
     * <p>
     * Retrieves a specific Content Property by ID that is attached to a specified page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param pageId               The ID of the page for which content properties should be returned. (required)
     * @param propertyId           The ID of the content property being requested. (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /pages/{pageId}/properties/{propertyId}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> getPageContentPropertiesById(@Param("pageId") @NotNull Long pageId, @Param("propertyId") @NotNull Long propertyId, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get footer comments for page
     * <p>
     * Returns the root footer comments of specific page. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the page for which footer comments should be returned. (required)
     * @param bodyFormat           The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of footer comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /pages/{id}/footer-comments?body-format={bodyFormat}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultPageCommentModel> getPageFooterComments(@Param("id") @NotNull Long id, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("sort") @Nullable CommentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get inline comments for page
     * <p>
     * Returns the root inline comments of specific page. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:comment:confluence]
     * @param id                   The ID of the page for which inline comments should be returned. (required)
     * @param bodyFormat           The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of inline comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /pages/{id}/inline-comments?body-format={bodyFormat}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultPageInlineCommentModel> getPageInlineComments(@Param("id") @NotNull Long id, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("sort") @Nullable CommentSortOrder sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get labels for page
     * <p>
     * Returns the labels of specific page. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the page for which labels should be returned. (required)
     * @param prefix               Filter the results to labels based on their prefix. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of labels per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /pages/{id}/labels?prefix={prefix}&sort={sort}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultLabel> getPageLabels(@Param("id") @NotNull Long id, @Param("prefix") @Nullable String prefix, @Param("sort") @Nullable List<LabelSortOrder> sort, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get like count for page
     * <p>
     * Returns the count of likes of specific page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the page for which like count should be returned. (required)
     */
    @RequestLine("GET /pages/{id}/likes/count")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Integer> getPageLikeCount(@Param("id") @NotNull Long id);

    /**
     * Get account IDs of likes for page
     * <p>
     * Returns the account IDs of likes of specific page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the page for which like count should be returned. (required)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of account IDs per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     */
    @RequestLine("GET /pages/{id}/likes/users?cursor={cursor}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultString> getPageLikeUsers(@Param("id") @NotNull Long id, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit);

    /**
     * Get permitted operations for page
     * <p>
     * Returns the permitted operations on specific page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the parent content of the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the page for which operations should be returned. (required)
     */
    @RequestLine("GET /pages/{id}/operations")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<PermittedOperationsResponse> getPageOperations(@Param("id") @NotNull Long id);

    /**
     * Get version details for page version
     * <p>
     * Retrieves version details for the specified page and version number.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param pageId               The ID of the page for which version details should be returned. (required)
     * @param versionNumber        The version number of the page to be returned. (required)
     */
    @RequestLine("GET /pages/{pageId}/versions/{versionNumber}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<DetailedVersion> getPageVersionDetails(@Param("pageId") @NotNull Long pageId, @Param("versionNumber") @NotNull Long versionNumber);

    /**
     * Get page versions
     * <p>
     * Returns the versions of specific page.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page and its corresponding space.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the page to be queried for its versions. If you don't know the page ID, use Get pages and filter the results. (required)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of versions per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param sort                 Used to sort the result by a particular field. (optional)
     */
    @RequestLine("GET /pages/{id}/versions?body-format={bodyFormat}&cursor={cursor}&limit={limit}&sort={sort}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultVersion2> getPageVersions(@Param("id") @NotNull Long id, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("sort") @Nullable VersionSortOrder sort);

    /**
     * Get pages
     * <p>
     * Returns all pages. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only pages that the user has permission to view will be returned.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   Filter the results based on page ids. Multiple page ids can be specified as a comma-separated list. (optional)
     * @param spaceId              Filter the results based on space ids. Multiple space ids can be specified as a comma-separated list. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param status               Filter the results to pages based on their status. By default, {@code current} and {@code archived} are used. (optional)
     * @param title                Filter the results to pages based on their title. (optional)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /pages?id={id}&space-id={spaceId}&sort={sort}&status={status}&title={title}&body-format={bodyFormat}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultPage> getPages(@Param("id") @Nullable List<Long> id, @Param("spaceId") @Nullable List<Long> spaceId, @Param("sort") @Nullable PageSortOrder sort, @Param("status") @Nullable List<String> status, @Param("title") @Nullable String title, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get pages in space
     * <p>
     * Returns all pages in a space. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) and 'View' permission for the space. Only pages that the user has permission to view will be returned.
     *
     * Authentication - Required Scopes: [read:page:confluence]
     * @param id                   The ID of the space for which pages should be returned. (required)
     * @param depth                Filter the results to pages at the root level of the space or to all pages in the space. (optional, defaults to all)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param status               Filter the results to pages based on their status. By default, {@code current} and {@code archived} are used. (optional)
     * @param title                Filter the results to pages based on their title. (optional)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /spaces/{id}/pages?depth={depth}&sort={sort}&status={status}&title={title}&body-format={bodyFormat}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultPage> getPagesInSpace(@Param("id") @NotNull Long id, @Param("depth") @Nullable String depth, @Param("sort") @Nullable PageSortOrder sort, @Param("status") @Nullable List<String> status, @Param("title") @Nullable String title, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get space by id
     * <p>
     * Returns a specific space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the space.
     *
     * Authentication - Required Scopes: [read:space:confluence]
     * @param id                   The ID of the space to be returned. (required)
     * @param descriptionFormat    The content format type to be returned in the {@code description} field of the response. If available, the representation will be available under a response field of the same name under the {@code description} field. (optional)
     * @param includeIcon          If the icon for the space should be fetched or not. (optional, defaults to false)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /spaces/{id}?description-format={descriptionFormat}&include-icon={includeIcon}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Space> getSpaceById(@Param("id") @NotNull Long id, @Param("descriptionFormat") @Nullable SpaceDescriptionBodyRepresentation descriptionFormat, @Param("includeIcon") @Nullable Boolean includeIcon, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get permitted operations for space
     * <p>
     * Returns the permitted operations on specific space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the corresponding space.
     *
     * Authentication - Required Scopes: [read:space:confluence]
     * @param id                   The ID of the space for which operations should be returned. (required)
     */
    @RequestLine("GET /spaces/{id}/operations")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<PermittedOperationsResponse> getSpaceOperations(@Param("id") @NotNull Long id);

    /**
     * Get space permissions
     * <p>
     * Returns space permissions for a specific space.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the space.
     *
     * @param id                   The ID of the space to be returned. (required)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of spaces per result to return. If more results exist, use the {@code Link} response header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     */
    @RequestLine("GET /spaces/{id}/permissions?cursor={cursor}&limit={limit}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultSpacePermission> getSpacePermissions(@Param("id") @NotNull Long id, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit);

    /**
     * Get space properties in space
     * <p>
     * Returns all properties for the given space. Space properties are a key-value storage associated with a space. The limit parameter specifies the maximum number of results returned in a single response. Use the {@code link} response header to paginate through additional results.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) and 'View' permission for the space.
     *
     * Authentication - Required Scopes: [read:space:confluence]
     * @param spaceId              The ID of the space for which space properties should be returned. (required)
     * @param key                  The key of the space property to retrieve. This should be used when a user knows the key of their property, but needs to retrieve the id for use in other methods. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of pages per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /spaces/{spaceId}/properties?key={key}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultSpaceProperty> getSpaceProperties(@Param("spaceId") @NotNull Long spaceId, @Param("key") @Nullable String key, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get space property by id
     * <p>
     * Retrieve a space property by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) and 'View' permission for the space.
     *
     * Authentication - Required Scopes: [read:space:confluence]
     * @param spaceId              The ID of the space the property belongs to. (required)
     * @param propertyId           The ID of the property to be retrieved. (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /spaces/{spaceId}/properties/{propertyId}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<SpaceProperty> getSpacePropertyById(@Param("spaceId") @NotNull Long spaceId, @Param("propertyId") @NotNull Long propertyId, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get spaces
     * <p>
     * Returns all spaces. The results will be sorted by id ascending. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only spaces that the user has permission to view will be returned.
     *
     * Authentication - Required Scopes: [read:space:confluence]
     * @param ids                  Filter the results to spaces based on their IDs. Multiple IDs can be specified as a comma-separated list. (optional)
     * @param keys                 Filter the results to spaces based on their keys. Multiple keys can be specified as a comma-separated list. (optional)
     * @param type                 Filter the results to spaces based on their type. (optional)
     * @param status               Filter the results to spaces based on their status. (optional)
     * @param labels               Filter the results to spaces based on their labels. Multiple labels can be specified as a comma-separated list. (optional)
     * @param sort                 Used to sort the result by a particular field. (optional)
     * @param descriptionFormat    The content format type to be returned in the {@code description} field of the response. If available, the representation will be available under a response field of the same name under the {@code description} field. (optional)
     * @param includeIcon          If the icon for the space should be fetched or not. (optional, defaults to false)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of spaces per result to return. If more results exist, use the {@code Link} response header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /spaces?ids={ids}&keys={keys}&type={type}&status={status}&labels={labels}&sort={sort}&description-format={descriptionFormat}&include-icon={includeIcon}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultSpace> getSpaces(@Param("ids") @Nullable List<Long> ids, @Param("keys") @Nullable List<String> keys, @Param("type") @Nullable String type, @Param("status") @Nullable String status, @Param("labels") @Nullable List<String> labels, @Param("sort") @Nullable SpaceSortOrder sort, @Param("descriptionFormat") @Nullable SpaceDescriptionBodyRepresentation descriptionFormat, @Param("includeIcon") @Nullable Boolean includeIcon, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get task by id
     * <p>
     * Returns a specific task.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the containing page or blog post and its corresponding space.
     *
     * Authentication - Required Scopes: [read:task:confluence]
     * @param id                   The ID of the task to be returned. If you don't know the task ID, use Get tasks and filter the results. (required)
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /tasks/{id}?body-format={bodyFormat}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Task> getTaskById(@Param("id") @NotNull Long id, @Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Get tasks
     * <p>
     * Returns all tasks. The number of results is limited by the {@code limit} parameter and additional results (if available) will be available through the {@code next} URL present in the {@code Link} response header.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission). Only tasks that the user has permission to view will be returned.
     *
     * Authentication - Required Scopes: [read:task:confluence]
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field. (optional)
     * @param includeBlankTasks    Specifies whether to include blank tasks in the response. Defaults to {@code true}. (optional)
     * @param status               Filters on the status of the task. (optional)
     * @param taskId               Filters on task ID. Multiple IDs can be specified. (optional)
     * @param spaceId              Filters on the space ID of the task. Multiple IDs can be specified. (optional)
     * @param pageId               Filters on the page ID of the task. Multiple IDs can be specified. Note - page and blog post filters can be used in conjunction. (optional)
     * @param blogpostId           Filters on the blog post ID of the task. Multiple IDs can be specified. Note - page and blog post filters can be used in conjunction. (optional)
     * @param createdBy            Filters on the Account ID of the user who created this task. Multiple IDs can be specified. (optional)
     * @param assignedTo           Filters on the Account ID of the user to whom this task is assigned. Multiple IDs can be specified. (optional)
     * @param completedBy          Filters on the Account ID of the user who completed this task. Multiple IDs can be specified. (optional)
     * @param createdAtFrom        Filters on start of date-time range of task based on creation date (inclusive). Input is epoch time in milliseconds. (optional)
     * @param createdAtTo          Filters on end of date-time range of task based on creation date (inclusive). Input is epoch time in milliseconds. (optional)
     * @param dueAtFrom            Filters on start of date-time range of task based on due date (inclusive). Input is epoch time in milliseconds. (optional)
     * @param dueAtTo              Filters on end of date-time range of task based on due date (inclusive). Input is epoch time in milliseconds. (optional)
     * @param completedAtFrom      Filters on start of date-time range of task based on completion date (inclusive). Input is epoch time in milliseconds. (optional)
     * @param completedAtTo        Filters on end of date-time range of task based on completion date (inclusive). Input is epoch time in milliseconds. (optional)
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results. (optional)
     * @param limit                Maximum number of tasks per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results. (optional, defaults to 25)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("GET /tasks?body-format={bodyFormat}&include-blank-tasks={includeBlankTasks}&status={status}&task-id={taskId}&space-id={spaceId}&page-id={pageId}&blogpost-id={blogpostId}&created-by={createdBy}&assigned-to={assignedTo}&completed-by={completedBy}&created-at-from={createdAtFrom}&created-at-to={createdAtTo}&due-at-from={dueAtFrom}&due-at-to={dueAtTo}&completed-at-from={completedAtFrom}&completed-at-to={completedAtTo}&cursor={cursor}&limit={limit}&serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<MultiEntityResultTask> getTasks(@Param("bodyFormat") @Nullable PrimaryBodyRepresentation bodyFormat, @Param("includeBlankTasks") @Nullable Boolean includeBlankTasks, @Param("status") @Nullable String status, @Param("taskId") @Nullable List<Long> taskId, @Param("spaceId") @Nullable List<Long> spaceId, @Param("pageId") @Nullable List<Long> pageId, @Param("blogpostId") @Nullable List<Long> blogpostId, @Param("createdBy") @Nullable List<String> createdBy, @Param("assignedTo") @Nullable List<String> assignedTo, @Param("completedBy") @Nullable List<String> completedBy, @Param("createdAtFrom") @Nullable Long createdAtFrom, @Param("createdAtTo") @Nullable Long createdAtTo, @Param("dueAtFrom") @Nullable Long dueAtFrom, @Param("dueAtTo") @Nullable Long dueAtTo, @Param("completedAtFrom") @Nullable Long completedAtFrom, @Param("completedAtTo") @Nullable Long completedAtTo, @Param("cursor") @Nullable String cursor, @Param("limit") @Nullable Integer limit, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Invite a list of emails to the site
     * <p>
     * Invite a list of emails to the site.
     * Ignores all invalid emails and no action is taken for the emails that already have access to the site.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission).
     *
     * @param checkAccessByEmailRequest  (required)
     */
    @RequestLine("POST /user/access/invite-by-email")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Void> inviteByEmail(@NotNull CheckAccessByEmailRequest checkAccessByEmailRequest);

    /**
     * Update content property for attachment by id
     * <p>
     * Update a content property for attachment by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the attachment.
     *
     * Authentication - Required Scopes: [read:attachment:confluence]
     * @param attachmentId         The ID of the attachment the property belongs to. (required)
     * @param propertyId           The ID of the property to be updated. (required)
     * @param contentPropertyUpdateRequest The content property to be updated. (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("PUT /attachments/{attachmentId}/properties/{propertyId}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> updateAttachmentPropertyById(@Param("attachmentId") @NotNull String attachmentId, @Param("propertyId") @NotNull Long propertyId, @NotNull ContentPropertyUpdateRequest contentPropertyUpdateRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Update blog post
     * <p>
     * Update a blog post by id.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the blog post and its corresponding space. Permission to update blog posts in the space.
     *
     * Authentication - Required Scopes: [write:page:confluence]
     * @param id                   The ID of the blog post to be updated. If you don't know the blog post ID, use Get Blog Posts and filter the results. (required)
     * @param updateBlogPostRequest  (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("PUT /blogposts/{id}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<BlogPostSingle> updateBlogPost(@Param("id") @NotNull Long id, @NotNull UpdateBlogPostRequest updateBlogPostRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Update content property for blog post by id
     * <p>
     * Update a content property for blog post by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the blog post.
     *
     * Authentication - Required Scopes: [read:page:confluence, write:page:confluence]
     * @param blogpostId           The ID of the blog post the property belongs to. (required)
     * @param propertyId           The ID of the property to be updated. (required)
     * @param contentPropertyUpdateRequest The content property to be updated. (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("PUT /blogposts/{blogpostId}/properties/{propertyId}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> updateBlogpostPropertyById(@Param("blogpostId") @NotNull Long blogpostId, @Param("propertyId") @NotNull Long propertyId, @NotNull ContentPropertyUpdateRequest contentPropertyUpdateRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Update content property for comment by id
     * <p>
     * Update a content property for a comment by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the comment.
     *
     * Authentication - Required Scopes: [read:comment:confluence, write:comment:confluence]
     * @param commentId            The ID of the comment the property belongs to. (required)
     * @param propertyId           The ID of the property to be updated. (required)
     * @param contentPropertyUpdateRequest The content property to be updated. (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("PUT /comments/{commentId}/properties/{propertyId}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> updateCommentPropertyById(@Param("commentId") @NotNull Long commentId, @Param("propertyId") @NotNull Long propertyId, @NotNull ContentPropertyUpdateRequest contentPropertyUpdateRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Update custom content
     * <p>
     * Update a custom content by id.
     * {@code spaceId} is always required and maximum one of {@code pageId}, {@code blogPostId}, or {@code customContentId} is allowed in the request body. **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to update custom content in the space.
     *
     * Authentication - Required Scopes: [write:custom-content:confluence]
     * @param id                   The ID of the custom content to be updated. If you don't know the custom content ID, use Get Custom Content by Type and filter the results. (required)
     * @param updateCustomContentRequest  (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("PUT /custom-content/{id}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<CustomContentSingle> updateCustomContent(@Param("id") @NotNull Long id, @NotNull UpdateCustomContentRequest updateCustomContentRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Update content property for custom content by id
     * <p>
     * Update a content property for a piece of custom content by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the custom content.
     *
     * Authentication - Required Scopes: [read:custom-content:confluence, write:custom-content:confluence]
     * @param customContentId      The ID of the custom content the property belongs to. (required)
     * @param propertyId           The ID of the property to be updated. (required)
     * @param contentPropertyUpdateRequest The content property to be updated. (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("PUT /custom-content/{customContentId}/properties/{propertyId}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> updateCustomContentPropertyById(@Param("customContentId") @NotNull Long customContentId, @Param("propertyId") @NotNull Long propertyId, @NotNull ContentPropertyUpdateRequest contentPropertyUpdateRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Update footer comment
     * <p>
     * Update a footer comment. This can be used to update the body text of a comment.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to create comments in the space.
     *
     * Authentication - Required Scopes: [write:comment:confluence]
     * @param commentId            The ID of the comment to be retrieved. (required)
     * @param updateFooterCommentModel The footer comment to be created (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("PUT /footer-comments/{commentId}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<FooterCommentModel> updateFooterComment(@Param("commentId") @NotNull Long commentId, @NotNull UpdateFooterCommentModel updateFooterCommentModel, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Update inline comment
     * <p>
     * Update an inline comment. This can be used to update the body text of a comment and/or to resolve the comment
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the content of the page or blogpost and its corresponding space. Permission to create comments in the space.
     *
     * Authentication - Required Scopes: [write:comment:confluence]
     * @param commentId            The ID of the comment to be retrieved. (required)
     * @param updateInlineCommentModel The inline comment to be updated (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("PUT /inline-comments/{commentId}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<InlineCommentModel> updateInlineComment(@Param("commentId") @NotNull Long commentId, @NotNull UpdateInlineCommentModel updateInlineCommentModel, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Update page
     * <p>
     * Update a page by id.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to view the page and its corresponding space. Permission to update pages in the space.
     *
     * Authentication - Required Scopes: [write:page:confluence]
     * @param id                   The ID of the page to be updated. If you don't know the page ID, use Get Pages and filter the results. (required)
     * @param updatePageRequest     (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("PUT /pages/{id}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<PageSingle> updatePage(@Param("id") @NotNull Long id, @NotNull UpdatePageRequest updatePageRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Update content property for page by id
     * <p>
     * Update a content property for a page by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the page.
     *
     * Authentication - Required Scopes: [read:page:confluence, write:page:confluence]
     * @param pageId               The ID of the page the property belongs to. (required)
     * @param propertyId           The ID of the property to be updated. (required)
     * @param contentPropertyUpdateRequest The content property to be updated. (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("PUT /pages/{pageId}/properties/{propertyId}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<ContentProperty> updatePagePropertyById(@Param("pageId") @NotNull Long pageId, @Param("propertyId") @NotNull Long propertyId, @NotNull ContentPropertyUpdateRequest contentPropertyUpdateRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Update space property by id
     * <p>
     * Update a space property by its id.
     *  **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to access the Confluence site ('Can use' global permission) and 'Admin' permission for the space.
     *
     * Authentication - Required Scopes: [read:space:confluence, write:space:confluence]
     * @param spaceId              The ID of the space the property belongs to. (required)
     * @param propertyId           The ID of the property to be updated. (required)
     * @param spacePropertyUpdateRequest The space property to be updated. (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("PUT /spaces/{spaceId}/properties/{propertyId}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<SpaceProperty> updateSpacePropertyById(@Param("spaceId") @NotNull Long spaceId, @Param("propertyId") @NotNull Long propertyId, @NotNull SpacePropertyUpdateRequest spacePropertyUpdateRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

    /**
     * Update task
     * <p>
     * Update a task by id.
     * **[Permissions](https://confluence.atlassian.com/x/_AozKw) required**: Permission to edit the containing page or blog post and view its corresponding space.
     *
     * @param id                   The ID of the task to be updated. If you don't know the task ID, use Get tasks and filter the results. (required)
     * @param updateTaskRequest     (required)
     * @param serializeIdsAsStrings Due to JavaScript's max integer representation of 2^53-1, the type of any IDs returned in the response body for this endpoint will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, this query param can be passed to this endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail. (optional, defaults to false)
     */
    @RequestLine("PUT /tasks/{id}?serialize-ids-as-strings={serializeIdsAsStrings}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<Task> updateTask(@Param("id") @NotNull Long id, @NotNull UpdateTaskRequest updateTaskRequest, @Param("serializeIdsAsStrings") @Nullable Boolean serializeIdsAsStrings);

}
