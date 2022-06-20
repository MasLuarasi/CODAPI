
package com.example.codapi;

import java.util.ArrayList;
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
    "iw8_pi_cpapa",
    "iw8_pi_mike9",
    "iw8_pi_mike1911",
    "iw8_pi_golf21",
    "iw8_pi_decho",
    "iw8_pi_papa320"
})
@Generated("jsonschema2pojo")
public class WeaponPistol {

    @JsonProperty("iw8_pi_cpapa")
    private Iw8PiCpapa iw8PiCpapa;
    @JsonProperty("iw8_pi_mike9")
    private Iw8PiMike9 iw8PiMike9;
    @JsonProperty("iw8_pi_mike1911")
    private Iw8PiMike1911 iw8PiMike1911;
    @JsonProperty("iw8_pi_golf21")
    private Iw8PiGolf21 iw8PiGolf21;
    @JsonProperty("iw8_pi_decho")
    private Iw8PiDecho iw8PiDecho;
    @JsonProperty("iw8_pi_papa320")
    private Iw8PiPapa320 iw8PiPapa320;
    @JsonIgnore
    private ArrayList<Object> pList;

    public WeaponPistol() {}

    public WeaponPistol(Iw8PiCpapa iw8PiCpapa, Iw8PiMike9 iw8PiMike9, Iw8PiMike1911 iw8PiMike1911,
                        Iw8PiGolf21 iw8PiGolf21, Iw8PiDecho iw8PiDecho, Iw8PiPapa320 iw8PiPapa320)
    {
        super();
        this.iw8PiCpapa = iw8PiCpapa;
        this.iw8PiMike9 = iw8PiMike9;
        this.iw8PiMike1911 = iw8PiMike1911;
        this.iw8PiGolf21 = iw8PiGolf21;
        this.iw8PiDecho = iw8PiDecho;
        this.iw8PiPapa320 = iw8PiPapa320;
        this.pList = new ArrayList<>();
    }

    @JsonProperty("iw8_pi_cpapa")
    public Iw8PiCpapa getIw8PiCpapa() {
        return iw8PiCpapa;
    }

    @JsonProperty("iw8_pi_cpapa")
    public void setIw8PiCpapa(Iw8PiCpapa iw8PiCpapa) {
        this.iw8PiCpapa = iw8PiCpapa;
    }

    @JsonProperty("iw8_pi_mike9")
    public Iw8PiMike9 getIw8PiMike9() {
        return iw8PiMike9;
    }

    @JsonProperty("iw8_pi_mike9")
    public void setIw8PiMike9(Iw8PiMike9 iw8PiMike9) {
        this.iw8PiMike9 = iw8PiMike9;
    }

    @JsonProperty("iw8_pi_mike1911")
    public Iw8PiMike1911 getIw8PiMike1911() {
        return iw8PiMike1911;
    }

    @JsonProperty("iw8_pi_mike1911")
    public void setIw8PiMike1911(Iw8PiMike1911 iw8PiMike1911) {
        this.iw8PiMike1911 = iw8PiMike1911;
    }

    @JsonProperty("iw8_pi_golf21")
    public Iw8PiGolf21 getIw8PiGolf21() {
        return iw8PiGolf21;
    }

    @JsonProperty("iw8_pi_golf21")
    public void setIw8PiGolf21(Iw8PiGolf21 iw8PiGolf21) {
        this.iw8PiGolf21 = iw8PiGolf21;
    }

    @JsonProperty("iw8_pi_decho")
    public Iw8PiDecho getIw8PiDecho() {
        return iw8PiDecho;
    }

    @JsonProperty("iw8_pi_decho")
    public void setIw8PiDecho(Iw8PiDecho iw8PiDecho) {
        this.iw8PiDecho = iw8PiDecho;
    }

    @JsonProperty("iw8_pi_papa320")
    public Iw8PiPapa320 getIw8PiPapa320() {
        return iw8PiPapa320;
    }

    @JsonProperty("iw8_pi_papa320")
    public void setIw8PiPapa320(Iw8PiPapa320 iw8PiPapa320) {
        this.iw8PiPapa320 = iw8PiPapa320;
    }

    @JsonAnyGetter
    public ArrayList<Object> getPistolList(){return this.pList;}

    @JsonAnySetter
    public void setPistolList(ArrayList<Object> list){this.pList = list;}


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Object o: pList)
        {
            sb.append(o.toString() + "---------------------------");
        }
        return sb.toString();
    }

}
