
package com.example.codapi;

import java.text.DecimalFormat;
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
public class Conf {

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
    private DecimalFormat numberFormat;

    public Conf() {
    }

    public Conf(Integer kills, Integer score, Integer timePlayed, Double kdRatio, Integer confirms, Double scorePerMinute, Integer denies, Integer deaths) {
        super();
        this.kills = kills;
        this.score = score;
        this.timePlayed = timePlayed;
        this.kdRatio = kdRatio;
        this.confirms = confirms;
        this.scorePerMinute = scorePerMinute;
        this.denies = denies;
        this.deaths = deaths;
    }

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
    public void setKdRatio(Double kdRatio)
    {
        numberFormat = new DecimalFormat("#.00");
        this.kdRatio = Double.valueOf(numberFormat.format(kdRatio));
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Conf.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("kills");
        sb.append('=');
        sb.append(((this.kills == null)?"<null>":this.kills));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("timePlayed");
        sb.append('=');
        sb.append(((this.timePlayed == null)?"<null>":this.timePlayed));
        sb.append(',');
        sb.append("kdRatio");
        sb.append('=');
        sb.append(((this.kdRatio == null)?"<null>":this.kdRatio));
        sb.append(',');
        sb.append("confirms");
        sb.append('=');
        sb.append(((this.confirms == null)?"<null>":this.confirms));
        sb.append(',');
        sb.append("scorePerMinute");
        sb.append('=');
        sb.append(((this.scorePerMinute == null)?"<null>":this.scorePerMinute));
        sb.append(',');
        sb.append("denies");
        sb.append('=');
        sb.append(((this.denies == null)?"<null>":this.denies));
        sb.append(',');
        sb.append("deaths");
        sb.append('=');
        sb.append(((this.deaths == null)?"<null>":this.deaths));
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
