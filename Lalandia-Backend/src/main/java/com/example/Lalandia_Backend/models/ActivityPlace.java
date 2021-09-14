package com.example.Lalandia_Backend.models;

public class ActivityPlace {

    String placeName;
    int actualGuest;
    int MaxGuest;

    //Getters
    public String getPlaceName() {
        return placeName;
    }

    public int getActualGuest() {
        return actualGuest;
    }

    public int getMaxGuest() {
        return MaxGuest;
    }

    //Setters
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public void setActualGuest(int actualGuest) {
        this.actualGuest = actualGuest;
    }

    public void setMaxGuest(int maxGuest) {
        MaxGuest = maxGuest;
    }


    public ActivityPlace(String placeName, int actualGuest, int maxGuest) {
        this.placeName = placeName;
        this.actualGuest = actualGuest;
        MaxGuest = maxGuest;
    }



}
