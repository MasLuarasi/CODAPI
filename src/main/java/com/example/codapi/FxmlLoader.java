package com.example.codapi;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.net.URL;

public class FxmlLoader
{
    private Pane view;

    public Pane getPage(String fileName)
    {
        try
        {
            URL u = getClass().getResource("test.fxml");
            if (u == null)
            {
                throw new java.io.FileNotFoundException("FXML file cannot be found");
            }
            view = new FXMLLoader().load(u);
        }
        catch (Exception e)
        {
            System.out.println("No page " + fileName + ". Please check fxml loader");
        }
        return view;
    }
}
