
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
        "precision_airstrike",
        "cruise_predator",
        "manual_turret",
        "white_phosphorus",
        "hover_jet",
        "chopper_gunner",
        "gunship",
        "sentry_gun",
        "toma_strike",
        "nuke",
        "juggernaut",
        "pac_sentry",
        "chopper_support",
        "bradley"
})
@Generated("jsonschema2pojo")
public class LethalScorestreakData {

    @JsonProperty("precision_airstrike")
    private PrecisionAirstrike precisionAirstrike;
    @JsonProperty("cruise_predator")
    private CruisePredator cruisePredator;
    @JsonProperty("manual_turret")
    private ManualTurret manualTurret;
    @JsonProperty("white_phosphorus")
    private WhitePhosphorus whitePhosphorus;
    @JsonProperty("hover_jet")
    private HoverJet hoverJet;
    @JsonProperty("chopper_gunner")
    private ChopperGunner chopperGunner;
    @JsonProperty("gunship")
    private Gunship gunship;
    @JsonProperty("sentry_gun")
    private SentryGun sentryGun;
    @JsonProperty("toma_strike")
    private TomaStrike tomaStrike;
    @JsonProperty("nuke")
    private Nuke nuke;
    @JsonProperty("juggernaut")
    private Juggernaut juggernaut;
    @JsonProperty("pac_sentry")
    private PacSentry pacSentry;
    @JsonProperty("chopper_support")
    private ChopperSupport chopperSupport;
    @JsonProperty("bradley")
    private Bradley bradley;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("precision_airstrike")
    public PrecisionAirstrike getPrecisionAirstrike() {
        return precisionAirstrike;
    }

    @JsonProperty("precision_airstrike")
    public void setPrecisionAirstrike(PrecisionAirstrike precisionAirstrike) {
        this.precisionAirstrike = precisionAirstrike;
    }

    @JsonProperty("cruise_predator")
    public CruisePredator getCruisePredator() {
        return cruisePredator;
    }

    @JsonProperty("cruise_predator")
    public void setCruisePredator(CruisePredator cruisePredator) {
        this.cruisePredator = cruisePredator;
    }

    @JsonProperty("manual_turret")
    public ManualTurret getManualTurret() {
        return manualTurret;
    }

    @JsonProperty("manual_turret")
    public void setManualTurret(ManualTurret manualTurret) {
        this.manualTurret = manualTurret;
    }

    @JsonProperty("white_phosphorus")
    public WhitePhosphorus getWhitePhosphorus() {
        return whitePhosphorus;
    }

    @JsonProperty("white_phosphorus")
    public void setWhitePhosphorus(WhitePhosphorus whitePhosphorus) {
        this.whitePhosphorus = whitePhosphorus;
    }

    @JsonProperty("hover_jet")
    public HoverJet getHoverJet() {
        return hoverJet;
    }

    @JsonProperty("hover_jet")
    public void setHoverJet(HoverJet hoverJet) {
        this.hoverJet = hoverJet;
    }

    @JsonProperty("chopper_gunner")
    public ChopperGunner getChopperGunner() {
        return chopperGunner;
    }

    @JsonProperty("chopper_gunner")
    public void setChopperGunner(ChopperGunner chopperGunner) {
        this.chopperGunner = chopperGunner;
    }

    @JsonProperty("gunship")
    public Gunship getGunship() {
        return gunship;
    }

    @JsonProperty("gunship")
    public void setGunship(Gunship gunship) {
        this.gunship = gunship;
    }

    @JsonProperty("sentry_gun")
    public SentryGun getSentryGun() {
        return sentryGun;
    }

    @JsonProperty("sentry_gun")
    public void setSentryGun(SentryGun sentryGun) {
        this.sentryGun = sentryGun;
    }

    @JsonProperty("toma_strike")
    public TomaStrike getTomaStrike() {
        return tomaStrike;
    }

    @JsonProperty("toma_strike")
    public void setTomaStrike(TomaStrike tomaStrike) {
        this.tomaStrike = tomaStrike;
    }

    @JsonProperty("nuke")
    public Nuke getNuke() {
        return nuke;
    }

    @JsonProperty("nuke")
    public void setNuke(Nuke nuke) {
        this.nuke = nuke;
    }

    @JsonProperty("juggernaut")
    public Juggernaut getJuggernaut() {
        return juggernaut;
    }

    @JsonProperty("juggernaut")
    public void setJuggernaut(Juggernaut juggernaut) {
        this.juggernaut = juggernaut;
    }

    @JsonProperty("pac_sentry")
    public PacSentry getPacSentry() {
        return pacSentry;
    }

    @JsonProperty("pac_sentry")
    public void setPacSentry(PacSentry pacSentry) {
        this.pacSentry = pacSentry;
    }

    @JsonProperty("chopper_support")
    public ChopperSupport getChopperSupport() {
        return chopperSupport;
    }

    @JsonProperty("chopper_support")
    public void setChopperSupport(ChopperSupport chopperSupport) {
        this.chopperSupport = chopperSupport;
    }

    @JsonProperty("bradley")
    public Bradley getBradley() {
        return bradley;
    }

    @JsonProperty("bradley")
    public void setBradley(Bradley bradley) {
        this.bradley = bradley;
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
