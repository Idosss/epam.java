package kz.epam.gabdollin.practice.lectionTasks;

public class ClassString5 {
    public static void main(String[] args){
        String s1 = null;
        try {
            s1.concat("abc");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println(s1);
        String s2 = null;
        System.out.println(s2 + "abc");
// конкатинация() возвращает объект новой строки
// только когда длина аргумента строки > 0.
        String s3 = "Blue";
        String s4 = "Sky!";
        String s5 = s3.concat(s4);
        System.out.println(s5 == s3);
        String s6 = "abc";
        String s7 = s6.concat("");
        System.out.println(s6 == s7);


    }
}
