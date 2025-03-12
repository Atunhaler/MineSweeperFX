package com.example.demo.model;

public class Leaderboard {
    public String name;
    public int score;

    public Leaderboard() {
        this.name = "";
        this.score = 0;
    }

    public Leaderboard(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        score = score;
    }

}
