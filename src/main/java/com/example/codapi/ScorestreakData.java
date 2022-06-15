
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
    "lethalScorestreakData",
    "supportScorestreakData"
})
@Generated("jsonschema2pojo")
public class ScorestreakData {

    @JsonProperty("lethalScorestreakData")
    private LethalScorestreakData lethalScorestreakData;
    @JsonProperty("supportScorestreakData")
    private SupportScorestreakData supportScorestreakData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ScorestreakData() {
    }

    /**
     * 
     * @param lethalScorestreakData
     * @param supportScorestreakData
     */
    public ScorestreakData(LethalScorestreakData lethalScorestreakData, SupportScorestreakData supportScorestreakData) {
        super();
        this.lethalScorestreakData = lethalScorestreakData;
        this.supportScorestreakData = supportScorestreakData;
    }

    @JsonProperty("lethalScorestreakData")
    public LethalScorestreakData getLethalScorestreakData() {
        return lethalScorestreakData;
    }

    @JsonProperty("lethalScorestreakData")
    public void setLethalScorestreakData(LethalScorestreakData lethalScorestreakData) {
        this.lethalScorestreakData = lethalScorestreakData;
    }

    @JsonProperty("supportScorestreakData")
    public SupportScorestreakData getSupportScorestreakData() {
        return supportScorestreakData;
    }

    @JsonProperty("supportScorestreakData")
    public void setSupportScorestreakData(SupportScorestreakData supportScorestreakData) {
        this.supportScorestreakData = supportScorestreakData;
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
        sb.append(ScorestreakData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lethalScorestreakData");
        sb.append('=');
        sb.append(((this.lethalScorestreakData == null)?"<null>":this.lethalScorestreakData));
        sb.append(',');
        sb.append("supportScorestreakData");
        sb.append('=');
        sb.append(((this.supportScorestreakData == null)?"<null>":this.supportScorestreakData));
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
