
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
    "iw8_me_akimboblunt",
    "iw8_me_akimboblades",
    "iw8_knife"
})
@Generated("jsonschema2pojo")
public class WeaponMelee {

    @JsonProperty("iw8_me_akimboblunt")
    private Iw8MeAkimboblunt iw8MeAkimboblunt;
    @JsonProperty("iw8_me_akimboblades")
    private Iw8MeAkimboblades iw8MeAkimboblades;
    @JsonProperty("iw8_knife")
    private Iw8Knife iw8Knife;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public WeaponMelee() {
    }

    /**
     * 
     * @param iw8MeAkimboblunt
     * @param iw8MeAkimboblades
     * @param iw8Knife
     */
    public WeaponMelee(Iw8MeAkimboblunt iw8MeAkimboblunt, Iw8MeAkimboblades iw8MeAkimboblades, Iw8Knife iw8Knife) {
        super();
        this.iw8MeAkimboblunt = iw8MeAkimboblunt;
        this.iw8MeAkimboblades = iw8MeAkimboblades;
        this.iw8Knife = iw8Knife;
    }

    @JsonProperty("iw8_me_akimboblunt")
    public Iw8MeAkimboblunt getIw8MeAkimboblunt() {
        return iw8MeAkimboblunt;
    }

    @JsonProperty("iw8_me_akimboblunt")
    public void setIw8MeAkimboblunt(Iw8MeAkimboblunt iw8MeAkimboblunt) {
        this.iw8MeAkimboblunt = iw8MeAkimboblunt;
    }

    @JsonProperty("iw8_me_akimboblades")
    public Iw8MeAkimboblades getIw8MeAkimboblades() {
        return iw8MeAkimboblades;
    }

    @JsonProperty("iw8_me_akimboblades")
    public void setIw8MeAkimboblades(Iw8MeAkimboblades iw8MeAkimboblades) {
        this.iw8MeAkimboblades = iw8MeAkimboblades;
    }

    @JsonProperty("iw8_knife")
    public Iw8Knife getIw8Knife() {
        return iw8Knife;
    }

    @JsonProperty("iw8_knife")
    public void setIw8Knife(Iw8Knife iw8Knife) {
        this.iw8Knife = iw8Knife;
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
        sb.append(WeaponMelee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("iw8MeAkimboblunt");
        sb.append('=');
        sb.append(((this.iw8MeAkimboblunt == null)?"<null>":this.iw8MeAkimboblunt));
        sb.append(',');
        sb.append("iw8MeAkimboblades");
        sb.append('=');
        sb.append(((this.iw8MeAkimboblades == null)?"<null>":this.iw8MeAkimboblades));
        sb.append(',');
        sb.append("iw8Knife");
        sb.append('=');
        sb.append(((this.iw8Knife == null)?"<null>":this.iw8Knife));
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
