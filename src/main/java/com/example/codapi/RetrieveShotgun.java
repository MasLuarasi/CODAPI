package com.example.codapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.util.ArrayList;

public class RetrieveShotgun
{
    private ObjectMapper mapper;
    private ArrayList<Object> shotgunList;

    public WeaponShotgun getShotgunProperties(JSONObject root) throws JsonProcessingException
    {
        mapper = new ObjectMapper();
        JSONObject object1 = root.getJSONObject("weapon_shotgun");
        WeaponShotgun shotgunTemp = new WeaponShotgun();

        Iw8ShMike26 vlk  = getVLKProperties(object1);
        vlk.setName("VLK Rogue");
        shotgunList.add(vlk);
        shotgunTemp.setIw8ShMike26(vlk);

        Iw8ShCharlie725 aids  = get725Properties(object1);
        aids.setName("725");
        shotgunList.add(aids);
        shotgunTemp.setIw8ShCharlie725(aids);

        Iw8ShOscar12 origin  = getOriginProperties(object1);
        origin.setName("Origin 12");
        shotgunList.add(origin);
        shotgunTemp.setIw8ShOscar12(origin);

        Iw8ShAalpha12 jak  = getJakProperties(object1);
        jak.setName("JAK 12");
        shotgunList.add(jak);
        shotgunTemp.setIw8ShAalpha12(jak);

        Iw8ShRomeo870 model  = get680Properties(object1);
        model.setName("Model 680");
        shotgunList.add(model);
        shotgunTemp.setIw8ShRomeo870(model);

        Iw8ShDpapa12 r9  = getR9OProperties(object1);
        r9.setName("R9-O");
        shotgunList.add(r9);
        shotgunTemp.setIw8ShDpapa12(r9);

        return shotgunTemp;
    }

    public Iw8ShMike26 getVLKProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sh_mike26");
        return mapper.readValue(object1.toString(), Iw8ShMike26.class);
    }

    public Iw8ShCharlie725 get725Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sh_charlie725");
        return mapper.readValue(object1.toString(), Iw8ShCharlie725.class);
    }

    public Iw8ShOscar12 getOriginProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sh_oscar12");
        return mapper.readValue(object1.toString(), Iw8ShOscar12.class);
    }

    public Iw8ShAalpha12 getJakProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sh_aalpha12");
        return mapper.readValue(object1.toString(), Iw8ShAalpha12.class);
    }

    public Iw8ShRomeo870 get680Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sh_romeo870");
        return mapper.readValue(object1.toString(), Iw8ShRomeo870.class);
    }

    public Iw8ShDpapa12 getR9OProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sh_dpapa12");
        return mapper.readValue(object1.toString(), Iw8ShDpapa12.class);
    }

}
