package kz.epam.gabdollin.practice.lectionTasks;

public class ClassString2 {
    public static void main(String[] args) {
        String str = "现已整合";
        System.out.println("Строка - " + str);
        System.out.println("Длина строки - " + str.length());
        System.out.println("Длина строки в байтах - " + str.getBytes().length);
        for (int i = 0; i < str.codePointCount(0, str.length()); i++) {
            int index = str.offsetByCodePoints(0, i);
            int code = str.codePointAt(index);
            int[] mas = {code};
            System.out.println(i + "-й символ: " + Integer.toHexString(code) + " " + new String(mas, 0, mas.length));
        }
    }
}
