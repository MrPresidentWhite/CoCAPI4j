package de.mrpresidentwhite.cocapi4j.models.common;

public class Label {

    private String name;
    private int id;
    private IconUrls iconUrls;

    public Label(String name, int id, IconUrls iconUrls) {
        this.name = name;
        this.id = id;
        this.iconUrls = iconUrls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IconUrls getIconUrls() {
        return iconUrls;
    }

    public void setIconUrls(IconUrls iconUrls) {
        this.iconUrls = iconUrls;
    }
}
