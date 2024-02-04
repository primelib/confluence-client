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
 * SystemInfoEntity
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
    "cloudId",
    "commitHash",
    "baseUrl",
    "edition",
    "siteTitle",
    "defaultLocale",
    "defaultTimeZone",
    "microsImpactLevel"
})
@JsonTypeName("SystemInfoEntity")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SystemInfoEntity {

    @JsonProperty("cloudId")
    protected String cloudId;

    @JsonProperty("commitHash")
    protected String commitHash;

    @JsonProperty("baseUrl")
    protected String baseUrl;

    @JsonProperty("edition")
    protected String edition;

    @JsonProperty("siteTitle")
    protected String siteTitle;

    @JsonProperty("defaultLocale")
    protected String defaultLocale;

    @JsonProperty("defaultTimeZone")
    protected String defaultTimeZone;

    @JsonProperty("microsImpactLevel")
    protected String microsImpactLevel;

    /**
     * Constructs a validated instance of {@link SystemInfoEntity}.
     *
     * @param spec the specification to process
     */
    public SystemInfoEntity(Consumer<SystemInfoEntity> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SystemInfoEntity}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SystemInfoEntity(Consumer)} instead.
     * @param cloudId cloudId
     * @param commitHash commitHash
     * @param baseUrl baseUrl
     * @param edition edition
     * @param siteTitle siteTitle
     * @param defaultLocale defaultLocale
     * @param defaultTimeZone defaultTimeZone
     * @param microsImpactLevel microsImpactLevel
     */
    @ApiStatus.Internal
    public SystemInfoEntity(String cloudId, String commitHash, String baseUrl, String edition, String siteTitle, String defaultLocale, String defaultTimeZone, String microsImpactLevel) {
        this.cloudId = cloudId;
        this.commitHash = commitHash;
        this.baseUrl = baseUrl;
        this.edition = edition;
        this.siteTitle = siteTitle;
        this.defaultLocale = defaultLocale;
        this.defaultTimeZone = defaultTimeZone;
        this.microsImpactLevel = microsImpactLevel;
    }

}
