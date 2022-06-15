
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
    "equip_frag",
    "equip_thermite",
    "equip_semtex",
    "equip_claymore",
    "equip_c4",
    "equip_at_mine",
    "equip_throwing_knife",
    "equip_molotov"
})
@Generated("jsonschema2pojo")
public class Lethals {

    @JsonProperty("equip_frag")
    private EquipFrag equipFrag;
    @JsonProperty("equip_thermite")
    private EquipThermite equipThermite;
    @JsonProperty("equip_semtex")
    private EquipSemtex equipSemtex;
    @JsonProperty("equip_claymore")
    private EquipClaymore equipClaymore;
    @JsonProperty("equip_c4")
    private EquipC4 equipC4;
    @JsonProperty("equip_at_mine")
    private EquipAtMine equipAtMine;
    @JsonProperty("equip_throwing_knife")
    private EquipThrowingKnife equipThrowingKnife;
    @JsonProperty("equip_molotov")
    private EquipMolotov equipMolotov;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Lethals() {
    }

    /**
     * 
     * @param equipThermite
     * @param equipFrag
     * @param equipClaymore
     * @param equipAtMine
     * @param equipMolotov
     * @param equipSemtex
     * @param equipC4
     * @param equipThrowingKnife
     */
    public Lethals(EquipFrag equipFrag, EquipThermite equipThermite, EquipSemtex equipSemtex, EquipClaymore equipClaymore, EquipC4 equipC4, EquipAtMine equipAtMine, EquipThrowingKnife equipThrowingKnife, EquipMolotov equipMolotov) {
        super();
        this.equipFrag = equipFrag;
        this.equipThermite = equipThermite;
        this.equipSemtex = equipSemtex;
        this.equipClaymore = equipClaymore;
        this.equipC4 = equipC4;
        this.equipAtMine = equipAtMine;
        this.equipThrowingKnife = equipThrowingKnife;
        this.equipMolotov = equipMolotov;
    }

    @JsonProperty("equip_frag")
    public EquipFrag getEquipFrag() {
        return equipFrag;
    }

    @JsonProperty("equip_frag")
    public void setEquipFrag(EquipFrag equipFrag) {
        this.equipFrag = equipFrag;
    }

    @JsonProperty("equip_thermite")
    public EquipThermite getEquipThermite() {
        return equipThermite;
    }

    @JsonProperty("equip_thermite")
    public void setEquipThermite(EquipThermite equipThermite) {
        this.equipThermite = equipThermite;
    }

    @JsonProperty("equip_semtex")
    public EquipSemtex getEquipSemtex() {
        return equipSemtex;
    }

    @JsonProperty("equip_semtex")
    public void setEquipSemtex(EquipSemtex equipSemtex) {
        this.equipSemtex = equipSemtex;
    }

    @JsonProperty("equip_claymore")
    public EquipClaymore getEquipClaymore() {
        return equipClaymore;
    }

    @JsonProperty("equip_claymore")
    public void setEquipClaymore(EquipClaymore equipClaymore) {
        this.equipClaymore = equipClaymore;
    }

    @JsonProperty("equip_c4")
    public EquipC4 getEquipC4() {
        return equipC4;
    }

    @JsonProperty("equip_c4")
    public void setEquipC4(EquipC4 equipC4) {
        this.equipC4 = equipC4;
    }

    @JsonProperty("equip_at_mine")
    public EquipAtMine getEquipAtMine() {
        return equipAtMine;
    }

    @JsonProperty("equip_at_mine")
    public void setEquipAtMine(EquipAtMine equipAtMine) {
        this.equipAtMine = equipAtMine;
    }

    @JsonProperty("equip_throwing_knife")
    public EquipThrowingKnife getEquipThrowingKnife() {
        return equipThrowingKnife;
    }

    @JsonProperty("equip_throwing_knife")
    public void setEquipThrowingKnife(EquipThrowingKnife equipThrowingKnife) {
        this.equipThrowingKnife = equipThrowingKnife;
    }

    @JsonProperty("equip_molotov")
    public EquipMolotov getEquipMolotov() {
        return equipMolotov;
    }

    @JsonProperty("equip_molotov")
    public void setEquipMolotov(EquipMolotov equipMolotov) {
        this.equipMolotov = equipMolotov;
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
        sb.append(Lethals.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("equipFrag");
        sb.append('=');
        sb.append(((this.equipFrag == null)?"<null>":this.equipFrag));
        sb.append(',');
        sb.append("equipThermite");
        sb.append('=');
        sb.append(((this.equipThermite == null)?"<null>":this.equipThermite));
        sb.append(',');
        sb.append("equipSemtex");
        sb.append('=');
        sb.append(((this.equipSemtex == null)?"<null>":this.equipSemtex));
        sb.append(',');
        sb.append("equipClaymore");
        sb.append('=');
        sb.append(((this.equipClaymore == null)?"<null>":this.equipClaymore));
        sb.append(',');
        sb.append("equipC4");
        sb.append('=');
        sb.append(((this.equipC4 == null)?"<null>":this.equipC4));
        sb.append(',');
        sb.append("equipAtMine");
        sb.append('=');
        sb.append(((this.equipAtMine == null)?"<null>":this.equipAtMine));
        sb.append(',');
        sb.append("equipThrowingKnife");
        sb.append('=');
        sb.append(((this.equipThrowingKnife == null)?"<null>":this.equipThrowingKnife));
        sb.append(',');
        sb.append("equipMolotov");
        sb.append('=');
        sb.append(((this.equipMolotov == null)?"<null>":this.equipMolotov));
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
