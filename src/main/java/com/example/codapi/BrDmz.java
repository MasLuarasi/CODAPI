
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
public class BrDmz {

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

    /**
     * No args constructor for use in serialization
     * 
     */
    public BrDmz() {
    }

    /**
     * 
     * @param wins
     * @param kills
     * @param kdRatio
     * @param downs
     * @param topTwentyFive
     * @param objTime
     * @param topTen
     * @param contracts
     * @param revives
     * @param topFive
     * @param score
     * @param timePlayed
     * @param gamesPlayed
     * @param tokens
     * @param scorePerMinute
     * @param cash
     * @param deaths
     */
    public BrDmz(Integer wins, Integer kills, Double kdRatio, Integer downs, Integer topTwentyFive, Integer objTime, Integer topTen, Integer contracts, Integer revives, Integer topFive, Integer score, Integer timePlayed, Integer gamesPlayed, Integer tokens, Double scorePerMinute, Integer cash, Integer deaths) {
        super();
        this.wins = wins;
        this.kills = kills;
        this.kdRatio = kdRatio;
        this.downs = downs;
        this.topTwentyFive = topTwentyFive;
        this.objTime = objTime;
        this.topTen = topTen;
        this.contracts = contracts;
        this.revives = revives;
        this.topFive = topFive;
        this.score = score;
        this.timePlayed = timePlayed;
        this.gamesPlayed = gamesPlayed;
        this.tokens = tokens;
        this.scorePerMinute = scorePerMinute;
        this.cash = cash;
        this.deaths = deaths;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BrDmz.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("wins");
        sb.append('=');
        sb.append(((this.wins == null)?"<null>":this.wins));
        sb.append(',');
        sb.append("kills");
        sb.append('=');
        sb.append(((this.kills == null)?"<null>":this.kills));
        sb.append(',');
        sb.append("kdRatio");
        sb.append('=');
        sb.append(((this.kdRatio == null)?"<null>":this.kdRatio));
        sb.append(',');
        sb.append("downs");
        sb.append('=');
        sb.append(((this.downs == null)?"<null>":this.downs));
        sb.append(',');
        sb.append("topTwentyFive");
        sb.append('=');
        sb.append(((this.topTwentyFive == null)?"<null>":this.topTwentyFive));
        sb.append(',');
        sb.append("objTime");
        sb.append('=');
        sb.append(((this.objTime == null)?"<null>":this.objTime));
        sb.append(',');
        sb.append("topTen");
        sb.append('=');
        sb.append(((this.topTen == null)?"<null>":this.topTen));
        sb.append(',');
        sb.append("contracts");
        sb.append('=');
        sb.append(((this.contracts == null)?"<null>":this.contracts));
        sb.append(',');
        sb.append("revives");
        sb.append('=');
        sb.append(((this.revives == null)?"<null>":this.revives));
        sb.append(',');
        sb.append("topFive");
        sb.append('=');
        sb.append(((this.topFive == null)?"<null>":this.topFive));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("timePlayed");
        sb.append('=');
        sb.append(((this.timePlayed == null)?"<null>":this.timePlayed));
        sb.append(',');
        sb.append("gamesPlayed");
        sb.append('=');
        sb.append(((this.gamesPlayed == null)?"<null>":this.gamesPlayed));
        sb.append(',');
        sb.append("tokens");
        sb.append('=');
        sb.append(((this.tokens == null)?"<null>":this.tokens));
        sb.append(',');
        sb.append("scorePerMinute");
        sb.append('=');
        sb.append(((this.scorePerMinute == null)?"<null>":this.scorePerMinute));
        sb.append(',');
        sb.append("cash");
        sb.append('=');
        sb.append(((this.cash == null)?"<null>":this.cash));
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
