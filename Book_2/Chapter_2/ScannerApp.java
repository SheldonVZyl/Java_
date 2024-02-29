package Book_2.Chapter_2;

import java.util.Scanner;
public class ScannerApp
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter an integer: ");

        if (sc.hasNextInt())
        {
            int x = sc.nextInt();
            System.out.println("You entered an integer: " + x + ".");
        }
        else
        {
            System.out.println("Incorrect. You did not enter an integer. Please run the program again.");
        }

    }
}