package de.mrpresidentwhite.cocapi4j.models.war;

public class War {

    private WarClan clan;
    private int teamSize;
    private int attacksPerMember;
    private WarClan opponent;
    private String startTime;
    private String state;
    private String endTime;
    private String preparationStartTime;

    public War(WarClan clan, int teamSize, int attacksPerMember, WarClan opponent, String startTime, String state, String endTime, String preparationStartTime) {
        this.clan = clan;
        this.teamSize = teamSize;
        this.attacksPerMember = attacksPerMember;
        this.opponent = opponent;
        this.startTime = startTime;
        this.state = state;
        this.endTime = endTime;
        this.preparationStartTime = preparationStartTime;
    }

    public WarClan getClan() {
        return clan;
    }

    public void setClan(WarClan clan) {
        this.clan = clan;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getAttacksPerMember() {
        return attacksPerMember;
    }

    public void setAttacksPerMember(int attacksPerMember) {
        this.attacksPerMember = attacksPerMember;
    }

    public WarClan getOpponent() {
        return opponent;
    }

    public void setOpponent(WarClan opponent) {
        this.opponent = opponent;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPreparationStartTime() {
        return preparationStartTime;
    }

    public void setPreparationStartTime(String preparationStartTime) {
        this.preparationStartTime = preparationStartTime;
    }
}
