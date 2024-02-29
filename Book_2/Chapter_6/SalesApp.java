package Book_2.Chapter_6;


import java.text.NumberFormat;
import java.util.Scanner;

public class SalesApp {

    static Scanner sc = new Scanner(System.in);
    static NumberFormat cf = NumberFormat.getPercentInstance();

    public static void main(String[] args) {
        System.out.println("Please enter your sales class.");
        String s = sc.nextLine();
        char salesClass = s.toLowerCase().charAt(0);

        double commissionRate;

        switch (salesClass)
        {
            case 'a':
                commissionRate = 0.02;
                break;
            case 'b':
                commissionRate = 0.035;
                break;
            case 'c':
                commissionRate = 0.05;
                break;
            default:
                commissionRate = 0.0;
                break;
        }
        System.out.println("Your commission rate is: " + cf.format(commissionRate));
    }

}
