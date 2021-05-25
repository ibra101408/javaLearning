package beggining;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        File file = new File("temp");
        if (file.exists()){
            //file.mkdir();
            System.out.println("exist");
        }
        System.out.println("Путь: " + file.getAbsolutePath());


        //Scanner scan = new Scanner(file);


        /*
        String fileContent = "";
        while(scan.hasNextLine()){
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }
        FileWriter writer = new FileWriter("/Users/Laptop/Desktop/newfile.txt");
        writer.write(fileContent);
        writer.close();
    }*/
    }
}

