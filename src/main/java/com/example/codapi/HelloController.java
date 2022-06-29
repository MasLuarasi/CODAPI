package com.example.codapi;

//import com.fasterxml.jackson.core.JsonGenerator;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import org.json.*;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.ArrayList;

import javafx.fxml.FXML;

public class HelloController {

    @FXML
    private Label prompt;

    @FXML
    private TextField inputName;

    @FXML
    private Button submitButton;

    @FXML
    private BorderPane mainPane;

    @FXML
    private TableView<Object> tableView;

    @FXML
    private Label headerText;

    @FXML
    private TableColumn<Object, String> weaponName;

    @FXML
    private TableColumn<Object, Integer> kills, deaths, shots, hits, headshots;

    @FXML
    private TableColumn<Object, Double> kdRatio, accuracy;

    @FXML
    private Button arButton, smgButton, lmgButton, shotgunButton, marksmanButton, sniperButton, launcherButton, pistolButton, allWeaponButton;

    private JSONObject object;

    private Lifetime lifetime;

//    public HelloController() throws IOException, InterruptedException
//    {
//        HttpRequest request = HttpRequest.newBuilder()
//                .GET()
//                .header("accept", "application/json")
//                .header("X-RapidAPI-Host", "call-of-duty-modern-warfare.p.rapidapi.com")
//                .header("X-RapidAPI-Key", "4125e08ab5msh1e35e54946ee894p1de70djsn0b70aa45221f")
//                .uri(URI.create("https://call-of-duty-modern-warfare.p.rapidapi.com/multiplayer/General%20Kenobi%237520759/acti"))
//                .build();
//        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        String responseBody = removeProperties(response.body());//Assign the HTTP response to a string. Remove Properties' field from it.
//        evaluateData(responseBody);//Start working on it.
//    }


    @FXML
    protected void onSubmitButtonClick() throws IOException, InterruptedException
    {
        String username = inputName.getText().strip();//Get username input
        username = username.replace("#", "%23");//Replace the # with %23 because HTTP Request says so
        username = username.replace(" ", "%20");//Request replaces spaces with %20
        //General Kenobi#7520759
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .header("X-RapidAPI-Host", "call-of-duty-modern-warfare.p.rapidapi.com")
                .header("X-RapidAPI-Key", "4125e08ab5msh1e35e54946ee894p1de70djsn0b70aa45221f")
                .uri(URI.create("https://call-of-duty-modern-warfare.p.rapidapi.com/multiplayer/"+username+"/acti"))
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
        lifetime = retLifetime();
    }

    /**
     * Creating a lifetime object which would have all the data needed for presenting on the application interface
     * @return Lifetime object
     * @throws JsonProcessingException JSON stuff
     */
    public Lifetime retLifetime() throws JsonProcessingException
    {
        RetrieveLifetime rl = new RetrieveLifetime(object);
        return rl.getLifetimeProperties();
    }

    public void showARData()
    {
        headerText.setText("Assault Rifle Data");
        ArrayList<Object> list = lifetime.getItemData().getWeaponAssaultRifle().getArList();
        assignData(list);
        arButton.setOpacity(.6);
    }

    public void showSMGData()
    {
        headerText.setText("SMG Data");
        ArrayList<Object> list = lifetime.getItemData().getWeaponSmg().getSmgList();
        assignData(list);
        smgButton.setOpacity(.6);
    }

    public void showLMGData()
    {
        headerText.setText("LMG Data");
        ArrayList<Object> list = lifetime.getItemData().getWeaponLmg().getLMGList();
        assignData(list);
        lmgButton.setOpacity(.6);
    }

    public void showShotgunData()
    {
        headerText.setText("Shotgun Data");
        ArrayList<Object> list = lifetime.getItemData().getWeaponShotgun().getShotgunList();
        assignData(list);
        shotgunButton.setOpacity(.6);
    }

    public void showMarksmanData()
    {
        headerText.setText("Marksman Rifle Data");
        ArrayList<Object> list = lifetime.getItemData().getWeaponMarksman().getMarksmanList();
        assignData(list);
        marksmanButton.setOpacity(.6);
    }

    public void showSniperData()
    {
        headerText.setText("Sniper Rifle Data");
        ArrayList<Object> list = lifetime.getItemData().getWeaponSniper().getSniperList();
        assignData(list);
        sniperButton.setOpacity(.6);
    }

    public void showPistolData()
    {
        headerText.setText("Pistol Data");
        ArrayList<Object> list = lifetime.getItemData().getWeaponPistol().getPistolList();
        assignData(list);
        pistolButton.setOpacity(.6);
    }

    public void showLauncherData()
    {
        headerText.setText("Launcher Data");
        ArrayList<Object> list = lifetime.getItemData().getWeaponLauncher().getLauncherList();
        assignData(list);
        launcherButton.setOpacity(.6);
    }

    public void showAllData()
    {
        headerText.setText("All Weapon Data");
        ArrayList<Object> list = lifetime.getItemData().getWeaponLauncher().getLauncherList();
        assignData(list);
        allWeaponButton.setOpacity(.6);
    }

    /**
     * Function to display the appropriate data on the tableView part of the application
     * @param list Weapon class list
     */
    public void assignData(ArrayList<Object> list)
    {
        final ObservableList<Object> data = FXCollections.observableArrayList();
        data.addAll(list);//Add the weapon class list containing the object for each weapon to the observable list. Set each column to the variable in the list.
        weaponName.setCellValueFactory(new PropertyValueFactory<>("name"));
        weaponName.setStyle("-fx-font-weight:bold");
        kills.setCellValueFactory(new PropertyValueFactory<>("kills"));
        deaths.setCellValueFactory(new PropertyValueFactory<>("deaths"));
        kdRatio.setCellValueFactory(new PropertyValueFactory<>("kdRatio"));
        shots.setCellValueFactory(new PropertyValueFactory<>("shots"));
        hits.setCellValueFactory(new PropertyValueFactory<>("hits"));
        accuracy.setCellValueFactory(new PropertyValueFactory<>("accuracy"));
        headshots.setCellValueFactory(new PropertyValueFactory<>("headshots"));
        tableView.setItems(data);
        tableView.setStyle("-fx-font-size:17;");
        makeSolidButtons();
    }

    /**
     * Change the opacity of all the weapon class button back to one.
     */
    public void makeSolidButtons()
    {
        arButton.setOpacity(1);
        smgButton.setOpacity(1);
        lmgButton.setOpacity(1);
        shotgunButton.setOpacity(1);
        marksmanButton.setOpacity(1);
        sniperButton.setOpacity(1);
        launcherButton.setOpacity(1);
        pistolButton.setOpacity(1);
    }

}
//long startTime = System.currentTimeMillis();
//long endTime = System.currentTimeMillis();
//System.out.println("That took " + (endTime - startTime) + " milliseconds");


//        System.out.println("Click");
//                FxmlLoader object = new FxmlLoader();
//                Pane view = object.getPage("test");
//                mainPane.setCenter(view);
