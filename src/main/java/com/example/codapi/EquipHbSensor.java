
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
    "extraStat1",
    "uses"
})
@Generated("jsonschema2pojo")
public class EquipHbSensor {

    @JsonProperty("extraStat1")
    private Integer extraStat1;
    @JsonProperty("uses")
    private Integer uses;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EquipHbSensor() {
    }

    /**
     * 
     * @param extraStat1
     * @param uses
     */
    public EquipHbSensor(Integer extraStat1, Integer uses) {
        super();
        this.extraStat1 = extraStat1;
        this.uses = uses;
    }

    @JsonProperty("extraStat1")
    public Integer getExtraStat1() {
        return extraStat1;
    }

    @JsonProperty("extraStat1")
    public void setExtraStat1(Integer extraStat1) {
        this.extraStat1 = extraStat1;
    }

    @JsonProperty("uses")
    public Integer getUses() {
        return uses;
    }

    @JsonProperty("uses")
    public void setUses(Integer uses) {
        this.uses = uses;
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
        sb.append(EquipHbSensor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("extraStat1");
        sb.append('=');
        sb.append(((this.extraStat1 == null)?"<null>":this.extraStat1));
        sb.append(',');
        sb.append("uses");
        sb.append('=');
        sb.append(((this.uses == null)?"<null>":this.uses));
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
