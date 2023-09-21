package CalendarClassInJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

    public static void main(String Args[]){

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf= new SimpleDateFormat("dd/M/yyyy");

        //System.out.println(sdf.getCalendar());
        System.out.println(sdf.format(cal.getTime()));
        System.out.println(sdf.format(Calendar.WEEK_OF_MONTH));
        System.out.println(sdf.format(Calendar.HOUR_OF_DAY));
        System.out.println(sdf.format(Calendar.DAY_OF_MONTH));


    }
}
