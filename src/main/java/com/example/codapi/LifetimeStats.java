package com.example.codapi;

public class LifetimeStats
{
    private double kills;
    private double deaths;
    private double kdRatio;
    private double accuracy;
    private double gamesPlayed;
    private double wlRatio;

    private double longestWinStreak;
    private double currentWinStreak;
    private double longestKillStreak;

    private double mostKills;
    private double bestKD;

    private double timePlayed;

    public LifetimeStats()
    {}

    public void setKills(double kills) {
        this.kills = kills;
    }

    public void setDeaths(double deaths) {
        this.deaths = deaths;
    }

    public void setKdRatio(double kdRatio) {
        this.kdRatio = kdRatio;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public void setGamesPlayed(double gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public void setWlRatio(double wlRatio) {
        this.wlRatio = wlRatio;
    }

    public void setLongestWinStreak(double longestWinStreak) {
        this.longestWinStreak = longestWinStreak;
    }

    public void setCurrentWinStreak(double currentWinStreak) {
        this.currentWinStreak = currentWinStreak;
    }

    public void setLongestKillStreak(double longestKillStreak) {
        this.longestKillStreak = longestKillStreak;
    }

    public void setMostKills(double mostKills) {
        this.mostKills = mostKills;
    }

    public void setBestKD(double bestKD) {
        this.bestKD = bestKD;
    }

    public void setTimePlayed(double timePlayed) {
        this.timePlayed = timePlayed;
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