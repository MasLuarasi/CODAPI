
package com.example.codapi;

import java.util.HashMap;
import javax.annotation.Generated;

import com.example.codapi.Mode;
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
    private Map map;
    @JsonProperty("itemData")
    private ItemData itemData;
    @JsonProperty("scorestreakData")
    private ScorestreakData scorestreakData;
    @JsonProperty("accoladeData")
    private AccoladeData accoladeData;
    @JsonIgnore
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    public Map getMap() {
        return map;
    }

    @JsonProperty("map")
    public void setMap(Map map) {
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

}
