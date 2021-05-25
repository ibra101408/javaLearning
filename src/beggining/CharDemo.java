package beggining;
// ВЕРНУТЬСЯ К ЭТОМУ (МОДУЛЬ 8.3)

import java.io.*;
import java.io.IOException;

    class CharFile {
        public static void main(String[] args) throws Exception{

            File inFile = new File("/Users/Laptop/Desktop/infile.dat"); //получаем информацию о файле
            File outFile = new File("/Users/Laptop/Desktop/outfile.dat"); //получаем информацию о файле
            FileInputStream inStream = new FileInputStream(inFile); //Создаем экземпляр класса FileInputStream
            FileOutputStream outStream = new FileOutputStream(outFile); //Создаем экземпляр класса FileOutputStream

            int c;
            while ((c = inStream.read()) != -1) {
                outStream.write(c);
            }
            inStream.close(); // закрываем поток
            outStream.close(); // закрываем поток

        }
    }

