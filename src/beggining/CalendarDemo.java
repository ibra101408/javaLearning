package beggining;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class CalendarDemo {
    public static void main(String[] args){
        Calendar calendar1 = new GregorianCalendar();
      //  Date date = new Date();
        int year = calendar1.get(Calendar.YEAR);
        int month = calendar1.get(Calendar.MONTH);
        int dayOfMonth = calendar1.get(Calendar.DAY_OF_MONTH);

        int hour = calendar1.get(Calendar.HOUR);       //12 hour clock
        int minute = calendar1.get(Calendar.MINUTE);

        System.out.println(hour +":"+minute+ " "+ dayOfMonth + "." + month + "." + year);

    }
}