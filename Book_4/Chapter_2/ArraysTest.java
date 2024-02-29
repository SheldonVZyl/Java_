package Book_4.Chapter_2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();

        int[] startValues = new int[100];
        Arrays.fill(startValues, (int)(Math.random() * 100) + 1);

        for (int i: startValues) {
            System.out.println(i);
        }
    }

}
