package kz.epam.gabdollin.practice.lectionTasks;

import java.util.Formatter;

public class ClassFormatter4 {
    public static void main(String[] args){
        Formatter formatter = new Formatter();
        int i1 = 345;
        double d1 = 16.78967;
        formatter.format("- %-7dok%n", i1);
        formatter.format("- %+7dok%n", i1);
        formatter.format("- % 7dok%n", i1);
        formatter.format("- %07dok%n", i1);
        formatter.format("- %#fok%n", d1);
        formatter.format("- %-7fok%n", d1);
        System.out.println(formatter);
    }
}
