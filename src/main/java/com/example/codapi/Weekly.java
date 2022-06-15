
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
    "map",
    "engagement"
})
@Generated("jsonschema2pojo")
public class Weekly {

    @JsonProperty("all")
    private All__1 all;
    @JsonProperty("mode")
    private Mode__1 mode;
    @JsonProperty("map")
    private Map__1 map;
    @JsonProperty("engagement")
    private Object engagement;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Weekly() {
    }

    /**
     * 
     * @param all
     * @param mode
     * @param engagement
     * @param map
     */
    public Weekly(All__1 all, Mode__1 mode, Map__1 map, Object engagement) {
        super();
        this.all = all;
        this.mode = mode;
        this.map = map;
        this.engagement = engagement;
    }

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

    @JsonProperty("engagement")
    public Object getEngagement() {
        return engagement;
    }

    @JsonProperty("engagement")
    public void setEngagement(Object engagement) {
        this.engagement = engagement;
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
        sb.append(Weekly.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("all");
        sb.append('=');
        sb.append(((this.all == null)?"<null>":this.all));
        sb.append(',');
        sb.append("mode");
        sb.append('=');
        sb.append(((this.mode == null)?"<null>":this.mode));
        sb.append(',');
        sb.append("map");
        sb.append('=');
        sb.append(((this.map == null)?"<null>":this.map));
        sb.append(',');
        sb.append("engagement");
        sb.append('=');
        sb.append(((this.engagement == null)?"<null>":this.engagement));
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
