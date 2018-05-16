
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
    "isPermaLink",
    "content"
})
public class Guid {

    @JsonProperty("isPermaLink")
    private String isPermaLink;
    @JsonProperty("content")
    private String content;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isPermaLink")
    public String getIsPermaLink() {
        return isPermaLink;
    }

    @JsonProperty("isPermaLink")
    public void setIsPermaLink(String isPermaLink) {
        this.isPermaLink = isPermaLink;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
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
        return new ToStringBuilder(this).append("isPermaLink", isPermaLink).append("content", content).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(content).append(isPermaLink).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Guid) == false) {
            return false;
        }
        Guid rhs = ((Guid) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(content, rhs.content).append(isPermaLink, rhs.isPermaLink).isEquals();
    }

}
