package de.mrpresidentwhite.cocapi4j.models.war;

import java.util.List;

public class WarMember {

    private String tag;
    private String name;
    private int mapPosition;
    private int townhallLevel;
    private int opponentAttack;
    private WarAttack bestOpponentAttack;
    private List<WarAttack> attacks;

    public WarMember(String tag, String name, int mapPosition, int townhallLevel, int opponentAttack, WarAttack bestOpponentAttack, List<WarAttack> attacks) {
        this.tag = tag;
        this.name = name;
        this.mapPosition = mapPosition;
        this.townhallLevel = townhallLevel;
        this.opponentAttack = opponentAttack;
        this.bestOpponentAttack = bestOpponentAttack;
        this.attacks = attacks;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMapPosition() {
        return mapPosition;
    }

    public void setMapPosition(int mapPosition) {
        this.mapPosition = mapPosition;
    }

    public int getTownhallLevel() {
        return townhallLevel;
    }

    public void setTownhallLevel(int townhallLevel) {
        this.townhallLevel = townhallLevel;
    }

    public int getOpponentAttack() {
        return opponentAttack;
    }

    public void setOpponentAttack(int opponentAttack) {
        this.opponentAttack = opponentAttack;
    }

    public WarAttack getBestOpponentAttack() {
        return bestOpponentAttack;
    }

    public void setBestOpponentAttack(WarAttack bestOpponentAttack) {
        this.bestOpponentAttack = bestOpponentAttack;
    }

    public List<WarAttack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<WarAttack> attacks) {
        this.attacks = attacks;
    }
}
