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
 * AuditRecord
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
    "superAdmin",
    "affectedObject",
    "changedValues",
    "associatedObjects"
})
@JsonTypeName("AuditRecord")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecord {

    @JsonProperty("author")
    protected AuditRecordAuthor author;

    @JsonProperty("remoteAddress")
    protected String remoteAddress;

    /**
     * The creation date-time of the audit record, as a timestamp.
     */
    @JsonProperty("creationDate")
    protected Long creationDate;

    @JsonProperty("summary")
    protected String summary;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("category")
    protected String category;

    @JsonProperty("sysAdmin")
    protected Boolean sysAdmin;

    @JsonProperty("superAdmin")
    protected Boolean superAdmin;

    @JsonProperty("affectedObject")
    protected AffectedObject affectedObject;

    @JsonProperty("changedValues")
    protected List<ChangedValue> changedValues;

    @JsonProperty("associatedObjects")
    protected List<AffectedObject> associatedObjects;

    /**
     * Constructs a validated instance of {@link AuditRecord}.
     *
     * @param spec the specification to process
     */
    public AuditRecord(Consumer<AuditRecord> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuditRecord}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuditRecord(Consumer)} instead.
     * @param author author
     * @param remoteAddress remoteAddress
     * @param creationDate The creation date-time of the audit record, as a timestamp.
     * @param summary summary
     * @param description description
     * @param category category
     * @param sysAdmin sysAdmin
     * @param superAdmin superAdmin
     * @param affectedObject affectedObject
     * @param changedValues changedValues
     * @param associatedObjects associatedObjects
     */
    @ApiStatus.Internal
    public AuditRecord(AuditRecordAuthor author, String remoteAddress, Long creationDate, String summary, String description, String category, Boolean sysAdmin, Boolean superAdmin, AffectedObject affectedObject, List<ChangedValue> changedValues, List<AffectedObject> associatedObjects) {
        this.author = author;
        this.remoteAddress = remoteAddress;
        this.creationDate = creationDate;
        this.summary = summary;
        this.description = description;
        this.category = category;
        this.sysAdmin = sysAdmin;
        this.superAdmin = superAdmin;
        this.affectedObject = affectedObject;
        this.changedValues = changedValues;
        this.associatedObjects = associatedObjects;
    }

}
