package kz.epam.gabdollin.practice.lectionTasks;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class ClassDateFormat {
    public static void main(String[] args){
        Date date = new Date();
        DateFormat dfUSLong = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
        DateFormat dfUSShort = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);

        System.out.println(dfUSLong.format(date));
        System.out.println(dfUSShort.format(date));

    }
}



