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
 * CopyPageRequestBody
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
    "storage",
    "editor2"
})
@JsonTypeName("CopyPageRequest_body")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CopyPageRequestBody {

    @JsonProperty("storage")
    protected ContentBodyCreate storage;

    @JsonProperty("editor2")
    protected ContentBodyCreate editor2;

    /**
     * Constructs a validated instance of {@link CopyPageRequestBody}.
     *
     * @param spec the specification to process
     */
    public CopyPageRequestBody(Consumer<CopyPageRequestBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CopyPageRequestBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CopyPageRequestBody(Consumer)} instead.
     * @param storage storage
     * @param editor2 editor2
     */
    @ApiStatus.Internal
    public CopyPageRequestBody(ContentBodyCreate storage, ContentBodyCreate editor2) {
        this.storage = storage;
        this.editor2 = editor2;
    }

}
