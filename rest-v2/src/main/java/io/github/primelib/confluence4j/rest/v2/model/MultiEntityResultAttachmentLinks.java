package io.github.primelib.confluence4j.rest.v2.model;

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
 * MultiEntityResultAttachmentLinks
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
    "next"
})
@JsonTypeName("MultiEntityResult_Attachment___links")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MultiEntityResultAttachmentLinks {

    /**
     * Used for pagination. Contains the relative URL for the next set of results, using a cursor query parameter. This property will not be present if there is no additional data available.
     */
    @JsonProperty("next")
    protected String next;

    /**
     * Constructs a validated instance of {@link MultiEntityResultAttachmentLinks}.
     *
     * @param spec the specification to process
     */
    public MultiEntityResultAttachmentLinks(Consumer<MultiEntityResultAttachmentLinks> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MultiEntityResultAttachmentLinks}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MultiEntityResultAttachmentLinks(Consumer)} instead.
     * @param next Used for pagination. Contains the relative URL for the next set of results, using a cursor query parameter. This property will not be present if there is no additional data available.
     */
    @ApiStatus.Internal
    public MultiEntityResultAttachmentLinks(String next) {
        this.next = next;
    }

}
