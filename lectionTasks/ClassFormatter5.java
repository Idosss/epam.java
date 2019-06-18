package kz.epam.gabdollin.practice.lectionTasks;

        import java.util.Calendar;
        import java.util.Formatter;
        import java.util.Locale;

public class ClassFormatter5 {
    public static void main(String[] args){
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

        formatter.format("%tr", calendar);
        System.out.println(formatter);

    }
}
