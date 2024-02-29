package Book_2.Chapter_3;

import java.text.NumberFormat;

public class NumberFormatting
{
    public static void main(String[] args) {
        // Currency
        double salesTax = 2.425;
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        System.out.println(cf.format(salesTax));

        // Rounding
        double x = 19923.328812;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(3);
        nf.setMaximumFractionDigits(3);
        // Get number with exactly 3 decimal places
        System.out.println("Number with 3 decimal places: " + nf.format(x));

        // Percentage
        double grade = 0.92;
        NumberFormat pf = NumberFormat.getPercentInstance();
        System.out.println(pf.format(grade));

        //Floats can't accurately represent 1/10 because it's stored in binary (base 2)
        float x1 = 0.1f;
        nf.setMinimumFractionDigits(10);
        System.out.println(nf.format(x1));
    }
}
