package de.mrpresidentwhite.cocapi4j.models.common;

public class BadgeUrls {

    private String small;
    private String medium;
    private String large;

    public BadgeUrls() {
        this.small = null;
        this.medium = null;
        this.large = null;
    }

    // Getter and Setter methods

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }
}