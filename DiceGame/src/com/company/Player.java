package com.company;

public class Player {

    private String name;
    private int score;

    public Player(String name){
        this.name = name;
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
