
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
    "uses",
    "awardedCount"
})
@Generated("jsonschema2pojo")
public class Properties__122 {

    @JsonProperty("extraStat1")
    private Integer extraStat1;
    @JsonProperty("uses")
    private Integer uses;
    @JsonProperty("awardedCount")
    private Integer awardedCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("awardedCount")
    public Integer getAwardedCount() {
        return awardedCount;
    }

    @JsonProperty("awardedCount")
    public void setAwardedCount(Integer awardedCount) {
        this.awardedCount = awardedCount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
