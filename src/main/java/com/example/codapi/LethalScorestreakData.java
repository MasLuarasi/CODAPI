
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

    /**
     * No args constructor for use in serialization
     * 
     */
    public LethalScorestreakData() {
    }

    /**
     * 
     * @param precisionAirstrike
     * @param pacSentry
     * @param manualTurret
     * @param chopperGunner
     * @param cruisePredator
     * @param tomaStrike
     * @param hoverJet
     * @param gunship
     * @param nuke
     * @param sentryGun
     * @param whitePhosphorus
     * @param juggernaut
     * @param bradley
     * @param chopperSupport
     */
    public LethalScorestreakData(PrecisionAirstrike precisionAirstrike, CruisePredator cruisePredator, ManualTurret manualTurret, WhitePhosphorus whitePhosphorus, HoverJet hoverJet, ChopperGunner chopperGunner, Gunship gunship, SentryGun sentryGun, TomaStrike tomaStrike, Nuke nuke, Juggernaut juggernaut, PacSentry pacSentry, ChopperSupport chopperSupport, Bradley bradley) {
        super();
        this.precisionAirstrike = precisionAirstrike;
        this.cruisePredator = cruisePredator;
        this.manualTurret = manualTurret;
        this.whitePhosphorus = whitePhosphorus;
        this.hoverJet = hoverJet;
        this.chopperGunner = chopperGunner;
        this.gunship = gunship;
        this.sentryGun = sentryGun;
        this.tomaStrike = tomaStrike;
        this.nuke = nuke;
        this.juggernaut = juggernaut;
        this.pacSentry = pacSentry;
        this.chopperSupport = chopperSupport;
        this.bradley = bradley;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LethalScorestreakData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("precisionAirstrike");
        sb.append('=');
        sb.append(((this.precisionAirstrike == null)?"<null>":this.precisionAirstrike));
        sb.append(',');
        sb.append("cruisePredator");
        sb.append('=');
        sb.append(((this.cruisePredator == null)?"<null>":this.cruisePredator));
        sb.append(',');
        sb.append("manualTurret");
        sb.append('=');
        sb.append(((this.manualTurret == null)?"<null>":this.manualTurret));
        sb.append(',');
        sb.append("whitePhosphorus");
        sb.append('=');
        sb.append(((this.whitePhosphorus == null)?"<null>":this.whitePhosphorus));
        sb.append(',');
        sb.append("hoverJet");
        sb.append('=');
        sb.append(((this.hoverJet == null)?"<null>":this.hoverJet));
        sb.append(',');
        sb.append("chopperGunner");
        sb.append('=');
        sb.append(((this.chopperGunner == null)?"<null>":this.chopperGunner));
        sb.append(',');
        sb.append("gunship");
        sb.append('=');
        sb.append(((this.gunship == null)?"<null>":this.gunship));
        sb.append(',');
        sb.append("sentryGun");
        sb.append('=');
        sb.append(((this.sentryGun == null)?"<null>":this.sentryGun));
        sb.append(',');
        sb.append("tomaStrike");
        sb.append('=');
        sb.append(((this.tomaStrike == null)?"<null>":this.tomaStrike));
        sb.append(',');
        sb.append("nuke");
        sb.append('=');
        sb.append(((this.nuke == null)?"<null>":this.nuke));
        sb.append(',');
        sb.append("juggernaut");
        sb.append('=');
        sb.append(((this.juggernaut == null)?"<null>":this.juggernaut));
        sb.append(',');
        sb.append("pacSentry");
        sb.append('=');
        sb.append(((this.pacSentry == null)?"<null>":this.pacSentry));
        sb.append(',');
        sb.append("chopperSupport");
        sb.append('=');
        sb.append(((this.chopperSupport == null)?"<null>":this.chopperSupport));
        sb.append(',');
        sb.append("bradley");
        sb.append('=');
        sb.append(((this.bradley == null)?"<null>":this.bradley));
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
