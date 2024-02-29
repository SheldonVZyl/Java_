package Book_2.Chapter_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");
        do {
            playARound();
        } while (askForAnotherRound());
        System.out.println("\nThank you for playing!");
    }

    public static void playARound() {
        boolean validInput;
        int number, guess;
        String answer;

        // Pick a random number
        number = getRandomNumber();

        // Get the guess
        System.out.println("\nI'm thinking of a number between 1 and 10");
        System.out.print("What do you think it is? ");
        guess = getGuess();


        // Check the guess
        if (guess == number) {
            System.out.println("Good guess. You are correct.");
        } else {
            System.out.println("Sorry you are wrong! " + number);
        }
    }

    public static int getRandomNumber() {
        return (int)(Math.random() * 10) + 1;
    }

    public static int getGuess() {
        int guess = 0;

        while(true) {

            try {
                //sc.close();
                guess = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("You did not enter a valid integer. Please try again.");
                sc.next();
            } catch (Exception ex) {
                System.out.println("This error occurred: " + ex.getMessage());
                System.exit(0);
            }

            if ( (guess > 0) && (guess<=10) ) {
                return guess;
            } else {
                System.out.println("Please try again!");
            }

        }
    }

    public static boolean askForAnotherRound() {
        while(true) {
            String answer;
            System.out.println("\nPlay again? (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }

}























