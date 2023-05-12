package de.mrpresidentwhite.cocapi4j.models.war;

public class WarlogEntry {

    private WarlogClan clan;
    private int teamSize;
    private WarlogClan opponent;
    private String endTime;
    private String result;

    public WarlogEntry(WarlogClan clan, int teamSize, WarlogClan opponent, String endTime, String result) {
        this.clan = clan;
        this.teamSize = teamSize;
        this.opponent = opponent;
        this.endTime = endTime;
        this.result = result;
    }

    public WarlogClan getClan() {
        return clan;
    }

    public void setClan(WarlogClan clan) {
        this.clan = clan;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public WarlogClan getOpponent() {
        return opponent;
    }

    public void setOpponent(WarlogClan opponent) {
        this.opponent = opponent;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
