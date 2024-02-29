package Book_2.Chapter_3;

import java.util.Scanner;

public class MarbleApp
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Number of marbles: ");
        int marbles = sc.nextInt();
        System.out.println("Number of children: ");
        int children = sc.nextInt();
        int marblesEach = marbles / children;
        int marblesLeft = marbles % children;
        System.out.println("Give each child " + marblesEach + " marbles.");
        System.out.println("There are " + marblesLeft + " left.");
    }
}
