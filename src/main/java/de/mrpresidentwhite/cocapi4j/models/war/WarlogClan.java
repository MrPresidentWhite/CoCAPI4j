package de.mrpresidentwhite.cocapi4j.models.war;

import de.mrpresidentwhite.cocapi4j.models.common.BadgeUrls;

public class WarlogClan {

    private Float destructionPercentage;
    private String tag;
    private String name;
    private BadgeUrls badgeUrls;
    private int clanLevel;
    private int attacks;
    private int stars;
    private int expEarned;

    public WarlogClan(Float destructionPercentage, String tag, String name, BadgeUrls badgeUrls, int clanLevel, int attacks, int stars, int expEarned) {
        this.destructionPercentage = destructionPercentage;
        this.tag = tag;
        this.name = name;
        this.badgeUrls = badgeUrls;
        this.clanLevel = clanLevel;
        this.attacks = attacks;
        this.stars = stars;
        this.expEarned = expEarned;
    }

    public Float getDestructionPercentage() {
        return destructionPercentage;
    }

    public void setDestructionPercentage(Float destructionPercentage) {
        this.destructionPercentage = destructionPercentage;
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

    public BadgeUrls getBadgeUrls() {
        return badgeUrls;
    }

    public void setBadgeUrls(BadgeUrls badgeUrls) {
        this.badgeUrls = badgeUrls;
    }

    public int getClanLevel() {
        return clanLevel;
    }

    public void setClanLevel(int clanLevel) {
        this.clanLevel = clanLevel;
    }

    public int getAttacks() {
        return attacks;
    }

    public void setAttacks(int attacks) {
        this.attacks = attacks;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getExpEarned() {
        return expEarned;
    }

    public void setExpEarned(int expEarned) {
        this.expEarned = expEarned;
    }
}
