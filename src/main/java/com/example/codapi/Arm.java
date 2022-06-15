
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
    "captures",
    "defends",
    "scorePerMinute",
    "deaths"
})
@Generated("jsonschema2pojo")
public class Arm {

    @JsonProperty("kills")
    private Integer kills;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("timePlayed")
    private Integer timePlayed;
    @JsonProperty("kdRatio")
    private Double kdRatio;
    @JsonProperty("captures")
    private Integer captures;
    @JsonProperty("defends")
    private Integer defends;
    @JsonProperty("scorePerMinute")
    private Double scorePerMinute;
    @JsonProperty("deaths")
    private Integer deaths;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Arm() {
    }

    /**
     * 
     * @param kills
     * @param score
     * @param timePlayed
     * @param kdRatio
     * @param captures
     * @param defends
     * @param scorePerMinute
     * @param deaths
     */
    public Arm(Integer kills, Integer score, Integer timePlayed, Double kdRatio, Integer captures, Integer defends, Double scorePerMinute, Integer deaths) {
        super();
        this.kills = kills;
        this.score = score;
        this.timePlayed = timePlayed;
        this.kdRatio = kdRatio;
        this.captures = captures;
        this.defends = defends;
        this.scorePerMinute = scorePerMinute;
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
    public void setKdRatio(Double kdRatio) {
        this.kdRatio = kdRatio;
    }

    @JsonProperty("captures")
    public Integer getCaptures() {
        return captures;
    }

    @JsonProperty("captures")
    public void setCaptures(Integer captures) {
        this.captures = captures;
    }

    @JsonProperty("defends")
    public Integer getDefends() {
        return defends;
    }

    @JsonProperty("defends")
    public void setDefends(Integer defends) {
        this.defends = defends;
    }

    @JsonProperty("scorePerMinute")
    public Double getScorePerMinute() {
        return scorePerMinute;
    }

    @JsonProperty("scorePerMinute")
    public void setScorePerMinute(Double scorePerMinute) {
        this.scorePerMinute = scorePerMinute;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Arm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("captures");
        sb.append('=');
        sb.append(((this.captures == null)?"<null>":this.captures));
        sb.append(',');
        sb.append("defends");
        sb.append('=');
        sb.append(((this.defends == null)?"<null>":this.defends));
        sb.append(',');
        sb.append("scorePerMinute");
        sb.append('=');
        sb.append(((this.scorePerMinute == null)?"<null>":this.scorePerMinute));
        sb.append(',');
        sb.append("deaths");
        sb.append('=');
        sb.append(((this.deaths == null)?"<null>":this.deaths));
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
