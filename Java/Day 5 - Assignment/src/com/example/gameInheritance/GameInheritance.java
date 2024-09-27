package com.example.gameInheritance;
import java.util.*;
public class GameInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of games : ");
        int gameNumbers = sc.nextInt();

        Game[] games = new Game[gameNumbers];

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the game name: ");
            String name = sc.nextLine();

            System.out.print("Enter the maximum number of players: ");
            int maxPlayers = sc.nextInt();

            System.out.print("Enter the time limit in minutes: ");
            int time = sc.nextInt();
            sc.nextLine();

            games[i] = new GameWithTimeLimit(name, maxPlayers, time);
        }

        for (Game game : games) {
            game.displayInfo();
        }

    }
}
