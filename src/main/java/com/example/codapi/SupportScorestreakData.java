
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
    "airdrop",
    "radar_drone_overwatch",
    "scrambler_drone_guard",
    "uav",
    "airdrop_multiple",
    "directional_uav"
})
@Generated("jsonschema2pojo")
public class SupportScorestreakData {

    @JsonProperty("airdrop")
    private Airdrop airdrop;
    @JsonProperty("radar_drone_overwatch")
    private RadarDroneOverwatch radarDroneOverwatch;
    @JsonProperty("scrambler_drone_guard")
    private ScramblerDroneGuard scramblerDroneGuard;
    @JsonProperty("uav")
    private Uav uav;
    @JsonProperty("airdrop_multiple")
    private AirdropMultiple airdropMultiple;
    @JsonProperty("directional_uav")
    private DirectionalUav directionalUav;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SupportScorestreakData() {
    }

    /**
     * 
     * @param airdropMultiple
     * @param airdrop
     * @param scramblerDroneGuard
     * @param uav
     * @param radarDroneOverwatch
     * @param directionalUav
     */
    public SupportScorestreakData(Airdrop airdrop, RadarDroneOverwatch radarDroneOverwatch, ScramblerDroneGuard scramblerDroneGuard, Uav uav, AirdropMultiple airdropMultiple, DirectionalUav directionalUav) {
        super();
        this.airdrop = airdrop;
        this.radarDroneOverwatch = radarDroneOverwatch;
        this.scramblerDroneGuard = scramblerDroneGuard;
        this.uav = uav;
        this.airdropMultiple = airdropMultiple;
        this.directionalUav = directionalUav;
    }

    @JsonProperty("airdrop")
    public Airdrop getAirdrop() {
        return airdrop;
    }

    @JsonProperty("airdrop")
    public void setAirdrop(Airdrop airdrop) {
        this.airdrop = airdrop;
    }

    @JsonProperty("radar_drone_overwatch")
    public RadarDroneOverwatch getRadarDroneOverwatch() {
        return radarDroneOverwatch;
    }

    @JsonProperty("radar_drone_overwatch")
    public void setRadarDroneOverwatch(RadarDroneOverwatch radarDroneOverwatch) {
        this.radarDroneOverwatch = radarDroneOverwatch;
    }

    @JsonProperty("scrambler_drone_guard")
    public ScramblerDroneGuard getScramblerDroneGuard() {
        return scramblerDroneGuard;
    }

    @JsonProperty("scrambler_drone_guard")
    public void setScramblerDroneGuard(ScramblerDroneGuard scramblerDroneGuard) {
        this.scramblerDroneGuard = scramblerDroneGuard;
    }

    @JsonProperty("uav")
    public Uav getUav() {
        return uav;
    }

    @JsonProperty("uav")
    public void setUav(Uav uav) {
        this.uav = uav;
    }

    @JsonProperty("airdrop_multiple")
    public AirdropMultiple getAirdropMultiple() {
        return airdropMultiple;
    }

    @JsonProperty("airdrop_multiple")
    public void setAirdropMultiple(AirdropMultiple airdropMultiple) {
        this.airdropMultiple = airdropMultiple;
    }

    @JsonProperty("directional_uav")
    public DirectionalUav getDirectionalUav() {
        return directionalUav;
    }

    @JsonProperty("directional_uav")
    public void setDirectionalUav(DirectionalUav directionalUav) {
        this.directionalUav = directionalUav;
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
        sb.append(SupportScorestreakData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("airdrop");
        sb.append('=');
        sb.append(((this.airdrop == null)?"<null>":this.airdrop));
        sb.append(',');
        sb.append("radarDroneOverwatch");
        sb.append('=');
        sb.append(((this.radarDroneOverwatch == null)?"<null>":this.radarDroneOverwatch));
        sb.append(',');
        sb.append("scramblerDroneGuard");
        sb.append('=');
        sb.append(((this.scramblerDroneGuard == null)?"<null>":this.scramblerDroneGuard));
        sb.append(',');
        sb.append("uav");
        sb.append('=');
        sb.append(((this.uav == null)?"<null>":this.uav));
        sb.append(',');
        sb.append("airdropMultiple");
        sb.append('=');
        sb.append(((this.airdropMultiple == null)?"<null>":this.airdropMultiple));
        sb.append(',');
        sb.append("directionalUav");
        sb.append('=');
        sb.append(((this.directionalUav == null)?"<null>":this.directionalUav));
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
