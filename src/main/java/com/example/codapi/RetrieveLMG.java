package com.example.codapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.util.ArrayList;

public class RetrieveLMG
{
    private ObjectMapper mapper;
    private ArrayList<Object> lmgList;

    public WeaponLmg getLMGProperties(JSONObject root) throws JsonProcessingException
    {
        mapper = new ObjectMapper();
        lmgList = new ArrayList<>();
        JSONObject object1 = root.getJSONObject("weapon_smg");
        WeaponLmg lmgTemp = new WeaponLmg();

        Iw8LmKilo121 m91  = getM91Properties(object1);
        m91.setName("M91");
        lmgList.add(m91);
        lmgTemp.setIw8LmKilo121(m91);

        Iw8LmMkilo3 bruen  = getBruenProperties(object1);
        bruen.setName("Bruen MK9");
        lmgList.add(bruen);
        lmgTemp.setIw8LmMkilo3(bruen);

        Iw8LmMgolf34 mg34  = getMG34Properties(object1);
        mg34.setName("MG34");
        lmgList.add(mg34);
        lmgTemp.setIw8LmMgolf34(mg34);

        Iw8LmLima86 sa87  = getSA87Properties(object1);
        sa87.setName("SA87");
        lmgList.add(sa87);
        lmgTemp.setIw8LmLima86(sa87);

        Iw8LmPkilo pkm  = getPKMProperties(object1);
        pkm.setName("PKM");
        lmgList.add(pkm);
        lmgTemp.setIw8LmPkilo(pkm);

        Iw8LmSierrax finn  = getFinnProperties(object1);
        finn.setName("FiNN");
        lmgList.add(finn);
        lmgTemp.setIw8LmSierrax(finn);

        Iw8LmMgolf36 holger = getHolgerProperties(object1);
        holger.setName("Holger-26");
        lmgList.add(holger);
        lmgTemp.setIw8LmMgolf36(holger);

        return lmgTemp;
    }

    public Iw8LmKilo121 getM91Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_lm_kilo121");
        return mapper.readValue(object1.toString(), Iw8LmKilo121.class);
    }

    public Iw8LmMkilo3 getBruenProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_lm_mkilo3");
        return mapper.readValue(object1.toString(), Iw8LmMkilo3.class);
    }

    public Iw8LmMgolf34 getMG34Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_lm_mgolf34");
        return mapper.readValue(object1.toString(), Iw8LmMgolf34.class);
    }

    public Iw8LmLima86 getSA87Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_lm_lima86");
        return mapper.readValue(object1.toString(), Iw8LmLima86.class);
    }

    public Iw8LmPkilo getPKMProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_lm_pkilo");
        return mapper.readValue(object1.toString(), Iw8LmPkilo.class);
    }

    public Iw8LmSierrax getFinnProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_lm_sierrax");
        return mapper.readValue(object1.toString(), Iw8LmSierrax.class);
    }

    public Iw8LmMgolf36 getHolgerProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_lm_mgolf36");
        return mapper.readValue(object1.toString(), Iw8LmMgolf36.class);
    }

}
