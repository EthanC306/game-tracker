package com.example.gametracker;


//Fields
public class Game {
    private String title;
    private int hoursPlayed;
    private boolean completed;



    //Constructor
    public Game(String title, int hoursPlayed, boolean completed) {
        this.title = title;
        this.hoursPlayed = hoursPlayed;
        this.completed = completed;
    }

    //Getters
    public String getTitle() {
        return title;
    }
    public int getHoursPlayed() {
        return hoursPlayed;
    }
    public boolean getCompleted() { return completed; }

}


