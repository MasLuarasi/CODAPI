package com.example.codapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.util.ArrayList;

public class RetrieveSniper
{
    private ObjectMapper mapper;
    private ArrayList<Object> sniperList;

    public WeaponSniper getSniperProperties(JSONObject root) throws JsonProcessingException
    {
        mapper = new ObjectMapper();
        sniperList = new ArrayList<>();
        JSONObject object1 = root.getJSONObject("weapon_sniper");
        WeaponSniper sniperTemp = new WeaponSniper();

        Iw8SnAlpha50 ax50  = getAX50Properties(object1);
        ax50.setName("AX-50");
        sniperList.add(ax50);
        sniperTemp.setIw8SnAlpha50(ax50);

        Iw8SnHdromeo hdr  = getHDRProperties(object1);
        hdr.setName("HDR");
        sniperList.add(hdr);
        sniperTemp.setIw8SnHdromeo(hdr);

        Iw8SnDelta dragunov  = getDragunovProperties(object1);
        dragunov.setName("Dragunov");
        sniperList.add(dragunov);
        sniperTemp.setIw8SnDelta(dragunov);

        Iw8SnXmike109 rytec  = getRytecProperties(object1);
        rytec.setName("Rytec");
        sniperList.add(rytec);
        sniperTemp.setIw8SnXmike109(rytec);

        return sniperTemp;
    }

    public Iw8SnAlpha50 getAX50Properties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sn_alpha50");
        return mapper.readValue(object1.toString(), Iw8SnAlpha50.class);
    }

    public Iw8SnHdromeo getHDRProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sn_hdromeo");
        return mapper.readValue(object1.toString(), Iw8SnHdromeo.class);
    }

    public Iw8SnDelta getDragunovProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sn_delta");
        return mapper.readValue(object1.toString(), Iw8SnDelta.class);
    }

    public Iw8SnXmike109 getRytecProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_sn_xmike109");
        return mapper.readValue(object1.toString(), Iw8SnXmike109.class);
    }

}
