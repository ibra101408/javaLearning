package beggining;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AddText {
    public static void main(String[] args) throws IOException {
        String str = "HouHouHou";
        String str2 = " hihihih";
        FileOutputStream file = new FileOutputStream("/Users/Laptop/Desktop/newfile.txt");
        byte[] buffer = str.getBytes();
        file.write(buffer);
        byte[] buffer2 = str2.getBytes();
        file.write(buffer2);
    }
}