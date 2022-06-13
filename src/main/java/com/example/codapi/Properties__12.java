
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
    "wins",
    "kills",
    "kdRatio",
    "downs",
    "topTwentyFive",
    "objTime",
    "topTen",
    "contracts",
    "revives",
    "topFive",
    "score",
    "timePlayed",
    "gamesPlayed",
    "tokens",
    "scorePerMinute",
    "cash",
    "deaths"
})
@Generated("jsonschema2pojo")
public class Properties__12 {

    @JsonProperty("wins")
    private Integer wins;
    @JsonProperty("kills")
    private Integer kills;
    @JsonProperty("kdRatio")
    private Double kdRatio;
    @JsonProperty("downs")
    private Integer downs;
    @JsonProperty("topTwentyFive")
    private Integer topTwentyFive;
    @JsonProperty("objTime")
    private Integer objTime;
    @JsonProperty("topTen")
    private Integer topTen;
    @JsonProperty("contracts")
    private Integer contracts;
    @JsonProperty("revives")
    private Integer revives;
    @JsonProperty("topFive")
    private Integer topFive;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("timePlayed")
    private Integer timePlayed;
    @JsonProperty("gamesPlayed")
    private Integer gamesPlayed;
    @JsonProperty("tokens")
    private Integer tokens;
    @JsonProperty("scorePerMinute")
    private Double scorePerMinute;
    @JsonProperty("cash")
    private Integer cash;
    @JsonProperty("deaths")
    private Integer deaths;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("wins")
    public Integer getWins() {
        return wins;
    }

    @JsonProperty("wins")
    public void setWins(Integer wins) {
        this.wins = wins;
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

    @JsonProperty("downs")
    public Integer getDowns() {
        return downs;
    }

    @JsonProperty("downs")
    public void setDowns(Integer downs) {
        this.downs = downs;
    }

    @JsonProperty("topTwentyFive")
    public Integer getTopTwentyFive() {
        return topTwentyFive;
    }

    @JsonProperty("topTwentyFive")
    public void setTopTwentyFive(Integer topTwentyFive) {
        this.topTwentyFive = topTwentyFive;
    }

    @JsonProperty("objTime")
    public Integer getObjTime() {
        return objTime;
    }

    @JsonProperty("objTime")
    public void setObjTime(Integer objTime) {
        this.objTime = objTime;
    }

    @JsonProperty("topTen")
    public Integer getTopTen() {
        return topTen;
    }

    @JsonProperty("topTen")
    public void setTopTen(Integer topTen) {
        this.topTen = topTen;
    }

    @JsonProperty("contracts")
    public Integer getContracts() {
        return contracts;
    }

    @JsonProperty("contracts")
    public void setContracts(Integer contracts) {
        this.contracts = contracts;
    }

    @JsonProperty("revives")
    public Integer getRevives() {
        return revives;
    }

    @JsonProperty("revives")
    public void setRevives(Integer revives) {
        this.revives = revives;
    }

    @JsonProperty("topFive")
    public Integer getTopFive() {
        return topFive;
    }

    @JsonProperty("topFive")
    public void setTopFive(Integer topFive) {
        this.topFive = topFive;
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

    @JsonProperty("gamesPlayed")
    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    @JsonProperty("gamesPlayed")
    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    @JsonProperty("tokens")
    public Integer getTokens() {
        return tokens;
    }

    @JsonProperty("tokens")
    public void setTokens(Integer tokens) {
        this.tokens = tokens;
    }

    @JsonProperty("scorePerMinute")
    public Double getScorePerMinute() {
        return scorePerMinute;
    }

    @JsonProperty("scorePerMinute")
    public void setScorePerMinute(Double scorePerMinute) {
        this.scorePerMinute = scorePerMinute;
    }

    @JsonProperty("cash")
    public Integer getCash() {
        return cash;
    }

    @JsonProperty("cash")
    public void setCash(Integer cash) {
        this.cash = cash;
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
