package kz.epam.gabdollin.practice.lectionTasks;

public class ClassString6 {
    public static void main(String[] args) {
        String str = "Her name is Tamara.Tamana is a good girl.";
        String strreplace = "Sonia";
        String result = str.replaceFirst("Tamana", strreplace);
        System.out.println(result);

        String str1 = "Hello";
        String str2 = new String("Hello");
        if(str1 == str2) System.out.println("Equal");
        else System.out.println("Not Equal");

        str2 = str2.intern();
        if (str1 == str2) System.out.println("Equal");
        else System.out.println("Not Equal");

        if (str1.equals(str2)) System.out.println("Equals");
        else System.out.println("Not Equal");
    }

}
