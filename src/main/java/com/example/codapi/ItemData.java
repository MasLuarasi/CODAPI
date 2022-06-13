
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
    "weapon_assault_rifle",
    "weapon_shotgun",
    "weapon_marksman",
    "weapon_sniper",
    "tacticals",
    "lethals",
    "weapon_lmg",
    "weapon_launcher",
    "supers",
    "weapon_pistol",
    "weapon_other",
    "weapon_smg",
    "weapon_melee"
})
@Generated("jsonschema2pojo")
public class ItemData {

    @JsonProperty("weapon_assault_rifle")
    private WeaponAssaultRifle weaponAssaultRifle;
    @JsonProperty("weapon_shotgun")
    private WeaponShotgun weaponShotgun;
    @JsonProperty("weapon_marksman")
    private WeaponMarksman weaponMarksman;
    @JsonProperty("weapon_sniper")
    private WeaponSniper weaponSniper;
    @JsonProperty("tacticals")
    private Tacticals tacticals;
    @JsonProperty("lethals")
    private Lethals lethals;
    @JsonProperty("weapon_lmg")
    private WeaponLmg weaponLmg;
    @JsonProperty("weapon_launcher")
    private WeaponLauncher weaponLauncher;
    @JsonProperty("supers")
    private Supers supers;
    @JsonProperty("weapon_pistol")
    private WeaponPistol weaponPistol;
    @JsonProperty("weapon_other")
    private WeaponOther weaponOther;
    @JsonProperty("weapon_smg")
    private WeaponSmg weaponSmg;
    @JsonProperty("weapon_melee")
    private WeaponMelee weaponMelee;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("weapon_assault_rifle")
    public WeaponAssaultRifle getWeaponAssaultRifle() {
        return weaponAssaultRifle;
    }

    @JsonProperty("weapon_assault_rifle")
    public void setWeaponAssaultRifle(WeaponAssaultRifle weaponAssaultRifle) {
        this.weaponAssaultRifle = weaponAssaultRifle;
    }

    @JsonProperty("weapon_shotgun")
    public WeaponShotgun getWeaponShotgun() {
        return weaponShotgun;
    }

    @JsonProperty("weapon_shotgun")
    public void setWeaponShotgun(WeaponShotgun weaponShotgun) {
        this.weaponShotgun = weaponShotgun;
    }

    @JsonProperty("weapon_marksman")
    public WeaponMarksman getWeaponMarksman() {
        return weaponMarksman;
    }

    @JsonProperty("weapon_marksman")
    public void setWeaponMarksman(WeaponMarksman weaponMarksman) {
        this.weaponMarksman = weaponMarksman;
    }

    @JsonProperty("weapon_sniper")
    public WeaponSniper getWeaponSniper() {
        return weaponSniper;
    }

    @JsonProperty("weapon_sniper")
    public void setWeaponSniper(WeaponSniper weaponSniper) {
        this.weaponSniper = weaponSniper;
    }

    @JsonProperty("tacticals")
    public Tacticals getTacticals() {
        return tacticals;
    }

    @JsonProperty("tacticals")
    public void setTacticals(Tacticals tacticals) {
        this.tacticals = tacticals;
    }

    @JsonProperty("lethals")
    public Lethals getLethals() {
        return lethals;
    }

    @JsonProperty("lethals")
    public void setLethals(Lethals lethals) {
        this.lethals = lethals;
    }

    @JsonProperty("weapon_lmg")
    public WeaponLmg getWeaponLmg() {
        return weaponLmg;
    }

    @JsonProperty("weapon_lmg")
    public void setWeaponLmg(WeaponLmg weaponLmg) {
        this.weaponLmg = weaponLmg;
    }

    @JsonProperty("weapon_launcher")
    public WeaponLauncher getWeaponLauncher() {
        return weaponLauncher;
    }

    @JsonProperty("weapon_launcher")
    public void setWeaponLauncher(WeaponLauncher weaponLauncher) {
        this.weaponLauncher = weaponLauncher;
    }

    @JsonProperty("supers")
    public Supers getSupers() {
        return supers;
    }

    @JsonProperty("supers")
    public void setSupers(Supers supers) {
        this.supers = supers;
    }

    @JsonProperty("weapon_pistol")
    public WeaponPistol getWeaponPistol() {
        return weaponPistol;
    }

    @JsonProperty("weapon_pistol")
    public void setWeaponPistol(WeaponPistol weaponPistol) {
        this.weaponPistol = weaponPistol;
    }

    @JsonProperty("weapon_other")
    public WeaponOther getWeaponOther() {
        return weaponOther;
    }

    @JsonProperty("weapon_other")
    public void setWeaponOther(WeaponOther weaponOther) {
        this.weaponOther = weaponOther;
    }

    @JsonProperty("weapon_smg")
    public WeaponSmg getWeaponSmg() {
        return weaponSmg;
    }

    @JsonProperty("weapon_smg")
    public void setWeaponSmg(WeaponSmg weaponSmg) {
        this.weaponSmg = weaponSmg;
    }

    @JsonProperty("weapon_melee")
    public WeaponMelee getWeaponMelee() {
        return weaponMelee;
    }

    @JsonProperty("weapon_melee")
    public void setWeaponMelee(WeaponMelee weaponMelee) {
        this.weaponMelee = weaponMelee;
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
