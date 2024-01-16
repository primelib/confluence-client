package io.github.primelib.confluence4j.rest.v1.model;

import java.util.Objects;
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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditRecordCreate
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
    "author",
    "remoteAddress",
    "creationDate",
    "summary",
    "description",
    "category",
    "sysAdmin",
    "affectedObject",
    "changedValues",
    "associatedObjects"
})
@JsonTypeName("AuditRecordCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordCreate {

    @JsonProperty("author")
    protected AuditRecordCreateAuthor author;

    /**
     * The IP address of the computer where the event was initiated from.
     */
    @JsonProperty("remoteAddress")
    protected String remoteAddress;

    /**
     * The creation date-time of the audit record, as a timestamp. This is converted to a date-time display in the Confluence UI. If the {@code creationDate} is not specified, then it will be set to the timestamp for the current date-time.
     */
    @JsonProperty("creationDate")
    protected Long creationDate;

    /**
     * The summary of the event, which is displayed in the 'Change' column on the audit log in the Confluence UI.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * A long description of the event, which is displayed in the 'Description' field on the audit log in the Confluence UI.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The category of the event, which is displayed in the 'Event type' column on the audit log in the Confluence UI.
     */
    @JsonProperty("category")
    protected String category;

    /**
     * Indicates whether the event was actioned by a system administrator.
     */
    @JsonProperty("sysAdmin")
    protected Boolean sysAdmin;

    @JsonProperty("affectedObject")
    protected AffectedObject affectedObject;

    /**
     * The values that were changed in the event.
     */
    @JsonProperty("changedValues")
    protected List<ChangedValue> changedValues;

    /**
     * Objects that were associated with the event. For example, if the event was a space permission change then the associated object would be the space.
     */
    @JsonProperty("associatedObjects")
    protected List<AffectedObject> associatedObjects;

    /**
     * Constructs a validated instance of {@link AuditRecordCreate}.
     *
     * @param spec the specification to process
     */
    public AuditRecordCreate(Consumer<AuditRecordCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuditRecordCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuditRecordCreate(Consumer)} instead.
     * @param author author
     * @param remoteAddress The IP address of the computer where the event was initiated from.
     * @param creationDate The creation date-time of the audit record, as a timestamp. This is converted to a date-time display in the Confluence UI. If the {@code creationDate} is not specified, then it will be set to the timestamp for the current date-time.
     * @param summary The summary of the event, which is displayed in the 'Change' column on the audit log in the Confluence UI.
     * @param description A long description of the event, which is displayed in the 'Description' field on the audit log in the Confluence UI.
     * @param category The category of the event, which is displayed in the 'Event type' column on the audit log in the Confluence UI.
     * @param sysAdmin Indicates whether the event was actioned by a system administrator.
     * @param affectedObject affectedObject
     * @param changedValues The values that were changed in the event.
     * @param associatedObjects Objects that were associated with the event. For example, if the event was a space permission change then the associated object would be the space.
     */
    @ApiStatus.Internal
    public AuditRecordCreate(AuditRecordCreateAuthor author, String remoteAddress, Long creationDate, String summary, String description, String category, Boolean sysAdmin, AffectedObject affectedObject, List<ChangedValue> changedValues, List<AffectedObject> associatedObjects) {
        this.author = author;
        this.remoteAddress = remoteAddress;
        this.creationDate = creationDate;
        this.summary = summary;
        this.description = description;
        this.category = category;
        this.sysAdmin = sysAdmin;
        this.affectedObject = affectedObject;
        this.changedValues = changedValues;
        this.associatedObjects = associatedObjects;
    }

}
