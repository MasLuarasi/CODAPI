package com.example.codapi;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.SerializerProvider;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URI;
import java.util.List;

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
        evaluateData(responseBody);
    }


    public void evaluateData(String data) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
//        String s = "{\"title\":\"mw\",\"platform\":\"uno\",\"username\":\"General Kenobi#7520759\",\"type\":\"mp\",\"level\":122,\"maxLevel\":1,\"levelXpRemainder\":13306,\"levelXpGained\":29594,\"prestige\":0,\"prestigeId\":0,\"maxPrestige\":0,\"totalXp\":2682515,\"paragonRank\":0,\"paragonId\":0,\"s\":1,\"p\":1}";
        Iw8ArAnovember94 arAnovember94 = mapper.readValue(data, Iw8ArAnovember94.class);
        Properties__32 p = mapper.readValue(data, Properties__32.class);
        System.out.println(p.getAccuracy());
//        System.out.println(arAnovember94.getProperties().getAccuracy());
        System.out.println("Done");
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
//        weaponString = weaponString.substring(weaponString.indexOf("\"weapon"), weaponString.indexOf("scorestreakData"));
//        weaponString = weaponString.substring(0, weaponString.indexOf("\"tacticals")) +
//                       weaponString.substring(weaponString.indexOf("\"weapon_lmg"), weaponString.indexOf("\"supers")) +
//                       weaponString.substring(weaponString.indexOf("\"weapon_pistol"));//Modify the HTTP response string to only include the weapon classes
//        weaponString = weaponString.substring(67,195);
//        weaponString = weaponString.replaceAll("\"", "");//Get rid of quotes
//        weaponString = weaponString.replaceAll("properties:\\{", "");//Get rid of the properties bracket
//        weaponString = weaponString.replaceAll("iw", "\n\tiw");//New line and indent each weapon. Temp formatting
//        weaponString = weaponString.replaceAll("weapon", "\nweapon");//New line each class. Temp formatting
//        weaponString = weaponString.replaceAll("\\}}", "\\}");//Remove excess  closing brackets
//        weaponString = weaponString.replaceAll("\\}}}", "\\}}");//Remove excess closing brackets

/*
    protected void getLifetimeStats(String lifetimeString)
    {
        LifetimeStats lifetimeStats = new LifetimeStats();//Create lifetimeStats to represent the user
        lifetimeString = lifetimeString.substring(lifetimeString.indexOf("\"recordLongest"), lifetimeString.indexOf("mode")-4);
        lifetimeString = lifetimeString.replaceAll("\"", "");//Modify HTTP response to only include lifetime stats
                                                                             //and get rid of quotation marks.
        String[] k = lifetimeString.split(",");//Each lifetime stat and its value are split into String array
        long startTime = System.currentTimeMillis();
        for (String s : k)
        {
            if (s.contains("kills")) {lifetimeStats.setKills(getVal(s));}
            else if (s.contains("deaths")) {lifetimeStats.setDeaths(getVal(s));}
            else if (s.contains("kdRatio")) {lifetimeStats.setKdRatio(getVal(s));}
            else if (s.contains("accuracy")) {lifetimeStats.setAccuracy(getVal(s));}
            else if (s.contains("gamesPlayed")) {lifetimeStats.setGamesPlayed(getVal(s));}
            else if (s.contains("winLossRatio")) {lifetimeStats.setWlRatio(getVal(s));}
            else if (s.contains("LongestWinStreak")) {lifetimeStats.setLongestWinStreak(getVal(s));}
            else if (s.contains("currentWinStreak")) {lifetimeStats.setCurrentWinStreak(getVal(s));}
            else if (s.contains("KillStreak")) {lifetimeStats.setLongestKillStreak(getVal(s));}
            else if (s.contains("bestKills")) {lifetimeStats.setMostKills(getVal(s));}
            else if (s.contains("bestKD")) {lifetimeStats.setBestKD(getVal(s));}
            else if (s.contains("timePlayed")) {lifetimeStats.setTimePlayed(getVal(s));}
        }//Pick out the fields we want and assign them to the variables in the class.
        System.out.println(lifetimeStats);
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }

 */

//    List<LifetimeStats> o = mapper.reader()
//            .forType(new TypeReference<List<LifetimeStats>>() {})
//            .readValue(data);


