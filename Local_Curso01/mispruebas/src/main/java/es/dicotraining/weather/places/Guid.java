
package es.dicotraining.weather.places;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
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
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "isPermaLink"
})
public class Guid {

    @JsonProperty("isPermaLink")
    private String isPermaLink;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The isPermaLink
     */
    @JsonProperty("isPermaLink")
    public String getIsPermaLink() {
        return isPermaLink;
    }

    /**
     * 
     * @param isPermaLink
     *     The isPermaLink
     */
    @JsonProperty("isPermaLink")
    public void setIsPermaLink(String isPermaLink) {
        this.isPermaLink = isPermaLink;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("isPermaLink".equals(name)) {
            if (value instanceof String) {
                setIsPermaLink(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"isPermaLink\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            return false;
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("isPermaLink".equals(name)) {
            return getIsPermaLink();
        } else {
            return notFoundValue;
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Guid.NOT_FOUND_VALUE);
        if (Guid.NOT_FOUND_VALUE!= value) {
            return ((T) value);
        } else {
            return ((T) getAdditionalProperties().get(name));
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public void set(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isPermaLink).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(isPermaLink, rhs.isPermaLink).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
