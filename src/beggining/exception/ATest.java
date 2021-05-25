package beggining.exception;

import beggining.LoggingExpl;
import beggining.Main;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ATest {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggingExpl.class.getName());
        FileHandler fileHandler = null;
        int num1 = 10;
        int num2 = 0;
        try{
            fileHandler = new FileHandler("MyLogFile.log");
            logger.addHandler(fileHandler);
            //SimpleFormatter formatter = new SimpleFormatter();
            //fileHandler.setFormatter(formatter);

            System.out.println(num1/num2);

    }catch (ArithmeticException | IOException e){
            logger.log(Level.SEVERE,
                    "на ноль нельзя, емае",
                    e);
            System.out.println("mistake" );
        }
    logger.log(Level.SEVERE, "севере епт");
    }
}