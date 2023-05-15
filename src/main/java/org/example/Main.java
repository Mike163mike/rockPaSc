package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstPlayerS = scanner.next();
        String secondPlayerS = scanner.next();
        Game game = new Game();
        System.out.println(game.gameSet(firstPlayerS, secondPlayerS));

    }
}