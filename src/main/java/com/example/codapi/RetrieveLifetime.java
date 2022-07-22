package com.example.codapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

public class RetrieveLifetime
{
    JSONObject object;

    public RetrieveLifetime(JSONObject o)
    {
        this.object = o;
    }

    /**
     * Assign the data that belongs to the Lifetime class.
     * @return Lifetime object that is linked to the All object/class
     * @throws JsonProcessingException JSON stuff
     */
    public Lifetime getLifetimeProperties() throws JsonProcessingException
    {
        Lifetime lTemp = new Lifetime();
        JSONObject object1 = object.getJSONObject("lifetime");

        All all = getAllProperties(object1);
        lTemp.setAll(all);

        RetrieveItemData rid = new RetrieveItemData();
        ItemData itemData = rid.getItemDataProperties(object1);
        lTemp.setItemData(itemData);

        RetrieveMode rmode = new RetrieveMode();
        Mode mode = rmode.getModeProperties(object1);
        lTemp.setMode(mode);

        return lTemp;
    }

    /**
     * Map the data for the All object to its class and corresponding variables.
     * @param root JSONObject. All is located within the Lifetime field, so we need to start from there, and then extract "all"
     * @return All object with all of its data set.
     * @throws JsonProcessingException JSON stuff
     */
    public All getAllProperties(JSONObject root) throws JsonProcessingException
    {
        ObjectMapper mapper = new ObjectMapper();
        JSONObject object1 = root.getJSONObject("all");
        return mapper.readValue(object1.toString(), All.class);
    }

}
