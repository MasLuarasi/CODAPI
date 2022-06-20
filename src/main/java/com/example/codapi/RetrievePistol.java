package com.example.codapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.util.ArrayList;

public class RetrievePistol
{
    private ObjectMapper mapper;


    public WeaponPistol getPistolProperties(JSONObject root) throws JsonProcessingException
    {
        mapper = new ObjectMapper();
        ArrayList<Object> pistolList = new ArrayList<>();
        JSONObject object1 = root.getJSONObject("weapon_pistol");
        WeaponPistol pistolTemp = new WeaponPistol();

        Iw8PiCpapa rev  = get357Properties(object1);
        rev.setName(".357 (Revolver)");
        pistolList.add(rev);
        pistolTemp.setIw8PiCpapa(rev);

        Iw8PiMike9 renetti = getRenettiProperties(object1);
        renetti.setName("Renetti");
        pistolList.add(renetti);
        pistolTemp.setIw8PiMike9(renetti);

        Iw8PiMike1911 nt11  = get1911Properties(object1);
        nt11.setName("1911");
        pistolList.add(nt11);
        pistolTemp.setIw8PiMike1911(nt11);

        Iw8PiGolf21 x16  = getX16Properties(object1);
        x16.setName("X16");
        pistolList.add(x16);
        pistolTemp.setIw8PiGolf21(x16);

        Iw8PiDecho gs  = get50GSProperties(object1);
        gs.setName(".50 GS");
        pistolList.add(gs);
        pistolTemp.setIw8PiDecho(gs);

        Iw8PiPapa320 m19  = getM19Properties(object1);
        m19.setName("M19");
        pistolList.add(m19);
        pistolTemp.setIw8PiPapa320(m19);

        pistolTemp.setPistolList(pistolList);
        return pistolTemp;
    }

    public Iw8PiCpapa get357Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_pi_cpapa");
        return mapper.readValue(object1.toString(), Iw8PiCpapa.class);
    }

    public Iw8PiMike9 getRenettiProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_pi_mike9");
        return mapper.readValue(object1.toString(), Iw8PiMike9.class);
    }

    public Iw8PiMike1911 get1911Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_pi_mike1911");
        return mapper.readValue(object1.toString(), Iw8PiMike1911.class);
    }

    public Iw8PiGolf21 getX16Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_pi_golf21");
        return mapper.readValue(object1.toString(), Iw8PiGolf21.class);
    }

    public Iw8PiDecho get50GSProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_pi_decho");
        return mapper.readValue(object1.toString(), Iw8PiDecho.class);
    }

    public Iw8PiPapa320 getM19Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_pi_papa320");
        return mapper.readValue(object1.toString(), Iw8PiPapa320.class);
    }

}
