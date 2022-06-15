
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
    "gun",
    "sd",
    "arena"
})
@Generated("jsonschema2pojo")
public class Mode__1 {

    @JsonProperty("gun")
    private Gun__1 gun;
    @JsonProperty("sd")
    private Sd__1 sd;
    @JsonProperty("arena")
    private Arena__1 arena;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mode__1() {
    }

    /**
     * 
     * @param gun
     * @param sd
     * @param arena
     */
    public Mode__1(Gun__1 gun, Sd__1 sd, Arena__1 arena) {
        super();
        this.gun = gun;
        this.sd = sd;
        this.arena = arena;
    }

    @JsonProperty("gun")
    public Gun__1 getGun() {
        return gun;
    }

    @JsonProperty("gun")
    public void setGun(Gun__1 gun) {
        this.gun = gun;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Mode__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gun");
        sb.append('=');
        sb.append(((this.gun == null)?"<null>":this.gun));
        sb.append(',');
        sb.append("sd");
        sb.append('=');
        sb.append(((this.sd == null)?"<null>":this.sd));
        sb.append(',');
        sb.append("arena");
        sb.append('=');
        sb.append(((this.arena == null)?"<null>":this.arena));
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
