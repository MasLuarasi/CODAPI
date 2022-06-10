package com.example.codapi;

public class Weapon
{
/*
    public int kills;
    public int deaths;
    public int kdRatio;
    public int hits;
    public int shots;
    public int accuracy;
    public int headshots;

    public Weapon(int kills, int deaths, int kdRatio, int hits, int shots, int accuracy, int headshots)
    {
        this.kills = kills;
        this.deaths = deaths;
        this.kdRatio = kdRatio;
        this.hits = hits;
        this.shots = shots;
        this.accuracy = accuracy;
        this.headshots = headshots;
    }
 */

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

    public int getKills()
    {
        return this.kills;
    }

    public int getDeaths()
    {
        return this.deaths;
    }

    public double getKdRatio()
    {
        return this.kdRatio;
    }

    public int getHits()
    {
        return this.hits;
    }

    public int getShots()
    {
        return this.shots;
    }

    public double getAccuracy()
    {
        return this.accuracy;
    }

    public int getHeadshots()
    {
        return this.headshots;
    }

    public String toString()
    {
        return kills + "\t" + deaths + "\t" + kdRatio + "\t" + hits + "\t" + shots + "\t" + accuracy + "\t" + headshots + "\n";
    }

}
/*

class assaultRifle extends Weapon
{
    private String wClass = "Assault Rifles";
    private String wName;

    public assaultRifle(String name, int kills, int deaths, int kdRatio, int hits, int shots, int accuracy, int headshots)
    {
        super(kills, deaths, kdRatio, hits, shots, accuracy, headshots);
        this.wName = name;
    }
}

class smg extends Weapon
{
    private String wClass = "SMGs";
    private String wName;

    public smg(String name, int kills, int deaths, int kdRatio, int hits, int shots, int accuracy, int headshots)
    {
        super(kills, deaths, kdRatio, hits, shots, accuracy, headshots);
        this.wName = name;
    }
}

class lmg extends Weapon
{
    private String wClass = "LMGs";
    private String wName;

    public lmg(String name, int kills, int deaths, int kdRatio, int hits, int shots, int accuracy, int headshots)
    {
        super(kills, deaths, kdRatio, hits, shots, accuracy, headshots);
        this.wName = name;
    }
}

class shotgun extends Weapon
{
    private String wClass = "Shotguns";
    private String wName;

    public shotgun(String name, int kills, int deaths, int kdRatio, int hits, int shots, int accuracy, int headshots)
    {
        super(kills, deaths, kdRatio, hits, shots, accuracy, headshots);
        this.wName = name;
    }
}

class marksman extends Weapon
{
    private String wClass = "Marksman Rifles";
    private String wName;

    public marksman(String name, int kills, int deaths, int kdRatio, int hits, int shots, int accuracy, int headshots)
    {
        super(kills, deaths, kdRatio, hits, shots, accuracy, headshots);
        this.wName = name;
    }
}

class sniper extends Weapon
{
    private String wClass = "Sniper Rifles";
    private String wName;

    public sniper(String name, int kills, int deaths, int kdRatio, int hits, int shots, int accuracy, int headshots)
    {
        super(kills, deaths, kdRatio, hits, shots, accuracy, headshots);
        this.wName = name;
    }
}

class pistol extends Weapon
{
    private String wClass = "Pistols";
    private String wName;

    public pistol(String name, int kills, int deaths, int kdRatio, int hits, int shots, int accuracy, int headshots)
    {
        super(kills, deaths, kdRatio, hits, shots, accuracy, headshots);
        this.wName = name;
    }
}

class launcher extends Weapon
{
    private String wClass = "Launchers";
    private String wName;

    public launcher(String name, int kills, int deaths, int kdRatio, int hits, int shots, int accuracy, int headshots)
    {
        super(kills, deaths, kdRatio, hits, shots, accuracy, headshots);
        this.wName = name;
    }
}

class melee extends Weapon
{
    private String wClass = "Melee";
    private String wName;

    public melee(String name, int kills, int deaths, int kdRatio, int hits, int shots, int accuracy, int headshots)
    {
        super(kills, deaths, kdRatio, hits, shots, accuracy, headshots);
        this.wName = name;
    }
}
 */