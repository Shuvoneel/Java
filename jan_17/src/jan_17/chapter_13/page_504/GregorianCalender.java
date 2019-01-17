package jan_17.chapter_13.page_504;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianCalender {

    public static void main(String[] args) {
        Calendar calender = new GregorianCalendar();

        System.out.println("Current time is " + new Date());

        System.out.println("Year: " + calender.get(Calendar.YEAR));

        System.out.println("Month: " + calender.get(Calendar.MONTH));

        System.out.println("Date: " + calender.get(Calendar.DATE));

        System.out.println("Hour: " + calender.get(Calendar.HOUR));

        System.out.println("Hour_of_Day: " + calender.get(Calendar.HOUR_OF_DAY));

        System.out.println("Minute: " + calender.get(Calendar.MINUTE));

        System.out.println("Second: " + calender.get(Calendar.SECOND));

        System.out.println("Day_of_Week: " + calender.get(Calendar.DAY_OF_WEEK));

        System.out.println("Day_of_Month: " + calender.get(Calendar.DAY_OF_MONTH));

        System.out.println("Day_of_Year: " + calender.get(Calendar.DAY_OF_YEAR));

        System.out.println("Week_of_Month: " + calender.get(Calendar.WEEK_OF_MONTH));

        System.out.println("Week_of_Year: " + calender.get(Calendar.WEEK_OF_YEAR));

        System.out.println("AM_PM: " + calender.get(Calendar.AM_PM));
        

        Calendar calendar1 = new GregorianCalendar(1988, 11, 29);
        String[] dayNameOfWeek = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };
        System.out.println("November 29, 1988 was " + dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
