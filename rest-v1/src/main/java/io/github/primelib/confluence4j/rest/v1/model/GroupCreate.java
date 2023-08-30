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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GroupCreate
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
    "type",
    "name",
    "id"
})
@JsonTypeName("GroupCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GroupCreate {

    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("id")
    protected String id;

    /**
     * Constructs a validated instance of {@link GroupCreate}.
     *
     * @param spec the specification to process
     */
    public GroupCreate(Consumer<GroupCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GroupCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GroupCreate(Consumer)} instead.
     * @param type type
     * @param name name
     * @param id id
     */
    @ApiStatus.Internal
    public GroupCreate(TypeEnum type, String name, String id) {
        this.type = type;
        this.name = name;
        this.id = id;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        GROUP("group");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
