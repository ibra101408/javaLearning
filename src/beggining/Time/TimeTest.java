package beggining.Time;

import java.time.*;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {
       // Date date1 = new Date((int year, int mounth )
        //convertDateToTime();
    }
    public static LocalTime convertDateToTime(Date date) {
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        return zonedDateTime.toLocalTime();
    }
        }


