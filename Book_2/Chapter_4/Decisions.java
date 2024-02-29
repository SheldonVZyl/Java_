package Book_2.Chapter_4;

import java.util.Scanner;

public class Decisions
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        System.out.println("Please enter the amount of apple(s) you have:");
        x = sc.nextInt();

        String msg = "You have " + x + " apple" + ((x>1) ? "s." : ".");
        System.out.println(msg);


        String answer = "Yes";
        if (answer == "Yes") {
            System.out.println("The answer is yes.");
        }

        // Can also use equalsIgnoreCase
        if (answer.equals("Yes")) {
            System.out.println("The answer is yes. Done properly.");
        }

    }
}
