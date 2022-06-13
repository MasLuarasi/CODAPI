
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
    "all",
    "mode",
    "map"
})
@Generated("jsonschema2pojo")
public class Weekly {

    @JsonProperty("all")
    private All__1 all;
    @JsonProperty("mode")
    private Mode__1 mode;
    @JsonProperty("map")
    private Map__1 map;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("all")
    public All__1 getAll() {
        return all;
    }

    @JsonProperty("all")
    public void setAll(All__1 all) {
        this.all = all;
    }

    @JsonProperty("mode")
    public Mode__1 getMode() {
        return mode;
    }

    @JsonProperty("mode")
    public void setMode(Mode__1 mode) {
        this.mode = mode;
    }

    @JsonProperty("map")
    public Map__1 getMap() {
        return map;
    }

    @JsonProperty("map")
    public void setMap(Map__1 map) {
        this.map = map;
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
