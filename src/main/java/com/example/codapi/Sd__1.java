
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
    "medalXp",
    "matchXp",
    "averageSpeedDuringMatch",
    "scoreXp",
    "accuracy",
    "wallBangs",
    "losses",
    "avgLifeTime",
    "shotsLanded",
    "score",
    "totalXp",
    "headshots",
    "assists",
    "rank",
    "draws",
    "scorePerMinute",
    "distanceTraveled",
    "deaths",
    "wins",
    "kdRatio",
    "shotsMissed",
    "scorePerGame",
    "timePlayed",
    "headshotPercentage",
    "matchesPlayed",
    "executions",
    "suicides",
    "seasonRank",
    "wlRatio",
    "nearmisses",
    "percentTimeMoving",
    "miscXp",
    "longestStreak",
    "damageDone",
    "shotsFired",
    "damageTaken"
})
@Generated("jsonschema2pojo")
public class Sd__1 {

    @JsonProperty("kills")
    private Integer kills;
    @JsonProperty("medalXp")
    private Integer medalXp;
    @JsonProperty("matchXp")
    private Integer matchXp;
    @JsonProperty("averageSpeedDuringMatch")
    private Double averageSpeedDuringMatch;
    @JsonProperty("scoreXp")
    private Integer scoreXp;
    @JsonProperty("accuracy")
    private Double accuracy;
    @JsonProperty("wallBangs")
    private Integer wallBangs;
    @JsonProperty("losses")
    private Integer losses;
    @JsonProperty("avgLifeTime")
    private Double avgLifeTime;
    @JsonProperty("shotsLanded")
    private Integer shotsLanded;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("totalXp")
    private Integer totalXp;
    @JsonProperty("headshots")
    private Integer headshots;
    @JsonProperty("assists")
    private Integer assists;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("draws")
    private Integer draws;
    @JsonProperty("scorePerMinute")
    private Double scorePerMinute;
    @JsonProperty("distanceTraveled")
    private Double distanceTraveled;
    @JsonProperty("deaths")
    private Integer deaths;
    @JsonProperty("wins")
    private Integer wins;
    @JsonProperty("kdRatio")
    private Double kdRatio;
    @JsonProperty("shotsMissed")
    private Integer shotsMissed;
    @JsonProperty("scorePerGame")
    private Integer scorePerGame;
    @JsonProperty("timePlayed")
    private Integer timePlayed;
    @JsonProperty("headshotPercentage")
    private Double headshotPercentage;
    @JsonProperty("matchesPlayed")
    private Integer matchesPlayed;
    @JsonProperty("executions")
    private Integer executions;
    @JsonProperty("suicides")
    private Integer suicides;
    @JsonProperty("seasonRank")
    private Integer seasonRank;
    @JsonProperty("wlRatio")
    private Double wlRatio;
    @JsonProperty("nearmisses")
    private Integer nearmisses;
    @JsonProperty("percentTimeMoving")
    private Double percentTimeMoving;
    @JsonProperty("miscXp")
    private Integer miscXp;
    @JsonProperty("longestStreak")
    private Integer longestStreak;
    @JsonProperty("damageDone")
    private Integer damageDone;
    @JsonProperty("shotsFired")
    private Integer shotsFired;
    @JsonProperty("damageTaken")
    private Integer damageTaken;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sd__1() {
    }

    /**
     * 
     * @param kills
     * @param medalXp
     * @param matchXp
     * @param averageSpeedDuringMatch
     * @param scoreXp
     * @param accuracy
     * @param wallBangs
     * @param losses
     * @param avgLifeTime
     * @param shotsLanded
     * @param score
     * @param totalXp
     * @param headshots
     * @param assists
     * @param rank
     * @param draws
     * @param scorePerMinute
     * @param distanceTraveled
     * @param deaths
     * @param wins
     * @param kdRatio
     * @param shotsMissed
     * @param scorePerGame
     * @param timePlayed
     * @param headshotPercentage
     * @param matchesPlayed
     * @param executions
     * @param suicides
     * @param seasonRank
     * @param wlRatio
     * @param nearmisses
     * @param percentTimeMoving
     * @param miscXp
     * @param longestStreak
     * @param damageDone
     * @param shotsFired
     * @param damageTaken
     */
    public Sd__1(Integer kills, Integer medalXp, Integer matchXp, Double averageSpeedDuringMatch, Integer scoreXp, Double accuracy, Integer wallBangs, Integer losses, Double avgLifeTime, Integer shotsLanded, Integer score, Integer totalXp, Integer headshots, Integer assists, Integer rank, Integer draws, Double scorePerMinute, Double distanceTraveled, Integer deaths, Integer wins, Double kdRatio, Integer shotsMissed, Integer scorePerGame, Integer timePlayed, Double headshotPercentage, Integer matchesPlayed, Integer executions, Integer suicides, Integer seasonRank, Double wlRatio, Integer nearmisses, Double percentTimeMoving, Integer miscXp, Integer longestStreak, Integer damageDone, Integer shotsFired, Integer damageTaken) {
        super();
        this.kills = kills;
        this.medalXp = medalXp;
        this.matchXp = matchXp;
        this.averageSpeedDuringMatch = averageSpeedDuringMatch;
        this.scoreXp = scoreXp;
        this.accuracy = accuracy;
        this.wallBangs = wallBangs;
        this.losses = losses;
        this.avgLifeTime = avgLifeTime;
        this.shotsLanded = shotsLanded;
        this.score = score;
        this.totalXp = totalXp;
        this.headshots = headshots;
        this.assists = assists;
        this.rank = rank;
        this.draws = draws;
        this.scorePerMinute = scorePerMinute;
        this.distanceTraveled = distanceTraveled;
        this.deaths = deaths;
        this.wins = wins;
        this.kdRatio = kdRatio;
        this.shotsMissed = shotsMissed;
        this.scorePerGame = scorePerGame;
        this.timePlayed = timePlayed;
        this.headshotPercentage = headshotPercentage;
        this.matchesPlayed = matchesPlayed;
        this.executions = executions;
        this.suicides = suicides;
        this.seasonRank = seasonRank;
        this.wlRatio = wlRatio;
        this.nearmisses = nearmisses;
        this.percentTimeMoving = percentTimeMoving;
        this.miscXp = miscXp;
        this.longestStreak = longestStreak;
        this.damageDone = damageDone;
        this.shotsFired = shotsFired;
        this.damageTaken = damageTaken;
    }

    @JsonProperty("kills")
    public Integer getKills() {
        return kills;
    }

    @JsonProperty("kills")
    public void setKills(Integer kills) {
        this.kills = kills;
    }

    @JsonProperty("medalXp")
    public Integer getMedalXp() {
        return medalXp;
    }

    @JsonProperty("medalXp")
    public void setMedalXp(Integer medalXp) {
        this.medalXp = medalXp;
    }

    @JsonProperty("matchXp")
    public Integer getMatchXp() {
        return matchXp;
    }

    @JsonProperty("matchXp")
    public void setMatchXp(Integer matchXp) {
        this.matchXp = matchXp;
    }

    @JsonProperty("averageSpeedDuringMatch")
    public Double getAverageSpeedDuringMatch() {
        return averageSpeedDuringMatch;
    }

    @JsonProperty("averageSpeedDuringMatch")
    public void setAverageSpeedDuringMatch(Double averageSpeedDuringMatch) {
        this.averageSpeedDuringMatch = averageSpeedDuringMatch;
    }

    @JsonProperty("scoreXp")
    public Integer getScoreXp() {
        return scoreXp;
    }

    @JsonProperty("scoreXp")
    public void setScoreXp(Integer scoreXp) {
        this.scoreXp = scoreXp;
    }

    @JsonProperty("accuracy")
    public Double getAccuracy() {
        return accuracy;
    }

    @JsonProperty("accuracy")
    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    @JsonProperty("wallBangs")
    public Integer getWallBangs() {
        return wallBangs;
    }

    @JsonProperty("wallBangs")
    public void setWallBangs(Integer wallBangs) {
        this.wallBangs = wallBangs;
    }

    @JsonProperty("losses")
    public Integer getLosses() {
        return losses;
    }

    @JsonProperty("losses")
    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    @JsonProperty("avgLifeTime")
    public Double getAvgLifeTime() {
        return avgLifeTime;
    }

    @JsonProperty("avgLifeTime")
    public void setAvgLifeTime(Double avgLifeTime) {
        this.avgLifeTime = avgLifeTime;
    }

    @JsonProperty("shotsLanded")
    public Integer getShotsLanded() {
        return shotsLanded;
    }

    @JsonProperty("shotsLanded")
    public void setShotsLanded(Integer shotsLanded) {
        this.shotsLanded = shotsLanded;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonProperty("totalXp")
    public Integer getTotalXp() {
        return totalXp;
    }

    @JsonProperty("totalXp")
    public void setTotalXp(Integer totalXp) {
        this.totalXp = totalXp;
    }

    @JsonProperty("headshots")
    public Integer getHeadshots() {
        return headshots;
    }

    @JsonProperty("headshots")
    public void setHeadshots(Integer headshots) {
        this.headshots = headshots;
    }

    @JsonProperty("assists")
    public Integer getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("draws")
    public Integer getDraws() {
        return draws;
    }

    @JsonProperty("draws")
    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    @JsonProperty("scorePerMinute")
    public Double getScorePerMinute() {
        return scorePerMinute;
    }

    @JsonProperty("scorePerMinute")
    public void setScorePerMinute(Double scorePerMinute) {
        this.scorePerMinute = scorePerMinute;
    }

    @JsonProperty("distanceTraveled")
    public Double getDistanceTraveled() {
        return distanceTraveled;
    }

    @JsonProperty("distanceTraveled")
    public void setDistanceTraveled(Double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    @JsonProperty("deaths")
    public Integer getDeaths() {
        return deaths;
    }

    @JsonProperty("deaths")
    public void setDeaths(Integer deaths) {
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

    @JsonProperty("kdRatio")
    public Double getKdRatio() {
        return kdRatio;
    }

    @JsonProperty("kdRatio")
    public void setKdRatio(Double kdRatio) {
        this.kdRatio = kdRatio;
    }

    @JsonProperty("shotsMissed")
    public Integer getShotsMissed() {
        return shotsMissed;
    }

    @JsonProperty("shotsMissed")
    public void setShotsMissed(Integer shotsMissed) {
        this.shotsMissed = shotsMissed;
    }

    @JsonProperty("scorePerGame")
    public Integer getScorePerGame() {
        return scorePerGame;
    }

    @JsonProperty("scorePerGame")
    public void setScorePerGame(Integer scorePerGame) {
        this.scorePerGame = scorePerGame;
    }

    @JsonProperty("timePlayed")
    public Integer getTimePlayed() {
        return timePlayed;
    }

    @JsonProperty("timePlayed")
    public void setTimePlayed(Integer timePlayed) {
        this.timePlayed = timePlayed;
    }

    @JsonProperty("headshotPercentage")
    public Double getHeadshotPercentage() {
        return headshotPercentage;
    }

    @JsonProperty("headshotPercentage")
    public void setHeadshotPercentage(Double headshotPercentage) {
        this.headshotPercentage = headshotPercentage;
    }

    @JsonProperty("matchesPlayed")
    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    @JsonProperty("matchesPlayed")
    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    @JsonProperty("executions")
    public Integer getExecutions() {
        return executions;
    }

    @JsonProperty("executions")
    public void setExecutions(Integer executions) {
        this.executions = executions;
    }

    @JsonProperty("suicides")
    public Integer getSuicides() {
        return suicides;
    }

    @JsonProperty("suicides")
    public void setSuicides(Integer suicides) {
        this.suicides = suicides;
    }

    @JsonProperty("seasonRank")
    public Integer getSeasonRank() {
        return seasonRank;
    }

    @JsonProperty("seasonRank")
    public void setSeasonRank(Integer seasonRank) {
        this.seasonRank = seasonRank;
    }

    @JsonProperty("wlRatio")
    public Double getWlRatio() {
        return wlRatio;
    }

    @JsonProperty("wlRatio")
    public void setWlRatio(Double wlRatio) {
        this.wlRatio = wlRatio;
    }

    @JsonProperty("nearmisses")
    public Integer getNearmisses() {
        return nearmisses;
    }

    @JsonProperty("nearmisses")
    public void setNearmisses(Integer nearmisses) {
        this.nearmisses = nearmisses;
    }

    @JsonProperty("percentTimeMoving")
    public Double getPercentTimeMoving() {
        return percentTimeMoving;
    }

    @JsonProperty("percentTimeMoving")
    public void setPercentTimeMoving(Double percentTimeMoving) {
        this.percentTimeMoving = percentTimeMoving;
    }

    @JsonProperty("miscXp")
    public Integer getMiscXp() {
        return miscXp;
    }

    @JsonProperty("miscXp")
    public void setMiscXp(Integer miscXp) {
        this.miscXp = miscXp;
    }

    @JsonProperty("longestStreak")
    public Integer getLongestStreak() {
        return longestStreak;
    }

    @JsonProperty("longestStreak")
    public void setLongestStreak(Integer longestStreak) {
        this.longestStreak = longestStreak;
    }

    @JsonProperty("damageDone")
    public Integer getDamageDone() {
        return damageDone;
    }

    @JsonProperty("damageDone")
    public void setDamageDone(Integer damageDone) {
        this.damageDone = damageDone;
    }

    @JsonProperty("shotsFired")
    public Integer getShotsFired() {
        return shotsFired;
    }

    @JsonProperty("shotsFired")
    public void setShotsFired(Integer shotsFired) {
        this.shotsFired = shotsFired;
    }

    @JsonProperty("damageTaken")
    public Integer getDamageTaken() {
        return damageTaken;
    }

    @JsonProperty("damageTaken")
    public void setDamageTaken(Integer damageTaken) {
        this.damageTaken = damageTaken;
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
        sb.append(Sd__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("kills");
        sb.append('=');
        sb.append(((this.kills == null)?"<null>":this.kills));
        sb.append(',');
        sb.append("medalXp");
        sb.append('=');
        sb.append(((this.medalXp == null)?"<null>":this.medalXp));
        sb.append(',');
        sb.append("matchXp");
        sb.append('=');
        sb.append(((this.matchXp == null)?"<null>":this.matchXp));
        sb.append(',');
        sb.append("averageSpeedDuringMatch");
        sb.append('=');
        sb.append(((this.averageSpeedDuringMatch == null)?"<null>":this.averageSpeedDuringMatch));
        sb.append(',');
        sb.append("scoreXp");
        sb.append('=');
        sb.append(((this.scoreXp == null)?"<null>":this.scoreXp));
        sb.append(',');
        sb.append("accuracy");
        sb.append('=');
        sb.append(((this.accuracy == null)?"<null>":this.accuracy));
        sb.append(',');
        sb.append("wallBangs");
        sb.append('=');
        sb.append(((this.wallBangs == null)?"<null>":this.wallBangs));
        sb.append(',');
        sb.append("losses");
        sb.append('=');
        sb.append(((this.losses == null)?"<null>":this.losses));
        sb.append(',');
        sb.append("avgLifeTime");
        sb.append('=');
        sb.append(((this.avgLifeTime == null)?"<null>":this.avgLifeTime));
        sb.append(',');
        sb.append("shotsLanded");
        sb.append('=');
        sb.append(((this.shotsLanded == null)?"<null>":this.shotsLanded));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("totalXp");
        sb.append('=');
        sb.append(((this.totalXp == null)?"<null>":this.totalXp));
        sb.append(',');
        sb.append("headshots");
        sb.append('=');
        sb.append(((this.headshots == null)?"<null>":this.headshots));
        sb.append(',');
        sb.append("assists");
        sb.append('=');
        sb.append(((this.assists == null)?"<null>":this.assists));
        sb.append(',');
        sb.append("rank");
        sb.append('=');
        sb.append(((this.rank == null)?"<null>":this.rank));
        sb.append(',');
        sb.append("draws");
        sb.append('=');
        sb.append(((this.draws == null)?"<null>":this.draws));
        sb.append(',');
        sb.append("scorePerMinute");
        sb.append('=');
        sb.append(((this.scorePerMinute == null)?"<null>":this.scorePerMinute));
        sb.append(',');
        sb.append("distanceTraveled");
        sb.append('=');
        sb.append(((this.distanceTraveled == null)?"<null>":this.distanceTraveled));
        sb.append(',');
        sb.append("deaths");
        sb.append('=');
        sb.append(((this.deaths == null)?"<null>":this.deaths));
        sb.append(',');
        sb.append("wins");
        sb.append('=');
        sb.append(((this.wins == null)?"<null>":this.wins));
        sb.append(',');
        sb.append("kdRatio");
        sb.append('=');
        sb.append(((this.kdRatio == null)?"<null>":this.kdRatio));
        sb.append(',');
        sb.append("shotsMissed");
        sb.append('=');
        sb.append(((this.shotsMissed == null)?"<null>":this.shotsMissed));
        sb.append(',');
        sb.append("scorePerGame");
        sb.append('=');
        sb.append(((this.scorePerGame == null)?"<null>":this.scorePerGame));
        sb.append(',');
        sb.append("timePlayed");
        sb.append('=');
        sb.append(((this.timePlayed == null)?"<null>":this.timePlayed));
        sb.append(',');
        sb.append("headshotPercentage");
        sb.append('=');
        sb.append(((this.headshotPercentage == null)?"<null>":this.headshotPercentage));
        sb.append(',');
        sb.append("matchesPlayed");
        sb.append('=');
        sb.append(((this.matchesPlayed == null)?"<null>":this.matchesPlayed));
        sb.append(',');
        sb.append("executions");
        sb.append('=');
        sb.append(((this.executions == null)?"<null>":this.executions));
        sb.append(',');
        sb.append("suicides");
        sb.append('=');
        sb.append(((this.suicides == null)?"<null>":this.suicides));
        sb.append(',');
        sb.append("seasonRank");
        sb.append('=');
        sb.append(((this.seasonRank == null)?"<null>":this.seasonRank));
        sb.append(',');
        sb.append("wlRatio");
        sb.append('=');
        sb.append(((this.wlRatio == null)?"<null>":this.wlRatio));
        sb.append(',');
        sb.append("nearmisses");
        sb.append('=');
        sb.append(((this.nearmisses == null)?"<null>":this.nearmisses));
        sb.append(',');
        sb.append("percentTimeMoving");
        sb.append('=');
        sb.append(((this.percentTimeMoving == null)?"<null>":this.percentTimeMoving));
        sb.append(',');
        sb.append("miscXp");
        sb.append('=');
        sb.append(((this.miscXp == null)?"<null>":this.miscXp));
        sb.append(',');
        sb.append("longestStreak");
        sb.append('=');
        sb.append(((this.longestStreak == null)?"<null>":this.longestStreak));
        sb.append(',');
        sb.append("damageDone");
        sb.append('=');
        sb.append(((this.damageDone == null)?"<null>":this.damageDone));
        sb.append(',');
        sb.append("shotsFired");
        sb.append('=');
        sb.append(((this.shotsFired == null)?"<null>":this.shotsFired));
        sb.append(',');
        sb.append("damageTaken");
        sb.append('=');
        sb.append(((this.damageTaken == null)?"<null>":this.damageTaken));
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
