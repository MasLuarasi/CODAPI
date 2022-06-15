
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
    "weekly"
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Example() {
    }

    /**
     * 
     * @param maxLevel
     * @param level
     * @param lifetime
     * @param levelXpRemainder
     * @param levelXpGained
     * @param title
     * @param type
     * @param prestige
     * @param platform
     * @param weekly
     * @param paragonId
     * @param p
     * @param totalXp
     * @param s
     * @param prestigeId
     * @param maxPrestige
     * @param paragonRank
     * @param username
     */
    public Example(String title, String platform, String username, String type, Integer level, Integer maxLevel, Integer levelXpRemainder, Integer levelXpGained, Integer prestige, Integer prestigeId, Integer maxPrestige, Integer totalXp, Integer paragonRank, Integer paragonId, Integer s, Integer p, Lifetime lifetime, Weekly weekly) {
        super();
        this.title = title;
        this.platform = platform;
        this.username = username;
        this.type = type;
        this.level = level;
        this.maxLevel = maxLevel;
        this.levelXpRemainder = levelXpRemainder;
        this.levelXpGained = levelXpGained;
        this.prestige = prestige;
        this.prestigeId = prestigeId;
        this.maxPrestige = maxPrestige;
        this.totalXp = totalXp;
        this.paragonRank = paragonRank;
        this.paragonId = paragonId;
        this.s = s;
        this.p = p;
        this.lifetime = lifetime;
        this.weekly = weekly;
    }

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
        sb.append(Example.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("platform");
        sb.append('=');
        sb.append(((this.platform == null)?"<null>":this.platform));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("maxLevel");
        sb.append('=');
        sb.append(((this.maxLevel == null)?"<null>":this.maxLevel));
        sb.append(',');
        sb.append("levelXpRemainder");
        sb.append('=');
        sb.append(((this.levelXpRemainder == null)?"<null>":this.levelXpRemainder));
        sb.append(',');
        sb.append("levelXpGained");
        sb.append('=');
        sb.append(((this.levelXpGained == null)?"<null>":this.levelXpGained));
        sb.append(',');
        sb.append("prestige");
        sb.append('=');
        sb.append(((this.prestige == null)?"<null>":this.prestige));
        sb.append(',');
        sb.append("prestigeId");
        sb.append('=');
        sb.append(((this.prestigeId == null)?"<null>":this.prestigeId));
        sb.append(',');
        sb.append("maxPrestige");
        sb.append('=');
        sb.append(((this.maxPrestige == null)?"<null>":this.maxPrestige));
        sb.append(',');
        sb.append("totalXp");
        sb.append('=');
        sb.append(((this.totalXp == null)?"<null>":this.totalXp));
        sb.append(',');
        sb.append("paragonRank");
        sb.append('=');
        sb.append(((this.paragonRank == null)?"<null>":this.paragonRank));
        sb.append(',');
        sb.append("paragonId");
        sb.append('=');
        sb.append(((this.paragonId == null)?"<null>":this.paragonId));
        sb.append(',');
        sb.append("s");
        sb.append('=');
        sb.append(((this.s == null)?"<null>":this.s));
        sb.append(',');
        sb.append("p");
        sb.append('=');
        sb.append(((this.p == null)?"<null>":this.p));
        sb.append(',');
        sb.append("lifetime");
        sb.append('=');
        sb.append(((this.lifetime == null)?"<null>":this.lifetime));
        sb.append(',');
        sb.append("weekly");
        sb.append('=');
        sb.append(((this.weekly == null)?"<null>":this.weekly));
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
