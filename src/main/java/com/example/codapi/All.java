
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
public class All {

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

    /**
     * No args constructor for use in serialization
     * 
     */
    public All() {
    }

    /**
     * 
     * @param recordLongestWinStreak
     * @param recordXpInAMatch
     * @param accuracy
     * @param losses
     * @param totalGamesPlayed
     * @param score
     * @param winLossRatio
     * @param totalShots
     * @param bestScoreXp
     * @param gamesPlayed
     * @param bestSquardKills
     * @param bestSguardWave
     * @param bestConfirmed
     * @param deaths
     * @param wins
     * @param bestSquardCrates
     * @param kdRatio
     * @param bestAssists
     * @param bestFieldgoals
     * @param bestScore
     * @param recordDeathsInAMatch
     * @param scorePerGame
     * @param bestSPM
     * @param bestKillChains
     * @param recordKillsInAMatch
     * @param suicides
     * @param wlRatio
     * @param currentWinStreak
     * @param bestMatchBonusXp
     * @param bestMatchXp
     * @param bestSguardWeaponLevel
     * @param bestKD
     * @param kills
     * @param bestKillsAsInfected
     * @param bestReturns
     * @param bestStabs
     * @param bestKillsAsSurvivor
     * @param timePlayedTotal
     * @param bestDestructions
     * @param headshots
     * @param bestRescues
     * @param assists
     * @param ties
     * @param recordKillStreak
     * @param bestPlants
     * @param misses
     * @param bestDamage
     * @param bestSetbacks
     * @param bestTouchdowns
     * @param scorePerMinute
     * @param bestDeaths
     * @param bestMedalXp
     * @param bestDefends
     * @param bestSquardRevives
     * @param bestKills
     * @param bestDefuses
     * @param bestCaptures
     * @param hits
     * @param bestKillStreak
     * @param bestDenied
     */
    public All(Integer recordLongestWinStreak, Integer recordXpInAMatch, Double accuracy, Integer losses, Integer totalGamesPlayed, Integer score, Double winLossRatio, Integer totalShots, Integer bestScoreXp, Integer gamesPlayed, Integer bestSquardKills, Integer bestSguardWave, Integer bestConfirmed, Integer deaths, Integer wins, Integer bestSquardCrates, Double kdRatio, Integer bestAssists, Integer bestFieldgoals, Integer bestScore, Integer recordDeathsInAMatch, Double scorePerGame, Integer bestSPM, Integer bestKillChains, Integer recordKillsInAMatch, Integer suicides, Double wlRatio, Integer currentWinStreak, Integer bestMatchBonusXp, Integer bestMatchXp, Integer bestSguardWeaponLevel, Integer bestKD, Integer kills, Integer bestKillsAsInfected, Integer bestReturns, Integer bestStabs, Integer bestKillsAsSurvivor, Integer timePlayedTotal, Integer bestDestructions, Integer headshots, Integer bestRescues, Integer assists, Integer ties, Integer recordKillStreak, Integer bestPlants, Integer misses, Integer bestDamage, Integer bestSetbacks, Integer bestTouchdowns, Double scorePerMinute, Integer bestDeaths, Integer bestMedalXp, Integer bestDefends, Integer bestSquardRevives, Integer bestKills, Integer bestDefuses, Integer bestCaptures, Integer hits, Integer bestKillStreak, Integer bestDenied) {
        super();
        this.recordLongestWinStreak = recordLongestWinStreak;
        this.recordXpInAMatch = recordXpInAMatch;
        this.accuracy = accuracy;
        this.losses = losses;
        this.totalGamesPlayed = totalGamesPlayed;
        this.score = score;
        this.winLossRatio = winLossRatio;
        this.totalShots = totalShots;
        this.bestScoreXp = bestScoreXp;
        this.gamesPlayed = gamesPlayed;
        this.bestSquardKills = bestSquardKills;
        this.bestSguardWave = bestSguardWave;
        this.bestConfirmed = bestConfirmed;
        this.deaths = deaths;
        this.wins = wins;
        this.bestSquardCrates = bestSquardCrates;
        this.kdRatio = kdRatio;
        this.bestAssists = bestAssists;
        this.bestFieldgoals = bestFieldgoals;
        this.bestScore = bestScore;
        this.recordDeathsInAMatch = recordDeathsInAMatch;
        this.scorePerGame = scorePerGame;
        this.bestSPM = bestSPM;
        this.bestKillChains = bestKillChains;
        this.recordKillsInAMatch = recordKillsInAMatch;
        this.suicides = suicides;
        this.wlRatio = wlRatio;
        this.currentWinStreak = currentWinStreak;
        this.bestMatchBonusXp = bestMatchBonusXp;
        this.bestMatchXp = bestMatchXp;
        this.bestSguardWeaponLevel = bestSguardWeaponLevel;
        this.bestKD = bestKD;
        this.kills = kills;
        this.bestKillsAsInfected = bestKillsAsInfected;
        this.bestReturns = bestReturns;
        this.bestStabs = bestStabs;
        this.bestKillsAsSurvivor = bestKillsAsSurvivor;
        this.timePlayedTotal = timePlayedTotal;
        this.bestDestructions = bestDestructions;
        this.headshots = headshots;
        this.bestRescues = bestRescues;
        this.assists = assists;
        this.ties = ties;
        this.recordKillStreak = recordKillStreak;
        this.bestPlants = bestPlants;
        this.misses = misses;
        this.bestDamage = bestDamage;
        this.bestSetbacks = bestSetbacks;
        this.bestTouchdowns = bestTouchdowns;
        this.scorePerMinute = scorePerMinute;
        this.bestDeaths = bestDeaths;
        this.bestMedalXp = bestMedalXp;
        this.bestDefends = bestDefends;
        this.bestSquardRevives = bestSquardRevives;
        this.bestKills = bestKills;
        this.bestDefuses = bestDefuses;
        this.bestCaptures = bestCaptures;
        this.hits = hits;
        this.bestKillStreak = bestKillStreak;
        this.bestDenied = bestDenied;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(All.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("recordLongestWinStreak");
        sb.append('=');
        sb.append(((this.recordLongestWinStreak == null)?"<null>":this.recordLongestWinStreak));
        sb.append(',');
        sb.append("recordXpInAMatch");
        sb.append('=');
        sb.append(((this.recordXpInAMatch == null)?"<null>":this.recordXpInAMatch));
        sb.append(',');
        sb.append("accuracy");
        sb.append('=');
        sb.append(((this.accuracy == null)?"<null>":this.accuracy));
        sb.append(',');
        sb.append("losses");
        sb.append('=');
        sb.append(((this.losses == null)?"<null>":this.losses));
        sb.append(',');
        sb.append("totalGamesPlayed");
        sb.append('=');
        sb.append(((this.totalGamesPlayed == null)?"<null>":this.totalGamesPlayed));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("winLossRatio");
        sb.append('=');
        sb.append(((this.winLossRatio == null)?"<null>":this.winLossRatio));
        sb.append(',');
        sb.append("totalShots");
        sb.append('=');
        sb.append(((this.totalShots == null)?"<null>":this.totalShots));
        sb.append(',');
        sb.append("bestScoreXp");
        sb.append('=');
        sb.append(((this.bestScoreXp == null)?"<null>":this.bestScoreXp));
        sb.append(',');
        sb.append("gamesPlayed");
        sb.append('=');
        sb.append(((this.gamesPlayed == null)?"<null>":this.gamesPlayed));
        sb.append(',');
        sb.append("bestSquardKills");
        sb.append('=');
        sb.append(((this.bestSquardKills == null)?"<null>":this.bestSquardKills));
        sb.append(',');
        sb.append("bestSguardWave");
        sb.append('=');
        sb.append(((this.bestSguardWave == null)?"<null>":this.bestSguardWave));
        sb.append(',');
        sb.append("bestConfirmed");
        sb.append('=');
        sb.append(((this.bestConfirmed == null)?"<null>":this.bestConfirmed));
        sb.append(',');
        sb.append("deaths");
        sb.append('=');
        sb.append(((this.deaths == null)?"<null>":this.deaths));
        sb.append(',');
        sb.append("wins");
        sb.append('=');
        sb.append(((this.wins == null)?"<null>":this.wins));
        sb.append(',');
        sb.append("bestSquardCrates");
        sb.append('=');
        sb.append(((this.bestSquardCrates == null)?"<null>":this.bestSquardCrates));
        sb.append(',');
        sb.append("kdRatio");
        sb.append('=');
        sb.append(((this.kdRatio == null)?"<null>":this.kdRatio));
        sb.append(',');
        sb.append("bestAssists");
        sb.append('=');
        sb.append(((this.bestAssists == null)?"<null>":this.bestAssists));
        sb.append(',');
        sb.append("bestFieldgoals");
        sb.append('=');
        sb.append(((this.bestFieldgoals == null)?"<null>":this.bestFieldgoals));
        sb.append(',');
        sb.append("bestScore");
        sb.append('=');
        sb.append(((this.bestScore == null)?"<null>":this.bestScore));
        sb.append(',');
        sb.append("recordDeathsInAMatch");
        sb.append('=');
        sb.append(((this.recordDeathsInAMatch == null)?"<null>":this.recordDeathsInAMatch));
        sb.append(',');
        sb.append("scorePerGame");
        sb.append('=');
        sb.append(((this.scorePerGame == null)?"<null>":this.scorePerGame));
        sb.append(',');
        sb.append("bestSPM");
        sb.append('=');
        sb.append(((this.bestSPM == null)?"<null>":this.bestSPM));
        sb.append(',');
        sb.append("bestKillChains");
        sb.append('=');
        sb.append(((this.bestKillChains == null)?"<null>":this.bestKillChains));
        sb.append(',');
        sb.append("recordKillsInAMatch");
        sb.append('=');
        sb.append(((this.recordKillsInAMatch == null)?"<null>":this.recordKillsInAMatch));
        sb.append(',');
        sb.append("suicides");
        sb.append('=');
        sb.append(((this.suicides == null)?"<null>":this.suicides));
        sb.append(',');
        sb.append("wlRatio");
        sb.append('=');
        sb.append(((this.wlRatio == null)?"<null>":this.wlRatio));
        sb.append(',');
        sb.append("currentWinStreak");
        sb.append('=');
        sb.append(((this.currentWinStreak == null)?"<null>":this.currentWinStreak));
        sb.append(',');
        sb.append("bestMatchBonusXp");
        sb.append('=');
        sb.append(((this.bestMatchBonusXp == null)?"<null>":this.bestMatchBonusXp));
        sb.append(',');
        sb.append("bestMatchXp");
        sb.append('=');
        sb.append(((this.bestMatchXp == null)?"<null>":this.bestMatchXp));
        sb.append(',');
        sb.append("bestSguardWeaponLevel");
        sb.append('=');
        sb.append(((this.bestSguardWeaponLevel == null)?"<null>":this.bestSguardWeaponLevel));
        sb.append(',');
        sb.append("bestKD");
        sb.append('=');
        sb.append(((this.bestKD == null)?"<null>":this.bestKD));
        sb.append(',');
        sb.append("kills");
        sb.append('=');
        sb.append(((this.kills == null)?"<null>":this.kills));
        sb.append(',');
        sb.append("bestKillsAsInfected");
        sb.append('=');
        sb.append(((this.bestKillsAsInfected == null)?"<null>":this.bestKillsAsInfected));
        sb.append(',');
        sb.append("bestReturns");
        sb.append('=');
        sb.append(((this.bestReturns == null)?"<null>":this.bestReturns));
        sb.append(',');
        sb.append("bestStabs");
        sb.append('=');
        sb.append(((this.bestStabs == null)?"<null>":this.bestStabs));
        sb.append(',');
        sb.append("bestKillsAsSurvivor");
        sb.append('=');
        sb.append(((this.bestKillsAsSurvivor == null)?"<null>":this.bestKillsAsSurvivor));
        sb.append(',');
        sb.append("timePlayedTotal");
        sb.append('=');
        sb.append(((this.timePlayedTotal == null)?"<null>":this.timePlayedTotal));
        sb.append(',');
        sb.append("bestDestructions");
        sb.append('=');
        sb.append(((this.bestDestructions == null)?"<null>":this.bestDestructions));
        sb.append(',');
        sb.append("headshots");
        sb.append('=');
        sb.append(((this.headshots == null)?"<null>":this.headshots));
        sb.append(',');
        sb.append("bestRescues");
        sb.append('=');
        sb.append(((this.bestRescues == null)?"<null>":this.bestRescues));
        sb.append(',');
        sb.append("assists");
        sb.append('=');
        sb.append(((this.assists == null)?"<null>":this.assists));
        sb.append(',');
        sb.append("ties");
        sb.append('=');
        sb.append(((this.ties == null)?"<null>":this.ties));
        sb.append(',');
        sb.append("recordKillStreak");
        sb.append('=');
        sb.append(((this.recordKillStreak == null)?"<null>":this.recordKillStreak));
        sb.append(',');
        sb.append("bestPlants");
        sb.append('=');
        sb.append(((this.bestPlants == null)?"<null>":this.bestPlants));
        sb.append(',');
        sb.append("misses");
        sb.append('=');
        sb.append(((this.misses == null)?"<null>":this.misses));
        sb.append(',');
        sb.append("bestDamage");
        sb.append('=');
        sb.append(((this.bestDamage == null)?"<null>":this.bestDamage));
        sb.append(',');
        sb.append("bestSetbacks");
        sb.append('=');
        sb.append(((this.bestSetbacks == null)?"<null>":this.bestSetbacks));
        sb.append(',');
        sb.append("bestTouchdowns");
        sb.append('=');
        sb.append(((this.bestTouchdowns == null)?"<null>":this.bestTouchdowns));
        sb.append(',');
        sb.append("scorePerMinute");
        sb.append('=');
        sb.append(((this.scorePerMinute == null)?"<null>":this.scorePerMinute));
        sb.append(',');
        sb.append("bestDeaths");
        sb.append('=');
        sb.append(((this.bestDeaths == null)?"<null>":this.bestDeaths));
        sb.append(',');
        sb.append("bestMedalXp");
        sb.append('=');
        sb.append(((this.bestMedalXp == null)?"<null>":this.bestMedalXp));
        sb.append(',');
        sb.append("bestDefends");
        sb.append('=');
        sb.append(((this.bestDefends == null)?"<null>":this.bestDefends));
        sb.append(',');
        sb.append("bestSquardRevives");
        sb.append('=');
        sb.append(((this.bestSquardRevives == null)?"<null>":this.bestSquardRevives));
        sb.append(',');
        sb.append("bestKills");
        sb.append('=');
        sb.append(((this.bestKills == null)?"<null>":this.bestKills));
        sb.append(',');
        sb.append("bestDefuses");
        sb.append('=');
        sb.append(((this.bestDefuses == null)?"<null>":this.bestDefuses));
        sb.append(',');
        sb.append("bestCaptures");
        sb.append('=');
        sb.append(((this.bestCaptures == null)?"<null>":this.bestCaptures));
        sb.append(',');
        sb.append("hits");
        sb.append('=');
        sb.append(((this.hits == null)?"<null>":this.hits));
        sb.append(',');
        sb.append("bestKillStreak");
        sb.append('=');
        sb.append(((this.bestKillStreak == null)?"<null>":this.bestKillStreak));
        sb.append(',');
        sb.append("bestDenied");
        sb.append('=');
        sb.append(((this.bestDenied == null)?"<null>":this.bestDenied));
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

    public String printEssential()
    {
        StringBuilder ret = new StringBuilder();

        ret.append("Total Time Played:\t" + this.timePlayedTotal + "\n");
        ret.append("Games Played:\t" + this.gamesPlayed + "\n");
        ret.append("Accuracy: \t" + this.accuracy + "\n");

        ret.append("Kills:\t" + this.kills + "\n");
        ret.append("Deaths:\t" + this.deaths + "\n");
        ret.append("K/D Ratio:\t" + this.kdRatio + "\n");

        ret.append("Wins:\t" + this.wins + "\n");
        ret.append("Losses:\t" + this.losses + "\n");
        ret.append("W/L Ratio:\t" + this.winLossRatio + "\n");

        ret.append("Most Kills in a Match:\t" + this.recordKillsInAMatch + "\n");
        ret.append("Most Deaths in a Match:\t" + this.recordDeathsInAMatch + "\n");
        ret.append("Best K/D in a Match:\t" + this.bestKD + "\n");
        ret.append("Longest Kill Streak in a Match:\t" + this.recordKillStreak + "\n");

        return ret.toString();
    }

}
