package Book_2.Chapter_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException5 {

    public static void main(String[] args) {
            try {
                openFile("c:\test.txt");
            }
            catch (FileNotFoundException e) {
                System.out.println("File not found exception error");
            }
            catch (Exception e) {
                System.out.println("General Exception error catcher");
            }

    }

    public static void openFile(String file) throws FileNotFoundException {
            FileInputStream f = new FileInputStream(file);
    }
}
