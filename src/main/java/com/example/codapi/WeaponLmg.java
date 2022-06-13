
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
    "iw8_lm_kilo121",
    "iw8_lm_mkilo3",
    "iw8_lm_mgolf34",
    "iw8_lm_lima86",
    "iw8_lm_pkilo",
    "iw8_lm_sierrax",
    "iw8_lm_mgolf36"
})
@Generated("jsonschema2pojo")
public class WeaponLmg {

    @JsonProperty("iw8_lm_kilo121")
    private Iw8LmKilo121 iw8LmKilo121;
    @JsonProperty("iw8_lm_mkilo3")
    private Iw8LmMkilo3 iw8LmMkilo3;
    @JsonProperty("iw8_lm_mgolf34")
    private Iw8LmMgolf34 iw8LmMgolf34;
    @JsonProperty("iw8_lm_lima86")
    private Iw8LmLima86 iw8LmLima86;
    @JsonProperty("iw8_lm_pkilo")
    private Iw8LmPkilo iw8LmPkilo;
    @JsonProperty("iw8_lm_sierrax")
    private Iw8LmSierrax iw8LmSierrax;
    @JsonProperty("iw8_lm_mgolf36")
    private Iw8LmMgolf36 iw8LmMgolf36;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("iw8_lm_kilo121")
    public Iw8LmKilo121 getIw8LmKilo121() {
        return iw8LmKilo121;
    }

    @JsonProperty("iw8_lm_kilo121")
    public void setIw8LmKilo121(Iw8LmKilo121 iw8LmKilo121) {
        this.iw8LmKilo121 = iw8LmKilo121;
    }

    @JsonProperty("iw8_lm_mkilo3")
    public Iw8LmMkilo3 getIw8LmMkilo3() {
        return iw8LmMkilo3;
    }

    @JsonProperty("iw8_lm_mkilo3")
    public void setIw8LmMkilo3(Iw8LmMkilo3 iw8LmMkilo3) {
        this.iw8LmMkilo3 = iw8LmMkilo3;
    }

    @JsonProperty("iw8_lm_mgolf34")
    public Iw8LmMgolf34 getIw8LmMgolf34() {
        return iw8LmMgolf34;
    }

    @JsonProperty("iw8_lm_mgolf34")
    public void setIw8LmMgolf34(Iw8LmMgolf34 iw8LmMgolf34) {
        this.iw8LmMgolf34 = iw8LmMgolf34;
    }

    @JsonProperty("iw8_lm_lima86")
    public Iw8LmLima86 getIw8LmLima86() {
        return iw8LmLima86;
    }

    @JsonProperty("iw8_lm_lima86")
    public void setIw8LmLima86(Iw8LmLima86 iw8LmLima86) {
        this.iw8LmLima86 = iw8LmLima86;
    }

    @JsonProperty("iw8_lm_pkilo")
    public Iw8LmPkilo getIw8LmPkilo() {
        return iw8LmPkilo;
    }

    @JsonProperty("iw8_lm_pkilo")
    public void setIw8LmPkilo(Iw8LmPkilo iw8LmPkilo) {
        this.iw8LmPkilo = iw8LmPkilo;
    }

    @JsonProperty("iw8_lm_sierrax")
    public Iw8LmSierrax getIw8LmSierrax() {
        return iw8LmSierrax;
    }

    @JsonProperty("iw8_lm_sierrax")
    public void setIw8LmSierrax(Iw8LmSierrax iw8LmSierrax) {
        this.iw8LmSierrax = iw8LmSierrax;
    }

    @JsonProperty("iw8_lm_mgolf36")
    public Iw8LmMgolf36 getIw8LmMgolf36() {
        return iw8LmMgolf36;
    }

    @JsonProperty("iw8_lm_mgolf36")
    public void setIw8LmMgolf36(Iw8LmMgolf36 iw8LmMgolf36) {
        this.iw8LmMgolf36 = iw8LmMgolf36;
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
