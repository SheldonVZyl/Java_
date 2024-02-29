package Book_3.Chapter_2;

import java.util.Scanner;

public class Initializer {

    private Scanner sc = new Scanner(System.in);

    // Initializer
    public int x;

    {
        System.out.println("In static initializer.");
        System.out.print(
                "Enter the starting value for x: ");
        x = sc.nextInt();
        System.out.println("You entered " + x);
    }

    // Constructor
    public Initializer() {
        System.out.println("In constructor now.");
    }

}
