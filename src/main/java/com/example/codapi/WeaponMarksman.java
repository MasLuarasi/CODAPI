
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
    "iw8_sn_sbeta",
    "iw8_sn_crossbow",
    "iw8_sn_romeo700",
    "iw8_sn_kilo98",
    "iw8_sn_mike14",
    "iw8_sn_sksierra"
})
@Generated("jsonschema2pojo")
public class WeaponMarksman {

    @JsonProperty("iw8_sn_sbeta")
    private Iw8SnSbeta iw8SnSbeta;
    @JsonProperty("iw8_sn_crossbow")
    private Iw8SnCrossbow iw8SnCrossbow;
    @JsonProperty("iw8_sn_romeo700")
    private Iw8SnRomeo700 iw8SnRomeo700;
    @JsonProperty("iw8_sn_kilo98")
    private Iw8SnKilo98 iw8SnKilo98;
    @JsonProperty("iw8_sn_mike14")
    private Iw8SnMike14 iw8SnMike14;
    @JsonProperty("iw8_sn_sksierra")
    private Iw8SnSksierra iw8SnSksierra;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("iw8_sn_sbeta")
    public Iw8SnSbeta getIw8SnSbeta() {
        return iw8SnSbeta;
    }

    @JsonProperty("iw8_sn_sbeta")
    public void setIw8SnSbeta(Iw8SnSbeta iw8SnSbeta) {
        this.iw8SnSbeta = iw8SnSbeta;
    }

    @JsonProperty("iw8_sn_crossbow")
    public Iw8SnCrossbow getIw8SnCrossbow() {
        return iw8SnCrossbow;
    }

    @JsonProperty("iw8_sn_crossbow")
    public void setIw8SnCrossbow(Iw8SnCrossbow iw8SnCrossbow) {
        this.iw8SnCrossbow = iw8SnCrossbow;
    }

    @JsonProperty("iw8_sn_romeo700")
    public Iw8SnRomeo700 getIw8SnRomeo700() {
        return iw8SnRomeo700;
    }

    @JsonProperty("iw8_sn_romeo700")
    public void setIw8SnRomeo700(Iw8SnRomeo700 iw8SnRomeo700) {
        this.iw8SnRomeo700 = iw8SnRomeo700;
    }

    @JsonProperty("iw8_sn_kilo98")
    public Iw8SnKilo98 getIw8SnKilo98() {
        return iw8SnKilo98;
    }

    @JsonProperty("iw8_sn_kilo98")
    public void setIw8SnKilo98(Iw8SnKilo98 iw8SnKilo98) {
        this.iw8SnKilo98 = iw8SnKilo98;
    }

    @JsonProperty("iw8_sn_mike14")
    public Iw8SnMike14 getIw8SnMike14() {
        return iw8SnMike14;
    }

    @JsonProperty("iw8_sn_mike14")
    public void setIw8SnMike14(Iw8SnMike14 iw8SnMike14) {
        this.iw8SnMike14 = iw8SnMike14;
    }

    @JsonProperty("iw8_sn_sksierra")
    public Iw8SnSksierra getIw8SnSksierra() {
        return iw8SnSksierra;
    }

    @JsonProperty("iw8_sn_sksierra")
    public void setIw8SnSksierra(Iw8SnSksierra iw8SnSksierra) {
        this.iw8SnSksierra = iw8SnSksierra;
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
