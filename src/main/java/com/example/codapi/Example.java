
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
    "title",
    "platform",
    "username",
    "type",
    "level",
    "maxLevel",
    "levelXpRemainder",
    "levelXpGained",
    "prestige",
    "prestigeId",
    "maxPrestige",
    "totalXp",
    "paragonRank",
    "paragonId",
    "s",
    "p",
    "lifetime",
    "weekly",
    "engagement"
})
@Generated("jsonschema2pojo")
public class Example {

    @JsonProperty("title")
    private String title;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("username")
    private String username;
    @JsonProperty("type")
    private String type;
    @JsonProperty("level")
    private Integer level;
    @JsonProperty("maxLevel")
    private Integer maxLevel;
    @JsonProperty("levelXpRemainder")
    private Integer levelXpRemainder;
    @JsonProperty("levelXpGained")
    private Integer levelXpGained;
    @JsonProperty("prestige")
    private Integer prestige;
    @JsonProperty("prestigeId")
    private Integer prestigeId;
    @JsonProperty("maxPrestige")
    private Integer maxPrestige;
    @JsonProperty("totalXp")
    private Integer totalXp;
    @JsonProperty("paragonRank")
    private Integer paragonRank;
    @JsonProperty("paragonId")
    private Integer paragonId;
    @JsonProperty("s")
    private Integer s;
    @JsonProperty("p")
    private Integer p;
    @JsonProperty("lifetime")
    private Lifetime lifetime;
    @JsonProperty("weekly")
    private Weekly weekly;
    @JsonProperty("engagement")
    private Object engagement;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @JsonProperty("maxLevel")
    public Integer getMaxLevel() {
        return maxLevel;
    }

    @JsonProperty("maxLevel")
    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    @JsonProperty("levelXpRemainder")
    public Integer getLevelXpRemainder() {
        return levelXpRemainder;
    }

    @JsonProperty("levelXpRemainder")
    public void setLevelXpRemainder(Integer levelXpRemainder) {
        this.levelXpRemainder = levelXpRemainder;
    }

    @JsonProperty("levelXpGained")
    public Integer getLevelXpGained() {
        return levelXpGained;
    }

    @JsonProperty("levelXpGained")
    public void setLevelXpGained(Integer levelXpGained) {
        this.levelXpGained = levelXpGained;
    }

    @JsonProperty("prestige")
    public Integer getPrestige() {
        return prestige;
    }

    @JsonProperty("prestige")
    public void setPrestige(Integer prestige) {
        this.prestige = prestige;
    }

    @JsonProperty("prestigeId")
    public Integer getPrestigeId() {
        return prestigeId;
    }

    @JsonProperty("prestigeId")
    public void setPrestigeId(Integer prestigeId) {
        this.prestigeId = prestigeId;
    }

    @JsonProperty("maxPrestige")
    public Integer getMaxPrestige() {
        return maxPrestige;
    }

    @JsonProperty("maxPrestige")
    public void setMaxPrestige(Integer maxPrestige) {
        this.maxPrestige = maxPrestige;
    }

    @JsonProperty("totalXp")
    public Integer getTotalXp() {
        return totalXp;
    }

    @JsonProperty("totalXp")
    public void setTotalXp(Integer totalXp) {
        this.totalXp = totalXp;
    }

    @JsonProperty("paragonRank")
    public Integer getParagonRank() {
        return paragonRank;
    }

    @JsonProperty("paragonRank")
    public void setParagonRank(Integer paragonRank) {
        this.paragonRank = paragonRank;
    }

    @JsonProperty("paragonId")
    public Integer getParagonId() {
        return paragonId;
    }

    @JsonProperty("paragonId")
    public void setParagonId(Integer paragonId) {
        this.paragonId = paragonId;
    }

    @JsonProperty("s")
    public Integer getS() {
        return s;
    }

    @JsonProperty("s")
    public void setS(Integer s) {
        this.s = s;
    }

    @JsonProperty("p")
    public Integer getP() {
        return p;
    }

    @JsonProperty("p")
    public void setP(Integer p) {
        this.p = p;
    }

    @JsonProperty("lifetime")
    public Lifetime getLifetime() {
        return lifetime;
    }

    @JsonProperty("lifetime")
    public void setLifetime(Lifetime lifetime) {
        this.lifetime = lifetime;
    }

    @JsonProperty("weekly")
    public Weekly getWeekly() {
        return weekly;
    }

    @JsonProperty("weekly")
    public void setWeekly(Weekly weekly) {
        this.weekly = weekly;
    }

    @JsonProperty("engagement")
    public Object getEngagement() {
        return engagement;
    }

    @JsonProperty("engagement")
    public void setEngagement(Object engagement) {
        this.engagement = engagement;
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
