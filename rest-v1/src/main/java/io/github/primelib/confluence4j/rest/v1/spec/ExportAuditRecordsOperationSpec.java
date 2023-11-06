package io.github.primelib.confluence4j.rest.v1.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.AuditRecord;
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
 * ExportAuditRecordsSpec
 * <p>
 * Specification for the ExportAuditRecords operation.
 * <p>
 * Export audit records
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExportAuditRecordsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Filters the exported results to the records on or after the {@code startDate}. The {@code startDate} must be specified as [epoch time](https://www.epochconverter.com/) in milliseconds.
     */
    @Nullable 
    private String startDate;

    /**
     * Filters the exported results to the records on or before the {@code endDate}. The {@code endDate} must be specified as [epoch time](https://www.epochconverter.com/) in milliseconds.
     */
    @Nullable 
    private String endDate;

    /**
     * Filters the exported results to records that have string property values matching the {@code searchString}.
     */
    @Nullable 
    private String searchString;

    /**
     * The format of the export file for the audit records.
     */
    @Nullable 
    private String format;

    /**
     * Constructs a validated instance of {@link ExportAuditRecordsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ExportAuditRecordsOperationSpec(Consumer<ExportAuditRecordsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ExportAuditRecordsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startDate            Filters the exported results to the records on or after the {@code startDate}. The {@code startDate} must be specified as [epoch time](https://www.epochconverter.com/) in milliseconds.
     * @param endDate              Filters the exported results to the records on or before the {@code endDate}. The {@code endDate} must be specified as [epoch time](https://www.epochconverter.com/) in milliseconds.
     * @param searchString         Filters the exported results to records that have string property values matching the {@code searchString}.
     * @param format               The format of the export file for the audit records.
     */
    @ApiStatus.Internal
    public ExportAuditRecordsOperationSpec(String startDate, String endDate, String searchString, String format) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.searchString = searchString;
        this.format = format;

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
