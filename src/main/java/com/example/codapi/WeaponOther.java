
package com.example.codapi;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "iw8_me_riotshield"
})
@Generated("jsonschema2pojo")
public class WeaponOther {

    @JsonProperty("iw8_me_riotshield")
    private Iw8MeRiotshield iw8MeRiotshield;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public WeaponOther() {}

    public WeaponOther(Iw8MeRiotshield iw8MeRiotshield)
    {
        super();
        this.iw8MeRiotshield = iw8MeRiotshield;
    }

    @JsonProperty("iw8_me_riotshield")
    public Iw8MeRiotshield getIw8MeRiotshield() {
        return iw8MeRiotshield;
    }

    @JsonProperty("iw8_me_riotshield")
    public void setIw8MeRiotshield(Iw8MeRiotshield iw8MeRiotshield) {
        this.iw8MeRiotshield = iw8MeRiotshield;
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
        StringBuilder sb = new StringBuilder();
        sb.append(WeaponOther.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("iw8MeRiotshield");
        sb.append('=');
        sb.append(((this.iw8MeRiotshield == null)?"<null>":this.iw8MeRiotshield));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
