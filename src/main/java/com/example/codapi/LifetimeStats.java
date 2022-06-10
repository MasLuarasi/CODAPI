package com.example.codapi;

public class LifetimeStats
{
    private int kills;
    private int deaths;
    private double kdRatio;
    private double accuracy;
    private int gamesPlayed;
    private double wlRatio;

    private int longestWinStreak;
    private int currentWinStreak;
    private int longestKillStreak;

    private int mostKills;
    private double bestKD;

    private double timePlayed;

    public LifetimeStats()
    {}

    public void setKills(double kills) {
        this.kills = (int)kills;
    }

    public void setDeaths(double deaths) {
        this.deaths = (int)deaths;
    }

    public void setKdRatio(double kdRatio) {
        this.kdRatio = kdRatio;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public void setGamesPlayed(double gamesPlayed) {
        this.gamesPlayed = (int)gamesPlayed;
    }

    public void setWlRatio(double wlRatio) {
        this.wlRatio = wlRatio;
    }

    public void setLongestWinStreak(double longestWinStreak) {
        this.longestWinStreak = (int)longestWinStreak;
    }

    public void setCurrentWinStreak(double currentWinStreak) {
        this.currentWinStreak =(int) currentWinStreak;
    }

    public void setLongestKillStreak(double longestKillStreak) {
        this.longestKillStreak = (int)longestKillStreak;
    }

    public void setMostKills(double mostKills) {
        this.mostKills = (int)mostKills;
    }

    public void setBestKD(double bestKD) {
        this.bestKD = bestKD;
    }

    public void setTimePlayed(double timePlayed) {
        this.timePlayed = timePlayed/3600;
    }

    @Override
    public String toString()
    {
        return "Lifetime Stats:" +
                "\nkills = " + kills +
                "\nDeaths = " + deaths +
                "\nKD Ratio = " + kdRatio +
                "\nAccuracy = " + accuracy +
                "\nGamesPlayed = " + gamesPlayed +
                "\nWL Ratio = " + wlRatio +
                "\nLongest Win Streak = " + longestWinStreak +
                "\nCurrent Win Streak = " + currentWinStreak +
                "\nLongest Kill Streak = " + longestKillStreak +
                "\nMost Kills in a game = " + mostKills +
                "\nBest KD in a game = " + bestKD +
                "\nTime Played = " + timePlayed;
    }
}