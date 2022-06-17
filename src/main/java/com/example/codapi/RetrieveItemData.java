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
        RetrieveShotgun rsh = new RetrieveShotgun();
        RetrieveMarksman rmr = new RetrieveMarksman();
        RetrieveSniper rsn = new RetrieveSniper();
        RetrieveLMG rlmg = new RetrieveLMG();

        WeaponAssaultRifle ar = rar.getARProperties(object1);
        WeaponSmg smg = rsmg.getSMGProperties(object1);
        WeaponShotgun shotgun = rsh.getShotgunProperties(object1);
        WeaponMarksman marksman = rmr.getMarksmanProperties(object1);
        WeaponSniper sniper = rsn.getSniperProperties(object1);
        WeaponLmg lmg = rlmg.getLMGProperties(object1);

        idTemp.setWeaponAssaultRifle(ar);
        idTemp.setWeaponSmg(smg);
        idTemp.setWeaponShotgun(shotgun);
        idTemp.setWeaponMarksman(marksman);
        idTemp.setWeaponSniper(sniper);
        idTemp.setWeaponLmg(lmg);

        return idTemp;
    }


}

