
package com.example.codapi;

import java.util.HashMap;
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
    "itemData",
    "scorestreakData",
    "accoladeData"
})
@Generated("jsonschema2pojo")
public class Lifetime {

    @JsonProperty("all")
    private All all;
    @JsonProperty("mode")
    private Mode mode;
    @JsonProperty("map")
    private com.example.codapi.Map map;
    @JsonProperty("itemData")
    private ItemData itemData;
    @JsonProperty("scorestreakData")
    private ScorestreakData scorestreakData;
    @JsonProperty("accoladeData")
    private AccoladeData accoladeData;
    @JsonIgnore
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Lifetime() {
    }

    /**
     * 
     * @param all
     * @param mode
     * @param itemData
     * @param scorestreakData
     * @param map
     * @param accoladeData
     */
    public Lifetime(All all, Mode mode, com.example.codapi.Map map, ItemData itemData, ScorestreakData scorestreakData, AccoladeData accoladeData) {
        super();
        this.all = all;
        this.mode = mode;
        this.map = map;
        this.itemData = itemData;
        this.scorestreakData = scorestreakData;
        this.accoladeData = accoladeData;
    }

    @JsonProperty("all")
    public All getAll() {
        return all;
    }

    @JsonProperty("all")
    public void setAll(All all) {
        this.all = all;
    }

    @JsonProperty("mode")
    public Mode getMode() {
        return mode;
    }

    @JsonProperty("mode")
    public void setMode(Mode mode) {
        this.mode = mode;
    }

    @JsonProperty("map")
    public com.example.codapi.Map getMap() {
        return map;
    }

    @JsonProperty("map")
    public void setMap(com.example.codapi.Map map) {
        this.map = map;
    }

    @JsonProperty("itemData")
    public ItemData getItemData() {
        return itemData;
    }

    @JsonProperty("itemData")
    public void setItemData(ItemData itemData) {
        this.itemData = itemData;
    }

    @JsonProperty("scorestreakData")
    public ScorestreakData getScorestreakData() {
        return scorestreakData;
    }

    @JsonProperty("scorestreakData")
    public void setScorestreakData(ScorestreakData scorestreakData) {
        this.scorestreakData = scorestreakData;
    }

    @JsonProperty("accoladeData")
    public AccoladeData getAccoladeData() {
        return accoladeData;
    }

    @JsonProperty("accoladeData")
    public void setAccoladeData(AccoladeData accoladeData) {
        this.accoladeData = accoladeData;
    }

    @JsonAnyGetter
    public java.util.Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Lifetime.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("itemData");
        sb.append('=');
        sb.append(((this.itemData == null)?"<null>":this.itemData));
        sb.append(',');
        sb.append("scorestreakData");
        sb.append('=');
        sb.append(((this.scorestreakData == null)?"<null>":this.scorestreakData));
        sb.append(',');
        sb.append("accoladeData");
        sb.append('=');
        sb.append(((this.accoladeData == null)?"<null>":this.accoladeData));
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
