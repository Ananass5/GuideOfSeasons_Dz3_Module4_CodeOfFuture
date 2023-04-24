package com.ananas.realappwithseveralactivityes_codeoffuture_module4_4;

public class Season {

    private String name;
    private String seasonDescription;
    private int seasonRes;

    public Season(String name, String seasonDescription, int seasonRes) {
        this.name = name;
        this.seasonDescription = seasonDescription;
        this.seasonRes = seasonRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeasonDescription() {
        return seasonDescription;
    }

    public void setSeasonDescription(String seasonDescription) {
        this.seasonDescription = seasonDescription;
    }

    public int getSeasonRes() {
        return seasonRes;
    }

    public void setSeasonRes(int seasonRes) {
        this.seasonRes = seasonRes;
    }
}
