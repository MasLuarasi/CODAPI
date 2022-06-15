
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

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mode() {
    }

    /**
     * 
     * @param hcDom
     * @param gun
     * @param dom
     * @param brAll
     * @param war
     * @param hq
     * @param koth
     * @param conf
     * @param hcWar
     * @param arena
     * @param br
     * @param sd
     * @param grnd
     * @param cyber
     * @param hcConf
     * @param hcHq
     * @param brDmz
     * @param hcSd
     * @param arm
     * @param hcCyber
     * @param infect
     */
    public Mode(Gun gun, Dom dom, War war, Hq hq, HcDom hcDom, HcConf hcConf, Koth koth, Conf conf, HcHq hcHq, Arena arena, BrDmz brDmz, Br br, Sd sd, Grnd grnd, Cyber cyber, HcWar hcWar, BrAll brAll, HcSd hcSd, Arm arm, HcCyber hcCyber, Infect infect) {
        super();
        this.gun = gun;
        this.dom = dom;
        this.war = war;
        this.hq = hq;
        this.hcDom = hcDom;
        this.hcConf = hcConf;
        this.koth = koth;
        this.conf = conf;
        this.hcHq = hcHq;
        this.arena = arena;
        this.brDmz = brDmz;
        this.br = br;
        this.sd = sd;
        this.grnd = grnd;
        this.cyber = cyber;
        this.hcWar = hcWar;
        this.brAll = brAll;
        this.hcSd = hcSd;
        this.arm = arm;
        this.hcCyber = hcCyber;
        this.infect = infect;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Mode.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gun");
        sb.append('=');
        sb.append(((this.gun == null)?"<null>":this.gun));
        sb.append(',');
        sb.append("dom");
        sb.append('=');
        sb.append(((this.dom == null)?"<null>":this.dom));
        sb.append(',');
        sb.append("war");
        sb.append('=');
        sb.append(((this.war == null)?"<null>":this.war));
        sb.append(',');
        sb.append("hq");
        sb.append('=');
        sb.append(((this.hq == null)?"<null>":this.hq));
        sb.append(',');
        sb.append("hcDom");
        sb.append('=');
        sb.append(((this.hcDom == null)?"<null>":this.hcDom));
        sb.append(',');
        sb.append("hcConf");
        sb.append('=');
        sb.append(((this.hcConf == null)?"<null>":this.hcConf));
        sb.append(',');
        sb.append("koth");
        sb.append('=');
        sb.append(((this.koth == null)?"<null>":this.koth));
        sb.append(',');
        sb.append("conf");
        sb.append('=');
        sb.append(((this.conf == null)?"<null>":this.conf));
        sb.append(',');
        sb.append("hcHq");
        sb.append('=');
        sb.append(((this.hcHq == null)?"<null>":this.hcHq));
        sb.append(',');
        sb.append("arena");
        sb.append('=');
        sb.append(((this.arena == null)?"<null>":this.arena));
        sb.append(',');
        sb.append("brDmz");
        sb.append('=');
        sb.append(((this.brDmz == null)?"<null>":this.brDmz));
        sb.append(',');
        sb.append("br");
        sb.append('=');
        sb.append(((this.br == null)?"<null>":this.br));
        sb.append(',');
        sb.append("sd");
        sb.append('=');
        sb.append(((this.sd == null)?"<null>":this.sd));
        sb.append(',');
        sb.append("grnd");
        sb.append('=');
        sb.append(((this.grnd == null)?"<null>":this.grnd));
        sb.append(',');
        sb.append("cyber");
        sb.append('=');
        sb.append(((this.cyber == null)?"<null>":this.cyber));
        sb.append(',');
        sb.append("hcWar");
        sb.append('=');
        sb.append(((this.hcWar == null)?"<null>":this.hcWar));
        sb.append(',');
        sb.append("brAll");
        sb.append('=');
        sb.append(((this.brAll == null)?"<null>":this.brAll));
        sb.append(',');
        sb.append("hcSd");
        sb.append('=');
        sb.append(((this.hcSd == null)?"<null>":this.hcSd));
        sb.append(',');
        sb.append("arm");
        sb.append('=');
        sb.append(((this.arm == null)?"<null>":this.arm));
        sb.append(',');
        sb.append("hcCyber");
        sb.append('=');
        sb.append(((this.hcCyber == null)?"<null>":this.hcCyber));
        sb.append(',');
        sb.append("infect");
        sb.append('=');
        sb.append(((this.infect == null)?"<null>":this.infect));
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
