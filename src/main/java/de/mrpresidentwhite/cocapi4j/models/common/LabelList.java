package de.mrpresidentwhite.cocapi4j.models.common;

import java.util.List;

public class LabelList {

    private List<Label> items;

    public LabelList(List<Label> items) {
        this.items = items;
    }

    public List<Label> getItems() {
        return items;
    }

    public void setItems(List<Label> items) {
        this.items = items;
    }
}
