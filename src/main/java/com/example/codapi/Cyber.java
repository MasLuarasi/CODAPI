
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
    "plants",
    "scorePerMinute",
    "revives",
    "deaths"
})
@Generated("jsonschema2pojo")
public class Cyber {

    @JsonProperty("kills")
    private Integer kills;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("timePlayed")
    private Integer timePlayed;
    @JsonProperty("kdRatio")
    private Double kdRatio;
    @JsonProperty("plants")
    private Integer plants;
    @JsonProperty("scorePerMinute")
    private Double scorePerMinute;
    @JsonProperty("revives")
    private Integer revives;
    @JsonProperty("deaths")
    private Integer deaths;
    @JsonIgnore
    private DecimalFormat numberFormat;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cyber() {
    }

    /**
     * 
     * @param kills
     * @param score
     * @param timePlayed
     * @param kdRatio
     * @param plants
     * @param scorePerMinute
     * @param revives
     * @param deaths
     */
    public Cyber(Integer kills, Integer score, Integer timePlayed, Double kdRatio, Integer plants, Double scorePerMinute, Integer revives, Integer deaths) {
        super();
        this.kills = kills;
        this.score = score;
        this.timePlayed = timePlayed;
        this.kdRatio = kdRatio;
        this.plants = plants;
        this.scorePerMinute = scorePerMinute;
        this.revives = revives;
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

    @JsonProperty("plants")
    public Integer getPlants() {
        return plants;
    }

    @JsonProperty("plants")
    public void setPlants(Integer plants) {
        this.plants = plants;
    }

    @JsonProperty("scorePerMinute")
    public Double getScorePerMinute() {
        return scorePerMinute;
    }

    @JsonProperty("scorePerMinute")
    public void setScorePerMinute(Double scorePerMinute) {
        this.scorePerMinute = scorePerMinute;
    }

    @JsonProperty("revives")
    public Integer getRevives() {
        return revives;
    }

    @JsonProperty("revives")
    public void setRevives(Integer revives) {
        this.revives = revives;
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
        sb.append(Cyber.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("plants");
        sb.append('=');
        sb.append(((this.plants == null)?"<null>":this.plants));
        sb.append(',');
        sb.append("scorePerMinute");
        sb.append('=');
        sb.append(((this.scorePerMinute == null)?"<null>":this.scorePerMinute));
        sb.append(',');
        sb.append("revives");
        sb.append('=');
        sb.append(((this.revives == null)?"<null>":this.revives));
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
