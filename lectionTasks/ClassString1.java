package kz.epam.gabdollin.practice.lectionTasks;

public class ClassString1 {
    public static void main(String[] args) {
        char ch = '现';
        String str = new String("现");

        int b = str.getBytes().length;
        System.out.println("String.size = " + str.getBytes().length);

        System.out.println(ch);
        System.out.println(str);
    }
}
