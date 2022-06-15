package com.example.codapi;

//import com.fasterxml.jackson.core.JsonGenerator;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;

import org.json.*;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//import java.util.Map;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField inputName;

    @FXML
    private Button submit;

    private String username;

    private ObjectMapper mapper;

    private JSONObject object;

    @FXML
    protected void onSubmitButtonClick() throws IOException, InterruptedException
    {
//        username = inputName.getText().strip();
//        welcomeText.setVisible(false);
//        inputName.setVisible(false);
//        submit.setVisible(false);
//        username = username.replace(" ", "%20");
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .header("X-RapidAPI-Host", "call-of-duty-modern-warfare.p.rapidapi.com")
                .header("X-RapidAPI-Key", "4125e08ab5msh1e35e54946ee894p1de70djsn0b70aa45221f")
                .uri(URI.create("https://call-of-duty-modern-warfare.p.rapidapi.com/multiplayer/General%20Kenobi%237520759/acti"))
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = removeProperties(response.body());//Assign the HTTP response to a string. Remove Properties' field from it.
        evaluateData(responseBody);//Start working on it.
    }

    /**
     * Removing all the Properties' field from the response along with their corresponding '}'.
     * With this, we do not have to deal with 130+ Properties files.
     * @param data The HTTP response body as a string.
     * @return The modified response that can be mapped with the files we have in the directory.
     */
    public String removeProperties(String data)
    {
        data = data.replaceAll("\"properties\":\\{", "");
        data = data.replaceAll("}},", "\\},");
        data += '}';//Have to add an extra bracket at the end to make it valid.
        return data;
    }

    /**
     * Taking in the modified response body, we can now map the data to its corresponding class.
     * Even though there are a lot of classes, we will not be using all of them, but a decent amount still.
     * @param data The modified HTTP response body
     * @throws IOException JSON stuff
     */
    public void evaluateData(String data) throws IOException
    {
        object = new JSONObject(data);//Define the JSONObject global variable
        mapper = new ObjectMapper();//Define the ObjectMapper global variable we need to map the data to its class.
        Lifetime lifetime = getLifetimeProperties();
//        System.out.println(lifetime.getAll().printEssential());
        System.out.println(lifetime.getItemData().getWeaponAssaultRifle().getIw8ArTango21().getAccuracy());
    }

    /**
     * Assign the data that belongs to the Lifetime class.
     * @return Lifetime object that is linked to the All object/class
     * @throws JsonProcessingException JSON stuff
     */
    public Lifetime getLifetimeProperties() throws JsonProcessingException
    {
        JSONObject object1 = object.getJSONObject("lifetime");
        All all = getAllProperties(object1);
        ItemData itemData = getItemDataProperties(object1);
        Lifetime lTemp = new Lifetime();
        lTemp.setAll(all);
        lTemp.setItemData(itemData);
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
        JSONObject object1 = root.getJSONObject("all");
        return mapper.readValue(object1.toString(), All.class);
    }

    public ItemData getItemDataProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("itemData");
        ItemData idTemp = new ItemData();
        WeaponAssaultRifle ar = getARProperties(object1);

        idTemp.setWeaponAssaultRifle(ar);

        return idTemp;
    }

    public WeaponAssaultRifle getARProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("weapon_assault_rifle");
        WeaponAssaultRifle arTemp = new WeaponAssaultRifle();
        Iw8ArTango21 ram = getRamProperties(object1);

        arTemp.setIw8ArTango21(ram);

        return arTemp;
    }

    public Iw8ArTango21 getRamProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object1 = root.getJSONObject("iw8_ar_tango21");
        return mapper.readValue(object1.toString(), Iw8ArTango21.class);
    }



}