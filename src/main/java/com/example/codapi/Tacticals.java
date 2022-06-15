
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
    "equip_gas_grenade",
    "equip_snapshot_grenade",
    "equip_decoy",
    "equip_smoke",
    "equip_concussion",
    "equip_hb_sensor",
    "equip_flash",
    "equip_adrenaline"
})
@Generated("jsonschema2pojo")
public class Tacticals {

    @JsonProperty("equip_gas_grenade")
    private EquipGasGrenade equipGasGrenade;
    @JsonProperty("equip_snapshot_grenade")
    private EquipSnapshotGrenade equipSnapshotGrenade;
    @JsonProperty("equip_decoy")
    private EquipDecoy equipDecoy;
    @JsonProperty("equip_smoke")
    private EquipSmoke equipSmoke;
    @JsonProperty("equip_concussion")
    private EquipConcussion equipConcussion;
    @JsonProperty("equip_hb_sensor")
    private EquipHbSensor equipHbSensor;
    @JsonProperty("equip_flash")
    private EquipFlash equipFlash;
    @JsonProperty("equip_adrenaline")
    private EquipAdrenaline equipAdrenaline;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tacticals() {
    }

    /**
     * 
     * @param equipConcussion
     * @param equipFlash
     * @param equipAdrenaline
     * @param equipSmoke
     * @param equipGasGrenade
     * @param equipSnapshotGrenade
     * @param equipHbSensor
     * @param equipDecoy
     */
    public Tacticals(EquipGasGrenade equipGasGrenade, EquipSnapshotGrenade equipSnapshotGrenade, EquipDecoy equipDecoy, EquipSmoke equipSmoke, EquipConcussion equipConcussion, EquipHbSensor equipHbSensor, EquipFlash equipFlash, EquipAdrenaline equipAdrenaline) {
        super();
        this.equipGasGrenade = equipGasGrenade;
        this.equipSnapshotGrenade = equipSnapshotGrenade;
        this.equipDecoy = equipDecoy;
        this.equipSmoke = equipSmoke;
        this.equipConcussion = equipConcussion;
        this.equipHbSensor = equipHbSensor;
        this.equipFlash = equipFlash;
        this.equipAdrenaline = equipAdrenaline;
    }

    @JsonProperty("equip_gas_grenade")
    public EquipGasGrenade getEquipGasGrenade() {
        return equipGasGrenade;
    }

    @JsonProperty("equip_gas_grenade")
    public void setEquipGasGrenade(EquipGasGrenade equipGasGrenade) {
        this.equipGasGrenade = equipGasGrenade;
    }

    @JsonProperty("equip_snapshot_grenade")
    public EquipSnapshotGrenade getEquipSnapshotGrenade() {
        return equipSnapshotGrenade;
    }

    @JsonProperty("equip_snapshot_grenade")
    public void setEquipSnapshotGrenade(EquipSnapshotGrenade equipSnapshotGrenade) {
        this.equipSnapshotGrenade = equipSnapshotGrenade;
    }

    @JsonProperty("equip_decoy")
    public EquipDecoy getEquipDecoy() {
        return equipDecoy;
    }

    @JsonProperty("equip_decoy")
    public void setEquipDecoy(EquipDecoy equipDecoy) {
        this.equipDecoy = equipDecoy;
    }

    @JsonProperty("equip_smoke")
    public EquipSmoke getEquipSmoke() {
        return equipSmoke;
    }

    @JsonProperty("equip_smoke")
    public void setEquipSmoke(EquipSmoke equipSmoke) {
        this.equipSmoke = equipSmoke;
    }

    @JsonProperty("equip_concussion")
    public EquipConcussion getEquipConcussion() {
        return equipConcussion;
    }

    @JsonProperty("equip_concussion")
    public void setEquipConcussion(EquipConcussion equipConcussion) {
        this.equipConcussion = equipConcussion;
    }

    @JsonProperty("equip_hb_sensor")
    public EquipHbSensor getEquipHbSensor() {
        return equipHbSensor;
    }

    @JsonProperty("equip_hb_sensor")
    public void setEquipHbSensor(EquipHbSensor equipHbSensor) {
        this.equipHbSensor = equipHbSensor;
    }

    @JsonProperty("equip_flash")
    public EquipFlash getEquipFlash() {
        return equipFlash;
    }

    @JsonProperty("equip_flash")
    public void setEquipFlash(EquipFlash equipFlash) {
        this.equipFlash = equipFlash;
    }

    @JsonProperty("equip_adrenaline")
    public EquipAdrenaline getEquipAdrenaline() {
        return equipAdrenaline;
    }

    @JsonProperty("equip_adrenaline")
    public void setEquipAdrenaline(EquipAdrenaline equipAdrenaline) {
        this.equipAdrenaline = equipAdrenaline;
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
        sb.append(Tacticals.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("equipGasGrenade");
        sb.append('=');
        sb.append(((this.equipGasGrenade == null)?"<null>":this.equipGasGrenade));
        sb.append(',');
        sb.append("equipSnapshotGrenade");
        sb.append('=');
        sb.append(((this.equipSnapshotGrenade == null)?"<null>":this.equipSnapshotGrenade));
        sb.append(',');
        sb.append("equipDecoy");
        sb.append('=');
        sb.append(((this.equipDecoy == null)?"<null>":this.equipDecoy));
        sb.append(',');
        sb.append("equipSmoke");
        sb.append('=');
        sb.append(((this.equipSmoke == null)?"<null>":this.equipSmoke));
        sb.append(',');
        sb.append("equipConcussion");
        sb.append('=');
        sb.append(((this.equipConcussion == null)?"<null>":this.equipConcussion));
        sb.append(',');
        sb.append("equipHbSensor");
        sb.append('=');
        sb.append(((this.equipHbSensor == null)?"<null>":this.equipHbSensor));
        sb.append(',');
        sb.append("equipFlash");
        sb.append('=');
        sb.append(((this.equipFlash == null)?"<null>":this.equipFlash));
        sb.append(',');
        sb.append("equipAdrenaline");
        sb.append('=');
        sb.append(((this.equipAdrenaline == null)?"<null>":this.equipAdrenaline));
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
