package de.mrpresidentwhite.cocapi4j.models.war;

import de.mrpresidentwhite.cocapi4j.models.common.BadgeUrls;

import java.util.List;

public class WarClan {

    private Float destructionPercentage;
    private String tag;
    private String name;
    private BadgeUrls badgeUrls;
    private int clanLevel;
    private int attacks;
    private int stars;
    private int expEarned;
    private List<WarMember> members;

    public WarClan(Float destructionPercentage, String tag, String name, BadgeUrls badgeUrls, int clanLevel, int attacks, int stars, int expEarned, List<WarMember> members) {
        this.destructionPercentage = destructionPercentage;
        this.tag = tag;
        this.name = name;
        this.badgeUrls = badgeUrls;
        this.clanLevel = clanLevel;
        this.attacks = attacks;
        this.stars = stars;
        this.expEarned = expEarned;
        this.members = members;
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

    public List<WarMember> getMembers() {
        return members;
    }

    public void setMembers(List<WarMember> members) {
        this.members = members;
    }
}
