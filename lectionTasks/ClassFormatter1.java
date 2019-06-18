package kz.epam.gabdollin.practice.lectionTasks;

import java.text.Normalizer;
import java.util.Formatter;
import java.util.Timer;

public class ClassFormatter1 {
    public static void main(String[] args){
        Formatter formatter = new Formatter();
        boolean b1 = true;
        Boolean b2 = null;
        formatter.format("1. - %b, %b\n", b1, b2);
        System.out.println(formatter);
        System.out.println("-------------------------------");
        Timer t = new Timer();
        formatter.format("2. - %h", t);
        System.out.println(formatter);
        System.out.println(Integer.toHexString(t.hashCode()));
    }
}
