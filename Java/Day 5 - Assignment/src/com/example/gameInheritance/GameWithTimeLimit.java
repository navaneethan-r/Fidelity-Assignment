package com.example.gameInheritance;

public class GameWithTimeLimit extends Game{

    private final int gameMinutes;

    public GameWithTimeLimit(String gameName, int maxPlayers, int gameMinutes) {
        super(gameName, maxPlayers);
        this.gameMinutes = gameMinutes;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Time Limit for " + getGameName() + " is " + gameMinutes);
    }
}
