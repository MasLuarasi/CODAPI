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
        RetrieveSMG rsmg = new RetrieveSMG();

        WeaponAssaultRifle ar = rar.getARProperties(object1);
        WeaponSmg smg = rsmg.getSMGProperties(object1);
        //similar format for other weapon classes

        idTemp.setWeaponAssaultRifle(ar);
        idTemp.setWeaponSmg(smg);
        //similar format for other weapon classes

        return idTemp;
    }


}

