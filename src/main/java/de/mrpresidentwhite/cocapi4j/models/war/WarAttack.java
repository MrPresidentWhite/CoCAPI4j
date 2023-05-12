package de.mrpresidentwhite.cocapi4j.models.war;

public class WarAttack {

    private int order;
    private String attackerTag;
    private String defenderTag;
    private int stars;
    private Float destructionPercentage;
    private int duration;

    public WarAttack(int order, String attackerTag, String defenderTag, int stars, Float destructionPercentage, int duration) {
        this.order = order;
        this.attackerTag = attackerTag;
        this.defenderTag = defenderTag;
        this.stars = stars;
        this.destructionPercentage = destructionPercentage;
        this.duration = duration;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getAttackerTag() {
        return attackerTag;
    }

    public void setAttackerTag(String attackerTag) {
        this.attackerTag = attackerTag;
    }

    public String getDefenderTag() {
        return defenderTag;
    }

    public void setDefenderTag(String defenderTag) {
        this.defenderTag = defenderTag;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Float getDestructionPercentage() {
        return destructionPercentage;
    }

    public void setDestructionPercentage(Float destructionPercentage) {
        this.destructionPercentage = destructionPercentage;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
