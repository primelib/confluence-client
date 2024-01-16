package io.github.primelib.confluence4j.rest.v1.model;

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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentMetadataCurrentuserLastcontributed
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
    "status",
    "when"
})
@JsonTypeName("ContentMetadata_currentuser_lastcontributed")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentMetadataCurrentuserLastcontributed {

    @JsonProperty("status")
    protected String status;

    @JsonProperty("when")
    protected OffsetDateTime when;

    /**
     * Constructs a validated instance of {@link ContentMetadataCurrentuserLastcontributed}.
     *
     * @param spec the specification to process
     */
    public ContentMetadataCurrentuserLastcontributed(Consumer<ContentMetadataCurrentuserLastcontributed> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentMetadataCurrentuserLastcontributed}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentMetadataCurrentuserLastcontributed(Consumer)} instead.
     * @param status status
     * @param when when
     */
    @ApiStatus.Internal
    public ContentMetadataCurrentuserLastcontributed(String status, OffsetDateTime when) {
        this.status = status;
        this.when = when;
    }

}
