
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
    "iw8_pi_cpapa",
    "iw8_pi_mike9",
    "iw8_pi_mike1911",
    "iw8_pi_golf21",
    "iw8_pi_decho",
    "iw8_pi_papa320"
})
@Generated("jsonschema2pojo")
public class WeaponPistol {

    @JsonProperty("iw8_pi_cpapa")
    private Iw8PiCpapa iw8PiCpapa;
    @JsonProperty("iw8_pi_mike9")
    private Iw8PiMike9 iw8PiMike9;
    @JsonProperty("iw8_pi_mike1911")
    private Iw8PiMike1911 iw8PiMike1911;
    @JsonProperty("iw8_pi_golf21")
    private Iw8PiGolf21 iw8PiGolf21;
    @JsonProperty("iw8_pi_decho")
    private Iw8PiDecho iw8PiDecho;
    @JsonProperty("iw8_pi_papa320")
    private Iw8PiPapa320 iw8PiPapa320;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public WeaponPistol() {
    }

    /**
     * 
     * @param iw8PiMike1911
     * @param iw8PiCpapa
     * @param iw8PiPapa320
     * @param iw8PiGolf21
     * @param iw8PiDecho
     * @param iw8PiMike9
     */
    public WeaponPistol(Iw8PiCpapa iw8PiCpapa, Iw8PiMike9 iw8PiMike9, Iw8PiMike1911 iw8PiMike1911, Iw8PiGolf21 iw8PiGolf21, Iw8PiDecho iw8PiDecho, Iw8PiPapa320 iw8PiPapa320) {
        super();
        this.iw8PiCpapa = iw8PiCpapa;
        this.iw8PiMike9 = iw8PiMike9;
        this.iw8PiMike1911 = iw8PiMike1911;
        this.iw8PiGolf21 = iw8PiGolf21;
        this.iw8PiDecho = iw8PiDecho;
        this.iw8PiPapa320 = iw8PiPapa320;
    }

    @JsonProperty("iw8_pi_cpapa")
    public Iw8PiCpapa getIw8PiCpapa() {
        return iw8PiCpapa;
    }

    @JsonProperty("iw8_pi_cpapa")
    public void setIw8PiCpapa(Iw8PiCpapa iw8PiCpapa) {
        this.iw8PiCpapa = iw8PiCpapa;
    }

    @JsonProperty("iw8_pi_mike9")
    public Iw8PiMike9 getIw8PiMike9() {
        return iw8PiMike9;
    }

    @JsonProperty("iw8_pi_mike9")
    public void setIw8PiMike9(Iw8PiMike9 iw8PiMike9) {
        this.iw8PiMike9 = iw8PiMike9;
    }

    @JsonProperty("iw8_pi_mike1911")
    public Iw8PiMike1911 getIw8PiMike1911() {
        return iw8PiMike1911;
    }

    @JsonProperty("iw8_pi_mike1911")
    public void setIw8PiMike1911(Iw8PiMike1911 iw8PiMike1911) {
        this.iw8PiMike1911 = iw8PiMike1911;
    }

    @JsonProperty("iw8_pi_golf21")
    public Iw8PiGolf21 getIw8PiGolf21() {
        return iw8PiGolf21;
    }

    @JsonProperty("iw8_pi_golf21")
    public void setIw8PiGolf21(Iw8PiGolf21 iw8PiGolf21) {
        this.iw8PiGolf21 = iw8PiGolf21;
    }

    @JsonProperty("iw8_pi_decho")
    public Iw8PiDecho getIw8PiDecho() {
        return iw8PiDecho;
    }

    @JsonProperty("iw8_pi_decho")
    public void setIw8PiDecho(Iw8PiDecho iw8PiDecho) {
        this.iw8PiDecho = iw8PiDecho;
    }

    @JsonProperty("iw8_pi_papa320")
    public Iw8PiPapa320 getIw8PiPapa320() {
        return iw8PiPapa320;
    }

    @JsonProperty("iw8_pi_papa320")
    public void setIw8PiPapa320(Iw8PiPapa320 iw8PiPapa320) {
        this.iw8PiPapa320 = iw8PiPapa320;
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
        sb.append(WeaponPistol.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("iw8PiCpapa");
        sb.append('=');
        sb.append(((this.iw8PiCpapa == null)?"<null>":this.iw8PiCpapa));
        sb.append(',');
        sb.append("iw8PiMike9");
        sb.append('=');
        sb.append(((this.iw8PiMike9 == null)?"<null>":this.iw8PiMike9));
        sb.append(',');
        sb.append("iw8PiMike1911");
        sb.append('=');
        sb.append(((this.iw8PiMike1911 == null)?"<null>":this.iw8PiMike1911));
        sb.append(',');
        sb.append("iw8PiGolf21");
        sb.append('=');
        sb.append(((this.iw8PiGolf21 == null)?"<null>":this.iw8PiGolf21));
        sb.append(',');
        sb.append("iw8PiDecho");
        sb.append('=');
        sb.append(((this.iw8PiDecho == null)?"<null>":this.iw8PiDecho));
        sb.append(',');
        sb.append("iw8PiPapa320");
        sb.append('=');
        sb.append(((this.iw8PiPapa320 == null)?"<null>":this.iw8PiPapa320));
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
