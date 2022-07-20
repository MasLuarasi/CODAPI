package com.example.codapi;

import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;

public class UIModeStats
{
    @FXML
    ScrollPane scrollPane;

    @FXML
    GridPane gridPane;

    private Lifetime lifetime;

    public void setLifetime(Lifetime l)
    {
        lifetime = l;
    }

    public void setFields()
    {
        scrollPane.setContent(gridPane);

    }

}
