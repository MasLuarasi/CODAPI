package com.example.codapi;

import org.json.*;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HelloController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private TextField inputName;

    @FXML
    private Button submitButton, lifetimeButton, weaponButton;

    private Pane lifetimePane, weaponPane;

    private JSONObject object;

    private Lifetime lifetime;

    private UILifetimeStats uiLifetimeStats;

    private UIWeaponTable uiWeaponTable;

    private final ArrayList<ArrayList<Object>> weaponClassList;

    public HelloController() {weaponClassList = new ArrayList<>();}

    /**
     * Once the submit button is clicked, we will make a call to get the data for the user that was entered.
     * If the user is not found, then there will be an "Invalid Activision Username" text displayed.
     * If the user is found but has their profile set to private, there will be a message indicating that.
     * Otherwise, we will get an HTTP response and format it, map it to appropriate data and initiate the
     * frontend aspect of the project using helper functions below.
     */
    @FXML
    protected void onSubmitButtonClick() throws IOException, InterruptedException
    {
        submitButton.setDisable(true);
        enableSubmitButton();
        String username = inputName.getText().strip();//Get username input
        username = username.replace("#", "%23");//Replace the # with %23 because HTTP Request format
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
     */
    public void evaluateData(String data) throws IOException
    {
        object = new JSONObject(data);//Define the JSONObject global variable
        lifetime = retLifetime();//Assign the lifetime object
        ArrayList<Object> arList = lifetime.getItemData().getWeaponAssaultRifle().getArList();//Assign weapon class lists respectively
        ArrayList<Object> smgList = lifetime.getItemData().getWeaponSmg().getSmgList();
        ArrayList<Object> lmgList = lifetime.getItemData().getWeaponLmg().getLMGList();
        ArrayList<Object> shotgunList = lifetime.getItemData().getWeaponShotgun().getShotgunList();
        ArrayList<Object> marksmanList = lifetime.getItemData().getWeaponMarksman().getMarksmanList();
        ArrayList<Object> sniperList = lifetime.getItemData().getWeaponSniper().getSniperList();
        ArrayList<Object> pistolList = lifetime.getItemData().getWeaponPistol().getPistolList();
        ArrayList<Object> launcherList = lifetime.getItemData().getWeaponLauncher().getLauncherList();
        ArrayList<Object> allWeaponList = new ArrayList<>();//Array List containing each individual weapon object amongst every weapon class.
        Collections.addAll(weaponClassList, arList, smgList, lmgList, shotgunList, marksmanList, sniperList, pistolList, launcherList);//Add all weapon class lists to the complete one
        for (Collection<?> o : weaponClassList)//For each weapon class. arList, smgList etc.
        {
            allWeaponList.addAll(o);
        }
        weaponClassList.add(allWeaponList);//Add the Array List containing every weapon object.
        initializeLifetimePane();
        initializeWeaponPane();
        showLifetimePane();
    }

    /**
     * Initialize the LifetimeStats Pane once, so it can just be loaded each time the user wants to view it.
     */
    public void initializeLifetimePane() throws IOException
    {
        FXMLLoader loader1 = new FXMLLoader();
        loader1.setLocation(HelloApplication.class.getResource("LifetimeStats.fxml"));//Load Lifetime fxml
        lifetimePane = loader1.load();
        uiLifetimeStats = loader1.getController();
    }

    /**
     * Initialize the WeaponTable Pane once, so it can just be loaded each time the user wants to view it.
     */
    public void initializeWeaponPane() throws IOException
    {
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(HelloApplication.class.getResource("WeaponTable.fxml"));//Load WeaponTable fxml
        weaponPane = loader2.load();
        uiWeaponTable = loader2.getController();
    }

    /**
     * Method to display the LifetimeStats screen
     */
    public void showLifetimePane()
    {
//        System.out.println("Click");
        borderPane.setBottom(lifetimePane);
        uiLifetimeStats.setLifetime(lifetime);
        uiLifetimeStats.setFields();
        refocus();
    }

    /**
     * Method to display the WeaponTable screen
     */
    public void showWeaponPane()
    {
        System.out.println("Click");
        borderPane.setBottom(weaponPane);
        uiWeaponTable.setWeaponClassList(weaponClassList);
        refocus();
    }

    /**
     * Creating a lifetime object which would have all the data needed for presenting on the application interface
     * @return Lifetime object
     */
    public Lifetime retLifetime() throws JsonProcessingException
    {
        RetrieveLifetime rl = new RetrieveLifetime(object);
        return rl.getLifetimeProperties();
    }

    /**
     * If the text in the input field is changed, enable the submit button again.
     */
    public void enableSubmitButton()
    {
        inputName.textProperty().addListener((observable, oldValue, newValue) ->
                submitButton.setDisable(false));
    }

    /**
     * After loading a pane, the interactive elements of hello-view need to be refocused.
     */
    public void refocus()
    {
        inputName.requestFocus();
        submitButton.requestFocus();
        lifetimeButton.requestFocus();
        weaponButton.requestFocus();
    }

}

//General Kenobi#7520759

//    long startTime = System.currentTimeMillis();
//            long endTime = System.currentTimeMillis();
//            System.out.println("That took " + (endTime - startTime) + " milliseconds");

