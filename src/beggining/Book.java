package beggining;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Book {

    public static void main (String[] args){
        //doubleFromString(5, val -> Double.valueOf(val));
        System.out.println(doubleFromString(5, val -> Double.valueOf(val)));

    }
    public static double doubleFromString(int value, Vorker vorker) {
        return vorker.rework(value);
    }
}
