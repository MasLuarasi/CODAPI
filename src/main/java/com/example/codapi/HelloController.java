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

    private String responseBody;

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
        responseBody = response.body();//Assign the HTTP response to a string.
        responseBody = removeProperties(responseBody);//Remove the properties field and corresponding brackets from the response.
        evaluateData(responseBody);//Start working on it.
    }

    /**
     * Removing all the Properties field from the response along with their corresponding '}'.
     * With this, we do not have to deal with Properties1-130+.java files.
     * @param data The HTTP response body as a string.
     * @return The modified response that can be mapped with the files we have in the directory.
     */
    public String removeProperties(String data)
    {
        data = data.replaceAll("\"properties\":\\{", "");
        data = data.replaceAll("\\}\\},", "\\},");
        data += '}';//Have to add an extra bracket at the end to make it valid.
        return data;
    }

    /**
     * Taking in the modified response body, we can now map the data to its corresponding class.
     * Even though there are a lot of classes, we will not be using all of them, but a decent amount still.
     * @param data The modified HTTP response body
     * @throws IOException
     */
    public void evaluateData(String data) throws IOException
    {
        object = new JSONObject(data);//Define the JSONObject global variable
        mapper = new ObjectMapper();//Define the ObjectMapper global variable we need to map the data to its class.
        Lifetime lifetime = getLifetimeProperties();
        System.out.println(lifetime.getAll().printEssential());
    }

    /**
     * Assign the data that belongs to the Lifetime class.
     * @return Lifetime object that is linked to the All object/class
     * @throws JsonProcessingException
     */
    public Lifetime getLifetimeProperties() throws JsonProcessingException
    {
        JSONObject object1 = object.getJSONObject("lifetime");
        All all = getAllProperties(object1);
        Lifetime lTemp = new Lifetime();
        lTemp.setAll(all);
        return lTemp;
    }

    /**
     * Map the data for the All object to its class and corresponding variables.
     * @param root JSONObject. All is located within the Lifetime field, so we need to start from there, and then extract "all"
     * @return All object with all of its data set.
     * @throws JsonProcessingException
     */
    public All getAllProperties(JSONObject root) throws JsonProcessingException
    {
        JSONObject object2 = root.getJSONObject("all");
        All aTemp = mapper.readValue(object2.toString(), All.class);
        return aTemp;
    }

}