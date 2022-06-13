
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
    "iw8_sm_mpapa7",
    "iw8_sm_augolf",
    "iw8_sm_papa90",
    "iw8_sm_charlie9",
    "iw8_sm_mpapa5",
    "iw8_sm_smgolf45",
    "iw8_sm_beta",
    "iw8_sm_victor",
    "iw8_sm_uzulu"
})
@Generated("jsonschema2pojo")
public class WeaponSmg {

    @JsonProperty("iw8_sm_mpapa7")
    private Iw8SmMpapa7 iw8SmMpapa7;
    @JsonProperty("iw8_sm_augolf")
    private Iw8SmAugolf iw8SmAugolf;
    @JsonProperty("iw8_sm_papa90")
    private Iw8SmPapa90 iw8SmPapa90;
    @JsonProperty("iw8_sm_charlie9")
    private Iw8SmCharlie9 iw8SmCharlie9;
    @JsonProperty("iw8_sm_mpapa5")
    private Iw8SmMpapa5 iw8SmMpapa5;
    @JsonProperty("iw8_sm_smgolf45")
    private Iw8SmSmgolf45 iw8SmSmgolf45;
    @JsonProperty("iw8_sm_beta")
    private Iw8SmBeta iw8SmBeta;
    @JsonProperty("iw8_sm_victor")
    private Iw8SmVictor iw8SmVictor;
    @JsonProperty("iw8_sm_uzulu")
    private Iw8SmUzulu iw8SmUzulu;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("iw8_sm_mpapa7")
    public Iw8SmMpapa7 getIw8SmMpapa7() {
        return iw8SmMpapa7;
    }

    @JsonProperty("iw8_sm_mpapa7")
    public void setIw8SmMpapa7(Iw8SmMpapa7 iw8SmMpapa7) {
        this.iw8SmMpapa7 = iw8SmMpapa7;
    }

    @JsonProperty("iw8_sm_augolf")
    public Iw8SmAugolf getIw8SmAugolf() {
        return iw8SmAugolf;
    }

    @JsonProperty("iw8_sm_augolf")
    public void setIw8SmAugolf(Iw8SmAugolf iw8SmAugolf) {
        this.iw8SmAugolf = iw8SmAugolf;
    }

    @JsonProperty("iw8_sm_papa90")
    public Iw8SmPapa90 getIw8SmPapa90() {
        return iw8SmPapa90;
    }

    @JsonProperty("iw8_sm_papa90")
    public void setIw8SmPapa90(Iw8SmPapa90 iw8SmPapa90) {
        this.iw8SmPapa90 = iw8SmPapa90;
    }

    @JsonProperty("iw8_sm_charlie9")
    public Iw8SmCharlie9 getIw8SmCharlie9() {
        return iw8SmCharlie9;
    }

    @JsonProperty("iw8_sm_charlie9")
    public void setIw8SmCharlie9(Iw8SmCharlie9 iw8SmCharlie9) {
        this.iw8SmCharlie9 = iw8SmCharlie9;
    }

    @JsonProperty("iw8_sm_mpapa5")
    public Iw8SmMpapa5 getIw8SmMpapa5() {
        return iw8SmMpapa5;
    }

    @JsonProperty("iw8_sm_mpapa5")
    public void setIw8SmMpapa5(Iw8SmMpapa5 iw8SmMpapa5) {
        this.iw8SmMpapa5 = iw8SmMpapa5;
    }

    @JsonProperty("iw8_sm_smgolf45")
    public Iw8SmSmgolf45 getIw8SmSmgolf45() {
        return iw8SmSmgolf45;
    }

    @JsonProperty("iw8_sm_smgolf45")
    public void setIw8SmSmgolf45(Iw8SmSmgolf45 iw8SmSmgolf45) {
        this.iw8SmSmgolf45 = iw8SmSmgolf45;
    }

    @JsonProperty("iw8_sm_beta")
    public Iw8SmBeta getIw8SmBeta() {
        return iw8SmBeta;
    }

    @JsonProperty("iw8_sm_beta")
    public void setIw8SmBeta(Iw8SmBeta iw8SmBeta) {
        this.iw8SmBeta = iw8SmBeta;
    }

    @JsonProperty("iw8_sm_victor")
    public Iw8SmVictor getIw8SmVictor() {
        return iw8SmVictor;
    }

    @JsonProperty("iw8_sm_victor")
    public void setIw8SmVictor(Iw8SmVictor iw8SmVictor) {
        this.iw8SmVictor = iw8SmVictor;
    }

    @JsonProperty("iw8_sm_uzulu")
    public Iw8SmUzulu getIw8SmUzulu() {
        return iw8SmUzulu;
    }

    @JsonProperty("iw8_sm_uzulu")
    public void setIw8SmUzulu(Iw8SmUzulu iw8SmUzulu) {
        this.iw8SmUzulu = iw8SmUzulu;
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
