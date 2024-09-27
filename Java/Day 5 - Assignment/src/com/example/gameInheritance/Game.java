package com.example.gameInheritance;

public class Game {
    private final String gameName;
    private final int maxPlayers;

    public String getGameName() {
        return gameName;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public Game(String gameName, int maxPlayers) {
        this.gameName = gameName;
        this.maxPlayers = maxPlayers;
    }

    public void displayInfo(){
        System.out.println("Maximum number of players for " + gameName + " is " + maxPlayers);
    }
}
