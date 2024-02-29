package Book_2.Chapter_3;

import java.util.Scanner;

public class SpaApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The Spa application!\n\n");
        System.out.println("Enter the package code: ");
        String s = sc.next();
        char p = s.toUpperCase().charAt(0);

        String details = "";

        switch (p) {
            case 'E':
                details += "\tAromatheraphy Massage, plus ... \n";
            case 'D':
                details += "\tFacial Treatment, plus ... \n";
            case 'C':
                details += "\tManicure Pedicure, plus ... \n";
            case 'B':
                details += "\tHot Stone Therapy, plus ... \n";
            case 'A':
                details += "\tSauna and Relaxation Session. \n";
                break;
            default:
                details = "Incorrect package selection.";
                break;
        }

        System.out.println("\n The package includes:\n");
        System.out.println(details);

    }

}
