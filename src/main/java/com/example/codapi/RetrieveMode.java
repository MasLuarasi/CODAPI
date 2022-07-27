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
        modeTemp.setArena(getFightProperties(object1));
        modeTemp.setInfect(getInfectedProperties(object1));
        modeTemp.setArm(getGWProperties(object1));
        modeTemp.setHcWar(getHCwarProperties(object1));
        modeTemp.setHcDom(getHCdomProperties(object1));
        modeTemp.setHcConf(getHCconfProperties(object1));
        modeTemp.setHcSd(getHCsdProperties(object1));
        modeTemp.setHcHq(getHChqProperties(object1));
        modeTemp.setHcCyber(getHCcyberProperties(object1));

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

    public Arena getFightProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("arena");
        return mapper.readValue(object1.toString(), Arena.class);
    }

    public Infect getInfectedProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("infect");
        return mapper.readValue(object1.toString(), Infect.class);
    }

    public Arm getGWProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("arm");
        return mapper.readValue(object1.toString(), Arm.class);
    }

    public HcWar getHCwarProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("hc_war");
        return mapper.readValue(object1.toString(), HcWar.class);
    }

    public HcDom getHCdomProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("hc_dom");
        return mapper.readValue(object1.toString(), HcDom.class);
    }

    public HcConf getHCconfProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("hc_conf");
        return mapper.readValue(object1.toString(), HcConf.class);
    }

    public HcSd getHCsdProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("hc_sd");
        return mapper.readValue(object1.toString(), HcSd.class);
    }

    public HcHq getHChqProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("hc_hq");
        return mapper.readValue(object1.toString(), HcHq.class);
    }

    public HcCyber getHCcyberProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("hc_cyber");
        return mapper.readValue(object1.toString(), HcCyber.class);
    }

}
