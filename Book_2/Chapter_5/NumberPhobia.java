package Book_2.Chapter_5;

import java.util.Scanner;

public class NumberPhobia {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = 1;
        String input;
        
        while (true) {
            System.out.println("Number is: " + number);
            System.out.println("Would you like to keep counting? Yes or No");

            input = sc.next();

            if (input.equalsIgnoreCase("No")) {
                break;
            }

            number += 1;
        }

        System.out.println("Thank you for counting along. Goodbye!");
    }
}
