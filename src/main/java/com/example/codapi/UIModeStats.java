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
    private Label
            tdmKills, tdmDeaths, tdmKD, tdmScore, tdmTime, tdmAssists,
            domKills, domDeaths, domKD, domScore, domTime, domCaptures,
            hpKills, hpDeaths, hpKD, hpScore, hpTime, hpOTime,
            confKills, confDeaths, confKD, confScore, confTime, confConfirms,
            grindKills, grindDeaths, grindKD, grindScore, grindTime, grindConfirms,
            gunKills, gunDeaths, gunKD, gunScore, gunTime, gunSetbacks,
            sdKills, sdDeaths, sdKD, sdScore, sdTime, sdDefuses,
            hqKills, hqDeaths, hqKD, hqScore, hqTime, hqCaptures,
            cyberKills, cyberDeaths, cyberKD, cyberScore, cyberTime, cyberPlants,
            fightKills, fightDeaths, fightKD, fightScore, fightTime, fightDamage,
            infectedKills, infectedDeaths, infectedKD, infectedScore, infectedTime, infectedInfected,
            gwKills, gwDeaths, gwKD, gwScore, gwTime, gwCaptures,
            HCtdmKills, HCtdmDeaths, HCtdmKD, HCtdmScore, HCtdmTime, HCtdmAssists,
            HCdomKills, HCdomDeaths, HCdomKD, HCdomScore, HCdomTime, HCdomCaptures,
            HCconfKills, HCconfDeaths, HCconfKD, HCconfScore, HCconfTime, HCconfConfirms,
            HCsdKills, HCsdDeaths, HCsdKD, HCsdScore, HCsdTime, HCsdDefuses,
            HChqKills, HChqDeaths, HChqKD, HChqScore, HChqTime, HChqCaptures,
            HCcyberKills, HCcyberDeaths, HCcyberKD, HCcyberScore, HCcyberTime, HCcyberPlants;

    private Mode mode;

    public void setLifetime(Lifetime l) {
        mode = l.getMode();
    }

    public void setFields() {
        scrollPane.setContent(gridPane);
        double timeValue;

        War war = mode.getWar();
        tdmKills.setText("Kills: " + war.getKills());
        tdmDeaths.setText("Deaths: " + war.getDeaths());
        tdmKD.setText("KD: " + war.getKdRatio());
        tdmScore.setText("Score: " + war.getScore());
        timeValue = war.getTimePlayed();
        tdmTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        tdmAssists.setText("Assists: " + war.getAssists());

        Dom dom = mode.getDom();
        domKills.setText("Kills: " + dom.getKills());
        domDeaths.setText("Deaths: " + dom.getDeaths());
        domKD.setText("KD: " + dom.getKdRatio());
        domScore.setText("Score: " + dom.getScore());
        timeValue = dom.getTimePlayed();
        domTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        domCaptures.setText("Captures: " + dom.getCaptures());

        Koth koth = mode.getKoth();
        hpKills.setText("Kills: " + koth.getKills());
        hpDeaths.setText("Deaths: " + koth.getDeaths());
        hpKD.setText("KD: " + koth.getKdRatio());
        hpScore.setText("Score: " + koth.getScore());
        timeValue = koth.getTimePlayed();
        hpTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        timeValue = koth.getObjTime();
        hpOTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");

        Conf conf = mode.getConf();
        confKills.setText("Kills: " + conf.getKills());
        confDeaths.setText("Deaths: " + conf.getDeaths());
        confKD.setText("KD: " + conf.getKdRatio());
        confScore.setText("Score: " + conf.getScore());
        timeValue = conf.getTimePlayed();
        confTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        confConfirms.setText("Confirms: " + conf.getConfirms());

        Grnd grnd = mode.getGrnd();
        grindKills.setText("Kills: " + grnd.getKills());
        grindDeaths.setText("Deaths: " + grnd.getDeaths());
        grindKD.setText("KD: " + grnd.getKdRatio());
        grindScore.setText("Score: " + grnd.getScore());
        timeValue = grnd.getTimePlayed();
        grindTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        grindConfirms.setText("Confirms: " + grnd.getDefends());

        Gun gun = mode.getGun();
        gunKills.setText("Kills: " + gun.getKills());
        gunDeaths.setText("Deaths: " + gun.getDeaths());
        gunKD.setText("KD: " + gun.getKdRatio());
        gunScore.setText("Score: " + gun.getScore());
        timeValue = gun.getTimePlayed();
        gunTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        gunSetbacks.setText("Setbacks: " + gun.getSetBacks());

        Sd sd = mode.getSd();
        sdKills.setText("Kills: " + sd.getKills());
        sdDeaths.setText("Deaths: " + sd.getDeaths());
        sdKD.setText("KD: " + sd.getKdRatio());
        sdScore.setText("Score: " + sd.getScore());
        timeValue = sd.getTimePlayed();
        sdTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        sdDefuses.setText("Defuses: " + sd.getDefuses());

        Hq hq = mode.getHq();
        hqKills.setText("Kills: " + hq.getKills());
        hqDeaths.setText("Deaths: " + hq.getDeaths());
        hqKD.setText("KD: " + hq.getKdRatio());
        hqScore.setText("Score: " + hq.getScore());
        timeValue = hq.getTimePlayed();
        hqTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        hqCaptures.setText("Captures: " + hq.getCaptures());

        Cyber cyber = mode.getCyber();
        cyberKills.setText("Kills: " + cyber.getKills());
        cyberDeaths.setText("Deaths: " + cyber.getDeaths());
        cyberKD.setText("KD: " + cyber.getKdRatio());
        cyberScore.setText("Score: " + cyber.getScore());
        timeValue = cyber.getTimePlayed();
        cyberTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        cyberPlants.setText("Plants: " + cyber.getPlants());

        Arena arena = mode.getArena();
        fightKills.setText("Kills: " + arena.getKills());
        fightDeaths.setText("Deaths: " + arena.getDeaths());
        fightKD.setText("KD: " + arena.getKdRatio());
        fightScore.setText("Score: " + arena.getScore());
        timeValue = arena.getTimePlayed();
        fightTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        fightDamage.setText("Damage: " + arena.getDamage());

        Infect infect = mode.getInfect();
        infectedKills.setText("Kills: " + infect.getKills());
        infectedDeaths.setText("Deaths: " + infect.getDeaths());
        infectedKD.setText("KD: " + infect.getKdRatio());
        infectedScore.setText("Score: " + infect.getScore());
        timeValue = infect.getTimePlayed();
        infectedTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        infectedInfected.setText("Infected: " + infect.getInfected());

        Arm arm = mode.getArm();
        gwKills.setText("Kills: " + arm.getKills());
        gwDeaths.setText("Deaths: " + arm.getDeaths());
        gwKD.setText("KD: " + arm.getKdRatio());
        gwScore.setText("Score: " + arm.getScore());
        timeValue = arm.getTimePlayed();
        gwTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        gwCaptures.setText("Captures: " + arm.getCaptures());

        HcWar hcWar = mode.getHcWar();
        HCtdmKills.setText("Kills: " + hcWar.getKills());
        HCtdmDeaths.setText("Deaths: " + hcWar.getDeaths());
        HCtdmKD.setText("KD: " + hcWar.getKdRatio());
        HCtdmScore.setText("Score: " + hcWar.getScore());
        timeValue = hcWar.getTimePlayed();
        HCtdmTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        HCtdmAssists.setText("Assists: " + hcWar.getAssists());

        HcDom hcDom = mode.getHcDom();
        HCdomKills.setText("Kills: " + hcDom.getKills());
        HCdomDeaths.setText("Deaths: " + hcDom.getDeaths());
        HCdomKD.setText("KD: " + hcDom.getKdRatio());
        HCdomScore.setText("Score: " + hcDom.getScore());
        timeValue = hcDom.getTimePlayed();
        HCdomTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        HCdomCaptures.setText("Captures: " + hcDom.getDefends());

        HcConf hcConf = mode.getHcConf();
        HCconfKills.setText("Kills: " + hcConf.getKills());
        HCconfDeaths.setText("Deaths: " + hcConf.getDeaths());
        HCconfKD.setText("KD: " + hcConf.getKdRatio());
        HCconfScore.setText("Score: " + hcConf.getScore());
        timeValue = hcConf.getTimePlayed();
        HCconfTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        HCconfConfirms.setText("Confirms: " + hcConf.getConfirms());

        HcSd hcSd = mode.getHcSd();
        HCsdKills.setText("Kills: " + hcSd.getKills());
        HCsdDeaths.setText("Deaths: " + hcSd.getDeaths());
        HCsdKD.setText("KD: " + hcSd.getKdRatio());
        HCsdScore.setText("Score: " + hcSd.getScore());
        timeValue = hcSd.getTimePlayed();
        HCsdTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        HCsdDefuses.setText("Defuses: " + hcSd.getDefuses());

        HcHq hcHq = mode.getHcHq();
        HChqKills.setText("Kills: " + hcHq.getKills());
        HChqDeaths.setText("Deaths: " + hcHq.getDeaths());
        HChqKD.setText("KD: " + hcHq.getKdRatio());
        HChqScore.setText("Score: " + hcHq.getScore());
        timeValue = hcHq.getTimePlayed();
        HChqTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        HChqCaptures.setText("Captures: " + hcHq.getCaptures());

        HcCyber hcCyber = mode.getHcCyber();
        HCcyberKills.setText("Kills: " + hcCyber.getKills());
        HCcyberDeaths.setText("Deaths: " + hcCyber.getDeaths());
        HCcyberKD.setText("KD: " + hcCyber.getKdRatio());
        HCcyberScore.setText("Score: " + hcCyber.getScore());
        timeValue = hcCyber.getTimePlayed();
        HCcyberTime.setText("Time: " + (int) (timeValue / 3600) + "hr " + (int) (timeValue / 60 % 60) + "min");
        HCcyberPlants.setText("Plants: " + hcCyber.getPlants());


    }

}

