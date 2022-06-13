
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
    "classChanges",
    "highestAvgAltitude",
    "killsFromBehind",
    "lmgDeaths",
    "riotShieldDamageAbsorbed",
    "flashbangHits",
    "meleeKills",
    "tagsLargestBank",
    "shotgunKills",
    "sniperDeaths",
    "timeProne",
    "killstreakWhitePhosphorousKillsAssists",
    "shortestLife",
    "deathsFromBehind",
    "higherRankedKills",
    "mostAssists",
    "leastKills",
    "tagsDenied",
    "killstreakWheelsonKills",
    "sniperHeadshots",
    "killstreakJuggernautKills",
    "smokesUsed",
    "avengerKills",
    "decoyHits",
    "killstreakCarePackageUsed",
    "molotovKills",
    "gasHits",
    "comebackKills",
    "lmgHeadshots",
    "smgDeaths",
    "carrierKills",
    "deployableCoverUsed",
    "thermiteKills",
    "arKills",
    "c4Kills",
    "suicides",
    "clutch",
    "survivorKills",
    "killstreakGunshipKills",
    "timeSpentAsPassenger",
    "returns",
    "smgHeadshots",
    "launcherDeaths",
    "oneShotOneKills",
    "ammoBoxUsed",
    "spawnSelectSquad",
    "weaponPickups",
    "pointBlankKills",
    "tagsCaptured",
    "killstreakGroundKills",
    "distanceTraveledInVehicle",
    "longestLife",
    "stunHits",
    "spawnSelectFlag",
    "shotgunHeadshots",
    "bombDefused",
    "snapshotHits",
    "noKillsWithDeath",
    "killstreakAUAVAssists",
    "killstreakPersonalUAVKills",
    "tacticalInsertionSpawns",
    "launcherKills",
    "spawnSelectVehicle",
    "mostKillsLeastDeaths",
    "mostKills",
    "defends",
    "timeSpentAsDriver",
    "bombDetonated",
    "arHeadshots",
    "timeOnPoint",
    "lmgKills",
    "killstreakUAVAssists",
    "carepackagesCaptured",
    "mostKillsLongestStreak",
    "killstreakCruiseMissileKills",
    "longestStreak",
    "destroyedKillstreaks",
    "hipfireKills",
    "stimDamageHealed",
    "skippedKillcams",
    "leastAssists",
    "mostMultikills",
    "highestRankedKills",
    "killstreakAirstrikeKills",
    "distanceTravelled",
    "killstreakKills",
    "semtexKills",
    "penetrationKills",
    "explosionsSurvived",
    "highestMultikill",
    "arDeaths",
    "longshotKills",
    "proximityMineKills",
    "tagsMegaBanked",
    "mostKillsMostHeadshots",
    "firstInfected",
    "killstreakCUAVAssists",
    "throwingKnifeKills",
    "executionKills",
    "lastSurvivor",
    "reconDroneMarks",
    "deadSilenceKills",
    "revengeKills",
    "infectedKills",
    "killEnemyTeam",
    "sniperKills",
    "killstreakCluserStrikeKills",
    "meleeDeaths",
    "timeWatchingKillcams",
    "killstreakTankKills",
    "noKillNoDeath",
    "shotgunDeaths",
    "killstreakChopperGunnerKills",
    "shotsFired",
    "stoppingPowerKills",
    "pistolPeaths",
    "killstreakShieldTurretKills",
    "timeCrouched",
    "noDeathsFromBehind",
    "bombPlanted",
    "setbacks",
    "smgKills",
    "claymoreKills",
    "kills10NoDeaths",
    "pistolHeadshots",
    "killstreakVTOLJetKills",
    "headshots",
    "mostDeaths",
    "adsKills",
    "empDroneHits",
    "defenderKills",
    "launcherHeadshots",
    "timesSelectedAsSquadLeader",
    "killstreakAirKills",
    "assaults",
    "fragKills",
    "killstreakEmergencyAirdropUsed",
    "captures",
    "killstreakChopperSupportKills",
    "spawnSelectBase",
    "noKill10Deaths",
    "leastDeaths",
    "killstreakSentryGunKills",
    "longestTimeSpentOnWeapon",
    "lowerRankedKills",
    "trophySystemHits",
    "clutchRevives",
    "lowestAvgAltitude",
    "pickups",
    "pistolKills",
    "reloads"
})
@Generated("jsonschema2pojo")
public class Properties__131 {

    @JsonProperty("classChanges")
    private Integer classChanges;
    @JsonProperty("highestAvgAltitude")
    private Integer highestAvgAltitude;
    @JsonProperty("killsFromBehind")
    private Integer killsFromBehind;
    @JsonProperty("lmgDeaths")
    private Integer lmgDeaths;
    @JsonProperty("riotShieldDamageAbsorbed")
    private Integer riotShieldDamageAbsorbed;
    @JsonProperty("flashbangHits")
    private Integer flashbangHits;
    @JsonProperty("meleeKills")
    private Integer meleeKills;
    @JsonProperty("tagsLargestBank")
    private Integer tagsLargestBank;
    @JsonProperty("shotgunKills")
    private Integer shotgunKills;
    @JsonProperty("sniperDeaths")
    private Integer sniperDeaths;
    @JsonProperty("timeProne")
    private Integer timeProne;
    @JsonProperty("killstreakWhitePhosphorousKillsAssists")
    private Integer killstreakWhitePhosphorousKillsAssists;
    @JsonProperty("shortestLife")
    private Integer shortestLife;
    @JsonProperty("deathsFromBehind")
    private Integer deathsFromBehind;
    @JsonProperty("higherRankedKills")
    private Integer higherRankedKills;
    @JsonProperty("mostAssists")
    private Integer mostAssists;
    @JsonProperty("leastKills")
    private Integer leastKills;
    @JsonProperty("tagsDenied")
    private Integer tagsDenied;
    @JsonProperty("killstreakWheelsonKills")
    private Integer killstreakWheelsonKills;
    @JsonProperty("sniperHeadshots")
    private Integer sniperHeadshots;
    @JsonProperty("killstreakJuggernautKills")
    private Integer killstreakJuggernautKills;
    @JsonProperty("smokesUsed")
    private Integer smokesUsed;
    @JsonProperty("avengerKills")
    private Integer avengerKills;
    @JsonProperty("decoyHits")
    private Integer decoyHits;
    @JsonProperty("killstreakCarePackageUsed")
    private Integer killstreakCarePackageUsed;
    @JsonProperty("molotovKills")
    private Integer molotovKills;
    @JsonProperty("gasHits")
    private Integer gasHits;
    @JsonProperty("comebackKills")
    private Integer comebackKills;
    @JsonProperty("lmgHeadshots")
    private Integer lmgHeadshots;
    @JsonProperty("smgDeaths")
    private Integer smgDeaths;
    @JsonProperty("carrierKills")
    private Integer carrierKills;
    @JsonProperty("deployableCoverUsed")
    private Integer deployableCoverUsed;
    @JsonProperty("thermiteKills")
    private Integer thermiteKills;
    @JsonProperty("arKills")
    private Integer arKills;
    @JsonProperty("c4Kills")
    private Integer c4Kills;
    @JsonProperty("suicides")
    private Integer suicides;
    @JsonProperty("clutch")
    private Integer clutch;
    @JsonProperty("survivorKills")
    private Integer survivorKills;
    @JsonProperty("killstreakGunshipKills")
    private Integer killstreakGunshipKills;
    @JsonProperty("timeSpentAsPassenger")
    private Integer timeSpentAsPassenger;
    @JsonProperty("returns")
    private Integer returns;
    @JsonProperty("smgHeadshots")
    private Integer smgHeadshots;
    @JsonProperty("launcherDeaths")
    private Integer launcherDeaths;
    @JsonProperty("oneShotOneKills")
    private Integer oneShotOneKills;
    @JsonProperty("ammoBoxUsed")
    private Integer ammoBoxUsed;
    @JsonProperty("spawnSelectSquad")
    private Integer spawnSelectSquad;
    @JsonProperty("weaponPickups")
    private Integer weaponPickups;
    @JsonProperty("pointBlankKills")
    private Integer pointBlankKills;
    @JsonProperty("tagsCaptured")
    private Integer tagsCaptured;
    @JsonProperty("killstreakGroundKills")
    private Integer killstreakGroundKills;
    @JsonProperty("distanceTraveledInVehicle")
    private Integer distanceTraveledInVehicle;
    @JsonProperty("longestLife")
    private Integer longestLife;
    @JsonProperty("stunHits")
    private Integer stunHits;
    @JsonProperty("spawnSelectFlag")
    private Integer spawnSelectFlag;
    @JsonProperty("shotgunHeadshots")
    private Integer shotgunHeadshots;
    @JsonProperty("bombDefused")
    private Integer bombDefused;
    @JsonProperty("snapshotHits")
    private Integer snapshotHits;
    @JsonProperty("noKillsWithDeath")
    private Integer noKillsWithDeath;
    @JsonProperty("killstreakAUAVAssists")
    private Integer killstreakAUAVAssists;
    @JsonProperty("killstreakPersonalUAVKills")
    private Integer killstreakPersonalUAVKills;
    @JsonProperty("tacticalInsertionSpawns")
    private Integer tacticalInsertionSpawns;
    @JsonProperty("launcherKills")
    private Integer launcherKills;
    @JsonProperty("spawnSelectVehicle")
    private Integer spawnSelectVehicle;
    @JsonProperty("mostKillsLeastDeaths")
    private Integer mostKillsLeastDeaths;
    @JsonProperty("mostKills")
    private Integer mostKills;
    @JsonProperty("defends")
    private Integer defends;
    @JsonProperty("timeSpentAsDriver")
    private Integer timeSpentAsDriver;
    @JsonProperty("bombDetonated")
    private Integer bombDetonated;
    @JsonProperty("arHeadshots")
    private Integer arHeadshots;
    @JsonProperty("timeOnPoint")
    private Integer timeOnPoint;
    @JsonProperty("lmgKills")
    private Integer lmgKills;
    @JsonProperty("killstreakUAVAssists")
    private Integer killstreakUAVAssists;
    @JsonProperty("carepackagesCaptured")
    private Integer carepackagesCaptured;
    @JsonProperty("mostKillsLongestStreak")
    private Integer mostKillsLongestStreak;
    @JsonProperty("killstreakCruiseMissileKills")
    private Integer killstreakCruiseMissileKills;
    @JsonProperty("longestStreak")
    private Integer longestStreak;
    @JsonProperty("destroyedKillstreaks")
    private Integer destroyedKillstreaks;
    @JsonProperty("hipfireKills")
    private Integer hipfireKills;
    @JsonProperty("stimDamageHealed")
    private Integer stimDamageHealed;
    @JsonProperty("skippedKillcams")
    private Integer skippedKillcams;
    @JsonProperty("leastAssists")
    private Integer leastAssists;
    @JsonProperty("mostMultikills")
    private Integer mostMultikills;
    @JsonProperty("highestRankedKills")
    private Integer highestRankedKills;
    @JsonProperty("killstreakAirstrikeKills")
    private Integer killstreakAirstrikeKills;
    @JsonProperty("distanceTravelled")
    private Integer distanceTravelled;
    @JsonProperty("killstreakKills")
    private Integer killstreakKills;
    @JsonProperty("semtexKills")
    private Integer semtexKills;
    @JsonProperty("penetrationKills")
    private Integer penetrationKills;
    @JsonProperty("explosionsSurvived")
    private Integer explosionsSurvived;
    @JsonProperty("highestMultikill")
    private Integer highestMultikill;
    @JsonProperty("arDeaths")
    private Integer arDeaths;
    @JsonProperty("longshotKills")
    private Integer longshotKills;
    @JsonProperty("proximityMineKills")
    private Integer proximityMineKills;
    @JsonProperty("tagsMegaBanked")
    private Integer tagsMegaBanked;
    @JsonProperty("mostKillsMostHeadshots")
    private Integer mostKillsMostHeadshots;
    @JsonProperty("firstInfected")
    private Integer firstInfected;
    @JsonProperty("killstreakCUAVAssists")
    private Integer killstreakCUAVAssists;
    @JsonProperty("throwingKnifeKills")
    private Integer throwingKnifeKills;
    @JsonProperty("executionKills")
    private Integer executionKills;
    @JsonProperty("lastSurvivor")
    private Integer lastSurvivor;
    @JsonProperty("reconDroneMarks")
    private Integer reconDroneMarks;
    @JsonProperty("deadSilenceKills")
    private Integer deadSilenceKills;
    @JsonProperty("revengeKills")
    private Integer revengeKills;
    @JsonProperty("infectedKills")
    private Integer infectedKills;
    @JsonProperty("killEnemyTeam")
    private Integer killEnemyTeam;
    @JsonProperty("sniperKills")
    private Integer sniperKills;
    @JsonProperty("killstreakCluserStrikeKills")
    private Integer killstreakCluserStrikeKills;
    @JsonProperty("meleeDeaths")
    private Integer meleeDeaths;
    @JsonProperty("timeWatchingKillcams")
    private Integer timeWatchingKillcams;
    @JsonProperty("killstreakTankKills")
    private Integer killstreakTankKills;
    @JsonProperty("noKillNoDeath")
    private Integer noKillNoDeath;
    @JsonProperty("shotgunDeaths")
    private Integer shotgunDeaths;
    @JsonProperty("killstreakChopperGunnerKills")
    private Integer killstreakChopperGunnerKills;
    @JsonProperty("shotsFired")
    private Integer shotsFired;
    @JsonProperty("stoppingPowerKills")
    private Integer stoppingPowerKills;
    @JsonProperty("pistolPeaths")
    private Integer pistolPeaths;
    @JsonProperty("killstreakShieldTurretKills")
    private Integer killstreakShieldTurretKills;
    @JsonProperty("timeCrouched")
    private Integer timeCrouched;
    @JsonProperty("noDeathsFromBehind")
    private Integer noDeathsFromBehind;
    @JsonProperty("bombPlanted")
    private Integer bombPlanted;
    @JsonProperty("setbacks")
    private Integer setbacks;
    @JsonProperty("smgKills")
    private Integer smgKills;
    @JsonProperty("claymoreKills")
    private Integer claymoreKills;
    @JsonProperty("kills10NoDeaths")
    private Integer kills10NoDeaths;
    @JsonProperty("pistolHeadshots")
    private Integer pistolHeadshots;
    @JsonProperty("killstreakVTOLJetKills")
    private Integer killstreakVTOLJetKills;
    @JsonProperty("headshots")
    private Integer headshots;
    @JsonProperty("mostDeaths")
    private Integer mostDeaths;
    @JsonProperty("adsKills")
    private Integer adsKills;
    @JsonProperty("empDroneHits")
    private Integer empDroneHits;
    @JsonProperty("defenderKills")
    private Integer defenderKills;
    @JsonProperty("launcherHeadshots")
    private Integer launcherHeadshots;
    @JsonProperty("timesSelectedAsSquadLeader")
    private Integer timesSelectedAsSquadLeader;
    @JsonProperty("killstreakAirKills")
    private Integer killstreakAirKills;
    @JsonProperty("assaults")
    private Integer assaults;
    @JsonProperty("fragKills")
    private Integer fragKills;
    @JsonProperty("killstreakEmergencyAirdropUsed")
    private Integer killstreakEmergencyAirdropUsed;
    @JsonProperty("captures")
    private Integer captures;
    @JsonProperty("killstreakChopperSupportKills")
    private Integer killstreakChopperSupportKills;
    @JsonProperty("spawnSelectBase")
    private Integer spawnSelectBase;
    @JsonProperty("noKill10Deaths")
    private Integer noKill10Deaths;
    @JsonProperty("leastDeaths")
    private Integer leastDeaths;
    @JsonProperty("killstreakSentryGunKills")
    private Integer killstreakSentryGunKills;
    @JsonProperty("longestTimeSpentOnWeapon")
    private Integer longestTimeSpentOnWeapon;
    @JsonProperty("lowerRankedKills")
    private Integer lowerRankedKills;
    @JsonProperty("trophySystemHits")
    private Integer trophySystemHits;
    @JsonProperty("clutchRevives")
    private Integer clutchRevives;
    @JsonProperty("lowestAvgAltitude")
    private Integer lowestAvgAltitude;
    @JsonProperty("pickups")
    private Integer pickups;
    @JsonProperty("pistolKills")
    private Integer pistolKills;
    @JsonProperty("reloads")
    private Integer reloads;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("classChanges")
    public Integer getClassChanges() {
        return classChanges;
    }

    @JsonProperty("classChanges")
    public void setClassChanges(Integer classChanges) {
        this.classChanges = classChanges;
    }

    @JsonProperty("highestAvgAltitude")
    public Integer getHighestAvgAltitude() {
        return highestAvgAltitude;
    }

    @JsonProperty("highestAvgAltitude")
    public void setHighestAvgAltitude(Integer highestAvgAltitude) {
        this.highestAvgAltitude = highestAvgAltitude;
    }

    @JsonProperty("killsFromBehind")
    public Integer getKillsFromBehind() {
        return killsFromBehind;
    }

    @JsonProperty("killsFromBehind")
    public void setKillsFromBehind(Integer killsFromBehind) {
        this.killsFromBehind = killsFromBehind;
    }

    @JsonProperty("lmgDeaths")
    public Integer getLmgDeaths() {
        return lmgDeaths;
    }

    @JsonProperty("lmgDeaths")
    public void setLmgDeaths(Integer lmgDeaths) {
        this.lmgDeaths = lmgDeaths;
    }

    @JsonProperty("riotShieldDamageAbsorbed")
    public Integer getRiotShieldDamageAbsorbed() {
        return riotShieldDamageAbsorbed;
    }

    @JsonProperty("riotShieldDamageAbsorbed")
    public void setRiotShieldDamageAbsorbed(Integer riotShieldDamageAbsorbed) {
        this.riotShieldDamageAbsorbed = riotShieldDamageAbsorbed;
    }

    @JsonProperty("flashbangHits")
    public Integer getFlashbangHits() {
        return flashbangHits;
    }

    @JsonProperty("flashbangHits")
    public void setFlashbangHits(Integer flashbangHits) {
        this.flashbangHits = flashbangHits;
    }

    @JsonProperty("meleeKills")
    public Integer getMeleeKills() {
        return meleeKills;
    }

    @JsonProperty("meleeKills")
    public void setMeleeKills(Integer meleeKills) {
        this.meleeKills = meleeKills;
    }

    @JsonProperty("tagsLargestBank")
    public Integer getTagsLargestBank() {
        return tagsLargestBank;
    }

    @JsonProperty("tagsLargestBank")
    public void setTagsLargestBank(Integer tagsLargestBank) {
        this.tagsLargestBank = tagsLargestBank;
    }

    @JsonProperty("shotgunKills")
    public Integer getShotgunKills() {
        return shotgunKills;
    }

    @JsonProperty("shotgunKills")
    public void setShotgunKills(Integer shotgunKills) {
        this.shotgunKills = shotgunKills;
    }

    @JsonProperty("sniperDeaths")
    public Integer getSniperDeaths() {
        return sniperDeaths;
    }

    @JsonProperty("sniperDeaths")
    public void setSniperDeaths(Integer sniperDeaths) {
        this.sniperDeaths = sniperDeaths;
    }

    @JsonProperty("timeProne")
    public Integer getTimeProne() {
        return timeProne;
    }

    @JsonProperty("timeProne")
    public void setTimeProne(Integer timeProne) {
        this.timeProne = timeProne;
    }

    @JsonProperty("killstreakWhitePhosphorousKillsAssists")
    public Integer getKillstreakWhitePhosphorousKillsAssists() {
        return killstreakWhitePhosphorousKillsAssists;
    }

    @JsonProperty("killstreakWhitePhosphorousKillsAssists")
    public void setKillstreakWhitePhosphorousKillsAssists(Integer killstreakWhitePhosphorousKillsAssists) {
        this.killstreakWhitePhosphorousKillsAssists = killstreakWhitePhosphorousKillsAssists;
    }

    @JsonProperty("shortestLife")
    public Integer getShortestLife() {
        return shortestLife;
    }

    @JsonProperty("shortestLife")
    public void setShortestLife(Integer shortestLife) {
        this.shortestLife = shortestLife;
    }

    @JsonProperty("deathsFromBehind")
    public Integer getDeathsFromBehind() {
        return deathsFromBehind;
    }

    @JsonProperty("deathsFromBehind")
    public void setDeathsFromBehind(Integer deathsFromBehind) {
        this.deathsFromBehind = deathsFromBehind;
    }

    @JsonProperty("higherRankedKills")
    public Integer getHigherRankedKills() {
        return higherRankedKills;
    }

    @JsonProperty("higherRankedKills")
    public void setHigherRankedKills(Integer higherRankedKills) {
        this.higherRankedKills = higherRankedKills;
    }

    @JsonProperty("mostAssists")
    public Integer getMostAssists() {
        return mostAssists;
    }

    @JsonProperty("mostAssists")
    public void setMostAssists(Integer mostAssists) {
        this.mostAssists = mostAssists;
    }

    @JsonProperty("leastKills")
    public Integer getLeastKills() {
        return leastKills;
    }

    @JsonProperty("leastKills")
    public void setLeastKills(Integer leastKills) {
        this.leastKills = leastKills;
    }

    @JsonProperty("tagsDenied")
    public Integer getTagsDenied() {
        return tagsDenied;
    }

    @JsonProperty("tagsDenied")
    public void setTagsDenied(Integer tagsDenied) {
        this.tagsDenied = tagsDenied;
    }

    @JsonProperty("killstreakWheelsonKills")
    public Integer getKillstreakWheelsonKills() {
        return killstreakWheelsonKills;
    }

    @JsonProperty("killstreakWheelsonKills")
    public void setKillstreakWheelsonKills(Integer killstreakWheelsonKills) {
        this.killstreakWheelsonKills = killstreakWheelsonKills;
    }

    @JsonProperty("sniperHeadshots")
    public Integer getSniperHeadshots() {
        return sniperHeadshots;
    }

    @JsonProperty("sniperHeadshots")
    public void setSniperHeadshots(Integer sniperHeadshots) {
        this.sniperHeadshots = sniperHeadshots;
    }

    @JsonProperty("killstreakJuggernautKills")
    public Integer getKillstreakJuggernautKills() {
        return killstreakJuggernautKills;
    }

    @JsonProperty("killstreakJuggernautKills")
    public void setKillstreakJuggernautKills(Integer killstreakJuggernautKills) {
        this.killstreakJuggernautKills = killstreakJuggernautKills;
    }

    @JsonProperty("smokesUsed")
    public Integer getSmokesUsed() {
        return smokesUsed;
    }

    @JsonProperty("smokesUsed")
    public void setSmokesUsed(Integer smokesUsed) {
        this.smokesUsed = smokesUsed;
    }

    @JsonProperty("avengerKills")
    public Integer getAvengerKills() {
        return avengerKills;
    }

    @JsonProperty("avengerKills")
    public void setAvengerKills(Integer avengerKills) {
        this.avengerKills = avengerKills;
    }

    @JsonProperty("decoyHits")
    public Integer getDecoyHits() {
        return decoyHits;
    }

    @JsonProperty("decoyHits")
    public void setDecoyHits(Integer decoyHits) {
        this.decoyHits = decoyHits;
    }

    @JsonProperty("killstreakCarePackageUsed")
    public Integer getKillstreakCarePackageUsed() {
        return killstreakCarePackageUsed;
    }

    @JsonProperty("killstreakCarePackageUsed")
    public void setKillstreakCarePackageUsed(Integer killstreakCarePackageUsed) {
        this.killstreakCarePackageUsed = killstreakCarePackageUsed;
    }

    @JsonProperty("molotovKills")
    public Integer getMolotovKills() {
        return molotovKills;
    }

    @JsonProperty("molotovKills")
    public void setMolotovKills(Integer molotovKills) {
        this.molotovKills = molotovKills;
    }

    @JsonProperty("gasHits")
    public Integer getGasHits() {
        return gasHits;
    }

    @JsonProperty("gasHits")
    public void setGasHits(Integer gasHits) {
        this.gasHits = gasHits;
    }

    @JsonProperty("comebackKills")
    public Integer getComebackKills() {
        return comebackKills;
    }

    @JsonProperty("comebackKills")
    public void setComebackKills(Integer comebackKills) {
        this.comebackKills = comebackKills;
    }

    @JsonProperty("lmgHeadshots")
    public Integer getLmgHeadshots() {
        return lmgHeadshots;
    }

    @JsonProperty("lmgHeadshots")
    public void setLmgHeadshots(Integer lmgHeadshots) {
        this.lmgHeadshots = lmgHeadshots;
    }

    @JsonProperty("smgDeaths")
    public Integer getSmgDeaths() {
        return smgDeaths;
    }

    @JsonProperty("smgDeaths")
    public void setSmgDeaths(Integer smgDeaths) {
        this.smgDeaths = smgDeaths;
    }

    @JsonProperty("carrierKills")
    public Integer getCarrierKills() {
        return carrierKills;
    }

    @JsonProperty("carrierKills")
    public void setCarrierKills(Integer carrierKills) {
        this.carrierKills = carrierKills;
    }

    @JsonProperty("deployableCoverUsed")
    public Integer getDeployableCoverUsed() {
        return deployableCoverUsed;
    }

    @JsonProperty("deployableCoverUsed")
    public void setDeployableCoverUsed(Integer deployableCoverUsed) {
        this.deployableCoverUsed = deployableCoverUsed;
    }

    @JsonProperty("thermiteKills")
    public Integer getThermiteKills() {
        return thermiteKills;
    }

    @JsonProperty("thermiteKills")
    public void setThermiteKills(Integer thermiteKills) {
        this.thermiteKills = thermiteKills;
    }

    @JsonProperty("arKills")
    public Integer getArKills() {
        return arKills;
    }

    @JsonProperty("arKills")
    public void setArKills(Integer arKills) {
        this.arKills = arKills;
    }

    @JsonProperty("c4Kills")
    public Integer getC4Kills() {
        return c4Kills;
    }

    @JsonProperty("c4Kills")
    public void setC4Kills(Integer c4Kills) {
        this.c4Kills = c4Kills;
    }

    @JsonProperty("suicides")
    public Integer getSuicides() {
        return suicides;
    }

    @JsonProperty("suicides")
    public void setSuicides(Integer suicides) {
        this.suicides = suicides;
    }

    @JsonProperty("clutch")
    public Integer getClutch() {
        return clutch;
    }

    @JsonProperty("clutch")
    public void setClutch(Integer clutch) {
        this.clutch = clutch;
    }

    @JsonProperty("survivorKills")
    public Integer getSurvivorKills() {
        return survivorKills;
    }

    @JsonProperty("survivorKills")
    public void setSurvivorKills(Integer survivorKills) {
        this.survivorKills = survivorKills;
    }

    @JsonProperty("killstreakGunshipKills")
    public Integer getKillstreakGunshipKills() {
        return killstreakGunshipKills;
    }

    @JsonProperty("killstreakGunshipKills")
    public void setKillstreakGunshipKills(Integer killstreakGunshipKills) {
        this.killstreakGunshipKills = killstreakGunshipKills;
    }

    @JsonProperty("timeSpentAsPassenger")
    public Integer getTimeSpentAsPassenger() {
        return timeSpentAsPassenger;
    }

    @JsonProperty("timeSpentAsPassenger")
    public void setTimeSpentAsPassenger(Integer timeSpentAsPassenger) {
        this.timeSpentAsPassenger = timeSpentAsPassenger;
    }

    @JsonProperty("returns")
    public Integer getReturns() {
        return returns;
    }

    @JsonProperty("returns")
    public void setReturns(Integer returns) {
        this.returns = returns;
    }

    @JsonProperty("smgHeadshots")
    public Integer getSmgHeadshots() {
        return smgHeadshots;
    }

    @JsonProperty("smgHeadshots")
    public void setSmgHeadshots(Integer smgHeadshots) {
        this.smgHeadshots = smgHeadshots;
    }

    @JsonProperty("launcherDeaths")
    public Integer getLauncherDeaths() {
        return launcherDeaths;
    }

    @JsonProperty("launcherDeaths")
    public void setLauncherDeaths(Integer launcherDeaths) {
        this.launcherDeaths = launcherDeaths;
    }

    @JsonProperty("oneShotOneKills")
    public Integer getOneShotOneKills() {
        return oneShotOneKills;
    }

    @JsonProperty("oneShotOneKills")
    public void setOneShotOneKills(Integer oneShotOneKills) {
        this.oneShotOneKills = oneShotOneKills;
    }

    @JsonProperty("ammoBoxUsed")
    public Integer getAmmoBoxUsed() {
        return ammoBoxUsed;
    }

    @JsonProperty("ammoBoxUsed")
    public void setAmmoBoxUsed(Integer ammoBoxUsed) {
        this.ammoBoxUsed = ammoBoxUsed;
    }

    @JsonProperty("spawnSelectSquad")
    public Integer getSpawnSelectSquad() {
        return spawnSelectSquad;
    }

    @JsonProperty("spawnSelectSquad")
    public void setSpawnSelectSquad(Integer spawnSelectSquad) {
        this.spawnSelectSquad = spawnSelectSquad;
    }

    @JsonProperty("weaponPickups")
    public Integer getWeaponPickups() {
        return weaponPickups;
    }

    @JsonProperty("weaponPickups")
    public void setWeaponPickups(Integer weaponPickups) {
        this.weaponPickups = weaponPickups;
    }

    @JsonProperty("pointBlankKills")
    public Integer getPointBlankKills() {
        return pointBlankKills;
    }

    @JsonProperty("pointBlankKills")
    public void setPointBlankKills(Integer pointBlankKills) {
        this.pointBlankKills = pointBlankKills;
    }

    @JsonProperty("tagsCaptured")
    public Integer getTagsCaptured() {
        return tagsCaptured;
    }

    @JsonProperty("tagsCaptured")
    public void setTagsCaptured(Integer tagsCaptured) {
        this.tagsCaptured = tagsCaptured;
    }

    @JsonProperty("killstreakGroundKills")
    public Integer getKillstreakGroundKills() {
        return killstreakGroundKills;
    }

    @JsonProperty("killstreakGroundKills")
    public void setKillstreakGroundKills(Integer killstreakGroundKills) {
        this.killstreakGroundKills = killstreakGroundKills;
    }

    @JsonProperty("distanceTraveledInVehicle")
    public Integer getDistanceTraveledInVehicle() {
        return distanceTraveledInVehicle;
    }

    @JsonProperty("distanceTraveledInVehicle")
    public void setDistanceTraveledInVehicle(Integer distanceTraveledInVehicle) {
        this.distanceTraveledInVehicle = distanceTraveledInVehicle;
    }

    @JsonProperty("longestLife")
    public Integer getLongestLife() {
        return longestLife;
    }

    @JsonProperty("longestLife")
    public void setLongestLife(Integer longestLife) {
        this.longestLife = longestLife;
    }

    @JsonProperty("stunHits")
    public Integer getStunHits() {
        return stunHits;
    }

    @JsonProperty("stunHits")
    public void setStunHits(Integer stunHits) {
        this.stunHits = stunHits;
    }

    @JsonProperty("spawnSelectFlag")
    public Integer getSpawnSelectFlag() {
        return spawnSelectFlag;
    }

    @JsonProperty("spawnSelectFlag")
    public void setSpawnSelectFlag(Integer spawnSelectFlag) {
        this.spawnSelectFlag = spawnSelectFlag;
    }

    @JsonProperty("shotgunHeadshots")
    public Integer getShotgunHeadshots() {
        return shotgunHeadshots;
    }

    @JsonProperty("shotgunHeadshots")
    public void setShotgunHeadshots(Integer shotgunHeadshots) {
        this.shotgunHeadshots = shotgunHeadshots;
    }

    @JsonProperty("bombDefused")
    public Integer getBombDefused() {
        return bombDefused;
    }

    @JsonProperty("bombDefused")
    public void setBombDefused(Integer bombDefused) {
        this.bombDefused = bombDefused;
    }

    @JsonProperty("snapshotHits")
    public Integer getSnapshotHits() {
        return snapshotHits;
    }

    @JsonProperty("snapshotHits")
    public void setSnapshotHits(Integer snapshotHits) {
        this.snapshotHits = snapshotHits;
    }

    @JsonProperty("noKillsWithDeath")
    public Integer getNoKillsWithDeath() {
        return noKillsWithDeath;
    }

    @JsonProperty("noKillsWithDeath")
    public void setNoKillsWithDeath(Integer noKillsWithDeath) {
        this.noKillsWithDeath = noKillsWithDeath;
    }

    @JsonProperty("killstreakAUAVAssists")
    public Integer getKillstreakAUAVAssists() {
        return killstreakAUAVAssists;
    }

    @JsonProperty("killstreakAUAVAssists")
    public void setKillstreakAUAVAssists(Integer killstreakAUAVAssists) {
        this.killstreakAUAVAssists = killstreakAUAVAssists;
    }

    @JsonProperty("killstreakPersonalUAVKills")
    public Integer getKillstreakPersonalUAVKills() {
        return killstreakPersonalUAVKills;
    }

    @JsonProperty("killstreakPersonalUAVKills")
    public void setKillstreakPersonalUAVKills(Integer killstreakPersonalUAVKills) {
        this.killstreakPersonalUAVKills = killstreakPersonalUAVKills;
    }

    @JsonProperty("tacticalInsertionSpawns")
    public Integer getTacticalInsertionSpawns() {
        return tacticalInsertionSpawns;
    }

    @JsonProperty("tacticalInsertionSpawns")
    public void setTacticalInsertionSpawns(Integer tacticalInsertionSpawns) {
        this.tacticalInsertionSpawns = tacticalInsertionSpawns;
    }

    @JsonProperty("launcherKills")
    public Integer getLauncherKills() {
        return launcherKills;
    }

    @JsonProperty("launcherKills")
    public void setLauncherKills(Integer launcherKills) {
        this.launcherKills = launcherKills;
    }

    @JsonProperty("spawnSelectVehicle")
    public Integer getSpawnSelectVehicle() {
        return spawnSelectVehicle;
    }

    @JsonProperty("spawnSelectVehicle")
    public void setSpawnSelectVehicle(Integer spawnSelectVehicle) {
        this.spawnSelectVehicle = spawnSelectVehicle;
    }

    @JsonProperty("mostKillsLeastDeaths")
    public Integer getMostKillsLeastDeaths() {
        return mostKillsLeastDeaths;
    }

    @JsonProperty("mostKillsLeastDeaths")
    public void setMostKillsLeastDeaths(Integer mostKillsLeastDeaths) {
        this.mostKillsLeastDeaths = mostKillsLeastDeaths;
    }

    @JsonProperty("mostKills")
    public Integer getMostKills() {
        return mostKills;
    }

    @JsonProperty("mostKills")
    public void setMostKills(Integer mostKills) {
        this.mostKills = mostKills;
    }

    @JsonProperty("defends")
    public Integer getDefends() {
        return defends;
    }

    @JsonProperty("defends")
    public void setDefends(Integer defends) {
        this.defends = defends;
    }

    @JsonProperty("timeSpentAsDriver")
    public Integer getTimeSpentAsDriver() {
        return timeSpentAsDriver;
    }

    @JsonProperty("timeSpentAsDriver")
    public void setTimeSpentAsDriver(Integer timeSpentAsDriver) {
        this.timeSpentAsDriver = timeSpentAsDriver;
    }

    @JsonProperty("bombDetonated")
    public Integer getBombDetonated() {
        return bombDetonated;
    }

    @JsonProperty("bombDetonated")
    public void setBombDetonated(Integer bombDetonated) {
        this.bombDetonated = bombDetonated;
    }

    @JsonProperty("arHeadshots")
    public Integer getArHeadshots() {
        return arHeadshots;
    }

    @JsonProperty("arHeadshots")
    public void setArHeadshots(Integer arHeadshots) {
        this.arHeadshots = arHeadshots;
    }

    @JsonProperty("timeOnPoint")
    public Integer getTimeOnPoint() {
        return timeOnPoint;
    }

    @JsonProperty("timeOnPoint")
    public void setTimeOnPoint(Integer timeOnPoint) {
        this.timeOnPoint = timeOnPoint;
    }

    @JsonProperty("lmgKills")
    public Integer getLmgKills() {
        return lmgKills;
    }

    @JsonProperty("lmgKills")
    public void setLmgKills(Integer lmgKills) {
        this.lmgKills = lmgKills;
    }

    @JsonProperty("killstreakUAVAssists")
    public Integer getKillstreakUAVAssists() {
        return killstreakUAVAssists;
    }

    @JsonProperty("killstreakUAVAssists")
    public void setKillstreakUAVAssists(Integer killstreakUAVAssists) {
        this.killstreakUAVAssists = killstreakUAVAssists;
    }

    @JsonProperty("carepackagesCaptured")
    public Integer getCarepackagesCaptured() {
        return carepackagesCaptured;
    }

    @JsonProperty("carepackagesCaptured")
    public void setCarepackagesCaptured(Integer carepackagesCaptured) {
        this.carepackagesCaptured = carepackagesCaptured;
    }

    @JsonProperty("mostKillsLongestStreak")
    public Integer getMostKillsLongestStreak() {
        return mostKillsLongestStreak;
    }

    @JsonProperty("mostKillsLongestStreak")
    public void setMostKillsLongestStreak(Integer mostKillsLongestStreak) {
        this.mostKillsLongestStreak = mostKillsLongestStreak;
    }

    @JsonProperty("killstreakCruiseMissileKills")
    public Integer getKillstreakCruiseMissileKills() {
        return killstreakCruiseMissileKills;
    }

    @JsonProperty("killstreakCruiseMissileKills")
    public void setKillstreakCruiseMissileKills(Integer killstreakCruiseMissileKills) {
        this.killstreakCruiseMissileKills = killstreakCruiseMissileKills;
    }

    @JsonProperty("longestStreak")
    public Integer getLongestStreak() {
        return longestStreak;
    }

    @JsonProperty("longestStreak")
    public void setLongestStreak(Integer longestStreak) {
        this.longestStreak = longestStreak;
    }

    @JsonProperty("destroyedKillstreaks")
    public Integer getDestroyedKillstreaks() {
        return destroyedKillstreaks;
    }

    @JsonProperty("destroyedKillstreaks")
    public void setDestroyedKillstreaks(Integer destroyedKillstreaks) {
        this.destroyedKillstreaks = destroyedKillstreaks;
    }

    @JsonProperty("hipfireKills")
    public Integer getHipfireKills() {
        return hipfireKills;
    }

    @JsonProperty("hipfireKills")
    public void setHipfireKills(Integer hipfireKills) {
        this.hipfireKills = hipfireKills;
    }

    @JsonProperty("stimDamageHealed")
    public Integer getStimDamageHealed() {
        return stimDamageHealed;
    }

    @JsonProperty("stimDamageHealed")
    public void setStimDamageHealed(Integer stimDamageHealed) {
        this.stimDamageHealed = stimDamageHealed;
    }

    @JsonProperty("skippedKillcams")
    public Integer getSkippedKillcams() {
        return skippedKillcams;
    }

    @JsonProperty("skippedKillcams")
    public void setSkippedKillcams(Integer skippedKillcams) {
        this.skippedKillcams = skippedKillcams;
    }

    @JsonProperty("leastAssists")
    public Integer getLeastAssists() {
        return leastAssists;
    }

    @JsonProperty("leastAssists")
    public void setLeastAssists(Integer leastAssists) {
        this.leastAssists = leastAssists;
    }

    @JsonProperty("mostMultikills")
    public Integer getMostMultikills() {
        return mostMultikills;
    }

    @JsonProperty("mostMultikills")
    public void setMostMultikills(Integer mostMultikills) {
        this.mostMultikills = mostMultikills;
    }

    @JsonProperty("highestRankedKills")
    public Integer getHighestRankedKills() {
        return highestRankedKills;
    }

    @JsonProperty("highestRankedKills")
    public void setHighestRankedKills(Integer highestRankedKills) {
        this.highestRankedKills = highestRankedKills;
    }

    @JsonProperty("killstreakAirstrikeKills")
    public Integer getKillstreakAirstrikeKills() {
        return killstreakAirstrikeKills;
    }

    @JsonProperty("killstreakAirstrikeKills")
    public void setKillstreakAirstrikeKills(Integer killstreakAirstrikeKills) {
        this.killstreakAirstrikeKills = killstreakAirstrikeKills;
    }

    @JsonProperty("distanceTravelled")
    public Integer getDistanceTravelled() {
        return distanceTravelled;
    }

    @JsonProperty("distanceTravelled")
    public void setDistanceTravelled(Integer distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    @JsonProperty("killstreakKills")
    public Integer getKillstreakKills() {
        return killstreakKills;
    }

    @JsonProperty("killstreakKills")
    public void setKillstreakKills(Integer killstreakKills) {
        this.killstreakKills = killstreakKills;
    }

    @JsonProperty("semtexKills")
    public Integer getSemtexKills() {
        return semtexKills;
    }

    @JsonProperty("semtexKills")
    public void setSemtexKills(Integer semtexKills) {
        this.semtexKills = semtexKills;
    }

    @JsonProperty("penetrationKills")
    public Integer getPenetrationKills() {
        return penetrationKills;
    }

    @JsonProperty("penetrationKills")
    public void setPenetrationKills(Integer penetrationKills) {
        this.penetrationKills = penetrationKills;
    }

    @JsonProperty("explosionsSurvived")
    public Integer getExplosionsSurvived() {
        return explosionsSurvived;
    }

    @JsonProperty("explosionsSurvived")
    public void setExplosionsSurvived(Integer explosionsSurvived) {
        this.explosionsSurvived = explosionsSurvived;
    }

    @JsonProperty("highestMultikill")
    public Integer getHighestMultikill() {
        return highestMultikill;
    }

    @JsonProperty("highestMultikill")
    public void setHighestMultikill(Integer highestMultikill) {
        this.highestMultikill = highestMultikill;
    }

    @JsonProperty("arDeaths")
    public Integer getArDeaths() {
        return arDeaths;
    }

    @JsonProperty("arDeaths")
    public void setArDeaths(Integer arDeaths) {
        this.arDeaths = arDeaths;
    }

    @JsonProperty("longshotKills")
    public Integer getLongshotKills() {
        return longshotKills;
    }

    @JsonProperty("longshotKills")
    public void setLongshotKills(Integer longshotKills) {
        this.longshotKills = longshotKills;
    }

    @JsonProperty("proximityMineKills")
    public Integer getProximityMineKills() {
        return proximityMineKills;
    }

    @JsonProperty("proximityMineKills")
    public void setProximityMineKills(Integer proximityMineKills) {
        this.proximityMineKills = proximityMineKills;
    }

    @JsonProperty("tagsMegaBanked")
    public Integer getTagsMegaBanked() {
        return tagsMegaBanked;
    }

    @JsonProperty("tagsMegaBanked")
    public void setTagsMegaBanked(Integer tagsMegaBanked) {
        this.tagsMegaBanked = tagsMegaBanked;
    }

    @JsonProperty("mostKillsMostHeadshots")
    public Integer getMostKillsMostHeadshots() {
        return mostKillsMostHeadshots;
    }

    @JsonProperty("mostKillsMostHeadshots")
    public void setMostKillsMostHeadshots(Integer mostKillsMostHeadshots) {
        this.mostKillsMostHeadshots = mostKillsMostHeadshots;
    }

    @JsonProperty("firstInfected")
    public Integer getFirstInfected() {
        return firstInfected;
    }

    @JsonProperty("firstInfected")
    public void setFirstInfected(Integer firstInfected) {
        this.firstInfected = firstInfected;
    }

    @JsonProperty("killstreakCUAVAssists")
    public Integer getKillstreakCUAVAssists() {
        return killstreakCUAVAssists;
    }

    @JsonProperty("killstreakCUAVAssists")
    public void setKillstreakCUAVAssists(Integer killstreakCUAVAssists) {
        this.killstreakCUAVAssists = killstreakCUAVAssists;
    }

    @JsonProperty("throwingKnifeKills")
    public Integer getThrowingKnifeKills() {
        return throwingKnifeKills;
    }

    @JsonProperty("throwingKnifeKills")
    public void setThrowingKnifeKills(Integer throwingKnifeKills) {
        this.throwingKnifeKills = throwingKnifeKills;
    }

    @JsonProperty("executionKills")
    public Integer getExecutionKills() {
        return executionKills;
    }

    @JsonProperty("executionKills")
    public void setExecutionKills(Integer executionKills) {
        this.executionKills = executionKills;
    }

    @JsonProperty("lastSurvivor")
    public Integer getLastSurvivor() {
        return lastSurvivor;
    }

    @JsonProperty("lastSurvivor")
    public void setLastSurvivor(Integer lastSurvivor) {
        this.lastSurvivor = lastSurvivor;
    }

    @JsonProperty("reconDroneMarks")
    public Integer getReconDroneMarks() {
        return reconDroneMarks;
    }

    @JsonProperty("reconDroneMarks")
    public void setReconDroneMarks(Integer reconDroneMarks) {
        this.reconDroneMarks = reconDroneMarks;
    }

    @JsonProperty("deadSilenceKills")
    public Integer getDeadSilenceKills() {
        return deadSilenceKills;
    }

    @JsonProperty("deadSilenceKills")
    public void setDeadSilenceKills(Integer deadSilenceKills) {
        this.deadSilenceKills = deadSilenceKills;
    }

    @JsonProperty("revengeKills")
    public Integer getRevengeKills() {
        return revengeKills;
    }

    @JsonProperty("revengeKills")
    public void setRevengeKills(Integer revengeKills) {
        this.revengeKills = revengeKills;
    }

    @JsonProperty("infectedKills")
    public Integer getInfectedKills() {
        return infectedKills;
    }

    @JsonProperty("infectedKills")
    public void setInfectedKills(Integer infectedKills) {
        this.infectedKills = infectedKills;
    }

    @JsonProperty("killEnemyTeam")
    public Integer getKillEnemyTeam() {
        return killEnemyTeam;
    }

    @JsonProperty("killEnemyTeam")
    public void setKillEnemyTeam(Integer killEnemyTeam) {
        this.killEnemyTeam = killEnemyTeam;
    }

    @JsonProperty("sniperKills")
    public Integer getSniperKills() {
        return sniperKills;
    }

    @JsonProperty("sniperKills")
    public void setSniperKills(Integer sniperKills) {
        this.sniperKills = sniperKills;
    }

    @JsonProperty("killstreakCluserStrikeKills")
    public Integer getKillstreakCluserStrikeKills() {
        return killstreakCluserStrikeKills;
    }

    @JsonProperty("killstreakCluserStrikeKills")
    public void setKillstreakCluserStrikeKills(Integer killstreakCluserStrikeKills) {
        this.killstreakCluserStrikeKills = killstreakCluserStrikeKills;
    }

    @JsonProperty("meleeDeaths")
    public Integer getMeleeDeaths() {
        return meleeDeaths;
    }

    @JsonProperty("meleeDeaths")
    public void setMeleeDeaths(Integer meleeDeaths) {
        this.meleeDeaths = meleeDeaths;
    }

    @JsonProperty("timeWatchingKillcams")
    public Integer getTimeWatchingKillcams() {
        return timeWatchingKillcams;
    }

    @JsonProperty("timeWatchingKillcams")
    public void setTimeWatchingKillcams(Integer timeWatchingKillcams) {
        this.timeWatchingKillcams = timeWatchingKillcams;
    }

    @JsonProperty("killstreakTankKills")
    public Integer getKillstreakTankKills() {
        return killstreakTankKills;
    }

    @JsonProperty("killstreakTankKills")
    public void setKillstreakTankKills(Integer killstreakTankKills) {
        this.killstreakTankKills = killstreakTankKills;
    }

    @JsonProperty("noKillNoDeath")
    public Integer getNoKillNoDeath() {
        return noKillNoDeath;
    }

    @JsonProperty("noKillNoDeath")
    public void setNoKillNoDeath(Integer noKillNoDeath) {
        this.noKillNoDeath = noKillNoDeath;
    }

    @JsonProperty("shotgunDeaths")
    public Integer getShotgunDeaths() {
        return shotgunDeaths;
    }

    @JsonProperty("shotgunDeaths")
    public void setShotgunDeaths(Integer shotgunDeaths) {
        this.shotgunDeaths = shotgunDeaths;
    }

    @JsonProperty("killstreakChopperGunnerKills")
    public Integer getKillstreakChopperGunnerKills() {
        return killstreakChopperGunnerKills;
    }

    @JsonProperty("killstreakChopperGunnerKills")
    public void setKillstreakChopperGunnerKills(Integer killstreakChopperGunnerKills) {
        this.killstreakChopperGunnerKills = killstreakChopperGunnerKills;
    }

    @JsonProperty("shotsFired")
    public Integer getShotsFired() {
        return shotsFired;
    }

    @JsonProperty("shotsFired")
    public void setShotsFired(Integer shotsFired) {
        this.shotsFired = shotsFired;
    }

    @JsonProperty("stoppingPowerKills")
    public Integer getStoppingPowerKills() {
        return stoppingPowerKills;
    }

    @JsonProperty("stoppingPowerKills")
    public void setStoppingPowerKills(Integer stoppingPowerKills) {
        this.stoppingPowerKills = stoppingPowerKills;
    }

    @JsonProperty("pistolPeaths")
    public Integer getPistolPeaths() {
        return pistolPeaths;
    }

    @JsonProperty("pistolPeaths")
    public void setPistolPeaths(Integer pistolPeaths) {
        this.pistolPeaths = pistolPeaths;
    }

    @JsonProperty("killstreakShieldTurretKills")
    public Integer getKillstreakShieldTurretKills() {
        return killstreakShieldTurretKills;
    }

    @JsonProperty("killstreakShieldTurretKills")
    public void setKillstreakShieldTurretKills(Integer killstreakShieldTurretKills) {
        this.killstreakShieldTurretKills = killstreakShieldTurretKills;
    }

    @JsonProperty("timeCrouched")
    public Integer getTimeCrouched() {
        return timeCrouched;
    }

    @JsonProperty("timeCrouched")
    public void setTimeCrouched(Integer timeCrouched) {
        this.timeCrouched = timeCrouched;
    }

    @JsonProperty("noDeathsFromBehind")
    public Integer getNoDeathsFromBehind() {
        return noDeathsFromBehind;
    }

    @JsonProperty("noDeathsFromBehind")
    public void setNoDeathsFromBehind(Integer noDeathsFromBehind) {
        this.noDeathsFromBehind = noDeathsFromBehind;
    }

    @JsonProperty("bombPlanted")
    public Integer getBombPlanted() {
        return bombPlanted;
    }

    @JsonProperty("bombPlanted")
    public void setBombPlanted(Integer bombPlanted) {
        this.bombPlanted = bombPlanted;
    }

    @JsonProperty("setbacks")
    public Integer getSetbacks() {
        return setbacks;
    }

    @JsonProperty("setbacks")
    public void setSetbacks(Integer setbacks) {
        this.setbacks = setbacks;
    }

    @JsonProperty("smgKills")
    public Integer getSmgKills() {
        return smgKills;
    }

    @JsonProperty("smgKills")
    public void setSmgKills(Integer smgKills) {
        this.smgKills = smgKills;
    }

    @JsonProperty("claymoreKills")
    public Integer getClaymoreKills() {
        return claymoreKills;
    }

    @JsonProperty("claymoreKills")
    public void setClaymoreKills(Integer claymoreKills) {
        this.claymoreKills = claymoreKills;
    }

    @JsonProperty("kills10NoDeaths")
    public Integer getKills10NoDeaths() {
        return kills10NoDeaths;
    }

    @JsonProperty("kills10NoDeaths")
    public void setKills10NoDeaths(Integer kills10NoDeaths) {
        this.kills10NoDeaths = kills10NoDeaths;
    }

    @JsonProperty("pistolHeadshots")
    public Integer getPistolHeadshots() {
        return pistolHeadshots;
    }

    @JsonProperty("pistolHeadshots")
    public void setPistolHeadshots(Integer pistolHeadshots) {
        this.pistolHeadshots = pistolHeadshots;
    }

    @JsonProperty("killstreakVTOLJetKills")
    public Integer getKillstreakVTOLJetKills() {
        return killstreakVTOLJetKills;
    }

    @JsonProperty("killstreakVTOLJetKills")
    public void setKillstreakVTOLJetKills(Integer killstreakVTOLJetKills) {
        this.killstreakVTOLJetKills = killstreakVTOLJetKills;
    }

    @JsonProperty("headshots")
    public Integer getHeadshots() {
        return headshots;
    }

    @JsonProperty("headshots")
    public void setHeadshots(Integer headshots) {
        this.headshots = headshots;
    }

    @JsonProperty("mostDeaths")
    public Integer getMostDeaths() {
        return mostDeaths;
    }

    @JsonProperty("mostDeaths")
    public void setMostDeaths(Integer mostDeaths) {
        this.mostDeaths = mostDeaths;
    }

    @JsonProperty("adsKills")
    public Integer getAdsKills() {
        return adsKills;
    }

    @JsonProperty("adsKills")
    public void setAdsKills(Integer adsKills) {
        this.adsKills = adsKills;
    }

    @JsonProperty("empDroneHits")
    public Integer getEmpDroneHits() {
        return empDroneHits;
    }

    @JsonProperty("empDroneHits")
    public void setEmpDroneHits(Integer empDroneHits) {
        this.empDroneHits = empDroneHits;
    }

    @JsonProperty("defenderKills")
    public Integer getDefenderKills() {
        return defenderKills;
    }

    @JsonProperty("defenderKills")
    public void setDefenderKills(Integer defenderKills) {
        this.defenderKills = defenderKills;
    }

    @JsonProperty("launcherHeadshots")
    public Integer getLauncherHeadshots() {
        return launcherHeadshots;
    }

    @JsonProperty("launcherHeadshots")
    public void setLauncherHeadshots(Integer launcherHeadshots) {
        this.launcherHeadshots = launcherHeadshots;
    }

    @JsonProperty("timesSelectedAsSquadLeader")
    public Integer getTimesSelectedAsSquadLeader() {
        return timesSelectedAsSquadLeader;
    }

    @JsonProperty("timesSelectedAsSquadLeader")
    public void setTimesSelectedAsSquadLeader(Integer timesSelectedAsSquadLeader) {
        this.timesSelectedAsSquadLeader = timesSelectedAsSquadLeader;
    }

    @JsonProperty("killstreakAirKills")
    public Integer getKillstreakAirKills() {
        return killstreakAirKills;
    }

    @JsonProperty("killstreakAirKills")
    public void setKillstreakAirKills(Integer killstreakAirKills) {
        this.killstreakAirKills = killstreakAirKills;
    }

    @JsonProperty("assaults")
    public Integer getAssaults() {
        return assaults;
    }

    @JsonProperty("assaults")
    public void setAssaults(Integer assaults) {
        this.assaults = assaults;
    }

    @JsonProperty("fragKills")
    public Integer getFragKills() {
        return fragKills;
    }

    @JsonProperty("fragKills")
    public void setFragKills(Integer fragKills) {
        this.fragKills = fragKills;
    }

    @JsonProperty("killstreakEmergencyAirdropUsed")
    public Integer getKillstreakEmergencyAirdropUsed() {
        return killstreakEmergencyAirdropUsed;
    }

    @JsonProperty("killstreakEmergencyAirdropUsed")
    public void setKillstreakEmergencyAirdropUsed(Integer killstreakEmergencyAirdropUsed) {
        this.killstreakEmergencyAirdropUsed = killstreakEmergencyAirdropUsed;
    }

    @JsonProperty("captures")
    public Integer getCaptures() {
        return captures;
    }

    @JsonProperty("captures")
    public void setCaptures(Integer captures) {
        this.captures = captures;
    }

    @JsonProperty("killstreakChopperSupportKills")
    public Integer getKillstreakChopperSupportKills() {
        return killstreakChopperSupportKills;
    }

    @JsonProperty("killstreakChopperSupportKills")
    public void setKillstreakChopperSupportKills(Integer killstreakChopperSupportKills) {
        this.killstreakChopperSupportKills = killstreakChopperSupportKills;
    }

    @JsonProperty("spawnSelectBase")
    public Integer getSpawnSelectBase() {
        return spawnSelectBase;
    }

    @JsonProperty("spawnSelectBase")
    public void setSpawnSelectBase(Integer spawnSelectBase) {
        this.spawnSelectBase = spawnSelectBase;
    }

    @JsonProperty("noKill10Deaths")
    public Integer getNoKill10Deaths() {
        return noKill10Deaths;
    }

    @JsonProperty("noKill10Deaths")
    public void setNoKill10Deaths(Integer noKill10Deaths) {
        this.noKill10Deaths = noKill10Deaths;
    }

    @JsonProperty("leastDeaths")
    public Integer getLeastDeaths() {
        return leastDeaths;
    }

    @JsonProperty("leastDeaths")
    public void setLeastDeaths(Integer leastDeaths) {
        this.leastDeaths = leastDeaths;
    }

    @JsonProperty("killstreakSentryGunKills")
    public Integer getKillstreakSentryGunKills() {
        return killstreakSentryGunKills;
    }

    @JsonProperty("killstreakSentryGunKills")
    public void setKillstreakSentryGunKills(Integer killstreakSentryGunKills) {
        this.killstreakSentryGunKills = killstreakSentryGunKills;
    }

    @JsonProperty("longestTimeSpentOnWeapon")
    public Integer getLongestTimeSpentOnWeapon() {
        return longestTimeSpentOnWeapon;
    }

    @JsonProperty("longestTimeSpentOnWeapon")
    public void setLongestTimeSpentOnWeapon(Integer longestTimeSpentOnWeapon) {
        this.longestTimeSpentOnWeapon = longestTimeSpentOnWeapon;
    }

    @JsonProperty("lowerRankedKills")
    public Integer getLowerRankedKills() {
        return lowerRankedKills;
    }

    @JsonProperty("lowerRankedKills")
    public void setLowerRankedKills(Integer lowerRankedKills) {
        this.lowerRankedKills = lowerRankedKills;
    }

    @JsonProperty("trophySystemHits")
    public Integer getTrophySystemHits() {
        return trophySystemHits;
    }

    @JsonProperty("trophySystemHits")
    public void setTrophySystemHits(Integer trophySystemHits) {
        this.trophySystemHits = trophySystemHits;
    }

    @JsonProperty("clutchRevives")
    public Integer getClutchRevives() {
        return clutchRevives;
    }

    @JsonProperty("clutchRevives")
    public void setClutchRevives(Integer clutchRevives) {
        this.clutchRevives = clutchRevives;
    }

    @JsonProperty("lowestAvgAltitude")
    public Integer getLowestAvgAltitude() {
        return lowestAvgAltitude;
    }

    @JsonProperty("lowestAvgAltitude")
    public void setLowestAvgAltitude(Integer lowestAvgAltitude) {
        this.lowestAvgAltitude = lowestAvgAltitude;
    }

    @JsonProperty("pickups")
    public Integer getPickups() {
        return pickups;
    }

    @JsonProperty("pickups")
    public void setPickups(Integer pickups) {
        this.pickups = pickups;
    }

    @JsonProperty("pistolKills")
    public Integer getPistolKills() {
        return pistolKills;
    }

    @JsonProperty("pistolKills")
    public void setPistolKills(Integer pistolKills) {
        this.pistolKills = pistolKills;
    }

    @JsonProperty("reloads")
    public Integer getReloads() {
        return reloads;
    }

    @JsonProperty("reloads")
    public void setReloads(Integer reloads) {
        this.reloads = reloads;
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
