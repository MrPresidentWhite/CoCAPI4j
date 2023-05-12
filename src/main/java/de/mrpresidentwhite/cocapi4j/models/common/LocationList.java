package de.mrpresidentwhite.cocapi4j.models.common;

import java.util.List;

public class LocationList {

    private List<Location> items;

    public LocationList(List<Location> items) {
        this.items = items;
    }

    public List<Location> getItems() {
        return items;
    }

    public void setItems(List<Location> items) {
        this.items = items;
    }
}
