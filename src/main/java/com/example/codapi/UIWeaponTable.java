package com.example.codapi;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.Collections;

public class UIWeaponTable {

    @FXML
    private Label headerText;

    @FXML
    private TableView<Object> tableView;

    @FXML
    private TableColumn<Object, String> weaponName;

    @FXML
    private TableColumn<Object, Integer> kills, deaths, shots, hits, headshots;

    @FXML
    private TableColumn<Object, Double> kdRatio, accuracy;

    @FXML
    private Button arButton, smgButton, lmgButton, shotgunButton, marksmanButton, sniperButton, pistolButton, launcherButton, allWeaponButton;

    private ArrayList<Object> arList, smgList, lmgList, shotgunList, marksmanList, sniperList, pistolList, launcherList, allList;

    public UIWeaponTable(){}

    public void showARData() {
        headerText.setText("Assault Rifle Data");
        assignAndClick(arList, arButton);
    }

    public void showSMGData() {
        headerText.setText("SMG Data");
        assignAndClick(smgList, smgButton);
    }

    public void showLMGData() {
        headerText.setText("LMG Data");
        assignAndClick(lmgList, lmgButton);
    }

    public void showShotgunData() {
        headerText.setText("Shotgun Data");
        assignAndClick(shotgunList, shotgunButton);
    }

    public void showMarksmanData() {
        headerText.setText("Marksman Rifle Data");
        assignAndClick(marksmanList, marksmanButton);
    }

    public void showSniperData() {
        headerText.setText("Sniper Rifle Data");
        assignAndClick(sniperList, sniperButton);
    }

    public void showPistolData() {
        headerText.setText("Pistol Data");
        assignAndClick(pistolList, pistolButton);
    }

    public void showLauncherData() {
        headerText.setText("Launcher Data");
        assignAndClick(launcherList, launcherButton);
    }

    public void showAllData() {
        headerText.setText("All Weapon Data");
        assignAndClick(allList, allWeaponButton);
    }

    /**
     * Call the assign data function with the appropriate array list and change the appropriate button
     *
     * @param a Weapon class array list
     * @param b Weapon class button that needs to have its opacity changed
     */
    public void assignAndClick(ArrayList<Object> a, Button b) {
        assignData(a);
        b.setOpacity(.5);
    }

    /**
     * Function to display the appropriate data on the tableView part of the application
     *
     * @param list Weapon class list
     */
    public void assignData(ArrayList<Object> list) {
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
    public void makeSolidButtons() {
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

}
//        System.out.println("Click");
//                FxmlLoader object = new FxmlLoader();
//                Pane view = object.getPage("test");
//                mainPane.setCenter(view);

//General Kenobi#7520759

//    long startTime = System.currentTimeMillis();
//            long endTime = System.currentTimeMillis();
//            System.out.println("That took " + (endTime - startTime) + " milliseconds");

