package de.mrpresidentwhite.cocapi4j.models.war;

import java.util.List;

public class Warlog {

    private List<WarlogEntry> items;

    public Warlog(List<WarlogEntry> items) {
        this.items = items;
    }

    public List<WarlogEntry> getItems() {
        return items;
    }

    public void setItems(List<WarlogEntry> items) {
        this.items = items;
    }
}
