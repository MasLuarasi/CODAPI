
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
    "gun",
    "dom",
    "war",
    "hq",
    "hc_dom",
    "hc_conf",
    "koth",
    "conf",
    "hc_hq",
    "arena",
    "br_dmz",
    "br",
    "sd",
    "grnd",
    "cyber",
    "hc_war",
    "br_all",
    "hc_sd",
    "arm",
    "hc_cyber",
    "infect"
})
@Generated("jsonschema2pojo")
public class Mode {

    @JsonProperty("gun")
    private Gun gun;
    @JsonProperty("dom")
    private Dom dom;
    @JsonProperty("war")
    private War war;
    @JsonProperty("hq")
    private Hq hq;
    @JsonProperty("hc_dom")
    private HcDom hcDom;
    @JsonProperty("hc_conf")
    private HcConf hcConf;
    @JsonProperty("koth")
    private Koth koth;
    @JsonProperty("conf")
    private Conf conf;
    @JsonProperty("hc_hq")
    private HcHq hcHq;
    @JsonProperty("arena")
    private Arena arena;
    @JsonProperty("br_dmz")
    private BrDmz brDmz;
    @JsonProperty("br")
    private Br br;
    @JsonProperty("sd")
    private Sd sd;
    @JsonProperty("grnd")
    private Grnd grnd;
    @JsonProperty("cyber")
    private Cyber cyber;
    @JsonProperty("hc_war")
    private HcWar hcWar;
    @JsonProperty("br_all")
    private BrAll brAll;
    @JsonProperty("hc_sd")
    private HcSd hcSd;
    @JsonProperty("arm")
    private Arm arm;
    @JsonProperty("hc_cyber")
    private HcCyber hcCyber;
    @JsonProperty("infect")
    private Infect infect;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gun")
    public Gun getGun() {
        return gun;
    }

    @JsonProperty("gun")
    public void setGun(Gun gun) {
        this.gun = gun;
    }

    @JsonProperty("dom")
    public Dom getDom() {
        return dom;
    }

    @JsonProperty("dom")
    public void setDom(Dom dom) {
        this.dom = dom;
    }

    @JsonProperty("war")
    public War getWar() {
        return war;
    }

    @JsonProperty("war")
    public void setWar(War war) {
        this.war = war;
    }

    @JsonProperty("hq")
    public Hq getHq() {
        return hq;
    }

    @JsonProperty("hq")
    public void setHq(Hq hq) {
        this.hq = hq;
    }

    @JsonProperty("hc_dom")
    public HcDom getHcDom() {
        return hcDom;
    }

    @JsonProperty("hc_dom")
    public void setHcDom(HcDom hcDom) {
        this.hcDom = hcDom;
    }

    @JsonProperty("hc_conf")
    public HcConf getHcConf() {
        return hcConf;
    }

    @JsonProperty("hc_conf")
    public void setHcConf(HcConf hcConf) {
        this.hcConf = hcConf;
    }

    @JsonProperty("koth")
    public Koth getKoth() {
        return koth;
    }

    @JsonProperty("koth")
    public void setKoth(Koth koth) {
        this.koth = koth;
    }

    @JsonProperty("conf")
    public Conf getConf() {
        return conf;
    }

    @JsonProperty("conf")
    public void setConf(Conf conf) {
        this.conf = conf;
    }

    @JsonProperty("hc_hq")
    public HcHq getHcHq() {
        return hcHq;
    }

    @JsonProperty("hc_hq")
    public void setHcHq(HcHq hcHq) {
        this.hcHq = hcHq;
    }

    @JsonProperty("arena")
    public Arena getArena() {
        return arena;
    }

    @JsonProperty("arena")
    public void setArena(Arena arena) {
        this.arena = arena;
    }

    @JsonProperty("br_dmz")
    public BrDmz getBrDmz() {
        return brDmz;
    }

    @JsonProperty("br_dmz")
    public void setBrDmz(BrDmz brDmz) {
        this.brDmz = brDmz;
    }

    @JsonProperty("br")
    public Br getBr() {
        return br;
    }

    @JsonProperty("br")
    public void setBr(Br br) {
        this.br = br;
    }

    @JsonProperty("sd")
    public Sd getSd() {
        return sd;
    }

    @JsonProperty("sd")
    public void setSd(Sd sd) {
        this.sd = sd;
    }

    @JsonProperty("grnd")
    public Grnd getGrnd() {
        return grnd;
    }

    @JsonProperty("grnd")
    public void setGrnd(Grnd grnd) {
        this.grnd = grnd;
    }

    @JsonProperty("cyber")
    public Cyber getCyber() {
        return cyber;
    }

    @JsonProperty("cyber")
    public void setCyber(Cyber cyber) {
        this.cyber = cyber;
    }

    @JsonProperty("hc_war")
    public HcWar getHcWar() {
        return hcWar;
    }

    @JsonProperty("hc_war")
    public void setHcWar(HcWar hcWar) {
        this.hcWar = hcWar;
    }

    @JsonProperty("br_all")
    public BrAll getBrAll() {
        return brAll;
    }

    @JsonProperty("br_all")
    public void setBrAll(BrAll brAll) {
        this.brAll = brAll;
    }

    @JsonProperty("hc_sd")
    public HcSd getHcSd() {
        return hcSd;
    }

    @JsonProperty("hc_sd")
    public void setHcSd(HcSd hcSd) {
        this.hcSd = hcSd;
    }

    @JsonProperty("arm")
    public Arm getArm() {
        return arm;
    }

    @JsonProperty("arm")
    public void setArm(Arm arm) {
        this.arm = arm;
    }

    @JsonProperty("hc_cyber")
    public HcCyber getHcCyber() {
        return hcCyber;
    }

    @JsonProperty("hc_cyber")
    public void setHcCyber(HcCyber hcCyber) {
        this.hcCyber = hcCyber;
    }

    @JsonProperty("infect")
    public Infect getInfect() {
        return infect;
    }

    @JsonProperty("infect")
    public void setInfect(Infect infect) {
        this.infect = infect;
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
