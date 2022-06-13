
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
    "sd",
    "arena"
})
@Generated("jsonschema2pojo")
public class Mode__1 {

    @JsonProperty("sd")
    private Sd__1 sd;
    @JsonProperty("arena")
    private Arena__1 arena;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sd")
    public Sd__1 getSd() {
        return sd;
    }

    @JsonProperty("sd")
    public void setSd(Sd__1 sd) {
        this.sd = sd;
    }

    @JsonProperty("arena")
    public Arena__1 getArena() {
        return arena;
    }

    @JsonProperty("arena")
    public void setArena(Arena__1 arena) {
        this.arena = arena;
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
