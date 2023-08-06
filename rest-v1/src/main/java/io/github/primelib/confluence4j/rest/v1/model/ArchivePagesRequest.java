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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ArchivePagesRequest
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
    "pages"
})
@JsonTypeName("archivePages_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ArchivePagesRequest {

    @JsonProperty("pages")
    protected List<ArchivePagesRequestPagesInner> pages;

    /**
     * Constructs a validated instance of {@link ArchivePagesRequest}.
     *
     * @param spec the specification to process
     */
    public ArchivePagesRequest(Consumer<ArchivePagesRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ArchivePagesRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ArchivePagesRequest(Consumer)} instead.
     * @param pages pages
     */
    @ApiStatus.Internal
    public ArchivePagesRequest(List<ArchivePagesRequestPagesInner> pages) {
        this.pages = pages;
    }

}
