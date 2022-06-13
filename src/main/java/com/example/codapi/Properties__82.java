
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
    "kills",
    "misc1",
    "misc2",
    "uses"
})
@Generated("jsonschema2pojo")
public class Properties__82 {

    @JsonProperty("kills")
    private Integer kills;
    @JsonProperty("misc1")
    private Integer misc1;
    @JsonProperty("misc2")
    private Integer misc2;
    @JsonProperty("uses")
    private Integer uses;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("kills")
    public Integer getKills() {
        return kills;
    }

    @JsonProperty("kills")
    public void setKills(Integer kills) {
        this.kills = kills;
    }

    @JsonProperty("misc1")
    public Integer getMisc1() {
        return misc1;
    }

    @JsonProperty("misc1")
    public void setMisc1(Integer misc1) {
        this.misc1 = misc1;
    }

    @JsonProperty("misc2")
    public Integer getMisc2() {
        return misc2;
    }

    @JsonProperty("misc2")
    public void setMisc2(Integer misc2) {
        this.misc2 = misc2;
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

}
