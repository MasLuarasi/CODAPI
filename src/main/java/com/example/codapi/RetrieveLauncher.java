package com.example.codapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.util.ArrayList;

public class RetrieveLauncher
{
    private ObjectMapper mapper;

    public WeaponLauncher getLauncherProperties(JSONObject root) throws JsonProcessingException
    {
        mapper = new ObjectMapper();
        ArrayList<Object> launcherList = new ArrayList<>();
        JSONObject object1 = root.getJSONObject("weapon_launcher");
        WeaponLauncher launcherTemp = new WeaponLauncher();

        Iw8LaGromeo pila  = getPILAProperties(object1);
        pila.setName("PILA");
        launcherList.add(pila);
        launcherTemp.setIw8LaGromeo(pila);

        Iw8LaRpapa7 rpg  = getRPGProperties(object1);
        rpg.setName("RPG-7");
        launcherList.add(rpg);
        launcherTemp.setIw8LaRpapa7(rpg);

        Iw8LaJuliet joker  = getJokerProperties(object1);
        joker.setName("Joker");
        launcherList.add(joker);
        launcherTemp.setIw8LaJuliet(joker);

        Iw8LaKgolf strela  = getStrelaProperties(object1);
        strela.setName("Strela-P");
        launcherList.add(strela);
        launcherTemp.setIw8LaKgolf(strela);

        Iw8LaMike32 gl  = getGLProperties(object1);
        gl.setName("MGL-32");
        launcherList.add(gl);
        launcherTemp.setIw8LaMike32(gl);

        launcherTemp.setLauncherList(launcherList);
        return launcherTemp;
    }

    public Iw8LaGromeo getPILAProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_la_gromeo");
        return mapper.readValue(object1.toString(), Iw8LaGromeo.class);
    }

    public Iw8LaRpapa7 getRPGProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_la_rpapa7");
        return mapper.readValue(object1.toString(), Iw8LaRpapa7.class);
    }

    public Iw8LaJuliet getJokerProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_la_juliet");
        return mapper.readValue(object1.toString(), Iw8LaJuliet.class);
    }

    public Iw8LaKgolf getStrelaProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_la_kgolf");
        return mapper.readValue(object1.toString(), Iw8LaKgolf.class);
    }

    public Iw8LaMike32 getGLProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_la_mike32");
        return mapper.readValue(object1.toString(), Iw8LaMike32.class);
    }

}
