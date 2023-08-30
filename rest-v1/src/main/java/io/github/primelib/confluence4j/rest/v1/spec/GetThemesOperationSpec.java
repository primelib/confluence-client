package io.github.primelib.confluence4j.rest.v1.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Theme;
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
 * GetThemesSpec
 * <p>
 * Specification for the GetThemes operation.
 * <p>
 * Get themes
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetThemesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The starting index of the returned themes.
     */
    @Nullable 
    private Integer start;

    /**
     * The maximum number of themes to return per page. Note, this may be restricted by fixed system limits.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetThemesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetThemesOperationSpec(Consumer<GetThemesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetThemesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param start                The starting index of the returned themes.
     * @param limit                The maximum number of themes to return per page. Note, this may be restricted by fixed system limits.
     */
    @ApiStatus.Internal
    public GetThemesOperationSpec(Integer start, Integer limit) {
        this.start = start;
        this.limit = limit;

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
