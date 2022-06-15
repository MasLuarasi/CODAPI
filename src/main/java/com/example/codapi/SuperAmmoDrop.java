
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
public class SuperAmmoDrop {

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

    /**
     * No args constructor for use in serialization
     * 
     */
    public SuperAmmoDrop() {
    }

    /**
     * 
     * @param kills
     * @param misc1
     * @param misc2
     * @param uses
     */
    public SuperAmmoDrop(Integer kills, Integer misc1, Integer misc2, Integer uses) {
        super();
        this.kills = kills;
        this.misc1 = misc1;
        this.misc2 = misc2;
        this.uses = uses;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SuperAmmoDrop.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("kills");
        sb.append('=');
        sb.append(((this.kills == null)?"<null>":this.kills));
        sb.append(',');
        sb.append("misc1");
        sb.append('=');
        sb.append(((this.misc1 == null)?"<null>":this.misc1));
        sb.append(',');
        sb.append("misc2");
        sb.append('=');
        sb.append(((this.misc2 == null)?"<null>":this.misc2));
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
