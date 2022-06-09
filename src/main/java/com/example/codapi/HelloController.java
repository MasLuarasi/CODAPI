package com.example.codapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URI;


public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField inputName;

    @FXML
    private Button submit;

    private HttpResponse<String> response;

    private String responseBody;

    private String username;

    @FXML
    protected void onSubmitButtonClick() throws IOException, InterruptedException {
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
        response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        responseBody = response.body();
        getLifetimeStats(responseBody);
    }

    protected void getLifetimeStats(String lifetimeString)
    {
        LifetimeStats lifetimeStats = new LifetimeStats();
        lifetimeString = lifetimeString.substring(lifetimeString.indexOf("\"recordLongest"), lifetimeString.indexOf("mode")-4);
        lifetimeString = lifetimeString.replaceAll("\"", "");
        String[] k = lifetimeString.split(",");
        long startTime = System.currentTimeMillis();
        for (String s : k)
        {
            if (s.contains("kills"))
            {
                lifetimeStats.setKills(getVal(s));
            }
            else if (s.contains("deaths"))
            {
                lifetimeStats.setDeaths(getVal(s));
            }
            else if (s.contains("kdRatio"))
            {
                lifetimeStats.setKdRatio(getVal(s));
            }
            else if (s.contains("accuracy"))
            {
                lifetimeStats.setAccuracy(getVal(s));
            }
            else if (s.contains("gamesPlayed"))
            {
                lifetimeStats.setGamesPlayed(getVal(s));
            }
            else if (s.contains("winLossRatio"))
            {
                lifetimeStats.setWlRatio(getVal(s));
            }
            else if (s.contains("LongestWinStreak"))
            {
                lifetimeStats.setLongestWinStreak(getVal(s));
            }
            else if (s.contains("currentWinStreak"))
            {
                lifetimeStats.setCurrentWinStreak(getVal(s));
            }
            else if (s.contains("KillStreak"))
            {
                lifetimeStats.setLongestKillStreak(getVal(s));
            }
            else if (s.contains("bestKills"))
            {
                lifetimeStats.setMostKills(getVal(s));
            }
            else if (s.contains("bestKD"))
            {
                lifetimeStats.setBestKD(getVal(s));
            }
            else if (s.contains("timePlayed"))
            {
                lifetimeStats.setTimePlayed(getVal(s));
            }
        }
        System.out.println(lifetimeStats);
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

    }

    public double getVal(String key)
    {
        return Float.parseFloat(key.substring(key.indexOf(":")+1));
    }
}

//                .uri(URI.create("https://call-of-duty-modern-warfare.p.rapidapi.com/multiplayer/"+username+"/acti"))
//                .method("GET", HttpRequest.BodyPublishers.noBody())
//ObjectMapper mapper = new ObjectMapper();
//    List<LifetimeStats> ls = mapper.reader()
//            .forType(new TypeReference<List<LifetimeStats>>() {})
//            .readValue(a);
//import com.fasterxml.jackson.core.type.TypeReference;
//        import com.fasterxml.jackson.databind.ObjectMapper;
//            System.out.println(s);
//            String[] v = s.split(":");
//            String key = v[0];
//            int val = Integer.parseInt(v[1]);
