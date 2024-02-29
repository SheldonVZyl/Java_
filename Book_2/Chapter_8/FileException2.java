package Book_2.Chapter_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException2 {

    public static void main(String[] args) {
        try {
            openFile("c:\test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Printing from main class. Error occurred in openFile method");
        }
    }

    public static void openFile(String file) throws FileNotFoundException {
        // 2nd Way to handle Exceptions:

            FileInputStream f = new FileInputStream(file);
    }
}
