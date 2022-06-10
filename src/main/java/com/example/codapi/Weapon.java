package com.example.codapi;

import java.util.HashMap;

public class Weapon
{

    public int hits;
    public int kills;
    public double kdRatio;
    public int headshots;
    public double accuracy;
    public int shots;
    public int deaths;

    public Weapon(int hits, int kills, double kdRatio, int headshots, double accuracy, int shots, int deaths)
    {
        this.hits = hits;
        this.kills = kills;
        this.kdRatio = kdRatio;
        this.headshots = headshots;
        this.accuracy = accuracy;
        this.shots = shots;
        this.deaths = deaths;
    }

    @Override
    public String toString()
    {
        return kills + "\t" + deaths + "\t" + kdRatio + "\t" + hits + "\t" + shots + "\t" + accuracy + "\t" + headshots + "\n";
    }
}

class assaultRifle extends Weapon
{
    private String wClass = "Assault Rifles";
    private String wName;
    HashMap<String , String> arCodes;

    public assaultRifle(String name, int hits, int kills, double kdRatio, int headshots, double accuracy, int shots, int deaths)
    {
        super(hits, kills, kdRatio, headshots, accuracy, shots, deaths);
        arCodes.put("iw8_ar_tango21", "RAM-7");
        this.wName = arCodes.get(name);
    }
}

class smg extends Weapon
{
    private String wClass = "SMGs";
    private String wName;

    public smg(String name, int hits, int kills, double kdRatio, int headshots, double accuracy, int shots, int deaths)
    {
        super(hits, kills, kdRatio, headshots, accuracy, shots, deaths);
        this.wName = name;
    }
}

class lmg extends Weapon
{
    private String wClass = "LMGs";
    private String wName;

    public lmg(String name, int hits, int kills, double kdRatio, int headshots, double accuracy, int shots, int deaths)
    {
        super(hits, kills, kdRatio, headshots, accuracy, shots, deaths);
        this.wName = name;
    }
}

class shotgun extends Weapon
{
    private String wClass = "Shotguns";
    private String wName;

    public shotgun(String name, int hits, int kills, double kdRatio, int headshots, double accuracy, int shots, int deaths)
    {
        super(hits, kills, kdRatio, headshots, accuracy, shots, deaths);
        this.wName = name;
    }
}

class marksman extends Weapon
{
    private String wClass = "Marksman Rifles";
    private String wName;

    public marksman(String name, int hits, int kills, double kdRatio, int headshots, double accuracy, int shots, int deaths)
    {
        super(hits, kills, kdRatio, headshots, accuracy, shots, deaths);
        this.wName = name;
    }
}

class sniper extends Weapon
{
    private String wClass = "Sniper Rifles";
    private String wName;

    public sniper(String name, int hits, int kills, double kdRatio, int headshots, double accuracy, int shots, int deaths)
    {
        super(hits, kills, kdRatio, headshots, accuracy, shots, deaths);
        this.wName = name;
    }
}

class pistol extends Weapon
{
    private String wClass = "Pistols";
    private String wName;

    public pistol(String name, int hits, int kills, double kdRatio, int headshots, double accuracy, int shots, int deaths)
    {
        super(hits, kills, kdRatio, headshots, accuracy, shots, deaths);
        this.wName = name;
    }
}

class launcher extends Weapon
{
    private String wClass = "Launchers";
    private String wName;

    public launcher(String name, int hits, int kills, double kdRatio, int headshots, double accuracy, int shots, int deaths)
    {
        super(hits, kills, kdRatio, headshots, accuracy, shots, deaths);
        this.wName = name;
    }
}

class melee extends Weapon
{
    private String wClass = "Melee";
    private String wName;

    public melee(String name, int hits, int kills, double kdRatio, int headshots, double accuracy, int shots, int deaths)
    {
        super(hits, kills, kdRatio, headshots, accuracy, shots, deaths);
        this.wName = name;
    }
}