
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
    "hits",
    "kills",
    "kdRatio",
    "headshots",
    "accuracy",
    "shots",
    "deaths"
})
@Generated("jsonschema2pojo")
public class Iw8Knife {

    @JsonProperty("hits")
    private Integer hits;
    @JsonProperty("kills")
    private Integer kills;
    @JsonProperty("kdRatio")
    private Double kdRatio;
    @JsonProperty("headshots")
    private Integer headshots;
    @JsonProperty("accuracy")
    private Integer accuracy;
    @JsonProperty("shots")
    private Integer shots;
    @JsonProperty("deaths")
    private Integer deaths;
    @JsonIgnore
    private String name;

    public Iw8Knife() {}

    public Iw8Knife(Integer hits, Integer kills, Double kdRatio, Integer headshots, Integer accuracy, Integer shots, Integer deaths)
    {
        super();
        this.hits = hits;
        this.kills = kills;
        this.kdRatio = kdRatio;
        this.headshots = headshots;
        this.accuracy = accuracy;
        this.shots = shots;
        this.deaths = deaths;
    }

    @JsonProperty("hits")
    public Integer getHits() {
        return hits;
    }

    @JsonProperty("hits")
    public void setHits(Integer hits) {
        this.hits = hits;
    }

    @JsonProperty("kills")
    public Integer getKills() {
        return kills;
    }

    @JsonProperty("kills")
    public void setKills(Integer kills) {
        this.kills = kills;
    }

    @JsonProperty("kdRatio")
    public Double getKdRatio() {
        return kdRatio;
    }

    @JsonProperty("kdRatio")
    public void setKdRatio(Double kdRatio) {
        this.kdRatio = kdRatio;
    }

    @JsonProperty("headshots")
    public Integer getHeadshots() {
        return headshots;
    }

    @JsonProperty("headshots")
    public void setHeadshots(Integer headshots) {
        this.headshots = headshots;
    }

    @JsonProperty("accuracy")
    public Integer getAccuracy() {
        return accuracy;
    }

    @JsonProperty("accuracy")
    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    @JsonProperty("shots")
    public Integer getShots() {
        return shots;
    }

    @JsonProperty("shots")
    public void setShots(Integer shots) {
        this.shots = shots;
    }

    @JsonProperty("deaths")
    public Integer getDeaths() {
        return deaths;
    }

    @JsonProperty("deaths")
    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    @JsonAnyGetter
    public String getName() {return this.name;}

    @JsonAnySetter
    public void setName(String name) {this.name = name;}

    @Override
    public String toString()
    {
        StringBuilder ret = new StringBuilder();
        ret.append("Name:\t" + this.name + "\n");
        ret.append("Kills:\t" + this.kills + "\n");
        ret.append("Deaths:\t" + this.deaths + "\n");
        ret.append("K/D Ratio:\t" + this.kdRatio + "\n");
        ret.append("Shots:\t" + this.shots + "\n");
        ret.append("Hits:\t" + this.hits + "\n");
        ret.append("Accuracy: \t" + this.accuracy + "\n");
        ret.append("Headshots:\t" + this.headshots + "\n");
        return ret.toString();
    }

}
