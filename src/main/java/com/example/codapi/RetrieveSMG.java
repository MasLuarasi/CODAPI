package com.example.codapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.util.ArrayList;

public class RetrieveSMG
{
    private ObjectMapper mapper;
    private ArrayList<Object> smgList;

    public WeaponSmg getSMGProperties(JSONObject root) throws JsonProcessingException
    {
        mapper = new ObjectMapper();
        JSONObject object1 = root.getJSONObject("weapon_smg");
        WeaponSmg smgTemp = new WeaponSmg();

        Iw8SmMpapa7 mp7 = getMP7Properties(object1);
        mp7.setName("MP7");
        smgList.add(mp7);
        smgTemp.setIw8SmMpapa7(mp7);

        Iw8SmAugolf aug  = getAUGProperties(object1);
        aug.setName("AUG");
        smgList.add(aug);
        smgTemp.setIw8SmAugolf(aug);

        Iw8SmPapa90 p90  = getP90Properties(object1);
        p90.setName("P90");
        smgList.add(p90);
        smgTemp.setIw8SmPapa90(p90);

        Iw8SmCharlie9 iso  = getIsoProperties(object1);
        iso.setName("ISO");
        smgList.add(iso);
        smgTemp.setIw8SmCharlie9(iso);

        Iw8SmMpapa5 mp5  = getMP5Properties(object1);
        mp5.setName("MP5");
        smgList.add(mp5);
        smgTemp.setIw8SmMpapa5(mp5);

        Iw8SmSmgolf45 striker  = getStrikerProperties(object1);
        striker.setName("Striker 45");
        smgList.add(striker);
        smgTemp.setIw8SmSmgolf45(striker);

        Iw8SmBeta bizon  = getBizonProperties(object1);
        bizon.setName("Bizon");
        smgList.add(bizon);
        smgTemp.setIw8SmBeta(bizon);

        Iw8SmVictor fennec = getFennecProperties(object1);
        fennec.setName("Fennec");
        smgList.add(fennec);
        smgTemp.setIw8SmVictor(fennec);

        Iw8SmUzulu uzi  = getUziProperties(object1);
        uzi.setName("Uzi");
        smgList.add(uzi);
        smgTemp.setIw8SmUzulu(uzi);

        return smgTemp;
    }

    public Iw8SmMpapa7 getMP7Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_smg_mpapa7");
        return mapper.readValue(object1.toString(), Iw8SmMpapa7.class);
    }

    public Iw8SmAugolf getAUGProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_smg_augolf");
        return mapper.readValue(object1.toString(), Iw8SmAugolf.class);
    }

    public Iw8SmPapa90 getP90Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_smg_papa90");
        return mapper.readValue(object1.toString(), Iw8SmPapa90.class);
    }

    public Iw8SmCharlie9 getIsoProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_smg_charlie9");
        return mapper.readValue(object1.toString(), Iw8SmCharlie9.class);
    }

    public Iw8SmMpapa5 getMP5Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_smg_mpapa5");
        return mapper.readValue(object1.toString(), Iw8SmMpapa5.class);
    }

    public Iw8SmSmgolf45 getStrikerProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_smg_smgolf45");
        return mapper.readValue(object1.toString(), Iw8SmSmgolf45.class);
    }

    public Iw8SmBeta getBizonProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_smg_beta");
        return mapper.readValue(object1.toString(), Iw8SmBeta.class);
    }

    public Iw8SmVictor getFennecProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_smg_victor");
        return mapper.readValue(object1.toString(), Iw8SmVictor.class);
    }

    public Iw8SmUzulu getUziProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_smg_uzulu");
        return mapper.readValue(object1.toString(), Iw8SmUzulu.class);
    }

}
