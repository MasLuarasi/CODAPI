package com.example.codapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.util.ArrayList;

public class RetrieveMarksman
{
    private ObjectMapper mapper;
    private ArrayList<Object> marksmanList;

    public WeaponMarksman getMarksmanProperties(JSONObject root) throws JsonProcessingException
    {
        mapper = new ObjectMapper();
        JSONObject object1 = root.getJSONObject("weapon_marksman");
        WeaponMarksman marksmanTemp = new WeaponMarksman();

        Iw8SnSbeta mk2  = getMK2Properties(object1);
        mk2.setName("Mk2 Carbine");
        marksmanList.add(mk2);
        marksmanTemp.setIw8SnSbeta(mk2);

        Iw8SnCrossbow crossbow  = getCrossbowProperties(object1);
        crossbow.setName("Crossbow");
        marksmanList.add(crossbow);
        marksmanTemp.setIw8SnCrossbow(crossbow);

        Iw8SnRomeo700 spr  = getSPRProperties(object1);
        spr.setName("SP-R");
        marksmanList.add(spr);
        marksmanTemp.setIw8SnRomeo700(spr);

        Iw8SnKilo98 kar  = getKarProperties(object1);
        kar.setName("Kar 98k");
        marksmanList.add(kar);
        marksmanTemp.setIw8SnKilo98(kar);

        Iw8SnMike14 ebr  = getEBRProperties(object1);
        ebr.setName("EBR-14");
        marksmanList.add(ebr);
        marksmanTemp.setIw8SnMike14(ebr);

        Iw8SnSksierra sks  = getSKSProperties(object1);
        sks.setName("SKS");
        marksmanList.add(sks);
        marksmanTemp.setIw8SnSksierra(sks);

        return marksmanTemp;
    }

    public Iw8SnSbeta getMK2Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sn_sbeta");
        return mapper.readValue(object1.toString(), Iw8SnSbeta.class);
    }

    public Iw8SnCrossbow getCrossbowProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sn_crossbow");
        return mapper.readValue(object1.toString(), Iw8SnCrossbow.class);
    }

    public Iw8SnRomeo700 getSPRProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sn_romeo700");
        return mapper.readValue(object1.toString(), Iw8SnRomeo700.class);
    }

    public Iw8SnKilo98 getKarProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sn_kilo98");
        return mapper.readValue(object1.toString(), Iw8SnKilo98.class);
    }

    public Iw8SnMike14 getEBRProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sn_mike14");
        return mapper.readValue(object1.toString(), Iw8SnMike14.class);
    }

    public Iw8SnSksierra getSKSProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sn_sksierra");
        return mapper.readValue(object1.toString(), Iw8SnSksierra.class);
    }

}
