package com.example.codapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.util.ArrayList;

public class RetrieveAR
{
    private ObjectMapper mapper;
    private ArrayList<Object> arList;

    public WeaponAssaultRifle getARProperties(JSONObject root) throws JsonProcessingException
    {
        mapper = new ObjectMapper();
        arList = new ArrayList<>();
        JSONObject object1 = root.getJSONObject("weapon_assault_rifle");
        WeaponAssaultRifle arTemp = new WeaponAssaultRifle();

        Iw8ArTango21 ram = getRamProperties(object1);
        ram.setName("RAM-7");
        arList.add(ram);
        arTemp.setIw8ArTango21(ram);

        Iw8ArMike4 m4 = getM4Properties(object1);
        m4.setName("M4");
        arList.add(m4);
        arTemp.setIw8ArMike4(m4);

        Iw8ArValpha val = getValProperties(object1);
        val.setName("Val");
        arList.add(val);
        arTemp.setIw8ArValpha(val);

        Iw8ArFalpha fr = getFR556Properties(object1);
        fr.setName("FFR 5.56");
        arList.add(fr);
        arTemp.setIw8ArFalpha(fr);

        Iw8ArMcharlie m13 = getM13Properties(object1);
        m13.setName("M13");
        arList.add(m13);
        arTemp.setIw8ArMcharlie(m13);

        Iw8ArAkilo47 ak47 = getAK47Properties(object1);
        ak47.setName("AK-47");
        arList.add(ak47);
        arTemp.setIw8ArAkilo47(ak47);

        Iw8ArAsierra12 oden = getOdenProperties(object1);
        oden.setName("Oden");
        arList.add(oden);
        arTemp.setIw8ArAsierra12(oden);

        Iw8ArGalima amax = getAmaxProperties(object1);
        amax.setName("Amax");
        arList.add(amax);
        arTemp.setIw8ArGalima(amax);

        Iw8ArSierra552 grau = getGrauProperties(object1);
        grau.setName("Grau");
        arList.add(grau);
        arTemp.setIw8ArSierra552(grau);

        Iw8ArFalima fal = getFALProperties(object1);
        fal.setName("Fal");
        arList.add(fal);
        arTemp.setIw8ArFalima(fal);

        Iw8ArAnovember94 an94 = getAN94Properties(object1);
        an94.setName("AN-94");
        arList.add(an94);
        arTemp.setIw8ArAnovember94(an94);

        Iw8ArKilo433 kilo = getKiloProperties(object1);
        kilo.setName("Kilo");
        arList.add(kilo);
        arTemp.setIw8ArKilo433(kilo);

        Iw8ArScharlie scar = getScarProperties(object1);
        scar.setName("Scar");
        arList.add(scar);
        arTemp.setIw8ArScharlie(scar);

        return arTemp;
    }

    public Iw8ArTango21 getRamProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_ar_tango21");
        return mapper.readValue(object1.toString(), Iw8ArTango21.class);
    }

    public Iw8ArMike4 getM4Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_ar_mike4");
        return mapper.readValue(object1.toString(), Iw8ArMike4.class);
    }

    public Iw8ArValpha getValProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_ar_valpha");
        return mapper.readValue(object1.toString(), Iw8ArValpha.class);
    }

    public Iw8ArFalpha getFR556Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_ar_falpha");
        return mapper.readValue(object1.toString(), Iw8ArFalpha.class);
    }

    public Iw8ArMcharlie getM13Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_ar_mcharlie");
        return mapper.readValue(object1.toString(), Iw8ArMcharlie.class);
    }

    public Iw8ArAkilo47 getAK47Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_ar_akilo47");
        return mapper.readValue(object1.toString(), Iw8ArAkilo47.class);
    }

    public Iw8ArAsierra12 getOdenProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_ar_asierra12");
        return mapper.readValue(object1.toString(), Iw8ArAsierra12.class);
    }

    public Iw8ArGalima getAmaxProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_ar_galima");
        return mapper.readValue(object1.toString(), Iw8ArGalima.class);
    }


    public Iw8ArSierra552 getGrauProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_ar_sierra552");
        return mapper.readValue(object1.toString(), Iw8ArSierra552.class);
    }


    public Iw8ArFalima getFALProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_ar_falima");
        return mapper.readValue(object1.toString(), Iw8ArFalima.class);
    }

    public Iw8ArAnovember94 getAN94Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_ar_anovember94");
        return mapper.readValue(object1.toString(), Iw8ArAnovember94.class);
    }

    public Iw8ArKilo433 getKiloProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_ar_kilo433");
        return mapper.readValue(object1.toString(), Iw8ArKilo433.class);
    }

    public Iw8ArScharlie getScarProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_ar_scharlie");
        return mapper.readValue(object1.toString(), Iw8ArScharlie.class);
    }

}
