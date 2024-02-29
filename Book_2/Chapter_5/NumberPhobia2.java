package Book_2.Chapter_5;

import java.util.Scanner;

public class NumberPhobia2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = 1;
        String input = "yes";
        
        while (input.equalsIgnoreCase("Yes")) {
            System.out.println("Number is: " + number);
            System.out.println("Would you like to keep counting? Answer Yes");
            input = sc.next();

            number += 1;
        }

        System.out.println("Thank you for counting along. Goodbye!");
    }
}
