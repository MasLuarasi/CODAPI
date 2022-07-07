package com.example.codapi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UILifetimeStats
{

    @FXML
    private Label lifetimeLabel,
//            gridBestKDLabel, gridMostDeathsLabel, gridWLRatioLabel, gridLossesLabel,
//            gridAccuracyLabel, gridGamesPlayedLabel, gridLongestKSLabel, gridMostKillsLabel, gridWinsLabel,
//            gridKillsLabel, gridTimeLabel, gridDeathsLabel, gridKDLabel,
            gridKDVal, gridDeathsVal, gridTimeVal, gridKillsVal, gridWinsVal, gridMostKillsVal, gridLongestKSVal,
            gridGamesPlayedVal, gridAccuracyVal, gridLossesVal, gridWLRatioVal, gridMostDeathsVal, gridBestKDVal;

    private final All all;

    public UILifetimeStats(Lifetime lifetime)
    {
        this.all = lifetime.getAll();
    }

    public void showLifetimeData()
    {
        gridTimeVal.setText(all.getTimePlayedTotal().toString());
        gridGamesPlayedVal.setText(all.getTotalGamesPlayed().toString());
        gridAccuracyVal.setText(all.getAccuracy().toString());
        gridKillsVal.setText(all.getKills().toString());
        gridDeathsVal.setText(all.getDeaths().toString());
        gridKDVal.setText(all.getKdRatio().toString());
        gridWinsVal.setText(all.getWins().toString());
        gridLossesVal.setText(all.getLosses().toString());
        gridWLRatioVal.setText(all.getWlRatio().toString());
        gridMostKillsVal.setText(all.getRecordKillsInAMatch().toString());
        gridMostDeathsVal.setText(all.getRecordDeathsInAMatch().toString());
        gridBestKDVal.setText(all.getBestKD().toString());
        gridLongestKSVal.setText(all.getRecordKillStreak().toString());
    }

}
