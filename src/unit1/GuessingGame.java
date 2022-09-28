package unit1;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    Scanner input;
    private boolean correctGuess;
    private int guess;
    private int increment;

    private String name;

    public GuessingGame() {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello user. What is your name?");
        String name = input.nextLine();

        System.out.println("Welcome " + name + "!  I'm thinking of a number between 1 and 100");

        Random rand = new Random();

        int number = rand.nextInt(100);

        System.out.println("Try to guess my number.");

        this.name = name;
        this.correctGuess = false;
        this.guess = 0;
        this.increment = 0;
        this.input = new Scanner(System.in);

        while (!this.correctGuess) {
            this.increment ++;

            try {
                this.guess = input.nextInt();
            } catch (Exception e) {
                String badInput = input.next();
                System.out.println(badInput + " is not an integer.");
                continue;
            }

            if (this.guess < 1 || this.guess > 100) {
                System.out.println("Your guess is out of bounds, try again.");
            } else if (this.guess > number) {
                System.out.println("Your guess is too high.");
            } else if (this.guess < number) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Well done " + name + "! You found the number in " + this.increment + " tries!");
                this.correctGuess = true;
            }
        }

        input.close();
    }

}
