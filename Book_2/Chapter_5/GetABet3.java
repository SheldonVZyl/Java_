package Book_2.Chapter_5;

import java.util.Scanner;

public class GetABet3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bank = 1000;
        double bet = 0;
        boolean validBet;

        System.out.println("You can bet between 1 and " + bank);

        do
        {
            validBet = true;
            System.out.println("Enter your bet: ");
            bet = sc.nextDouble();

            if ((bet <= 0) ||  (bet > bank)) {
                System.out.println("Invalid bet!");
                validBet = false;
            }

        } while ( !validBet );

        System.out.println("Thank you for betting.");

    }
}
