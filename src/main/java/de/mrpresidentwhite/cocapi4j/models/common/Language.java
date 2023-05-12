package de.mrpresidentwhite.cocapi4j.models.common;

public class Language {

    private String name;
    private int id;
    private String languageCode;

    public Language(String name, int id, String languageCode) {
        this.name = name;
        this.id = id;
        this.languageCode = languageCode;
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

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }
}
