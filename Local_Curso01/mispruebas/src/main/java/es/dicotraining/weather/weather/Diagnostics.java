
package es.dicotraining.weather.weather;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "publiclyCallable",
    "url",
    "user-time",
    "service-time",
    "build-version"
})
public class Diagnostics {

    @JsonProperty("publiclyCallable")
    private String publiclyCallable;
    @JsonProperty("url")
    private Url url;
    @JsonProperty("user-time")
    private String userTime;
    @JsonProperty("service-time")
    private String serviceTime;
    @JsonProperty("build-version")
    private String buildVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("publiclyCallable")
    public String getPubliclyCallable() {
        return publiclyCallable;
    }

    @JsonProperty("publiclyCallable")
    public void setPubliclyCallable(String publiclyCallable) {
        this.publiclyCallable = publiclyCallable;
    }

    @JsonProperty("url")
    public Url getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Url url) {
        this.url = url;
    }

    @JsonProperty("user-time")
    public String getUserTime() {
        return userTime;
    }

    @JsonProperty("user-time")
    public void setUserTime(String userTime) {
        this.userTime = userTime;
    }

    @JsonProperty("service-time")
    public String getServiceTime() {
        return serviceTime;
    }

    @JsonProperty("service-time")
    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime;
    }

    @JsonProperty("build-version")
    public String getBuildVersion() {
        return buildVersion;
    }

    @JsonProperty("build-version")
    public void setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("publiclyCallable", publiclyCallable).append("url", url).append("userTime", userTime).append("serviceTime", serviceTime).append("buildVersion", buildVersion).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(publiclyCallable).append(buildVersion).append(userTime).append(additionalProperties).append(serviceTime).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Diagnostics) == false) {
            return false;
        }
        Diagnostics rhs = ((Diagnostics) other);
        return new EqualsBuilder().append(publiclyCallable, rhs.publiclyCallable).append(buildVersion, rhs.buildVersion).append(userTime, rhs.userTime).append(additionalProperties, rhs.additionalProperties).append(serviceTime, rhs.serviceTime).append(url, rhs.url).isEquals();
    }

}
