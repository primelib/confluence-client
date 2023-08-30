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
 * MovePage200Response
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
    "pageId"
})
@JsonTypeName("movePage_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MovePage200Response {

    @JsonProperty("pageId")
    protected String pageId;

    /**
     * Constructs a validated instance of {@link MovePage200Response}.
     *
     * @param spec the specification to process
     */
    public MovePage200Response(Consumer<MovePage200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MovePage200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MovePage200Response(Consumer)} instead.
     * @param pageId pageId
     */
    @ApiStatus.Internal
    public MovePage200Response(String pageId) {
        this.pageId = pageId;
    }

}
