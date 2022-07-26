package com.example.codapi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;

public class UIModeStats {
    @FXML
    private ScrollPane scrollPane;

    @FXML
    private GridPane gridPane;

    @FXML
    private Label tdmKills, tdmDeaths, tdmKD, tdmScore, tdmTime, tdmAssists,
            domKills, domDeaths, domKD, domScore, domTime, domCaptures,
            hpKills, hpDeaths, hpKD, hpScore, hpTime, hpOTime,
            confKills, confDeaths, confKD, confScore, confTime, confConfirms,
            grindKills, grindDeaths, grindKD, grindScore, grindTime, grindConfirms,
            gunKills, gunDeaths, gunKD, gunScore, gunTime, gunSetbacks,
            sdKills, sdDeaths, sdKD, sdScore, sdTime, sdDefuses,
            hqKills, hqDeaths, hqKD, hqScore, hqTime, hqCaptures,
            cyberKills, cyberDeaths, cyberKD, cyberScore, cyberTime, cyberPlants;

    private Mode mode;

    public void setLifetime(Lifetime l) {
        mode = l.getMode();
    }

    public void setFields() {
        scrollPane.setContent(gridPane);
        double timeValue;

        tdmKills.setText("Kills: " + mode.getWar().getKills());
        tdmDeaths.setText("Deaths: " + mode.getWar().getDeaths());
        tdmKD.setText("KD: " + mode.getWar().getKdRatio());
        tdmScore.setText("Score: " + mode.getWar().getScore());
        timeValue = mode.getWar().getTimePlayed();
        tdmTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        tdmAssists.setText("Assists: " + mode.getWar().getAssists());

        domKills.setText("Kills: " + mode.getDom().getKills());
        domDeaths.setText("Deaths: " + mode.getDom().getDeaths());
        domKD.setText("KD: " + mode.getDom().getKdRatio());
        domScore.setText("Score: " + mode.getDom().getScore());
        timeValue = mode.getDom().getTimePlayed();
        domTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        domCaptures.setText("Captures: " + mode.getDom().getCaptures());

        hpKills.setText("Kills: " + mode.getKoth().getKills());
        hpDeaths.setText("Deaths: " + mode.getKoth().getDeaths());
        hpKD.setText("KD: " + mode.getKoth().getKdRatio());
        hpScore.setText("Score: " + mode.getKoth().getScore());
        timeValue = mode.getKoth().getTimePlayed();
        hpTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        timeValue = mode.getKoth().getObjTime();
        hpOTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");

        confKills.setText("Kills: " + mode.getConf().getKills());
        confDeaths.setText("Deaths: " + mode.getConf().getDeaths());
        confKD.setText("KD: " + mode.getConf().getKdRatio());
        confScore.setText("Score: " + mode.getConf().getScore());
        timeValue = mode.getConf().getTimePlayed();
        confTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        confConfirms.setText("Confirms: " + mode.getConf().getConfirms());

        grindKills.setText("Kills: " + mode.getGrnd().getKills());
        grindDeaths.setText("Deaths: " + mode.getGrnd().getDeaths());
        grindKD.setText("KD: " + mode.getGrnd().getKdRatio());
        grindScore.setText("Score: " + mode.getGrnd().getScore());
        timeValue = mode.getGrnd().getTimePlayed();
        grindTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        grindConfirms.setText("Confirms: " + mode.getGrnd().getDefends());

        gunKills.setText("Kills: " + mode.getGun().getKills());
        gunDeaths.setText("Deaths: " + mode.getGun().getDeaths());
        gunKD.setText("KD: " + mode.getGun().getKdRatio());
        gunScore.setText("Score: " + mode.getGun().getScore());
        timeValue = mode.getGun().getTimePlayed();
        gunTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        gunSetbacks.setText("Setbacks: " + mode.getGun().getSetBacks());

        sdKills.setText("Kills: " + mode.getSd().getKills());
        sdDeaths.setText("Deaths: " + mode.getSd().getDeaths());
        sdKD.setText("KD: " + mode.getSd().getKdRatio());
        sdScore.setText("Score: " + mode.getSd().getScore());
        timeValue = mode.getSd().getTimePlayed();
        sdTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        sdDefuses.setText("Defuses: " + mode.getSd().getDefuses());

        hqKills.setText("Kills: " + mode.getHq().getKills());
        hqDeaths.setText("Deaths: " + mode.getHq().getDeaths());
        hqKD.setText("KD: " + mode.getHq().getKdRatio());
        hqScore.setText("Score: " + mode.getHq().getScore());
        timeValue = mode.getHq().getTimePlayed();
        hqTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        hqCaptures.setText("Captures: " + mode.getHq().getCaptures());

        cyberKills.setText("Kills: " + mode.getCyber().getKills());
        cyberDeaths.setText("Deaths: " + mode.getCyber().getDeaths());
        cyberKD.setText("KD: " + mode.getCyber().getKdRatio());
        cyberScore.setText("Score: " + mode.getCyber().getScore());
        timeValue = mode.getCyber().getTimePlayed();
        cyberTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        cyberPlants.setText("Plants: " + mode.getCyber().getPlants());

    }

}

