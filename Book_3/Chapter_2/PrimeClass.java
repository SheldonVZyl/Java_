package Book_3.Chapter_2;

import java.util.Scanner;

public class PrimeClass {

    private Scanner sc = new Scanner(System.in);
    public int x = getX();

    private int getX() {
        System.out.println("Enter the starting value for X: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        PrimeClass pc = new PrimeClass();
    }
}
