package nl.it.guess.game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    private float score;
    private float perc;

    public Game() {

        for (int i = 0; i < 10; i++) {
            int r = random.nextInt(9) + 1;
            System.out.println("Enter a number between 1 - 10: ");
            int n = sc.nextInt();

            if (n < 1 || n > 10) {
               System.out.println("Incorrect entry, try again.");

            } else {

                System.out.println("The random generated number: " + r);
                if (n == r) {
                    System.out.println("You guessed correct!!");
                    score++;
                } else {
                    System.out.println("You guessed wrong.");
                }
            }
        }

        perc=(score/10)*100;
        System.out.println("Your total percentage of correct guesses is: "+perc+"%.");
    }

}
