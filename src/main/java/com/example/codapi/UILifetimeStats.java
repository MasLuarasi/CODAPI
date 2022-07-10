package com.example.codapi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UILifetimeStats
{

    @FXML
    private Label timePlayedVal, gamesPlayedVal, accuracyVal, kdVal, bestKDVal, mostDeathsVal, wlRatio,
            lossesVal, deathsVal, killsVal, winsVal, mostKillsVal, longestKSVal;

    private Lifetime lifetime;

    public void setLifetime(Lifetime l)
    {
        lifetime = l;
    }

    public void setFields()
    {
        timePlayedVal.setText(lifetime.getAll().getTimePlayedTotal().toString());
        gamesPlayedVal.setText(lifetime.getAll().getGamesPlayed().toString());
        accuracyVal.setText(lifetime.getAll().getAccuracy().toString());
        killsVal.setText(lifetime.getAll().getKills().toString());
        deathsVal.setText(lifetime.getAll().getDeaths().toString());
        kdVal.setText(lifetime.getAll().getKdRatio().toString());
        winsVal.setText(lifetime.getAll().getWins().toString());
        lossesVal.setText(lifetime.getAll().getLosses().toString());
        wlRatio.setText(lifetime.getAll().getWlRatio().toString());
        mostKillsVal.setText(lifetime.getAll().getRecordKillsInAMatch().toString());
        mostDeathsVal.setText(lifetime.getAll().getRecordDeathsInAMatch().toString());
        bestKDVal.setText(lifetime.getAll().getBestKD().toString());
        longestKSVal.setText(lifetime.getAll().getRecordKillStreak().toString());
    }

}
