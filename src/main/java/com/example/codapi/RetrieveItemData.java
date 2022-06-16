package com.example.codapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONObject;

public class RetrieveItemData
{

    public ItemData getItemDataProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("itemData");
        ItemData idTemp = new ItemData();

        RetrieveAR rar = new RetrieveAR();

        WeaponAssaultRifle ar = rar.getARProperties(object1);
        //similar format for other weapon classes

        idTemp.setWeaponAssaultRifle(ar);
        //similar format for other weapon classes

        return idTemp;
    }


}

