package kz.epam.gabdollin.practice.lectionTasks;

import java.util.Formatter;

public class ClassFormatter2 {
    public static void main(String[] args){
        Formatter formatter = new Formatter();

        double d1 = 16.78967;
        formatter.format("%1$e, %<f, %<g, %<a\n", d1);
        System.out.println(formatter);
    }
}
