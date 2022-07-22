package com.example.codapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

public class RetrieveMode
{
    private ObjectMapper mapper;

    public Mode getModeProperties(JSONObject root) throws JsonProcessingException
    {
        mapper = new ObjectMapper();
        JSONObject object1 = root.getJSONObject("mode");
        Mode modeTemp = new Mode();

        modeTemp.setWar(getWarProperties(object1));
        modeTemp.setDom(getDomProperties(object1));
        modeTemp.setKoth(getKothProperties(object1));
        modeTemp.setConf(getConfProperties(object1));
        modeTemp.setGrnd(getGrndProperties(object1));
        modeTemp.setGun(getGunProperties(object1));
        modeTemp.setSd(getSDProperties(object1));
        modeTemp.setHq(getHQProperties(object1));
        modeTemp.setCyber(getCyberProperties(object1));

        return modeTemp;
    }

    public War getWarProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("war");
        return mapper.readValue(object1.toString(), War.class);
    }

    public Dom getDomProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("dom");
        return mapper.readValue(object1.toString(), Dom.class);
    }

    public Koth getKothProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("koth");
        return mapper.readValue(object1.toString(), Koth.class);
    }

    public Conf getConfProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("conf");
        return mapper.readValue(object1.toString(), Conf.class);
    }

    public Grnd getGrndProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("grnd");
        return mapper.readValue(object1.toString(), Grnd.class);
    }

    public Gun getGunProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("gun");
        return mapper.readValue(object1.toString(), Gun.class);
    }

    public Sd getSDProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("sd");
        return mapper.readValue(object1.toString(), Sd.class);
    }

    public Hq getHQProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("hq");
        return mapper.readValue(object1.toString(), Hq.class);
    }

    public Cyber getCyberProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("cyber");
        return mapper.readValue(object1.toString(), Cyber.class);
    }

    /*
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
     */
}
