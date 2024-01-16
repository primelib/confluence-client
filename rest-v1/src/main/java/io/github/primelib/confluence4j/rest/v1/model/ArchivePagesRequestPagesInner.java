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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ArchivePagesRequestPagesInner
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
    "id"
})
@JsonTypeName("archivePages_request_pages_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ArchivePagesRequestPagesInner {

    /**
     * The {@code id} of the page to be archived.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * Constructs a validated instance of {@link ArchivePagesRequestPagesInner}.
     *
     * @param spec the specification to process
     */
    public ArchivePagesRequestPagesInner(Consumer<ArchivePagesRequestPagesInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ArchivePagesRequestPagesInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ArchivePagesRequestPagesInner(Consumer)} instead.
     * @param id The {@code id} of the page to be archived.
     */
    @ApiStatus.Internal
    public ArchivePagesRequestPagesInner(Long id) {
        this.id = id;
    }

}
