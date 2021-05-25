package beggining;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.Math;

public class DateDemo {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss"); // В этом формате будем вводить дату
        Date one = sdf.parse("27.07.2020 10:20:00"); // вводим дату используя метод parse форматера
        Date two = sdf.parse("26.07.2020 20:34:10");
        System.out.println(one);
        System.out.println(two);
        long milliseconds = Math.abs(one.getTime() - two.getTime()); //получаем разницу
        long sec = milliseconds / 1000;

        long hours = sec / 3600;
        long minutes = (sec % 3600) / 60;
        long seconds = sec % 60;

        String timeString = String.format("разница составляет - " + "%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println(timeString);
    }
}


