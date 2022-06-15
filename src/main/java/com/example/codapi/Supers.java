
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
    "super_emp_drone",
    "super_trophy",
    "super_ammo_drop",
    "super_weapon_drop",
    "super_fulton",
    "super_armor_drop",
    "super_select",
    "super_tac_insert",
    "super_recon_drone",
    "super_deadsilence",
    "super_supply_drop",
    "super_tac_cover",
    "super_support_box"
})
@Generated("jsonschema2pojo")
public class Supers {

    @JsonProperty("super_emp_drone")
    private SuperEmpDrone superEmpDrone;
    @JsonProperty("super_trophy")
    private SuperTrophy superTrophy;
    @JsonProperty("super_ammo_drop")
    private SuperAmmoDrop superAmmoDrop;
    @JsonProperty("super_weapon_drop")
    private SuperWeaponDrop superWeaponDrop;
    @JsonProperty("super_fulton")
    private SuperFulton superFulton;
    @JsonProperty("super_armor_drop")
    private SuperArmorDrop superArmorDrop;
    @JsonProperty("super_select")
    private SuperSelect superSelect;
    @JsonProperty("super_tac_insert")
    private SuperTacInsert superTacInsert;
    @JsonProperty("super_recon_drone")
    private SuperReconDrone superReconDrone;
    @JsonProperty("super_deadsilence")
    private SuperDeadsilence superDeadsilence;
    @JsonProperty("super_supply_drop")
    private SuperSupplyDrop superSupplyDrop;
    @JsonProperty("super_tac_cover")
    private SuperTacCover superTacCover;
    @JsonProperty("super_support_box")
    private SuperSupportBox superSupportBox;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Supers() {
    }

    /**
     * 
     * @param superFulton
     * @param superReconDrone
     * @param superAmmoDrop
     * @param superTrophy
     * @param superSelect
     * @param superWeaponDrop
     * @param superSupplyDrop
     * @param superEmpDrone
     * @param superDeadsilence
     * @param superArmorDrop
     * @param superTacInsert
     * @param superTacCover
     * @param superSupportBox
     */
    public Supers(SuperEmpDrone superEmpDrone, SuperTrophy superTrophy, SuperAmmoDrop superAmmoDrop, SuperWeaponDrop superWeaponDrop, SuperFulton superFulton, SuperArmorDrop superArmorDrop, SuperSelect superSelect, SuperTacInsert superTacInsert, SuperReconDrone superReconDrone, SuperDeadsilence superDeadsilence, SuperSupplyDrop superSupplyDrop, SuperTacCover superTacCover, SuperSupportBox superSupportBox) {
        super();
        this.superEmpDrone = superEmpDrone;
        this.superTrophy = superTrophy;
        this.superAmmoDrop = superAmmoDrop;
        this.superWeaponDrop = superWeaponDrop;
        this.superFulton = superFulton;
        this.superArmorDrop = superArmorDrop;
        this.superSelect = superSelect;
        this.superTacInsert = superTacInsert;
        this.superReconDrone = superReconDrone;
        this.superDeadsilence = superDeadsilence;
        this.superSupplyDrop = superSupplyDrop;
        this.superTacCover = superTacCover;
        this.superSupportBox = superSupportBox;
    }

    @JsonProperty("super_emp_drone")
    public SuperEmpDrone getSuperEmpDrone() {
        return superEmpDrone;
    }

    @JsonProperty("super_emp_drone")
    public void setSuperEmpDrone(SuperEmpDrone superEmpDrone) {
        this.superEmpDrone = superEmpDrone;
    }

    @JsonProperty("super_trophy")
    public SuperTrophy getSuperTrophy() {
        return superTrophy;
    }

    @JsonProperty("super_trophy")
    public void setSuperTrophy(SuperTrophy superTrophy) {
        this.superTrophy = superTrophy;
    }

    @JsonProperty("super_ammo_drop")
    public SuperAmmoDrop getSuperAmmoDrop() {
        return superAmmoDrop;
    }

    @JsonProperty("super_ammo_drop")
    public void setSuperAmmoDrop(SuperAmmoDrop superAmmoDrop) {
        this.superAmmoDrop = superAmmoDrop;
    }

    @JsonProperty("super_weapon_drop")
    public SuperWeaponDrop getSuperWeaponDrop() {
        return superWeaponDrop;
    }

    @JsonProperty("super_weapon_drop")
    public void setSuperWeaponDrop(SuperWeaponDrop superWeaponDrop) {
        this.superWeaponDrop = superWeaponDrop;
    }

    @JsonProperty("super_fulton")
    public SuperFulton getSuperFulton() {
        return superFulton;
    }

    @JsonProperty("super_fulton")
    public void setSuperFulton(SuperFulton superFulton) {
        this.superFulton = superFulton;
    }

    @JsonProperty("super_armor_drop")
    public SuperArmorDrop getSuperArmorDrop() {
        return superArmorDrop;
    }

    @JsonProperty("super_armor_drop")
    public void setSuperArmorDrop(SuperArmorDrop superArmorDrop) {
        this.superArmorDrop = superArmorDrop;
    }

    @JsonProperty("super_select")
    public SuperSelect getSuperSelect() {
        return superSelect;
    }

    @JsonProperty("super_select")
    public void setSuperSelect(SuperSelect superSelect) {
        this.superSelect = superSelect;
    }

    @JsonProperty("super_tac_insert")
    public SuperTacInsert getSuperTacInsert() {
        return superTacInsert;
    }

    @JsonProperty("super_tac_insert")
    public void setSuperTacInsert(SuperTacInsert superTacInsert) {
        this.superTacInsert = superTacInsert;
    }

    @JsonProperty("super_recon_drone")
    public SuperReconDrone getSuperReconDrone() {
        return superReconDrone;
    }

    @JsonProperty("super_recon_drone")
    public void setSuperReconDrone(SuperReconDrone superReconDrone) {
        this.superReconDrone = superReconDrone;
    }

    @JsonProperty("super_deadsilence")
    public SuperDeadsilence getSuperDeadsilence() {
        return superDeadsilence;
    }

    @JsonProperty("super_deadsilence")
    public void setSuperDeadsilence(SuperDeadsilence superDeadsilence) {
        this.superDeadsilence = superDeadsilence;
    }

    @JsonProperty("super_supply_drop")
    public SuperSupplyDrop getSuperSupplyDrop() {
        return superSupplyDrop;
    }

    @JsonProperty("super_supply_drop")
    public void setSuperSupplyDrop(SuperSupplyDrop superSupplyDrop) {
        this.superSupplyDrop = superSupplyDrop;
    }

    @JsonProperty("super_tac_cover")
    public SuperTacCover getSuperTacCover() {
        return superTacCover;
    }

    @JsonProperty("super_tac_cover")
    public void setSuperTacCover(SuperTacCover superTacCover) {
        this.superTacCover = superTacCover;
    }

    @JsonProperty("super_support_box")
    public SuperSupportBox getSuperSupportBox() {
        return superSupportBox;
    }

    @JsonProperty("super_support_box")
    public void setSuperSupportBox(SuperSupportBox superSupportBox) {
        this.superSupportBox = superSupportBox;
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
        sb.append(Supers.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("superEmpDrone");
        sb.append('=');
        sb.append(((this.superEmpDrone == null)?"<null>":this.superEmpDrone));
        sb.append(',');
        sb.append("superTrophy");
        sb.append('=');
        sb.append(((this.superTrophy == null)?"<null>":this.superTrophy));
        sb.append(',');
        sb.append("superAmmoDrop");
        sb.append('=');
        sb.append(((this.superAmmoDrop == null)?"<null>":this.superAmmoDrop));
        sb.append(',');
        sb.append("superWeaponDrop");
        sb.append('=');
        sb.append(((this.superWeaponDrop == null)?"<null>":this.superWeaponDrop));
        sb.append(',');
        sb.append("superFulton");
        sb.append('=');
        sb.append(((this.superFulton == null)?"<null>":this.superFulton));
        sb.append(',');
        sb.append("superArmorDrop");
        sb.append('=');
        sb.append(((this.superArmorDrop == null)?"<null>":this.superArmorDrop));
        sb.append(',');
        sb.append("superSelect");
        sb.append('=');
        sb.append(((this.superSelect == null)?"<null>":this.superSelect));
        sb.append(',');
        sb.append("superTacInsert");
        sb.append('=');
        sb.append(((this.superTacInsert == null)?"<null>":this.superTacInsert));
        sb.append(',');
        sb.append("superReconDrone");
        sb.append('=');
        sb.append(((this.superReconDrone == null)?"<null>":this.superReconDrone));
        sb.append(',');
        sb.append("superDeadsilence");
        sb.append('=');
        sb.append(((this.superDeadsilence == null)?"<null>":this.superDeadsilence));
        sb.append(',');
        sb.append("superSupplyDrop");
        sb.append('=');
        sb.append(((this.superSupplyDrop == null)?"<null>":this.superSupplyDrop));
        sb.append(',');
        sb.append("superTacCover");
        sb.append('=');
        sb.append(((this.superTacCover == null)?"<null>":this.superTacCover));
        sb.append(',');
        sb.append("superSupportBox");
        sb.append('=');
        sb.append(((this.superSupportBox == null)?"<null>":this.superSupportBox));
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
