
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
    "score",
    "timePlayed",
    "kdRatio",
    "confirms",
    "scorePerMinute",
    "denies",
    "deaths"
})
@Generated("jsonschema2pojo")
public class Properties__6 {

    @JsonProperty("kills")
    private Integer kills;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("timePlayed")
    private Integer timePlayed;
    @JsonProperty("kdRatio")
    private Double kdRatio;
    @JsonProperty("confirms")
    private Integer confirms;
    @JsonProperty("scorePerMinute")
    private Double scorePerMinute;
    @JsonProperty("denies")
    private Integer denies;
    @JsonProperty("deaths")
    private Integer deaths;
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

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonProperty("timePlayed")
    public Integer getTimePlayed() {
        return timePlayed;
    }

    @JsonProperty("timePlayed")
    public void setTimePlayed(Integer timePlayed) {
        this.timePlayed = timePlayed;
    }

    @JsonProperty("kdRatio")
    public Double getKdRatio() {
        return kdRatio;
    }

    @JsonProperty("kdRatio")
    public void setKdRatio(Double kdRatio) {
        this.kdRatio = kdRatio;
    }

    @JsonProperty("confirms")
    public Integer getConfirms() {
        return confirms;
    }

    @JsonProperty("confirms")
    public void setConfirms(Integer confirms) {
        this.confirms = confirms;
    }

    @JsonProperty("scorePerMinute")
    public Double getScorePerMinute() {
        return scorePerMinute;
    }

    @JsonProperty("scorePerMinute")
    public void setScorePerMinute(Double scorePerMinute) {
        this.scorePerMinute = scorePerMinute;
    }

    @JsonProperty("denies")
    public Integer getDenies() {
        return denies;
    }

    @JsonProperty("denies")
    public void setDenies(Integer denies) {
        this.denies = denies;
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
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
