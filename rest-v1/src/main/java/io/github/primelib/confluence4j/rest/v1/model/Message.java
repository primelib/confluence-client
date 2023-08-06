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
 * Message
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
    "translation",
    "args"
})
@JsonTypeName("Message")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Message {

    @JsonProperty("translation")
    protected String translation;

    @JsonProperty("args")
    protected List<MessageArgsInner> args;

    /**
     * Constructs a validated instance of {@link Message}.
     *
     * @param spec the specification to process
     */
    public Message(Consumer<Message> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Message}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Message(Consumer)} instead.
     * @param translation translation
     * @param args args
     */
    @ApiStatus.Internal
    public Message(String translation, List<MessageArgsInner> args) {
        this.translation = translation;
        this.args = args;
    }

}
