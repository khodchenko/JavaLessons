package l48_Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) throws Exception{
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.add(calendar.WEEK_OF_MONTH,1);
        System.out.println(calendar.getTime());

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        Date newDate = simpleDateFormat.parse("05/12/1985");
        System.out.println(simpleDateFormat.format(newDate));
    }
}
