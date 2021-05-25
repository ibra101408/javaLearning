package beggining;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class WordScore {
    public static void main(String[] args) throws IOException {
        final Logger logger = Logger.getLogger(Main.class.getName());


        int count = 0;
        File file = new File("/Users/Laptop/Desktop/newfile.txt");
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] bytesArray = new byte[(int) file.length()];
            fis.read(bytesArray);
            String s = new String(bytesArray);
            String[] data = s.split(" "); //считает слово через пробел
            for (int i = 0; i < data.length; i++) {
                count++;
            }
            System.out.println("Number of words in the given file are " + count);
        }
        }

    }
