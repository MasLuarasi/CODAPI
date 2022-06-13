
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
    "recordLongestWinStreak",
    "recordXpInAMatch",
    "accuracy",
    "losses",
    "totalGamesPlayed",
    "score",
    "winLossRatio",
    "totalShots",
    "bestScoreXp",
    "gamesPlayed",
    "bestSquardKills",
    "bestSguardWave",
    "bestConfirmed",
    "deaths",
    "wins",
    "bestSquardCrates",
    "kdRatio",
    "bestAssists",
    "bestFieldgoals",
    "bestScore",
    "recordDeathsInAMatch",
    "scorePerGame",
    "bestSPM",
    "bestKillChains",
    "recordKillsInAMatch",
    "suicides",
    "wlRatio",
    "currentWinStreak",
    "bestMatchBonusXp",
    "bestMatchXp",
    "bestSguardWeaponLevel",
    "bestKD",
    "kills",
    "bestKillsAsInfected",
    "bestReturns",
    "bestStabs",
    "bestKillsAsSurvivor",
    "timePlayedTotal",
    "bestDestructions",
    "headshots",
    "bestRescues",
    "assists",
    "ties",
    "recordKillStreak",
    "bestPlants",
    "misses",
    "bestDamage",
    "bestSetbacks",
    "bestTouchdowns",
    "scorePerMinute",
    "bestDeaths",
    "bestMedalXp",
    "bestDefends",
    "bestSquardRevives",
    "bestKills",
    "bestDefuses",
    "bestCaptures",
    "hits",
    "bestKillStreak",
    "bestDenied"
})
@Generated("jsonschema2pojo")
public class Properties {

    @JsonProperty("recordLongestWinStreak")
    private Integer recordLongestWinStreak;
    @JsonProperty("recordXpInAMatch")
    private Integer recordXpInAMatch;
    @JsonProperty("accuracy")
    private Double accuracy;
    @JsonProperty("losses")
    private Integer losses;
    @JsonProperty("totalGamesPlayed")
    private Integer totalGamesPlayed;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("winLossRatio")
    private Double winLossRatio;
    @JsonProperty("totalShots")
    private Integer totalShots;
    @JsonProperty("bestScoreXp")
    private Integer bestScoreXp;
    @JsonProperty("gamesPlayed")
    private Integer gamesPlayed;
    @JsonProperty("bestSquardKills")
    private Integer bestSquardKills;
    @JsonProperty("bestSguardWave")
    private Integer bestSguardWave;
    @JsonProperty("bestConfirmed")
    private Integer bestConfirmed;
    @JsonProperty("deaths")
    private Integer deaths;
    @JsonProperty("wins")
    private Integer wins;
    @JsonProperty("bestSquardCrates")
    private Integer bestSquardCrates;
    @JsonProperty("kdRatio")
    private Double kdRatio;
    @JsonProperty("bestAssists")
    private Integer bestAssists;
    @JsonProperty("bestFieldgoals")
    private Integer bestFieldgoals;
    @JsonProperty("bestScore")
    private Integer bestScore;
    @JsonProperty("recordDeathsInAMatch")
    private Integer recordDeathsInAMatch;
    @JsonProperty("scorePerGame")
    private Double scorePerGame;
    @JsonProperty("bestSPM")
    private Integer bestSPM;
    @JsonProperty("bestKillChains")
    private Integer bestKillChains;
    @JsonProperty("recordKillsInAMatch")
    private Integer recordKillsInAMatch;
    @JsonProperty("suicides")
    private Integer suicides;
    @JsonProperty("wlRatio")
    private Double wlRatio;
    @JsonProperty("currentWinStreak")
    private Integer currentWinStreak;
    @JsonProperty("bestMatchBonusXp")
    private Integer bestMatchBonusXp;
    @JsonProperty("bestMatchXp")
    private Integer bestMatchXp;
    @JsonProperty("bestSguardWeaponLevel")
    private Integer bestSguardWeaponLevel;
    @JsonProperty("bestKD")
    private Integer bestKD;
    @JsonProperty("kills")
    private Integer kills;
    @JsonProperty("bestKillsAsInfected")
    private Integer bestKillsAsInfected;
    @JsonProperty("bestReturns")
    private Integer bestReturns;
    @JsonProperty("bestStabs")
    private Integer bestStabs;
    @JsonProperty("bestKillsAsSurvivor")
    private Integer bestKillsAsSurvivor;
    @JsonProperty("timePlayedTotal")
    private Integer timePlayedTotal;
    @JsonProperty("bestDestructions")
    private Integer bestDestructions;
    @JsonProperty("headshots")
    private Integer headshots;
    @JsonProperty("bestRescues")
    private Integer bestRescues;
    @JsonProperty("assists")
    private Integer assists;
    @JsonProperty("ties")
    private Integer ties;
    @JsonProperty("recordKillStreak")
    private Integer recordKillStreak;
    @JsonProperty("bestPlants")
    private Integer bestPlants;
    @JsonProperty("misses")
    private Integer misses;
    @JsonProperty("bestDamage")
    private Integer bestDamage;
    @JsonProperty("bestSetbacks")
    private Integer bestSetbacks;
    @JsonProperty("bestTouchdowns")
    private Integer bestTouchdowns;
    @JsonProperty("scorePerMinute")
    private Double scorePerMinute;
    @JsonProperty("bestDeaths")
    private Integer bestDeaths;
    @JsonProperty("bestMedalXp")
    private Integer bestMedalXp;
    @JsonProperty("bestDefends")
    private Integer bestDefends;
    @JsonProperty("bestSquardRevives")
    private Integer bestSquardRevives;
    @JsonProperty("bestKills")
    private Integer bestKills;
    @JsonProperty("bestDefuses")
    private Integer bestDefuses;
    @JsonProperty("bestCaptures")
    private Integer bestCaptures;
    @JsonProperty("hits")
    private Integer hits;
    @JsonProperty("bestKillStreak")
    private Integer bestKillStreak;
    @JsonProperty("bestDenied")
    private Integer bestDenied;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("recordLongestWinStreak")
    public Integer getRecordLongestWinStreak() {
        return recordLongestWinStreak;
    }

    @JsonProperty("recordLongestWinStreak")
    public void setRecordLongestWinStreak(Integer recordLongestWinStreak) {
        this.recordLongestWinStreak = recordLongestWinStreak;
    }

    @JsonProperty("recordXpInAMatch")
    public Integer getRecordXpInAMatch() {
        return recordXpInAMatch;
    }

    @JsonProperty("recordXpInAMatch")
    public void setRecordXpInAMatch(Integer recordXpInAMatch) {
        this.recordXpInAMatch = recordXpInAMatch;
    }

    @JsonProperty("accuracy")
    public Double getAccuracy() {
        return accuracy;
    }

    @JsonProperty("accuracy")
    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    @JsonProperty("losses")
    public Integer getLosses() {
        return losses;
    }

    @JsonProperty("losses")
    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    @JsonProperty("totalGamesPlayed")
    public Integer getTotalGamesPlayed() {
        return totalGamesPlayed;
    }

    @JsonProperty("totalGamesPlayed")
    public void setTotalGamesPlayed(Integer totalGamesPlayed) {
        this.totalGamesPlayed = totalGamesPlayed;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonProperty("winLossRatio")
    public Double getWinLossRatio() {
        return winLossRatio;
    }

    @JsonProperty("winLossRatio")
    public void setWinLossRatio(Double winLossRatio) {
        this.winLossRatio = winLossRatio;
    }

    @JsonProperty("totalShots")
    public Integer getTotalShots() {
        return totalShots;
    }

    @JsonProperty("totalShots")
    public void setTotalShots(Integer totalShots) {
        this.totalShots = totalShots;
    }

    @JsonProperty("bestScoreXp")
    public Integer getBestScoreXp() {
        return bestScoreXp;
    }

    @JsonProperty("bestScoreXp")
    public void setBestScoreXp(Integer bestScoreXp) {
        this.bestScoreXp = bestScoreXp;
    }

    @JsonProperty("gamesPlayed")
    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    @JsonProperty("gamesPlayed")
    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    @JsonProperty("bestSquardKills")
    public Integer getBestSquardKills() {
        return bestSquardKills;
    }

    @JsonProperty("bestSquardKills")
    public void setBestSquardKills(Integer bestSquardKills) {
        this.bestSquardKills = bestSquardKills;
    }

    @JsonProperty("bestSguardWave")
    public Integer getBestSguardWave() {
        return bestSguardWave;
    }

    @JsonProperty("bestSguardWave")
    public void setBestSguardWave(Integer bestSguardWave) {
        this.bestSguardWave = bestSguardWave;
    }

    @JsonProperty("bestConfirmed")
    public Integer getBestConfirmed() {
        return bestConfirmed;
    }

    @JsonProperty("bestConfirmed")
    public void setBestConfirmed(Integer bestConfirmed) {
        this.bestConfirmed = bestConfirmed;
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

    @JsonProperty("bestSquardCrates")
    public Integer getBestSquardCrates() {
        return bestSquardCrates;
    }

    @JsonProperty("bestSquardCrates")
    public void setBestSquardCrates(Integer bestSquardCrates) {
        this.bestSquardCrates = bestSquardCrates;
    }

    @JsonProperty("kdRatio")
    public Double getKdRatio() {
        return kdRatio;
    }

    @JsonProperty("kdRatio")
    public void setKdRatio(Double kdRatio) {
        this.kdRatio = kdRatio;
    }

    @JsonProperty("bestAssists")
    public Integer getBestAssists() {
        return bestAssists;
    }

    @JsonProperty("bestAssists")
    public void setBestAssists(Integer bestAssists) {
        this.bestAssists = bestAssists;
    }

    @JsonProperty("bestFieldgoals")
    public Integer getBestFieldgoals() {
        return bestFieldgoals;
    }

    @JsonProperty("bestFieldgoals")
    public void setBestFieldgoals(Integer bestFieldgoals) {
        this.bestFieldgoals = bestFieldgoals;
    }

    @JsonProperty("bestScore")
    public Integer getBestScore() {
        return bestScore;
    }

    @JsonProperty("bestScore")
    public void setBestScore(Integer bestScore) {
        this.bestScore = bestScore;
    }

    @JsonProperty("recordDeathsInAMatch")
    public Integer getRecordDeathsInAMatch() {
        return recordDeathsInAMatch;
    }

    @JsonProperty("recordDeathsInAMatch")
    public void setRecordDeathsInAMatch(Integer recordDeathsInAMatch) {
        this.recordDeathsInAMatch = recordDeathsInAMatch;
    }

    @JsonProperty("scorePerGame")
    public Double getScorePerGame() {
        return scorePerGame;
    }

    @JsonProperty("scorePerGame")
    public void setScorePerGame(Double scorePerGame) {
        this.scorePerGame = scorePerGame;
    }

    @JsonProperty("bestSPM")
    public Integer getBestSPM() {
        return bestSPM;
    }

    @JsonProperty("bestSPM")
    public void setBestSPM(Integer bestSPM) {
        this.bestSPM = bestSPM;
    }

    @JsonProperty("bestKillChains")
    public Integer getBestKillChains() {
        return bestKillChains;
    }

    @JsonProperty("bestKillChains")
    public void setBestKillChains(Integer bestKillChains) {
        this.bestKillChains = bestKillChains;
    }

    @JsonProperty("recordKillsInAMatch")
    public Integer getRecordKillsInAMatch() {
        return recordKillsInAMatch;
    }

    @JsonProperty("recordKillsInAMatch")
    public void setRecordKillsInAMatch(Integer recordKillsInAMatch) {
        this.recordKillsInAMatch = recordKillsInAMatch;
    }

    @JsonProperty("suicides")
    public Integer getSuicides() {
        return suicides;
    }

    @JsonProperty("suicides")
    public void setSuicides(Integer suicides) {
        this.suicides = suicides;
    }

    @JsonProperty("wlRatio")
    public Double getWlRatio() {
        return wlRatio;
    }

    @JsonProperty("wlRatio")
    public void setWlRatio(Double wlRatio) {
        this.wlRatio = wlRatio;
    }

    @JsonProperty("currentWinStreak")
    public Integer getCurrentWinStreak() {
        return currentWinStreak;
    }

    @JsonProperty("currentWinStreak")
    public void setCurrentWinStreak(Integer currentWinStreak) {
        this.currentWinStreak = currentWinStreak;
    }

    @JsonProperty("bestMatchBonusXp")
    public Integer getBestMatchBonusXp() {
        return bestMatchBonusXp;
    }

    @JsonProperty("bestMatchBonusXp")
    public void setBestMatchBonusXp(Integer bestMatchBonusXp) {
        this.bestMatchBonusXp = bestMatchBonusXp;
    }

    @JsonProperty("bestMatchXp")
    public Integer getBestMatchXp() {
        return bestMatchXp;
    }

    @JsonProperty("bestMatchXp")
    public void setBestMatchXp(Integer bestMatchXp) {
        this.bestMatchXp = bestMatchXp;
    }

    @JsonProperty("bestSguardWeaponLevel")
    public Integer getBestSguardWeaponLevel() {
        return bestSguardWeaponLevel;
    }

    @JsonProperty("bestSguardWeaponLevel")
    public void setBestSguardWeaponLevel(Integer bestSguardWeaponLevel) {
        this.bestSguardWeaponLevel = bestSguardWeaponLevel;
    }

    @JsonProperty("bestKD")
    public Integer getBestKD() {
        return bestKD;
    }

    @JsonProperty("bestKD")
    public void setBestKD(Integer bestKD) {
        this.bestKD = bestKD;
    }

    @JsonProperty("kills")
    public Integer getKills() {
        return kills;
    }

    @JsonProperty("kills")
    public void setKills(Integer kills) {
        this.kills = kills;
    }

    @JsonProperty("bestKillsAsInfected")
    public Integer getBestKillsAsInfected() {
        return bestKillsAsInfected;
    }

    @JsonProperty("bestKillsAsInfected")
    public void setBestKillsAsInfected(Integer bestKillsAsInfected) {
        this.bestKillsAsInfected = bestKillsAsInfected;
    }

    @JsonProperty("bestReturns")
    public Integer getBestReturns() {
        return bestReturns;
    }

    @JsonProperty("bestReturns")
    public void setBestReturns(Integer bestReturns) {
        this.bestReturns = bestReturns;
    }

    @JsonProperty("bestStabs")
    public Integer getBestStabs() {
        return bestStabs;
    }

    @JsonProperty("bestStabs")
    public void setBestStabs(Integer bestStabs) {
        this.bestStabs = bestStabs;
    }

    @JsonProperty("bestKillsAsSurvivor")
    public Integer getBestKillsAsSurvivor() {
        return bestKillsAsSurvivor;
    }

    @JsonProperty("bestKillsAsSurvivor")
    public void setBestKillsAsSurvivor(Integer bestKillsAsSurvivor) {
        this.bestKillsAsSurvivor = bestKillsAsSurvivor;
    }

    @JsonProperty("timePlayedTotal")
    public Integer getTimePlayedTotal() {
        return timePlayedTotal;
    }

    @JsonProperty("timePlayedTotal")
    public void setTimePlayedTotal(Integer timePlayedTotal) {
        this.timePlayedTotal = timePlayedTotal;
    }

    @JsonProperty("bestDestructions")
    public Integer getBestDestructions() {
        return bestDestructions;
    }

    @JsonProperty("bestDestructions")
    public void setBestDestructions(Integer bestDestructions) {
        this.bestDestructions = bestDestructions;
    }

    @JsonProperty("headshots")
    public Integer getHeadshots() {
        return headshots;
    }

    @JsonProperty("headshots")
    public void setHeadshots(Integer headshots) {
        this.headshots = headshots;
    }

    @JsonProperty("bestRescues")
    public Integer getBestRescues() {
        return bestRescues;
    }

    @JsonProperty("bestRescues")
    public void setBestRescues(Integer bestRescues) {
        this.bestRescues = bestRescues;
    }

    @JsonProperty("assists")
    public Integer getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    @JsonProperty("ties")
    public Integer getTies() {
        return ties;
    }

    @JsonProperty("ties")
    public void setTies(Integer ties) {
        this.ties = ties;
    }

    @JsonProperty("recordKillStreak")
    public Integer getRecordKillStreak() {
        return recordKillStreak;
    }

    @JsonProperty("recordKillStreak")
    public void setRecordKillStreak(Integer recordKillStreak) {
        this.recordKillStreak = recordKillStreak;
    }

    @JsonProperty("bestPlants")
    public Integer getBestPlants() {
        return bestPlants;
    }

    @JsonProperty("bestPlants")
    public void setBestPlants(Integer bestPlants) {
        this.bestPlants = bestPlants;
    }

    @JsonProperty("misses")
    public Integer getMisses() {
        return misses;
    }

    @JsonProperty("misses")
    public void setMisses(Integer misses) {
        this.misses = misses;
    }

    @JsonProperty("bestDamage")
    public Integer getBestDamage() {
        return bestDamage;
    }

    @JsonProperty("bestDamage")
    public void setBestDamage(Integer bestDamage) {
        this.bestDamage = bestDamage;
    }

    @JsonProperty("bestSetbacks")
    public Integer getBestSetbacks() {
        return bestSetbacks;
    }

    @JsonProperty("bestSetbacks")
    public void setBestSetbacks(Integer bestSetbacks) {
        this.bestSetbacks = bestSetbacks;
    }

    @JsonProperty("bestTouchdowns")
    public Integer getBestTouchdowns() {
        return bestTouchdowns;
    }

    @JsonProperty("bestTouchdowns")
    public void setBestTouchdowns(Integer bestTouchdowns) {
        this.bestTouchdowns = bestTouchdowns;
    }

    @JsonProperty("scorePerMinute")
    public Double getScorePerMinute() {
        return scorePerMinute;
    }

    @JsonProperty("scorePerMinute")
    public void setScorePerMinute(Double scorePerMinute) {
        this.scorePerMinute = scorePerMinute;
    }

    @JsonProperty("bestDeaths")
    public Integer getBestDeaths() {
        return bestDeaths;
    }

    @JsonProperty("bestDeaths")
    public void setBestDeaths(Integer bestDeaths) {
        this.bestDeaths = bestDeaths;
    }

    @JsonProperty("bestMedalXp")
    public Integer getBestMedalXp() {
        return bestMedalXp;
    }

    @JsonProperty("bestMedalXp")
    public void setBestMedalXp(Integer bestMedalXp) {
        this.bestMedalXp = bestMedalXp;
    }

    @JsonProperty("bestDefends")
    public Integer getBestDefends() {
        return bestDefends;
    }

    @JsonProperty("bestDefends")
    public void setBestDefends(Integer bestDefends) {
        this.bestDefends = bestDefends;
    }

    @JsonProperty("bestSquardRevives")
    public Integer getBestSquardRevives() {
        return bestSquardRevives;
    }

    @JsonProperty("bestSquardRevives")
    public void setBestSquardRevives(Integer bestSquardRevives) {
        this.bestSquardRevives = bestSquardRevives;
    }

    @JsonProperty("bestKills")
    public Integer getBestKills() {
        return bestKills;
    }

    @JsonProperty("bestKills")
    public void setBestKills(Integer bestKills) {
        this.bestKills = bestKills;
    }

    @JsonProperty("bestDefuses")
    public Integer getBestDefuses() {
        return bestDefuses;
    }

    @JsonProperty("bestDefuses")
    public void setBestDefuses(Integer bestDefuses) {
        this.bestDefuses = bestDefuses;
    }

    @JsonProperty("bestCaptures")
    public Integer getBestCaptures() {
        return bestCaptures;
    }

    @JsonProperty("bestCaptures")
    public void setBestCaptures(Integer bestCaptures) {
        this.bestCaptures = bestCaptures;
    }

    @JsonProperty("hits")
    public Integer getHits() {
        return hits;
    }

    @JsonProperty("hits")
    public void setHits(Integer hits) {
        this.hits = hits;
    }

    @JsonProperty("bestKillStreak")
    public Integer getBestKillStreak() {
        return bestKillStreak;
    }

    @JsonProperty("bestKillStreak")
    public void setBestKillStreak(Integer bestKillStreak) {
        this.bestKillStreak = bestKillStreak;
    }

    @JsonProperty("bestDenied")
    public Integer getBestDenied() {
        return bestDenied;
    }

    @JsonProperty("bestDenied")
    public void setBestDenied(Integer bestDenied) {
        this.bestDenied = bestDenied;
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
