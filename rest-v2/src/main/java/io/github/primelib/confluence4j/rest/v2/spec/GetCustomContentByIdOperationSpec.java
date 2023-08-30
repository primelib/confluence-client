package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.CustomContentBodyRepresentation;
import io.github.primelib.confluence4j.rest.v2.model.CustomContentBodyRepresentationSingle;
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
 * GetCustomContentByIdSpec
 * <p>
 * Specification for the GetCustomContentById operation.
 * <p>
 * Get custom content by id
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetCustomContentByIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the custom content to be returned. If you don't know the custom content ID, use Get Custom Content by Type and filter the results.
     */
    @NotNull 
    private Long id;

    /**
     * The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     * Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned.
     */
    @Nullable 
    private CustomContentBodyRepresentationSingle bodyFormat;

    /**
     * Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details.
     */
    @Nullable 
    private Integer version;

    /**
     * Constructs a validated instance of {@link GetCustomContentByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetCustomContentByIdOperationSpec(Consumer<GetCustomContentByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetCustomContentByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the custom content to be returned. If you don't know the custom content ID, use Get Custom Content by Type and filter the results.
     * @param bodyFormat           The content format types to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.  Note: If the custom content body type is {@code storage}, the {@code storage} and {@code atlas_doc_format} body formats are able to be returned. If the custom content body type is {@code raw}, only the {@code raw} body format is able to be returned.
     * @param version              Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details.
     */
    @ApiStatus.Internal
    public GetCustomContentByIdOperationSpec(Long id, CustomContentBodyRepresentationSingle bodyFormat, Integer version) {
        this.id = id;
        this.bodyFormat = bodyFormat;
        this.version = version;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
    }
}
