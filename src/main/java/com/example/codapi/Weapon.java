package com.example.codapi;

public class Weapon
{
    protected int kills;
    protected int deaths;
    protected int kdRatio;
    protected int hits;
    protected int shots;
    protected int accuracy;
    protected int headshots;

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

    public int getKills()
    {
        return this.kills;
    }

    public int getDeaths()
    {
        return this.deaths;
    }

    public int getKdRatio()
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

    public int getAccuracy()
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