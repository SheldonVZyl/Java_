package Book_2.Chapter_3;

import java.text.NumberFormat;

public class NumberFormatClassApp
{
    static NumberFormat cf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        printMyAllowance();
        printCostOfPaintBallGun();
    }

    public static void printMyAllowance() {
        double myAllowance = 5.99;
        System.out.println("My allowance: " + cf.format(myAllowance));
    }

    public static void printCostOfPaintBallGun() {
        double costOfPaintBallGun = 69.95;
        System.out.println("Cost of Paint Ball Gun: " + cf.format(costOfPaintBallGun));
    }
}
