package Book_2.Chapter_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException3 {

    public static void main(String[] args) throws FileNotFoundException {
            openFile("c:\test.txt");
    }

    public static void openFile(String file) throws FileNotFoundException {
            FileInputStream f = new FileInputStream(file);
    }
}
