
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
    "iw8_sh_mike26",
    "iw8_sh_charlie725",
    "iw8_sh_oscar12",
    "iw8_sh_aalpha12",
    "iw8_sh_romeo870",
    "iw8_sh_dpapa12"
})
@Generated("jsonschema2pojo")
public class WeaponShotgun {

    @JsonProperty("iw8_sh_mike26")
    private Iw8ShMike26 iw8ShMike26;
    @JsonProperty("iw8_sh_charlie725")
    private Iw8ShCharlie725 iw8ShCharlie725;
    @JsonProperty("iw8_sh_oscar12")
    private Iw8ShOscar12 iw8ShOscar12;
    @JsonProperty("iw8_sh_aalpha12")
    private Iw8ShAalpha12 iw8ShAalpha12;
    @JsonProperty("iw8_sh_romeo870")
    private Iw8ShRomeo870 iw8ShRomeo870;
    @JsonProperty("iw8_sh_dpapa12")
    private Iw8ShDpapa12 iw8ShDpapa12;
    @JsonIgnore
    private ArrayList<Object> shList;

    public WeaponShotgun() {}

    public WeaponShotgun(Iw8ShMike26 iw8ShMike26, Iw8ShCharlie725 iw8ShCharlie725, Iw8ShOscar12 iw8ShOscar12,
                         Iw8ShAalpha12 iw8ShAalpha12, Iw8ShRomeo870 iw8ShRomeo870, Iw8ShDpapa12 iw8ShDpapa12)
    {
        super();
        this.iw8ShMike26 = iw8ShMike26;
        this.iw8ShCharlie725 = iw8ShCharlie725;
        this.iw8ShOscar12 = iw8ShOscar12;
        this.iw8ShAalpha12 = iw8ShAalpha12;
        this.iw8ShRomeo870 = iw8ShRomeo870;
        this.iw8ShDpapa12 = iw8ShDpapa12;
        this.shList = new ArrayList<>();
    }

    @JsonProperty("iw8_sh_mike26")
    public Iw8ShMike26 getIw8ShMike26() {
        return iw8ShMike26;
    }

    @JsonProperty("iw8_sh_mike26")
    public void setIw8ShMike26(Iw8ShMike26 iw8ShMike26) {
        this.iw8ShMike26 = iw8ShMike26;
    }

    @JsonProperty("iw8_sh_charlie725")
    public Iw8ShCharlie725 getIw8ShCharlie725() {
        return iw8ShCharlie725;
    }

    @JsonProperty("iw8_sh_charlie725")
    public void setIw8ShCharlie725(Iw8ShCharlie725 iw8ShCharlie725) {
        this.iw8ShCharlie725 = iw8ShCharlie725;
    }

    @JsonProperty("iw8_sh_oscar12")
    public Iw8ShOscar12 getIw8ShOscar12() {
        return iw8ShOscar12;
    }

    @JsonProperty("iw8_sh_oscar12")
    public void setIw8ShOscar12(Iw8ShOscar12 iw8ShOscar12) {
        this.iw8ShOscar12 = iw8ShOscar12;
    }

    @JsonProperty("iw8_sh_aalpha12")
    public Iw8ShAalpha12 getIw8ShAalpha12() {
        return iw8ShAalpha12;
    }

    @JsonProperty("iw8_sh_aalpha12")
    public void setIw8ShAalpha12(Iw8ShAalpha12 iw8ShAalpha12) {
        this.iw8ShAalpha12 = iw8ShAalpha12;
    }

    @JsonProperty("iw8_sh_romeo870")
    public Iw8ShRomeo870 getIw8ShRomeo870() {
        return iw8ShRomeo870;
    }

    @JsonProperty("iw8_sh_romeo870")
    public void setIw8ShRomeo870(Iw8ShRomeo870 iw8ShRomeo870) {
        this.iw8ShRomeo870 = iw8ShRomeo870;
    }

    @JsonProperty("iw8_sh_dpapa12")
    public Iw8ShDpapa12 getIw8ShDpapa12() {
        return iw8ShDpapa12;
    }

    @JsonProperty("iw8_sh_dpapa12")
    public void setIw8ShDpapa12(Iw8ShDpapa12 iw8ShDpapa12) {
        this.iw8ShDpapa12 = iw8ShDpapa12;
    }

    @JsonAnyGetter
    public ArrayList<Object> getShotgunList(){return this.shList;}

    @JsonAnySetter
    public void setShotgunList(ArrayList<Object> list){this.shList = list;}


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Object o: shList)
        {
            sb.append(o.toString() + "---------------------------");
        }
        return sb.toString();
    }

}
