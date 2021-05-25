package beggining;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BiteScore {
    public static void main(String[] args) {
        File f = new File("/Users/Laptop/Desktop/newfile.txt");//должен существовать!
        int b, count = 0;
        try {
            FileReader is = new FileReader(f);
            while ((b = is.read()) != -1) { //чтение
                System.out.print((char)b);
                count++;
            Pattern p = Pattern.compile("(?<=^| )\\d+\\.\\d+(?=$| )");
          //  Matcher m = p.matcher();
            }
            is.close(); // закрытие потока ввода
        } catch (IOException e) {
            System.err.println("ошибка файла: " + e);
        }
        System.out.print("\n число байт = " + count);
    }
}