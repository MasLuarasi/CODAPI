package com.example.codapi;

import org.json.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import javax.net.ssl.SSLContext;
import java.util.ArrayList;
import java.util.Collections;


public class HelloController {

    @FXML
    private BorderPane mainPane;

    @FXML
    private Label prompt;

    @FXML
    private Label headerText;

    @FXML
    private TextField inputName;

    @FXML
    private TableView<Object> tableView;

    @FXML
    private TableColumn<Object, String> weaponName;

    @FXML
    private TableColumn<Object, Integer> kills, deaths, shots, hits, headshots;

    @FXML
    private TableColumn<Object, Double> kdRatio, accuracy;

    @FXML
    private Button submitButton, arButton, smgButton, lmgButton, shotgunButton, marksmanButton, sniperButton, pistolButton, launcherButton, allWeaponButton;

    private JSONObject object;

    private Lifetime lifetime;

    private ArrayList<Object> arList, smgList, lmgList, shotgunList, marksmanList, sniperList, pistolList, launcherList, allList;

    @FXML
    protected void onSubmitButtonClick() throws IOException, InterruptedException
    {
        long startTime = System.currentTimeMillis();
        submitButton.setDisable(true);
        enableSubmitButton();
        String username = inputName.getText().strip();//Get username input
        username = username.replace("#", "%23");//Replace the # with %23 because HTTP Request says so
        username = username.replace(" ", "%20");//Request replaces spaces with %20
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .header("X-RapidAPI-Host", "call-of-duty-modern-warfare.p.rapidapi.com")
                .header("X-RapidAPI-Key", "4125e08ab5msh1e35e54946ee894p1de70djsn0b70aa45221f")
                .uri(URI.create("https://call-of-duty-modern-warfare.p.rapidapi.com/multiplayer/"+username+"/acti"))
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = removeProperties(response.body());//Assign the HTTP response to a string. Remove Properties' field from it.
        try
        {
            evaluateData(responseBody);
            showAllData();
            long endTime = System.currentTimeMillis();
            System.out.println("That took " + (endTime - startTime) + " milliseconds");
        }
        catch (JSONException e)
        {
            if (responseBody.contains("not allowed"))
            {
                System.out.println("User does not allow their info to be shared with third party apps");
            }
            else
            {
                System.out.println("Invalid Activision Username");
            }
        }

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
     * Able to assign the lifetime object. Also assigning the weapon classes list to be used when their
     * respective buttons are clicked on the front end.
     * @param data The modified HTTP response body
     * @throws IOException JSON stuff
     */
    public void evaluateData(String data) throws IOException
    {
        object = new JSONObject(data);//Define the JSONObject global variable
        lifetime = retLifetime();//Assign the lifetime object
        arList = lifetime.getItemData().getWeaponAssaultRifle().getArList();//Assign weapon class lists respectively
        smgList = lifetime.getItemData().getWeaponSmg().getSmgList();
        lmgList = lifetime.getItemData().getWeaponLmg().getLMGList();
        shotgunList = lifetime.getItemData().getWeaponShotgun().getShotgunList();
        marksmanList = lifetime.getItemData().getWeaponMarksman().getMarksmanList();
        sniperList = lifetime.getItemData().getWeaponSniper().getSniperList();
        pistolList = lifetime.getItemData().getWeaponPistol().getPistolList();
        launcherList = lifetime.getItemData().getWeaponLauncher().getLauncherList();
        allList = new ArrayList<>();
        Collections.addAll(allList, arList, smgList, lmgList, shotgunList, marksmanList, sniperList, pistolList, launcherList);//Add all weapon class lists to the complete one
        ArrayList<Object> oList;
        ArrayList<Object> temp = new ArrayList<>();
        for (Object o : allList)
        {
            oList = (ArrayList<Object>) o;
            temp.addAll(oList);
        }
        allList = temp;
        System.out.println("Done");
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

    /**
     * Display weapon class data
     */

    public void showARData()
    {
        headerText.setText("Assault Rifle Data");
        assignAndClick(arList, arButton);
    }

    public void showSMGData()
    {
        headerText.setText("SMG Data");
        assignAndClick(smgList, smgButton);
    }

    public void showLMGData()
    {
        headerText.setText("LMG Data");
        assignAndClick(lmgList, lmgButton);
    }

    public void showShotgunData()
    {
        headerText.setText("Shotgun Data");
        assignAndClick(shotgunList, shotgunButton);
    }

    public void showMarksmanData()
    {
        headerText.setText("Marksman Rifle Data");
        assignAndClick(marksmanList, marksmanButton);
    }

    public void showSniperData()
    {
        headerText.setText("Sniper Rifle Data");
        assignAndClick(sniperList, sniperButton);
    }

    public void showPistolData()
    {
        headerText.setText("Pistol Data");
        assignAndClick(pistolList, pistolButton);
    }

    public void showLauncherData()
    {
        headerText.setText("Launcher Data");
        assignAndClick(launcherList, launcherButton);
    }

    public void showAllData()
    {
        headerText.setText("All Weapon Data");
        assignAndClick(allList, allWeaponButton);
    }

    /**
     * Call the assign data function with the appropriate array list and change the appropriate button
     * @param a Weapon class array list
     * @param b Weapon class button that needs to have its opacity changed
     */
    public void assignAndClick(ArrayList<Object> a, Button b)
    {
        assignData(a);
        b.setOpacity(.5);
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
        pistolButton.setOpacity(1);
        launcherButton.setOpacity(1);
        allWeaponButton.setOpacity(1);
    }

    /**
     * If the text in the input field is changed, enable the submit button again.
     */
    public void enableSubmitButton()
    {
        inputName.textProperty().addListener((observable, oldValue, newValue) ->
                submitButton.setDisable(false));
    }

}

//        System.out.println("Click");
//                FxmlLoader object = new FxmlLoader();
//                Pane view = object.getPage("test");
//                mainPane.setCenter(view);

//General Kenobi#7520759
