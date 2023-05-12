package de.mrpresidentwhite.cocapi4j.models.common;

public class IconUrls {

    private String tiny;
    private String small;
    private String medium;

    public IconUrls() {
        this.tiny = null;
        this.small = null;
        this.medium = null;
    }

    // Getter and Setter methods

    public String getTiny() {
        return tiny;
    }

    public void setTiny(String tiny) {
        this.tiny = tiny;
    }

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
}