
package com.example.codapi;

import java.text.DecimalFormat;
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
public class Iw8SnSksierra {

    @JsonProperty("hits")
    private Integer hits;
    @JsonProperty("kills")
    private Integer kills;
    @JsonProperty("kdRatio")
    private Double kdRatio;
    @JsonProperty("headshots")
    private Integer headshots;
    @JsonProperty("accuracy")
    private Double accuracy;
    @JsonProperty("shots")
    private Integer shots;
    @JsonProperty("deaths")
    private Integer deaths;
    @JsonIgnore
    private String name;
    @JsonIgnore
    private DecimalFormat numberFormat;

    public Iw8SnSksierra() {}

    public Iw8SnSksierra(Integer hits, Integer kills, Double kdRatio, Integer headshots, Double accuracy, Integer shots, Integer deaths)
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
    public void setKdRatio(Double kdRatio)
    {
        numberFormat = new DecimalFormat("#.00");
        this.kdRatio = Double.valueOf(numberFormat.format(kdRatio));
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
    public Double getAccuracy() {
        return accuracy;
    }

    @JsonProperty("accuracy")
    public void setAccuracy(Double accuracy) {this.accuracy = Double.valueOf(numberFormat.format(accuracy*100));}

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
